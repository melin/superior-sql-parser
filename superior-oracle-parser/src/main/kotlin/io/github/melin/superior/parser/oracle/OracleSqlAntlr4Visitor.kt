package io.github.melin.superior.parser.oracle

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.alter.AlterTable
import io.github.melin.superior.common.relational.alter.AlterTableAction
import io.github.melin.superior.common.relational.common.CallProcedure
import io.github.melin.superior.common.relational.common.CommentStatement
import io.github.melin.superior.common.relational.common.ShowStatement
import io.github.melin.superior.common.relational.create.*
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.common.relational.drop.DropFunction
import io.github.melin.superior.common.relational.drop.DropProcedure
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.parser.oracle.antlr4.OracleParser
import io.github.melin.superior.parser.oracle.antlr4.OracleParser.Function_nameContext
import io.github.melin.superior.parser.oracle.antlr4.OracleParser.Multi_table_elementContext
import io.github.melin.superior.parser.oracle.antlr4.OracleParser.Procedure_nameContext
import io.github.melin.superior.parser.oracle.antlr4.OracleParser.Select_list_elementsContext
import io.github.melin.superior.parser.oracle.antlr4.OracleParserBaseVisitor
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/6/30 9:57 上午
 */
class OracleSqlAntlr4Visitor(val splitSql: Boolean = false, val command: String?):
    OracleParserBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var limit: Int? = null
    private var offset: Int? = null

    private var queryStmts: ArrayList<QueryStmt> = arrayListOf()
    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var outputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()
    private var functionNames: HashSet<FunctionId> = hashSetOf()
    private var procedureNames: HashSet<ProcedureId> = hashSetOf()

    private var statements: ArrayList<Statement> = arrayListOf()
    private val sqls: ArrayList<String> = arrayListOf()

    fun getSqlStatements(): List<Statement> {
        return statements
    }

    fun getSplitSqls(): List<String> {
        return sqls
    }

    override fun shouldVisitNextChild(node: RuleNode, currentResult: Statement?): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitSql_script(ctx: OracleParser.Sql_scriptContext): Statement? {
        ctx.sql_plus_command().forEach {
            var sql = CommonUtils.subsql(command, it)
            sql = CommonUtils.cleanLastSemi(sql)
            if (splitSql) {
                sqls.add(sql)
            } else {
                val startNode = it.start.text
                val statement = if (StringUtils.equalsIgnoreCase("show", startNode)) {
                    val keyWords: ArrayList<String> = arrayListOf()
                    CommonUtils.findShowStatementKeyWord(keyWords, it)
                    ShowStatement(*keyWords.toTypedArray())
                } else {
                    var statement = this.visitSql_plus_command(it)
                    if (statement == null) {
                        statement = DefaultStatement(StatementType.UNKOWN)
                    }
                    statement
                }

                statement.setSql(sql)
                statements.add(statement)

                clean()
            }
        }

        ctx.unit_statement().forEach {
            var sql = CommonUtils.subsql(command, it)
            sql = CommonUtils.cleanLastSemi(sql)
            if (splitSql) {
                sqls.add(sql)
            } else {
                val startNode = it.start.text
                val statement = if (StringUtils.equalsIgnoreCase("show", startNode)) {
                    val keyWords: ArrayList<String> = arrayListOf()
                    CommonUtils.findShowStatementKeyWord(keyWords, it)
                    ShowStatement(*keyWords.toTypedArray())
                } else {
                    var statement = this.visitUnit_statement(it)
                    if (statement == null) {
                        statement = DefaultStatement(StatementType.UNKOWN)
                    }
                    statement
                }

                statement.setSql(sql)
                statements.add(statement)

                clean()
            }
        }
        return null
    }

    private fun clean() {
        currentOptType = StatementType.UNKOWN

        limit = null
        offset = null
        queryStmts = arrayListOf()
        inputTables = arrayListOf()
        outputTables = arrayListOf()
        cteTempTables = arrayListOf()
        functionNames = hashSetOf()
        procedureNames = hashSetOf()
    }

    private fun addOutputTableId(tableId: TableId) {
        if (!outputTables.contains(tableId)) {
            outputTables.add(tableId)
        }
    }

    override fun visitCreate_database(ctx: OracleParser.Create_databaseContext): Statement {
        val databaseName = CommonUtils.cleanQuote(ctx.database_name().text)
        return CreateDatabase(databaseName)
    }

    override fun visitCreate_table(ctx: OracleParser.Create_tableContext): Statement {
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

                ColumnRel(columnName, dataType, defaultExpr = defaultExpr, nullable = nullable, primaryKey = isPk)
            }

        return CreateTable(tableId, TableType.ORACLE, columnRels = columnRels)
    }

    override fun visitCreate_view(ctx: OracleParser.Create_viewContext): Statement {
        currentOptType = StatementType.CREATE_VIEW
        val schemaName = if (ctx.schema_name() != null) ctx.schema_name().text else null
        val tableName = ctx.v.text
        val tableId = TableId(schemaName, tableName)
        val replace = if (ctx.REPLACE() != null) true else false
        val queryStmt = this.parseSelect_only_statement(ctx.select_only_statement()) as QueryStmt
        val createView = CreateView(tableId, queryStmt)
        createView.replace = replace
        return createView
    }

    override fun visitCreate_materialized_view(ctx: OracleParser.Create_materialized_viewContext): Statement {
        currentOptType = StatementType.CREATE_MATERIALIZED_VIEW
        val tableId = parseTableViewName(ctx.tableview_name())
        //val ifNotExists = if (ctx.IF_P() != null) true else false
        val queryStmt = this.parseSelect_only_statement(ctx.select_only_statement()) as QueryStmt
        val createView = CreateMaterializedView(tableId, queryStmt)

        super.visitSelect_only_statement(ctx.select_only_statement())
        return createView
    }

    override fun visitCreate_procedure_body(ctx: OracleParser.Create_procedure_bodyContext): Statement {
        super.visitCreate_procedure_body(ctx)
        val procedureName = ctx.procedure_name()
        val procedureId = parseProcedureName(procedureName)
        val procedure = CreateProcedure(procedureId)
        procedure.inputTables.addAll(inputTables)
        procedure.outputTables.addAll(outputTables)
        procedure.functionNames.addAll(functionNames)
        procedure.procedureNames.addAll(procedureNames)
        return procedure
    }

    override fun visitCreate_function_body(ctx: OracleParser.Create_function_bodyContext): Statement {
        super.visitCreate_function_body(ctx)
        val funcName = ctx.function_name()
        val functionId = parseFunctionName(funcName)
        val function = CreateFunction(functionId)

        function.inputTables = inputTables
        return function
    }

    override fun visitDrop_function(ctx: OracleParser.Drop_functionContext): Statement {
        val funcName = ctx.function_name()
        val functionId = parseFunctionName(funcName)
        return DropFunction(functionId)
    }

    override fun visitDrop_procedure(ctx: OracleParser.Drop_procedureContext): Statement {
        val procedureName = ctx.procedure_name()
        val procedureId = parseProcedureName(procedureName)
        return DropProcedure(procedureId)
    }

    override fun visitAnonymous_block(ctx: OracleParser.Anonymous_blockContext?): Statement {
        super.visitAnonymous_block(ctx)
        val procedure = CreateProcedure()
        procedure.inputTables.addAll(inputTables)
        procedure.outputTables.addAll(outputTables)
        procedure.functionNames.addAll(functionNames)
        procedure.procedureNames.addAll(procedureNames)
        return procedure
    }

    override fun visitCall_statement(ctx: OracleParser.Call_statementContext): Statement {
        ctx.routine_name().forEach {callStat ->
            val procedureId = if (callStat.id_expression().size > 0) {
                ProcedureId(callStat.identifier().text, callStat.id_expression().get(0).text)
            } else {
                ProcedureId(callStat.identifier().text)
            }

            procedureNames.add(procedureId)
        }

        return CallProcedure(procedureNames)
    }

    override fun visitAlter_table(ctx: OracleParser.Alter_tableContext): Statement {
        val tableId = parseTableViewName(ctx.tableview_name())
        return AlterTable(tableId)
    }

    override fun visitAlter_view(ctx: OracleParser.Alter_viewContext): Statement {
        val tableId = parseTableViewName(ctx.tableview_name())
        val action = AlterTableAction(AlterActionType.ALTER_VIEW_QUERY)
        return AlterTable(tableId, action)
    }

    override fun visitSelect_statement(ctx: OracleParser.Select_statementContext): Statement {
        currentOptType = StatementType.SELECT
        super.visitSelect_statement(ctx)
        val queryStmt = QueryStmt(inputTables, limit, offset)

        queryStmts.add(queryStmt)
        return queryStmt
    }

    private fun parseSelect_only_statement(ctx: OracleParser.Select_only_statementContext): Statement {
        currentOptType = StatementType.SELECT
        super.visitSelect_only_statement(ctx)
        val queryStmt = QueryStmt(inputTables, limit, offset)
        queryStmts.add(queryStmt)
        return queryStmt
    }

    override fun visitDelete_statement(ctx: OracleParser.Delete_statementContext): Statement {
        currentOptType = StatementType.DELETE
        val tableId = parseTableViewName(ctx.general_table_ref().dml_table_expression_clause().tableview_name())
        addOutputTableId(tableId)
        super.visitWhere_clause(ctx.where_clause())

        return DeleteTable(tableId, inputTables)
    }

    override fun visitUpdate_statement(ctx: OracleParser.Update_statementContext): Statement {
        currentOptType = StatementType.UPDATE
        val tableId = parseTableViewName(ctx.general_table_ref().dml_table_expression_clause().tableview_name())
        addOutputTableId(tableId)
        super.visitWhere_clause(ctx.where_clause())

        return UpdateTable(tableId, inputTables)
    }

    override fun visitInsert_statement(ctx: OracleParser.Insert_statementContext): Statement {
        currentOptType = StatementType.INSERT

        val insertTable = if (ctx.single_table_insert() != null) {
            val tableInsert = ctx.single_table_insert();
            val tableId = parseTableViewName(tableInsert.insert_into_clause().general_table_ref().dml_table_expression_clause().tableview_name())
            addOutputTableId(tableId)

            if (tableInsert.select_statement() != null) {
                val queryStmt = this.visitSelect_statement(tableInsert.select_statement()) as QueryStmt
                InsertTable(InsertMode.INTO, queryStmt, tableId)
            } else {
                InsertTable(InsertMode.INTO, QueryStmt(), tableId)
            }
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
                val queryStmt = this.visitSelect_statement(ctx.multi_table_insert().select_statement()) as QueryStmt
                InsertTable(InsertMode.INTO, queryStmt, outputTables.first())
            } else {
                InsertTable(InsertMode.INTO, QueryStmt(), outputTables.first())
            }
        }

        insertTable.outputTables.addAll(outputTables.subList(1, outputTables.size))
        return insertTable
    }

    private fun parseFunctionName(funcName: Function_nameContext): FunctionId {
        return if (funcName.id_expression() != null) {
            FunctionId(funcName.identifier().text, funcName.id_expression().text)
        } else {
            FunctionId(funcName.identifier().text)
        }
    }

    private fun parseProcedureName(procedureName: Procedure_nameContext): ProcedureId {
        return if (procedureName.id_expression() != null) {
            ProcedureId(procedureName.identifier().text, procedureName.id_expression().text)
        } else {
            ProcedureId(procedureName.identifier().text)
        }
    }

    private fun addOutputTableId(list: List<Multi_table_elementContext>) {
        list.forEach {
            val tableId = parseTableViewName(
                it.insert_into_clause().general_table_ref().dml_table_expression_clause().tableview_name()
            )
            addOutputTableId(tableId)
        }
    }

    override fun visitMerge_statement(ctx: OracleParser.Merge_statementContext): Statement {
        currentOptType = StatementType.MERGE

        val mergeTableId = parseTableViewName(ctx.tableview_name())
        val mergeTable = MergeTable(mergeTableId)
        super.visitSelected_tableview(ctx.selected_tableview())

        mergeTable.inputTables = inputTables
        return mergeTable
    }

    override fun visitComment_on_column(ctx: OracleParser.Comment_on_columnContext): Statement {
        val objValue = ctx.column_name().text
        val isNull = false
        val text: String = CommonUtils.cleanQuote(ctx.quoted_string().text)
        return CommentStatement(text, isNull, "COLUMN", objValue)
    }

    override fun visitComment_on_table(ctx: OracleParser.Comment_on_tableContext): Statement {
        val objValue = ctx.tableview_name().text
        val isNull = false
        val text: String = CommonUtils.cleanQuote(ctx.quoted_string().text)
        return CommentStatement(text, isNull, "TABLE", objValue)
    }

    override fun visitComment_on_materialized(ctx: OracleParser.Comment_on_materializedContext): Statement {
        val objValue = ctx.tableview_name().text
        val isNull = false
        val text: String = CommonUtils.cleanQuote(ctx.quoted_string().text)
        return CommentStatement(text, isNull, "MATERIALIZED VIEW", objValue)
    }

    override fun visitSubquery_factoring_clause(ctx: OracleParser.Subquery_factoring_clauseContext): Statement? {
        ctx.factoring_element().forEach {
            cteTempTables.add(TableId(it.query_name().text))
        }

        return super.visitSubquery_factoring_clause(ctx)
    }

    override fun visitOffset_clause(ctx: OracleParser.Offset_clauseContext): Statement? {
        try {
            offset = ctx.expression().text.toInt()
        } catch (e: Exception) { }
        return super.visitOffset_clause(ctx)
    }

    override fun visitFetch_clause(ctx: OracleParser.Fetch_clauseContext): Statement? {
        try {
            limit = ctx.expression().text.toInt()
        } catch (e: Exception) { }
        return super.visitFetch_clause(ctx)
    }

    override fun visitTableview_name(ctx: OracleParser.Tableview_nameContext): Statement? {
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
