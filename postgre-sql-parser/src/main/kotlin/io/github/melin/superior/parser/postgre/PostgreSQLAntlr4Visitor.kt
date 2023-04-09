package io.github.melin.superior.parser.postgre

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.StatementData
import io.github.melin.superior.common.relational.TableLineage
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.parser.postgre.antlr4.PostgreSQLParser
import io.github.melin.superior.parser.postgre.antlr4.PostgreSQLParserBaseVisitor
import org.antlr.v4.runtime.tree.ParseTree
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/6/30 9:57 上午
 */
class PostgreSQLAntlr4Visitor: PostgreSQLParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private val statementData = TableLineage();
    private var limit: Int? = null

    override fun visit(tree: ParseTree?): StatementData {
        val statementData = super.visit(tree)

        if (statementData == null) {
            throw SQLParserException("不支持的SQL")
        }

        return statementData;
    }

    override fun visitSelectstmt(ctx: PostgreSQLParser.SelectstmtContext): StatementData {
        if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitSelectstmt(ctx)

            statementData.limit = limit
            return StatementData(StatementType.SELECT, statementData)
        } else {
            throw SQLParserException("not support")
        }
    }

    override fun visitQualified_name(ctx: PostgreSQLParser.Qualified_nameContext): StatementData? {
        if (currentOptType == StatementType.SELECT) {
            val (_, database, tableName) = parseTableName(ctx)
            val table = TableId(database, tableName)
            statementData.inputTables.add(table)
            return null
        } else {
            throw SQLParserException("not support")
        }
    }

    fun parseTableName(ctx: PostgreSQLParser.Qualified_nameContext): TableId {
        if (ctx.childCount == 2) {
            val obj = ctx.getChild(1);
            if (obj.childCount == 2) {
                return TableId(ctx.getChild(0).text, obj.getChild(0).text, obj.getChild(1).text)
            } else if (obj.childCount == 1) {
                return TableId(ctx.getChild(0).text, obj.getChild(1).text)
            }
        } else if (ctx.childCount == 1) {
            return TableId(ctx.getChild(0).text)
        }

        throw SQLParserException("parse schema qualified name error")
    }
}
