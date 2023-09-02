package io.github.melin.superior.parser.flink

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.*
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

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class FlinkSqlAntlr4Visitor(val splitSql: Boolean = false, val command: String?):
    FlinkSqlParserBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var currentAlterType: AlterType = AlterType.UNKOWN
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
                var sql = CommonUtils.subsql(command, ctx)
                sql = CommonUtils.cleanLastSemi(sql)
                throw SQLParserException("不支持的SQL: " + sql)
            }
        }
        return statement
    }

    override fun visitSimpleCreateTable(ctx: FlinkSqlParser.SimpleCreateTableContext): Statement {
        val tableId = parseSourceTable(ctx.sourceTable().uid())
        val comment: String? = if (ctx.commentSpec() != null) ctx.commentSpec().STRING_LITERAL().text else null;
        val properties = parseTableOptions(ctx.withOption().tablePropertyList())
        val ifNotExists: Boolean = if (ctx.ifNotExists() != null) true else false

        val columnRels = ctx.columnOptionDefinition().map {
            val column = it.getChild(0)
            if (column is PhysicalColumnDefinitionContext) {
                val colName = column.columnName().text
                val dataType = column.columnType().text
                val colComment: String? = if (column.commentSpec() != null) column.commentSpec().STRING_LITERAL().text else null
                ColumnRel(colName, dataType, colComment, ColumnDefType.PHYSICAL)
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
                val colComment: String? = if (computedColumn.commentSpec() != null) computedColumn.commentSpec().STRING_LITERAL().text else null
                val computedExpr = CommonUtils.subsql(command, computedColumn.computedColumnExpression().expression())
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
        val createTable = CreateTableAsSelect(tableId, null, ifNotExists, properties)

        super.visitQueryStatement(ctx.queryStatement())
        createTable.inputTables.addAll(inputTables)
        return createTable
    }

    override fun visitCreateView(ctx: FlinkSqlParser.CreateViewContext): Statement {
        currentOptType = StatementType.CREATE_VIEW
        val tableId = parseSourceTable(ctx.uid())
        val comment: String? = if (ctx.commentSpec() != null) ctx.commentSpec().STRING_LITERAL().text else null;
        val querySql = StringUtils.substring(command, ctx.queryStatement().start.startIndex)

        val ifNotExists: Boolean = if (ctx.ifNotExists() != null) true else false
        var columnNameList: List<ColumnRel>? = null
        if (ctx.columnNameList() != null) {
            columnNameList = ctx.columnNameList().columnName().map { ColumnRel(CommonUtils.cleanQuote(it.uid().text)) }
        }

        val createTable = CreateView(tableId, querySql, comment, ifNotExists, columnNameList)

        super.visitQueryStatement(ctx.queryStatement())
        createTable.inputTables.addAll(inputTables)
        return createTable
    }

    override fun visitInsertSimpleStatement(ctx: FlinkSqlParser.InsertSimpleStatementContext): Statement {
        currentOptType = StatementType.INSERT
        val tableId = parseSourceTable(ctx.uid())
        val insertMode = if (ctx.KW_INTO() != null) InsertMode.INTO else InsertMode.OVERWRITE
        var columnNameList: List<ColumnRel>? = null
        if (ctx.columnNameList() != null) {
            columnNameList = ctx.columnNameList().columnName().map { ColumnRel(CommonUtils.cleanQuote(it.uid().text)) }
        }

        val insertTable = InsertTable(insertMode, tableId, columnNameList)
        super.visitQueryStatement(ctx.queryStatement())

        insertTable.inputTables.addAll(inputTables)
        insertTable.outputTables.add(tableId)
        insertTable.functionNames.addAll(functionNames)
        return insertTable
    }

    override fun visitQueryStatement(ctx: FlinkSqlParser.QueryStatementContext): Statement {
        if (currentOptType == StatementType.UNKOWN) {
            currentOptType = StatementType.SELECT
        }
        super.visitQueryStatement(ctx)
        return QueryStmt(inputTables, limit, offset)
    }

    override fun visitJarStatememt(ctx: FlinkSqlParser.JarStatememtContext): Statement {
        val jarFileName = CommonUtils.cleanQuote(ctx.jarFileName().text)
        if (ctx.KW_ADD() != null) {
            return AddJarStatememt(jarFileName)
        } else {
            return RemoveJarStatememt(jarFileName)
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

    override fun visitWindowTVFParam(ctx: FlinkSqlParser.WindowTVFParamContext): Statement? {
        if (ctx.timeAttrColumn() != null) {
            val tableId = parseSourceTable(ctx.timeAttrColumn().uid())
            inputTables.add(tableId)
        }
        return null
    }

    override fun visitTablePath(ctx: FlinkSqlParser.TablePathContext): Statement? {
        if (StatementType.SELECT == currentOptType ||
            StatementType.INSERT == currentOptType ||
            StatementType.UPDATE == currentOptType ||
            StatementType.DELETE == currentOptType ||
            StatementType.CREATE_VIEW == currentOptType ||
            StatementType.CREATE_TABLE_AS_SELECT == currentOptType) {

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

    override fun visitSetStatememt(ctx: FlinkSqlParser.SetStatememtContext): Statement {
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
