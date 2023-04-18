package io.github.melin.superior.parser.oracle

import com.google.common.collect.Table
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.StatementData
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.create.CreateProcedure
import io.github.melin.superior.common.relational.create.CreateTable
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.table.ColumnRel
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

    override fun visitCreate_table(ctx: OracleParser.Create_tableContext): StatementData {
        currentOptType = StatementType.CREATE_TABLE
        val schemaName = if (ctx.schema_name() != null) ctx.schema_name().text else null
        val tableName = ctx.table_name().text
        val tableId = TableId(schemaName, tableName)

        val pks: ArrayList<String> = arrayListOf()
        val columnRels = ctx.relational_table().relational_property()
            .filter {
                val constraint = it.out_of_line_constraint()
                if (constraint != null && constraint.PRIMARY() != null) {
                    constraint.column_name().forEach { pks.add(it.text) }
                }

                it.column_definition() != null
            }.map {
                val colDef = it.column_definition();
                val columnName = colDef.column_name().text
                val dataType = colDef.datatype().text
                val defaultExpr: String? = if (colDef.expression() != null) colDef.expression().text else null;

                var isPk = if (pks.contains(columnName)) true else false
                var nullable = true
                if (colDef.inline_constraint() != null) {
                    colDef.inline_constraint().forEach {constraint ->
                        if (constraint.NOT() != null) {
                            nullable = false
                        }

                        if (constraint.PRIMARY() != null) {
                            isPk = true
                        }
                    }
                }

                ColumnRel(columnName, dataType, defaultExpr = defaultExpr, nullable = nullable, isPk = isPk)
            }

        val createTable = CreateTable(tableId, columnRels = columnRels)
        return StatementData(currentOptType, createTable)
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
