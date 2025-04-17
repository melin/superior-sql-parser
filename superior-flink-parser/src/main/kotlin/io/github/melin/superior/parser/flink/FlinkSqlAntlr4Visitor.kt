package io.github.melin.superior.parser.flink

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.*
import io.github.melin.superior.common.antlr4.ParserUtils.source
import io.github.melin.superior.common.relational.DefaultStatement
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.common.*
import io.github.melin.superior.common.relational.create.CreateCatalog
import io.github.melin.superior.common.relational.create.CreateTable
import io.github.melin.superior.common.relational.create.CreateTableAsSelect
import io.github.melin.superior.common.relational.create.CreateView
import io.github.melin.superior.common.relational.dml.InsertMode
import io.github.melin.superior.common.relational.dml.InsertMultiTable
import io.github.melin.superior.common.relational.dml.InsertTable
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.drop.DropCatalog
import io.github.melin.superior.common.relational.table.ColumnDefType
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParser
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParser.ComputedColumnDefinitionContext
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParser.MetadataColumnDefinitionContext
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParser.PhysicalColumnDefinitionContext
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParser.TablePropertyContext
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParser.TablePropertyListContext
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParser.UidContext
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParserBaseVisitor
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils

/** Created by libinsong on 2018/1/10. */
class FlinkSqlAntlr4Visitor(val splitSql: Boolean = false, val command: String?) :
    FlinkSqlParserBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var currentAlterActionType: AlterActionType = AlterActionType.UNKOWN
    private var multiInsertToken: String? = null

    private var limit: Int? = null
    private var offset: Int? = null
    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var outputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()
    private var functionNames: HashSet<FunctionId> = hashSetOf()

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

    override fun visitSqlStatements(ctx: FlinkSqlParser.SqlStatementsContext): Statement? {
        ctx.singleStatement().forEach {
            var sql = source(it)
            if (splitSql) {
                if (StringUtils.endsWith(sql, ";")) {
                    sql = StringUtils.substringBeforeLast(sql, ";")
                }
                sqls.add(sql)
            } else {
                val startNode = it.start.text
                val statement =
                    if (StringUtils.equalsIgnoreCase("show", startNode)) {
                        val keyWords: ArrayList<String> = arrayListOf()
                        CommonUtils.findShowStatementKeyWord(keyWords, it)
                        ShowStatement(*keyWords.toTypedArray())
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

        limit = null
        offset = null
        inputTables = arrayListOf()
        outputTables = arrayListOf()
        cteTempTables = arrayListOf()
        functionNames = hashSetOf()
    }

    override fun visitSqlStatement(ctx: FlinkSqlParser.SqlStatementContext): Statement? {
        val statement = super.visitSqlStatement(ctx)

        if (statement == null) {
            val startToken = StringUtils.lowerCase(ctx.getStart().text)
            if ("desc".equals(startToken) || "describe".equals(startToken)) {
                return DefaultStatement(StatementType.DESC)
            } else {
                val sql = source(ctx)
                throw SQLParserException("不支持的SQL: " + sql)
            }
        }
        return statement
    }

    override fun visitSimpleCreateTable(ctx: FlinkSqlParser.SimpleCreateTableContext): Statement {
        val tableId = parseSourceTable(ctx.sourceTable().uid())
        val comment: String? = if (ctx.commentSpec() != null) ctx.commentSpec().STRING_LITERAL().text else null
        val properties = parseTableOptions(ctx.withOption().tablePropertyList())
        val ifNotExists: Boolean = if (ctx.ifNotExists() != null) true else false

        val primayKeys =
            if (ctx.tableConstraint() != null) {
                ctx.tableConstraint().columnNameList().columnName().map { col -> col.uid().text }
            } else {
                listOf()
            }

        val columnRels =
            ctx.columnOptionDefinition().map {
                val column = it.getChild(0)
                if (column is PhysicalColumnDefinitionContext) {
                    val colName = column.columnName().text
                    val dataType = column.columnType().text
                    val primaryKey = if (column.columnConstraint() != null) true else primayKeys.contains(colName)
                    val colComment: String? =
                        if (column.commentSpec() != null) column.commentSpec().STRING_LITERAL().text else null
                    ColumnRel(colName, dataType, colComment, primaryKey, ColumnDefType.PHYSICAL)
                } else if (column is MetadataColumnDefinitionContext) {
                    val colName = column.columnName().text
                    val dataType = column.columnType().text
                    var metadataKey: String? = null
                    if (column.metadataKey() != null) {
                        metadataKey = CommonUtils.cleanQuote(column.metadataKey().text)
                    }
                    val columnRel = ColumnRel(colName, dataType, null, ColumnDefType.METADATA)
                    columnRel.metadataKey = metadataKey
                    columnRel
                } else {
                    val computedColumn = column as ComputedColumnDefinitionContext
                    val colName = computedColumn.columnName().text
                    val colComment: String? =
                        if (computedColumn.commentSpec() != null) computedColumn.commentSpec().STRING_LITERAL().text
                        else null
                    val computedExpr = source(computedColumn.computedColumnExpression().expression())
                    val columnRel = ColumnRel(colName, null, colComment, ColumnDefType.COMPUTED)
                    columnRel.computedExpr = computedExpr
                    columnRel
                }
            }

        return CreateTable(tableId, TableType.FLINK, comment, columnRels, ifNotExists, properties)
    }

    override fun visitCreateTableAsSelect(ctx: FlinkSqlParser.CreateTableAsSelectContext): Statement {
        currentOptType = StatementType.CREATE_TABLE_AS_SELECT
        val tableId = parseSourceTable(ctx.sourceTable().uid())
        val properties = parseTableOptions(ctx.withOption().tablePropertyList())

        val ifNotExists: Boolean = if (ctx.ifNotExists() != null) true else false
        val queryStmt = this.visitQueryStatement(ctx.queryStatement()) as QueryStmt
        return CreateTableAsSelect(tableId, queryStmt, null, ifNotExists, properties)
    }

    override fun visitCreateView(ctx: FlinkSqlParser.CreateViewContext): Statement {
        currentOptType = StatementType.CREATE_VIEW
        val tableId = parseSourceTable(ctx.uid())
        val comment: String? = if (ctx.commentSpec() != null) ctx.commentSpec().STRING_LITERAL().text else null
        val queryStmt = this.visitQueryStatement(ctx.queryStatement()) as QueryStmt

        val ifNotExists: Boolean = if (ctx.ifNotExists() != null) true else false
        var columnNameList: List<ColumnRel>? = null
        if (ctx.columnNameList() != null) {
            columnNameList = ctx.columnNameList().columnName().map { ColumnRel(CommonUtils.cleanQuote(it.uid().text)) }
        }

        return CreateView(tableId, queryStmt, comment, ifNotExists, columnNameList)
    }

    override fun visitInsertStatement(ctx: FlinkSqlParser.InsertStatementContext): Statement {
        if (ctx.insertSimpleStatement() != null) {
            return this.insertSimpleStatement(ctx.insertSimpleStatement())
        } else if (ctx.insertMulStatementCompatibility() != null) {
            val insertTables =
                ctx.insertMulStatementCompatibility().insertSimpleStatement().map { insertStmt ->
                    this.insertSimpleStatement(insertStmt)
                }

            return InsertMultiTable(insertTables)
        } else if (ctx.insertMulStatement() != null) {
            val insertTables =
                ctx.insertMulStatement().insertSimpleStatement().map { insertStmt ->
                    this.insertSimpleStatement(insertStmt)
                }

            return InsertMultiTable(insertTables)
        }
        return super.visitInsertStatement(ctx)
    }

    private fun insertSimpleStatement(ctx: FlinkSqlParser.InsertSimpleStatementContext): InsertTable {
        currentOptType = StatementType.INSERT
        val tableId = parseSourceTable(ctx.uid())
        val insertMode = if (ctx.KW_INTO() != null) InsertMode.INTO else InsertMode.OVERWRITE
        var columnNameList: List<ColumnRel>? = null
        if (ctx.columnNameList() != null) {
            columnNameList = ctx.columnNameList().columnName().map { ColumnRel(CommonUtils.cleanQuote(it.uid().text)) }
        }

        val queryStmt = this.visitQueryStatement(ctx.queryStatement()) as QueryStmt
        val insertTable = InsertTable(insertMode, queryStmt, tableId, columnNameList)

        insertTable.outputTables.add(tableId)

        var sql = source(ctx)
        insertTable.setSql(sql)
        return insertTable
    }

    override fun visitQueryStatement(ctx: FlinkSqlParser.QueryStatementContext): Statement {
        if (currentOptType == StatementType.UNKOWN) {
            currentOptType = StatementType.SELECT
        }
        super.visitQueryStatement(ctx)
        return QueryStmt(inputTables, limit, offset)
    }

    override fun visitJarStatement(ctx: FlinkSqlParser.JarStatementContext): Statement {
        val jarFileName = CommonUtils.cleanQuote(ctx.jarFileName().text)
        if (ctx.KW_ADD() != null) {
            return AddResourceStatement(jarFileName, "jar")
        } else {
            return RemoveResourceStatement(jarFileName, "jar")
        }
    }

    override fun visitCreateCatalog(ctx: FlinkSqlParser.CreateCatalogContext): Statement {
        val catalogName: String = CommonUtils.cleanQuote(ctx.uid().text)
        val properties = parseTableOptions(ctx.withOption().tablePropertyList())
        return CreateCatalog(catalogName, properties)
    }

    override fun visitDropCatalog(ctx: FlinkSqlParser.DropCatalogContext): Statement {
        val catalogName: String = CommonUtils.cleanQuote(ctx.uid().text)
        return DropCatalog(catalogName)
    }

    override fun visitExplainStatement(ctx: FlinkSqlParser.ExplainStatementContext?): Statement {
        return DefaultStatement(StatementType.EXPLAIN)
    }

    override fun visitUseStatement(ctx: FlinkSqlParser.UseStatementContext): Statement {
        val catalogName: String = CommonUtils.cleanQuote(ctx.uid().text)
        return UseCatalog(catalogName)
    }

    override fun visitSyncTableExpr(ctx: FlinkSqlParser.SyncTableExprContext): Statement {
        val sinkTable = parseSourceTable(ctx.sink.uid())
        val sourceTable = parseSourceTable(ctx.source.uid())

        val sinkOptions = parseTableOptions(ctx.sinkOptions)
        val sourceOptions = parseTableOptions(ctx.sourceOptions)

        val createTable = SyncTable(sinkTable, sourceTable)
        createTable.sinkOptions.putAll(sinkOptions)
        createTable.sourceOptions.putAll(sourceOptions)

        return createTable
    }

    override fun visitSyncDatabaseExpr(ctx: FlinkSqlParser.SyncDatabaseExprContext): Statement {
        val sinkDatabase = parseDatabase(ctx.sink.uid())
        val sourceDatabase = parseDatabase(ctx.source.uid())

        val sinkOptions = parseTableOptions(ctx.sinkOptions)
        val sourceOptions = parseTableOptions(ctx.sourceOptions)

        val createDatabase =
            if (ctx.includeTable == null) {
                SyncDatabase(sinkDatabase.first, sinkDatabase.second, sourceDatabase.first, sourceDatabase.second)
            } else {
                SyncDatabase(
                    sinkDatabase.first,
                    sinkDatabase.second,
                    sourceDatabase.first,
                    sourceDatabase.second,
                    CommonUtils.cleanQuote(ctx.includeTable.text),
                )
            }

        if (ctx.excludeTable != null) {
            createDatabase.excludingTables = CommonUtils.cleanQuote(ctx.excludeTable.text)
        }

        createDatabase.sinkOptions.putAll(sinkOptions)
        createDatabase.sourceOptions.putAll(sourceOptions)
        return createDatabase
    }

    override fun visitWindowTVFParam(ctx: FlinkSqlParser.WindowTVFParamContext): Statement? {
        if (ctx.timeAttrColumn() != null) {
            val tableId = parseSourceTable(ctx.timeAttrColumn().uid())
            inputTables.add(tableId)
        }
        return null
    }

    override fun visitTablePath(ctx: FlinkSqlParser.TablePathContext): Statement? {
        if (
            StatementType.SELECT == currentOptType ||
                StatementType.INSERT == currentOptType ||
                StatementType.UPDATE == currentOptType ||
                StatementType.DELETE == currentOptType ||
                StatementType.CREATE_VIEW == currentOptType ||
                StatementType.CREATE_TABLE_AS_SELECT == currentOptType
        ) {

            val tableId = parseSourceTable(ctx.uid())

            if (!inputTables.contains(tableId) && !cteTempTables.contains(tableId)) {
                inputTables.add(tableId)
            }
        }
        return null
    }

    override fun visitWithItem(ctx: FlinkSqlParser.WithItemContext): Statement? {
        val tableId = TableId(ctx.withItemName().text)
        cteTempTables.add(tableId)
        super.visitWithItem(ctx)
        return null
    }

    override fun visitSetStatement(ctx: FlinkSqlParser.SetStatementContext): Statement {
        val tableProperty = ctx.tableProperty()
        var key = tableProperty.tablePropertyKey().text
        var value = tableProperty.tablePropertyValue().text
        key = CommonUtils.cleanQuote(key)
        value = CommonUtils.cleanQuote(value)
        return SetStatement(key, value)
    }

    override fun visitLimitClause(ctx: FlinkSqlParser.LimitClauseContext): Statement? {
        if (ctx.limit != null) {
            limit = ctx.limit.text.toInt()
        }
        return super.visitLimitClause(ctx)
    }

    private fun parseSourceTable(uid: UidContext): TableId {
        val nodes = uid.identifier()
        if (nodes.size == 3) {
            val catalog = CommonUtils.cleanQuote(nodes.get(0).text)
            val schema = CommonUtils.cleanQuote(nodes.get(1).text)
            val tableName = CommonUtils.cleanQuote(nodes.get(2).text)
            return TableId(catalog, schema, tableName)
        } else if (nodes.size == 2) {
            val schema = CommonUtils.cleanQuote(nodes.get(0).text)
            val tableName = CommonUtils.cleanQuote(nodes.get(1).text)
            return TableId(schema, tableName)
        } else if (nodes.size == 1) {
            val tableName = CommonUtils.cleanQuote(nodes.get(0).text)
            return TableId(tableName)
        } else {
            throw SQLParserException("parse multipart error: " + nodes.size)
        }
    }

    fun parseDatabase(uid: UidContext): Pair<String?, String> {
        val nodes = uid.identifier()
        if (nodes.size == 2) {
            val database = CommonUtils.cleanQuote(nodes.get(0).text)
            val schema = CommonUtils.cleanQuote(nodes.get(1).text)
            return Pair(database, schema)
        } else if (nodes.size == 1) {
            val schema = CommonUtils.cleanQuote(nodes.get(0).text)
            return Pair(null, schema)
        } else {
            throw SQLParserException("parse multipart error: " + nodes.size)
        }
    }

    private fun parseTableOptions(ctx: TablePropertyListContext): Map<String, String> {
        val properties = HashMap<String, String>()
        ctx.tableProperty().forEach { item ->
            val property = item as TablePropertyContext
            val key = CommonUtils.cleanQuote(property.key.text)
            val value = CommonUtils.cleanQuote(property.value.text)
            properties.put(key, value)
        }

        return properties
    }
}
