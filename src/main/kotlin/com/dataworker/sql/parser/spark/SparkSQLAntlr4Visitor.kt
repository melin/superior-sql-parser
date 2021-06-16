package com.dataworker.sql.parser.spark

import com.dataworker.sql.parser.SQLParserException
import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.model.*
import com.dataworker.sql.parser.antlr4.spark.SparkSqlBaseBaseVisitor
import com.dataworker.sql.parser.antlr4.spark.SparkSqlBaseParser
import com.dataworker.sql.parser.util.StringUtil
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.List

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class SparkSQLAntlr4Visitor : SparkSqlBaseBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private val statementData = TableData()
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
    private var cteTempTables: ArrayList<String> = ArrayList()

    override fun shouldVisitNextChild(node: RuleNode, currentResult: StatementData?): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitSingleStatement(ctx: SparkSqlBaseParser.SingleStatementContext): StatementData {
        val data = super.visitSingleStatement(ctx)

        if (data == null) {
            throw SQLParserException("不支持的SQL: " + command)
        }

        return data
    }

    fun setCommand(command: String) {
        this.command = command
    }

    fun parseTableName(ctx: SparkSqlBaseParser.MultipartIdentifierContext): Triple<String?, String, String?> {
        if (ctx.parts.size == 3) {
            return Triple(ctx.parts.get(0).text, ctx.parts.get(1).text, ctx.parts.get(2).text)
        } else if (ctx.parts.size == 2) {
            return Triple(ctx.parts.get(0).text, ctx.parts.get(1).text, null)
        } else if (ctx.parts.size == 1) {
            return Triple(null, ctx.parts.get(0).text, null)
        } else {
            throw SQLParserException("parse multipart error: " + ctx.parts.size)
        }
    }

    //-----------------------------------database-------------------------------------------------

    override fun visitCreateNamespace(ctx: SparkSqlBaseParser.CreateNamespaceContext): StatementData {
        val databaseName = ctx.multipartIdentifier().parts.get(0).identifier().text
        var location: String = ""
        if (ctx.locationSpec().size > 0) {
            location = ctx.locationSpec().get(0).STRING().text
            location = StringUtil.cleanQuote(location)
        }

        val sqlData = DcDatabase(databaseName, location)
        return StatementData(StatementType.CREATE_DATABASE, sqlData)
    }

    override fun visitDropNamespace(ctx: SparkSqlBaseParser.DropNamespaceContext): StatementData {
        val databaseName = ctx.multipartIdentifier().parts.get(0).identifier().text
        val sqlData = DcDatabase(databaseName)
        return StatementData(StatementType.DROP_DATABASE, sqlData)
    }

    override fun visitDescribeNamespace(ctx: SparkSqlBaseParser.DescribeNamespaceContext): StatementData {
        val databaseName = ctx.multipartIdentifier().parts.get(0).identifier().text
        val sqlData = DcDatabase(databaseName)
        return StatementData(StatementType.DESC_DATABASE, sqlData)
    }

    override fun visitShowTables(ctx: SparkSqlBaseParser.ShowTablesContext): StatementData {
        return StatementData(StatementType.SHOW_TABLES)
    }

    //-----------------------------------table-------------------------------------------------

    /**
     * create table as query
     */
    override fun visitCreateTable(ctx: SparkSqlBaseParser.CreateTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.createTableHeader().multipartIdentifier())
        val lifeCycle = ctx.createTableClauses().lifecycle?.text?.toInt()

        var columns: List<DcColumn>? = null
        var partitionColumnNames: List<String>? = null
        if (ctx.query() == null) {
            columns = ctx.colTypeList().colType().map {
                val colName = it.colName.text
                var dataType = it.dataType().text
                val colComment = if (it.commentSpec() != null) StringUtil.cleanQuote(it.commentSpec().STRING().text) else null
                DcColumn(colName, dataType, colComment)
            }
        } else {
            if (ctx.createTableClauses().partitioning != null) {
                partitionColumnNames = arrayListOf<String>()
                val identityTransformContext = ctx.createTableClauses().partitioning.getChild(1) as SparkSqlBaseParser.IdentityTransformContext
                identityTransformContext.children.map { item ->
                    if (item is SparkSqlBaseParser.QualifiedNameContext) {
                        val value = item.getChild(0)
                        if (value is SparkSqlBaseParser.IdentifierContext) {
                            val part = value.getChild(0).text
                            partitionColumnNames.add(part)
                        }
                    }
                }
            }
        }

        var properties = HashMap<String, String>()
        if (ctx.createTableClauses().tableProps != null) {
            ctx.createTableClauses().tableProps.children.filter { it is SparkSqlBaseParser.TablePropertyContext }.map { item ->
                val property = item as SparkSqlBaseParser.TablePropertyContext
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }
        val fileFormat = "PARQUET"

        val dcTable = DcTable(databaseName, tableName, null, lifeCycle, null, columns, properties, fileFormat)
        dcTable.ifNotExists = ctx.createTableHeader().NOT() != null
        dcTable.external = ctx.createTableHeader().EXTERNAL() != null
        dcTable.temporary = ctx.createTableHeader().TEMPORARY() != null
        dcTable.location = ctx.createTableClauses().locationSpec().size > 0
        if (dcTable.location) {
            dcTable.locationPath = ctx.createTableClauses().locationSpec().get(0).text
        }
        dcTable.partitionColumnNames = partitionColumnNames

        if (ctx.query() != null) {
            currentOptType = StatementType.CREATE_TABLE_AS_SELECT
            var querySql = StringUtils.substring(command, ctx.query().start.startIndex)
            if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
                querySql = StringUtils.substringBetween(querySql, "(", ")")
            }

            dcTable.querySql = querySql
            super.visitQuery(ctx.query())
            dcTable.tableData = statementData
            return StatementData(StatementType.CREATE_TABLE_AS_SELECT, dcTable)
        } else {
            return StatementData(StatementType.CREATE_TABLE, dcTable)
        }
    }

    override fun visitCreateHiveTable(ctx: SparkSqlBaseParser.CreateHiveTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.createTableHeader().multipartIdentifier())
        val comment = if (ctx.commentSpec().size > 0) StringUtil.cleanQuote(ctx.commentSpec(0).STRING().text) else null
        val lifeCycle = ctx.lifecycle?.text?.toInt()

        var partitionColumns: List<DcColumn>? = null
        var partitionColumnNames: List<String>? = null
        var columns: List<DcColumn>? = null
        if (ctx.query() == null) {
            if (ctx.partitionColumns != null) {
                partitionColumns = ctx.partitionColumns.children
                        .filter { it is SparkSqlBaseParser.ColTypeContext }.map { item ->
                            val column = item as SparkSqlBaseParser.ColTypeContext
                            val colName = column.colName.text
                            var dataType = column.dataType().text
                            checkPartitionDataType(dataType)

                            val colComment = if (column.commentSpec() != null) StringUtil.cleanQuote(column.commentSpec().STRING().text) else null
                            DcColumn(colName, dataType, colComment)
                        }
            }

            if (ctx.columns != null) {
                columns = ctx.columns.children
                        .filter { it is SparkSqlBaseParser.ColTypeContext }.map { item ->
                            val column = item as SparkSqlBaseParser.ColTypeContext
                            val colName = column.colName.text
                            var dataType = column.dataType().text
                            //checkColumnDataType(dataType)

                            val colComment = if (column.commentSpec() != null) StringUtil.cleanQuote(column.commentSpec().STRING().text) else null
                            DcColumn(colName, dataType, colComment)
                        }
            }
        } else {
            if (ctx.partitionColumnNames != null) {
                partitionColumnNames = arrayListOf<String>()
                ctx.partitionColumnNames.children.map { item ->
                    if (item is SparkSqlBaseParser.IdentifierSeqContext) {
                        val value = item.getChild(0).getChild(0).getChild(0)
                        if (value is SparkSqlBaseParser.UnquotedIdentifierContext) {
                            val part = value.getChild(0).text
                            partitionColumnNames.add(part)
                        }
                    }
                }
            }
        }

        var properties = HashMap<String, String>()
        if (ctx.tableProps != null) {
            ctx.tableProps.children.filter { it is SparkSqlBaseParser.TablePropertyContext }.map { item ->
                val property = item as SparkSqlBaseParser.TablePropertyContext
                var key = StringUtil.cleanQuote(property.key.text)
                var value = StringUtil.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        var fileFormat = "PARQUET"
        if (ctx.createFileFormat().size == 1) {
            fileFormat = ctx.createFileFormat().get(0).fileFormat().text
        }

        val dcTable = DcTable(databaseName, tableName, comment, lifeCycle, partitionColumns, columns, properties, fileFormat)
        dcTable.ifNotExists = ctx.createTableHeader().NOT() != null
        dcTable.external = ctx.createTableHeader().EXTERNAL() != null
        dcTable.temporary = ctx.createTableHeader().TEMPORARY() != null
        dcTable.location = ctx.locationSpec().size > 0
        if (dcTable.location) {
            dcTable.locationPath = ctx.locationSpec().get(0).text
        }

        dcTable.partitionColumnNames = partitionColumnNames

        if (ctx.query() != null) {
            currentOptType = StatementType.CREATE_TABLE_AS_SELECT
            var querySql = StringUtils.substring(command, ctx.query().start.startIndex)
            if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
                querySql = StringUtils.substringBetween(querySql, "(", ")")
            }

            dcTable.querySql = querySql
            super.visitQuery(ctx.query())
            dcTable.tableData = statementData
            return StatementData(StatementType.CREATE_TABLE_AS_SELECT, dcTable)
        } else {
            return StatementData(StatementType.CREATE_TABLE, dcTable)
        }
    }

    override fun visitCreateTableLike(ctx: SparkSqlBaseParser.CreateTableLikeContext): StatementData {
        val newDatabaseName = ctx.target.db?.text
        val newTableName = ctx.target.table.text

        val oldDatabaseName = ctx.source.db?.text
        val oldTableName = ctx.source.table.text

        val dcTable = DcCopyTable(oldDatabaseName, oldTableName, newDatabaseName, newTableName)
        dcTable.ifNotExists = ctx.NOT() != null

        return StatementData(StatementType.CREATE_TABLE_AS_LIKE, dcTable)
    }

    override fun visitDropTable(ctx: SparkSqlBaseParser.DropTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val dcTable = DcTable(databaseName, tableName)
        val token = CommonToken(ctx.multipartIdentifier().start.startIndex, ctx.multipartIdentifier().stop.stopIndex)
        dcTable.ifExists = ctx.EXISTS() != null
        dcTable.token = token
        return StatementData(StatementType.DROP_TABLE, dcTable)
    }

    override fun visitDropView(ctx: SparkSqlBaseParser.DropViewContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val dcView = DcView(databaseName, tableName)
        dcView.ifExists = ctx.EXISTS() != null
        return StatementData(StatementType.DROP_VIEW, dcView)
    }

    override fun visitTruncateTable(ctx: SparkSqlBaseParser.TruncateTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val dcTable = DcTable(databaseName, tableName)
        return StatementData(StatementType.TRUNCATE_TABLE, dcTable)
    }

    override fun visitRepairTable(ctx: SparkSqlBaseParser.RepairTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val dcTable = DcTable(databaseName, tableName)
        return StatementData(StatementType.MSCK_TABLE, dcTable)
    }

    override fun visitRenameTable(ctx: SparkSqlBaseParser.RenameTableContext): StatementData {
        val (databaseName, oldTableName) = parseTableName(ctx.from)
        val (_, newTableName) = parseTableName(ctx.to)

        if (ctx.VIEW() != null) {
            val dcView = DcRenameView(databaseName, oldTableName, newTableName)
            return StatementData(StatementType.ALTER_VIEW_RENAME, dcView)
        } else {
            val dcTable = DcRenameTable(databaseName, oldTableName, newTableName)
            dcTable.oldToken = CommonToken(ctx.from.start.startIndex, ctx.from.stop.stopIndex)
            dcTable.newToken = CommonToken(ctx.to.start.startIndex, ctx.to.stop.stopIndex)
            return StatementData(StatementType.ALTER_TABLE_RENAME, dcTable)
        }
    }

    override fun visitSetTableProperties(ctx: SparkSqlBaseParser.SetTablePropertiesContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        var properties = HashMap<String, String>()
        if (ctx.tablePropertyList() != null) {
            ctx.tablePropertyList().children.filter { it is SparkSqlBaseParser.TablePropertyContext }.map { item ->
                val property = item as SparkSqlBaseParser.TablePropertyContext
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        val data = DcTable(databaseName, tableName, null, null, null, null, properties, null)
        if (ctx.VIEW() == null) {
            return StatementData(StatementType.ALTER_TABLE_PROPERTIES, data)
        } else {
            return StatementData(StatementType.ALTER_VIEW_PROPERTIES, data)
        }
    }

    override fun visitAddTableColumns(ctx: SparkSqlBaseParser.AddTableColumnsContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val columns = ctx.columns.children
                .filter { it is SparkSqlBaseParser.QualifiedColTypeWithPositionContext }.map { item ->
                    val column = item as SparkSqlBaseParser.QualifiedColTypeWithPositionContext
                    val colName = column.multipartIdentifier().text
                    var dataType = column.dataType().text
                    val colComment = if (column.commentSpec() != null) StringUtil.cleanQuote(column.commentSpec().STRING().text) else null

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
                    DcColumn(colName, dataType, colComment, null, position, afterCol)
                }

        val dcTable = DcTable(databaseName, tableName, null, null, null, columns)
        dcTable.token = CommonToken(ctx.multipartIdentifier().start.startIndex, ctx.multipartIdentifier().stop.stopIndex)
        if ("columns" == ctx.getChild(4).text) {
            return StatementData(StatementType.ALTER_TABLE_ADD_COLS, dcTable)
        } else {
            return StatementData(StatementType.ALTER_TABLE_ADD_COL, dcTable)
        }
    }

    override fun visitHiveChangeColumn(ctx: SparkSqlBaseParser.HiveChangeColumnContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.table)

        val oldName = ctx.colName.parts.get(0).text
        val newName = ctx.colType().colName.text
        val commentNode = ctx.colType().commentSpec()?.STRING()
        val comment = if (commentNode != null) StringUtil.cleanQuote(commentNode.text) else null

        val data = DcAlterColumn(databaseName, tableName, oldName, newName, comment)
        return StatementData(StatementType.ALTER_TABLE_RENAME_COL, data)
    }

    override fun visitRenameTableColumn(ctx: SparkSqlBaseParser.RenameTableColumnContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.table)

        val oldName = ctx.from.text
        val newName = ctx.to.text

        val dcTable = DcAlterColumn(databaseName, tableName, oldName, newName)
        dcTable.token = CommonToken(ctx.table.start.startIndex, ctx.table.stop.stopIndex)
        return StatementData(StatementType.ALTER_TABLE_RENAME_COL, dcTable)
    }

    override fun visitAlterTableAlterColumn(ctx: SparkSqlBaseParser.AlterTableAlterColumnContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.table)

        val action = ctx.alterColumnAction().getChild(0)
        var comment: String? = null
        if (action is SparkSqlBaseParser.CommentSpecContext) {
            comment = StringUtil.cleanQuote(action.STRING().text)
        }
        val dcTable = DcAlterColumn(databaseName, tableName, null, null, comment)
        dcTable.token = CommonToken(ctx.table.start.startIndex, ctx.table.stop.stopIndex)
        return StatementData(StatementType.ALTER_TABLE_CHANGE_COL, dcTable)
    }

    override fun visitDropTableColumns(ctx: SparkSqlBaseParser.DropTableColumnsContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.table)

        val dcTable = DcAlterColumn(databaseName, tableName)
        dcTable.token = CommonToken(ctx.table.start.startIndex, ctx.table.stop.stopIndex)
        return StatementData(StatementType.ALTER_TABLE_DROP_COL, dcTable)
    }

    override fun visitSetTableLocation(ctx: SparkSqlBaseParser.SetTableLocationContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val tableSource = TableSource(databaseName, tableName)
        val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
        tableSource.tokens.add(token)
        return StatementData(StatementType.ALTER_TABLE_SET_LOCATION, tableSource)
    }

    override fun visitMergeTable(ctx: SparkSqlBaseParser.MergeTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val partitionVals = ctx.partitionSpec()?.partitionVal()
                ?.map { partitionValContext -> partitionValContext.text }?.toList()
        val data = MergeData(databaseName, tableName, partitionVals)
        return StatementData(StatementType.MERGE_TABLE, data)
    }

    override fun visitKillJob(ctx: SparkSqlBaseParser.KillJobContext): StatementData {
        val data = KillData(ctx.identifier().text)
        return StatementData(StatementType.KILL, data)
    }

    override fun visitReadTable(ctx: SparkSqlBaseParser.ReadTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val partitionVals = ctx.partitionSpec()?.partitionVal()
                ?.map { partitionValContext -> partitionValContext.text }?.toList()
        val data = ReadData(databaseName, tableName, partitionVals, ctx.number().text.toInt())

        return StatementData(StatementType.READ_TABLE, data)
    }

    override fun visitRefreshTable(ctx: SparkSqlBaseParser.RefreshTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val data = RefreshData(databaseName, tableName)

        return StatementData(StatementType.REFRESH_TABLE, data)
    }

    override fun visitDescribeRelation(ctx: SparkSqlBaseParser.DescribeRelationContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.DESC_TABLE, data)
    }

    override fun visitShowColumns(ctx: SparkSqlBaseParser.ShowColumnsContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.table)

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.SHOW_COLUMNS, data)
    }

    override fun visitShowCreateTable(ctx: SparkSqlBaseParser.ShowCreateTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.SHOW_CREATE_TABLE, data)
    }

    override fun visitShowTable(ctx: SparkSqlBaseParser.ShowTableContext): StatementData {
        return StatementData(StatementType.SHOW_TABLE)
    }

    override fun visitShowTblProperties(ctx: SparkSqlBaseParser.ShowTblPropertiesContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.table)

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.SHOW_TABLE_PROPERTIES, data)
    }

    override fun visitAnalyze(ctx: SparkSqlBaseParser.AnalyzeContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.ANALYZE_TABLE, data)
    }

    override fun visitCompressTable(ctx: SparkSqlBaseParser.CompressTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val partitionVals = ctx.partitionSpec()?.partitionVal()
                ?.map { partitionValContext -> partitionValContext.text }?.toList()
        val data = CompressTableData(databaseName, tableName, partitionVals)
        return StatementData(StatementType.COMPRESS_TABLE, data)
    }

    override fun visitCompressFile(ctx: SparkSqlBaseParser.CompressFileContext): StatementData {
        return StatementData(StatementType.COMPRESS_FILE, null)
    }

    override fun visitDistcpDatasource(ctx: SparkSqlBaseParser.DistcpDatasourceContext): StatementData {
        val (srcDatabaseName, srcTableName) = parseTableName(ctx.srcTable)
        val srcTable = TableSource(srcDatabaseName, srcTableName)

        var datasource = ctx.ds.text

        val (destDatabaseName, destTableName) = parseTableName(ctx.srcTable)
        val destTable = TableSource(destDatabaseName, destTableName)

        val partitionVals = ctx.partitionSpec()?.partitionVal()
                ?.map { partitionValContext -> partitionValContext.text }?.toList()

        var properties = HashMap<String, String>()
        if (ctx.options != null) {
            ctx.options.tableProperty().map { item ->
                val property = item as SparkSqlBaseParser.TablePropertyContext
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        val data = if (StringUtils.equalsIgnoreCase("with", ctx.start.text)) {
            isCTE = true
            DistcpTableData(datasource, srcTable, partitionVals, destTable, properties)
        } else {
            DistcpTableData(datasource, srcTable, partitionVals, destTable, properties)
        }

        super.visitDistcpDatasource(ctx)

        if (isCTE) {
            cteTempTables.forEach { tableName ->
                for ((index, table) in statementData.inputTables.withIndex()) {
                    if (table.databaseName.isNullOrBlank() && tableName == table.tableName) {
                        statementData.inputTables.removeAt(index)
                        break
                    }
                }
            }
            statementData.inputTables.remove(srcTable)
            data.inputTables.addAll(statementData.inputTables)
            data.cteTempTables = cteTempTables
        }
        return StatementData(StatementType.DISTCP_DATASOURCE, data)
    }

    //-----------------------------------partition-------------------------------------------------

    override fun visitAddTablePartition(ctx: SparkSqlBaseParser.AddTablePartitionContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        var partitions = ctx.children.filter { it is SparkSqlBaseParser.PartitionSpecLocationContext }.map { partition ->
            var sb = StringBuilder()
            var len = partition.childCount - 2
            for (index in 2..len) {
                sb.append(partition.getChild(index).text)
            }

            sb.toString()
        }

        val ifNotExists = ctx.NOT() != null
        val data = AddTablePartition(databaseName, tableName, ifNotExists, partitions)
        return StatementData(StatementType.ALTER_TABLE_ADD_PARTS, data)
    }

    override fun visitDropTablePartitions(ctx: SparkSqlBaseParser.DropTablePartitionsContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        var partitions = ctx.children.filter { it is SparkSqlBaseParser.PartitionSpecContext }.map { partition ->
            var sb = StringBuilder()
            var len = partition.childCount - 2
            for (index in 2..len) {
                sb.append(partition.getChild(index).text)
            }

            sb.toString()
        }

        val ifExists = ctx.EXISTS() != null
        val data = DropTablePartition(databaseName, tableName, ifExists, partitions)
        return StatementData(StatementType.ALTER_TABLE_DROP_PARTS, data)
    }

    override fun visitRenameTablePartition(ctx: SparkSqlBaseParser.RenameTablePartitionContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.ALTER_TABLE_RENAME_PART, data)
    }

    override fun visitShowPartitions(ctx: SparkSqlBaseParser.ShowPartitionsContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.SHOW_PARTITIONS, data)
    }

    //-----------------------------------view-------------------------------------------------

    override fun visitCreateView(ctx: SparkSqlBaseParser.CreateViewContext): StatementData {
        var comment: String? = null
        if (ctx.commentSpec().size > 0) {
            comment = ctx.commentSpec().get(0).STRING().text
            comment = StringUtil.cleanQuote(comment)
        }

        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val ifNotExists = ctx.NOT() != null

        val dcView = DcView(databaseName, tableName, comment, ifNotExists)
        return StatementData(StatementType.CREATE_VIEW, dcView)
    }

    override fun visitAlterViewQuery(ctx: SparkSqlBaseParser.AlterViewQueryContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val dcView = DcView(databaseName, tableName)
        return StatementData(StatementType.ALTER_VIEW_QUERY, dcView)
    }

    //-----------------------------------function-------------------------------------------------

    override fun visitCreateFunction(ctx: SparkSqlBaseParser.CreateFunctionContext): StatementData {
        val name = ctx.multipartIdentifier().parts.get(0).text
        val classNmae = ctx.className.text

        var temporary: Boolean = false
        var file: String? = null
        if (ctx.TEMPORARY() != null) {
            temporary = true
        } else {
            file = ctx.resource(0).STRING().text
        }

        val data = DcFunction(name, temporary, classNmae, file)
        return StatementData(StatementType.CREATE_FUNCTION, data)
    }

    override fun visitDropFunction(ctx: SparkSqlBaseParser.DropFunctionContext): StatementData {
        val name = ctx.multipartIdentifier().parts.get(0).text
        val data = DcFunction(name)
        return StatementData(StatementType.DROP_FUNCTION, data)
    }

    override fun visitDescribeFunction(ctx: SparkSqlBaseParser.DescribeFunctionContext): StatementData {
        val name = ctx.describeFuncName().text
        val data = DcFunction(name)
        return StatementData(StatementType.DESC_FUNCTION, data)
    }

    override fun visitShowFunctions(ctx: SparkSqlBaseParser.ShowFunctionsContext): StatementData {
        return StatementData(StatementType.SHOW_FUNCTIONS)
    }

    //-----------------------------------cache-------------------------------------------------

    override fun visitCacheTable(ctx: SparkSqlBaseParser.CacheTableContext?): StatementData {
        return StatementData(StatementType.CACHE)
    }

    override fun visitUncacheTable(ctx: SparkSqlBaseParser.UncacheTableContext?): StatementData {
        return StatementData(StatementType.UNCACHE)
    }

    override fun visitClearCache(ctx: SparkSqlBaseParser.ClearCacheContext?): StatementData {
        return StatementData(StatementType.CLEAR_CACHE)
    }

    //-----------------------------------other-------------------------------------------------

    override fun visitExplain(ctx: SparkSqlBaseParser.ExplainContext?): StatementData {
        return StatementData(StatementType.EXPLAIN)
    }

    override fun visitAddJar(ctx: SparkSqlBaseParser.AddJarContext?): StatementData {
        return StatementData(StatementType.ADDJAR)
    }

    override fun visitLoadTempTable(ctx: SparkSqlBaseParser.LoadTempTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = LoadData(databaseName, tableName)
        return StatementData(StatementType.LOAD_TEMP_TABLE, data)
    }

    override fun visitExportTable(ctx: SparkSqlBaseParser.ExportTableContext): StatementData {
        val data = if (StringUtils.equalsIgnoreCase("with", ctx.start.text)) {
            isCTE = true
            val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
            ExportData(databaseName, tableName)
        } else {
            val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
            ExportData(databaseName, tableName, isCTE)
        }
        currentOptType = StatementType.EXPORT_TABLE
        super.visitExportTable(ctx)

        if (isCTE) {
            cteTempTables.forEach { tableName ->
                for ((index, table) in statementData.inputTables.withIndex()) {
                    if (table.databaseName.isNullOrBlank() && tableName == table.tableName) {
                        statementData.inputTables.removeAt(index)
                        break
                    }
                }
            }
            data.inputTables.addAll(statementData.inputTables)
            data.cteTempTables = cteTempTables
        }
        return StatementData(StatementType.EXPORT_TABLE, data)
    }

    override fun visitUse(ctx: SparkSqlBaseParser.UseContext): StatementData {
        val databaseName = ctx.multipartIdentifier().parts.get(0).text
        val data = DcDatabase(databaseName)
        return StatementData(StatementType.USE, data)
    }

    override fun visitSetConfiguration(ctx: SparkSqlBaseParser.SetConfigurationContext?): StatementData {
        return StatementData(StatementType.SET)
    }

    //-----------------------------------insert & query-------------------------------------------------

    override fun visitStatementDefault(ctx: SparkSqlBaseParser.StatementDefaultContext): StatementData? {
        val node = ctx.getChild(0)
        if (StringUtils.equalsIgnoreCase("with", ctx.start.text)) {
            isCTE = true

            val node = node.getChild(1)
            if (StringUtils.startsWithIgnoreCase(node.text, "select")) {
                currentOptType = StatementType.SELECT
                super.visitStatementDefault(ctx)
                statementData.limit = limit

                cteTempTables.forEach { tableName ->
                    for ((index, table) in statementData.inputTables.withIndex()) {
                        if (table.databaseName.isNullOrBlank() && tableName == table.tableName) {
                            statementData.inputTables.removeAt(index)
                            break
                        }
                    }
                }
                statementData.cteTempTables = cteTempTables
                return StatementData(StatementType.SELECT, statementData)
            }
        } else if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitStatementDefault(ctx)

            statementData.limit = limit
            return StatementData(StatementType.SELECT, statementData)
        }

        return null
    }

    override fun visitDmlStatement(ctx: SparkSqlBaseParser.DmlStatementContext): StatementData? {
        val node = ctx.getChild(0)
        if (StringUtils.equalsIgnoreCase("with", ctx.start.text)) {
            isCTE = true

            val node = ctx.getChild(1)
            if (node is SparkSqlBaseParser.SingleInsertQueryContext) {
                if (StringUtils.equalsIgnoreCase("insert", node.start.text)) {
                    insertSql = true
                    super.visitDmlStatement(ctx)

                    val tableContext = node.getChild(0)
                    val multipartIdentifier: SparkSqlBaseParser.MultipartIdentifierContext = if (tableContext is SparkSqlBaseParser.InsertIntoTableContext) {
                        tableContext.multipartIdentifier()
                    } else {
                        (tableContext as SparkSqlBaseParser.InsertOverwriteTableContext).multipartIdentifier()
                    }

                    val (databaseName, tableName) = parseTableName(multipartIdentifier)
                    val tableSource = TableSource(databaseName, tableName)
                    val token = CommonToken(multipartIdentifier.start.startIndex, multipartIdentifier.stop.stopIndex)
                    tableSource.tokens.add(token)
                    statementData.outpuTables.add(tableSource)
                    statementData.partitions = partitions

                    if (StringUtils.endsWithIgnoreCase("into", tableContext.getChild(1).text)) {
                        insertMode = InsertMode.INTO
                    }
                    statementData.insertMode = insertMode

                    cteTempTables.forEach { name ->
                        for ((index, table) in statementData.inputTables.withIndex()) {
                            if (table.databaseName.isNullOrBlank() && name == table.tableName) {
                                statementData.inputTables.removeAt(index)
                                break
                            }
                        }
                    }

                    for ((index, table) in statementData.inputTables.withIndex()) {
                        if (databaseName == table.databaseName && tableName == table.tableName) {
                            statementData.inputTables.removeAt(index)
                            break
                        }
                    }

                    if (currentOptType == StatementType.INSERT_SELECT) {
                        statementData.cteTempTables = cteTempTables
                        return StatementData(StatementType.INSERT_SELECT, statementData, querySql = querySql)
                    }
                }
            }
            return null
        } else if (StringUtils.equalsIgnoreCase("insert", ctx.start.text)) {
            insertSql = true
            val tableContext = ctx.dmlStatementNoWith().getChild(0)
            super.visitDmlStatement(ctx)

            val multipartIdentifier: SparkSqlBaseParser.MultipartIdentifierContext = if (tableContext is SparkSqlBaseParser.InsertIntoTableContext) {
                tableContext.multipartIdentifier()
            } else {
                (tableContext as SparkSqlBaseParser.InsertOverwriteTableContext).multipartIdentifier()
            }

            val (databaseName, tableName) = parseTableName(multipartIdentifier)
            val tableSource = TableSource(databaseName, tableName)
            val token = CommonToken(multipartIdentifier.start.startIndex, multipartIdentifier.stop.stopIndex)
            tableSource.tokens.add(token)
            statementData.outpuTables.add(tableSource)
            statementData.partitions = partitions

            if (StringUtils.endsWithIgnoreCase("into", tableContext.getChild(1).text)) {
                insertMode = InsertMode.INTO
            }
            statementData.insertMode = insertMode

            if (currentOptType == StatementType.INSERT_VALUES) {
                if (values.size != 0) {
                    return StatementData(StatementType.INSERT_VALUES, statementData, values = values)
                } else {
                    return StatementData(StatementType.INSERT_VALUES, statementData, values = singleValues)
                }
            } else {
                return StatementData(StatementType.INSERT_SELECT, statementData, querySql = querySql)
            }
        } else if (StringUtils.equalsIgnoreCase("from", ctx.start.text)) {
            currentOptType = StatementType.MULTI_INSERT
            super.visitDmlStatement(ctx)

            return StatementData(StatementType.MULTI_INSERT, statementData)
        } else if (node is SparkSqlBaseParser.UpdateTableContext ||
                node is SparkSqlBaseParser.DeleteFromTableContext ||
                node is SparkSqlBaseParser.MergeIntoTableContext) {
            return super.visitDmlStatement(ctx)
        } else {
            return null
        }
    }

    //-----------------------------------delta sql-------------------------------------------------

    override fun visitDeleteFromTable(ctx: SparkSqlBaseParser.DeleteFromTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val where = if (ctx.whereClause() != null) StringUtils.substring(command, ctx.whereClause().start.stopIndex + 1) else null

        val update = DeleteTable(databaseName, tableName, StringUtils.trim(where))
        return StatementData(StatementType.DELETE, update)
    }

    override fun visitUpdateTable(ctx: SparkSqlBaseParser.UpdateTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val upset = ctx.setClause().assignmentList().assignment().filter { it is SparkSqlBaseParser.AssignmentContext }.map {
            val assign = it as SparkSqlBaseParser.AssignmentContext
            assign.key.text to assign.value.text
        }.toMap()
        val where = if (ctx.whereClause() != null) StringUtils.substring(command, ctx.whereClause().start.stopIndex + 1) else null

        val update = UpdateTable(databaseName, tableName, upset, StringUtils.trim(where))
        return StatementData(StatementType.UPDATE, update)
    }

    override fun visitVacuumTable(ctx: SparkSqlBaseParser.VacuumTableContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val num = if (ctx.num != null) ctx.num.text.toInt() else null
        val update = VacuumTable(databaseName, tableName, num)
        return StatementData(StatementType.VACUUM, update)
    }

    override fun visitDescribeDeltaDetail(ctx: SparkSqlBaseParser.DescribeDeltaDetailContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val update = DetailTable(databaseName, tableName)
        return StatementData(StatementType.DESC_DETAIL, update)
    }

    override fun visitDescribeDeltaHistory(ctx: SparkSqlBaseParser.DescribeDeltaHistoryContext): StatementData {
        val (databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val num = if (ctx.limit != null) ctx.limit.text.toInt() else null
        val update = HistoryTable(databaseName, tableName, num)
        return StatementData(StatementType.DESC_HISTORY, update)
    }

    override fun visitMergeIntoTable(ctx: SparkSqlBaseParser.MergeIntoTableContext): StatementData {
        currentOptType = StatementType.MERGE_INTO_TABLE

        val (targetDatabase, targetTableName) = parseTableName(ctx.target)
        var targetTable = TableSource(targetDatabase, targetTableName)
        val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
        targetTable.tokens.add(token)

        val deltaMerge = DeltaMerge(targetTable = targetTable)

        if (ctx.source != null) {
            val (sourceDatabase, sourceTableName) = parseTableName(ctx.source)

            val sourceTable = TableSource(sourceDatabase, sourceTableName)
            val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
            sourceTable.tokens.add(token)
            deltaMerge.sourceTables.add(sourceTable)
        } else if (ctx.sourceQuery != null && ctx.sourceQuery is SparkSqlBaseParser.QueryContext) {
            val query = ctx.sourceQuery as SparkSqlBaseParser.QueryContext
            super.visitQuery(query)

            deltaMerge.sourceTables.addAll(statementData.inputTables)
        }
        return StatementData(StatementType.MERGE_INTO_TABLE, deltaMerge)
    }

    override fun visitDeltaConvert(ctx: SparkSqlBaseParser.DeltaConvertContext): StatementData {
        val (targetDatabase, targetTableName) = parseTableName(ctx.multipartIdentifier())
        var format = ctx.format.text
        var deltaConvert = DeltaConvert(targetDatabase, targetTableName, format)

        return StatementData(StatementType.DELTA_CONVERT, deltaConvert)
    }

    //-----------------------------------private method-------------------------------------------------

    override fun visitQueryTermDefault(ctx: SparkSqlBaseParser.QueryTermDefaultContext): StatementData? {
        if (querySql == null) {
            querySql = StringUtils.substring(command, ctx.start.startIndex)
        }
        return super.visitQueryTermDefault(ctx)
    }

    override fun visitNamedQuery(ctx: SparkSqlBaseParser.NamedQueryContext): StatementData? {
        if (isCTE) {
            cteTempTables.add(ctx.getChild(0).text)
        }
        return super.visitNamedQuery(ctx)
    }

    override fun visitMultipartIdentifier(ctx: SparkSqlBaseParser.MultipartIdentifierContext): StatementData? {
        if (currentOptType == null) {
            return null
        }
        var (databaseName, tableName, metaAction) = parseTableName(ctx)
        if (currentOptType == StatementType.CREATE_TABLE_AS_SELECT ||
                currentOptType == StatementType.SELECT ||
                currentOptType == StatementType.INSERT_SELECT ||
                currentOptType == StatementType.MERGE_INTO_TABLE ||
                currentOptType == StatementType.EXPORT_TABLE ||
                currentOptType == StatementType.DISTCP_DATASOURCE) {

            if (StringUtils.isBlank(databaseName)) {
                if (StringUtils.equalsIgnoreCase("druid", ctx.getChild(0).text)) {
                    databaseName = "druid"
                }
            }

            val tableSource = TableSource(databaseName, tableName, metaAction)
            val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)

            val index = statementData.inputTables.indexOf(tableSource)
            if (index == -1) {
                tableSource.tokens.add(token);
                statementData.inputTables.add(tableSource)
            } else {
                statementData.inputTables.get(index).tokens.add(token)
            }
        } else if (currentOptType == StatementType.MULTI_INSERT) {
            val tableSource = TableSource(databaseName, tableName, metaAction)
            val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
            tableSource.tokens.add(token)
            if ("from" == multiInsertToken) {
                statementData.inputTables.add(tableSource)
            }
        }
        return null
    }

    override fun visitInlineTableDefault1(ctx: SparkSqlBaseParser.InlineTableDefault1Context): StatementData? {
        currentOptType = StatementType.INSERT_VALUES
        return super.visitInlineTableDefault1(ctx)
    }

    override fun visitRowConstructor(ctx: SparkSqlBaseParser.RowConstructorContext): StatementData? {
        val row = ctx.children.filter { it is SparkSqlBaseParser.NamedExpressionContext }.map {
            var text = it.text
            text = StringUtil.cleanQuote(text)
            text
        }.toList()

        values.add(row)
        return super.visitRowConstructor(ctx)
    }

    override fun visitPartitionVal(ctx: SparkSqlBaseParser.PartitionValContext): StatementData? {
        if (ctx.childCount == 1) {
            partitions.put(ctx.getChild(0).text, "__dynamic__")
        } else {
            var value = ctx.getChild(2).text
            value = StringUtil.cleanQuote(value)
            partitions.put(ctx.getChild(0).text, value)
        }
        return super.visitPartitionVal(ctx)
    }

    override fun visitInlineTable(ctx: SparkSqlBaseParser.InlineTableContext): StatementData? {
        ctx.children.filter { it is SparkSqlBaseParser.ExpressionContext }.forEach {
            var text = it.text
            text = StringUtils.substringBetween(text, "(", ")").trim()
            text = StringUtil.cleanQuote(text)
            val list = listOf(text)
            singleValues.add(list)
        }

        return super.visitInlineTable(ctx)
    }

    override fun visitQueryPrimaryDefault(ctx: SparkSqlBaseParser.QueryPrimaryDefaultContext?): StatementData? {
        if (insertSql) {
            currentOptType = StatementType.INSERT_SELECT
        }
        return super.visitQueryPrimaryDefault(ctx)
    }

    override fun visitFromClause(ctx: SparkSqlBaseParser.FromClauseContext): StatementData? {
        multiInsertToken = "from"
        return super.visitFromClause(ctx)
    }

    override fun visitMultiInsertQueryBody(ctx: SparkSqlBaseParser.MultiInsertQueryBodyContext): StatementData? {
        multiInsertToken = "insert"
        val obj = ctx.insertInto()
        if (obj is SparkSqlBaseParser.InsertOverwriteTableContext) {
            val multipartIdentifier = obj.multipartIdentifier()
            val (databaseName, tableName) = parseTableName(multipartIdentifier)

            val tableSource = TableSource(databaseName, tableName)
            val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
            tableSource.tokens.add(token)
            statementData.outpuTables.add(tableSource)
        } else if (obj is SparkSqlBaseParser.InsertIntoTableContext) {
            val multipartIdentifier = obj.multipartIdentifier()
            val (databaseName, tableName) = parseTableName(multipartIdentifier)

            val tableSource = TableSource(databaseName, tableName)
            val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
            tableSource.tokens.add(token)
            statementData.outpuTables.add(tableSource)
        }
        return super.visitMultiInsertQueryBody(ctx)
    }

    override fun visitQueryOrganization(ctx: SparkSqlBaseParser.QueryOrganizationContext): StatementData? {
        limit = ctx.limit?.text?.toInt()
        return super.visitQueryOrganization(ctx)
    }

    /**
     * 表列支持数据类型
     */
    private fun checkColumnDataType(dataType: String): Boolean {
        if (StringUtils.startsWithIgnoreCase(dataType, "decimal")) {
            return true
        }

        return when (dataType.toLowerCase()) {
            "string", "int", "bigint", "double", "date", "timestamp", "boolean" -> true
            else -> throw IllegalStateException("不支持数据类型：" + dataType)
        }
    }

    /**
     * 分区支持数据类型
     */
    private fun checkPartitionDataType(dataType: String): Boolean {
        return when (dataType.toLowerCase()) {
            "string", "int", "bigint" -> true
            else -> throw IllegalStateException("不支持数据类型：" + dataType)
        }
    }
}
