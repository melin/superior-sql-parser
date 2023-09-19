package io.github.melin.superior.parser.flink

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.DefaultStatement
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.common.SyncDatabase
import io.github.melin.superior.common.relational.common.SyncTable
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.parser.flink.antlr4.FlinkCdcSqlParser
import io.github.melin.superior.parser.flink.antlr4.FlinkCdcSqlParserBaseVisitor
import org.antlr.v4.runtime.tree.RuleNode

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class FlinkCdcSqlAntlr4Visitor(val splitSql: Boolean = false, val command: String?):
    FlinkCdcSqlParserBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN

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

    override fun visitSqlStatements(ctx: FlinkCdcSqlParser.SqlStatementsContext): Statement? {
        ctx.singleStatement().forEach {
            var sql = CommonUtils.subsql(command, it)
            sql = CommonUtils.cleanLastSemi(sql)
            if (splitSql) {
                sqls.add(sql)
            } else {
                var statement = this.visitSingleStatement(it)
                if (statement == null) {
                    statement = DefaultStatement(StatementType.UNKOWN)
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
    }

    override fun visitSingleStatement(ctx: FlinkCdcSqlParser.SingleStatementContext): Statement {
        val data = super.visitSingleStatement(ctx)

        if (data == null) {
            throw SQLParserException("不支持的SQL: " + command)
        }

        return data
    }

    override fun visitSyncTableExpr(ctx: FlinkCdcSqlParser.SyncTableExprContext): Statement {
        val sinkTable = parseTable(ctx.sink)
        val sourceTable = parseTable(ctx.source)

        val sinkOptions: HashMap<String, String> = parseOptions(ctx.sinkOptions)
        val sourceOptions: HashMap<String, String> = parseOptions(ctx.sourceOptions)

        val createTable = SyncTable(sinkTable, sourceTable)
        createTable.sinkOptions = sinkOptions
        createTable.sourceOptions = sourceOptions

        if (ctx.computeColList() != null) {
            val colDefs = ctx.computeColList().computeColDef();
            val columns = colDefs.map { colDef ->
                val colName = colDef.colName.text
                val columnRel = ColumnRel(colName)

                val expression = colDef.expression()
                val expr =CommonUtils.subsql(command, expression)
                columnRel.expression = expr

                if (colDef.FIRST() != null) {
                    columnRel.position = "FIRST"
                }
                if (colDef.AFTER() != null) {
                    columnRel.position = "AFTER"
                    columnRel.afterCol = colDef.name.text
                }

                columnRel
            }

            createTable.computeCols = columns
        }

        return createTable
    }

    override fun visitSyncDatabaseExpr(ctx: FlinkCdcSqlParser.SyncDatabaseExprContext): Statement {
        val sinkDatabase = parseDatabase(ctx.sink)
        val sourceDatabase = parseDatabase(ctx.source)

        val sinkOptions: HashMap<String, String> = parseOptions(ctx.sinkOptions)
        val sourceOptions: HashMap<String, String> = parseOptions(ctx.sourceOptions)

        val createDatabase = if (ctx.includeTable == null) {
            SyncDatabase(sinkDatabase.first, sinkDatabase.second, sourceDatabase.first, sourceDatabase.second, null)
        } else {
            SyncDatabase(sinkDatabase.first, sinkDatabase.second, sourceDatabase.first, sourceDatabase.second, CommonUtils.cleanQuote(ctx.includeTable.text))
        }

        if (ctx.excludeTable != null) {
            createDatabase.excludeTable = CommonUtils.cleanQuote(ctx.excludeTable.text)
        }

        createDatabase.sinkOptions = sinkOptions
        createDatabase.sourceOptions = sourceOptions
        return createDatabase
    }

    fun parseDatabase(ctx: FlinkCdcSqlParser.MultipartIdentifierContext): Pair<String?, String> {
        if (ctx.parts.size == 2) {
            return Pair(ctx.parts.get(0).text, ctx.parts.get(1).text)
        } else if (ctx.parts.size == 1) {
            return Pair(null, ctx.parts.get(0).text)
        } else {
            throw SQLParserException("parse multipart error: " + ctx.parts.size)
        }
    }

    fun parseTable(ctx: FlinkCdcSqlParser.MultipartIdentifierContext): TableId {
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

    fun parseOptions(options: FlinkCdcSqlParser.PropertyListContext?): HashMap<String, String> {
        val properties = HashMap<String, String>()
        if (options == null) {
            return properties
        }

        options.children.filter { it is FlinkCdcSqlParser.PropertyContext }.map { item ->
            val property = item as FlinkCdcSqlParser.PropertyContext
            val key = CommonUtils.cleanQuote(property.key.text)
            val value = CommonUtils.cleanQuote(property.value.text)
            properties.put(key, value)
        }
        return properties
    }
}
