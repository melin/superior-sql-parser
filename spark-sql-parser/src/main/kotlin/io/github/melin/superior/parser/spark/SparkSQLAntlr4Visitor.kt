package io.github.melin.superior.parser.spark

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.*
import io.github.melin.superior.common.AlterType.*
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.function.CreateFunction
import io.github.melin.superior.common.relational.function.DropFunction
import io.github.melin.superior.common.relational.namespace.CreateNamespace
import io.github.melin.superior.common.relational.namespace.DropNamespace
import io.github.melin.superior.common.relational.namespace.Namespace
import io.github.melin.superior.common.relational.namespace.UseNamespace
import io.github.melin.superior.common.relational.view.CreateView
import io.github.melin.superior.common.relational.view.DropView
import io.github.melin.superior.common.relational.table.*
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.AlterColumnActionContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.ColDefinitionOptionContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.CreateOrReplaceTableColTypeListContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.CreateTableClausesContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.PartitionSpecContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.PropertyListContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.QueryContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.TableProviderContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParserBaseVisitor
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class SparkSQLAntlr4Visitor : SparkSqlParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var currentAlterType: AlterType = AlterType.UNKOWN
    private val tableLineage = TableLineage()
    private var multiInsertToken: String? = null
    private var limit: Int? = null
    private var command: String? = null
    private var insertMode: InsertMode = InsertMode.OVERWRITE
    private var querySql: String? = null
    private var values: ArrayList<List<String>> = ArrayList()
    private var singleValues: ArrayList<List<String>> = ArrayList()
    private var partitions: LinkedHashMap<String, String> = LinkedHashMap()

    private var insertSql: Boolean = false;
    private var isCTE: Boolean = false;

    override fun shouldVisitNextChild(node: RuleNode, currentResult: StatementData?): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitSingleStatement(ctx: SparkSqlParser.SingleStatementContext): StatementData {
        val data = super.visitSingleStatement(ctx)

        if (data == null) {
            val startToken = StringUtils.lowerCase(ctx.getStart().text)
            if ("show".equals(startToken)) {
                return StatementData(StatementType.SHOW)
            } else if ("desc".equals(startToken) || "describe".equals(startToken)) {
                return StatementData(StatementType.DESC)
            } else {
                throw SQLParserException("不支持的SQL: " + command)
            }
        }

        return data
    }

    fun setCommand(command: String) {
        this.command = command
    }

    fun parseNamespace(ctx: SparkSqlParser.MultipartIdentifierContext): NamespaceId {
        if (ctx.parts.size == 2) {
            return NamespaceId(ctx.parts.get(0).text, ctx.parts.get(1).text)
        } else if (ctx.parts.size == 1) {
            return NamespaceId(null, ctx.parts.get(0).text)
        } else {
            throw SQLParserException("parse multipart error: " + ctx.parts.size)
        }
    }

    fun parseTableName(ctx: SparkSqlParser.MultipartIdentifierContext): TableId {
        if (ctx.parts.size == 4) {
            return TableId(ctx.parts.get(0).text, ctx.parts.get(1).text, ctx.parts.get(2).text, ctx.parts.get(3).text)
        } else if (ctx.parts.size == 3) {
            return TableId(ctx.parts.get(0).text, ctx.parts.get(1).text, ctx.parts.get(2).text)
        } else if (ctx.parts.size == 2) {
            return TableId(null, ctx.parts.get(0).text, ctx.parts.get(1).text)
        } else if (ctx.parts.size == 1) {
            return TableId(null, null, ctx.parts.get(0).text)
        } else {
            throw SQLParserException("parse multipart error: " + ctx.parts.size)
        }
    }

    //-----------------------------------database-------------------------------------------------

    override fun visitCreateNamespace(ctx: SparkSqlParser.CreateNamespaceContext): StatementData {
        val schemaId = parseNamespace(ctx.multipartIdentifier())
        var location: String = ""
        if (ctx.locationSpec().size > 0) {
            location = ctx.locationSpec().get(0).stringLit().text
            location = StringUtil.cleanQuote(location)
        }
        val type = ctx.namespace().text.uppercase()

        val createNamespace = CreateNamespace(schemaId, Namespace.valueOf(type), location)
        return StatementData(StatementType.CREATE_NAMESPACE, createNamespace)
    }

    override fun visitDropNamespace(ctx: SparkSqlParser.DropNamespaceContext): StatementData {
        val schemaId = parseNamespace(ctx.multipartIdentifier())
        val type = ctx.namespace().text.uppercase()
        val dropNamespace = DropNamespace(schemaId, Namespace.valueOf(type))
        return StatementData(StatementType.DROP_NAMESPACE, dropNamespace)
    }

    //-----------------------------------table-------------------------------------------------
    override fun visitCreateTable(ctx: SparkSqlParser.CreateTableContext): StatementData {
        val tableId = parseTableName(ctx.createTableHeader().multipartIdentifier())
        return createTable(tableId,
            false,
            ctx.createTableHeader().TEMPORARY() != null,
            ctx.createTableHeader().EXTERNAL() != null,
            ctx.createOrReplaceTableColTypeList(),
            ctx.createTableClauses(),
            ctx.tableProvider(),
            ctx.query())
    }


    override fun visitReplaceTable(ctx: SparkSqlParser.ReplaceTableContext): StatementData {
        val tableId = parseTableName(ctx.replaceTableHeader().multipartIdentifier())
        return createTable(tableId,
            true,
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
        createOrReplaceTableColTypeList: CreateOrReplaceTableColTypeListContext?,
        createTableClauses: CreateTableClausesContext,
        tableProvider: TableProviderContext?,
        query: QueryContext?): StatementData {

        val comment = if (createTableClauses.commentSpec().size > 0) StringUtil.cleanQuote(createTableClauses.commentSpec(0).text) else null
        val lifeCycle = createTableClauses.lifecycle?.text?.toInt()

        var partitionColumns: List<Column>? = null
        val partitionColumnNames: ArrayList<String> = arrayListOf()
        var columns: List<Column>? = null
        var createTableType = "hive"
        if (query == null) {
            columns = createOrReplaceTableColTypeList?.createOrReplaceTableColType()?.map {
                val colName = it.colName.text
                val dataType = it.dataType().text
                val (nullable, defaultExpr, colComment) = parseColDefinition(it.colDefinitionOption())
                Column(colName, dataType, colComment, nullable, defaultExpr)
            }

            if (tableProvider != null) {
                createTableType = "spark"
            }

            if (createTableClauses.partitioning != null) {
                if ("spark" == createTableType) {
                    createTableClauses.partitioning.children
                        .filter { it is SparkSqlParser.PartitionTransformContext }.forEach { item ->
                            val column = item as SparkSqlParser.PartitionTransformContext
                            partitionColumnNames.add(column.text)
                        }

                    if (partitionColumnNames.size == 0) {
                        throw SQLParserException("spark create table 语法创建表，创建分区字段语法错误，请参考文档");
                    }
                } else {
                    partitionColumns = createTableClauses.partitioning.children
                        .filter { it is SparkSqlParser.PartitionColumnContext }.map { item ->
                            val column = item as SparkSqlParser.PartitionColumnContext
                            val colName = column.colType().colName.text
                            val dataType = column.colType().dataType().text
                            checkPartitionDataType(dataType)

                            partitionColumnNames.add(colName)
                            val colComment = if (column.colType().commentSpec() != null) StringUtil.cleanQuote(column.colType().commentSpec().text) else null
                            Column(colName, dataType, colComment)
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
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
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
            val createTable = CreateTableAsSelect(tableId, comment, lifeCycle, partitionColumns, columns, properties, fileFormat)
            createTable.createTableType = createTableType;
            createTable.replace = replace

            var querySql = StringUtils.substring(command, query.start.startIndex)
            if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
                querySql = StringUtils.substringBetween(querySql, "(", ")")
            }

            createTable.querySql = querySql
            super.visitQuery(query)
            createTable.tableLineage = tableLineage
            createTable.partitionColumnNames = partitionColumnNames
            return StatementData(currentOptType, createTable, querySql)
        } else {
            currentOptType = StatementType.CREATE_TABLE
            val createTable = CreateTable(tableId, comment, lifeCycle, partitionColumns, columns, properties, fileFormat)
            createTable.createTableType = createTableType;
            createTable.replace = replace
            createTable.external = external
            createTable.temporary = temporary

            if (createTableClauses.locationSpec().size > 0) {
                createTable.location = createTableClauses.locationSpec().get(0).text
            }

            createTable.partitionColumnNames = partitionColumnNames
            return StatementData(currentOptType, createTable)
        }
    }

    override fun visitCreateTableLike(ctx: SparkSqlParser.CreateTableLikeContext): StatementData {
        val newDatabaseName = ctx.target.db?.text
        val newTableName = ctx.target.table.text

        val oldDatabaseName = ctx.source.db?.text
        val oldTableName = ctx.source.table.text

        val dcTable = CreateTableLike(oldDatabaseName, oldTableName, newDatabaseName, newTableName)
        dcTable.ifNotExists = ctx.NOT() != null

        return StatementData(StatementType.CREATE_TABLE_AS_LIKE, dcTable)
    }

    override fun visitDropTable(ctx: SparkSqlParser.DropTableContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())

        val dropTable = DropTable(tableId)
        dropTable.ifExists = ctx.EXISTS() != null
        return StatementData(StatementType.DROP_TABLE, dropTable)
    }

    override fun visitDropView(ctx: SparkSqlParser.DropViewContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val dropView = DropView(catalogName, databaseName, tableName)
        dropView.ifExists = ctx.EXISTS() != null
        return StatementData(StatementType.DROP_VIEW, dropView)
    }

    override fun visitTruncateTable(ctx: SparkSqlParser.TruncateTableContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val truncateTable = TruncateTable(tableId)
        return StatementData(StatementType.TRUNCATE_TABLE, truncateTable)
    }

    override fun visitRepairTable(ctx: SparkSqlParser.RepairTableContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val repairTable = RepairTable(tableId)
        return StatementData(StatementType.REPAIR_TABLE, repairTable)
    }

    override fun visitRenameTable(ctx: SparkSqlParser.RenameTableContext): StatementData {
        val tableId = parseTableName(ctx.from)
        val (_, _, newTableName) = parseTableName(ctx.to)

        return if (ctx.VIEW() != null) {
            val action = AlterTableAction(newTableName)
            val alterTable = AlterTable(RENAME_TABLE, tableId, action, TableType.VIEW)
            StatementData(StatementType.ALTER_TABLE, alterTable)
        } else {
            val action = AlterTableAction(newTableName)
            val alterTable = AlterTable(RENAME_TABLE, tableId, action)
            StatementData(StatementType.ALTER_TABLE, alterTable)
        }
    }

    override fun visitSetTableProperties(ctx: SparkSqlParser.SetTablePropertiesContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val properties = parseOptions(ctx.propertyList())
        val action = AlterTableAction()
        action.properties = properties

        return if (ctx.VIEW() == null) {
            val alterTable = AlterTable(SET_TABLE_PROPERTIES, tableId, action, TableType.VIEW)
            StatementData(StatementType.ALTER_TABLE, alterTable)
        } else {
            val alterTable = AlterTable(SET_TABLE_PROPERTIES, tableId, action)
            StatementData(StatementType.ALTER_TABLE, alterTable)
        }
    }

    override fun visitAddTableColumns(ctx: SparkSqlParser.AddTableColumnsContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())

        val columns = ctx.columns.children
            .filter { it is SparkSqlParser.QualifiedColTypeWithPositionContext }.map { item ->
                val column = item as SparkSqlParser.QualifiedColTypeWithPositionContext
                val columnName = column.multipartIdentifier().text
                val dataType = column.dataType().text
                val comment = if (column.commentSpec() != null) StringUtil.cleanQuote(column.commentSpec().text) else null

                var position: String? = null
                var afterCol: String? = null
                if (column.colPosition() != null) {
                    if (column.colPosition().FIRST() != null) {
                        position = "first"
                    } else if (column.colPosition().AFTER() != null) {
                        position = "after"
                        afterCol = column.colPosition().afterCol.text
                    }
                }

                AlterColumnAction(columnName, dataType, comment, position, afterCol)
            }

        val alterTable = AlterTable(ADD_COLUMN, tableId)
        alterTable.addActions(columns)
        return if ("columns" == ctx.getChild(4).text) {
            StatementData(StatementType.ALTER_TABLE, alterTable)
        } else {
            StatementData(StatementType.ALTER_TABLE, alterTable)
        }
    }

    override fun visitHiveChangeColumn(ctx: SparkSqlParser.HiveChangeColumnContext): StatementData {
        val tableId = parseTableName(ctx.table)

        val columnName = ctx.colName.parts.get(0).text
        val newColumnName = ctx.colType().colName.text
        val dataType = ctx.colType().dataType().text
        val commentNode = ctx.colType().commentSpec()?.stringLit()
        val comment = if (commentNode != null) StringUtil.cleanQuote(commentNode.text) else null

        val action = AlterColumnAction(columnName, dataType, comment)
        action.newColumName = newColumnName
        if (ctx.colPosition() != null) {
            if (ctx.colPosition().FIRST() != null) {
                action.position = "first"
            } else if (ctx.colPosition().AFTER() != null) {
                action.position = "after"
                action.afterCol = ctx.colPosition().afterCol.text
            }
        }

        val alterTable = AlterTable(ALTER_COLUMN, tableId, action)
        return StatementData(StatementType.ALTER_TABLE, alterTable)
    }

    override fun visitRenameTableColumn(ctx: SparkSqlParser.RenameTableColumnContext): StatementData {
        val tableId = parseTableName(ctx.table)

        val columnName = ctx.from.text
        val newColumnName = ctx.to.text

        val action = AlterColumnAction(columnName)
        action.newColumName = newColumnName
        val alterTable = AlterTable(RENAME_COLUMN, tableId, action)
        return StatementData(StatementType.ALTER_TABLE, alterTable)
    }

    override fun visitAlterTableAlterColumn(ctx: SparkSqlParser.AlterTableAlterColumnContext): StatementData {
        val tableId = parseTableName(ctx.table)

        val action = parseAlterColumnAction(ctx.alterColumnAction())
        action.columName = ctx.column.text
        val alterTable = AlterTable(ALTER_COLUMN, tableId, action)
        return StatementData(StatementType.ALTER_TABLE, alterTable)
    }

    override fun visitTouchTable(ctx: SparkSqlParser.TouchTableContext): StatementData {
        val tableId = parseTableName(ctx.table)
        val action = AlterTableAction()
        val alterTable = AlterTable(TOUCH_TABLE, tableId, action)
        action.partitions = if (ctx.partitionSpec() != null) parsePartitionSpec(ctx.partitionSpec()) else null
        return StatementData(StatementType.ALTER_TABLE, alterTable)
    }

    override fun visitDropTableColumns(ctx: SparkSqlParser.DropTableColumnsContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())

        val columns = ctx.columns.multipartIdentifier().map { id -> id.text }
        val action = DropColumnAction(columns)
        val alterTable = AlterTable(DROP_COLUMN, tableId, action)
        return StatementData(StatementType.ALTER_TABLE, alterTable)
    }

    override fun visitSetTableLocation(ctx: SparkSqlParser.SetTableLocationContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val location = StringUtil.cleanQuote(ctx.locationSpec().stringLit().text)

        val action = AlterTableAction()
        action.location = location
        val alterTable = AlterTable(SET_TABLE_LOCATION, tableId, action)
        return StatementData(StatementType.ALTER_TABLE, alterTable)
    }

    override fun visitMergeTable(ctx: SparkSqlParser.MergeTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val partitionVals = ctx.partitionSpec()?.partitionVal()
                ?.map { partitionValContext -> partitionValContext.text }?.toList()
        val data = MergeData(catalogName, databaseName, tableName, partitionVals)
        return StatementData(StatementType.MERGE_TABLE, data)
    }

    override fun visitRefreshTable(ctx: SparkSqlParser.RefreshTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val data = RefreshData(catalogName, databaseName, tableName)

        return StatementData(StatementType.REFRESH_TABLE, data)
    }

    override fun visitAnalyze(ctx: SparkSqlParser.AnalyzeContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val analyzeTable = AnalyzeTable(tableId)
        return StatementData(StatementType.ANALYZE_TABLE, analyzeTable)
    }

    override fun visitDtunnelExpr(ctx: SparkSqlParser.DtunnelExprContext): StatementData {
        val srcType = StringUtil.cleanQuote(ctx.srcName.text)
        val distType = StringUtil.cleanQuote(ctx.distName.text)

        currentOptType = StatementType.DATATUNNEL
        if (StringUtils.equalsIgnoreCase("with", ctx.start.text)) {
            isCTE = true
            this.visitCtes(ctx.ctes())
        }

        val srcOptions = HashMap<String, String>()
        if (ctx.readOpts != null) {
            ctx.readOpts.dtProperty().map { item ->
                val property = item as SparkSqlParser.DtPropertyContext
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
                srcOptions.put(key, value)
            }
        }

        var transformSql: String? = null
        if (ctx.transfromSql != null) {
            transformSql = StringUtil.cleanQuote(ctx.transfromSql.text)
        }

        val distOptions = HashMap<String, String>()
        if (ctx.writeOpts != null) {
            ctx.writeOpts.dtProperty().map { item ->
                val property = item as SparkSqlParser.DtPropertyContext
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
                distOptions.put(key, value)
            }
        }

        val data = DataTunnelExpr(srcType, srcOptions, transformSql, distType, distOptions, isCTE)

        data.inputTables = tableLineage.inputTables
        data.cteTempTables = tableLineage.cteTempTables
        data.functionNames = tableLineage.functionNames
        return StatementData(StatementType.DATATUNNEL, data)
    }

    override fun visitCall(ctx: SparkSqlParser.CallContext): StatementData {
        val (catalogName, namespace, procedureName) = parseTableName(ctx.multipartIdentifier())
        val data = CallExpr(catalogName, namespace, procedureName)
        return StatementData(StatementType.CALL, data)
    }

    override fun visitSync(ctx: SparkSqlParser.SyncContext): StatementData {
        val type = ctx.type.text.lowercase();
        var owner: String? = null
        if (ctx.principal != null) {
            owner = ctx.principal.text
        }
        if ("schema" == type) {
            val (_, targetSchema, targetTable) = parseTableName(ctx.target)
            val (_, sourceSchema, sourceTable) = parseTableName(ctx.source)
            val expr = SyncSchemaExpr(targetSchema, targetTable, sourceSchema, sourceTable, owner);
            return StatementData(StatementType.SYNC, expr)
        } else {
            val (targetCatalog, targetSchema, targetTable) = parseTableName(ctx.target)
            val (sourceCatalog, sourceSchema, sourceTable) = parseTableName(ctx.source)
            val expr = SyncTableExpr(targetCatalog, targetSchema, targetTable, sourceCatalog, sourceSchema, sourceTable, owner)
            return StatementData(StatementType.SYNC, expr)
        }
    }

    //-----------------------------------partition-------------------------------------------------

    override fun visitAddTablePartition(ctx: SparkSqlParser.AddTablePartitionContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())

        val partitions = ctx.partitionSpecLocation().map { parsePartitionSpec(it.partitionSpec()) }

        val ifNotExists = ctx.NOT() != null

        val action = AddPartitionAction(ifNotExists, partitions)
        val alterTable = AlterTable(ADD_PARTITION, tableId, action)
        return StatementData(StatementType.ALTER_TABLE, alterTable)
    }

    override fun visitDropTablePartitions(ctx: SparkSqlParser.DropTablePartitionsContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val partitions = ctx.partitionSpec().map { parsePartitionSpec(it) }
        val ifExists = ctx.EXISTS() != null

        val action = DropPartitionAction(ifExists, partitions)
        val alterTable = AlterTable(DROP_PARTITION, tableId, action)
        return StatementData(StatementType.ALTER_TABLE, alterTable)
    }

    override fun visitRenameTablePartition(ctx: SparkSqlParser.RenameTablePartitionContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val fromPartition = parsePartitionSpec(ctx.from)
        val toPartition = parsePartitionSpec(ctx.to)
        val action = RenamePartitionAction(fromPartition, toPartition)
        val alterTable = AlterTable(RENAME_PARTITION, tableId, action)
        return StatementData(StatementType.ALTER_TABLE, alterTable)
    }

    //-----------------------------------view-------------------------------------------------

    override fun visitCreateView(ctx: SparkSqlParser.CreateViewContext): StatementData {
        var comment: String? = null
        if (ctx.commentSpec().size > 0) {
            comment = ctx.commentSpec().get(0).stringLit().text
            comment = StringUtil.cleanQuote(comment)
        }

        val tableId = parseTableName(ctx.multipartIdentifier())
        val ifNotExists = ctx.NOT() != null

        var querySql = ""
        ctx.children.filter { it is QueryContext }.forEach { it ->
            val query = it as QueryContext
            querySql = StringUtils.substring(command, query.start.startIndex)
        }

        currentOptType = StatementType.CREATE_VIEW
        this.visitQuery(ctx.query())

        val createView = CreateView(tableId, querySql, comment, ifNotExists)
        createView.functionNames = tableLineage.functionNames
        if (ctx.REPLACE() != null) {
            createView.replace = true
        }
        if (ctx.TEMPORARY() != null) {
            createView.temporary = true
        }
        if (ctx.GLOBAL() != null) {
            createView.global = true
        }
        createView.inputTables = tableLineage.inputTables
        return StatementData(StatementType.CREATE_VIEW, createView)
    }

    override fun visitCreateTempViewUsing(ctx: SparkSqlParser.CreateTempViewUsingContext): StatementData {
        val tableName = ctx.tableIdentifier().table.text
        var databaseName: String? = null
        if (ctx.tableIdentifier().db != null) {
            databaseName = ctx.tableIdentifier().db.text
        }

        var querySql = ""
        ctx.children.filter { it is QueryContext }.forEach { it ->
            val query = it as QueryContext
            querySql = StringUtils.substring(command, query.start.startIndex)
        }

        currentOptType = StatementType.CREATE_VIEW

        val tableId = TableId(null, databaseName, tableName)
        val createView = CreateView(tableId, querySql)
        if (ctx.REPLACE() != null) {
            createView.replace = true
        }
        if (ctx.GLOBAL() != null) {
            createView.global = true
        }
        createView.temporary = true

        val tableProvider = ctx.tableProvider().multipartIdentifier().text
        createView.tableProvider = tableProvider
        createView.properties = parseOptions(ctx.propertyList())
        return StatementData(StatementType.CREATE_TEMPORARY_VIEW, createView)
    }

    override fun visitAlterViewQuery(ctx: SparkSqlParser.AlterViewQueryContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())

        var querySql = ""
        ctx.children.filter { it is QueryContext }.forEach {
            val query = it as QueryContext
            querySql = StringUtils.substring(command, query.start.startIndex)
        }

        currentAlterType = ALTER_VIEW_QUERY
        visitQuery(ctx.query())

        val action = AlterViewAction(querySql, tableLineage.inputTables)
        val alterView = AlterTable(ALTER_VIEW_QUERY, tableId, action)
        return StatementData(StatementType.ALTER_TABLE, alterView)
    }

    //-----------------------------------function-------------------------------------------------

    override fun visitCreateFunction(ctx: SparkSqlParser.CreateFunctionContext): StatementData {
        val functionId = parseTableName(ctx.multipartIdentifier())
        val classNmae = ctx.className.text

        var temporary: Boolean = false
        var file: String? = null
        if (ctx.TEMPORARY() != null) {
            temporary = true
        } else {
            file = ctx.resource(0).stringLit().text
        }

        val data = CreateFunction(functionId.schemaName, functionId.tableName, temporary, classNmae, file)
        return StatementData(StatementType.CREATE_FUNCTION, data)
    }

    override fun visitDropFunction(ctx: SparkSqlParser.DropFunctionContext): StatementData {
        val functionId = parseTableName(ctx.multipartIdentifier())
        val data = DropFunction(functionId.schemaName, functionId.tableName)
        return StatementData(StatementType.DROP_FUNCTION, data)
    }
    //-----------------------------------cache-------------------------------------------------

    override fun visitCacheTable(ctx: SparkSqlParser.CacheTableContext?): StatementData {
        return StatementData(StatementType.CACHE)
    }

    override fun visitUncacheTable(ctx: SparkSqlParser.UncacheTableContext?): StatementData {
        return StatementData(StatementType.UNCACHE)
    }

    override fun visitClearCache(ctx: SparkSqlParser.ClearCacheContext?): StatementData {
        return StatementData(StatementType.CLEAR_CACHE)
    }

    //-----------------------------------other-------------------------------------------------

    override fun visitExplain(ctx: SparkSqlParser.ExplainContext?): StatementData {
        return StatementData(StatementType.EXPLAIN)
    }

    override fun visitLoadTempTable(ctx: SparkSqlParser.LoadTempTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = LoadData(catalogName, databaseName, tableName)
        return StatementData(StatementType.LOAD_TEMP_TABLE, data)
    }

    override fun visitExportTable(ctx: SparkSqlParser.ExportTableContext): StatementData {
        val data = if (StringUtils.equalsIgnoreCase("with", ctx.start.text)) {
            isCTE = true
            val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
            ExportData(catalogName, databaseName, tableName)
        } else {
            val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
            ExportData(catalogName, databaseName, tableName, isCTE)
        }
        currentOptType = StatementType.EXPORT_TABLE
        super.visitExportTable(ctx)

        if (isCTE) {
            tableLineage.cteTempTables.forEach { tableName ->
                for ((index, table) in tableLineage.inputTables.withIndex()) {
                    if (table.schemaName.isNullOrBlank() && tableName == table.tableName) {
                        tableLineage.inputTables.removeAt(index)
                        break
                    }
                }
            }
            data.inputTables.addAll(tableLineage.inputTables)
        }
        data.functionNames = tableLineage.functionNames
        data.cteTempTables = tableLineage.cteTempTables
        return StatementData(StatementType.EXPORT_TABLE, data)
    }

    override fun visitUse(ctx: SparkSqlParser.UseContext): StatementData {
        val schemaId = parseNamespace(ctx.multipartIdentifier())
        val useNamespace = UseNamespace(schemaId)
        return StatementData(StatementType.USE, useNamespace)
    }

    override fun visitUseNamespace(ctx: SparkSqlParser.UseNamespaceContext): StatementData {
        val schemaId = parseNamespace(ctx.multipartIdentifier())
        val type = ctx.namespace().text.uppercase()
        val useNamespace = UseNamespace(schemaId, Namespace.valueOf(type))
        return StatementData(StatementType.USE, useNamespace)
    }

    override fun visitSetConfiguration(ctx: SparkSqlParser.SetConfigurationContext?): StatementData {
        return StatementData(StatementType.SET)
    }

    //-----------------------------------insert & query-------------------------------------------------

    override fun visitStatementDefault(ctx: SparkSqlParser.StatementDefaultContext): StatementData? {
        val node = ctx.getChild(0)
        if (StringUtils.equalsIgnoreCase("with", ctx.start.text)) {
            isCTE = true

            val childnode = node.getChild(1)
            if (StringUtils.startsWithIgnoreCase(childnode.text, "select")) {
                currentOptType = StatementType.SELECT
                super.visitStatementDefault(ctx)
                tableLineage.limit = limit

                tableLineage.cteTempTables.forEach { tableName ->
                    for ((index, table) in tableLineage.inputTables.withIndex()) {
                        if (table.schemaName.isNullOrBlank() && tableName == table.tableName) {
                            tableLineage.inputTables.removeAt(index)
                            break
                        }
                    }
                }
                return StatementData(StatementType.SELECT, tableLineage)
            }
        } else if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitStatementDefault(ctx)

            tableLineage.limit = limit
            return StatementData(StatementType.SELECT, tableLineage)
        }

        return null
    }

    override fun visitDmlStatement(ctx: SparkSqlParser.DmlStatementContext): StatementData? {
        val node = ctx.getChild(0)
        if (StringUtils.equalsIgnoreCase("with", ctx.start.text)) {
            isCTE = true

            val childNode = ctx.getChild(1)
            if (childNode is SparkSqlParser.SingleInsertQueryContext) {
                if (StringUtils.equalsIgnoreCase("insert", childNode.start.text)) {
                    insertSql = true
                    super.visitDmlStatement(ctx)

                    val tableContext = childNode.getChild(0)
                    val multipartIdentifier: SparkSqlParser.MultipartIdentifierContext = if (tableContext is SparkSqlParser.InsertIntoTableContext) {
                        tableContext.multipartIdentifier()
                    } else {
                        (tableContext as SparkSqlParser.InsertOverwriteTableContext).multipartIdentifier()
                    }

                    val (catalogName, databaseName, tableName) = parseTableName(multipartIdentifier)
                    val table = TableId(catalogName, databaseName, tableName)
                    tableLineage.outpuTables.add(table)
                    tableLineage.partitions = partitions

                    if (StringUtils.endsWithIgnoreCase("into", tableContext.getChild(1).text)) {
                        insertMode = InsertMode.INTO
                    }
                    tableLineage.insertMode = insertMode

                    tableLineage.cteTempTables.forEach { name ->
                        for ((index, table) in tableLineage.inputTables.withIndex()) {
                            if (table.schemaName.isNullOrBlank() && name == table.tableName) {
                                tableLineage.inputTables.removeAt(index)
                                break
                            }
                        }
                    }

                    for ((index, table) in tableLineage.inputTables.withIndex()) {
                        if (databaseName == table.schemaName && tableName == table.tableName) {
                            tableLineage.inputTables.removeAt(index)
                            break
                        }
                    }

                    if (currentOptType == StatementType.INSERT_SELECT) {
                        return StatementData(StatementType.INSERT_SELECT, tableLineage, querySql = querySql)
                    }
                }
            }
            return null
        } else if (StringUtils.equalsIgnoreCase("insert", ctx.start.text)) {
            insertSql = true
            val tableContext = ctx.dmlStatementNoWith().getChild(0)
            super.visitDmlStatement(ctx)

            val multipartIdentifier: SparkSqlParser.MultipartIdentifierContext = if (tableContext is SparkSqlParser.InsertIntoTableContext) {
                tableContext.multipartIdentifier()
            } else if (tableContext is SparkSqlParser.InsertOverwriteTableContext) {
                tableContext.multipartIdentifier()
            } else {
                throw SQLParserException("不支持SQL");
            }

            val (catalogName, databaseName, tableName) = parseTableName(multipartIdentifier)
            val table = TableId(catalogName, databaseName, tableName)
            tableLineage.outpuTables.add(table)
            tableLineage.partitions = partitions

            if (StringUtils.endsWithIgnoreCase("into", tableContext.getChild(1).text)) {
                insertMode = InsertMode.INTO
            }
            tableLineage.insertMode = insertMode

            if (currentOptType == StatementType.INSERT_VALUES) {
                if (values.size != 0) {
                    return StatementData(StatementType.INSERT_VALUES, tableLineage, values = values)
                } else {
                    return StatementData(StatementType.INSERT_VALUES, tableLineage, values = singleValues)
                }
            } else {
                return StatementData(StatementType.INSERT_SELECT, tableLineage, querySql = querySql)
            }
        } else if (StringUtils.equalsIgnoreCase("from", ctx.start.text)) {
            currentOptType = StatementType.MULTI_INSERT
            super.visitDmlStatement(ctx)

            return StatementData(StatementType.MULTI_INSERT, tableLineage)
        } else if (node is SparkSqlParser.UpdateTableContext ||
                node is SparkSqlParser.DeleteFromTableContext ||
                node is SparkSqlParser.MergeIntoTableContext) {
            return super.visitDmlStatement(ctx)
        } else {
            return null
        }
    }

    //-----------------------------------delta sql-------------------------------------------------

    override fun visitDeleteFromTable(ctx: SparkSqlParser.DeleteFromTableContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())
        val where = if (ctx.whereClause() != null) StringUtils.substring(command, ctx.whereClause().start.stopIndex + 1) else null

        val update = DeleteTable(tableId, StringUtils.trim(where))
        return StatementData(StatementType.DELETE, update)
    }

    override fun visitUpdateTable(ctx: SparkSqlParser.UpdateTableContext): StatementData {
        val tableId = parseTableName(ctx.multipartIdentifier())

        val upset = ctx.setClause().assignmentList().assignment().filter { it is SparkSqlParser.AssignmentContext }.map {
            val assign = it as SparkSqlParser.AssignmentContext
            assign.key.text to assign.value.text
        }.toMap()
        val where = if (ctx.whereClause() != null) StringUtils.substring(command, ctx.whereClause().start.stopIndex + 1) else null

        val update = UpdateTable(tableId, upset, StringUtils.trim(where))
        return StatementData(StatementType.UPDATE, update)
    }

    override fun visitMergeIntoTable(ctx: SparkSqlParser.MergeIntoTableContext): StatementData {
        currentOptType = StatementType.MERGE_INTO_TABLE

        val targetTable = parseTableName(ctx.target)
        val deltaMerge = MergeIntoTable(targetTable = targetTable)

        if (ctx.source != null) {
            val tableId = parseTableName(ctx.source)
            deltaMerge.sourceTables.add(tableId)
        } else if (ctx.sourceQuery != null && ctx.sourceQuery is QueryContext) {
            val query = ctx.sourceQuery as QueryContext
            super.visitQuery(query)

            deltaMerge.sourceTables.addAll(tableLineage.inputTables)
        }
        return StatementData(StatementType.MERGE_INTO_TABLE, deltaMerge)
    }

    //-----------------------------------private method-------------------------------------------------

    override fun visitFunctionName(ctx: SparkSqlParser.FunctionNameContext): StatementData? {
        if (StatementType.SELECT == currentOptType ||
            StatementType.CREATE_VIEW == currentOptType ||
            StatementType.INSERT_SELECT == currentOptType ||
            StatementType.CREATE_TABLE_AS_SELECT == currentOptType ||
            StatementType.MULTI_INSERT == currentOptType ||
            StatementType.MERGE_INTO_TABLE == currentOptType ||
            StatementType.EXPORT_TABLE == currentOptType ||
            StatementType.DATATUNNEL == currentOptType) {

            tableLineage.functionNames.add(StringUtils.lowerCase(ctx.qualifiedName().text))
        }
        return super.visitFunctionName(ctx)
    }

    override fun visitQueryTermDefault(ctx: SparkSqlParser.QueryTermDefaultContext): StatementData? {
        if (querySql == null) {
            querySql = StringUtils.substring(command, ctx.start.startIndex)
        }
        return super.visitQueryTermDefault(ctx)
    }

    override fun visitNamedQuery(ctx: SparkSqlParser.NamedQueryContext): StatementData? {
        if (isCTE) {
            tableLineage.cteTempTables.add(ctx.getChild(0).text)
        }
        return super.visitNamedQuery(ctx)
    }

    override fun visitMultipartIdentifier(ctx: SparkSqlParser.MultipartIdentifierContext): StatementData? {
        val tableId = parseTableName(ctx)
        if (currentOptType == StatementType.CREATE_TABLE_AS_SELECT ||
            currentOptType == StatementType.SELECT ||
            currentOptType == StatementType.CREATE_VIEW ||
            currentOptType == StatementType.INSERT_SELECT ||
            currentOptType == StatementType.MERGE_INTO_TABLE ||
            currentOptType == StatementType.EXPORT_TABLE ||
            currentOptType == StatementType.DATATUNNEL ||

            currentAlterType == ALTER_VIEW_QUERY) {

            val index = tableLineage.inputTables.indexOf(tableId)
            if (index == -1) {
                tableLineage.inputTables.add(tableId)
            }
        } else if (currentOptType == StatementType.MULTI_INSERT) {
            if ("from" == multiInsertToken) {
                tableLineage.inputTables.add(tableId)
            }
        }
        return null
    }

    override fun visitInlineTableDefault1(ctx: SparkSqlParser.InlineTableDefault1Context): StatementData? {
        currentOptType = StatementType.INSERT_VALUES
        return super.visitInlineTableDefault1(ctx)
    }

    override fun visitRowConstructor(ctx: SparkSqlParser.RowConstructorContext): StatementData? {
        val row = ctx.children.filter { it is SparkSqlParser.NamedExpressionContext }.map {
            var text = it.text
            text = StringUtil.cleanQuote(text)
            text
        }.toList()

        values.add(row)
        return super.visitRowConstructor(ctx)
    }

    override fun visitPartitionVal(ctx: SparkSqlParser.PartitionValContext): StatementData? {
        if (ctx.childCount == 1) {
            partitions.put(ctx.getChild(0).text, "__dynamic__")
        } else {
            var value = ctx.getChild(2).text
            value = StringUtil.cleanQuote(value)
            partitions.put(ctx.getChild(0).text, value)
        }
        return super.visitPartitionVal(ctx)
    }

    override fun visitInlineTable(ctx: SparkSqlParser.InlineTableContext): StatementData? {
        ctx.children.filter { it is SparkSqlParser.ExpressionContext }.forEach {
            var text = it.text
            text = StringUtils.substringBetween(text, "(", ")").trim()
            text = StringUtil.cleanQuote(text)
            val list = listOf(text)
            singleValues.add(list)
        }

        return super.visitInlineTable(ctx)
    }

    override fun visitQueryPrimaryDefault(ctx: SparkSqlParser.QueryPrimaryDefaultContext?): StatementData? {
        if (insertSql) {
            currentOptType = StatementType.INSERT_SELECT
        }
        return super.visitQueryPrimaryDefault(ctx)
    }

    override fun visitFromClause(ctx: SparkSqlParser.FromClauseContext): StatementData? {
        multiInsertToken = "from"
        return super.visitFromClause(ctx)
    }

    override fun visitMultiInsertQueryBody(ctx: SparkSqlParser.MultiInsertQueryBodyContext): StatementData? {
        multiInsertToken = "insert"
        val obj = ctx.insertInto()
        if (obj is SparkSqlParser.InsertOverwriteTableContext) {
            val multipartIdentifier = obj.multipartIdentifier()
            val (catalogName, databaseName, tableName) = parseTableName(multipartIdentifier)

            val table = TableId(catalogName, databaseName, tableName)
            tableLineage.outpuTables.add(table)
        } else if (obj is SparkSqlParser.InsertIntoTableContext) {
            val multipartIdentifier = obj.multipartIdentifier()
            val (catalogName, databaseName, tableName) = parseTableName(multipartIdentifier)

            val table = TableId(catalogName, databaseName, tableName)
            tableLineage.outpuTables.add(table)
        }
        return super.visitMultiInsertQueryBody(ctx)
    }

    override fun visitQueryOrganization(ctx: SparkSqlParser.QueryOrganizationContext): StatementData? {
        limit = ctx.limit?.text?.toInt()
        return super.visitQueryOrganization(ctx)
    }

    override fun visitTypeConstructor(ctx: SparkSqlParser.TypeConstructorContext): StatementData? {
        val valueType = ctx.identifier().getText().uppercase()
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
                    comment = StringUtil.cleanQuote(col.commentSpec().stringLit().text);
                }

                if (col.defaultExpression() != null) {
                    defaultExpr = StringUtils.substring(command,
                        col.defaultExpression().start.startIndex,
                        col.defaultExpression().stop.stopIndex + 1)

                    if (defaultExpr != null) {
                        defaultExpr = StringUtil.cleanQuote(defaultExpr!!)
                    }
                }
            }
        }

        return Triple(nullable, defaultExpr, comment)
    }

    private fun parseAlterColumnAction(context: AlterColumnActionContext): AlterColumnAction {
        val action = AlterColumnAction();
        if (context.dataType() != null) {
            action.dataType = StringUtils.substring(command, context.dataType().start.startIndex,
                context.dataType().stop.stopIndex + 1)
        }

        if (context.commentSpec() != null) {
            action.comment = StringUtil.cleanQuote(context.commentSpec().stringLit().text)
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
        }

        if (context.defaultExpression() != null) {
            val expr = context.defaultExpression().expression()
            action.defaultExpression = StringUtils.substring(command, expr.start.startIndex,
                expr.stop.stopIndex + 1)
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

    private fun parseOptions(ctx: PropertyListContext?): Map<String, String> {
        val properties = HashMap<String, String>()
        if (ctx != null) {
            ctx.children.filter { it is SparkSqlParser.PropertyContext }.map { item ->
                val property = item as SparkSqlParser.PropertyContext
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        return properties
    }

    private fun parsePartitionSpec(ctx: PartitionSpecContext): List<String> {
        return ctx.partitionVal().map { it.text }
    }
}
