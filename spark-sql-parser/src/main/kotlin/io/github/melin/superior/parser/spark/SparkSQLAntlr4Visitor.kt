package io.github.melin.superior.parser.spark

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.view.AlterView
import io.github.melin.superior.common.relational.view.CreateView
import io.github.melin.superior.common.relational.view.DropView
import io.github.melin.superior.common.relational.view.RenameView
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.AlterColumnActionContext
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser.ColDefinitionOptionContext
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
            throw SQLParserException("不支持的SQL: " + command)
        }

        return data
    }

    fun setCommand(command: String) {
        this.command = command
    }

    fun parseDatabase(ctx: SparkSqlParser.MultipartIdentifierContext): SchemaId {
        if (ctx.parts.size == 2) {
            return SchemaId(ctx.parts.get(0).text, ctx.parts.get(1).text)
        } else if (ctx.parts.size == 1) {
            return SchemaId(null, ctx.parts.get(0).text)
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
        val (catalogName, schemaName) = parseDatabase(ctx.multipartIdentifier())
        var location: String = ""
        if (ctx.locationSpec().size > 0) {
            location = ctx.locationSpec().get(0).stringLit().text
            location = StringUtil.cleanQuote(location)
        }

        val sqlData = SchemaDescriptor(catalogName, schemaName, location)
        return StatementData(StatementType.CREATE_DATABASE, sqlData)
    }

    override fun visitDropNamespace(ctx: SparkSqlParser.DropNamespaceContext): StatementData {
        val (catalogName, schemaName) = parseDatabase(ctx.multipartIdentifier())
        val sqlData = SchemaDescriptor(catalogName, schemaName)
        return StatementData(StatementType.DROP_DATABASE, sqlData)
    }

    override fun visitDescribeNamespace(ctx: SparkSqlParser.DescribeNamespaceContext): StatementData {
        val (catalogName, schemaName) = parseDatabase(ctx.multipartIdentifier())
        val sqlData = SchemaDescriptor(catalogName, schemaName)
        return StatementData(StatementType.DESC_DATABASE, sqlData)
    }

    override fun visitShowTables(ctx: SparkSqlParser.ShowTablesContext): StatementData {
        if (ctx.childCount > 2) {
            val (catalogName, databaseName) = parseDatabase(ctx.multipartIdentifier())
            return StatementData(StatementType.SHOW_TABLES, SchemaDescriptor(catalogName, databaseName))
        } else {
            return StatementData(StatementType.SHOW_TABLES)
        }
    }

    override fun visitShowViews(ctx: SparkSqlParser.ShowViewsContext): StatementData {
        if (ctx.childCount > 2) {
            val (catalogName, databaseName) = parseDatabase(ctx.multipartIdentifier())
            return StatementData(StatementType.SHOW_VIEWS, SchemaDescriptor(catalogName, databaseName))
        } else {
            return StatementData(StatementType.SHOW_VIEWS)
        }
    }

    //-----------------------------------table-------------------------------------------------
    override fun visitCreateTable(ctx: SparkSqlParser.CreateTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.createTableHeader().multipartIdentifier())
        val createTableClauses = ctx.createTableClauses();
        val comment = if (createTableClauses.commentSpec().size > 0) StringUtil.cleanQuote(createTableClauses.commentSpec(0).stringLit().text) else null
        val lifeCycle = createTableClauses.lifecycle?.text?.toInt()

        ctx.children.forEach { it ->
            if (it is SparkSqlParser.RowFormatDelimitedContext) {
                throw SQLParserException("不支持row format 语法")
            } else if (it is SparkSqlParser.RowFormatSerdeContext) {
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

        var fileFormat = ctx.tableProvider()?.multipartIdentifier()?.text
        ctx.createTableClauses().createFileFormat()
        if (ctx.createTableClauses().createFileFormat().size == 1) {
            fileFormat = ctx.createTableClauses().createFileFormat().get(0).fileFormat().text
        }

        val tableDescriptor = TableDescriptor(catalogName, databaseName, tableName, comment, lifeCycle, partitionColumns, columns, properties, fileFormat)
        tableDescriptor.createTableType = createTableType;
        tableDescriptor.ifNotExists = ctx.createTableHeader().NOT() != null
        tableDescriptor.external = ctx.createTableHeader().EXTERNAL() != null
        tableDescriptor.temporary = ctx.createTableHeader().TEMPORARY() != null
        tableDescriptor.location = createTableClauses.locationSpec().size > 0
        if (tableDescriptor.location) {
            tableDescriptor.locationPath = createTableClauses.locationSpec().get(0).text
        }

        if (fileFormat != null && "hudi" == fileFormat.lowercase()) {
            val primaryKey = properties.get("primaryKey")
            if (StringUtils.isNotBlank(primaryKey)) {
                tableDescriptor.hudiPrimaryKeys = StringUtils.split(primaryKey, ",").map { StringUtils.trim(it) };
            }

            val type = properties.getOrDefault("type", "COW")
            if (StringUtils.isNotBlank(type)) {
                tableDescriptor.hudiType = type
            }

            val preCombineField = properties.getOrDefault("preCombineField", "")
            if (StringUtils.isNotBlank(preCombineField)) {
                tableDescriptor.preCombineField = preCombineField
            }
        }

        tableDescriptor.partitionColumnNames = partitionColumnNames

        if (ctx.query() != null) {
            currentOptType = StatementType.CREATE_TABLE_AS_SELECT
            var querySql = StringUtils.substring(command, ctx.query().start.startIndex)
            if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
                querySql = StringUtils.substringBetween(querySql, "(", ")")
            }

            tableDescriptor.querySql = querySql
            super.visitQuery(ctx.query())
            tableDescriptor.tableLineage = tableLineage
            return StatementData(StatementType.CREATE_TABLE_AS_SELECT, tableDescriptor, querySql)
        } else {
            return StatementData(StatementType.CREATE_TABLE, tableDescriptor)
        }
    }

    override fun visitReplaceTable(ctx: SparkSqlParser.ReplaceTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.replaceTableHeader().multipartIdentifier())
        val createTableClauses = ctx.createTableClauses();
        val comment = if (createTableClauses.commentSpec().size > 0) StringUtil.cleanQuote(createTableClauses.commentSpec(0).text) else null
        val lifeCycle = createTableClauses.lifecycle?.text?.toInt()

        ctx.children.forEach { it ->
            if (it is SparkSqlParser.RowFormatDelimitedContext) {
                throw SQLParserException("不支持row format 语法")
            } else if (it is SparkSqlParser.RowFormatSerdeContext) {
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

        var fileFormat = ctx.tableProvider()?.multipartIdentifier()?.text
        ctx.createTableClauses().createFileFormat()
        if (ctx.createTableClauses().createFileFormat().size == 1) {
            fileFormat = ctx.createTableClauses().createFileFormat().get(0).fileFormat().text
        }

        val tableDescriptor = TableDescriptor(catalogName, databaseName, tableName, comment, lifeCycle, partitionColumns, columns, properties, fileFormat)
        tableDescriptor.createTableType = createTableType;
        tableDescriptor.location = createTableClauses.locationSpec().size > 0
        if (tableDescriptor.location) {
            tableDescriptor.locationPath = createTableClauses.locationSpec().get(0).text
        }

        if (fileFormat != null && "hudi" == fileFormat.lowercase()) {
            val primaryKey = properties.get("primaryKey")
            if (StringUtils.isNotBlank(primaryKey)) {
                tableDescriptor.hudiPrimaryKeys = StringUtils.split(primaryKey, ",").map { StringUtils.trim(it) };
            }

            val type = properties.getOrDefault("type", "COW")
            if (StringUtils.isNotBlank(type)) {
                tableDescriptor.hudiType = type
            }

            val preCombineField = properties.getOrDefault("preCombineField", "")
            if (StringUtils.isNotBlank(preCombineField)) {
                tableDescriptor.preCombineField = preCombineField
            }
        }

        tableDescriptor.partitionColumnNames = partitionColumnNames

        if (ctx.query() != null) {
            currentOptType = StatementType.REPLACE_TABLE_AS_SELECT
            var querySql = StringUtils.substring(command, ctx.query().start.startIndex)
            if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
                querySql = StringUtils.substringBetween(querySql, "(", ")")
            }

            tableDescriptor.querySql = querySql
            super.visitQuery(ctx.query())
            tableDescriptor.tableLineage = tableLineage
            return StatementData(StatementType.REPLACE_TABLE_AS_SELECT, tableDescriptor, querySql)
        } else {
            return StatementData(StatementType.REPLACE_TABLE, tableDescriptor)
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
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val tableDescriptor = TableDescriptor(catalogName, databaseName, tableName)
        val token = CommonToken(ctx.multipartIdentifier().start.startIndex, ctx.multipartIdentifier().stop.stopIndex)
        tableDescriptor.ifExists = ctx.EXISTS() != null
        tableDescriptor.token = token
        return StatementData(StatementType.DROP_TABLE, tableDescriptor)
    }

    override fun visitDropView(ctx: SparkSqlParser.DropViewContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val dropView = DropView(catalogName, databaseName, tableName)
        dropView.ifExists = ctx.EXISTS() != null
        return StatementData(StatementType.DROP_VIEW, dropView)
    }

    override fun visitTruncateTable(ctx: SparkSqlParser.TruncateTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val tableDescriptor = TableDescriptor(catalogName, databaseName, tableName)
        return StatementData(StatementType.TRUNCATE_TABLE, tableDescriptor)
    }

    override fun visitRepairTable(ctx: SparkSqlParser.RepairTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val tableDescriptor = TableDescriptor(catalogName, databaseName, tableName)
        return StatementData(StatementType.MSCK_TABLE, tableDescriptor)
    }

    override fun visitRenameTable(ctx: SparkSqlParser.RenameTableContext): StatementData {
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

    override fun visitSetTableProperties(ctx: SparkSqlParser.SetTablePropertiesContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val properties = HashMap<String, String>()
        if (ctx.propertyList() != null) {
            ctx.propertyList().children.filter { it is SparkSqlParser.PropertyContext }.map { item ->
                val property = item as SparkSqlParser.PropertyContext
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        val data = TableDescriptor(catalogName, databaseName, tableName, null, null, null, null, properties, null)
        if (ctx.VIEW() == null) {
            return StatementData(StatementType.ALTER_TABLE_PROPERTIES, data)
        } else {
            return StatementData(StatementType.ALTER_VIEW_PROPERTIES, data)
        }
    }

    override fun visitAddTableColumns(ctx: SparkSqlParser.AddTableColumnsContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val columns = ctx.columns.children
                .filter { it is SparkSqlParser.QualifiedColTypeWithPositionContext }.map { item ->
                    val column = item as SparkSqlParser.QualifiedColTypeWithPositionContext
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

        val tableDescriptor = TableDescriptor(catalogName, databaseName, tableName, null, null, null, columns)
        tableDescriptor.token = CommonToken(ctx.multipartIdentifier().start.startIndex, ctx.multipartIdentifier().stop.stopIndex)
        if ("columns" == ctx.getChild(4).text) {
            return StatementData(StatementType.ALTER_TABLE_ADD_COLS, tableDescriptor)
        } else {
            return StatementData(StatementType.ALTER_TABLE_ADD_COL, tableDescriptor)
        }
    }

    override fun visitHiveChangeColumn(ctx: SparkSqlParser.HiveChangeColumnContext): StatementData {
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

    override fun visitRenameTableColumn(ctx: SparkSqlParser.RenameTableColumnContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.table)

        val oldName = ctx.from.text
        val newName = ctx.to.text

        val action = AlterColumnAction(oldName, newName)
        val dcTable = AlterColumn(catalogName, databaseName, tableName, action)
        dcTable.token = CommonToken(ctx.table.start.startIndex, ctx.table.stop.stopIndex)
        return StatementData(StatementType.ALTER_TABLE_RENAME_COL, dcTable)
    }

    override fun visitAlterTableAlterColumn(ctx: SparkSqlParser.AlterTableAlterColumnContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.table)

        val action = parseAlterColumnAction(ctx.alterColumnAction())
        action.columName = ctx.column.text
        val dcTable = AlterColumn(catalogName, databaseName, tableName, action)
        dcTable.token = CommonToken(ctx.table.start.startIndex, ctx.table.stop.stopIndex)
        return StatementData(StatementType.ALTER_TABLE_CHANGE_COL, dcTable)
    }



    override fun visitTouchTable(ctx: SparkSqlParser.TouchTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.table)

        val partitions = mutableListOf<String>()
        ctx.children.forEach { partition ->
            if (partition is SparkSqlParser.PartitionSpecContext) {
                partition.children.forEach { partitionVal ->
                    if (partitionVal is SparkSqlParser.PartitionValContext) {
                        partitions.add(partitionVal.text)
                    }
                }
            }
        }

        val data = TouchTable(catalogName, databaseName, tableName, partitions)
        return StatementData(StatementType.ALTER_TABLE_TOUCH, data)
    }

    override fun visitDropTableColumns(ctx: SparkSqlParser.DropTableColumnsContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val dcTable = AlterColumn(catalogName, databaseName, tableName)
        dcTable.token = CommonToken(ctx.multipartIdentifier().start.startIndex, ctx.multipartIdentifier().stop.stopIndex)
        return StatementData(StatementType.ALTER_TABLE_DROP_COL, dcTable)
    }

    override fun visitSetTableLocation(ctx: SparkSqlParser.SetTableLocationContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val tableSource = TableSource(catalogName, databaseName, tableName)
        val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
        tableSource.tokens.add(token)
        return StatementData(StatementType.ALTER_TABLE_SET_LOCATION, tableSource)
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

    override fun visitDescribeRelation(ctx: SparkSqlParser.DescribeRelationContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = TableDescriptor(catalogName, databaseName, tableName)
        return StatementData(StatementType.DESC_TABLE, data)
    }

    override fun visitShowColumns(ctx: SparkSqlParser.ShowColumnsContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.table)

        val data = TableDescriptor(catalogName, databaseName, tableName)
        return StatementData(StatementType.SHOW_COLUMNS, data)
    }

    override fun visitShowCreateTable(ctx: SparkSqlParser.ShowCreateTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = TableDescriptor(catalogName, databaseName, tableName)
        return StatementData(StatementType.SHOW_CREATE_TABLE, data)
    }

    override fun visitShowTableExtended(ctx: SparkSqlParser.ShowTableExtendedContext): StatementData {
        return StatementData(StatementType.SHOW_TABLE_EXTENDED)
    }

    override fun visitShowTblProperties(ctx: SparkSqlParser.ShowTblPropertiesContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.table)

        val data = TableDescriptor(catalogName, databaseName, tableName)
        return StatementData(StatementType.SHOW_TABLE_PROPERTIES, data)
    }

    override fun visitAnalyze(ctx: SparkSqlParser.AnalyzeContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = TableDescriptor(catalogName, databaseName, tableName)
        return StatementData(StatementType.ANALYZE_TABLE, data)
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
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val partitions = ctx.children.filter { it is SparkSqlParser.PartitionSpecLocationContext }.map { partition ->
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

    override fun visitDropTablePartitions(ctx: SparkSqlParser.DropTablePartitionsContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val partitions = ctx.children.filter { it is SparkSqlParser.PartitionSpecContext }.map { partition ->
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

    override fun visitRenameTablePartition(ctx: SparkSqlParser.RenameTablePartitionContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = TableDescriptor(catalogName, databaseName, tableName)
        return StatementData(StatementType.ALTER_TABLE_RENAME_PART, data)
    }

    override fun visitShowPartitions(ctx: SparkSqlParser.ShowPartitionsContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val data = TableDescriptor(catalogName, databaseName, tableName)
        return StatementData(StatementType.SHOW_PARTITIONS, data)
    }

    //-----------------------------------view-------------------------------------------------

    override fun visitCreateView(ctx: SparkSqlParser.CreateViewContext): StatementData {
        var comment: String? = null
        if (ctx.commentSpec().size > 0) {
            comment = ctx.commentSpec().get(0).stringLit().text
            comment = StringUtil.cleanQuote(comment)
        }

        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val ifNotExists = ctx.NOT() != null

        var querySql = ""
        ctx.children.filter { it is SparkSqlParser.QueryContext }.forEach { it ->
            val query = it as SparkSqlParser.QueryContext
            querySql = StringUtils.substring(command, query.start.startIndex)
        }

        currentOptType = StatementType.CREATE_VIEW
        this.visitQuery(ctx.query())

        val createView = CreateView(catalogName, databaseName, tableName, querySql, comment, ifNotExists)
        createView.functionNames = tableLineage.functionNames
        return StatementData(StatementType.CREATE_VIEW, createView)
    }

    override fun visitAlterViewQuery(ctx: SparkSqlParser.AlterViewQueryContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        var querySql = ""
        ctx.children.filter { it is SparkSqlParser.QueryContext }.forEach { it ->
            val query = it as SparkSqlParser.QueryContext
            querySql = StringUtils.substring(command, query.start.startIndex)
        }

        val alterView = AlterView(catalogName, databaseName, tableName, querySql)
        return StatementData(StatementType.ALTER_VIEW_QUERY, alterView)
    }

    //-----------------------------------function-------------------------------------------------

    override fun visitCreateFunction(ctx: SparkSqlParser.CreateFunctionContext): StatementData {
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

    override fun visitDropFunction(ctx: SparkSqlParser.DropFunctionContext): StatementData {
        val name = ctx.multipartIdentifier().parts.get(0).text
        val data = Function(name)
        return StatementData(StatementType.DROP_FUNCTION, data)
    }

    override fun visitDescribeFunction(ctx: SparkSqlParser.DescribeFunctionContext): StatementData {
        val name = ctx.describeFuncName().text
        val data = Function(name)
        return StatementData(StatementType.DESC_FUNCTION, data)
    }

    override fun visitShowFunctions(ctx: SparkSqlParser.ShowFunctionsContext): StatementData {
        return StatementData(StatementType.SHOW_FUNCTIONS)
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
        val (catalogName, databaseName) = parseDatabase(ctx.multipartIdentifier())
        val data = SchemaDescriptor(catalogName, databaseName)
        return StatementData(StatementType.USE, data)
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
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())
        val where = if (ctx.whereClause() != null) StringUtils.substring(command, ctx.whereClause().start.stopIndex + 1) else null

        val update = DeleteTable(catalogName, databaseName, tableName, StringUtils.trim(where))
        return StatementData(StatementType.DELETE, update)
    }

    override fun visitUpdateTable(ctx: SparkSqlParser.UpdateTableContext): StatementData {
        val (catalogName, databaseName, tableName) = parseTableName(ctx.multipartIdentifier())

        val upset = ctx.setClause().assignmentList().assignment().filter { it is SparkSqlParser.AssignmentContext }.map {
            val assign = it as SparkSqlParser.AssignmentContext
            assign.key.text to assign.value.text
        }.toMap()
        val where = if (ctx.whereClause() != null) StringUtils.substring(command, ctx.whereClause().start.stopIndex + 1) else null

        val update = UpdateTable(catalogName, databaseName, tableName, upset, StringUtils.trim(where))
        return StatementData(StatementType.UPDATE, update)
    }

    override fun visitMergeIntoTable(ctx: SparkSqlParser.MergeIntoTableContext): StatementData {
        currentOptType = StatementType.MERGE_INTO_TABLE

        val (catalogName, targetDatabase, targetTableName) = parseTableName(ctx.target)
        val targetTable = TableSource(catalogName, targetDatabase, targetTableName)
        val token = CommonToken(ctx.start.startIndex, ctx.stop.stopIndex)
        targetTable.tokens.add(token)

        val deltaMerge = MergeIntoTable(targetTable = targetTable)

        if (ctx.source != null) {
            val (catalogName, sourceDatabase, sourceTableName) = parseTableName(ctx.source)

            val table = TableId(catalogName, sourceDatabase, sourceTableName)
            deltaMerge.sourceTables.add(table)
        } else if (ctx.sourceQuery != null && ctx.sourceQuery is SparkSqlParser.QueryContext) {
            val query = ctx.sourceQuery as SparkSqlParser.QueryContext
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
            StatementType.REPLACE_TABLE_AS_SELECT == currentOptType ||
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
        val (databaseName, tableName, metaAction) = parseTableName(ctx)
        if (currentOptType == StatementType.CREATE_TABLE_AS_SELECT ||
            currentOptType == StatementType.REPLACE_TABLE_AS_SELECT ||
                currentOptType == StatementType.SELECT ||
                currentOptType == StatementType.INSERT_SELECT ||
                currentOptType == StatementType.MERGE_INTO_TABLE ||
                currentOptType == StatementType.EXPORT_TABLE ||
                currentOptType == StatementType.DATATUNNEL) {

            val table = TableId(databaseName, tableName, metaAction)

            val index = tableLineage.inputTables.indexOf(table)
            if (index == -1) {
                tableLineage.inputTables.add(table)
            }
        } else if (currentOptType == StatementType.MULTI_INSERT) {
            if ("from" == multiInsertToken) {
                val table = TableId(databaseName, tableName, metaAction)
                tableLineage.inputTables.add(table)
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
