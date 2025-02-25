package io.github.melin.superior.parser.spark

import com.github.melin.superior.sql.parser.util.CommonUtils
import com.google.common.collect.Lists
import io.github.melin.superior.common.AlterActionType
import io.github.melin.superior.common.AlterActionType.*
import io.github.melin.superior.common.SQLParserException
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.TableType
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.alter.*
import io.github.melin.superior.common.relational.common.*
import io.github.melin.superior.common.relational.create.*
import io.github.melin.superior.common.relational.delta.OptimizeTable
import io.github.melin.superior.common.relational.delta.VacuumTable
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.common.relational.drop.DropDatabase
import io.github.melin.superior.common.relational.drop.DropFunction
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.common.relational.drop.DropView
import io.github.melin.superior.common.relational.io.ExportTable
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.common.relational.table.RepairTable
import io.github.melin.superior.common.relational.table.TruncateTable
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.*
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParserBaseVisitor
import io.github.melin.superior.parser.spark.relational.*
import java.util.LinkedList
import java.util.regex.Pattern
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils

class SparkSqlAntlr4Visitor(val splitSql: Boolean = false, val command: String?) :
    SparkSqlParserBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var currentAlterActionType: AlterActionType = UNKOWN
    private var multiInsertToken: String? = null

    private var limit: Int? = null
    private var offset: Int? = null
    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var outputTables: ArrayList<TableId> = arrayListOf()
    private var inCte = false

    private var cteTempTables: ArrayList<TableId> = arrayListOf()
    private var functionNames: HashSet<FunctionId> = hashSetOf()

    private var rows: ArrayList<List<String>> = ArrayList()

    private var insertSql: Boolean = false

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

    override fun visitCompoundOrSingleStatements(ctx: CompoundOrSingleStatementsContext): Statement? {
        ctx.compoundOrSingleStatement().forEach {
            if (it is CompoundOrSingleStatementContext && it.singleStatement() != null) {
                val singleStatement = it.singleStatement()
                val sql = CommonUtils.subsql(command, singleStatement)
                if (splitSql) {
                    sqls.add(sql)
                } else {
                    val startNode = singleStatement.start.text
                    val statement =
                        if (StringUtils.equalsIgnoreCase("show", startNode)) {
                            val keyWords: ArrayList<String> = arrayListOf()
                            CommonUtils.findShowStatementKeyWord(keyWords, singleStatement)
                            ShowStatement(*keyWords.toTypedArray())
                        } else {
                            var statement = this.visitSingleStatement(singleStatement)
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
        inCte = false
        cteTempTables = arrayListOf()
        functionNames = hashSetOf()

        rows = arrayListOf()

        insertSql = false
    }

    override fun visitSingleStatement(ctx: SingleStatementContext): Statement? {
        val statement = super.visitSingleStatement(ctx)

        if (statement == null) {
            throw SQLParserException("不支持的SQL: " + command)
        }
        return statement
    }

    fun parseNamespace(ctx: IdentifierReferenceContext): Pair<String?, String> {
        if (ctx.multipartIdentifier() == null) {
            throw IllegalAccessException("not support: " + CommonUtils.subsql(command, ctx))
        } else {
            return parseNamespace(ctx.multipartIdentifier())
        }
    }

    fun parseNamespace(ctx: MultipartIdentifierContext): Pair<String?, String> {
        return if (ctx.parts.size == 2) {
            Pair(ctx.parts.get(0).text, ctx.parts.get(1).text)
        } else if (ctx.parts.size == 1) {
            Pair(null, ctx.parts.get(0).text)
        } else {
            throw SQLParserException("parse multipart error: " + ctx.parts.size)
        }
    }

    fun parseTableName(ctx: IdentifierReferenceContext): TableId {
        if (ctx.multipartIdentifier() == null) {
            throw IllegalAccessException("not support: " + CommonUtils.subsql(command, ctx))
        } else {
            return parseTableName(ctx.multipartIdentifier())
        }
    }

    fun parseTableName(ctx: MultipartIdentifierContext): TableId {
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

    fun parseFunctionName(ctx: MultipartIdentifierContext): FunctionId {
        return if (ctx.parts.size == 3) {
            FunctionId(ctx.parts.get(0).text, ctx.parts.get(1).text, ctx.parts.get(2).text)
        } else if (ctx.parts.size == 2) {
            FunctionId(null, ctx.parts.get(0).text, ctx.parts.get(1).text)
        } else if (ctx.parts.size == 1) {
            FunctionId(null, null, ctx.parts.get(0).text)
        } else {
            throw SQLParserException("parse multipart error: " + ctx.parts.size)
        }
    }

    fun parseIdentifier(ctx: List<IdentifierContext>): String {
        return ctx.map { iden -> iden.text }.joinToString(",")
    }

    // -----------------------------------database-------------------------------------------------

    override fun visitCreateNamespace(ctx: CreateNamespaceContext): Statement {
        var location: String = ""
        if (ctx.locationSpec().size > 0) {
            location = ctx.locationSpec().get(0).stringLit().text
            location = CommonUtils.cleanQuote(location)
        }
        val type = ctx.namespace().text.uppercase()

        if (StringUtils.equalsIgnoreCase("database", type) || StringUtils.equalsIgnoreCase("schema", type)) {

            val (catalogName, databaseName) = parseNamespace(ctx.identifierReference())
            return CreateDatabase(catalogName, databaseName, location)
        } else {
            throw RuntimeException("not support: " + type)
        }
    }

    override fun visitDropNamespace(ctx: DropNamespaceContext): Statement {
        val type = ctx.namespace().text.uppercase()
        if (StringUtils.equalsIgnoreCase("database", type) || StringUtils.equalsIgnoreCase("schema", type)) {

            val (catalogName, databaseName) = parseNamespace(ctx.identifierReference())
            return DropDatabase(catalogName, databaseName)
        } else {
            throw RuntimeException("not support: " + type)
        }
    }

    // -----------------------------------table-------------------------------------------------
    override fun visitCreateTable(ctx: CreateTableContext): Statement {
        val tableId = parseTableName(ctx.createTableHeader().identifierReference())
        return createTable(
            tableId,
            false,
            ctx.createTableHeader().TEMPORARY() != null,
            ctx.createTableHeader().EXTERNAL() != null,
            ctx.createTableHeader().IF() != null,
            ctx.colDefinitionList(),
            ctx.createTableClauses(),
            ctx.tableProvider(),
            ctx.query(),
        )
    }

    override fun visitReplaceTable(ctx: ReplaceTableContext): Statement {
        val tableId = parseTableName(ctx.replaceTableHeader().identifierReference())
        return createTable(
            tableId,
            true,
            false,
            false,
            false,
            ctx.colDefinitionList(),
            ctx.createTableClauses(),
            ctx.tableProvider(),
            ctx.query(),
        )
    }

    private fun createTable(
        tableId: TableId,
        replace: Boolean,
        temporary: Boolean,
        external: Boolean,
        ifNotExists: Boolean,
        colDefinitionList: ColDefinitionListContext?,
        createTableClauses: CreateTableClausesContext,
        tableProvider: TableProviderContext?,
        query: QueryContext?,
    ): Statement {

        val comment =
            if (createTableClauses.commentSpec().size > 0)
                CommonUtils.cleanQuote(createTableClauses.commentSpec(0).stringLit().text)
            else null
        val lifeCycle = createTableClauses.lifecycle?.text?.toInt()

        var partitionColumnRels: List<ColumnRel>? = null
        val partitionColumnNames: ArrayList<String> = arrayListOf()
        var columnRels: List<ColumnRel>? = null
        var modelType = "hive"
        if (query == null) {
            columnRels =
                colDefinitionList?.colDefinition()?.map {
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
                        .filter { it is PartitionTransformContext }
                        .forEach { item ->
                            val column = item as PartitionTransformContext
                            partitionColumnNames.add(column.text)
                        }

                    if (partitionColumnNames.size == 0) {
                        throw SQLParserException("spark create table 语法创建表，创建分区字段语法错误，请参考文档")
                    }
                } else {
                    partitionColumnRels =
                        createTableClauses.partitioning.children
                            .filter { it is PartitionColumnContext }
                            .map { item ->
                                val column = item as PartitionColumnContext
                                val colName = column.colType().colName.text
                                // primitiveDataType
                                val dataType = column.colType().dataType().getChild(0).text
                                checkPartitionDataType(dataType)

                                partitionColumnNames.add(colName)
                                val colComment =
                                    if (column.colType().commentSpec() != null)
                                        CommonUtils.cleanQuote(column.colType().commentSpec().stringLit().text)
                                    else null
                                ColumnRel(colName, dataType, colComment)
                            }
                }
            }
        } else {
            if (createTableClauses.partitioning != null) {
                createTableClauses.partitioning.children
                    .filter { it is PartitionTransformContext }
                    .forEach { item ->
                        val column = item as PartitionTransformContext
                        partitionColumnNames.add(column.text)
                    }
            }
        }

        val properties = HashMap<String, String>()
        val options = HashMap<String, String>()
        if (createTableClauses.tableProps != null) {
            createTableClauses.tableProps.children
                .filter { it is PropertyContext }
                .forEach { item ->
                    val property = item as PropertyContext
                    val key = CommonUtils.cleanQuote(property.key.text)
                    val value = CommonUtils.cleanQuote(property.value.text)
                    properties.put(key, value)
                }
        } else if (createTableClauses.options != null) {
            createTableClauses.options.children
                .filter { it is ExpressionPropertyContext }
                .forEach { item ->
                    val property = item as ExpressionPropertyContext
                    val key = CommonUtils.cleanQuote(property.key.text)
                    val value = CommonUtils.cleanQuote(property.value.text)
                    options.put(key, value)
                }
        }

        var fileFormat = tableProvider?.multipartIdentifier()?.text
        var storageHandler: String? = null
        createTableClauses.createFileFormat()
        if (createTableClauses.createFileFormat().size == 1) {
            val createFileFormatContext = createTableClauses.createFileFormat().get(0)
            if (createFileFormatContext.fileFormat() != null) {
                fileFormat = createFileFormatContext.fileFormat().text
            } else if (createFileFormatContext.storageHandler() != null) {
                storageHandler = createFileFormatContext.storageHandler().stringLit().STRING_LITERAL().text
                storageHandler = CommonUtils.cleanQuote(storageHandler)
            }
        }

        if (query != null) {
            currentOptType = StatementType.CREATE_TABLE_AS_SELECT
            val queryStmt = parseQuery(query)

            val createTable =
                CreateTableAsSelect(
                    tableId,
                    queryStmt,
                    comment,
                    lifeCycle,
                    partitionColumnRels,
                    columnRels,
                    properties,
                    fileFormat,
                    ifNotExists,
                )
            createTable.modelType = modelType
            createTable.replace = replace
            createTable.options = options
            createTable.storageHandler = storageHandler

            if (partitionColumnNames.size > 0) {
                createTable.partitionColumnNames.addAll(partitionColumnNames)
                createTable.partitionType = PartitionType.LIST
            }
            return createTable
        } else {
            currentOptType = StatementType.CREATE_TABLE
            val createTable =
                CreateTable(
                    tableId,
                    TableType.HIVE,
                    comment,
                    lifeCycle,
                    partitionColumnRels,
                    columnRels,
                    properties,
                    fileFormat,
                    ifNotExists,
                )
            createTable.modelType = modelType
            createTable.options = options
            createTable.replace = replace
            createTable.external = external
            createTable.temporary = temporary
            createTable.storageHandler = storageHandler

            if (createTableClauses.locationSpec().size > 0) {
                createTable.location = createTableClauses.locationSpec().get(0).text
            }

            if (partitionColumnNames.size > 0) {
                createTable.partitionColumnNames.addAll(partitionColumnNames)
                createTable.partitionType = PartitionType.LIST
            }
            return createTable
        }
    }

    override fun visitCreateTableLike(ctx: CreateTableLikeContext): Statement {
        val newDatabaseName = ctx.target.db?.text
        val newTableName = ctx.target.table.text

        val oldDatabaseName = ctx.source.db?.text
        val oldTableName = ctx.source.table.text

        val createTableLike =
            CreateTableLike(TableId(oldDatabaseName, oldTableName), TableId(newDatabaseName, newTableName))

        createTableLike.ifNotExists = ctx.errorCapturingNot() != null && ctx.errorCapturingNot().NOT() != null
        return createTableLike
    }

    override fun visitDropTable(ctx: DropTableContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())

        val dropTable = DropTable(tableId)
        dropTable.ifExists = ctx.EXISTS() != null
        return dropTable
    }

    override fun visitDropView(ctx: DropViewContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        return DropView(tableId, ctx.EXISTS() != null)
    }

    override fun visitTruncateTable(ctx: TruncateTableContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        return TruncateTable(tableId)
    }

    override fun visitRepairTable(ctx: RepairTableContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        return RepairTable(tableId)
    }

    override fun visitRenameTable(ctx: RenameTableContext): Statement {
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

    override fun visitSetTableProperties(ctx: SetTablePropertiesContext): Statement {
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

    override fun visitSetTableSerDe(ctx: SetTableSerDeContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val properties = parseOptions(ctx.propertyList())
        val action = AlterSerDeAction(properties)
        return AlterTable(tableId, action)
    }

    override fun visitAddTableColumns(ctx: AddTableColumnsContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())

        val actions =
            ctx.columns.children
                .filter { it is QualifiedColTypeWithPositionContext }
                .map { item ->
                    val column = item as QualifiedColTypeWithPositionContext
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

    override fun visitHiveChangeColumn(ctx: HiveChangeColumnContext): Statement {
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

    override fun visitRenameTableColumn(ctx: RenameTableColumnContext): Statement {
        val tableId = parseTableName(ctx.table)

        val columnName = ctx.from.text
        val newColumnName = ctx.to.text

        val action = AlterColumnAction(AlterActionType.RENAME, columnName)
        action.newColumName = newColumnName
        return AlterTable(tableId, action)
    }

    override fun visitAlterTableAlterColumn(ctx: AlterTableAlterColumnContext): Statement {
        val tableId = parseTableName(ctx.table)
        val alterTable = AlterTable(tableId)

        ctx.alterColumnSpecList().alterColumnSpec().forEach {
            val action = parseAlterColumnAction(it.alterColumnAction())
            action.columName = it.column.text
            alterTable.addAction(action)
        }

        return alterTable
    }

    override fun visitTouchTable(ctx: TouchTableContext): Statement {
        val tableId = parseTableName(ctx.table)
        val partitionVals = if (ctx.partitionSpec() != null) parsePartitionSpec(ctx.partitionSpec()) else null
        val action = AlterTouchPartitionAction(tableId, partitionVals)
        val alterTable = AlterTable(tableId, action)
        return alterTable
    }

    override fun visitDropTableColumns(ctx: DropTableColumnsContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())

        val columns = ctx.columns.multipartIdentifier().map { id -> id.text }
        val action = DropColumnAction(columns.joinToString("."))
        return AlterTable(tableId, action)
    }

    override fun visitSetTableLocation(ctx: SetTableLocationContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val location = CommonUtils.cleanQuote(ctx.locationSpec().stringLit().text)

        val action = AlterPropsAction(location)
        return AlterTable(tableId, action)
    }

    override fun visitMergeFile(ctx: MergeFileContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())

        val partitionVals = parsePartitionSpec(ctx.partitionSpec())
        val properties = parseOptions(ctx.propertyList())
        return MergeFileData(tableId, properties, partitionVals)
    }

    override fun visitRefreshTable(ctx: RefreshTableContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        return RefreshStatement(tableId)
    }

    override fun visitAnalyze(ctx: AnalyzeContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        return AnalyzeTable(listOf(tableId))
    }

    override fun visitDistCpExpr(ctx: DistCpExprContext): Statement {
        val options = parseDtOptions(ctx.options)
        val properties = parseDtOptions(ctx.properties)
        return DistCpExpr(options, properties)
    }

    override fun visitDatatunnelExpr(ctx: DatatunnelExprContext): Statement {
        val sourceType = CommonUtils.cleanQuote(ctx.sourceName.text)
        val sinkType = CommonUtils.cleanQuote(ctx.sinkName.text)

        currentOptType = StatementType.DATATUNNEL

        if (ctx.ctes() != null) {
            visitCtes(ctx.ctes())
        }

        val sourceOptions = parseDtOptions(ctx.sourceOpts)

        var transformSql: String? = null
        if (ctx.transfromSql != null) {
            transformSql = CommonUtils.cleanQuote(ctx.transfromSql.text)
        }

        val sinkOptions = parseDtOptions(ctx.sinkOpts)
        val properties = parseDtOptions(ctx.properties)

        val data = DataTunnelExpr(sourceType, sourceOptions, transformSql, sinkType, sinkOptions, properties)
        data.inputTables.addAll(inputTables)
        data.functionNames.addAll(functionNames)
        return data
    }

    override fun visitDatatunnelHelp(ctx: DatatunnelHelpContext): Statement {
        val type = if (ctx.SOURCE() != null) "source" else "sink"
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

    override fun visitCall(ctx: CallContext): Statement {
        val tableId = parseTableName(ctx.identifierReference().multipartIdentifier())
        val properties = HashMap<String, String>()
        ctx.functionArgument()
            .filter { it.namedArgumentExpression() != null }
            .forEach { item ->
                val nameArg = item.namedArgumentExpression()
                val key = CommonUtils.cleanQuote(nameArg.identifier().text)
                val value = CommonUtils.cleanQuote(nameArg.expression().text)
                properties.put(key.lowercase(), value)
            }

        return CallProcedure(ProcedureId(tableId.catalogName, tableId.schemaName, tableId.tableName), properties)
    }

    override fun visitCallHelp(ctx: CallHelpContext): Statement {
        return CallHelp("help")
    }

    override fun visitSyncTableMeta(ctx: SyncTableMetaContext): Statement {
        val syncType = ctx.dtType.text.lowercase()
        var owner: String? = null
        if (ctx.principal != null) {
            owner = ctx.principal.text
        }

        return if ("database" == syncType) {
            val source = parseNamespace(ctx.source)
            SyncDatabaseMetadata(source.first, source.second, owner)
        } else {
            val sourceTableId = parseTableName(ctx.source)
            SyncTableMetadata(sourceTableId, owner)
        }
    }

    // -----------------------------------partition-------------------------------------------------

    override fun visitAddTablePartition(ctx: AddTablePartitionContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())

        val partitions = ctx.partitionSpecLocation().map { parsePartitionSpec(it.partitionSpec()) }

        val ifNotExists = ctx.errorCapturingNot() != null && ctx.errorCapturingNot().NOT() != null

        val action = AddPartitionAction(ifNotExists, partitions)
        return AlterTable(tableId, action)
    }

    override fun visitDropTablePartitions(ctx: DropTablePartitionsContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val ifExists = ctx.EXISTS() != null
        val action = DropPartitionAction(ifExists)
        return AlterTable(tableId, action)
    }

    override fun visitRenameTablePartition(ctx: RenameTablePartitionContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val fromPartition = parsePartitionSpec(ctx.from)
        val toPartition = parsePartitionSpec(ctx.to)
        val action = RenamePartitionAction(fromPartition, toPartition)
        return AlterTable(tableId, action)
    }

    // -----------------------------------view-------------------------------------------------

    override fun visitCreateView(ctx: CreateViewContext): Statement {
        var comment: String? = null
        if (ctx.commentSpec().size > 0) {
            comment = ctx.commentSpec().get(0).stringLit().text
            comment = CommonUtils.cleanQuote(comment)
        }

        val tableId = parseTableName(ctx.identifierReference())
        val ifNotExists = ctx.errorCapturingNot() != null && ctx.errorCapturingNot().NOT() != null
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

    override fun visitCreateTempViewUsing(ctx: CreateTempViewUsingContext): Statement {
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

    override fun visitAlterViewQuery(ctx: AlterViewQueryContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val queryStmt = parseQuery(ctx.query())

        currentAlterActionType = ALTER_VIEW_QUERY
        visitQuery(ctx.query())

        val action = AlterViewAction(queryStmt)
        return AlterTable(tableId, action)
    }

    override fun visitCreateIndex(ctx: CreateIndexContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val indexName = parseIdentifier(ctx.identifier())
        val createIndex = CreateIndex(indexName)
        return AlterTable(tableId, createIndex)
    }

    override fun visitDropIndex(ctx: DropIndexContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val indexName = ctx.identifier().text
        val dropIndex = DropIndex(indexName)
        return AlterTable(tableId, dropIndex)
    }

    // -----------------------------------function-------------------------------------------------

    override fun visitCreateFunction(ctx: CreateFunctionContext): Statement {
        val functionId = parseFunctionName(ctx.identifierReference().multipartIdentifier())
        val classNmae = ctx.className.text

        var temporary = false
        var file: String? = null
        if (ctx.TEMPORARY() != null) {
            temporary = true
        } else {
            file = ctx.resource(0).stringLit().text
        }

        val replace = if (ctx.REPLACE() != null) true else false
        return CreateFunction(functionId, arrayListOf(), replace, temporary, classNmae, file)
    }

    override fun visitDropFunction(ctx: DropFunctionContext): Statement {
        val functionId = parseFunctionName(ctx.identifierReference().multipartIdentifier())
        return DropFunction(functionId)
    }

    override fun visitDescribeNamespace(ctx: DescribeNamespaceContext): Statement {
        if (ctx.namespace().NAMESPACE() != null) {
            return DescCatalog(ctx.identifierReference().multipartIdentifier().text)
        } else {
            val (catalogName, schemaName) = parseNamespace(ctx.identifierReference())
            return DescSchema(SchemaId(catalogName, schemaName))
        }
    }

    override fun visitDescribeFuncName(ctx: DescribeFuncNameContext): Statement {
        val functionId = parseFunctionName(ctx.identifierReference().multipartIdentifier())
        return DescFunction(functionId)
    }

    override fun visitDescribeQuery(ctx: DescribeQueryContext): Statement {
        val query = parseQuery(ctx.query())
        return DescQuery(query)
    }

    override fun visitDescribeRelation(ctx: DescribeRelationContext): Statement {
        val tableId = parseTableName(ctx.identifierReference().multipartIdentifier())
        return DescTable(tableId)
    }

    // -----------------------------------iceberg sql start -------------------------------------

    override fun visitAddPartitionField(ctx: AddPartitionFieldContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        return AlterTable(tableId, AlterTableAction(ADD_PARTITION_FIELD))
    }

    override fun visitDropPartitionField(ctx: DropPartitionFieldContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        return AlterTable(tableId, AlterTableAction(DROP_PARTITION_FIELD))
    }

    override fun visitReplacePartitionField(ctx: ReplacePartitionFieldContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        return AlterTable(tableId, AlterTableAction(REPLACE_PARTITION_FIELD))
    }

    override fun visitSetWriteDistributionAndOrdering(ctx: SetWriteDistributionAndOrderingContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        return AlterTable(tableId, AlterTableAction(SET_WRITE_DISTRIBUTION_AND_ORDERING))
    }

    override fun visitSetIdentifierFields(ctx: SetIdentifierFieldsContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val fields = ctx.fieldList().fields.map { field -> field.text }.toList()
        return AlterTable(tableId, AlterSetIdentifierFieldsAction(fields))
    }

    override fun visitDropIdentifierFields(ctx: DropIdentifierFieldsContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val fields = ctx.fieldList().fields.map { field -> field.text }.toList()
        return AlterTable(tableId, AlterDropIdentifierFieldsAction(fields))
    }

    override fun visitCreateOrReplaceTag(ctx: CreateOrReplaceTagContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val tagName = CommonUtils.cleanQuote(ctx.createReplaceTagClause().identifier().text)
        return AlterTable(tableId, AlterCreateTagAction(tagName))
    }

    override fun visitDropTag(ctx: DropTagContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val tagName = CommonUtils.cleanQuote(ctx.identifier().text)
        return AlterTable(tableId, AlterDropTagAction(tagName))
    }

    override fun visitCreateOrReplaceBranch(ctx: CreateOrReplaceBranchContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val branchName = CommonUtils.cleanQuote(ctx.createReplaceBranchClause().identifier().text)
        return AlterTable(tableId, AlterCreateBranchAction(branchName))
    }

    override fun visitDropBranch(ctx: DropBranchContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val branchName = CommonUtils.cleanQuote(ctx.identifier().text)
        return AlterTable(tableId, AlterDropBranchAction(branchName))
    }

    // -----------------------------------iceberg sql end -------------------------------------

    // -----------------------------------delta sql start -------------------------------------

    override fun visitVacuumTable(ctx: VacuumTableContext): Statement {
        val tableId = parseTableName(ctx.table)
        return VacuumTable(tableId)
    }

    override fun visitOptimizeTable(ctx: OptimizeTableContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        return OptimizeTable(tableId)
    }

    override fun visitDescribeDeltaDetail(ctx: DescribeDeltaDetailContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        return DescDeltaDetail(tableId)
    }

    override fun visitDescribeDeltaHistory(ctx: DescribeDeltaHistoryContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())

        if (ctx.limit != null) {
            return DescDeltaHistory(tableId, ctx.limit.text.toInt())
        } else {
            return DescDeltaHistory(tableId)
        }
    }

    override fun visitAddTableConstraint(ctx: AddTableConstraintContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        return AlterTable(tableId, AlterAddConstraintAction())
    }

    override fun visitDropTableConstraint(ctx: DropTableConstraintContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        return AlterTable(tableId, AlterDropConstraintAction())
    }

    override fun visitAlterTableDropFeature(ctx: AlterTableDropFeatureContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        return AlterTable(tableId, AlterDropFeatureAction())
    }

    override fun visitAlterTableClusterBy(ctx: AlterTableClusterByContext): Statement {
        val tableId = parseTableName(ctx.multipartIdentifier())
        return AlterTable(tableId, AlterClusterByAction())
    }

    override fun visitAlterTableSyncIdentity(ctx: AlterTableSyncIdentityContext): Statement {
        val tableId = parseTableName(ctx.table)
        return AlterTable(tableId, AlterSyncIdentityAction())
    }

    // -----------------------------------delta sql start -------------------------------------

    // -----------------------------------cache-------------------------------------------------

    override fun visitCacheTable(ctx: CacheTableContext): Statement {
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

    override fun visitUncacheTable(ctx: UncacheTableContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        return UnCacheTable(tableId)
    }

    override fun visitClearCache(ctx: ClearCacheContext?): Statement {
        return DefaultStatement(StatementType.CLEAR_CACHE)
    }

    // -----------------------------------other-------------------------------------------------

    override fun visitExplain(ctx: ExplainContext?): Statement {
        return DefaultStatement(StatementType.EXPLAIN)
    }

    override fun visitCreateFileView(ctx: CreateFileViewContext): Statement {
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

    override fun visitLoadData(ctx: LoadDataContext): Statement {
        val tableId = parseTableName(ctx.identifierReference())
        val path = CommonUtils.cleanQuote(ctx.path.text)
        val local: Boolean = ctx.LOCAL() != null
        val mode: InsertMode = if (ctx.OVERWRITE() != null) InsertMode.OVERWRITE else InsertMode.INTO
        val partitionVals = parsePartitionSpec(ctx.partitionSpec())
        return LoadData(tableId, path, local, partitionVals, mode)
    }

    override fun visitExportTable(ctx: ExportTableContext): Statement {
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

        val exportTable =
            ExportTable(
                tableId,
                filePath,
                properties,
                partitionVals,
                fileFormat,
                compression,
                maxFileSize,
                overwrite,
                single,
                inputTables,
            )

        exportTable.functionNames.addAll(functionNames)
        return exportTable
    }

    override fun visitUse(ctx: UseContext): Statement {
        val (catalogName, databaseName) = parseNamespace(ctx.identifierReference())
        return UseDatabase(catalogName, databaseName)
    }

    override fun visitUseNamespace(ctx: UseNamespaceContext): Statement {
        val type = ctx.namespace().text.uppercase()

        if (StringUtils.equalsIgnoreCase("database", type) || StringUtils.equalsIgnoreCase("schema", type)) {

            val (catalogName, databaseName) = parseNamespace(ctx.identifierReference())
            return UseDatabase(catalogName, databaseName)
        } else if (StringUtils.equalsIgnoreCase("namespace", type)) {
            return UseCatalog(ctx.identifierReference().text)
        } else {
            throw RuntimeException("not support: " + type)
        }
    }

    override fun visitSetConfiguration(ctx: SetConfigurationContext): Statement {
        val conf = StringUtils.substring(ctx.text, 3)

        val key =
            if (StringUtils.contains(conf, "=")) {
                StringUtils.substringBefore(conf, "=")
            } else {
                conf
            }

        val value: String? =
            if (StringUtils.contains(conf, "=")) {
                CommonUtils.cleanQuote(StringUtils.substringAfter(conf, "="))
            } else {
                null
            }

        return SetStatement(key, value)
    }

    override fun visitSetQuotedConfiguration(ctx: SetQuotedConfigurationContext): Statement {
        assert(ctx.configValue() != null)
        if (ctx.configKey() != null) {
            val key = CommonUtils.cleanQuote(ctx.configKey().getText())
            val value = CommonUtils.cleanQuote(ctx.configValue().getText())
            return SetStatement(key, value)
        } else {
            throw SQLParserException("not support" + CommonUtils.subsql(command, ctx))
        }
    }

    override fun visitResetConfiguration(ctx: ResetConfigurationContext): Statement {
        val key = StringUtils.trim(CommonUtils.subsql(command, ctx.RESET().symbol, ctx.stop))

        return ReSetStatement(key)
    }

    // -----------------------------------insert &
    // query-------------------------------------------------

    override fun visitStatementDefault(ctx: StatementDefaultContext): Statement? {
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

    override fun visitDmlStatement(ctx: DmlStatementContext): Statement? {
        currentOptType = StatementType.INSERT
        val node =
            if (ctx.ctes() != null) {
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

            node.multiInsertQueryBody().forEach { this.visitMultiInsertQueryBody(it) }
            val insertTable = InsertTable(InsertMode.OVERWRITE, queryStmt, outputTables.first())
            insertTable.outputTables.addAll(outputTables.subList(1, outputTables.size))
            return insertTable
        } else if (node is UpdateTableContext || node is DeleteFromTableContext || node is MergeIntoTableContext) {
            return super.visitDmlStatement(ctx)
        } else {
            return null
        }
    }

    private fun parseInsertInto(ctx: InsertIntoContext, queryStmt: QueryStmt): InsertTable {
        return if (ctx is InsertIntoTableContext) {
            val tableId = parseTableName(ctx.identifierReference())
            val partitionVals = parsePartitionSpec(ctx.partitionSpec())
            var columnNameList: List<ColumnRel>? = null
            if (ctx.identifierList() != null) {
                columnNameList =
                    ctx.identifierList().identifierSeq().ident.map { ColumnRel(CommonUtils.cleanQuote(it.text)) }
            }
            val stmt = InsertTable(InsertMode.INTO, queryStmt, tableId, columnNameList)
            stmt.partitionVals = partitionVals
            stmt
        } else if (ctx is InsertOverwriteTableContext) {
            val tableId = parseTableName(ctx.identifierReference())
            val partitionVals = parsePartitionSpec(ctx.partitionSpec())
            var columnNameList: List<ColumnRel>? = null
            if (ctx.identifierList() != null) {
                columnNameList =
                    ctx.identifierList().identifierSeq().ident.map { ColumnRel(CommonUtils.cleanQuote(it.text)) }
            }
            val stmt = InsertTable(InsertMode.OVERWRITE, queryStmt, tableId, columnNameList)
            stmt.partitionVals = partitionVals
            stmt
        } else if (ctx is InsertIntoReplaceWhereContext) {
            val tableId = parseTableName(ctx.identifierReference())
            InsertTable(InsertMode.INTO_REPLACE, queryStmt, tableId)
        } else if (ctx is InsertOverwriteDirContext) {
            val path = if (ctx.path != null) CommonUtils.cleanQuote(ctx.path.STRING_LITERAL().text) else ""
            val properties = parseOptions(ctx.propertyList())
            val fileFormat = ctx.tableProvider().multipartIdentifier().text

            val stmt = InsertTable(InsertMode.OVERWRITE_DIR, queryStmt, TableId(path))
            stmt.properties = properties
            stmt.fileFormat = fileFormat
            stmt
        } else if (ctx is InsertOverwriteHiveDirContext) {
            val path = CommonUtils.cleanQuote(ctx.path.STRING_LITERAL().text)
            val stmt = InsertTable(InsertMode.OVERWRITE_HIVE_DIR, queryStmt, TableId(path))
            stmt
        } else {
            throw SQLParserException("not support insert into sql")
        }
    }

    // -----------------------------------delta sql-------------------------------------------------

    override fun visitDeleteFromTable(ctx: DeleteFromTableContext): Statement {
        currentOptType = StatementType.DELETE
        val tableId = parseTableName(ctx.identifierReference())
        super.visitWhereClause(ctx.whereClause())

        return DeleteTable(tableId, inputTables)
    }

    override fun visitUpdateTable(ctx: UpdateTableContext): Statement {
        currentOptType = StatementType.UPDATE
        val tableId = parseTableName(ctx.identifierReference())
        if (ctx.whereClause() != null) {
            super.visitWhereClause(ctx.whereClause())
        }

        return UpdateTable(tableId, inputTables)
    }

    override fun visitMergeIntoTable(ctx: MergeIntoTableContext): Statement {
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

    override fun visitManageResource(ctx: ManageResourceContext): Statement {
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

    // -----------------------------------private
    // method-------------------------------------------------

    override fun visitFunctionCall(ctx: FunctionCallContext): Statement? {
        val functionId = parseFunctionName(ctx.functionName())
        if (functionId != null) {
            val args = ctx.functionArgument().map { CommonUtils.cleanQuote(it.text) }.toList()
            functionId.functionArguments = args
            functionNames.add(functionId)
        }

        return super.visitFunctionCall(ctx)
    }

    override fun visitFunctionTable(ctx: FunctionTableContext): Statement? {
        val functionId = parseFunctionName(ctx.functionName())
        if (functionId != null) {
            val args = ctx.functionTableArgument().map { CommonUtils.cleanQuote(it.text) }.toList()
            functionId.functionArguments = args
            functionId.funcType = "TVF"
            functionNames.add(functionId)
        }

        return super.visitFunctionTable(ctx)
    }

    private fun parseFunctionName(ctx: FunctionNameContext): FunctionId? {
        if (
            StatementType.SELECT == currentOptType ||
                StatementType.CREATE_VIEW == currentOptType ||
                StatementType.INSERT == currentOptType ||
                StatementType.CREATE_TABLE_AS_SELECT == currentOptType ||
                StatementType.MERGE == currentOptType ||
                StatementType.EXPORT_TABLE == currentOptType ||
                StatementType.DATATUNNEL == currentOptType
        ) {

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
        return null
    }

    override fun visitCtes(ctx: CtesContext): Statement? {
        inCte = true
        ctx.namedQuery().forEach {
            cteTempTables.add(TableId(it.name.text))
            this.visitQuery(it.query())
        }
        inCte = false
        return null
    }

    override fun visitMultipartIdentifier(ctx: MultipartIdentifierContext): Statement? {
        val tableId = parseTableName(ctx)
        if (
            currentOptType == StatementType.CREATE_TABLE_AS_SELECT ||
                currentOptType == StatementType.SELECT ||
                currentOptType == StatementType.CREATE_VIEW ||
                currentOptType == StatementType.INSERT ||
                currentOptType == StatementType.MERGE ||
                currentOptType == StatementType.EXPORT_TABLE ||
                currentOptType == StatementType.DATATUNNEL ||
                currentOptType == StatementType.UPDATE ||
                currentOptType == StatementType.DELETE ||
                currentAlterActionType == ALTER_VIEW_QUERY
        ) {

            // 别名和表名一样的场景
            if (inCte && cteTempTables.last() == tableId) {
                cteTempTables.remove(tableId)
            }

            if (!inputTables.contains(tableId) && !cteTempTables.contains(tableId)) {
                inputTables.add(tableId)
            }
        }
        return null
    }

    override fun visitRowConstructor(ctx: RowConstructorContext): Statement? {
        val row =
            ctx.children
                .filter { it is NamedExpressionContext }
                .map {
                    var text = it.text
                    text = CommonUtils.cleanQuote(text)
                    text
                }
                .toList()

        rows.add(row)
        return null
    }

    override fun visitParenthesizedExpression(ctx: ParenthesizedExpressionContext): Statement? {
        val row =
            ctx.children
                .filter { it is ExpressionContext }
                .map {
                    var text = it.text
                    text = CommonUtils.cleanQuote(text)
                    text
                }
                .toList()

        rows.add(row)
        return null
    }

    override fun visitFromClause(ctx: FromClauseContext): Statement? {
        multiInsertToken = "from"
        return super.visitFromClause(ctx)
    }

    override fun visitMultiInsertQueryBody(ctx: MultiInsertQueryBodyContext): Statement? {
        multiInsertToken = "insert"
        val obj = ctx.insertInto()
        if (obj is InsertOverwriteTableContext) {
            val multipartIdentifier = obj.identifierReference()
            val tableId = parseTableName(multipartIdentifier)
            outputTables.add(tableId)
        } else if (obj is InsertIntoTableContext) {
            val multipartIdentifier = obj.identifierReference()
            val tableId = parseTableName(multipartIdentifier)
            outputTables.add(tableId)
        }
        return null
    }

    override fun visitQueryOrganization(ctx: QueryOrganizationContext): Statement? {
        limit = ctx.limit?.text?.toInt()
        offset = ctx.offset?.text?.toInt()
        return super.visitQueryOrganization(ctx)
    }

    override fun visitTypeConstructor(ctx: TypeConstructorContext): Statement? {
        val valueType = ctx.literalType().getText().uppercase()
        if (
            !("DATE".equals(valueType) ||
                "TIME".equals(valueType) ||
                "TIMESTAMP".equals(valueType) ||
                "INTERVAL".equals(valueType) ||
                "X".equals(valueType))
        ) {
            throw SQLParserException("Literals of type " + valueType + " are currently not supported.")
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
                    comment = CommonUtils.cleanQuote(col.commentSpec().stringLit().text)
                }

                if (col.defaultExpression() != null) {
                    defaultExpr =
                        StringUtils.substring(
                            command,
                            col.defaultExpression().start.startIndex,
                            col.defaultExpression().stop.stopIndex + 1,
                        )

                    if (defaultExpr != null) {
                        defaultExpr = CommonUtils.cleanQuote(defaultExpr!!)
                    }
                }
            }
        }

        return Triple(nullable, defaultExpr, comment)
    }

    private fun parseAlterColumnAction(context: AlterColumnActionContext): AlterColumnAction {
        val action = AlterColumnAction(ALTER_COLUMN)
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
                action.setOrDrop = "DROP"
            } else {
                action.setOrDrop = "SET"
            }

            if (context.errorCapturingNot().NOT() != null) {
                action.nullable = false
            }
        }

        if (context.defaultExpression() != null) {
            val expr = context.defaultExpression().expression()
            action.defaultExpression = CommonUtils.cleanQuote(CommonUtils.subsql(command, expr))
        }

        if (context.dropDefault != null) {
            action.dropDefault = true
        }

        return action
    }

    /** 表列支持数据类型 */
    private fun checkColumnDataType(dataType: String): Boolean {
        if (StringUtils.startsWithIgnoreCase(dataType, "decimal")) {
            return true
        }

        return when (dataType.lowercase()) {
            "string",
            "int",
            "bigint",
            "double",
            "date",
            "timestamp",
            "boolean" -> true
            else -> throw IllegalStateException("不支持数据类型：" + dataType)
        }
    }

    /** 分区支持数据类型 */
    private fun checkPartitionDataType(dataType: String): Boolean {
        return when (dataType.lowercase()) {
            "string",
            "int",
            "bigint",
            "varchar",
            "char" -> true
            else -> throw IllegalStateException("不支持数据类型：" + dataType)
        }
    }

    private fun parseOptions(ctx: PropertyListContext?): HashMap<String, String> {
        val properties = HashMap<String, String>()
        if (ctx != null) {
            ctx.property().forEach { item ->
                val property = item as PropertyContext
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

    private fun parseHints(hints: List<HintContext>): LinkedHashMap<String, LinkedList<String>> {
        val partitions: LinkedHashMap<String, LinkedList<String>> = LinkedHashMap()
        hints.forEach {
            it.hintStatements.forEach {
                if (it.parameters == null || it.parameters.size == 0) {
                    partitions.put(it.hintName.text, Lists.newLinkedList())
                } else {
                    val parameters = Lists.newLinkedList<String>()
                    it.parameters.forEach { parameters.add(CommonUtils.subsql(command, it)) }
                    partitions.put(it.hintName.text, parameters)
                }
            }
        }
        return partitions
    }

    private fun parseColumRefs(columns: IdentifierCommentListContext?): List<ColumnRel>? {
        var columnNameList: List<ColumnRel>? = null
        if (columns != null) {
            columnNameList =
                columns.identifierComment().map {
                    val name = CommonUtils.cleanQuote(it.identifier().text)
                    val commentText: String? =
                        if (it.commentSpec() != null) CommonUtils.cleanQuote(it.commentSpec().stringLit().text)
                        else null
                    ColumnRel(name, comment = commentText)
                }
        }

        return columnNameList
    }
}
