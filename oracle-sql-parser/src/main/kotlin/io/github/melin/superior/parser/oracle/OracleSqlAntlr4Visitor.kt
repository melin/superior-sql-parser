package io.github.melin.superior.parser.oracle

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.common.CommentData
import io.github.melin.superior.common.relational.create.*
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.parser.oracle.antlr4.OracleParser
import io.github.melin.superior.parser.oracle.antlr4.OracleParser.Multi_table_elementContext
import io.github.melin.superior.parser.oracle.antlr4.OracleParser.Select_list_elementsContext
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
    private var outputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()

    private fun addOutputTableId(tableId: TableId) {
        if (!outputTables.contains(tableId)) {
            outputTables.add(tableId)
        }
    }

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

    override fun visitCreate_view(ctx: OracleParser.Create_viewContext): StatementData {
        currentOptType = StatementType.CREATE_VIEW
        val schemaName = if (ctx.schema_name() != null) ctx.schema_name().text else null
        val tableName = ctx.v.text
        val tableId = TableId(schemaName, tableName)

        val replace = if (ctx.REPLACE() != null) true else false
        val createView = CreateView(tableId)
        createView.replace = replace

        super.visitSelect_only_statement(ctx.select_only_statement())
        createView.inputTables.addAll(inputTables)
        return StatementData(currentOptType, createView)
    }

    override fun visitCreate_materialized_view(ctx: OracleParser.Create_materialized_viewContext): StatementData {
        currentOptType = StatementType.CREATE_MATERIALIZED_VIEW
        val tableId = parseTableViewName(ctx.tableview_name())
        //val ifNotExists = if (ctx.IF_P() != null) true else false
        val createView = CreateMaterializedView(tableId)

        super.visitSelect_only_statement(ctx.select_only_statement())
        createView.inputTables = inputTables
        return StatementData(currentOptType, createView)
    }

    override fun visitCreate_procedure_body(ctx: OracleParser.Create_procedure_bodyContext): StatementData {
        super.visitCreate_procedure_body(ctx)
        val procedureName = ctx.procedure_name()
        val procedureId = if (procedureName.id_expression() != null) {
            ProcedureId(procedureName.identifier().text, procedureName.id_expression().text)
        } else {
            ProcedureId(procedureName.identifier().text)
        }
        val procedure = CreateProcedure(procedureId)
        procedure.inputTables = inputTables
        procedure.outputTables = outputTables
        return StatementData(StatementType.CREATE_PROCEDURE, procedure)
    }

    override fun visitCreate_function_body(ctx: OracleParser.Create_function_bodyContext): StatementData {
        super.visitCreate_function_body(ctx)
        val funcName = ctx.function_name()
        val functionId = if (funcName.id_expression() != null) {
            FunctionId(funcName.identifier().text, funcName.id_expression().text)
        } else {
            FunctionId(funcName.identifier().text)
        }
        val function = CreateFunction(functionId)

        function.inputTables = inputTables
        return StatementData(StatementType.CREATE_FUNCTION, function)
    }

    override fun visitAnonymous_block(ctx: OracleParser.Anonymous_blockContext?): StatementData {
        super.visitAnonymous_block(ctx)
        val procedure = CreateProcedure()
        procedure.inputTables = inputTables
        return StatementData(StatementType.CREATE_PROCEDURE, procedure)
    }

    override fun visitAlter_table(ctx: OracleParser.Alter_tableContext?): StatementData {
        return StatementData(StatementType.ALTER_TABLE, AlterTable(AlterType.UNKOWN))
    }

    override fun visitAlter_view(ctx: OracleParser.Alter_viewContext?): StatementData {
        return StatementData(StatementType.ALTER_TABLE, AlterTable(AlterType.ALTER_VIEW))
    }

    override fun visitSelect_statement(ctx: OracleParser.Select_statementContext): StatementData {
        currentOptType = StatementType.SELECT
        super.visitSelect_statement(ctx)
        val queryStmt = QueryStmt(inputTables)

        queryStmts.add(queryStmt)
        return StatementData(StatementType.SELECT, queryStmt)
    }

    override fun visitDelete_statement(ctx: OracleParser.Delete_statementContext): StatementData {
        currentOptType = StatementType.DELETE
        val tableId = parseTableViewName(ctx.general_table_ref().dml_table_expression_clause().tableview_name())
        addOutputTableId(tableId)
        super.visitWhere_clause(ctx.where_clause())

        val update = DeleteTable(tableId, inputTables)
        return StatementData(currentOptType, update)
    }

    override fun visitUpdate_statement(ctx: OracleParser.Update_statementContext): StatementData {
        currentOptType = StatementType.UPDATE
        val tableId = parseTableViewName(ctx.general_table_ref().dml_table_expression_clause().tableview_name())
        addOutputTableId(tableId)
        super.visitWhere_clause(ctx.where_clause())

        val update = UpdateTable(tableId, inputTables)
        return StatementData(currentOptType, update)
    }

    override fun visitInsert_statement(ctx: OracleParser.Insert_statementContext): StatementData {
        currentOptType = StatementType.INSERT

        val insertTable = if (ctx.single_table_insert() != null) {
            val tableInsert = ctx.single_table_insert();
            val tableId = parseTableViewName(tableInsert.insert_into_clause().general_table_ref().dml_table_expression_clause().tableview_name())
            addOutputTableId(tableId)

            if (tableInsert.select_statement() != null) {
                super.visitSelect_statement(tableInsert.select_statement())
            }

            InsertTable(InsertMode.INTO, tableId)
        } else {
            if (ctx.multi_table_insert().conditional_insert_clause() == null) {
                val tableInserts = ctx.multi_table_insert().multi_table_element()
                addOutputTableId(tableInserts)
            } else {
                ctx.multi_table_insert().conditional_insert_clause().conditional_insert_when_part().map {
                    addOutputTableId(it.multi_table_element())
                }

                val elseElem = ctx.multi_table_insert().conditional_insert_clause().conditional_insert_else_part()
                if (elseElem != null) {
                    addOutputTableId(elseElem.multi_table_element())
                }
            }

            if (ctx.multi_table_insert().select_statement() != null) {
                super.visitSelect_statement(ctx.multi_table_insert().select_statement())
            }

            InsertTable(InsertMode.INTO, outputTables.first())
        }

        insertTable.inputTables.addAll(inputTables)
        insertTable.outputTables.addAll(outputTables)
        return StatementData(StatementType.INSERT, insertTable)
    }

    private fun addOutputTableId(list: List<Multi_table_elementContext>) {
        list.forEach {
            val tableId = parseTableViewName(
                it.insert_into_clause().general_table_ref().dml_table_expression_clause().tableview_name()
            )
            addOutputTableId(tableId)
        }
    }

    override fun visitMerge_statement(ctx: OracleParser.Merge_statementContext): StatementData {
        currentOptType = StatementType.MERGE

        val mergeTableId = parseTableViewName(ctx.tableview_name())
        val mergeTable = MergeTable(mergeTableId)
        super.visitSelected_tableview(ctx.selected_tableview())

        mergeTable.inputTables = inputTables
        return StatementData(StatementType.MERGE, mergeTable)
    }

    override fun visitComment_on_column(ctx: OracleParser.Comment_on_columnContext): StatementData {
        val objValue = ctx.column_name().text
        val isNull = false
        val text: String = StringUtil.cleanQuote(ctx.quoted_string().text)
        val comment = CommentData(text, isNull, "COLUMN", objValue)
        return StatementData(StatementType.COMMENT, comment)
    }

    override fun visitComment_on_table(ctx: OracleParser.Comment_on_tableContext): StatementData {
        val objValue = ctx.tableview_name().text
        val isNull = false
        val text: String = StringUtil.cleanQuote(ctx.quoted_string().text)
        val comment = CommentData(text, isNull, "TABLE", objValue)
        return StatementData(StatementType.COMMENT, comment)
    }

    override fun visitComment_on_materialized(ctx: OracleParser.Comment_on_materializedContext): StatementData {
        val objValue = ctx.tableview_name().text
        val isNull = false
        val text: String = StringUtil.cleanQuote(ctx.quoted_string().text)
        val comment = CommentData(text, isNull, "MATERIALIZED VIEW", objValue)
        return StatementData(StatementType.COMMENT, comment)
    }

    override fun visitSubquery_factoring_clause(ctx: OracleParser.Subquery_factoring_clauseContext): StatementData? {
        ctx.factoring_element().forEach {
            cteTempTables.add(TableId(it.query_name().text))
        }

        return super.visitSubquery_factoring_clause(ctx)
    }

    override fun visitTableview_name(ctx: OracleParser.Tableview_nameContext): StatementData? {
        if (currentOptType == StatementType.SELECT ||
            currentOptType == StatementType.CREATE_VIEW ||
            currentOptType == StatementType.CREATE_MATERIALIZED_VIEW ||
            currentOptType == StatementType.UPDATE ||
            currentOptType == StatementType.DELETE ||
            currentOptType == StatementType.MERGE ||
            currentOptType == StatementType.INSERT ||
            currentOptType == StatementType.CREATE_FUNCTION ||
            currentOptType == StatementType.CREATE_PROCEDURE) {

            if (ctx.parent is Select_list_elementsContext) {
                return null
            }

            val tableId = parseTableViewName(ctx)
            if (!inputTables.contains(tableId) && !cteTempTables.contains(tableId)) {
                inputTables.add(tableId)
            }
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
