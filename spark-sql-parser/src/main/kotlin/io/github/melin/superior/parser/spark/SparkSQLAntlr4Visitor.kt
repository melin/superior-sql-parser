package io.github.melin.superior.parser.spark

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.*
import io.github.melin.superior.parser.spark.antlr4.SparkSqlBaseParser
import io.github.melin.superior.parser.spark.antlr4.SparkSqlBaseParser.AlterColumnActionContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlBaseParser.ColDefinitionOptionContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlBaseParserBaseVisitor
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.LinkedHashMap

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class SparkSQLAntlr4Visitor : SparkSqlBaseParserBaseVisitor<StatementData>() {

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

    fun parseDatabase(ctx: SparkSqlBaseParser.MultipartIdentifierContext): DatabaseName {
        if (ctx.parts.size == 2) {
            return DatabaseName(ctx.parts.get(0).text, ctx.parts.get(1).text)
        } else if (ctx.parts.size == 1) {
            return DatabaseName(null, ctx.parts.get(0).text)
        } else {
            throw SQLParserException("parse multipart error: " + ctx.parts.size)
        }
    }

    fun parseTableName(ctx: SparkSqlBaseParser.MultipartIdentifierContext): TableName {
        if (ctx.parts.size == 4) {
            return TableName(ctx.parts.get(0).text, ctx.parts.get(1).text, ctx.parts.get(2).text, ctx.parts.get(3).text)
        } else if (ctx.parts.size == 3) {
            return TableName(ctx.parts.get(0).text, ctx.parts.get(1).text, ctx.parts.get(2).text)
        } else if (ctx.parts.size == 2) {
            return TableName(null, ctx.parts.get(0).text, ctx.parts.get(1).text)
        } else if (ctx.parts.size == 1) {
            return TableName(null, null, ctx.parts.get(0).text)
        } else {
            throw SQLParserException("parse multipart error: " + ctx.parts.size)
        }
    }

    //-----------------------------------database-------------------------------------------------

    override fun visitCreateNamespace(ctx: SparkSqlBaseParser.CreateNamespaceContext): StatementData {
        val (catalogName, databaseName) = parseDatabase(ctx.multipartIdentifier())
        var location: String = ""
        if (ctx.locationSpec().size > 0) {
            location = ctx.locationSpec().get(0).stringLit().text
            location = StringUtil.cleanQuote(location)
        }

        val sqlData = Database(catalogName, databaseName, location)
        return StatementData(StatementType.CREATE_DATABASE, sqlData)
    }

    override fun visitDropNamespace(ctx: SparkSqlBaseParser.DropNamespaceContext): StatementData {
        val (catalogName, databaseName) = parseDatabase(ctx.multipartIdentifier())
        val sqlData = Database(catalogName, databaseName)
        return StatementData(StatementType.DROP_DATABASE, sqlData)
    }

    override fun visitDescribeNamespace(ctx: SparkSqlBaseParser.DescribeNamespaceContext): StatementData {
        val (catalogName, databaseName) = parseDatabase(ctx.multipartIdentifier())
        val sqlData = Database(catalogName, databaseName)
        return StatementData(StatementType.DESC_DATABASE, sqlData)
    }

    override fun visitShowTables(ctx: SparkSqlBaseParser.ShowTablesContext): StatementData {
        if (ctx.childCount > 2) {
            val (catalogName, databaseName) = parseDatabase(ctx.multipartIdentifier())
            return StatementData(StatementType.SHOW_TABLES, Database(catalogName, databaseName))
        } else {
            return StatementData(StatementType.SHOW_TABLES)
        }
    }

    override fun visitShowViews(ctx: SparkSqlBaseParser.ShowViewsContext): StatementData {
        if (ctx.childCount > 2) {
            val (catalogName, databaseName) = parseDatabase(ctx.multipartIdentifier())
            return StatementData(StatementType.SHOW_VIEWS, Database(catalogName, databaseName))
        } else {
            return StatementData(StatementType.SHOW_VIEWS)
        }
    }

    //-----------------------------------table-------------------------------------------------
    override fun visitCreateTable(ctx: SparkSqlBaseParser.CreateTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.createTableHeader().multipartIdentifier())
        val createTableClauses = ctx.createTableClauses();
        val comment = if (createTableClauses.commentSpec().size > 0) StringUtil.cleanQuote(createTableClauses.commentSpec(0).stringLit().text) else null
        val lifeCycle = createTableClauses.lifecycle?.text?.toInt()

        ctx.children.forEach { it ->
            if (it is SparkSqlBaseParser.RowFormatDelimitedContext) {
                throw SQLParserException("不支持row format 语法")
            } else if (it is SparkSqlBaseParser.RowFormatSerdeContext) {
                throw SQLParserException("不支持row format 语法")
            }
        }

        var partitionColumns: List<Column>? = null
        val partitionColumnNames: ArrayList<String> = arrayListOf()
        var columns: List<Column>? = null
        var createTableType = "spark"
        if (ctx.query() == null) {
            columns = ctx.createOrReplaceTableColTypeList().createOrReplaceTableColType().map {
                val colName = it.colName.text
                val dataType = it.dataType().text
                val (nullable, colComment) = parseColDefinition(it.colDefinitionOption())
                Column(colName, dataType, colComment, nullable)
            }

            if (ctx.tableProvider() == null) {
                createTableType = "hive"
            }

            if (createTableClauses.partitioning != null) {
                if ("spark" == createTableType) {
                    createTableClauses.partitioning.children
                        .filter { it is SparkSqlBaseParser.PartitionTransformContext }.forEach { item ->
                            val column = item as SparkSqlBaseParser.PartitionTransformContext
                            partitionColumnNames.add(column.text)
                        }

                    if (partitionColumnNames.size == 0) {
                        throw SQLParserException("spark create table 语法创建表，创建分区字段语法错误，请参考文档");
                    }
                } else {
                    partitionColumns = createTableClauses.partitioning.children
                        .filter { it is SparkSqlBaseParser.PartitionColumnContext }.map { item ->
                            val column = item as SparkSqlBaseParser.PartitionColumnContext
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
                    .filter { it is SparkSqlBaseParser.PartitionTransformContext }.forEach { item ->
                        val column = item as SparkSqlBaseParser.PartitionTransformContext
                        partitionColumnNames.add(column.text)
                    }
            }
        }

        val properties = HashMap<String, String>()
        if (createTableClauses.tableProps != null) {
            createTableClauses.tableProps.children.filter { it is SparkSqlBaseParser.PropertyContext }.map { item ->
                val property = item as SparkSqlBaseParser.PropertyContext
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        var fileFormat = ctx.tableProvider()?.multipartIdentifier()?.text
        ctx.createTableClauses().createFileFormat()
        if (ctx.createTableClauses().createFileFormat().size == 1) {
            fileFormat = ctx.createTableClauses().createFileFormat().get(0).fileFormat().text
        }

        val table = Table(catalogName, databaseName, tableName, comment, lifeCycle, partitionColumns, columns, properties, fileFormat)
        table.createTableType = createTableType;
        table.ifNotExists = ctx.createTableHeader().NOT() != null
        table.external = ctx.createTableHeader().EXTERNAL() != null
        table.temporary = ctx.createTableHeader().TEMPORARY() != null
        table.location = createTableClauses.locationSpec().size > 0
        if (table.location) {
            table.locationPath = createTableClauses.locationSpec().get(0).text
        }

        if (fileFormat != null && "hudi" == fileFormat.lowercase()) {
            val primaryKey = properties.get("primaryKey")
            if (StringUtils.isNotBlank(primaryKey)) {
                table.hudiPrimaryKeys = StringUtils.split(primaryKey, ",").map { StringUtils.trim(it) };
            }

            val type = properties.getOrDefault("type", "COW")
            if (StringUtils.isNotBlank(type)) {
                table.hudiType = type
            }

            val preCombineField = properties.getOrDefault("preCombineField", "")
            if (StringUtils.isNotBlank(preCombineField)) {
                table.preCombineField = preCombineField
            }
        }

        table.partitionColumnNames = partitionColumnNames

        if (ctx.query() != null) {
            currentOptType = StatementType.CREATE_TABLE_AS_SELECT
            var querySql = StringUtils.substring(command, ctx.query().start.startIndex)
            if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
                querySql = StringUtils.substringBetween(querySql, "(", ")")
            }

            table.querySql = querySql
            super.visitQuery(ctx.query())
            table.tableData = statementData
            return StatementData(StatementType.CREATE_TABLE_AS_SELECT, table, querySql)
        } else {
            return StatementData(StatementType.CREATE_TABLE, table)
        }
    }

    override fun visitReplaceTable(ctx: SparkSqlBaseParser.ReplaceTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.replaceTableHeader().multipartIdentifier())
        val createTableClauses = ctx.createTableClauses();
        val comment = if (createTableClauses.commentSpec().size > 0) StringUtil.cleanQuote(createTableClauses.commentSpec(0).text) else null
        val lifeCycle = createTableClauses.lifecycle?.text?.toInt()

        ctx.children.forEach { it ->
            if (it is SparkSqlBaseParser.RowFormatDelimitedContext) {
                throw SQLParserException("不支持row format 语法")
            } else if (it is SparkSqlBaseParser.RowFormatSerdeContext) {
                throw SQLParserException("不支持row format 语法")
            }
        }

        var partitionColumns: List<Column>? = null
        val partitionColumnNames: ArrayList<String> = arrayListOf()
        var columns: List<Column>? = null
        var createTableType = "hive"
        if (ctx.query() == null) {
            columns = ctx.createOrReplaceTableColTypeList().createOrReplaceTableColType().map {
                val colName = it.colName.text
                val dataType = it.dataType().text
                val (nullable, colComment) = parseColDefinition(it.colDefinitionOption())
                Column(colName, dataType, colComment, nullable)
            }

            if (ctx.tableProvider() != null) {
                createTableType = "spark"
            }

            if (createTableClauses.partitioning != null) {
                if ("spark" == createTableType) {
                    createTableClauses.partitioning.children
                        .filter { it is SparkSqlBaseParser.PartitionTransformContext }.forEach { item ->
                            val column = item as SparkSqlBaseParser.PartitionTransformContext
                            partitionColumnNames.add(column.text)
                        }

                    if (partitionColumnNames.size == 0) {
                        throw SQLParserException("spark create table 语法创建表，创建分区字段语法错误，请参考文档");
                    }
                } else {
                    partitionColumns = createTableClauses.partitioning.children
                        .filter { it is SparkSqlBaseParser.PartitionColumnContext }.map { item ->
                            val column = item as SparkSqlBaseParser.PartitionColumnContext
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
                    .filter { it is SparkSqlBaseParser.PartitionTransformContext }.forEach { item ->
                        val column = item as SparkSqlBaseParser.PartitionTransformContext
                        partitionColumnNames.add(column.text)
                    }
            }
        }

        val properties = HashMap<String, String>()
        if (createTableClauses.tableProps != null) {
            createTableClauses.tableProps.children.filter { it is SparkSqlBaseParser.PropertyContext }.map { item ->
                val property = item as SparkSqlBaseParser.PropertyContext
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        var fileFormat = ctx.tableProvider()?.multipartIdentifier()?.text
        ctx.createTableClauses().createFileFormat()
        if (ctx.createTableClauses().createFileFormat().size == 1) {
            fileFormat = ctx.createTableClauses().createFileFormat().get(0).fileFormat().text
        }

        val table = Table(catalogName, databaseName, tableName, comment, lifeCycle, partitionColumns, columns, properties, fileFormat)
        table.createTableType = createTableType;
        table.location = createTableClauses.locationSpec().size > 0
        if (table.location) {
            table.locationPath = createTableClauses.locationSpec().get(0).text
        }

        if (fileFormat != null && "hudi" == fileFormat.lowercase()) {
            val primaryKey = properties.get("primaryKey")
            if (StringUtils.isNotBlank(primaryKey)) {
                table.hudiPrimaryKeys = StringUtils.split(primaryKey, ",").map { StringUtils.trim(it) };
            }

            val type = properties.getOrDefault("type", "COW")
            if (StringUtils.isNotBlank(type)) {
                table.hudiType = type
            }

            val preCombineField = properties.getOrDefault("preCombineField", "")
            if (StringUtils.isNotBlank(preCombineField)) {
                table.preCombineField = preCombineField
            }
        }

        table.partitionColumnNames = partitionColumnNames

        if (ctx.query() != null) {
            currentOptType = StatementType.REPLACE_TABLE_AS_SELECT
            var querySql = StringUtils.substring(command, ctx.query().start.startIndex)
            if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
                querySql = StringUtils.substringBetween(querySql, "(", ")")
            }

            table.querySql = querySql
            super.visitQuery(ctx.query())
            table.tableData = statementData
            return StatementData(StatementType.REPLACE_TABLE_AS_SELECT, table, querySql)
        } else {
            return StatementData(StatementType.REPLACE_TABLE, table)
        }
    }

    override fun visitCreateTableLike(ctx: SparkSqlBaseParser.CreateTableLikeContext): StatementData {
        val newDatabaseName = ctx.target.db?.text
        val newTableName = ctx.target.table.text

        val oldDatabaseName = ctx.source.db?.text
        val oldTableName = ctx.source.table.text

        val dcTable = CreateTableLike(oldDatabaseName, oldTableName, newDatabaseName, newTableName)
        dcTable.ifNotExists = ctx.NOT() != null

        return StatementData(StatementType.CREATE_TABLE_AS_LIKE, dcTable)
    }

    override fun visitDropTable(ctx: SparkSqlBaseParser.DropTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val table = Table(catalogName, databaseName, tableName)
        val token = CommonToken(ctx.multipartIdentifier().start.startIndex, ctx.multipartIdentifier().stop.stopIndex)
        table.ifExists = ctx.EXISTS() != null
        table.token = token
        return StatementData(StatementType.DROP_TABLE, table)
    }

    override fun visitDropView(ctx: SparkSqlBaseParser.DropViewContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val view = View(catalogName, databaseName, tableName)
        view.ifExists = ctx.EXISTS() != null
        return StatementData(StatementType.DROP_VIEW, view)
    }

    override fun visitTruncateTable(ctx: SparkSqlBaseParser.TruncateTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val table = Table(catalogName, databaseName, tableName)
        return StatementData(StatementType.TRUNCATE_TABLE, table)
    }

    override fun visitRepairTable(ctx: SparkSqlBaseParser.RepairTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val table = Table(catalogName, databaseName, tableName)
        return StatementData(StatementType.MSCK_TABLE, table)
    }

    override fun visitRenameTable(ctx: SparkSqlBaseParser.RenameTableContext): StatementData {
        val (catalogName, databaseName, oldTableName) = parseTableName(ctx.from)
        val (_, _, newTableName) = parseTableName(ctx.to)

        if (ctx.VIEW() != null) {
            val dcView = RenameView(catalogName, databaseName, oldTableName, newTableName)
            return StatementData(StatementType.ALTER_VIEW_RENAME, dcView)
        } else {
            val dcTable = RenameTable(catalogName, databaseName, oldTableName, newTableName)
            dcTable.oldToken = CommonToken(ctx.from.start.startIndex, ctx.from.stop.stopIndex)
            dcTable.newToken = CommonToken(ctx.to.start.startIndex, ctx.to.stop.stopIndex)
            return StatementData(StatementType.ALTER_TABLE_RENAME, dcTable)
        }
    }

    override fun visitSetTableProperties(ctx: SparkSqlBaseParser.SetTablePropertiesContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val properties = HashMap<String, String>()
        if (ctx.propertyList() != null) {
            ctx.propertyList().children.filter { it is SparkSqlBaseParser.PropertyContext }.map { item ->
                val property = item as SparkSqlBaseParser.PropertyContext
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        val data = Table(catalogName, databaseName, tableName, null, null, null, null, properties, null)
        if (ctx.VIEW() == null) {
            return StatementData(StatementType.ALTER_TABLE_PROPERTIES, data)
        } else {
            return StatementData(StatementType.ALTER_VIEW_PROPERTIES, data)
        }
    }

    override fun visitAddTableColumns(ctx: SparkSqlBaseParser.AddTableColumnsContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val columns = ctx.columns.children
                .filter { it is SparkSqlBaseParser.QualifiedColTypeWithPositionContext }.map { item ->
                    val column = item as SparkSqlBaseParser.QualifiedColTypeWithPositionContext
                    val colName = column.multipartIdentifier().text
                    val dataType = column.dataType().text
                    val colComment = if (column.commentSpec() != null) StringUtil.cleanQuote(column.commentSpec().text) else null

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
                    val col = Column(colName, dataType, colComment)
                    col.position = position
                    col.afterCol = afterCol
                    col
                }

        val table = Table(catalogName, databaseName, tableName, null, null, null, columns)
        table.token = CommonToken(ctx.multipartIdentifier().start.startIndex, ctx.multipartIdentifier().stop.stopIndex)
        if ("columns" == ctx.getChild(4).text) {
            return StatementData(StatementType.ALTER_TABLE_ADD_COLS, table)
        } else {
            return StatementData(StatementType.ALTER_TABLE_ADD_COL, table)
        }
    }

    override fun visitHiveChangeColumn(ctx: SparkSqlBaseParser.HiveChangeColumnContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.table)

        val columnName = ctx.colName.parts.get(0).text
        val dataType = ctx.colType().dataType().text
        val commentNode = ctx.colType().commentSpec()?.stringLit()
        val comment = if (commentNode != null) StringUtil.cleanQuote(commentNode.text) else null

        val action = AlterColumnAction()
        action.columName = columnName
        action.comment = comment;
        action.dataType = dataType;
        if (ctx.colPosition() != null) {
            if (ctx.colPosition().FIRST() != null) {
                action.position = "first"
            } else if (ctx.colPosition().AFTER() != null) {
                action.position = "after"
                action.afterCol = ctx.colPosition().afterCol.text
            }
        }

        val data = AlterColumn(catalogName, databaseName, tableName, action)
        return StatementData(StatementType.ALTER_TABLE_CHANGE_COL, data)
    }

    override fun visitRenameTableColumn(ctx: SparkSqlBaseParser.RenameTableColumnContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.table)

        val oldName = ctx.from.text
        val newName = ctx.to.text

        val action = AlterColumnAction(oldName, newName)
        val dcTable = AlterColumn(catalogName, databaseName, tableName, action)
        dcTable.token = CommonToken(ctx.table.start.startIndex, ctx.table.stop.stopIndex)
        return StatementData(StatementType.ALTER_TABLE_RENAME_COL, dcTable)
    }

    override fun visitAlterTableAlterColumn(ctx: SparkSqlBaseParser.AlterTableAlterColumnContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.table)

        val action = parseAlterColumnAction(ctx.alterColumnAction())
        action.columName = ctx.column.text
        val dcTable = AlterColumn(catalogName, databaseName, tableName, action)
        dcTable.token = CommonToken(ctx.table.start.startIndex, ctx.table.stop.stopIndex)
        return StatementData(StatementType.ALTER_TABLE_CHANGE_COL, dcTable)
    }



    override fun visitTouchTable(ctx: SparkSqlBaseParser.TouchTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.table)

        val partitions = mutableListOf<String>()
        ctx.children.forEach { partition ->
            if (partition is SparkSqlBaseParser.PartitionSpecContext) {
                partition.children.forEach { partitionVal ->
                    if (partitionVal is SparkSqlBaseParser.PartitionValContext) {
                        partitions.add(partitionVal.text)
                    }
                }
            }
        }

        val data = TouchTable(catalogName, databaseName, tableName, partitions)
        return StatementData(StatementType.ALTER_TABLE_TOUCH, data)
    }

    override fun visitDropTableColumns(ctx: SparkSqlBaseParser.DropTableColumnsContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val dcTable = AlterColumn(catalogName, databaseName, tableName)
        dcTable.token = CommonToken(ctx.multipartIdentifier().start.startIndex, ctx.multipartIdentifier().stop.stopIndex)
        return StatementData(StatementType.ALTER_TABLE_DROP_COL, dcTable)
    }

    override fun visitSetTableLocation(ctx: SparkSqlBaseParser.SetTableLocationContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val tableSource = TableSource(catalogName, databaseName, tableName)
        val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
        tableSource.tokens.add(token)
        return StatementData(StatementType.ALTER_TABLE_SET_LOCATION, tableSource)
    }

    override fun visitMergeTable(ctx: SparkSqlBaseParser.MergeTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val partitionVals = ctx.partitionSpec()?.partitionVal()
                ?.map { partitionValContext -> partitionValContext.text }?.toList()
        val data = MergeData(catalogName, databaseName, tableName, partitionVals)
        return StatementData(StatementType.MERGE_TABLE, data)
    }

    override fun visitRefreshTable(ctx: SparkSqlBaseParser.RefreshTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val data = RefreshData(catalogName, databaseName, tableName)

        return StatementData(StatementType.REFRESH_TABLE, data)
    }

    override fun visitDescribeRelation(ctx: SparkSqlBaseParser.DescribeRelationContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = Table(catalogName, databaseName, tableName)
        return StatementData(StatementType.DESC_TABLE, data)
    }

    override fun visitShowColumns(ctx: SparkSqlBaseParser.ShowColumnsContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.table)

        val data = Table(catalogName, databaseName, tableName)
        return StatementData(StatementType.SHOW_COLUMNS, data)
    }

    override fun visitShowCreateTable(ctx: SparkSqlBaseParser.ShowCreateTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = Table(catalogName, databaseName, tableName)
        return StatementData(StatementType.SHOW_CREATE_TABLE, data)
    }

    override fun visitShowTableExtended(ctx: SparkSqlBaseParser.ShowTableExtendedContext): StatementData {
        return StatementData(StatementType.SHOW_TABLE_EXTENDED)
    }

    override fun visitShowTblProperties(ctx: SparkSqlBaseParser.ShowTblPropertiesContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.table)

        val data = Table(catalogName, databaseName, tableName)
        return StatementData(StatementType.SHOW_TABLE_PROPERTIES, data)
    }

    override fun visitAnalyze(ctx: SparkSqlBaseParser.AnalyzeContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = Table(catalogName, databaseName, tableName)
        return StatementData(StatementType.ANALYZE_TABLE, data)
    }

    override fun visitDtunnelExpr(ctx: SparkSqlBaseParser.DtunnelExprContext): StatementData {
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
                val property = item as SparkSqlBaseParser.DtPropertyContext
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
                val property = item as SparkSqlBaseParser.DtPropertyContext
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
                distOptions.put(key, value)
            }
        }

        val data = DataTunnelExpr(srcType, srcOptions, transformSql, distType, distOptions, isCTE)

        data.inputTables = statementData.inputTables
        data.cteTempTables = statementData.cteTempTables
        data.functionNames = statementData.functionNames
        return StatementData(StatementType.DATATUNNEL, data)
    }

    override fun visitCall(ctx: SparkSqlBaseParser.CallContext): StatementData {
        val (catalogName, namespace, procedureName) = parseTableName(ctx.multipartIdentifier())
        val data = CallExpr(catalogName, namespace, procedureName)
        return StatementData(StatementType.CALL, data)
    }

    override fun visitSync(ctx: SparkSqlBaseParser.SyncContext): StatementData {
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

    override fun visitAddTablePartition(ctx: SparkSqlBaseParser.AddTablePartitionContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val partitions = ctx.children.filter { it is SparkSqlBaseParser.PartitionSpecLocationContext }.map { partition ->
            val sb = StringBuilder()
            val len = partition.childCount - 2
            for (index in 2..len) {
                sb.append(partition.getChild(index).text)
            }

            sb.toString()
        }

        val ifNotExists = ctx.NOT() != null
        val data = AddTablePartition(catalogName, databaseName, tableName, ifNotExists, partitions)
        return StatementData(StatementType.ALTER_TABLE_ADD_PARTS, data)
    }

    override fun visitDropTablePartitions(ctx: SparkSqlBaseParser.DropTablePartitionsContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val partitions = ctx.children.filter { it is SparkSqlBaseParser.PartitionSpecContext }.map { partition ->
            val sb = StringBuilder()
            val len = partition.childCount - 2
            for (index in 2..len) {
                sb.append(partition.getChild(index).text)
            }

            sb.toString()
        }

        val ifExists = ctx.EXISTS() != null
        val data = DropTablePartition(catalogName, databaseName, tableName, ifExists, partitions)
        return StatementData(StatementType.ALTER_TABLE_DROP_PARTS, data)
    }

    override fun visitRenameTablePartition(ctx: SparkSqlBaseParser.RenameTablePartitionContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = Table(catalogName, databaseName, tableName)
        return StatementData(StatementType.ALTER_TABLE_RENAME_PART, data)
    }

    override fun visitShowPartitions(ctx: SparkSqlBaseParser.ShowPartitionsContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = Table(catalogName, databaseName, tableName)
        return StatementData(StatementType.SHOW_PARTITIONS, data)
    }

    //-----------------------------------view-------------------------------------------------

    override fun visitCreateView(ctx: SparkSqlBaseParser.CreateViewContext): StatementData {
        var comment: String? = null
        if (ctx.commentSpec().size > 0) {
            comment = ctx.commentSpec().get(0).stringLit().text
            comment = StringUtil.cleanQuote(comment)
        }

        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val ifNotExists = ctx.NOT() != null

        var querySql = ""
        ctx.children.filter { it is SparkSqlBaseParser.QueryContext }.forEach { it ->
            val query = it as SparkSqlBaseParser.QueryContext
            querySql = StringUtils.substring(command, query.start.startIndex)
        }

        currentOptType = StatementType.CREATE_VIEW
        this.visitQuery(ctx.query())

        val view = View(catalogName, databaseName, tableName, querySql, comment, ifNotExists)
        view.functionNames = statementData.functionNames
        return StatementData(StatementType.CREATE_VIEW, view)
    }

    override fun visitAlterViewQuery(ctx: SparkSqlBaseParser.AlterViewQueryContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        var querySql = ""
        ctx.children.filter { it is SparkSqlBaseParser.QueryContext }.forEach { it ->
            val query = it as SparkSqlBaseParser.QueryContext
            querySql = StringUtils.substring(command, query.start.startIndex)
        }

        val view = View(catalogName, databaseName, tableName)
        view.querySql = querySql
        return StatementData(StatementType.ALTER_VIEW_QUERY, view)
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
            file = ctx.resource(0).stringLit().text
        }

        val data = Function(name, temporary, classNmae, file)
        return StatementData(StatementType.CREATE_FUNCTION, data)
    }

    override fun visitDropFunction(ctx: SparkSqlBaseParser.DropFunctionContext): StatementData {
        val name = ctx.multipartIdentifier().parts.get(0).text
        val data = Function(name)
        return StatementData(StatementType.DROP_FUNCTION, data)
    }

    override fun visitDescribeFunction(ctx: SparkSqlBaseParser.DescribeFunctionContext): StatementData {
        val name = ctx.describeFuncName().text
        val data = Function(name)
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

    override fun visitLoadTempTable(ctx: SparkSqlBaseParser.LoadTempTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = LoadData(catalogName, databaseName, tableName)
        return StatementData(StatementType.LOAD_TEMP_TABLE, data)
    }

    override fun visitExportTable(ctx: SparkSqlBaseParser.ExportTableContext): StatementData {
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
            statementData.cteTempTables.forEach { tableName ->
                for ((index, table) in statementData.inputTables.withIndex()) {
                    if (table.databaseName.isNullOrBlank() && tableName == table.tableName) {
                        statementData.inputTables.removeAt(index)
                        break
                    }
                }
            }
            data.inputTables.addAll(statementData.inputTables)
        }
        data.functionNames = statementData.functionNames
        data.cteTempTables = statementData.cteTempTables
        return StatementData(StatementType.EXPORT_TABLE, data)
    }

    override fun visitUse(ctx: SparkSqlBaseParser.UseContext): StatementData {
        val (catalogName, databaseName) = parseDatabase(ctx.multipartIdentifier())
        val data = Database(catalogName, databaseName)
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

            val childnode = node.getChild(1)
            if (StringUtils.startsWithIgnoreCase(childnode.text, "select")) {
                currentOptType = StatementType.SELECT
                super.visitStatementDefault(ctx)
                statementData.limit = limit

                statementData.cteTempTables.forEach { tableName ->
                    for ((index, table) in statementData.inputTables.withIndex()) {
                        if (table.databaseName.isNullOrBlank() && tableName == table.tableName) {
                            statementData.inputTables.removeAt(index)
                            break
                        }
                    }
                }
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

            val childNode = ctx.getChild(1)
            if (childNode is SparkSqlBaseParser.SingleInsertQueryContext) {
                if (StringUtils.equalsIgnoreCase("insert", childNode.start.text)) {
                    insertSql = true
                    super.visitDmlStatement(ctx)

                    val tableContext = childNode.getChild(0)
                    val multipartIdentifier: SparkSqlBaseParser.MultipartIdentifierContext = if (tableContext is SparkSqlBaseParser.InsertIntoTableContext) {
                        tableContext.multipartIdentifier()
                    } else {
                        (tableContext as SparkSqlBaseParser.InsertOverwriteTableContext).multipartIdentifier()
                    }

                    val (catalogName, databaseName, tableName) = parseTableName(multipartIdentifier)
                    val table = TableName(catalogName, databaseName, tableName)
                    statementData.outpuTables.add(table)
                    statementData.partitions = partitions

                    if (StringUtils.endsWithIgnoreCase("into", tableContext.getChild(1).text)) {
                        insertMode = InsertMode.INTO
                    }
                    statementData.insertMode = insertMode

                    statementData.cteTempTables.forEach { name ->
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
            } else if (tableContext is SparkSqlBaseParser.InsertOverwriteTableContext) {
                tableContext.multipartIdentifier()
            } else {
                throw SQLParserException("不支持SQL");
            }

            val (catalogName, databaseName, tableName) = parseTableName(multipartIdentifier)
            val table = TableName(catalogName, databaseName, tableName)
            statementData.outpuTables.add(table)
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
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val where = if (ctx.whereClause() != null) StringUtils.substring(command, ctx.whereClause().start.stopIndex + 1) else null

        val update = DeleteTable(catalogName, databaseName, tableName, StringUtils.trim(where))
        return StatementData(StatementType.DELETE, update)
    }

    override fun visitUpdateTable(ctx: SparkSqlBaseParser.UpdateTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val upset = ctx.setClause().assignmentList().assignment().filter { it is SparkSqlBaseParser.AssignmentContext }.map {
            val assign = it as SparkSqlBaseParser.AssignmentContext
            assign.key.text to assign.value.text
        }.toMap()
        val where = if (ctx.whereClause() != null) StringUtils.substring(command, ctx.whereClause().start.stopIndex + 1) else null

        val update = UpdateTable(catalogName, databaseName, tableName, upset, StringUtils.trim(where))
        return StatementData(StatementType.UPDATE, update)
    }

    override fun visitMergeIntoTable(ctx: SparkSqlBaseParser.MergeIntoTableContext): StatementData {
        currentOptType = StatementType.MERGE_INTO_TABLE

        val (catalogName, targetDatabase, targetTableName) = parseTableName(ctx.target)
        val targetTable = TableSource(catalogName, targetDatabase, targetTableName)
        val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
        targetTable.tokens.add(token)

        val deltaMerge = MergeIntoTable(targetTable = targetTable)

        if (ctx.source != null) {
            val (catalogName, sourceDatabase, sourceTableName) = parseTableName(ctx.source)

            val table = TableName(catalogName, sourceDatabase, sourceTableName)
            deltaMerge.sourceTables.add(table)
        } else if (ctx.sourceQuery != null && ctx.sourceQuery is SparkSqlBaseParser.QueryContext) {
            val query = ctx.sourceQuery as SparkSqlBaseParser.QueryContext
            super.visitQuery(query)

            deltaMerge.sourceTables.addAll(statementData.inputTables)
        }
        return StatementData(StatementType.MERGE_INTO_TABLE, deltaMerge)
    }

    //-----------------------------------private method-------------------------------------------------

    override fun visitFunctionName(ctx: SparkSqlBaseParser.FunctionNameContext): StatementData? {
        if (StatementType.SELECT == currentOptType ||
            StatementType.CREATE_VIEW == currentOptType ||
            StatementType.INSERT_SELECT == currentOptType ||
            StatementType.CREATE_TABLE_AS_SELECT == currentOptType ||
            StatementType.REPLACE_TABLE_AS_SELECT == currentOptType ||
            StatementType.MULTI_INSERT == currentOptType ||
            StatementType.MERGE_INTO_TABLE == currentOptType ||
            StatementType.EXPORT_TABLE == currentOptType ||
            StatementType.DATATUNNEL == currentOptType) {

            statementData.functionNames.add(StringUtils.lowerCase(ctx.qualifiedName().text))
            println(ctx.qualifiedName())
        }
        return super.visitFunctionName(ctx)
    }

    override fun visitQueryTermDefault(ctx: SparkSqlBaseParser.QueryTermDefaultContext): StatementData? {
        if (querySql == null) {
            querySql = StringUtils.substring(command, ctx.start.startIndex)
        }
        return super.visitQueryTermDefault(ctx)
    }

    override fun visitNamedQuery(ctx: SparkSqlBaseParser.NamedQueryContext): StatementData? {
        if (isCTE) {
            statementData.cteTempTables.add(ctx.getChild(0).text)
        }
        return super.visitNamedQuery(ctx)
    }

    override fun visitMultipartIdentifier(ctx: SparkSqlBaseParser.MultipartIdentifierContext): StatementData? {
        val (databaseName, tableName, metaAction) = parseTableName(ctx)
        if (currentOptType == StatementType.CREATE_TABLE_AS_SELECT ||
            currentOptType == StatementType.REPLACE_TABLE_AS_SELECT ||
                currentOptType == StatementType.SELECT ||
                currentOptType == StatementType.INSERT_SELECT ||
                currentOptType == StatementType.MERGE_INTO_TABLE ||
                currentOptType == StatementType.EXPORT_TABLE ||
                currentOptType == StatementType.DATATUNNEL) {

            val table = TableName(databaseName, tableName, metaAction)

            val index = statementData.inputTables.indexOf(table)
            if (index == -1) {
                statementData.inputTables.add(table)
            }
        } else if (currentOptType == StatementType.MULTI_INSERT) {
            if ("from" == multiInsertToken) {
                val table = TableName(databaseName, tableName, metaAction)
                statementData.inputTables.add(table)
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
            val (catalogName, databaseName, tableName) = parseTableName(multipartIdentifier)

            val table = TableName(catalogName, databaseName, tableName)
            statementData.outpuTables.add(table)
        } else if (obj is SparkSqlBaseParser.InsertIntoTableContext) {
            val multipartIdentifier = obj.multipartIdentifier()
            val (catalogName, databaseName, tableName) = parseTableName(multipartIdentifier)

            val table = TableName(catalogName, databaseName, tableName)
            statementData.outpuTables.add(table)
        }
        return super.visitMultiInsertQueryBody(ctx)
    }

    override fun visitQueryOrganization(ctx: SparkSqlBaseParser.QueryOrganizationContext): StatementData? {
        limit = ctx.limit?.text?.toInt()
        return super.visitQueryOrganization(ctx)
    }

    override fun visitTypeConstructor(ctx: SparkSqlBaseParser.TypeConstructorContext): StatementData? {
        val valueType = ctx.identifier().getText().uppercase()
        if (!("DATE".equals(valueType) || "TIME".equals(valueType)
                    || "TIMESTAMP".equals(valueType) || "INTERVAL".equals(valueType)
                    || "X".equals(valueType))) {
            throw SQLParserException("Literals of type " + valueType + " are currently not supported.");
        }

        return super.visitTypeConstructor(ctx)
    }

    private fun parseColDefinition(colDef: List<ColDefinitionOptionContext>): Pair<Boolean, String?> {
        var nullable: Boolean = false
        var comment: String? = null

        if (colDef.size > 0) {
            colDef.forEach { col ->
                if (col.NULL() != null) {
                    nullable = true
                }

                if (col.commentSpec() != null) {
                    comment = StringUtil.cleanQuote(col.commentSpec().stringLit().text);
                }
            }
        }

        return Pair(nullable, comment)
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
}