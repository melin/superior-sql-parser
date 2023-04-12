package io.github.melin.superior.parser.starrocks

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.StatementData
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.table.Column
import io.github.melin.superior.common.relational.create.CreateTable
import io.github.melin.superior.parser.starrocks.antlr4.StarRocksParserBaseVisitor
import io.github.melin.superior.parser.starrocks.antlr4.StarRocksParserParser
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode

/**
 * Created by libinsong on 2020/6/30 9:59 上午
 */
class StarRocksAntlr4Visitor: StarRocksParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN

    override fun visit(tree: ParseTree): StatementData {
        return super.visit(tree)
    }

    override fun shouldVisitNextChild(node: RuleNode, currentResult: StatementData?): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitCreateTableStatement(ctx: StarRocksParserParser.CreateTableStatementContext): StatementData {
        val tableId = parseTableName(ctx.qualifiedName())
        val comment = if (ctx.comment() != null) StringUtil.cleanQuote(ctx.comment().text) else null
        val columns: List<Column> = ctx.columnDesc().map { column ->
            val columnName = column.identifier().text
            val dataType = column.type().text
            val colComment = if (column.comment() != null) StringUtil.cleanQuote(column.comment().string().text) else null
            Column(columnName, dataType, colComment)
        }

        val createTable = CreateTable(tableId, comment, columns)
        return StatementData(StatementType.CREATE_TABLE, createTable)
    }


    fun parseTableName(ctx: StarRocksParserParser.QualifiedNameContext): TableId {
        return if (ctx.identifier().size == 2) {
            TableId(ctx.identifier().get(0).text, ctx.identifier().get(1).text)
        } else if (ctx.identifier().size == 1) {
            TableId(ctx.identifier().get(0).text)
        } else {
            throw SQLParserException("parse qualifiedName error: " + ctx.identifier().size)
        }
    }
}
