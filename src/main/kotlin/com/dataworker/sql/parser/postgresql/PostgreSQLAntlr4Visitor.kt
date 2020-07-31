package com.dataworker.sql.parser.postgresql

import com.dataworker.sql.parser.SQLParserException
import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.antlr4.postgresql.PostgreSQLParser
import com.dataworker.sql.parser.antlr4.postgresql.PostgreSQLParserBaseVisitor
import com.dataworker.sql.parser.model.StatementData
import com.dataworker.sql.parser.model.TableData
import com.dataworker.sql.parser.model.TableSource
import org.antlr.v4.runtime.tree.ParseTree
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/6/30 9:57 上午
 */
class PostgreSQLAntlr4Visitor: PostgreSQLParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private val statementData = TableData();
    private var limit: Int? = null
    private var data: StatementData? = null

    override fun visit(tree: ParseTree?): StatementData? {
        super.visit(tree)

        if (data == null) {
            throw SQLParserException("不支持的SQL")
        }

        return data;
    }

    override fun visitSelect_stmt(ctx: PostgreSQLParser.Select_stmtContext): StatementData? {
        if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitSelect_stmt(ctx)

            statementData.limit = limit
            data = StatementData(StatementType.SELECT, statementData)
            return data
        } else {
            return null
        }
    }

    override fun visitSchema_qualified_name(ctx: PostgreSQLParser.Schema_qualified_nameContext): StatementData? {
        if (currentOptType == null) {
            return null
        }

        if (currentOptType == StatementType.SELECT) {
            val (namespace, database, table) = parseTableName(ctx)
            val tableSource = TableSource(database, table)
            statementData.inputTables.add(tableSource)
        }
        return null
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
