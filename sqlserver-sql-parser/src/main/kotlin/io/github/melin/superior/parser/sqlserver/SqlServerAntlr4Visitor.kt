package io.github.melin.superior.parser.sqlserver

import io.github.melin.superior.common.SQLParserException
import io.github.melin.superior.common.relational.StatementData
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.parser.sqlserver.antlr4.SqlServerParser
import io.github.melin.superior.parser.sqlserver.antlr4.SqlServerParserBaseVisitor
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/6/30 9:59 上午
 */
class SqlServerAntlr4Visitor: SqlServerParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN

    private var limit: Int? = null
    private var inputTables: ArrayList<TableId> = arrayListOf()

    override fun visit(tree: ParseTree?): StatementData {
        val data = super.visit(tree)

        if (data == null) {
            throw SQLParserException("不支持的SQL")
        }

        return data;
    }

    override fun shouldVisitNextChild(node: RuleNode, currentResult: StatementData?): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitSelect_statement(ctx: SqlServerParser.Select_statementContext): StatementData? {
        if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitSelect_statement(ctx)

            val queryStmt = QueryStmt(inputTables, limit)
            queryStmt.inputTables = inputTables
            return StatementData(StatementType.SELECT, queryStmt)
        } else {
            return null
        }
    }

    override fun visitTable_source_item(ctx: SqlServerParser.Table_source_itemContext): StatementData? {
        if (currentOptType == StatementType.SELECT) {
            if (ctx.full_table_name() != null) {
                val tableId = parseTableName(ctx.full_table_name())
                inputTables.add(tableId)
            }
        }
        return null
    }

    fun parseTableName(ctx: SqlServerParser.Full_table_nameContext): TableId {
        if (ctx.database != null) {
            return TableId(ctx.database.text, ctx.schema.text, ctx.table.text)
        } else if (ctx.database != null) {
            return TableId(null, ctx.schema.text, ctx.table.text)
        } else {
            return TableId(null, null, ctx.table.text)
        }
    }
}
