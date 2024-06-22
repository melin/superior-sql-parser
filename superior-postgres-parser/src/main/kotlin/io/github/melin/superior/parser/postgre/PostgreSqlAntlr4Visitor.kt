package io.github.melin.superior.parser.postgre

import com.github.melin.superior.sql.parser.util.CommonUtils
import com.google.common.collect.Lists
import io.github.melin.superior.common.*
import io.github.melin.superior.common.AlterActionType.*
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.alter.*
import io.github.melin.superior.common.relational.common.CommentStatement
import io.github.melin.superior.common.relational.common.RefreshMaterializedView
import io.github.melin.superior.common.relational.common.ShowStatement
import io.github.melin.superior.common.relational.create.*
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.common.relational.drop.DropDatabase
import io.github.melin.superior.common.relational.drop.DropMaterializedView
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.common.relational.drop.DropView
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.common.relational.table.TruncateTable
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParser
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParser.ColconstraintelemContext
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParser.Indirection_elContext
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParser.OpttempTableNameContext
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParser.PlsqlrootContext
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParserBaseVisitor
import io.github.melin.superior.parser.postgre.relational.CreatePartitionTable
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils

/** Created by libinsong on 2020/6/30 9:57 上午 */
class PostgreSqlAntlr4Visitor(
    val splitSql: Boolean = false,
    val command: String?
) : PostgreSqlParserBaseVisitor<Statement>() {

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

    override fun shouldVisitNextChild(
        node: RuleNode,
        currentResult: Statement?
    ): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitStmtmulti(
        ctx: PostgreSqlParser.StmtmultiContext
    ): Statement? {
        ctx.stmt().forEach {
            var sql = CommonUtils.subsql(command, it)
            sql = CommonUtils.cleanLastSemi(sql)
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
                        var statement = this.visitStmt(it)
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

    private fun addOutputTableId(tableId: TableId) {
        if (!outputTables.contains(tableId)) {
            outputTables.add(tableId)
        }
    }

    // -----------------------------------database-------------------------------------------------

    override fun visitCreatedbstmt(
        ctx: PostgreSqlParser.CreatedbstmtContext
    ): Statement {
        val databaseName = CommonUtils.cleanQuote(ctx.name().text)
        return CreateDatabase(databaseName)
    }

    override fun visitDropdbstmt(
        ctx: PostgreSqlParser.DropdbstmtContext
    ): Statement {
        val databaseName = CommonUtils.cleanQuote(ctx.name().text)
        return DropDatabase(databaseName)
    }

    // -----------------------------------schema-------------------------------------------------

    override fun visitCreateschemastmt(
        ctx: PostgreSqlParser.CreateschemastmtContext
    ): Statement {
        val schemaName = CommonUtils.cleanQuote(ctx.colid().text)
        return CreateSchema(schemaName)
    }

    // -----------------------------------table-------------------------------------------------

    override fun visitCreatestmt(
        ctx: PostgreSqlParser.CreatestmtContext
    ): Statement {
        currentOptType = StatementType.CREATE_TABLE

        if (ctx.PARTITION() != null) {
            val partitionTableId = parseTableName(ctx.qualified_name(0))
            val tableId = parseTableName(ctx.qualified_name(1))
            return CreatePartitionTable(tableId, partitionTableId)
        }

        val tableId = parseTableName(ctx.qualified_name(0))
        val columns =
            ctx.opttableelementlist()?.tableelementlist()?.tableelement()?.map {
                val colDef = it.columnDef()
                val colName = colDef.colid().text
                val dataType = colDef.typename().text
                val columnRel = ColumnRel(colName, dataType)

                colDef.colquallist().colconstraint().forEach { colconstraint ->
                    val child = colconstraint.getChild(0)
                    if (child is ColconstraintelemContext) {
                        if (child.NOT() != null) {
                            columnRel.nullable = false
                        } else if (child.PRIMARY() != null) {
                            columnRel.primaryKey = true
                        }
                    }
                }
                columnRel
            }

        val createTable =
            CreateTable(tableId, TableType.POSTGRES, columnRels = columns)
        if (ctx.opttemp().TEMP() != null || ctx.opttemp().TEMPORARY() != null) {
            createTable.temporary = true
        }

        val partitionspec = ctx.optpartitionspec()?.partitionspec()
        val tablePartition = ctx.gaussextension()?.tablePartition()
        if (partitionspec != null) {
            val partitionType = partitionspec.colid().text.uppercase()
            val partitionColumns =
                partitionspec.part_params().part_elem().map { it.text }

            createTable.partitionColumnNames.addAll(partitionColumns)
            if ("RANGE" == partitionType) {
                createTable.partitionType = PartitionType.RANGE
            } else {
                createTable.partitionType = PartitionType.LIST
            }
        } else if (tablePartition != null) {
            var partitionType: PartitionType? = null
            val partitionColumns = mutableListOf<String>()

            val ptSpec = tablePartition.partition_list()
            if (ptSpec.list_partition_stmt() != null) {
                partitionType = PartitionType.LIST
                partitionColumns.add(
                    ptSpec.list_partition_stmt().partition_key().colid().text
                )
            } else if (ptSpec.value_partition_stmt() != null) {
                partitionType = PartitionType.VALUES
                partitionColumns.add(
                    ptSpec.value_partition_stmt().partition_key().colid().text
                )
            } else if (ptSpec.range_partition_stmt() != null) {
                partitionType = PartitionType.RANGE
                partitionColumns.add(
                    ptSpec.range_partition_stmt().partition_key().colid().text
                )
            } else if (ptSpec.normal_partition_stmt() != null) {
                partitionType = PartitionType.NORMAL
            }

            createTable.partitionColumnNames.addAll(partitionColumns)
            createTable.partitionType = partitionType
        }

        return createTable
    }

    override fun visitCreatefunctionstmt(
        ctx: PostgreSqlParser.CreatefunctionstmtContext
    ): Statement {
        currentOptType =
            if (ctx.FUNCTION() != null) StatementType.CREATE_FUNCTION
            else StatementType.CREATE_PROCEDURE

        val optItems = ctx.createfunc_opt_list().createfunc_opt_item()
        if (optItems != null) {
            optItems
                .filter {
                    it.func_as() != null && it.func_as().Definition != null
                }
                .forEach {
                    visitPlsqlroot(it.func_as().Definition as PlsqlrootContext)
                }
        }

        val replace =
            if (ctx.opt_or_replace().REPLACE() != null) true else false
        val funcName = ctx.func_name()

        if (ctx.FUNCTION() != null) {
            val functionId =
                if (funcName.type_function_name() != null) {
                    FunctionId(funcName.text)
                } else {
                    FunctionId(
                        funcName.colid().text,
                        funcName
                            .indirection()
                            .indirection_el()[0]
                            .attr_name()
                            .text
                    )
                }

            val createFunction = CreateFunction(functionId, replace)
            createFunction.inputTables = inputTables
            return createFunction
        } else {
            val procedureId =
                if (funcName.type_function_name() != null) {
                    ProcedureId(funcName.text)
                } else {
                    ProcedureId(
                        funcName.colid().text,
                        funcName
                            .indirection()
                            .indirection_el()[0]
                            .attr_name()
                            .text
                    )
                }

            val createProcedure = CreateProcedure(procedureId, replace)
            createProcedure.inputTables = inputTables
            createProcedure.outputTables = outputTables
            return createProcedure
        }
    }

    override fun visitProc_stmt(
        ctx: PostgreSqlParser.Proc_stmtContext
    ): Statement? {
        super.visitProc_stmt(ctx)
        return null
    }

    override fun visitViewstmt(
        ctx: PostgreSqlParser.ViewstmtContext
    ): Statement {
        currentOptType = StatementType.CREATE_VIEW
        val tableId = parseTableName(ctx.qualified_name())
        val replace = if (ctx.REPLACE() != null) true else false
        val queryStmt = this.visitSelectstmt(ctx.selectstmt()) as QueryStmt
        val createView = CreateView(tableId, queryStmt)
        createView.replace = replace

        if (ctx.opttemp().TEMP() != null || ctx.opttemp().TEMPORARY() != null) {
            createView.temporary = true
        }
        return createView
    }

    override fun visitCreatematviewstmt(
        ctx: PostgreSqlParser.CreatematviewstmtContext
    ): Statement {
        currentOptType = StatementType.CREATE_MATERIALIZED_VIEW
        val tableId = parseTableName(ctx.create_mv_target().qualified_name())
        val ifNotExists = if (ctx.IF_P() != null) true else false
        val queryStmt = this.visitSelectstmt(ctx.selectstmt()) as QueryStmt
        val createView = CreateMaterializedView(tableId, queryStmt)
        createView.ifNotExists = ifNotExists
        return createView
    }

    override fun visitRefreshmatviewstmt(
        ctx: PostgreSqlParser.RefreshmatviewstmtContext
    ): Statement {
        val tableId = parseTableName(ctx.qualified_name())
        return RefreshMaterializedView(tableId)
    }

    override fun visitRenamestmt(
        ctx: PostgreSqlParser.RenamestmtContext
    ): Statement? {
        if (ctx.TABLE() != null) {
            val tableId = parseTableName(ctx.qualified_name())
            val newTable = ctx.name().get(0).text
            val ifexists = ctx.EXISTS() != null
            val action = RenameAction(TableId(newTable), ifexists)
            return AlterTable(tableId, action)
        } else if (ctx.VIEW() != null) {
            if (ctx.MATERIALIZED() == null) {
                val tableId = parseTableName(ctx.qualified_name())
                val newTable = ctx.name().get(0).text
                val ifexists = ctx.EXISTS() != null
                val action = RenameAction(TableId(newTable), ifexists)
                return AlterView(tableId, action)
            } else {
                val tableId = parseTableName(ctx.qualified_name())
                val newTable = ctx.name().get(0).text
                val ifexists = ctx.EXISTS() != null
                val action = RenameAction(TableId(newTable), ifexists)
                return AlterMaterializedView(tableId, action)
            }
        } else {

            return null
        }
    }

    override fun visitSelectstmt(
        ctx: PostgreSqlParser.SelectstmtContext
    ): Statement {
        currentOptType = StatementType.SELECT
        super.visitSelectstmt(ctx)

        return QueryStmt(inputTables, limit, offset)
    }

    override fun visitCreateasstmt(
        ctx: PostgreSqlParser.CreateasstmtContext
    ): Statement {
        currentOptType = StatementType.CREATE_TABLE_AS_SELECT
        val tableId = parseTableName(ctx.create_as_target().qualified_name())
        val queryStmt = this.visitSelectstmt(ctx.selectstmt()) as QueryStmt
        val createTable = CreateTableAsSelect(tableId, queryStmt)
        return createTable
    }

    override fun visitUpdatestmt(
        ctx: PostgreSqlParser.UpdatestmtContext
    ): Statement {
        currentOptType = StatementType.UPDATE
        val tableId =
            parseTableName(ctx.relation_expr_opt_alias().relation_expr())
        addOutputTableId(tableId)

        super.visitWhere_or_current_clause(ctx.where_or_current_clause())
        super.visitFrom_clause(ctx.from_clause())

        return UpdateTable(tableId, inputTables)
    }

    override fun visitDeletestmt(
        ctx: PostgreSqlParser.DeletestmtContext
    ): Statement {
        currentOptType = StatementType.DELETE
        val tableId =
            parseTableName(ctx.relation_expr_opt_alias().relation_expr())
        addOutputTableId(tableId)

        super.visitWhere_or_current_clause(ctx.where_or_current_clause())
        super.visitUsing_clause(ctx.using_clause())

        return DeleteTable(tableId, inputTables)
    }

    override fun visitInsertstmt(
        ctx: PostgreSqlParser.InsertstmtContext
    ): Statement {
        currentOptType = StatementType.INSERT
        if (ctx.opt_with_clause() != null) {
            this.visitOpt_with_clause(ctx.opt_with_clause())
        }

        val tableId = parseTableName(ctx.insert_target().qualified_name())
        addOutputTableId(tableId)

        val queryStmt =
            this.visitSelectstmt(ctx.insert_rest().selectstmt()) as QueryStmt
        val insertTable = InsertTable(InsertMode.INTO, queryStmt, tableId)
        insertTable.outputTables.addAll(
            outputTables.subList(1, outputTables.size)
        )
        return insertTable
    }

    override fun visitMergestmt(
        ctx: PostgreSqlParser.MergestmtContext
    ): Statement {
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
        return mergeTable
    }

    override fun visitCte_list(
        ctx: PostgreSqlParser.Cte_listContext
    ): Statement {
        ctx.common_table_expr().forEach {
            cteTempTables.add(TableId(it.name().text))
        }
        return super.visitCte_list(ctx)
    }

    override fun visitQualified_name(
        ctx: PostgreSqlParser.Qualified_nameContext
    ): Statement? {
        if (
            currentOptType == StatementType.SELECT ||
                currentOptType == StatementType.CREATE_VIEW ||
                currentOptType == StatementType.CREATE_MATERIALIZED_VIEW ||
                currentOptType == StatementType.CREATE_TABLE_AS_SELECT ||
                currentOptType == StatementType.UPDATE ||
                currentOptType == StatementType.DELETE ||
                currentOptType == StatementType.MERGE ||
                currentOptType == StatementType.INSERT ||
                currentOptType == StatementType.CREATE_FUNCTION ||
                currentOptType == StatementType.CREATE_PROCEDURE
        ) {

            if (ctx.parent is OpttempTableNameContext) {
                return null
            }

            val tableId = parseTableName(ctx)

            if (
                !inputTables.contains(tableId) &&
                    !cteTempTables.contains(tableId)
            ) {
                inputTables.add(tableId)
            }
            return null
        } else {
            throw SQLParserException("not support")
        }
    }

    // create index
    override fun visitIndexstmt(
        ctx: PostgreSqlParser.IndexstmtContext
    ): Statement {
        val tableId = parseTableName(ctx.relation_expr())
        val indexName =
            if (ctx.opt_index_name() != null) {
                ctx.opt_index_name().text
            } else {
                ctx.name().text
            }
        val createIndex = CreateIndex(indexName)
        return AlterTable(tableId, createIndex)
    }

    override fun visitDropstmt(
        ctx: PostgreSqlParser.DropstmtContext
    ): Statement {
        if (ctx.object_type_any_name() != null) {
            val ifExists = ctx.IF_P() != null
            if (ctx.object_type_any_name().INDEX() != null) {
                val actions =
                    ctx.any_name_list().any_name().map { indexName ->
                        DropIndex(indexName.text, ifExists)
                    }
                val tableId = TableId("")
                val alterTable = AlterTable(tableId)
                alterTable.ifExists = ifExists
                alterTable.addActions(actions)
                return alterTable
            } else if (ctx.object_type_any_name().TABLE() != null) {
                val tableIds =
                    ctx.any_name_list().any_name().map { tableName ->
                        parseTableName(tableName)
                    }
                val dropTable = DropTable(tableIds.first(), ifExists)
                dropTable.tableIds.addAll(tableIds)
                return dropTable
            } else if (ctx.object_type_any_name().VIEW() != null) {
                val isMaterialized =
                    if (ctx.object_type_any_name().MATERIALIZED() != null) {
                        true
                    } else {
                        false
                    }
                val tableIds =
                    ctx.any_name_list().any_name().map { tableName ->
                        parseTableName(tableName)
                    }
                if (isMaterialized) {
                    val dropView =
                        DropMaterializedView(tableIds.first(), ifExists)
                    dropView.tableIds.addAll(tableIds)
                    return dropView
                } else {
                    val dropView = DropView(tableIds.first(), ifExists)
                    dropView.tableIds.addAll(tableIds)
                    return dropView
                }
            } else if (ctx.object_type_any_name().SEQUENCE() != null) {
                val tableIds =
                    ctx.any_name_list().any_name().map { tableName ->
                        parseTableName(tableName)
                    }
                val dropSequence =
                    io.github.melin.superior.common.relational.drop
                        .DropSequence(tableIds.first(), ifExists)
                dropSequence.tableIds.addAll(tableIds)
                return dropSequence
            }
        }

        throw SQLParserException("not support")
    }

    override fun visitTruncatestmt(
        ctx: PostgreSqlParser.TruncatestmtContext
    ): Statement {
        val tableIds =
            ctx.relation_expr_list().relation_expr().map { parseTableName(it) }
        return TruncateTable(Lists.newArrayList(tableIds))
    }

    override fun visitAltertablestmt(
        ctx: PostgreSqlParser.AltertablestmtContext
    ): Statement? {
        if (ctx.TABLE() != null) {
            if (ctx.relation_expr() != null) {
                val tableId = parseTableName(ctx.relation_expr())

                if (ctx.alter_table_cmds() != null) {
                    val alterTable = AlterTable(tableId)
                    val cmds = ctx.alter_table_cmds().alter_table_cmd()
                    for (cmdContext in cmds) {
                        if (
                            cmdContext.ADD_P() != null &&
                                cmdContext.columnDef() != null
                        ) {
                            val columnDef = cmdContext.columnDef()
                            val columnName = columnDef.colid().text
                            val dataType =
                                CommonUtils.subsql(
                                    command,
                                    columnDef.typename()
                                )
                            val action =
                                AlterColumnAction(
                                    ADD_COLUMN,
                                    columnName,
                                    dataType
                                )
                            action.ifNotExists = cmdContext.EXISTS() != null

                            alterTable.actions.add(action)
                        } else if (cmdContext.alter_column_default() != null) {
                            val columnDefaultDef =
                                cmdContext.alter_column_default()
                            val columnName = cmdContext.colid().get(0).text

                            if (columnDefaultDef.DROP() != null) {
                                val action =
                                    AlterColumnAction(
                                        DROP_COLUMN_DRFAULT,
                                        columnName
                                    )
                                alterTable.actions.add(action)
                            } else {
                                val value =
                                    CommonUtils.subsql(
                                        command,
                                        columnDefaultDef.a_expr()
                                    )
                                val action =
                                    AlterColumnAction(
                                        SET_COLUMN_DEFAULT,
                                        columnName
                                    )
                                action.defaultExpression =
                                    CommonUtils.cleanQuote(value)
                                alterTable.actions.add(action)
                            }
                        }
                    }

                    return alterTable
                } else {
                    var alterTable: AlterTable? = null
                    val partitionCmd = ctx.partition_cmd()
                    if (partitionCmd.ATTACH() != null) {
                        alterTable =
                            AlterTable(
                                tableId,
                                AlterTableAction(ATTACH_PARTITION)
                            )
                    } else {
                        alterTable =
                            AlterTable(
                                tableId,
                                AlterTableAction(DETACH_PARTITION)
                            )
                    }

                    return alterTable
                }

                return null
            }
        }

        return null
    }

    override fun visitCommentstmt(
        ctx: PostgreSqlParser.CommentstmtContext
    ): Statement {
        val objType: String? =
            if (ctx.object_type_any_name() != null) {
                ctx.object_type_any_name()
                    .children
                    .map { it.text }
                    .joinToString(" ")
            } else if (ctx.object_type_name() != null) {
                ctx.object_type_name()
                    .children
                    .map { it.text }
                    .joinToString(" ")
            } else if (ctx.object_type_name_on_any_name() != null) {
                ctx.object_type_name_on_any_name()
                    .children
                    .map { it.text }
                    .joinToString(" ")
            } else if (ctx.COLUMN() != null) {
                ctx.COLUMN().text
            } else if (ctx.FUNCTION() != null) {
                ctx.FUNCTION().text
            } else {
                null
            }

        val objValue = if (ctx.any_name() != null) ctx.any_name().text else null

        val isNull = if (ctx.comment_text().NULL_P() != null) true else false
        val text: String? =
            if (ctx.comment_text().text != null)
                CommonUtils.cleanQuote(ctx.comment_text().sconst().text)
            else null
        return CommentStatement(text, isNull, objType, objValue)
    }

    // ----------------------------------------private methods------------------------------------

    override fun visitSelect_limit(
        ctx: PostgreSqlParser.Select_limitContext
    ): Statement? {
        val limitClause = ctx.limit_clause()
        val offsetClause = ctx.offset_clause()
        if (limitClause != null) {
            if (limitClause.LIMIT() != null) {
                if (limitClause.select_limit_value().a_expr() != null) {
                    limit =
                        limitClause.select_limit_value().a_expr().text.toInt()
                }

                if (limitClause.select_offset_value() != null) {
                    offset =
                        limitClause.select_offset_value().a_expr().text.toInt()
                }
            }

            if (
                limitClause.FETCH() != null &&
                    limitClause.select_fetch_first_value() != null
            ) {
                if (limitClause.select_fetch_first_value().c_expr() != null) {
                    limit =
                        limitClause
                            .select_fetch_first_value()
                            .c_expr()
                            .text
                            .toInt()
                }
            }
        }

        if (offsetClause != null) {
            if (offsetClause.select_offset_value() != null) {
                offset = offsetClause.select_offset_value().text.toInt()
            }

            if (offsetClause.select_fetch_first_value() != null) {
                if (offsetClause.select_fetch_first_value().c_expr() != null) {
                    offset =
                        offsetClause
                            .select_fetch_first_value()
                            .c_expr()
                            .text
                            .toInt()
                }
            }
        }
        return super.visitSelect_limit(ctx)
    }

    fun parseTableName(ctx: PostgreSqlParser.Any_nameContext): TableId {
        val attrNames = ctx.attrs()?.attr_name()
        if (attrNames == null) {
            return TableId(null, null, ctx.colid().text)
        }

        if (attrNames.size == 2) {
            return TableId(
                ctx.colid().text,
                attrNames.get(0).text,
                attrNames.get(1).text
            )
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
            val obj = ctx.getChild(1)
            if (obj.childCount == 2) {
                return TableId(
                    ctx.getChild(0).text,
                    obj.getChild(0).getChild(1).text,
                    obj.getChild(1).getChild(1).text
                )
            } else if (obj.childCount == 1) {
                val inEl = obj.getChild(0) as Indirection_elContext
                return TableId(ctx.colid().text, inEl.attr_name().text)
            }
        } else if (ctx.childCount == 1) {
            return TableId(ctx.getChild(0).text)
        }

        throw SQLParserException("parse schema qualified name error")
    }
}
