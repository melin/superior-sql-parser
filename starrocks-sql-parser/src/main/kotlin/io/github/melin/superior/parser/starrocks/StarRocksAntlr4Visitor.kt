package io.github.melin.superior.parser.starrocks

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.AlterTable
import io.github.melin.superior.common.relational.StatementData
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.common.relational.create.CreateTable
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.parser.starrocks.antlr4.StarRocksParserBaseVisitor
import io.github.melin.superior.parser.starrocks.antlr4.StarRocksParser
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode

/**
 * Created by libinsong on 2020/6/30 9:59 上午
 */
class StarRocksAntlr4Visitor: StarRocksParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN

    private var queryStmts: ArrayList<QueryStmt> = arrayListOf()
    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var outputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()

    override fun visit(tree: ParseTree): StatementData {
        return super.visit(tree)
    }

    override fun shouldVisitNextChild(node: RuleNode, currentResult: StatementData?): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitCreateTableStatement(ctx: StarRocksParser.CreateTableStatementContext): StatementData {
        val tableId = parseTableName(ctx.qualifiedName())
        val comment = if (ctx.comment() != null) StringUtil.cleanQuote(ctx.comment().text) else null
        val columnRels: List<ColumnRel> = ctx.columnDesc().map { column ->
            val columnName = column.identifier().text
            val dataType = column.type().text
            val colComment = if (column.comment() != null) StringUtil.cleanQuote(column.comment().string().text) else null
            ColumnRel(columnName, dataType, colComment)
        }

        val createTable = CreateTable(tableId, comment, columnRels)
        return StatementData(StatementType.CREATE_TABLE, createTable)
    }

    override fun visitDropTableStatement(ctx: StarRocksParser.DropTableStatementContext): StatementData {
        val tableId = parseTableName(ctx.qualifiedName())
        val ifExists = ctx.EXISTS() != null
        val dropTable = DropTable(tableId, ifExists)
        dropTable.force = ctx.FORCE() != null
        return StatementData(StatementType.DROP_TABLE, dropTable)
    }

    override fun visitAlterTableStatement(ctx: StarRocksParser.AlterTableStatementContext?): StatementData {
        return StatementData(StatementType.ALTER_TABLE, AlterTable(AlterType.UNKOWN))
    }

    override fun visitAlterViewStatement(ctx: StarRocksParser.AlterViewStatementContext?): StatementData {
        return StatementData(StatementType.ALTER_TABLE, AlterTable(AlterType.ALTER_VIEW))
    }

    override fun visitQueryStatement(ctx: StarRocksParser.QueryStatementContext): StatementData {
        currentOptType = StatementType.SELECT
        super.visitQueryRelation(ctx.queryRelation())
        val queryStmt = QueryStmt(inputTables)

        queryStmts.add(queryStmt)
        return StatementData(StatementType.SELECT, queryStmt)
    }

    override fun visitQualifiedName(ctx: StarRocksParser.QualifiedNameContext): StatementData? {
        if (currentOptType == StatementType.SELECT ||
            currentOptType == StatementType.CREATE_VIEW ||
            currentOptType == StatementType.CREATE_MATERIALIZED_VIEW ||
            currentOptType == StatementType.UPDATE ||
            currentOptType == StatementType.DELETE ||
            currentOptType == StatementType.MERGE ||
            currentOptType == StatementType.INSERT ||
            currentOptType == StatementType.CREATE_FUNCTION ||
            currentOptType == StatementType.CREATE_PROCEDURE) {

            val tableId = parseTableName(ctx)
            if (!inputTables.contains(tableId) && !cteTempTables.contains(tableId)) {
                inputTables.add(tableId)
            }
        }

        return null
    }

    fun parseTableName(ctx: StarRocksParser.QualifiedNameContext): TableId {
        return if (ctx.identifier().size == 3) {
            TableId(ctx.identifier().get(0).text, ctx.identifier().get(1).text, ctx.identifier().get(2).text)
        } else if (ctx.identifier().size == 2) {
            TableId(ctx.identifier().get(0).text, ctx.identifier().get(1).text)
        } else if (ctx.identifier().size == 1) {
            TableId(ctx.identifier().get(0).text)
        } else {
            throw SQLParserException("parse qualifiedName error: " + ctx.identifier().size)
        }
    }
}
