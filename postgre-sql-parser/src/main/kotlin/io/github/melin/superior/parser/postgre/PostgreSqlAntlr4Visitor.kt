package io.github.melin.superior.parser.postgre

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.AlterTable
import io.github.melin.superior.common.relational.AlterTableAction
import io.github.melin.superior.common.relational.StatementData
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.common.CommentData
import io.github.melin.superior.common.relational.create.*
import io.github.melin.superior.common.relational.dml.DeleteTable
import io.github.melin.superior.common.relational.dml.MergeTable
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.dml.UpdateTable
import io.github.melin.superior.common.relational.drop.DropIndex
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.common.relational.drop.DropView
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParserBaseVisitor
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParser
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParser.ColconstraintelemContext
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode

/**
 * Created by libinsong on 2020/6/30 9:57 上午
 */
class PostgreSqlAntlr4Visitor: PostgreSqlParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN

    private var limit: Int? = null
    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()

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

    override fun visitCreatestmt(ctx: PostgreSqlParser.CreatestmtContext): StatementData {
        currentOptType = StatementType.CREATE_TABLE

        if (ctx.PARTITION() != null) {
            val partitionTableId = parseTableName(ctx.qualified_name(0))
            val action = AlterTableAction(partitionTableId)

            val tableId = parseTableName(ctx.qualified_name(1))
            val alterTable = AlterTable(AlterType.ADD_PARTITION, tableId, action)
            return StatementData(StatementType.ALTER_TABLE, alterTable)
        }

        val tableId = parseTableName(ctx.qualified_name(0))
        val columns = ctx.opttableelementlist()?.tableelementlist()?.tableelement()?.map {
            val colDef = it.columnDef()
            val colName = colDef.colid().text
            val dataType = colDef.typename().text
            val columnRel = ColumnRel(colName, dataType)

            colDef.colquallist().colconstraint().forEach {colconstraint ->
                val child = colconstraint.getChild(0)
                if (child is ColconstraintelemContext) {
                    if (child.NOT() != null) {
                        columnRel.nullable = false
                    } else if (child.PRIMARY() != null) {
                        columnRel.isPk = true
                    }
                }
            }
            columnRel
        }

        val createTable = CreateTable(tableId, columnRels = columns)
        if (ctx.opttemp().TEMP() != null || ctx.opttemp().TEMPORARY() != null) {
            createTable.temporary = true
        }

        val partitionspec = ctx.optpartitionspec()?.partitionspec()
        if (partitionspec != null) {
            val partitionType = partitionspec.colid().text.uppercase()
            val partitionColumns = partitionspec.part_params().part_elem().map { it.text }

            createTable.partitionColumnNames = partitionColumns
            createTable.partitionType = partitionType
        }

        return StatementData(currentOptType, createTable)
    }

    override fun visitViewstmt(ctx: PostgreSqlParser.ViewstmtContext): StatementData {
        currentOptType = StatementType.CREATE_VIEW
        val tableId = parseTableName(ctx.qualified_name())
        val replace = if (ctx.REPLACE() != null) true else false
        val createView = CreateView(tableId)
        createView.replace = replace

        if (ctx.opttemp().TEMP() != null || ctx.opttemp().TEMPORARY() != null) {
            createView.temporary = true
        }

        super.visitSelectstmt(ctx.selectstmt())
        createView.inputTables = inputTables
        return StatementData(currentOptType, createView)
    }

    override fun visitCreatematviewstmt(ctx: PostgreSqlParser.CreatematviewstmtContext): StatementData {
        currentOptType = StatementType.CREATE_MATERIALIZED_VIEW
        val tableId = parseTableName(ctx.create_mv_target().qualified_name())
        val ifNotExists = if (ctx.IF_P() != null) true else false
        val createView = CreateMaterializedView(tableId)
        createView.ifNotExists = ifNotExists

        super.visitSelectstmt(ctx.selectstmt())
        createView.inputTables = inputTables
        return StatementData(currentOptType, createView)
    }

    override fun visitSelectstmt(ctx: PostgreSqlParser.SelectstmtContext): StatementData {
        currentOptType = StatementType.SELECT
        super.visitSelectstmt(ctx)

        val queryStmt = QueryStmt(inputTables, limit)
        return StatementData(StatementType.SELECT, queryStmt)
    }

    override fun visitCreateasstmt(ctx: PostgreSqlParser.CreateasstmtContext): StatementData {
        currentOptType = StatementType.CREATE_TABLE_AS_SELECT
        val tableId = parseTableName(ctx.create_as_target().qualified_name())
        val createTable = CreateTableAsSelect(tableId)
        super.visitSelectstmt(ctx.selectstmt())

        createTable.inputTables = inputTables
        return StatementData(currentOptType, createTable)
    }

    override fun visitUpdatestmt(ctx: PostgreSqlParser.UpdatestmtContext): StatementData {
        currentOptType = StatementType.UPDATE
        val tableId = parseTableName(ctx.relation_expr_opt_alias().relation_expr())
        super.visitWhere_or_current_clause(ctx.where_or_current_clause())
        super.visitFrom_clause(ctx.from_clause())

        val update = UpdateTable(tableId, inputTables)
        return StatementData(currentOptType, update)
    }

    override fun visitDeletestmt(ctx: PostgreSqlParser.DeletestmtContext): StatementData {
        currentOptType = StatementType.DELETE
        val tableId = parseTableName(ctx.relation_expr_opt_alias().relation_expr())
        super.visitWhere_or_current_clause(ctx.where_or_current_clause())
        super.visitUsing_clause(ctx.using_clause())

        val update = DeleteTable(tableId, inputTables)
        return StatementData(currentOptType, update)
    }

    override fun visitMergestmt(ctx: PostgreSqlParser.MergestmtContext): StatementData {
        currentOptType = StatementType.MERGE

        val mergeTableId = parseTableName(ctx.qualified_name(0))
        val mergeTable = MergeTable(mergeTableId)

        if (ctx.qualified_name().size == 2) {
            val tableId = parseTableName(ctx.qualified_name(1))
            inputTables.add(tableId)
        } else if (ctx.select_with_parens() != null) {
            super.visitSelect_with_parens(ctx.select_with_parens())
        }
        mergeTable.inputTables = inputTables
        return StatementData(StatementType.MERGE, mergeTable)
    }

    override fun visitCte_list(ctx: PostgreSqlParser.Cte_listContext): StatementData {
        ctx.common_table_expr().forEach {
            cteTempTables.add(TableId(it.name().text))
        }
        return super.visitCte_list(ctx)
    }

    override fun visitQualified_name(ctx: PostgreSqlParser.Qualified_nameContext): StatementData? {
        if (currentOptType == StatementType.SELECT ||
            currentOptType == StatementType.CREATE_VIEW ||
            currentOptType == StatementType.CREATE_MATERIALIZED_VIEW ||
            currentOptType == StatementType.CREATE_TABLE_AS_SELECT ||
            currentOptType == StatementType.UPDATE ||
            currentOptType == StatementType.DELETE ||
            currentOptType == StatementType.MERGE) {

            val tableId = parseTableName(ctx)

            if (!inputTables.contains(tableId) && !cteTempTables.contains(tableId)) {
                inputTables.add(tableId)
            }
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
            val ifExists = ctx.IF_P() != null
            if (ctx.object_type_any_name().INDEX() != null) {
                val actions = ctx.any_name_list().any_name().map { indexName ->  DropIndex(indexName.text, ifExists)}
                val tableId = TableId("")
                val alterTable = AlterTable(AlterType.DROP_INDEX, tableId)
                alterTable.ifExists = ifExists
                alterTable.addActions(actions)
                return StatementData(StatementType.ALTER_TABLE, alterTable)
            } else if (ctx.object_type_any_name().TABLE() != null) {
                val dropTable = DropTable(ifExists = ifExists)
                ctx.any_name_list().any_name().map { tableName ->
                    dropTable.tableIds.add(parseTableName(tableName))
                }
                return StatementData(StatementType.DROP_TABLE, dropTable)
            } else if (ctx.object_type_any_name().VIEW() != null) {
                val isMaterialized = if (ctx.object_type_any_name().MATERIALIZED() != null) {
                    true
                } else {
                    false
                }
                val dropTable = DropView(ifExists = ifExists, isMaterialized = isMaterialized)
                ctx.any_name_list().any_name().map { tableName ->
                    dropTable.tableIds.add(parseTableName(tableName))
                }
                return StatementData(StatementType.DROP_TABLE, dropTable)
            } else if (ctx.object_type_any_name().SEQUENCE() != null) {
                val dropTable = io.github.melin.superior.common.relational.drop.DropSequence(ifExists = ifExists)
                ctx.any_name_list().any_name().map { tableName ->
                    dropTable.tableIds.add(parseTableName(tableName))
                }
                return StatementData(StatementType.DROP_TABLE, dropTable)
            }
        }

        throw SQLParserException("not support")
    }

    override fun visitAltertablestmt(ctx: PostgreSqlParser.AltertablestmtContext): StatementData {
        if (ctx.TABLE() != null) {
            if (ctx.relation_expr() != null) {
                val tableId = parseTableName(ctx.relation_expr())
                val alterTable = if (ctx.partition_cmd().ATTACH() != null) {
                    AlterTable(AlterType.ATTACH_PARTITION, tableId)
                } else {
                    AlterTable(AlterType.DETACH_PARTITION, tableId)
                }

                alterTable.ifExists = ctx.IF_P() != null
                return StatementData(StatementType.ALTER_TABLE, alterTable)
            }
        }

        return StatementData(StatementType.ALTER_TABLE, AlterTable(AlterType.UNKOWN))
    }

    override fun visitCommentstmt(ctx: PostgreSqlParser.CommentstmtContext): StatementData {
        val objType: String? = if (ctx.object_type_any_name() != null) {
            ctx.object_type_any_name().children.map { it.text }.joinToString(" ")
        } else if (ctx.object_type_name() != null) {
            ctx.object_type_name().children.map { it.text }.joinToString(" ")
        } else if (ctx.object_type_name_on_any_name() != null) {
            ctx.object_type_name_on_any_name().children.map { it.text }.joinToString(" ")
        } else if (ctx.COLUMN() != null) {
            ctx.COLUMN().text
        } else if (ctx.FUNCTION() != null) {
            ctx.FUNCTION().text
        } else {
            null
        }

        val objValue = if (ctx.any_name() != null) ctx.any_name().text else null

        val isNull = if (ctx.comment_text().NULL_P() != null) true else false
        val text: String? = if (ctx.comment_text().text != null) StringUtil.cleanQuote(ctx.comment_text().sconst().text) else null
        val comment = CommentData(text, isNull, objType, objValue)
        return StatementData(StatementType.COMMENT, comment)
    }

    //----------------------------------------private methods------------------------------------


    fun parseTableName(ctx: PostgreSqlParser.Any_nameContext): TableId {
        val attrNames = ctx.attrs()?.attr_name()
        if (attrNames == null) {
            return TableId(null, null, ctx.colid().text)
        }

        if (attrNames.size == 2) {
            return TableId(ctx.colid().text, attrNames.get(0).text, attrNames.get(1).text)
        } else if (attrNames.size == 1) {
            return TableId(null, ctx.colid().text, attrNames.get(0).text)
        }

        throw SQLParserException("parse schema qualified name error")
    }

    fun parseTableName(ctx: PostgreSqlParser.Relation_exprContext): TableId {
        return parseTableName(ctx.qualified_name())
    }

    fun parseTableName(ctx: PostgreSqlParser.Qualified_nameContext): TableId {
        if (ctx.childCount == 2) {
            val obj = ctx.getChild(1);
            if (obj.childCount == 2) {
                return TableId(ctx.getChild(0).text, obj.getChild(0).getChild(1).text, obj.getChild(1).getChild(1).text)
            } else if (obj.childCount == 1) {
                return TableId(ctx.getChild(0).text, obj.getChild(1).text)
            }
        } else if (ctx.childCount == 1) {
            return TableId(ctx.getChild(0).text)
        }

        throw SQLParserException("parse schema qualified name error")
    }
}
