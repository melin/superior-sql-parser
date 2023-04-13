package io.github.melin.superior.parser.oracle

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.StatementData
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.create.CreateProcedure
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.parser.oracle.antlr4.OracleParser
import io.github.melin.superior.parser.oracle.antlr4.OracleParserBaseVisitor
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode

/**
 * Created by libinsong on 2020/6/30 9:57 上午
 */
class OracleSqlAntlr4Visitor: OracleParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var limit: Int? = null


    private var queryStmts: ArrayList<QueryStmt> = arrayListOf()
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

    override fun visitCreate_procedure_body(ctx: OracleParser.Create_procedure_bodyContext): StatementData {
        super.visitCreate_procedure_body(ctx)
        val procedure = CreateProcedure(ctx.procedure_name().text)
        procedure.queryStmts = queryStmts
        return StatementData(StatementType.PROCEDURE, procedure)
    }

    override fun visitAnonymous_block(ctx: OracleParser.Anonymous_blockContext?): StatementData {
        super.visitAnonymous_block(ctx)

        val procedure = CreateProcedure()
        procedure.queryStmts = queryStmts
        return StatementData(StatementType.PROCEDURE, procedure)
    }

    override fun visitSelect_statement(ctx: OracleParser.Select_statementContext): StatementData {
        currentOptType = StatementType.SELECT
        super.visitSelect_statement(ctx)
        val queryStmt = QueryStmt(inputTables)

        queryStmts.add(queryStmt)
        return StatementData(StatementType.SELECT, queryStmt)
    }

    override fun visitTableview_name(ctx: OracleParser.Tableview_nameContext): StatementData? {
        if (currentOptType == StatementType.SELECT) {
            val tableId = parseTableViewName(ctx)
            inputTables.add(tableId)
        }

        return null
    }

    private fun parseTableViewName(ctx: OracleParser.Tableview_nameContext): TableId {
        if (ctx.childCount == 1) {
            return TableId(null, null, ctx.getChild(0).text)
        } else if (ctx.childCount == 3) {
            return TableId(null, ctx.getChild(0).text, ctx.getChild(2).text)
        } else {
            throw SQLParserException("not suuport tablename")
        }
    }
}
