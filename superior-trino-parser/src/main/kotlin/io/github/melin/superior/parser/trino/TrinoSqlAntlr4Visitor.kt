package io.github.melin.superior.parser.trino

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.DefaultStatement
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.common.ShowStatement
import io.github.melin.superior.common.relational.create.CreateTableAsSelect
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.parser.trino.antlr4.TrinoSqlBaseBaseVisitor
import io.github.melin.superior.parser.trino.antlr4.TrinoSqlBaseParser
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils

/** Created by libinsong on 2018/1/10. */
class TrinoSqlAntlr4Visitor(
    val splitSql: Boolean = false,
    val command: String?
) : TrinoSqlBaseBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN

    private var limit: Int? = null
    private var offset: Int? = null
    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()
    private var functionNames: HashSet<FunctionId> = hashSetOf()

    private var statements: ArrayList<Statement> = arrayListOf()
    private val sqls: ArrayList<String> = arrayListOf()

    fun getSqlStatements(): List<Statement> {
        return statements
    }

    fun getSplitSqls(): List<String> {
        return sqls
    }

    override fun shouldVisitNextChild(
        node: RuleNode,
        currentResult: Statement?
    ): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitSqlStatements(
        ctx: TrinoSqlBaseParser.SqlStatementsContext
    ): Statement? {
        ctx.singleStatement().forEach {
            val sql = CommonUtils.subsql(command, it)
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
                        var statement = this.visitSingleStatement(it)
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
        cteTempTables = arrayListOf()
    }

    override fun visitStatementDefault(
        ctx: TrinoSqlBaseParser.StatementDefaultContext
    ): Statement? {
        if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitRootQuery(ctx.rootQuery())

            val limit =
                ctx.rootQuery()?.query()?.queryNoWith()?.limit?.text?.toInt()
            return QueryStmt(inputTables, limit)
        } else {
            return null
        }
    }

    private fun parseRootQuery(
        ctx: TrinoSqlBaseParser.RootQueryContext
    ): QueryStmt {
        currentOptType = StatementType.SELECT
        this.visitRootQuery(ctx)

        val queryStmt = QueryStmt(inputTables, limit, offset)
        queryStmt.functionNames.addAll(functionNames)
        val querySql = CommonUtils.subsql(command, ctx)
        queryStmt.setSql(querySql)
        return queryStmt
    }

    override fun visitCreateTableAsSelect(
        ctx: TrinoSqlBaseParser.CreateTableAsSelectContext
    ): Statement? {
        currentOptType = StatementType.CREATE_TABLE_AS_SELECT
        val tableId = parseTableName(ctx.qualifiedName())
        val queryStmt = parseRootQuery(ctx.rootQuery())
        val createTable = CreateTableAsSelect(tableId, queryStmt)
        createTable.lifeCycle = 7
        return createTable
    }

    override fun visitDropTable(
        ctx: TrinoSqlBaseParser.DropTableContext
    ): Statement? {
        val tableId = parseTableName(ctx.qualifiedName())

        val dropTable = DropTable(tableId)
        dropTable.ifExists = ctx.EXISTS() != null
        return dropTable
    }

    override fun visitInsertInto(
        ctx: TrinoSqlBaseParser.InsertIntoContext
    ): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val queryStmt = parseRootQuery(ctx.rootQuery())
        val stmt = InsertTable(InsertMode.INTO, queryStmt, tableId)
        return stmt
    }

    override fun visitDelete(ctx: TrinoSqlBaseParser.DeleteContext): Statement {
        currentOptType = StatementType.DELETE
        val tableId = parseTableName(ctx.qualifiedName())
        if (ctx.whereClause() != null) {
            super.visitWhereClause(ctx.whereClause())
        }

        return DeleteTable(tableId, inputTables)
    }

    override fun visitUpdate(ctx: TrinoSqlBaseParser.UpdateContext): Statement {
        currentOptType = StatementType.UPDATE
        val tableId = parseTableName(ctx.qualifiedName())
        if (ctx.whereClause() != null) {
            super.visitWhereClause(ctx.whereClause())
        }

        return UpdateTable(tableId, inputTables)
    }

    override fun visitMerge(ctx: TrinoSqlBaseParser.MergeContext): Statement {
        currentOptType = StatementType.MERGE

        val targetTable = parseTableName(ctx.qualifiedName())
        val mergeTable = MergeTable(targetTable = targetTable)

        // @TODO
        mergeTable.inputTables = inputTables
        return mergeTable
    }

    override fun visitExplain(
        ctx: TrinoSqlBaseParser.ExplainContext
    ): Statement? {
        return DefaultStatement(StatementType.EXPLAIN)
    }

    override fun visitQualifiedName(
        ctx: TrinoSqlBaseParser.QualifiedNameContext
    ): Statement? {
        if (!(ctx.parent is TrinoSqlBaseParser.TableNameContext)) {
            return null
        }

        if (
            currentOptType == StatementType.SELECT ||
                currentOptType == StatementType.INSERT ||
                currentOptType == StatementType.UPDATE ||
                currentOptType == StatementType.DELETE ||
                currentOptType == StatementType.MERGE ||
                currentOptType == StatementType.CREATE_TABLE_AS_SELECT
        ) {

            val tableName = parseTableName(ctx)
            inputTables.add(tableName)
        }
        return null
    }

    private fun parseTableName(
        ctx: TrinoSqlBaseParser.QualifiedNameContext
    ): TableId {
        val list = ctx.identifier()

        var catalogName: String? = null
        var databaseName: String? = null
        val tableName =
            if (list.size == 1) {
                ctx.text
            } else if (list.size == 2) {
                val index = StringUtils.lastIndexOf(ctx.text, ".")
                databaseName = StringUtils.substring(ctx.text, 0, index)

                StringUtils.substring(ctx.text, index + 1)
            } else {
                val items = StringUtils.split(ctx.text, ".")
                catalogName = items[0]
                databaseName = items[1]
                items[2]
            }

        return TableId(catalogName, databaseName, tableName)
    }
}
