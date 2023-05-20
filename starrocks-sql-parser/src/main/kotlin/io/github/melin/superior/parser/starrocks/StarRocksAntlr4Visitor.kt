package io.github.melin.superior.parser.starrocks

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.AlterTable
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.create.CreateDatabase
import io.github.melin.superior.common.relational.create.CreateMaterializedView
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.common.relational.create.CreateTable
import io.github.melin.superior.common.relational.create.CreateView
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.drop.DropMaterializedView
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.common.relational.drop.DropView
import io.github.melin.superior.parser.starrocks.antlr4.StarRocksParserBaseVisitor
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode

import io.github.melin.superior.parser.starrocks.antlr4.StarRocksParser.*
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/6/30 9:59 上午
 */
class StarRocksAntlr4Visitor: StarRocksParserBaseVisitor<Statement>() {

    private var command: String? = null

    private var currentOptType: StatementType = StatementType.UNKOWN

    private var queryStmts: ArrayList<QueryStmt> = arrayListOf()
    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var outputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()

    fun setCommand(command: String) {
        this.command = command
    }

    override fun visit(tree: ParseTree): Statement {
        return super.visit(tree)
    }

    override fun shouldVisitNextChild(node: RuleNode, currentResult: Statement?): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitCreateDbStatement(ctx: CreateDbStatementContext): Statement {
        val catalogName: String? = if (ctx.catalog != null) StringUtil.cleanQuote(ctx.catalog.text) else null
        val databaseName: String = StringUtil.cleanQuote(ctx.database.text)
        val properties = parseOptions(ctx.properties())

        return CreateDatabase(catalogName, databaseName, properties)
    }

    override fun visitCreateTableStatement(ctx: CreateTableStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val comment = if (ctx.comment() != null) StringUtil.cleanQuote(ctx.comment().text) else null
        val columnRels: List<ColumnRel> = ctx.columnDesc().map { column ->
            val columnName = column.identifier().text
            val dataType = column.type().text
            val colComment = if (column.comment() != null) StringUtil.cleanQuote(column.comment().string().text) else null
            ColumnRel(columnName, dataType, colComment)
        }

        return CreateTable(tableId, comment, columnRels)
    }

    override fun visitCreateViewStatement(ctx: CreateViewStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val comment: String? = if (ctx.comment() != null) StringUtil.cleanQuote(ctx.comment().string().text) else null
        val columns = parseColumnNameWithComment(ctx.columnNameWithComment());
        val ifNotExists = ctx.NOT() != null
        val querySql = StringUtils.substring(command, ctx.queryStatement().start.startIndex)
        val createView = CreateView(tableId, querySql, comment, ifNotExists, columns)

        this.visitQueryStatement(ctx.queryStatement())
        createView.inputTables.addAll(inputTables)
        return createView;
    }

    override fun visitCreateMaterializedViewStatement(ctx: CreateMaterializedViewStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val comment: String? = if (ctx.comment() != null) StringUtil.cleanQuote(ctx.comment().string().text) else null
        val columns = parseColumnNameWithComment(ctx.columnNameWithComment());
        val ifNotExists = ctx.NOT() != null
        val querySql = StringUtils.substring(command, ctx.queryStatement().start.startIndex)
        val createView = CreateMaterializedView(tableId, querySql, comment, ifNotExists, columns)

        this.visitQueryStatement(ctx.queryStatement())
        createView.inputTables.addAll(inputTables)
        return createView;
    }

    override fun visitDropTableStatement(ctx: DropTableStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val ifExists = ctx.EXISTS() != null
        val dropTable = DropTable(tableId, ifExists)
        dropTable.force = ctx.FORCE() != null
        return dropTable
    }

    override fun visitDropViewStatement(ctx: DropViewStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val ifExists = ctx.EXISTS() != null
        return DropView(tableId, ifExists)
    }

    override fun visitDropMaterializedViewStatement(ctx: DropMaterializedViewStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val ifExists = ctx.EXISTS() != null
        return DropMaterializedView(tableId, ifExists)
    }

    override fun visitAlterTableStatement(ctx: AlterTableStatementContext?): Statement {
        return AlterTable(AlterType.UNKOWN)
    }

    override fun visitAlterViewStatement(ctx: AlterViewStatementContext?): Statement {
        return AlterTable(AlterType.ALTER_VIEW)
    }

    override fun visitQueryStatement(ctx: QueryStatementContext): Statement {
        currentOptType = StatementType.SELECT
        super.visitQueryRelation(ctx.queryRelation())
        val queryStmt = QueryStmt(inputTables)

        queryStmts.add(queryStmt)
        return queryStmt
    }

    override fun visitQualifiedName(ctx: QualifiedNameContext): Statement? {
        if (currentOptType == StatementType.SELECT ||
            currentOptType == StatementType.CREATE_VIEW ||
            currentOptType == StatementType.CREATE_MATERIALIZED_VIEW ||
            currentOptType == StatementType.UPDATE ||
            currentOptType == StatementType.DELETE ||
            currentOptType == StatementType.MERGE ||
            currentOptType == StatementType.INSERT ||
            currentOptType == StatementType.CREATE_FUNCTION) {

            val tableId = parseTableName(ctx)
            if (!inputTables.contains(tableId) && !cteTempTables.contains(tableId)) {
                inputTables.add(tableId)
            }
        }
        return null
    }

    override fun visitWithClause(ctx: WithClauseContext): Statement? {
        ctx.commonTableExpression().forEach {
            cteTempTables.add(TableId(it.name.text))
        }
        return super.visitWithClause(ctx)
    }

    fun parseTableName(ctx: QualifiedNameContext): TableId {
        return if (ctx.identifier().size == 3) {
            val catalotName = ctx.identifier().get(0).text
            val schemaName = ctx.identifier().get(1).text
            val tableName = ctx.identifier().get(2).text
            TableId(catalotName, schemaName, tableName)
        } else if (ctx.identifier().size == 2) {
            val schemaName = ctx.identifier().get(0).text
            val tableName = ctx.identifier().get(1).text
            TableId(schemaName, tableName)
        } else if (ctx.identifier().size == 1) {
            val tableName = ctx.identifier().get(0).text
            TableId(tableName)
        } else {
            throw SQLParserException("parse qualifiedName error: " + ctx.identifier().size)
        }
    }

    private fun parseOptions(ctx: PropertiesContext?): Map<String, String> {
        val properties = HashMap<String, String>()
        if (ctx != null) {
            ctx.property().forEach { item ->
                val property = item as PropertyContext
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        return properties
    }

    private fun parseColumnNameWithComment(columns: List<ColumnNameWithCommentContext>): List<ColumnRel> {
        return columns.map { col ->
            val name = col.columnName.text
            val comment = StringUtil.cleanQuote(col.comment().string().text)
            ColumnRel(name, null, comment)
        }
    }
}
