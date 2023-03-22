package io.github.melin.superior.parser.postgre

import io.github.melin.superior.common.*
import io.github.melin.superior.parser.postgre.antlr4.PostgreSQLParser
import io.github.melin.superior.parser.postgre.antlr4.PostgreSQLParserBaseVisitor
import org.antlr.v4.runtime.tree.ParseTree
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/6/30 9:57 上午
 */
class PostgreSQLAntlr4Visitor: PostgreSQLParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private val statementData = TableData();
    private var limit: Int? = null

    override fun visit(tree: ParseTree?): StatementData {
        val statementData = super.visit(tree)

        if (statementData == null) {
            throw SQLParserException("不支持的SQL")
        }

        return statementData;
    }

    override fun visitSelect_stmt(ctx: PostgreSQLParser.Select_stmtContext): StatementData {
        if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitSelect_stmt(ctx)

            statementData.limit = limit
            return StatementData(StatementType.SELECT, statementData)
        } else {
            throw SQLParserException("not support")
        }
    }

    override fun visitSchema_qualified_name(ctx: PostgreSQLParser.Schema_qualified_nameContext): StatementData? {
        if (currentOptType == StatementType.SELECT) {
            val (_, database, tableName) = parseTableName(ctx)
            val table = TableName(database, tableName)
            statementData.inputTables.add(table)
            return null
        } else {
            throw SQLParserException("not support")
        }
    }

    fun parseTableName(ctx: PostgreSQLParser.Schema_qualified_nameContext): Triple<String?, String?, String> {
        if (ctx.childCount == 5) {
            return Triple(ctx.getChild(0).text, ctx.getChild(2).text, ctx.getChild(4).text)
        } else if (ctx.childCount == 3) {
            return Triple(null, ctx.getChild(0).text, ctx.getChild(2).text)
        } else if (ctx.childCount == 1) {
            return Triple(null, null, ctx.getChild(0).text)
        } else {
            throw SQLParserException("parse schema qualified name error")
        }
    }
}
