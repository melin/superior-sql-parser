package com.github.bigdata.sql.parser.spark

import com.github.bigdata.sql.antlr4.spark.SparkSqlBaseBaseVisitor
import com.github.bigdata.sql.antlr4.spark.SparkSqlBaseParser
import com.github.bigdata.sql.parser.*
import com.github.bigdata.sql.parser.util.StringUtil
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang.StringUtils
import java.lang.IllegalStateException

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class SparkSQLAntlr4Visitor : SparkSqlBaseBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private val statementData = TableData();
    private var multiInsertToken:String? = null
    private var limit:Int? = null
    private var command: String? = null

    override fun visit(tree: ParseTree?): StatementData {
        val data = super.visit(tree)

        if (data == null) {
            throw SQLParserException("不支持的SQL")
        }

        return data;
    }

    //-----------------------------------database-------------------------------------------------

    override fun visitCreateDatabase(ctx: SparkSqlBaseParser.CreateDatabaseContext): StatementData {
        val databaseName = ctx.identifier().text
        val sqlData = DcDatabase(databaseName)
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

    override fun visitCreateHiveTable(ctx: SparkSqlBaseParser.CreateHiveTableContext): StatementData {
        val databaseName = ctx.createTableHeader().tableIdentifier().db?.text;
        val tableName = ctx.createTableHeader().tableIdentifier().table.text;
        val comment = if(ctx.comment != null) StringUtil.cleanSingleQuote(ctx.comment.text) else null
        val lifeCycle = ctx.lifecycle?.text?.toInt()

        var partitionColumns: List<DcColumn>? = null
        var columns: List<DcColumn>? = null
        if(ctx.query() == null) {
            if(ctx.partitionColumns != null) {
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

            if(ctx.columns != null) {
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
        }

        var properties = HashMap<String, String>()
        if(ctx.tableProps != null) {
            ctx.tableProps.children.filter { it is SparkSqlBaseParser.TablePropertyContext }.map { item ->
                val property = item as SparkSqlBaseParser.TablePropertyContext
                val key = StringUtil.cleanSingleQuote(property.key.text);
                val value = StringUtil.cleanSingleQuote(property.value.text);
                properties.put(key, value)
            }
        }

        val fileFormate = "PARQUET" //TODO

        val dcTable = DcTable(databaseName, tableName, comment, lifeCycle, partitionColumns, columns, properties, fileFormate)
        dcTable.ifNotExists = if (ctx.createTableHeader().NOT() != null) true else false
        dcTable.external = if (ctx.createTableHeader().EXTERNAL() != null) true else false
        dcTable.temporary = if (ctx.createTableHeader().TEMPORARY() != null) true else false
        dcTable.location = if (ctx.locationSpec().size > 0) true else false

        if(ctx.query() != null) {
            currentOptType = StatementType.CREATE_TABLE_AS_SELECT
            val querySql = StringUtils.substring(command, ctx.query().start.startIndex)
            dcTable.querySql = querySql
            super.visitQuery(ctx.query())
            dcTable.tableData = statementData;
            return StatementData(StatementType.CREATE_TABLE_AS_SELECT, dcTable)
        } else {
            return StatementData(StatementType.CREATE_TABLE, dcTable)
        }
    }

    override fun visitCreateTableLike(ctx: SparkSqlBaseParser.CreateTableLikeContext): StatementData {
        val newDatabaseName = ctx.target.db?.text;
        val newTableName = ctx.target.table.text;

        val oldDatabaseName = ctx.source.db?.text;
        val oldTableName = ctx.source.table.text;

        val dcTable = DcCopyTable(oldDatabaseName, oldTableName, newDatabaseName, newTableName)
        dcTable.ifNotExists = if (ctx.NOT() != null) true else false

        return return StatementData(StatementType.CREATE_TABLE_AS_LIKE, dcTable)
    }

    override fun visitDropTable(ctx: SparkSqlBaseParser.DropTableContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        if(ctx.VIEW() != null) {
            val dcView = DcView(databaseName, tableName)
            dcView.ifExists = if (ctx.EXISTS() != null) true else false
            return return StatementData(StatementType.DROP_VIEW, dcView)
        } else {
            val dcTable = DcTable(databaseName, tableName)
            dcTable.ifExists = if (ctx.EXISTS() != null) true else false
            return return StatementData(StatementType.DROP_TABLE, dcTable)
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

        if(ctx.VIEW() != null) {
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
        if(ctx.tablePropertyList() != null) {
            ctx.tablePropertyList().children.filter { it is SparkSqlBaseParser.TablePropertyContext }.map { item ->
                val property = item as SparkSqlBaseParser.TablePropertyContext
                val key = StringUtil.cleanSingleQuote(property.key.text);
                val value = StringUtil.cleanSingleQuote(property.value.text);
                properties.put(key, value)
            }
        }

        val data = DcTable(databaseName, tableName, null, null, null, null, properties, null)
        if(ctx.VIEW() == null) {
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
            val colComment = if(column.STRING() != null) StringUtil.cleanSingleQuote(column.STRING().text) else null
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
        val comment = if(commentNode != null) StringUtil.cleanSingleQuote(commentNode?.text) else null

        val data = DcAlterColumn(databaseName, tableName, oldName, newName, comment)
        return StatementData(StatementType.ALTER_TABLE_RENAME_COL, data)
    }

    override fun visitSetTableLocation(ctx: SparkSqlBaseParser.SetTableLocationContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val tableSource = TableSource(databaseName, tableName)
        return StatementData(StatementType.ALTER_TABLE_SET_LOCATION, tableSource)
    }

    override fun visitMergeTable(ctx: SparkSqlBaseParser.MergeTableContext): StatementData {
        val partitionVals = ctx.partitionSpec()?.partitionVal()
                ?.map { partitionValContext ->  partitionValContext.text}?.toList()
        val data = MergeData(ctx.tableIdentifier().db?.text, ctx.tableIdentifier().table.text, partitionVals)
        return StatementData(StatementType.MERGE_TABLE, data)
    }

    override fun visitKillJob(ctx: SparkSqlBaseParser.KillJobContext): StatementData {
        val data = KillData(ctx.jobIdentifier().text)
        return StatementData(StatementType.KILL, data)
    }

    override fun visitReadTable(ctx: SparkSqlBaseParser.ReadTableContext): StatementData {
        val partitionVals = ctx.partitionSpec()?.partitionVal()
                ?.map { partitionValContext ->  partitionValContext.text}?.toList()
        val data = ReadData(ctx.tableIdentifier().db?.text, ctx.tableIdentifier().table.text,
                partitionVals, ctx.number().text.toInt())

        return StatementData(StatementType.READ_TABLE, data)
    }

    override fun visitLoadData(ctx: SparkSqlBaseParser.LoadDataContext): StatementData {
        val partitionVals = ctx.partitionSpec()?.partitionVal()
                ?.map { partitionValContext ->  partitionValContext.text}?.toList()

        val resName = ctx.resName.text.substring(1, ctx.resName.text.length-1)
        val data = LoadData(ctx.tableIdentifier().db?.text, ctx.tableIdentifier().table.text,
                ctx.loadMode.text, resName, partitionVals)

        return StatementData(StatementType.LOAD_TABLE, data)
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

    //-----------------------------------partition-------------------------------------------------

    override fun visitAddTablePartition(ctx: SparkSqlBaseParser.AddTablePartitionContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val data = DcTable(databaseName, tableName)
        return StatementData(StatementType.ALTER_TABLE_ADD_PARTS, data)
    }

    override fun visitDropTablePartitions(ctx: SparkSqlBaseParser.DropTablePartitionsContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val data = DcTable(databaseName, tableName)
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
        var comment:String? = null;
        if(ctx.COMMENT() != null) {
            if(ctx.NOT() == null) {
                comment = StringUtil.cleanSingleQuote(ctx.getChild(4).text)
            } else {
                comment = StringUtil.cleanSingleQuote(ctx.getChild(7).text)
            }
        }

        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text
        val ifNotExists = if (ctx.NOT() != null) true else false

        val dcView = DcView(databaseName, tableName, comment, ifNotExists);
        return StatementData(StatementType.CREATE_VIEW, dcView)
    }

    override fun visitAlterViewQuery(ctx: SparkSqlBaseParser.AlterViewQueryContext): StatementData {
        val databaseName = ctx.tableIdentifier().db?.text
        val tableName = ctx.tableIdentifier().table.text

        val dcView = DcView(databaseName, tableName);
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
        return StatementData(StatementType.DESC_TABLE, data)
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

    override fun visitExportCSV(ctx: SparkSqlBaseParser.ExportCSVContext): StatementData {
        val data = ExportData(ctx.tableIdentifier().db?.text, ctx.tableIdentifier().table.text)

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

    //-----------------------------------insert & query-------------------------------------------------

    override fun visitStatementDefault(ctx: SparkSqlBaseParser.StatementDefaultContext): StatementData? {
        if(StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitQuery(ctx.query())

            statementData.limit = limit
            return StatementData(StatementType.SELECT, statementData)
        } else if(StringUtils.equalsIgnoreCase("insert", ctx.start.text)) {
            super.visitQuery(ctx.query())

            val tableContext = ctx.query().queryNoWith().getChild(0)
            val tableIdentifier: SparkSqlBaseParser.TableIdentifierContext
                    = if(tableContext is SparkSqlBaseParser.InsertIntoTableContext) {
                tableContext.tableIdentifier()
            } else {
                (tableContext as SparkSqlBaseParser.InsertOverwriteTableContext).tableIdentifier()
            }

            val databaseName = tableIdentifier.db?.text
            val tableName = tableIdentifier.table.text
            val tableSource = TableSource(databaseName, tableName)
            statementData.outpuTables.add(tableSource)

            if(currentOptType == StatementType.INSERT_VALUES) {
                return StatementData(StatementType.INSERT_VALUES, statementData)
            } else {
                return StatementData(StatementType.INSERT_SELECT, statementData)
            }
        } else if(StringUtils.equalsIgnoreCase("from", ctx.start.text)) {
            currentOptType = StatementType.MULTI_INSERT
            super.visitQuery(ctx.query())

            return StatementData(StatementType.MULTI_INSERT, statementData)
        } else {
            return null
        }
    }

    //-----------------------------------private method-------------------------------------------------

    override fun visitTableIdentifier(ctx: SparkSqlBaseParser.TableIdentifierContext): StatementData? {
        if(currentOptType == null) {
            return null
        }
        if(currentOptType == StatementType.CREATE_TABLE_AS_SELECT ||
                currentOptType == StatementType.SELECT ||
                currentOptType == StatementType.INSERT_SELECT) {
            val tableSource = TableSource(ctx.db?.text, ctx.table.text)
            statementData.inputTables.add(tableSource)
        } else if(currentOptType == StatementType.MULTI_INSERT) {
            val tableSource = TableSource(ctx.db?.text, ctx.table.text)
            if("from" == multiInsertToken) {
                statementData.inputTables.add(tableSource)
            }
        }
        return null
    }

    override fun visitInlineTableDefault1(ctx: SparkSqlBaseParser.InlineTableDefault1Context): StatementData? {
        currentOptType = StatementType.INSERT_VALUES
        return null
    }

    override fun visitQuerySpecification(ctx: SparkSqlBaseParser.QuerySpecificationContext): StatementData? {
        currentOptType = StatementType.INSERT_SELECT
        super.visitQuerySpecification(ctx)
        return null
    }

    override fun visitFromClause(ctx: SparkSqlBaseParser.FromClauseContext): StatementData? {
        multiInsertToken = "from"
        super.visitFromClause(ctx)
        return null
    }

    override fun visitMultiInsertQueryBody(ctx: SparkSqlBaseParser.MultiInsertQueryBodyContext): StatementData? {
        multiInsertToken = "insert"
        val obj = ctx.insertInto();
        if(obj is SparkSqlBaseParser.InsertOverwriteTableContext) {
            val tableIdentifier = obj.tableIdentifier()
            val tableSource = TableSource(tableIdentifier.db?.text, tableIdentifier.table.text)
            statementData.outpuTables.add(tableSource)
        } else if(obj is SparkSqlBaseParser.InsertIntoTableContext) {
            val tableIdentifier = obj.tableIdentifier()
            val tableSource = TableSource(tableIdentifier.db?.text, tableIdentifier.table.text)
            statementData.outpuTables.add(tableSource)
        }
        return null;
    }

    override fun visitQueryOrganization(ctx: SparkSqlBaseParser.QueryOrganizationContext): StatementData? {
        limit = ctx.limit?.text?.toInt()
        return null
    }

    /**
     * 表列支持数据类型
     */
    private fun checkColumnDataType(dataType : String) : Boolean {
        if(StringUtils.startsWithIgnoreCase(dataType, "decimal")) {
            return true
        }

        return when(dataType.toLowerCase()) {
            "string" , "int", "bigint", "double", "date", "timestamp", "boolean" -> true
            else -> throw IllegalStateException("不支持数据类型：" + dataType)
        }
    }

    /**
     * 分区支持数据类型
     */
    private fun checkPartitionDataType(dataType : String) : Boolean {
        return when(dataType.toLowerCase()) {
            "string", "int", "bigint" -> true
            else -> throw IllegalStateException("不支持数据类型：" + dataType)
        }
    }

    fun setCommand(command: String) {
        this.command = command
    }

    override fun shouldVisitNextChild(node: RuleNode?, currentResult: StatementData?): Boolean {
        return if(currentResult == null) true else false
    }
}