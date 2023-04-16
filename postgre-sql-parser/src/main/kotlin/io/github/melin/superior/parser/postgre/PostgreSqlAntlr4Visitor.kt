package io.github.melin.superior.parser.postgre

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.AlterTable
import io.github.melin.superior.common.relational.StatementData
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.create.CreateIndex
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.drop.DropIndex
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParserBaseVisitor
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParser
import javafx.scene.control.Tab
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/6/30 9:57 上午
 */
class PostgreSqlAntlr4Visitor: PostgreSqlParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN

    private var limit: Int? = null
    private var inputTables: ArrayList<TableId> = arrayListOf()

    override fun visit(tree: ParseTree?): StatementData {
        val statementData = super.visit(tree)

        if (statementData == null) {
            throw SQLParserException("不支持的SQL")
        }

        return statementData;
    }

    override fun shouldVisitNextChild(node: RuleNode, currentResult: StatementData?): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitSelectstmt(ctx: PostgreSqlParser.SelectstmtContext): StatementData {
        if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitSelectstmt(ctx)

            val queryStmt = QueryStmt(inputTables, limit)
            return StatementData(StatementType.SELECT, queryStmt)
        } else {
            throw SQLParserException("not support")
        }
    }

    override fun visitQualified_name(ctx: PostgreSqlParser.Qualified_nameContext): StatementData? {
        if (currentOptType == StatementType.SELECT) {
            val tableId = parseTableName(ctx)
            inputTables.add(tableId)
            return null
        } else {
            throw SQLParserException("not support")
        }
    }

    // create index
    override fun visitIndexstmt(ctx: PostgreSqlParser.IndexstmtContext): StatementData {
        val tableId = parseTableName(ctx.relation_expr())
        val indexName = if (ctx.opt_index_name() != null) {
            ctx.opt_index_name().text
        } else {
            ctx.name().text
        }
        val createIndex = CreateIndex(indexName)
        val alterTable = AlterTable(AlterType.ADD_INDEX, tableId, createIndex)
        return StatementData(StatementType.ALTER_TABLE, alterTable)
    }

    override fun visitDropstmt(ctx: PostgreSqlParser.DropstmtContext): StatementData {
        if (ctx.object_type_any_name() != null) {
            if (ctx.object_type_any_name().INDEX() != null) {
                val actions = ctx.any_name_list().any_name().map { indexName ->  DropIndex(indexName.text)}
                val tableId = TableId("")
                val alterTable = AlterTable(AlterType.DROP_INDEX, tableId)
                alterTable.addActions(actions)
                return StatementData(StatementType.ALTER_TABLE, alterTable)
            }
        }

        throw SQLParserException("not support")
    }

    //----------------------------------------private methods------------------------------------

    fun parseTableName(ctx: PostgreSqlParser.Relation_exprContext): TableId {
        return parseTableName(ctx.qualified_name())
    }

    fun parseTableName(ctx: PostgreSqlParser.Qualified_nameContext): TableId {
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
