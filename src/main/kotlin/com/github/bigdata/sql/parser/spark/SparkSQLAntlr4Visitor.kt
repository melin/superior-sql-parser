package com.github.bigdata.sql.parser.spark

import com.github.bigdata.sql.antlr4.spark.SparkSqlBaseBaseVisitor
import com.github.bigdata.sql.antlr4.spark.SparkSqlBaseParser
import com.github.bigdata.sql.parser.*
import com.github.bigdata.sql.parser.util.StringUtil
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang.StringUtils
import java.lang.IllegalStateException
import java.lang.StringBuilder
import java.util.LinkedHashMap

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

    private var isCTE: Boolean = false;
    private var cteTempTables: ArrayList<String> = ArrayList()

    override fun visit(tree: ParseTree?): StatementData {
        val data = super.visit(tree)

        if (data == null) {
            throw SQLParserException("不支持的SQL: " + command)
        }

        return data
    }

    //-----------------------------------database-------------------------------------------------

    override fun visitCreateDatabase(ctx: SparkSqlBaseParser.CreateDatabaseContext): StatementData {
        val databaseName = ctx.identifier().text
        val location = ctx.locationSpec()?.getStop()?.text

        val sqlData = DcDatabase(databaseName, location)
        return StatementData(StatementType.CREATE_DATABASE, sqlData)
    }

    override fun visitDropDatabase(ctx: SparkSqlBaseParser.DropDatabaseContext): StatementData {
        val databaseName = ctx.identifier().text
        val sqlData = DcDatabase(databaseName)
        return StatementData(StatementType.DROP_DATABASE, sqlData)
    }

    override fun visitDescribeDatabase(ctx: SparkSqlBaseParser.DescribeDatabaseContext): StatementData {
        val databaseName = ctx.identifier().text
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
        val databaseName = ctx.createTableHeader().tableIdentifier().db?.text
        val tableName = ctx.createTableHeader().tableIdentifier().table.text
        val lifeCycle = ctx.lifecycle?.text?.toInt()

        var partitionColumnNames: List<String>? = null
        if (ctx.query() != null) {
            if (ctx.partitionColumnNames != null) {
                partitionColumnNames = arrayListOf<String>()
                val identifierSeqContext = ctx.partitionColumnNames.getChild(1) as SparkSqlBaseParser.IdentifierSeqContext
                identifierSeqContext.children.map { item ->
                    if (item is SparkSqlBaseParser.IdentifierContext) {
                        val value = item.getChild(0)
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
                val key = StringUtil.cleanSingleQuote(property.key.text)
                val value = StringUtil.cleanSingleQuote(property.value.text)
                properties.put(key, value)
            }
        }
        val fileFormate = "PARQUET" //TODO

        val dcTable = DcTable(databaseName, tableName, null, lifeCycle, null, null, properties, fileFormate)
        dcTable.ifNotExists = ctx.createTableHeader().NOT() != null
        dcTable.external = ctx.createTableHeader().EXTERNAL() != null
        dcTable.temporary = ctx.createTableHeader().TEMPORARY() != null
        dcTable.location = ctx.locationSpec().size > 0
        if (dcTable.location) {
            dcTable.locationPath = ctx.locationSpec().get(0).text
        }
        dcTable.partitionColumnNames = partitionColumnNames

        currentOptType = StatementType.CREATE_TABLE_AS_SELECT
        var querySql = StringUtils.substring(command, ctx.query().start.startIndex)
        if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
            querySql = StringUtils.substringBetween(querySql, "(", ")")
        }

        dcTable.querySql = querySql
        super.visitQuery(ctx.query())
        dcTable.tableData = statementData
        return StatementData(StatementType.CREATE_TABLE_AS_SELECT, dcTable)
    }

    override fun visitCreateHiveTable(ctx: SparkSqlBaseParser.CreateHiveTableContext): StatementData {
        val databaseName = ctx.createTableHeader().tableIdentifier().db?.text
        val tableName = ctx.createTableHeader().tableIdentifier().table.text
        val comment = if (ctx.comment != null) StringUtil.cleanSingleQuote(ctx.comment.text) else null
        val lifeCycle = ctx.lifecycle?.text?.toInt()

        var partitionColumns: List<DcColumn>? = null
        var partitionColumnNames: List<String>? = null
        var columns: List<DcColumn>? = null
        if (ctx.query() == null) {
            if (ctx.partitionColumns != null) {
                partitionColumns = ctx.partitionColumns.children
                        .filter { it is SparkSqlBaseParser.ColTypeContext }.map { item ->
                            val column = item as SparkSqlBaseParser.ColTypeContext
                            val colName = column.identifier().text
                            var dataType = column.dataType().text
                            checkPartitionDataType(dataType)

                            val colComment = if (column.STRING() != null) StringUtil.cleanSingleQuote(column.STRING().text) else null
                            DcColumn(colName, dataType, colComment)
                        }
            }

            if (ctx.columns != null) {
                columns = ctx.columns.children
                        .filter { it is SparkSqlBaseParser.ColTypeContext }.map { item ->
                            val column = item as SparkSqlBaseParser.ColTypeContext
                            val colName = column.identifier().text
                            var dataType = column.dataType().text
                            //checkColumnDataType(dataType)

                            val colComment = if (column.STRING() != null) StringUtil.cleanSingleQuote(column.STRING().text) else null
                            DcColumn(colName, dataType, colComment)
                        }
            }
        } else {
            if (ctx.partitionColumnNames != null) {
                partitionColumnNames = arrayListOf<String>()
                val identifierSeqContext = ctx.partitionColumnNames.getChild(1) as SparkSqlBaseParser.IdentifierSeqContext
                identifierSeqContext.children.map { item ->
                    if (item is SparkSqlBaseParser.IdentifierContext) {
                        val value = item.getChild(0)
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
                var key = StringUtil.cleanSingleQuote(property.key.text)
                var value = StringUtil.cleanSingleQuote(property.value.text)
                key = StringUtil.cleanDoubleQuote(key)
                value = StringUtil.cleanDoubleQuote(value)
                properties.put(key, value)
            }
        }

        var fileFormate = "PARQUET"
        if (ctx.createFileFormat().size == 1) {
            fileFormate = ctx.createFileFormat().get(0).fileFormat().text
        }

        val dcTable = DcTable(databaseName, tableName, comment, lifeCycle, partitionColumns, columns, properties, fileFormate)
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
            val querySql = StringUtils.substring(command, ctx.query().start.startIndex)
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
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        if (ctx.VIEW() != null) {
            val dcView = DcView(databaseName, tableName)
            dcView.ifExists = ctx.EXISTS() != null
            return StatementData(StatementType.DROP_VIEW, dcView)
        } else {
            val dcTable = DcTable(databaseName, tableName)
            dcTable.ifExists = ctx.EXISTS() != null
            return StatementData(StatementType.DROP_TABLE, dcTable)
        }
    }

    override fun visitTruncateTable(ctx: SparkSqlBaseParser.TruncateTableContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text
        val dcTable = DcTable(databaseName, tableName)
        return StatementData(StatementType.TRUNCATE_TABLE, dcTable)
    }

    override fun visitRepairTable(ctx: SparkSqlBaseParser.RepairTableContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text
        val dcTable = DcTable(databaseName, tableName)
        return StatementData(StatementType.MSCK_TABLE, dcTable)
    }

    override fun visitRenameTable(ctx: SparkSqlBaseParser.RenameTableContext): StatementData {
        val databaseName = ctx.from.db?.text
        val oldname = ctx.from.table.text
        val newname = ctx.to.table.text

        if (ctx.VIEW() != null) {
            val dcView = DcRenameView(databaseName, oldname, newname)
            return StatementData(StatementType.ALTER_VIEW_RENAME, dcView)
        } else {
            val dcTable = DcRenameTable(databaseName, oldname, newname)
            return StatementData(StatementType.ALTER_TABLE_RENAME, dcTable)
        }
    }

    override fun visitSetTableProperties(ctx: SparkSqlBaseParser.SetTablePropertiesContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        var properties = HashMap<String, String>()
        if (ctx.tablePropertyList() != null) {
            ctx.tablePropertyList().children.filter { it is SparkSqlBaseParser.TablePropertyContext }.map { item ->
                val property = item as SparkSqlBaseParser.TablePropertyContext
                val key = StringUtil.cleanSingleQuote(property.key.text)
                val value = StringUtil.cleanSingleQuote(property.value.text)
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
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val columns = ctx.columns.children
                .filter { it is SparkSqlBaseParser.ColTypeContext }.map { item ->
                    val column = item as SparkSqlBaseParser.ColTypeContext
                    val colName = column.identifier().text
                    var dataType = column.dataType().text
                    val colComment = if (column.STRING() != null) StringUtil.cleanSingleQuote(column.STRING().text) else null
                    DcColumn(colName, dataType, colComment)
                }

        val data = DcTable(databaseName, tableName, null, null, null, columns)
        return StatementData(StatementType.ALTER_TABLE_ADD_COLS, data)
    }

    override fun visitChangeColumn(ctx: SparkSqlBaseParser.ChangeColumnContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val oldName = ctx.identifier().text
        val newName = ctx.colType().identifier().text
        val commentNode = ctx.colType()?.STRING()
        val comment = if (commentNode != null) StringUtil.cleanSingleQuote(commentNode.text) else null

        val data = DcAlterColumn(databaseName, tableName, oldName, newName, comment)
        return StatementData(StatementType.ALTER_TABLE_RENAME_COL, data)
    }

    override fun visitSetTableLocation(ctx: SparkSqlBaseParser.SetTableLocationContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val tableSource = TableSource(databaseName, tableName)
        val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
        tableSource.tokens.add(token)
        return StatementData(StatementType.ALTER_TABLE_SET_LOCATION, tableSource)
    }

    override fun visitMergeTable(ctx: SparkSqlBaseParser.MergeTableContext): StatementData {
        val partitionVals = ctx.partitionSpec()?.partitionVal()
                ?.map { partitionValContext -> partitionValContext.text }?.toList()
        val data = MergeData(ctx.tableIdentifier().db?.text, ctx.tableIdentifier().table.text, partitionVals)
        return StatementData(StatementType.MERGE_TABLE, data)
    }

    override fun visitKillJob(ctx: SparkSqlBaseParser.KillJobContext): StatementData {
        val data = KillData(ctx.identifier().text)
        return StatementData(StatementType.KILL, data)
    }

    override fun visitReadTable(ctx: SparkSqlBaseParser.ReadTableContext): StatementData {
        val partitionVals = ctx.partitionSpec()?.partitionVal()
                ?.map { partitionValContext -> partitionValContext.text }?.toList()
        val data = ReadData(ctx.tableIdentifier().db?.text, ctx.tableIdentifier().table.text,
                partitionVals, ctx.number().text.toInt())

        return StatementData(StatementType.READ_TABLE, data)
    }

    override fun visitRefreshTable(ctx: SparkSqlBaseParser.RefreshTableContext): StatementData {
        val data = RefreshData(ctx.tableIdentifier().db?.text, ctx.tableIdentifier().table.text)

        return StatementData(StatementType.REFRESH_TABLE, data)
    }

    override fun visitDescribeTable(ctx: SparkSqlBaseParser.DescribeTableContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.DESC_TABLE, data)
    }

    override fun visitShowColumns(ctx: SparkSqlBaseParser.ShowColumnsContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.SHOW_COLUMNS, data)
    }

    override fun visitShowCreateTable(ctx: SparkSqlBaseParser.ShowCreateTableContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.SHOW_CREATE_TABLE, data)
    }

    override fun visitShowTable(ctx: SparkSqlBaseParser.ShowTableContext): StatementData {
        return StatementData(StatementType.SHOW_TABLE)
    }

    override fun visitShowTblProperties(ctx: SparkSqlBaseParser.ShowTblPropertiesContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.SHOW_TABLE_PROPERTIES, data)
    }

    override fun visitAnalyze(ctx: SparkSqlBaseParser.AnalyzeContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.ANALYZE_TABLE, data)
    }

    override fun visitCompressTable(ctx: SparkSqlBaseParser.CompressTableContext): StatementData {
        val partitionVals = ctx.partitionSpec()?.partitionVal()
                ?.map { partitionValContext -> partitionValContext.text }?.toList()
        val data = CompressTableData(ctx.tableIdentifier().db?.text, ctx.tableIdentifier().table.text, partitionVals)
        return StatementData(StatementType.COMPRESS_TABLE, data)
    }

    override fun visitCompressFile(ctx: SparkSqlBaseParser.CompressFileContext): StatementData {
        return StatementData(StatementType.COMPRESS_FILE, null)
    }

    override fun visitDistcpDatasource(ctx: SparkSqlBaseParser.DistcpDatasourceContext): StatementData {
        var srcDb = ctx.srcTable.db?.text
        var srcTableName = ctx.srcTable.table.text
        val srcTable = TableSource(srcDb, srcTableName)

        var datasource = ctx.ds.text

        var destDb = ctx.destTable.db?.text
        var destTableName = ctx.destTable.table.text
        val destTable = TableSource(destDb, destTableName)

        val partitionVals = ctx.partitionSpec()?.partitionVal()
                ?.map { partitionValContext -> partitionValContext.text }?.toList()

        var properties = HashMap<String, String>()
        if (ctx.sparkOptions() != null) {
            ctx.sparkOptions().optionVal().map { item ->
                val property = item as SparkSqlBaseParser.OptionValContext
                val key = StringUtil.cleanSingleQuote(property.key.text)
                val value = StringUtil.cleanSingleQuote(property.value.text)
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
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

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
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

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
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.ALTER_TABLE_RENAME_PART, data)
    }

    override fun visitShowPartitions(ctx: SparkSqlBaseParser.ShowPartitionsContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.SHOW_PARTITIONS, data)
    }

    //-----------------------------------view-------------------------------------------------

    override fun visitCreateView(ctx: SparkSqlBaseParser.CreateViewContext): StatementData {
        var comment: String? = null
        if (ctx.COMMENT() != null) {
            if (ctx.NOT() == null) {
                comment = StringUtil.cleanSingleQuote(ctx.getChild(4).text)
            } else {
                comment = StringUtil.cleanSingleQuote(ctx.getChild(7).text)
            }
        }

        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text
        val ifNotExists = ctx.NOT() != null

        val dcView = DcView(databaseName, tableName, comment, ifNotExists)
        return StatementData(StatementType.CREATE_VIEW, dcView)
    }

    override fun visitAlterViewQuery(ctx: SparkSqlBaseParser.AlterViewQueryContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val dcView = DcView(databaseName, tableName)
        return StatementData(StatementType.ALTER_VIEW_QUERY, dcView)
    }

    //-----------------------------------function-------------------------------------------------

    override fun visitCreateFunction(ctx: SparkSqlBaseParser.CreateFunctionContext): StatementData {
        val name = ctx.qualifiedName().text
        val classNmae = ctx.className.text
        val file = ctx.resource(0).STRING().text

        val data = DcFunction(name, classNmae, file)
        return StatementData(StatementType.CREATE_FUNCTION, data)
    }

    override fun visitDropFunction(ctx: SparkSqlBaseParser.DropFunctionContext): StatementData {
        val name = ctx.qualifiedName().text
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

    override fun visitAngel(ctx: SparkSqlBaseParser.AngelContext?): StatementData {
        return StatementData(StatementType.ANGEL)
    }

    override fun visitAddJar(ctx: SparkSqlBaseParser.AddJarContext?): StatementData {
        return StatementData(StatementType.ADDJAR)
    }

    override fun visitLoadTempTable(ctx: SparkSqlBaseParser.LoadTempTableContext): StatementData {
        val data = LoadData(ctx.tableIdentifier().db?.text, ctx.tableIdentifier().table.text)
        return StatementData(StatementType.LOAD_TEMP_TABLE, data)
    }

    override fun visitExportTable(ctx: SparkSqlBaseParser.ExportTableContext): StatementData {
        val data = if (StringUtils.equalsIgnoreCase("with", ctx.start.text)) {
            isCTE = true
            val tableIdentifier = ctx.getChild(3) as SparkSqlBaseParser.TableIdentifierContext
            ExportData(tableIdentifier.db?.text, tableIdentifier.table.text, isCTE)
        } else {
            ExportData(ctx.tableIdentifier().db?.text, ctx.tableIdentifier().table.text, isCTE)
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
        val databaseName = ctx.db.text
        val data = DcDatabase(databaseName)
        return StatementData(StatementType.USE, data)
    }

    override fun visitSetConfiguration(ctx: SparkSqlBaseParser.SetConfigurationContext?): StatementData {
        return StatementData(StatementType.SET)
    }

    override fun visitStatusJob(ctx: SparkSqlBaseParser.StatusJobContext?): StatementData {
        return StatementData(StatementType.STATUS)
    }

    //-----------------------------------insert & query-------------------------------------------------

    override fun visitStatementDefault(ctx: SparkSqlBaseParser.StatementDefaultContext): StatementData? {
        if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitQuery(ctx.query())

            statementData.limit = limit
            return StatementData(StatementType.SELECT, statementData)
        } else if (StringUtils.equalsIgnoreCase("with", ctx.start.text)) {
            isCTE = true

            val node = ctx.getChild(0).getChild(1)
            if (node is SparkSqlBaseParser.SingleInsertQueryContext) {
                if (StringUtils.equalsIgnoreCase("select", node.start.text)) {
                    currentOptType = StatementType.SELECT
                    super.visitQuery(ctx.query())
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
                } else if (StringUtils.equalsIgnoreCase("insert", node.start.text)) {
                    super.visitQuery(ctx.query())

                    val tableContext = node.getChild(0)
                    val tableIdentifier: SparkSqlBaseParser.TableIdentifierContext = if (tableContext is SparkSqlBaseParser.InsertIntoTableContext) {
                        tableContext.tableIdentifier()
                    } else {
                        (tableContext as SparkSqlBaseParser.InsertOverwriteTableContext).tableIdentifier()
                    }

                    val databaseName = tableIdentifier.db?.text
                    val tableName = tableIdentifier.table.text
                    val tableSource = TableSource(databaseName, tableName)
                    val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
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
            super.visitQuery(ctx.query())

            val tableContext = ctx.query().queryNoWith().getChild(0)
            val tableIdentifier: SparkSqlBaseParser.TableIdentifierContext = if (tableContext is SparkSqlBaseParser.InsertIntoTableContext) {
                tableContext.tableIdentifier()
            } else {
                (tableContext as SparkSqlBaseParser.InsertOverwriteTableContext).tableIdentifier()
            }

            val databaseName = tableIdentifier.db?.text
            val tableName = tableIdentifier.table.text
            val tableSource = TableSource(databaseName, tableName)
            val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
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
            super.visitQuery(ctx.query())

            return StatementData(StatementType.MULTI_INSERT, statementData)
        } else {
            return null
        }
    }

    //-----------------------------------delta sql-------------------------------------------------

    override fun visitDeleteFromTable(ctx: SparkSqlBaseParser.DeleteFromTableContext): StatementData {
        val databaseName = ctx.table.db?.text
        val tableName = ctx.table.table.text
        val where = if (ctx.where != null) StringUtils.substring(command, ctx.where.start.startIndex) else null

        val update = DeleteTable(databaseName, tableName, StringUtils.trim(where))
        return StatementData(StatementType.DELETE, update)
    }

    override fun visitUpdateTable(ctx: SparkSqlBaseParser.UpdateTableContext): StatementData {
        val databaseName = ctx.table.db?.text
        val tableName = ctx.table.table.text
        val upset = ctx.upset.children.filter { it is SparkSqlBaseParser.AssignContext }.map {
            val assign = it as SparkSqlBaseParser.AssignContext
            assign.key.text to assign.value.text
        }.toMap()
        val where = if (ctx.where != null) StringUtils.substring(command, ctx.where.start.startIndex) else null

        val update = UpdateTable(databaseName, tableName, upset, StringUtils.trim(where))
        return StatementData(StatementType.UPDATE, update)
    }

    override fun visitVacuumTable(ctx: SparkSqlBaseParser.VacuumTableContext): StatementData {
        val databaseName = ctx.table.db?.text
        val tableName = ctx.table.table.text

        val num = if (ctx.num != null) ctx.num.text.toInt() else null
        val update = VacuumTable(databaseName, tableName, num)
        return StatementData(StatementType.VACUUM, update)
    }

    override fun visitDescribeDeltaDetail(ctx: SparkSqlBaseParser.DescribeDeltaDetailContext): StatementData {
        val databaseName = ctx.table.db?.text
        val tableName = ctx.table.table.text

        val update = DetailTable(databaseName, tableName)
        return StatementData(StatementType.DESC_DETAIL, update)
    }

    override fun visitDescribeDeltaHistory(ctx: SparkSqlBaseParser.DescribeDeltaHistoryContext): StatementData {
        val databaseName = ctx.table.db?.text
        val tableName = ctx.table.table.text

        val num = if (ctx.limit != null) ctx.limit.text.toInt() else null
        val update = HistoryTable(databaseName, tableName, num)
        return StatementData(StatementType.DESC_HISTORY, update)
    }

    override fun visitDeltaMerge(ctx: SparkSqlBaseParser.DeltaMergeContext): StatementData {
        currentOptType = StatementType.DELTA_MERGE

        var targetDatabase = ctx.target.db?.text
        var targetTableName = ctx.target.table.text
        var targetTable = TableSource(targetDatabase, targetTableName)
        val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
        targetTable.tokens.add(token)

        val deltaMerge = DeltaMerge(targetTable = targetTable)

        if (ctx.source != null) {
            var sourceDatabase = ctx.source.db?.text
            var sourceTableName = ctx.source.table.text

            val sourceTable = TableSource(sourceDatabase, sourceTableName)
            val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
            sourceTable.tokens.add(token)
            deltaMerge.sourceTables.add(sourceTable)
        } else if (ctx.sourceQuery != null && ctx.sourceQuery is SparkSqlBaseParser.QueryContext) {
            val query = ctx.sourceQuery as SparkSqlBaseParser.QueryContext
            super.visitQuery(query)

            deltaMerge.sourceTables.addAll(statementData.inputTables)
        }
        return StatementData(StatementType.DELTA_MERGE, deltaMerge)
    }

    override fun visitDeltaConvert(ctx: SparkSqlBaseParser.DeltaConvertContext): StatementData {
        var targetDatabase = ctx.table.db?.text
        var targetTableName = ctx.table.table.text
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

    override fun visitTableIdentifier(ctx: SparkSqlBaseParser.TableIdentifierContext): StatementData? {
        if (currentOptType == null) {
            return null
        }
        if (currentOptType == StatementType.CREATE_TABLE_AS_SELECT ||
                currentOptType == StatementType.SELECT ||
                currentOptType == StatementType.INSERT_SELECT ||
                currentOptType == StatementType.EXPORT_TABLE ||
                currentOptType == StatementType.DISTCP_DATASOURCE) {

            var db = ctx.db?.text
            if (StringUtils.isBlank(db)) {
                if (StringUtils.equalsIgnoreCase("druid", ctx.getChild(0).text)) {
                    db = "druid"
                }
            }

            val tableSource = TableSource(db, ctx.table.text)
            val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)

            val index = statementData.inputTables.indexOf(tableSource)
            if (index == -1) {
                tableSource.tokens.add(token);
                statementData.inputTables.add(tableSource)
            } else {
                statementData.inputTables.get(index).tokens.add(token)
            }
        } else if (currentOptType == StatementType.MULTI_INSERT) {
            val tableSource = TableSource(ctx.db?.text, ctx.table.text)
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
            text = StringUtil.cleanSingleQuote(text)
            text = StringUtil.cleanDoubleQuote(text)
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
            value = StringUtil.cleanSingleQuote(value)
            value = StringUtil.cleanDoubleQuote(value)
            partitions.put(ctx.getChild(0).text, value)
        }
        return super.visitPartitionVal(ctx)
    }

    override fun visitInlineTable(ctx: SparkSqlBaseParser.InlineTableContext): StatementData? {
        ctx.children.filter { it is SparkSqlBaseParser.ExpressionContext }.forEach {
            var text = it.text
            text = StringUtils.substringBetween(text, "(", ")").trim()
            text = StringUtil.cleanSingleQuote(text)
            text = StringUtil.cleanDoubleQuote(text)
            val list = listOf(text)
            singleValues.add(list)
        }

        return super.visitInlineTable(ctx)
    }

    override fun visitQuerySpecification(ctx: SparkSqlBaseParser.QuerySpecificationContext): StatementData? {
        currentOptType = StatementType.INSERT_SELECT
        return super.visitQuerySpecification(ctx)
    }

    override fun visitFromClause(ctx: SparkSqlBaseParser.FromClauseContext): StatementData? {
        multiInsertToken = "from"
        return super.visitFromClause(ctx)
    }

    override fun visitMultiInsertQueryBody(ctx: SparkSqlBaseParser.MultiInsertQueryBodyContext): StatementData? {
        multiInsertToken = "insert"
        val obj = ctx.insertInto()
        if (obj is SparkSqlBaseParser.InsertOverwriteTableContext) {
            val tableIdentifier = obj.tableIdentifier()
            val tableSource = TableSource(tableIdentifier.db?.text, tableIdentifier.table.text)
            val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
            tableSource.tokens.add(token)
            statementData.outpuTables.add(tableSource)
        } else if (obj is SparkSqlBaseParser.InsertIntoTableContext) {
            val tableIdentifier = obj.tableIdentifier()
            val tableSource = TableSource(tableIdentifier.db?.text, tableIdentifier.table.text)
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

    fun setCommand(command: String) {
        this.command = command
    }

    override fun shouldVisitNextChild(node: RuleNode?, currentResult: StatementData?): Boolean {
        return currentResult == null
    }
}