package io.github.melin.superior.parser.sqlserver

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.antlr4.ParserUtils.source
import io.github.melin.superior.common.relational.DefaultStatement
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.common.ShowStatement
import io.github.melin.superior.common.relational.common.UseDatabase
import io.github.melin.superior.common.relational.create.CreateDatabase
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.common.relational.drop.DropDatabase
import io.github.melin.superior.parser.sqlserver.antlr4.SqlServerParser
import io.github.melin.superior.parser.sqlserver.antlr4.SqlServerParserBaseVisitor
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils

/** Created by libinsong on 2020/6/30 9:59 上午 */
class SqlServerAntlr4Visitor(val splitSql: Boolean = false, val command: String?) :
    SqlServerParserBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN

    private var limit: Int? = null
    private var offset: Int? = null
    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var outputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()

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

    override fun visitTsql_file(ctx: SqlServerParser.Tsql_fileContext): Statement? {
        ctx.batch().forEach { this.visitBatch(it) }
        return null
    }

    override fun visitBatch(ctx: SqlServerParser.BatchContext): Statement? {
        ctx.sql_clauses().forEach {
            val sql = source(it)
            if (splitSql) {
                sqls.add(sql)
            } else {
                val startNode = it.start.text
                val statement =
                    if (StringUtils.equalsIgnoreCase("show", startNode)) {
                        val keyWords: ArrayList<String> = arrayListOf()
                        CommonUtils.findShowStatementKeyWord(keyWords, it)
                        ShowStatement(*keyWords.toTypedArray())
                    } else {
                        var statement = this.visitSql_clauses(it)
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
        inputTables = arrayListOf()
        outputTables = arrayListOf()
        cteTempTables = arrayListOf()
    }

    override fun visitCreate_database(ctx: SqlServerParser.Create_databaseContext): Statement {
        val databaseName = CommonUtils.cleanQuote(ctx.database.text)
        return CreateDatabase(databaseName)
    }

    override fun visitDrop_database(ctx: SqlServerParser.Drop_databaseContext): Statement {
        val ifExists = ctx.IF() != null
        val databases = ctx.id_().map { it.text }
        val dropDatabase = DropDatabase(databases.first(), ifExists)
        dropDatabase.databaseNames.addAll(databases)
        return dropDatabase
    }

    override fun visitSelect_statement_standalone(ctx: SqlServerParser.Select_statement_standaloneContext): Statement {
        currentOptType = StatementType.SELECT
        if (ctx.with_expression() != null) {
            this.visitWith_expression(ctx.with_expression())
        }
        super.visitSelect_statement(ctx.select_statement())

        val queryStmt = QueryStmt(inputTables, limit, offset)
        queryStmt.inputTables = inputTables
        return queryStmt
    }

    override fun visitDelete_statement(ctx: SqlServerParser.Delete_statementContext): Statement {
        currentOptType = StatementType.DELETE
        val tableId = parseTableName(ctx.delete_statement_from().ddl_object().full_table_name())
        if (ctx.with_expression() != null) {
            this.visitWith_expression(ctx.with_expression())
        }
        if (ctx.search_condition() != null) {
            super.visitSearch_condition(ctx.search_condition())
        }

        return DeleteTable(tableId, inputTables)
    }

    override fun visitInsert_statement(ctx: SqlServerParser.Insert_statementContext): Statement {
        currentOptType = StatementType.INSERT
        val tableId = parseTableName(ctx.ddl_object().full_table_name())
        if (ctx.with_expression() != null) {
            this.visitWith_expression(ctx.with_expression())
        }

        this.visitInsert_statement_value(ctx.insert_statement_value())

        val queryStmt = QueryStmt(inputTables)
        val insertTable =
            if (ctx.INTO() != null) InsertTable(InsertMode.INTO, queryStmt, tableId)
            else InsertTable(InsertMode.OVERWRITE, queryStmt, tableId)

        return insertTable
    }

    override fun visitUpdate_statement(ctx: SqlServerParser.Update_statementContext): Statement {
        currentOptType = StatementType.UPDATE
        val tableId = parseTableName(ctx.ddl_object().full_table_name())
        if (ctx.with_expression() != null) {
            this.visitWith_expression(ctx.with_expression())
        }

        if (ctx.table_sources() != null) {
            super.visitTable_sources(ctx.table_sources())
        }

        if (ctx.search_condition() != null) {
            super.visitSearch_condition(ctx.search_condition())
        }

        return UpdateTable(tableId, inputTables)
    }

    override fun visitMerge_statement(ctx: SqlServerParser.Merge_statementContext): Statement {
        currentOptType = StatementType.MERGE

        val tableId = parseTableName(ctx.ddl_object().full_table_name())
        val mergeTable = MergeTable(tableId)
        if (ctx.with_expression() != null) {
            this.visitWith_expression(ctx.with_expression())
        }

        if (ctx.table_sources() != null) {
            super.visitTable_sources(ctx.table_sources())
        }

        mergeTable.inputTables = inputTables
        return mergeTable
    }

    override fun visitWith_expression(ctx: SqlServerParser.With_expressionContext): Statement? {
        ctx.common_table_expression().forEach { cteTempTables.add(TableId(it.id_().text)) }
        return super.visitWith_expression(ctx)
    }

    override fun visitSelect_order_by_clause(ctx: SqlServerParser.Select_order_by_clauseContext): Statement? {
        if (ctx.OFFSET() != null) {
            offset = ctx.offset_exp.text.toInt()
        }

        if (ctx.OFFSET() != null) {
            limit = ctx.fetch_exp.text.toInt()
        }

        return super.visitSelect_order_by_clause(ctx)
    }

    override fun visitTable_source_item(ctx: SqlServerParser.Table_source_itemContext): Statement? {
        if (
            currentOptType == StatementType.SELECT ||
                currentOptType == StatementType.CREATE_VIEW ||
                currentOptType == StatementType.CREATE_MATERIALIZED_VIEW ||
                currentOptType == StatementType.UPDATE ||
                currentOptType == StatementType.DELETE ||
                currentOptType == StatementType.MERGE ||
                currentOptType == StatementType.INSERT ||
                currentOptType == StatementType.CREATE_FUNCTION
        ) {

            if (ctx.full_table_name() != null) {
                val tableId = parseTableName(ctx.full_table_name())

                if (!inputTables.contains(tableId) && !cteTempTables.contains(tableId)) {
                    inputTables.add(tableId)
                }
            } else {
                super.visitTable_source_item(ctx)
            }
        }
        return null
    }

    override fun visitUse_statement(ctx: SqlServerParser.Use_statementContext): Statement {
        return UseDatabase(ctx.database.text)
    }

    fun parseTableName(ctx: SqlServerParser.Full_table_nameContext): TableId {
        if (ctx.database != null) {
            return TableId(ctx.database.text, ctx.schema.text, ctx.table.text)
        } else if (ctx.schema != null) {
            return TableId(null, ctx.schema.text, ctx.table.text)
        } else {
            return TableId(null, null, ctx.table.text)
        }
    }
}
