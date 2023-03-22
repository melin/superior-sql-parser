package io.github.melin.superior.parser.flink

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.*
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParser
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParserBaseVisitor
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class FlinkSQLAntlr4Visitor : FlinkSqlParserBaseVisitor<StatementData>() {
    private var currentOptType: StatementType = StatementType.UNKOWN
    private val statementData = TableData()
    private var command: String? = null

    override fun shouldVisitNextChild(node: RuleNode, currentResult: StatementData?): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitSingleStatement(ctx: FlinkSqlParser.SingleStatementContext): StatementData {
        val data = super.visitSingleStatement(ctx)

        if (data == null) {
            throw SQLParserException("不支持的SQL: " + command)
        }

        return data
    }

    override fun visitBeginStatement(ctx: FlinkSqlParser.BeginStatementContext): StatementData {
        return StatementData(StatementType.FLINK_CDC_BEGIN)
    }

    override fun visitEndStatement(ctx: FlinkSqlParser.EndStatementContext): StatementData {
        currentOptType = StatementType.FLINK_CDC_CTAS
        return StatementData(StatementType.FLINK_CDC_END)
    }

    override fun visitCreateTable(ctx: FlinkSqlParser.CreateTableContext): StatementData {
        val sinkTable = parseTable(ctx.sink)
        val sourceTable = parseTable(ctx.source)

        val sinkOptions: HashMap<String, String>? = parseOptions(ctx.sinkOptions)
        val sourceOptions: HashMap<String, String>? = parseOptions(ctx.sourceOptions)

        val createTable = CreateTable(sinkTable, sourceTable)
        createTable.sinkOptions = sinkOptions
        createTable.sourceOptions = sourceOptions

        if (ctx.computeColList() != null) {
            val colDefs = ctx.computeColList().computeColDef();
            val columns = colDefs.map { colDef ->
                val colName = colDef.colName.text
                val column = Column(colName)

                val expression = colDef.expression();
                val expr = StringUtils.substring(command, expression.start.startIndex, expression.stop.stopIndex + 1)
                column.expression = expr

                if (colDef.FIRST() != null) {
                    column.position = "FIRST"
                }
                if (colDef.AFTER() != null) {
                    column.position = "AFTER"
                    column.afterCol = colDef.name.text
                }

                column
            }

            createTable.computeCols = columns
        }

        return StatementData(StatementType.FLINK_CDC_CTAS, createTable)
    }

    override fun visitCreateDatabase(ctx: FlinkSqlParser.CreateDatabaseContext): StatementData {
        val sinkDatabase = parseDatabase(ctx.sink)
        val sourceDatabase = parseDatabase(ctx.source)

        val sinkOptions: HashMap<String, String>? = parseOptions(ctx.sinkOptions)
        val sourceOptions: HashMap<String, String>? = parseOptions(ctx.sourceOptions)

        val createDatabase = if (ctx.includeTable == null) {
            CreateDatabase(sinkDatabase, sourceDatabase, "__ALL__")
        } else {
            CreateDatabase(sinkDatabase, sourceDatabase, StringUtil.cleanQuote(ctx.includeTable.text))
        }

        if (ctx.excludeTable != null) {
            createDatabase.excludeTable = StringUtil.cleanQuote(ctx.excludeTable.text)
        }

        createDatabase.sinkOptions = sinkOptions
        createDatabase.sourceOptions = sourceOptions
        return StatementData(StatementType.FLINK_CDC_CDAS, createDatabase)
    }

    fun parseDatabase(ctx: FlinkSqlParser.MultipartIdentifierContext): DatabaseName {
        if (ctx.parts.size == 2) {
            return DatabaseName(ctx.parts.get(0).text, ctx.parts.get(1).text)
        } else if (ctx.parts.size == 1) {
            return DatabaseName(null, ctx.parts.get(0).text)
        } else {
            throw SQLParserException("parse multipart error: " + ctx.parts.size)
        }
    }

    fun parseTable(ctx: FlinkSqlParser.MultipartIdentifierContext): TableName {
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

    fun parseOptions(options: FlinkSqlParser.PropertyListContext?): HashMap<String, String>? {
        if (options == null) {
            return null
        }
        val properties = HashMap<String, String>()
        options.children.filter { it is FlinkSqlParser.PropertyContext }.map { item ->
            val property = item as FlinkSqlParser.PropertyContext
            val key = StringUtil.cleanQuote(property.key.text)
            val value = StringUtil.cleanQuote(property.value.text)
            properties.put(key, value)
        }
        return properties
    }

    fun setCommand(command: String) {
        this.command = command;
    }
}
