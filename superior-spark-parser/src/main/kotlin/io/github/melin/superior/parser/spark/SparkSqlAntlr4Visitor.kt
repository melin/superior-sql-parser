package io.github.melin.superior.parser.spark

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.AlterActionType
import io.github.melin.superior.common.AlterActionType.*
import io.github.melin.superior.common.SQLParserException
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.TableType
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.alter.*
import io.github.melin.superior.common.relational.common.*
import io.github.melin.superior.common.relational.create.*
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.common.relational.drop.DropDatabase
import io.github.melin.superior.common.relational.drop.DropFunction
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.common.relational.drop.DropView
import io.github.melin.superior.common.relational.io.ExportTable
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.common.relational.table.RepairTable
import io.github.melin.superior.common.relational.table.TruncateTable
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.AlterColumnActionContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.ColDefinitionOptionContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.CreateOrReplaceTableColTypeListContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.CreateTableClausesContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.DtColPropertyContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.DtPropertyContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.DtPropertyListContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.FromClauseContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.IdentifierContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.InsertIntoContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.MultiInsertQueryContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.PartitionSpecContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.PropertyListContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.QueryContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.SingleInsertQueryContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.TableProviderContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParserBaseVisitor
import io.github.melin.superior.parser.spark.relational.*
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils
import java.util.regex.Pattern

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class SparkSqlAntlr4Visitor(val splitSql: Boolean = false, val command: String?):
    SparkSqlParserBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var currentAlterActionType: AlterActionType = UNKOWN
    private var multiInsertToken: String? = null

    private var limit: Int? = null
    private var offset: Int? = null
    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var outputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()
    private var functionNames: HashSet<FunctionId> = hashSetOf()

    private var rows: ArrayList<List<String>> = ArrayList()

    private var insertSql: Boolean = false;

    private var statements: ArrayList<Statement> = arrayListOf()
    private val sqls: ArrayList<String> = arrayListOf()

    fun getSqlStatements(): List<Statement> {
        return statements
    }

    fun getSplitSqls(): List<String> {
        return sqls
    }

    override fun shouldVisitNextChild(node: RuleNode, currentResult: Statement?): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitSqlStatements(ctx: SparkSqlParser.SqlStatementsContext): Statement? {
        ctx.singleStatement().forEach {
            var sql = CommonUtils.subsql(command, it)
            sql = CommonUtils.cleanLastSemi(sql)
            if (splitSql) {
                sqls.add(sql)
            } else {
                val startNode = it.start.text
                val statement = if (StringUtils.equalsIgnoreCase("show", startNode)) {
                    val keyWords: ArrayList<String> = arrayListOf()
                    CommonUtils.findShowStatementKeyWord(keyWords, it)
                    ShowStatement(*keyWords.toTypedArray())
                } else if (StringUtils.equalsIgnoreCase("DESC", startNode) ||
                    StringUtils.equalsIgnoreCase("DESCRIBE", startNode)) {
                    val keyWords: ArrayList<String> = arrayListOf()
                    CommonUtils.findShowStatementKeyWord(keyWords, it)
                    DescStatement(*keyWords.toTypedArray())
                } else {
                    var statement = this.visitSingleStatement(it)
                    if (statement == null) {
                        statement = DefaultStatement(StatementType.UNKOWN)
                    }
                    statement
                }

                statement.setSql(sql)
                statements.add(statement)

                clean()
            }
        }
        return null
    }

    private fun clean() {
        currentOptType = StatementType.UNKOWN
        currentAlterActionType = UNKOWN
        multiInsertToken = null

        limit = null
        offset = null
        inputTables = arrayListOf()
        outputTables = arrayListOf()
        cteTempTables = arrayListOf()
        functionNames = hashSetOf()

        rows = arrayListOf()

        insertSql = false
    }

    override fun visitSingleStatement(ctx: SparkSqlParser.SingleStatementContext): Statement? {
        val statement = super.visitSingleStatement(ctx)

        if (statement == null) {
            throw SQLParserException("不支持的SQL: " + command)
        }
        return statement
    }

    fun parseNamespace(ctx: SparkSqlParser.IdentifierReferenceContext): Pair<String?, String> {
        if (ctx.multipartIdentifier() == null) {
            throw IllegalAccessException("not support: " + CommonUtils.subsql(command, ctx))
        } else {
            return parseNamespace(ctx.multipartIdentifier())
        }
    }

    fun parseNamespace(ctx: SparkSqlParser.MultipartIdentifierContext): Pair<String?, String> {
        return if (ctx.parts.size == 2) {
            Pair(ctx.parts.get(0).text, ctx.parts.get(1).text)
        } else if (ctx.parts.size == 1) {
            Pair(null, ctx.parts.get(0).text)
        } else {
            throw SQLParserException("parse multipart error: " + ctx.parts.size)
        }
    }

    fun parseTableName(ctx: SparkSqlParser.IdentifierReferenceContext): TableId {
        if (ctx.multipartIdentifier() == null) {
            throw IllegalAccessException("not support: " + CommonUtils.subsql(command, ctx))
        } else {
            return parseTableName(ctx.multipartIdentifier())
        }
    }

    fun parseTableName(ctx: SparkSqlParser.MultipartIdentifierContext): TableId {
        return if (ctx.parts.size == 4) {
            TableId(ctx.parts.get(0).text, ctx.parts.get(1).text, ctx.parts.get(2).text, ctx.parts.get(3).text)
        } else if (ctx.parts.size == 3) {
            TableId(ctx.parts.get(0).text, ctx.parts.get(1).text, ctx.parts.get(2).text)
        } else if (ctx.parts.size == 2) {
            TableId(null, ctx.parts.get(0).text, ctx.parts.get(1).text)
        } else if (ctx.parts.size == 1) {
            TableId(null, null, ctx.parts.get(0).text)
        } else {
            throw SQLParserException("parse multipart error: " + ctx.parts.size)
        }
    }

    fun parseIdentifier(ctx: List<IdentifierContext>): String {
        return ctx.map { iden -> iden.text }.joinToString(",")
    }

    //-----------------------------------database-------------------------------------------------

    override fun visitCreateNamespace(ctx: SparkSqlParser.CreateNamespaceContext): Statement {
        var location: String = ""
        if (ctx.locationSpec().size > 0) {
            location = ctx.locationSpec().get(0).stringLit().text
            location = CommonUtils.cleanQuote(location)
        }
        val type = ctx.namespace().text.uppercase()

        if (StringUtils.equalsIgnoreCase("database", type) ||
            StringUtils.equalsIgnoreCase("schema", type)) {

            val (catalogName, databaseName) = parseNamespace(ctx.identifierReference())
            return CreateDatabase(catalogName, databaseName, location)
        } else {
            throw RuntimeException("not support: " + type)
        }
    }

    override fun visitDropNamespace(ctx: SparkSqlParser.DropNamespaceContext): Statement {
        val type = ctx.namespace().text.uppercase()
        if (StringUtils.equalsIgnoreCase("database", type) ||
            StringUtils.equalsIgnoreCase("schema", type)) {

            val (catalogName, databaseName) = parseNamespace(ctx.identifierReference())
            return DropDatabase(catalogName, databaseName)
        } else {
            throw RuntimeException("not support: " + type)
        }
    }

    //-----------------------------------table-------------------------------------------------
    override fun visitCreateTable(ctx: SparkSqlParser.CreateTableContext): Statement {
        val tableId = parseTableName(ctx.createTableHeader().identifierReference())
        return createTable(tableId,
            false,
            ctx.createTableHeader().TEMPORARY() != null,
            ctx.createTableHeader().EXTERNAL() != null,
            ctx.createTableHeader().IF() != null,
            ctx.createOrReplaceTableColTypeList(),
            ctx.createTableClauses(),
            ctx.tableProvider(),
            ctx.query())
    }


    override fun visitReplaceTable(ctx: SparkSqlParser.ReplaceTableContext): Statement {
        val tableId = parseTableName(ctx.replaceTableHeader().identifierReference())
        return createTable(tableId,
            true,
            false,
            false,
            false,
            ctx.createOrReplaceTableColTypeList(),
            ctx.createTableClauses(),
            ctx.tableProvider(),
            ctx.query())
    }

    private fun createTable(
        tableId: TableId,
        replace: Boolean,
        temporary: Boolean,
        external: Boolean,
        ifNotExists: Boolean,
        createOrReplaceTableColTypeList: CreateOrReplaceTableColTypeListContext?,
        createTableClauses: CreateTableClausesContext,
        tableProvider: TableProviderContext?,
        query: QueryContext?): Statement {

        val comment = if (createTableClauses.commentSpec().size > 0) CommonUtils.cleanQuote(createTableClauses.commentSpec(0).stringLit().text) else null
        val lifeCycle = createTableClauses.lifecycle?.text?.toInt()

        var partitionColumnRels: List<ColumnRel>? = null
        val partitionColumnNames: ArrayList<String> = arrayListOf()
        var columnRels: List<ColumnRel>? = null
        var modelType = "hive"
        if (query == null) {
            columnRels = createOrReplaceTableColTypeList?.createOrReplaceTableColType()?.map {
                val colName = it.colName.text
                val dataType = it.dataType().text
                val (nullable, defaultExpr, colComment) = parseColDefinition(it.colDefinitionOption())
                ColumnRel(colName, dataType, colComment, nullable, defaultExpr)
            }

            if (tableProvider != null) {
                modelType = "spark"
            }

            if (createTableClauses.partitioning != null) {
                if ("spark" == modelType) {
                    createTableClauses.partitioning.children
                        .filter { it is SparkSqlParser.PartitionTransformContext }.forEach { item ->
                            val column = item as SparkSqlParser.PartitionTransformContext
                            partitionColumnNames.add(column.text)
                        }

                    if (partitionColumnNames.size == 0) {
                        throw SQLParserException("spark create table 语法创建表，创建分区字段语法错误，请参考文档");
                    }
                } else {
                    partitionColumnRels = createTableClauses.partitioning.children
                        .filter { it is SparkSqlParser.PartitionColumnContext }.map { item ->
                            val column = item as SparkSqlParser.PartitionColumnContext
                            val colName = column.colType().colName.text
                            val dataType = column.colType().dataType().text
                            checkPartitionDataType(dataType)

                            partitionColumnNames.add(colName)
                            val colComment = if (column.colType().commentSpec() != null) CommonUtils.cleanQuote(column.colType().commentSpec().stringLit().text) else null
                            ColumnRel(colName, dataType, colComment)
                        }
                }
            }
        } else {
            if (createTableClauses.partitioning != null) {
                createTableClauses.partitioning.children
                    .filter { it is SparkSqlParser.PartitionTransformContext }.forEach { item ->
                        val column = item as SparkSqlParser.PartitionTransformContext
                        partitionColumnNames.add(column.text)
                    }
            }
        }

        val properties = HashMap<String, String>()
        if (createTableClauses.tableProps != null) {
            createTableClauses.tableProps.children.filter { it is SparkSqlParser.PropertyContext }.map { item ->
                val property = item as SparkSqlParser.PropertyContext
                val key = CommonUtils.cleanQuote(property.key.text)
                val value = CommonUtils.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        var fileFormat = tableProvider?.multipartIdentifier()?.text
        createTableClauses.createFileFormat()
        if (createTableClauses.createFileFormat().size == 1) {
            fileFormat = createTableClauses.createFileFormat().get(0).fileFormat().text
        }

        if (query != null) {
            currentOptType = StatementType.CREATE_TABLE_AS_SELECT
            val queryStmt = parseQuery(query)

            val createTable = CreateTableAsSelect(tableId, queryStmt, comment, lifeCycle,
                    partitionColumnRels, columnRels, properties, fileFormat, ifNotExists)
            createTable.modelType = modelType;
            createTable.replace = replace
            createTable.partitionColumnNames.addAll(partitionColumnNames)
            return createTable
        } else {
            currentOptType = StatementType.CREATE_TABLE
            val createTable = CreateTable(tableId, TableType.HIVE, comment, lifeCycle, partitionColumnRels, columnRels, properties, fileFormat, ifNotExists)
            createTable.modelType = modelType;
            createTable.replace = replace
            createTable.external = external
            createTable.temporary = temporary

            if (createTableClauses.locationSpec().size > 0) {
                createTable.location = createTableClauses.locationSpec().get(0).text
            }

            createTable.partitionColumnNames = partitionColumnNames
            return createTable
        }
    }

    override fun visitCreateTableLike(ctx: SparkSqlParser.CreateTableLikeContext): Statement {
        val newDatabaseName = ctx.target.db?.text
        val newTableName = ctx.target.table.text

        val oldDatabaseName = ctx.source.db?.text
        val oldTableName = ctx.source.table.text

        val createTableLike = CreateTableLike(TableId(oldDatabaseName, oldTableName),
            TableId(newDatabaseName, newTableName))

        createTableLike.ifNotExists = ctx.NOT() != null
        return createTableLike
    }

    override fun visitDropTable(ctx: SparkSqlParser.DropTableContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())

        val dropTable = DropTable(tableId)
        dropTable.ifExists = ctx.EXISTS() != null
        return dropTable
    }

    override fun visitDropView(ctx: SparkSqlParser.DropViewContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        return DropView(tableId, ctx.EXISTS() != null)
    }

    override fun visitTruncateTable(ctx: SparkSqlParser.TruncateTableContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        return TruncateTable(tableId)
    }

    override fun visitRepairTable(ctx: SparkSqlParser.RepairTableContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        return RepairTable(tableId)
    }

    override fun visitRenameTable(ctx: SparkSqlParser.RenameTableContext): Statement {
        val tableId = parseTableName(ctx.from)
        val newTableId = parseTableName(ctx.to)

        return if (ctx.VIEW() != null) {
            val action = RenameAction(newTableId)
            AlterView(tableId, action)
        } else {
            val action = RenameAction(newTableId)
            AlterTable(tableId, action)
        }
    }

    override fun visitSetTableProperties(ctx: SparkSqlParser.SetTablePropertiesContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val properties = parseOptions(ctx.propertyList())
        val action = AlterPropsAction()
        action.properties.putAll(properties)

        return if (ctx.VIEW() == null) {
            AlterTable(tableId, action)
        } else {
            AlterView(tableId, action)
        }
    }

    override fun visitAddTableColumns(ctx: SparkSqlParser.AddTableColumnsContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())

        val actions = ctx.columns.children
                .filter { it is SparkSqlParser.QualifiedColTypeWithPositionContext }.map { item ->
                    val column = item as SparkSqlParser.QualifiedColTypeWithPositionContext
                    val columnName = column.multipartIdentifier().text
                    val dataType = column.dataType().text
                    var comment: String? = null
                    var position: String? = null
                    var afterCol: String? = null

                    column.colDefinitionDescriptorWithPosition().forEach { colDesc ->
                        if (colDesc.commentSpec() != null) {
                            comment = CommonUtils.cleanQuote(colDesc.commentSpec().stringLit().text)
                        } else if (colDesc.colPosition() != null) {
                            if (colDesc.colPosition() != null) {
                                if (colDesc.colPosition().FIRST() != null) {
                                    position = "first"
                                } else if (colDesc.colPosition().AFTER() != null) {
                                    position = "after"
                                    afterCol = colDesc.colPosition().afterCol.text
                                }
                            }
                        }
                    }

                    AlterColumnAction(ADD_COLUMN, columnName, dataType, comment, position, afterCol)
                }

        val alterTable = AlterTable(tableId)
        alterTable.addActions(actions)
        return alterTable
    }

    override fun visitHiveChangeColumn(ctx: SparkSqlParser.HiveChangeColumnContext): Statement {
        val tableId = parseTableName(ctx.table)

        val columnName = ctx.colName.parts.get(0).text
        val newColumnName = ctx.colType().colName.text
        val dataType = ctx.colType().dataType().text
        val commentNode = ctx.colType().commentSpec()?.stringLit()
        val comment = if (commentNode != null) CommonUtils.cleanQuote(commentNode.text) else null

        val action = AlterColumnAction(ALTER_COLUMN, columnName, dataType, comment)
        action.newColumName = newColumnName
        if (ctx.colPosition() != null) {
            if (ctx.colPosition().FIRST() != null) {
                action.position = "first"
            } else if (ctx.colPosition().AFTER() != null) {
                action.position = "after"
                action.afterCol = ctx.colPosition().afterCol.text
            }
        }

        return AlterTable(tableId, action)
    }

    override fun visitRenameTableColumn(ctx: SparkSqlParser.RenameTableColumnContext): Statement {
        val tableId = parseTableName(ctx.table)

        val columnName = ctx.from.text
        val newColumnName = ctx.to.text

        val action = AlterColumnAction(RENAME, columnName)
        action.newColumName = newColumnName
        return AlterTable(tableId, action)
    }

    override fun visitAlterTableAlterColumn(ctx: SparkSqlParser.AlterTableAlterColumnContext): Statement {
        val tableId = parseTableName(ctx.table)

        val action = parseAlterColumnAction(ctx.alterColumnAction())
        action.columName = ctx.column.text
        return AlterTable(tableId, action)
    }

    override fun visitTouchTable(ctx: SparkSqlParser.TouchTableContext): Statement {
        val tableId = parseTableName(ctx.table)
        val partitionVals = if (ctx.partitionSpec() != null) parsePartitionSpec(ctx.partitionSpec()) else null
        val action = AlterTouchPartitionAction(tableId, partitionVals)
        val alterTable = AlterTable(tableId, action)
        return alterTable
    }

    override fun visitDropTableColumns(ctx: SparkSqlParser.DropTableColumnsContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())

        val columns = ctx.columns.multipartIdentifier().map { id -> id.text }
        val action = DropColumnAction(columns.joinToString("."))
        return AlterTable(tableId, action)
    }

    override fun visitSetTableLocation(ctx: SparkSqlParser.SetTableLocationContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val location = CommonUtils.cleanQuote(ctx.locationSpec().stringLit().text)

        val action = AlterPropsAction(location)
        return AlterTable(tableId, action)
    }

    override fun visitMergeFile(ctx: SparkSqlParser.MergeFileContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())

        val partitionVals = parsePartitionSpec(ctx.partitionSpec())
        val properties = parseOptions(ctx.propertyList())
        return MergeFileData(tableId, properties, partitionVals)
    }

    override fun visitRefreshTable(ctx: SparkSqlParser.RefreshTableContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        return RefreshStatement(tableId)
    }

    override fun visitAnalyze(ctx: SparkSqlParser.AnalyzeContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        return AnalyzeTable(listOf(tableId))
    }

    override fun visitDatatunnelExpr(ctx: SparkSqlParser.DatatunnelExprContext): Statement {
        val sourceType = CommonUtils.cleanQuote(ctx.sourceName.text)
        val sinkType = CommonUtils.cleanQuote(ctx.sinkName.text)

        currentOptType = StatementType.DATATUNNEL

        if (ctx.ctes() != null) {
            visitCtes(ctx.ctes())
        }

        val sourceOptions = parseDtOptions(ctx.readOpts)

        var transformSql: String? = null
        if (ctx.transfromSql != null) {
            transformSql = CommonUtils.cleanQuote(ctx.transfromSql.text)
        }

        val sinkOptions = parseDtOptions(ctx.writeOpts)

        val data = DataTunnelExpr(sourceType, sourceOptions, transformSql, sinkType, sinkOptions)
        data.inputTables.addAll(inputTables)
        data.functionNames.addAll(functionNames)
        return data
    }

    override fun visitDatatunnelHelp(ctx: SparkSqlParser.DatatunnelHelpContext): Statement {
        val type = if (ctx.SOURCE() != null) "source" else "sink";
        val value = CommonUtils.cleanQuote(ctx.value.text)
        return DataTunnelHelp(type, value)
    }

    private fun parseDtOptions(ctx: DtPropertyListContext?): HashMap<String, Any> {
        val options = LinkedHashMap<String, Any>()
        if (ctx != null) {
            ctx.dtProperty().map { item ->
                val property = item as DtPropertyContext
                val key = CommonUtils.cleanQuote(property.key.text)
                if (property.value.columnDef().size > 0) {
                    val list = arrayListOf<HashMap<String, String>>()
                    property.value.columnDef().map { col ->
                        val map = HashMap<String, String>()
                        col.dtColProperty().map { pt ->
                            val colProperty = pt as DtColPropertyContext
                            val colKey = CommonUtils.cleanQuote(colProperty.key.text)
                            val colValue = CommonUtils.cleanQuote(colProperty.value.text)
                            map.put(colKey, colValue)
                        }
                        list.add(map)
                    }
                    options.put(key, list)
                } else if (property.value.dtPropertyValue().size > 0) {
                    val list = arrayListOf<String>()
                    property.value.dtPropertyValue().map { col ->
                        val value = CommonUtils.cleanQuote(col.text)
                        list.add(value)
                    }
                    options.put(key, list)
                } else {
                    val value = CommonUtils.cleanQuote(property.value.text)
                    options.put(key, value)
                }
            }
        }

        return options
    }

    override fun visitCall(ctx: SparkSqlParser.CallContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val properties = HashMap<String, String>()
        ctx.callArgument().filter { it.FAT_ARROW() != null }.forEach { item ->
            val key = CommonUtils.cleanQuote(item.identifier().text)
            val value = CommonUtils.cleanQuote(item.expression().text)
            properties.put(key.lowercase(), value)
        }

        return CallProcedure(ProcedureId(tableId.catalogName, tableId.schemaName, tableId.tableName), properties)
    }

    override fun visitCallHelp(ctx: SparkSqlParser.CallHelpContext): Statement {
        var procedure: String? = null
        if (ctx.callHelpExpr() != null) {
            procedure = if (ctx.callHelpExpr().callArgument() != null) {
                CommonUtils.cleanQuote(ctx.callHelpExpr().callArgument().expression().text)
            } else {
                ctx.callHelpExpr().identifier().text
            }
        }

        return CallHelp(procedure)
    }

    override fun visitSyncTableMeta(ctx: SparkSqlParser.SyncTableMetaContext): Statement {
        val syncType = ctx.dtType.text.lowercase();
        var owner: String? = null
        if (ctx.principal != null) {
            owner = ctx.principal.text
        }

        return if ("database" == syncType) {
            val source = parseNamespace(ctx.source)
            SyncDatabaseMetadata(source.first, source.second, owner);
        } else {
            val sourceTableId = parseTableName(ctx.source)
            SyncTableMetadata(sourceTableId, owner)
        }
    }

    override fun visitSyncTableExpr(ctx: SparkSqlParser.SyncTableExprContext): Statement {
        val sinkTable = parseTableName(ctx.sink)
        val sourceTable = parseTableName(ctx.source)

        val sinkOptions: HashMap<String, String> = parseOptions(ctx.sinkOptions)
        val sourceOptions: HashMap<String, String> = parseOptions(ctx.sourceOptions)

        val createTable = SyncTable(sinkTable, sourceTable)
        createTable.sinkOptions.putAll(sinkOptions)
        createTable.sourceOptions.putAll(sourceOptions)
        return createTable
    }

    override fun visitSyncDatabaseExpr(ctx: SparkSqlParser.SyncDatabaseExprContext): Statement {
        val sinkDatabase = parseNamespace(ctx.sink)
        val sourceDatabase = parseNamespace(ctx.source)

        val sinkOptions: HashMap<String, String> = parseOptions(ctx.sinkOptions)
        val sourceOptions: HashMap<String, String> = parseOptions(ctx.sourceOptions)

        val createDatabase = if (ctx.includeTable == null) {
            SyncDatabase(sinkDatabase.first, sinkDatabase.second, sourceDatabase.first, sourceDatabase.second)
        } else {
            SyncDatabase(sinkDatabase.first, sinkDatabase.second, sourceDatabase.first, sourceDatabase.second, CommonUtils.cleanQuote(ctx.includeTable.text))
        }

        if (ctx.excludeTable != null) {
            createDatabase.excludingTables = CommonUtils.cleanQuote(ctx.excludeTable.text)
        }

        createDatabase.sinkOptions.putAll(sinkOptions)
        createDatabase.sourceOptions.putAll(sourceOptions)
        return createDatabase
    }

    //-----------------------------------partition-------------------------------------------------

    override fun visitAddTablePartition(ctx: SparkSqlParser.AddTablePartitionContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())

        val partitions = ctx.partitionSpecLocation().map { parsePartitionSpec(it.partitionSpec()) }

        val ifNotExists = ctx.NOT() != null

        val action = AddPartitionAction(ifNotExists, partitions)
        return AlterTable(tableId, action)
    }

    override fun visitDropTablePartitions(ctx: SparkSqlParser.DropTablePartitionsContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val partitions = ctx.partitionSpec().map { parsePartitionSpec(it) }
        val ifExists = ctx.EXISTS() != null

        val action = DropPartitionAction(ifExists, partitions)
        return AlterTable(tableId, action)
    }

    override fun visitRenameTablePartition(ctx: SparkSqlParser.RenameTablePartitionContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val fromPartition = parsePartitionSpec(ctx.from)
        val toPartition = parsePartitionSpec(ctx.to)
        val action = RenamePartitionAction(fromPartition, toPartition)
        return AlterTable(tableId, action)
    }

    //-----------------------------------view-------------------------------------------------

    override fun visitCreateView(ctx: SparkSqlParser.CreateViewContext): Statement {
        var comment: String? = null
        if (ctx.commentSpec().size > 0) {
            comment = ctx.commentSpec().get(0).stringLit().text
            comment = CommonUtils.cleanQuote(comment)
        }

        val tableId = parseTableName(ctx.identifierReference())
        val ifNotExists = ctx.NOT() != null
        val queryStmt = parseQuery(ctx.query())

        currentOptType = StatementType.CREATE_VIEW
        this.visitQuery(ctx.query())

        val columnNameList = parseColumRefs(ctx.identifierCommentList())
        val createView = CreateView(tableId, queryStmt, comment, ifNotExists, columnNameList)

        if (ctx.REPLACE() != null) {
            createView.replace = true
        }
        if (ctx.TEMPORARY() != null) {
            createView.temporary = true
        }
        if (ctx.GLOBAL() != null) {
            createView.global = true
        }
        return createView
    }

    override fun visitCreateTempViewUsing(ctx: SparkSqlParser.CreateTempViewUsingContext): Statement {
        val tableName = ctx.tableIdentifier().table.text
        var databaseName: String? = null
        if (ctx.tableIdentifier().db != null) {
            databaseName = ctx.tableIdentifier().db.text
        }

        currentOptType = StatementType.CREATE_TEMP_VIEW_USING

        val tableId = TableId(null, databaseName, tableName)
        val fileFormat = ctx.tableProvider().multipartIdentifier().text
        val properties = parseOptions(ctx.propertyList())
        val createView = CreateTempViewUsing(tableId, fileFormat, properties)
        if (ctx.REPLACE() != null) {
            createView.replace = true
        }
        if (ctx.GLOBAL() != null) {
            createView.global = true
        }
        return createView
    }

    override fun visitAlterViewQuery(ctx: SparkSqlParser.AlterViewQueryContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val queryStmt = parseQuery(ctx.query())

        currentAlterActionType = ALTER_VIEW_QUERY
        visitQuery(ctx.query())

        val action = AlterViewAction(queryStmt)
        return AlterTable(tableId, action)
    }

    override fun visitCreateIndex(ctx: SparkSqlParser.CreateIndexContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val indexName = parseIdentifier(ctx.identifier())
        val createIndex = CreateIndex(indexName)
        return AlterTable(tableId, createIndex)
    }

    override fun visitDropIndex(ctx: SparkSqlParser.DropIndexContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val indexName = ctx.identifier().text
        val dropIndex = DropIndex(indexName)
        return AlterTable(tableId, dropIndex)
    }

    //-----------------------------------function-------------------------------------------------

    override fun visitCreateFunction(ctx: SparkSqlParser.CreateFunctionContext): Statement {
        val functionId = parseTableName(ctx.identifierReference())
        val classNmae = ctx.className.text

        var temporary = false
        var file: String? = null
        if (ctx.TEMPORARY() != null) {
            temporary = true
        } else {
            file = ctx.resource(0).stringLit().text
        }

        val replace = if (ctx.REPLACE() != null) true else false
        return CreateFunction(FunctionId(functionId.schemaName, functionId.tableName), replace, temporary, classNmae, file)
    }

    override fun visitDropFunction(ctx: SparkSqlParser.DropFunctionContext): Statement {
        val functionId = parseTableName(ctx.identifierReference())
        return DropFunction(FunctionId(functionId.schemaName, functionId.tableName))
    }
    //-----------------------------------cache-------------------------------------------------

    override fun visitCacheTable(ctx: SparkSqlParser.CacheTableContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val options = parseOptions(ctx.propertyList())
        if (ctx.query() != null) {
            val query = parseQuery(ctx.query())
            return CacheTable(tableId, options, query)
        } else {
            return CacheTable(tableId, options)
        }
    }

    private fun parseQuery(ctx: QueryContext): QueryStmt {
        currentOptType = StatementType.SELECT
        this.visitQuery(ctx)

        val queryStmt = QueryStmt(inputTables, limit, offset)
        queryStmt.functionNames.addAll(functionNames)
        var querySql = CommonUtils.subsql(command, ctx)
        if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
            querySql = StringUtils.substring(querySql, 1, -1)
        }
        queryStmt.setSql(querySql)
        return queryStmt
    }

    private fun parseFromClause(ctx: FromClauseContext): QueryStmt {
        currentOptType = StatementType.SELECT
        this.visitFromClause(ctx)

        val queryStmt = QueryStmt(inputTables, limit, offset)
        queryStmt.functionNames.addAll(functionNames)
        var querySql = CommonUtils.subsql(command, ctx)
        if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
            querySql = StringUtils.substring(querySql, 1, -1)
        }
        queryStmt.setSql(querySql)
        return queryStmt
    }

    override fun visitUncacheTable(ctx: SparkSqlParser.UncacheTableContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        return UnCacheTable(tableId)
    }

    override fun visitClearCache(ctx: SparkSqlParser.ClearCacheContext?): Statement {
        return DefaultStatement(StatementType.CLEAR_CACHE)
    }

    //-----------------------------------other-------------------------------------------------

    override fun visitExplain(ctx: SparkSqlParser.ExplainContext?): Statement {
        return DefaultStatement(StatementType.EXPLAIN)
    }

    override fun visitCreateFileView(ctx: SparkSqlParser.CreateFileViewContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val path = CommonUtils.cleanQuote(ctx.path.text)

        var compression: String? = null
        var sizeLimit: String? = null

        val fileFormat = ctx.tableProvider().multipartIdentifier().text

        val causes = ctx.createFileViewClauses()
        if (causes != null) {
            if (causes.compressionName != null) compression = causes.compressionName.text
            if (causes.sizelimit != null) sizeLimit = causes.sizelimit.text
        }
        val properties = parseOptions(ctx.propertyList())

        return CreateFileView(tableId, path, properties, fileFormat, compression, sizeLimit)
    }

    override fun visitExportTable(ctx: SparkSqlParser.ExportTableContext): Statement {
        if (ctx.ctes() != null) {
            visitCtes(ctx.ctes())
        }
        currentOptType = StatementType.EXPORT_TABLE
        super.visitExportTable(ctx)

        val tableId = parseTableName(ctx.multipartIdentifier())
        val filePath = CommonUtils.cleanQuote(ctx.filePath.text)
        val properties = parseOptions(ctx.propertyList())
        val partitionVals = parsePartitionSpec(ctx.partitionSpec())

        var fileFormat: String? = null
        var compression: String? = null
        var maxFileSize: String? = null
        var overwrite: Boolean = false
        var single: Boolean = false

        val causes = ctx.exportTableClauses()
        if (causes != null) {
            if (causes.fileformatName != null) fileFormat = causes.fileformatName.text
            if (causes.compressionName != null) compression = causes.compressionName.text
            if (causes.maxfilesize != null) maxFileSize = causes.maxfilesize.text
            if (causes.overwrite != null) overwrite = causes.overwrite.TRUE() != null
            if (causes.single != null) single = causes.single.TRUE() != null
        }

        val exportTable = ExportTable(tableId, filePath, properties, partitionVals,
            fileFormat, compression, maxFileSize, overwrite, single, inputTables)

        exportTable.functionNames.addAll(functionNames)
        return exportTable
    }

    override fun visitUse(ctx: SparkSqlParser.UseContext): Statement {
        val (catalogName, databaseName) = parseNamespace(ctx.identifierReference())
        return UseDatabase(catalogName, databaseName)
    }

    override fun visitUseNamespace(ctx: SparkSqlParser.UseNamespaceContext): Statement {
        val type = ctx.namespace().text.uppercase()

        if (StringUtils.equalsIgnoreCase("database", type) ||
            StringUtils.equalsIgnoreCase("schema", type)) {

            val (catalogName, databaseName) = parseNamespace(ctx.identifierReference())
            return UseDatabase(catalogName, databaseName)
        } else if (StringUtils.equalsIgnoreCase("namespace", type)) {
            return UseCatalog(ctx.identifierReference().text)
        } else {
            throw RuntimeException("not support: " + type)
        }
    }

    private val configKeyValueDef = """([a-zA-Z_\d\\.:]+)\s*=([^;]*);*""".toRegex()
    private val configKeyDef = """([a-zA-Z_\d\\.:]+)$""".toRegex()
    private val configValueDef = """([^;]*);*""".toRegex()
    private val strLiteralDef = """(".*?[^\\]"|'.*?[^\\]'|[^ \n\r\t"']+)""".toRegex()

    override fun visitSetConfiguration(ctx: SparkSqlParser.SetConfigurationContext): Statement {
        if (ctx.configKey() != null) {
            val keyStr = ctx.configKey().getText()
            if (ctx.EQ() != null) {
                val value = StringUtils.trim(CommonUtils.subsql(command, ctx.EQ().symbol, ctx.stop))
                if (configValueDef.matches(value)) {
                    return SetStatement(keyStr, value);
                } else {
                    throw SQLParserException("value not support: " + CommonUtils.subsql(command, ctx))
                }
            } else {
                return SetStatement(keyStr);
            }
        } else {
            val config = StringUtils.trim(CommonUtils.subsql(command, ctx.SET().symbol, ctx.stop))
            if (configKeyValueDef.matches(config)) {
                val matcher = configKeyValueDef.find(config)!!
                val (key, value) = matcher.destructured
                return SetStatement(key, StringUtils.trim(value))
            } else if (configKeyDef.matches(config)) {
                return SetStatement(config)
            } else {
                throw SQLParserException("not support: " + CommonUtils.subsql(command, ctx))
            }
        }
    }

    override fun visitSetQuotedConfiguration(ctx: SparkSqlParser.SetQuotedConfigurationContext): Statement {
        assert(ctx.configValue() != null)
        if (ctx.configKey() != null) {
            return SetStatement(ctx.configKey().getText(), ctx.configValue().getText())
        } else {
            throw SQLParserException("not support" + CommonUtils.subsql(command, ctx))
        }
    }

    override fun visitResetConfiguration(ctx: SparkSqlParser.ResetConfigurationContext): Statement {
        val key = StringUtils.trim(CommonUtils.subsql(command, ctx.RESET().symbol, ctx.stop))

        if (configKeyDef.matches(key)) {
            return ReSetStatement(key)
        } else {
            throw SQLParserException("not support" + CommonUtils.subsql(command, ctx))
        }
    }

    override fun visitResetQuotedConfiguration(ctx: SparkSqlParser.ResetQuotedConfigurationContext): Statement {
        return ReSetStatement(ctx.configKey().getText())
    }

    //-----------------------------------insert & query-------------------------------------------------

    override fun visitStatementDefault(ctx: SparkSqlParser.StatementDefaultContext): Statement? {
        val node = ctx.getChild(0)
        if (node is QueryContext) {
            currentOptType = StatementType.SELECT
            super.visitStatementDefault(ctx)

            val queryStmt = QueryStmt(inputTables, limit, offset)
            queryStmt.functionNames.addAll(functionNames)
            return queryStmt
        }

        return null
    }

    override fun visitDmlStatement(ctx: SparkSqlParser.DmlStatementContext): Statement? {
        currentOptType = StatementType.INSERT
        val node = if (ctx.ctes() != null) {
            this.visitCtes(ctx.ctes())
            ctx.getChild(1)
        } else {
            ctx.getChild(0)
        }

        if (node is SingleInsertQueryContext) {
            insertSql = true
            val queryStmt = parseQuery(node.query())
            currentOptType = StatementType.INSERT
            val insertTable = parseInsertInto(node.insertInto(), queryStmt)
            insertTable.rows = rows

            return insertTable
        } else if (node is MultiInsertQueryContext) {
            val queryStmt = parseFromClause(node.fromClause())
            currentOptType = StatementType.INSERT

            node.multiInsertQueryBody().forEach {  this.visitMultiInsertQueryBody(it) }
            val insertTable = InsertTable(InsertMode.OVERWRITE, queryStmt, outputTables.first())
            insertTable.outputTables.addAll(outputTables.subList(1, outputTables.size))
            return insertTable
        } else if (node is SparkSqlParser.UpdateTableContext ||
                node is SparkSqlParser.DeleteFromTableContext ||
                node is SparkSqlParser.MergeIntoTableContext) {
            return super.visitDmlStatement(ctx)
        } else {
            return null
        }
    }

    private fun parseInsertInto(ctx: InsertIntoContext, queryStmt: QueryStmt): InsertTable {
        return if (ctx is SparkSqlParser.InsertIntoTableContext) {
            val tableId = parseTableName(ctx.identifierReference())
            val partitionVals = parsePartitionSpec(ctx.partitionSpec())
            var columnNameList: List<ColumnRel>? = null
            if (ctx.identifierList() != null) {
                columnNameList = ctx.identifierList().identifierSeq().ident.map { ColumnRel(CommonUtils.cleanQuote(it.text)) }
            }
            val stmt = InsertTable(InsertMode.INTO, queryStmt, tableId, columnNameList)
            stmt.partitionVals = partitionVals
            stmt
        } else if (ctx is SparkSqlParser.InsertOverwriteTableContext) {
            val tableId = parseTableName(ctx.identifierReference())
            val partitionVals = parsePartitionSpec(ctx.partitionSpec())
            var columnNameList: List<ColumnRel>? = null
            if (ctx.identifierList() != null) {
                columnNameList = ctx.identifierList().identifierSeq().ident.map { ColumnRel(CommonUtils.cleanQuote(it.text)) }
            }
            val stmt = InsertTable(InsertMode.OVERWRITE, queryStmt, tableId, columnNameList)
            stmt.partitionVals = partitionVals
            stmt
        } else if (ctx is SparkSqlParser.InsertIntoReplaceWhereContext) {
            val tableId = parseTableName(ctx.identifierReference())
            InsertTable(InsertMode.INTO_REPLACE, queryStmt, tableId)
        } else if (ctx is SparkSqlParser.InsertOverwriteDirContext) {
            val path = if (ctx.path != null) CommonUtils.cleanQuote(ctx.path.STRING_LITERAL().text) else "";
            val properties = parseOptions(ctx.propertyList())
            val fileFormat = ctx.tableProvider().multipartIdentifier().text

            val stmt = InsertTable(InsertMode.OVERWRITE_DIR, queryStmt, TableId(path))
            stmt.properties = properties
            stmt.fileFormat = fileFormat
            stmt
        } else if (ctx is SparkSqlParser.InsertOverwriteHiveDirContext) {
            val path = CommonUtils.cleanQuote(ctx.path.STRING_LITERAL().text);
            val stmt = InsertTable(InsertMode.OVERWRITE_HIVE_DIR, queryStmt, TableId(path))
            stmt
        } else {
            throw SQLParserException("not support insert into sql")
        }
    }

    //-----------------------------------delta sql-------------------------------------------------

    override fun visitDeleteFromTable(ctx: SparkSqlParser.DeleteFromTableContext): Statement {
        currentOptType = StatementType.DELETE
        val tableId = parseTableName(ctx.identifierReference())
        super.visitWhereClause(ctx.whereClause())

        return DeleteTable(tableId, inputTables)
    }

    override fun visitUpdateTable(ctx: SparkSqlParser.UpdateTableContext): Statement {
        currentOptType = StatementType.UPDATE
        val tableId = parseTableName(ctx.identifierReference())
        if (ctx.whereClause() != null) {
            super.visitWhereClause(ctx.whereClause())
        }

        return UpdateTable(tableId, inputTables)
    }

    override fun visitMergeIntoTable(ctx: SparkSqlParser.MergeIntoTableContext): Statement {
        currentOptType = StatementType.MERGE

        val targetTable = parseTableName(ctx.target)
        val mergeTable = MergeTable(targetTable = targetTable)

        if (ctx.source != null) {
            val tableId = parseTableName(ctx.source)
            inputTables.add(tableId)
        } else if (ctx.sourceQuery != null && ctx.sourceQuery is QueryContext) {
            val query = ctx.sourceQuery as QueryContext
            super.visitQuery(query)
        }
        mergeTable.inputTables = inputTables
        return mergeTable
    }

    override fun visitManageResource(ctx: SparkSqlParser.ManageResourceContext): Statement {
        val resouceType = StringUtils.lowerCase(ctx.identifier().text)
        val rawArg = StringUtils.substring(command, ctx.identifier().stop.stopIndex + 1, ctx.stop.stopIndex + 1)

        val files = arrayListOf<String>()
        if (StringUtils.isNotBlank(rawArg)) {
            val pattern = Pattern.compile("(\".*?[^\\\\]\"|'.*?[^\\\\]'|[^ \\n\\r\\t\"']+)")
            val matcher = pattern.matcher(rawArg)
            while (matcher.find()) {
                val match = matcher.group()
                files.add(CommonUtils.cleanQuote(match))
            }
        }

        return if (ctx.ADD() != null) {
            AddResourceStatement(files, resouceType)
        } else {
            ListResourceStatement(files, resouceType)
        }
    }

    //-----------------------------------private method-------------------------------------------------

    override fun visitFunctionCall(ctx: SparkSqlParser.FunctionCallContext): Statement? {
        val functionId = parseFunctionName(ctx.functionName())
        if (functionId != null) {
            val args = ctx.functionArgument().map { CommonUtils.cleanQuote(it.text) }.toList()
            functionId.functionArguments = args
            functionNames.add(functionId)
        }

        return super.visitFunctionCall(ctx);
    }

    override fun visitFunctionTable(ctx: SparkSqlParser.FunctionTableContext): Statement? {
        val functionId = parseFunctionName(ctx.functionName())
        if (functionId != null) {
            val args = ctx.functionTableArgument().map { CommonUtils.cleanQuote(it.text) }.toList()
            functionId.functionArguments = args
            functionId.funcType = "TVF"
            functionNames.add(functionId)
        }

        return super.visitFunctionTable(ctx);
    }

    private fun parseFunctionName(ctx: SparkSqlParser.FunctionNameContext): FunctionId? {
        if (StatementType.SELECT == currentOptType ||
            StatementType.CREATE_VIEW == currentOptType ||
            StatementType.INSERT == currentOptType ||
            StatementType.CREATE_TABLE_AS_SELECT == currentOptType ||
            StatementType.MERGE == currentOptType ||
            StatementType.EXPORT_TABLE == currentOptType ||
            StatementType.DATATUNNEL == currentOptType) {

            val names = ctx.qualifiedName().identifier()
            if (names.size == 3) {
                val catalog = StringUtils.lowerCase(names.get(0).text)
                val schema = StringUtils.lowerCase(names.get(1).text)
                val funcName = StringUtils.lowerCase(names.get(2).text)
                return FunctionId(catalog, schema, funcName)
            } else if (names.size == 2) {
                val schema = StringUtils.lowerCase(names.get(0).text)
                val funcName = StringUtils.lowerCase(names.get(1).text)
                return FunctionId(schema, funcName)
            } else if (names.size == 1) {
                val funcName = StringUtils.lowerCase(names.get(0).text)
                return FunctionId(funcName)
            }
        }
        return null;
    }

    override fun visitCtes(ctx: SparkSqlParser.CtesContext): Statement? {
        ctx.namedQuery().forEach {
            cteTempTables.add(TableId(it.name.text))
        }
        return super.visitCtes(ctx)
    }

    override fun visitMultipartIdentifier(ctx: SparkSqlParser.MultipartIdentifierContext): Statement? {
        val tableId = parseTableName(ctx)
        if (currentOptType == StatementType.CREATE_TABLE_AS_SELECT ||
            currentOptType == StatementType.SELECT ||
            currentOptType == StatementType.CREATE_VIEW ||
            currentOptType == StatementType.INSERT ||
            currentOptType == StatementType.MERGE ||
            currentOptType == StatementType.EXPORT_TABLE ||
            currentOptType == StatementType.DATATUNNEL ||
            currentOptType == StatementType.UPDATE ||
            currentOptType == StatementType.DELETE ||
            currentAlterActionType == ALTER_VIEW_QUERY) {

            if (!inputTables.contains(tableId) && !cteTempTables.contains(tableId)) {
                inputTables.add(tableId)
            }
        }
        return null
    }

    override fun visitRowConstructor(ctx: SparkSqlParser.RowConstructorContext): Statement? {
        val row = ctx.children.filter { it is SparkSqlParser.NamedExpressionContext }.map {
            var text = it.text
            text = CommonUtils.cleanQuote(text)
            text
        }.toList()

        rows.add(row)
        return null
    }

    override fun visitParenthesizedExpression(ctx: SparkSqlParser.ParenthesizedExpressionContext): Statement? {
        val row = ctx.children.filter { it is SparkSqlParser.ExpressionContext }.map {
            var text = it.text
            text = CommonUtils.cleanQuote(text)
            text
        }.toList()

        rows.add(row)
        return null
    }

    override fun visitFromClause(ctx: SparkSqlParser.FromClauseContext): Statement? {
        multiInsertToken = "from"
        return super.visitFromClause(ctx)
    }

    override fun visitMultiInsertQueryBody(ctx: SparkSqlParser.MultiInsertQueryBodyContext): Statement? {
        multiInsertToken = "insert"
        val obj = ctx.insertInto()
        if (obj is SparkSqlParser.InsertOverwriteTableContext) {
            val multipartIdentifier = obj.identifierReference()
            val tableId = parseTableName(multipartIdentifier)
            outputTables.add(tableId)
        } else if (obj is SparkSqlParser.InsertIntoTableContext) {
            val multipartIdentifier = obj.identifierReference()
            val tableId = parseTableName(multipartIdentifier)
            outputTables.add(tableId)
        }
        return null
    }

    override fun visitQueryOrganization(ctx: SparkSqlParser.QueryOrganizationContext): Statement? {
        limit = ctx.limit?.text?.toInt()
        offset = ctx.offset?.text?.toInt()
        return super.visitQueryOrganization(ctx)
    }

    override fun visitTypeConstructor(ctx: SparkSqlParser.TypeConstructorContext): Statement? {
        val valueType = ctx.literalType().getText().uppercase()
        if (!("DATE".equals(valueType) || "TIME".equals(valueType)
                    || "TIMESTAMP".equals(valueType) || "INTERVAL".equals(valueType)
                    || "X".equals(valueType))) {
            throw SQLParserException("Literals of type " + valueType + " are currently not supported.");
        }

        return super.visitTypeConstructor(ctx)
    }

    private fun parseColDefinition(colDef: List<ColDefinitionOptionContext>): Triple<Boolean, String?, String?> {
        var nullable: Boolean = false
        var comment: String? = null
        var defaultExpr: String? = null

        if (colDef.size > 0) {
            colDef.forEach { col ->
                if (col.NULL() != null) {
                    nullable = true
                }

                if (col.commentSpec() != null) {
                    comment = CommonUtils.cleanQuote(col.commentSpec().stringLit().text);
                }

                if (col.defaultExpression() != null) {
                    defaultExpr = StringUtils.substring(command,
                        col.defaultExpression().start.startIndex,
                        col.defaultExpression().stop.stopIndex + 1)

                    if (defaultExpr != null) {
                        defaultExpr = CommonUtils.cleanQuote(defaultExpr!!)
                    }
                }
            }
        }

        return Triple(nullable, defaultExpr, comment)
    }

    private fun parseAlterColumnAction(context: AlterColumnActionContext): AlterColumnAction {
        val action = AlterColumnAction(ALTER_COLUMN);
        if (context.dataType() != null) {
            action.dataType = CommonUtils.subsql(command, context.dataType())
        }

        if (context.commentSpec() != null) {
            action.comment = CommonUtils.cleanQuote(context.commentSpec().stringLit().text)
        }

        if (context.colPosition() != null) {
            if (context.colPosition().FIRST() != null) {
                action.position = "first"
            } else if (context.colPosition().AFTER() != null) {
                action.position = "after"
                action.afterCol = context.colPosition().afterCol.text
            }
        }

        if (context.setOrDrop != null) {
            if (StringUtils.containsAnyIgnoreCase(context.setOrDrop.text, "drop")) {
                action.setOrDrop = "DROP";
            } else {
                action.setOrDrop = "SET";
            }

            if (context.NOT() != null) {
                action.nullable = false
            }
        }

        if (context.defaultExpression() != null) {
            val expr = context.defaultExpression().expression()
            action.defaultExpression = CommonUtils.cleanQuote(CommonUtils.subsql(command, expr))
        }

        if (context.dropDefault != null) {
            action.dropDefault = true;
        }

        return action
    }

    /**
     * 表列支持数据类型
     */
    private fun checkColumnDataType(dataType: String): Boolean {
        if (StringUtils.startsWithIgnoreCase(dataType, "decimal")) {
            return true
        }

        return when (dataType.lowercase()) {
            "string", "int", "bigint", "double", "date", "timestamp", "boolean" -> true
            else -> throw IllegalStateException("不支持数据类型：" + dataType)
        }
    }

    /**
     * 分区支持数据类型
     */
    private fun checkPartitionDataType(dataType: String): Boolean {
        return when (dataType.lowercase()) {
            "string", "int", "bigint" -> true
            else -> throw IllegalStateException("不支持数据类型：" + dataType)
        }
    }

    private fun parseOptions(ctx: PropertyListContext?): HashMap<String, String> {
        val properties = HashMap<String, String>()
        if (ctx != null) {
            ctx.property().forEach { item ->
                val property = item as SparkSqlParser.PropertyContext
                val key = CommonUtils.cleanQuote(property.key.text)
                val value = CommonUtils.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        return properties
    }

    private fun parsePartitionSpec(ctx: PartitionSpecContext?): LinkedHashMap<String, String> {
        val partitions: LinkedHashMap<String, String> = LinkedHashMap()
        if (ctx != null) {
            ctx.partitionVal().forEach {
                if (it.childCount == 1) {
                    partitions.put(it.identifier().text, "__dynamic__")
                } else {
                    var value = it.getChild(2).text
                    value = CommonUtils.cleanQuote(value)
                    partitions.put(it.identifier().text, value)
                }
            }
        }
        return partitions
    }

    private fun parseColumRefs(columns: SparkSqlParser.IdentifierCommentListContext?): List<ColumnRel>? {
        var columnNameList: List<ColumnRel>? = null
        if (columns != null) {
            columnNameList = columns.identifierComment().map {
                val name = CommonUtils.cleanQuote(it.identifier().text)
                val commentText: String? = if (it.commentSpec() != null)
                    CommonUtils.cleanQuote(it.commentSpec().stringLit().text) else null;
                ColumnRel(name, comment = commentText)
            }
        }

        return columnNameList
    }
}
