package com.dataworker.sql.parser.tsql

import com.dataworker.sql.parser.SQLParserException
import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.antlr4.tsql.TSqlParser
import com.dataworker.sql.parser.antlr4.tsql.TSqlParserBaseVisitor
import com.dataworker.sql.parser.model.StatementData
import com.dataworker.sql.parser.model.TableData
import com.dataworker.sql.parser.model.TableSource
import org.antlr.v4.runtime.tree.ParseTree
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/6/30 9:59 上午
 */
class TsqlAntlr4Visitor: TSqlParserBaseVisitor<StatementData>() {

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

    override fun visitSelect_statement(ctx: TSqlParser.Select_statementContext): StatementData? {
        if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitSelect_statement(ctx)

            statementData.limit = limit
            data = StatementData(StatementType.SELECT, statementData)
            return data
        } else {
            return null
        }
    }

    override fun visitTable_source_item(ctx: TSqlParser.Table_source_itemContext): StatementData? {
        if (currentOptType == null) {
            return null
        }

        if (currentOptType == StatementType.SELECT) {
            /*val list = ctx.identifier()

            var db: String? = null
            val text = if (list.size == 1) {
                ctx.text
            } else {
                val index = StringUtils.lastIndexOf(ctx.text, ".")
                db = StringUtils.substring(ctx.text, 0, index)

                StringUtils.substring(ctx.text, index + 1)
            }
            val tableSource = TableSource(db, text)
            statementData.inputTables.add(tableSource)*/
        }
        return null
    }

    fun parseTableName(ctx: TSqlParser.Table_source_itemContext): Triple<String?, String?, String> {
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
