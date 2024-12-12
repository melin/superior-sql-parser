package io.github.melin.superior.parser.mysql

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.*
import io.github.melin.superior.common.AlterActionType.*
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.alter.*
import io.github.melin.superior.common.relational.common.ShowStatement
import io.github.melin.superior.common.relational.common.UseDatabase
import io.github.melin.superior.common.relational.create.*
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.common.relational.drop.DropDatabase
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.common.relational.table.TruncateTable
import io.github.melin.superior.parser.mysql.antlr4.MySqlParser
import io.github.melin.superior.parser.mysql.antlr4.MySqlParser.AlterByAddIndexContext
import io.github.melin.superior.parser.mysql.antlr4.MySqlParser.AlterByAddPrimaryKeyContext
import io.github.melin.superior.parser.mysql.antlr4.MySqlParser.AlterByDropPrimaryKeyContext
import io.github.melin.superior.parser.mysql.antlr4.MySqlParser.AlterByTruncatePartitionContext
import io.github.melin.superior.parser.mysql.antlr4.MySqlParser.PartitionFunctionHashContext
import io.github.melin.superior.parser.mysql.antlr4.MySqlParser.PartitionFunctionKeyContext
import io.github.melin.superior.parser.mysql.antlr4.MySqlParser.PartitionFunctionListContext
import io.github.melin.superior.parser.mysql.antlr4.MySqlParser.PartitionFunctionRangeContext
import io.github.melin.superior.parser.mysql.antlr4.MySqlParserBaseVisitor
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import org.apache.commons.lang3.StringUtils

/** Created by libinsong on 2018/2/8. */
class MySqlAntlr4Visitor(val splitSql: Boolean = false, val command: String?) : MySqlParserBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var limit: Int? = null
    private var offset: Int? = null
    private val primaryKeys = ArrayList<String>()

    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()

    // 多语句解析结果
    private var statements: ArrayList<Statement> = arrayListOf()
    // 存储过程和函数中包含的子语句
    private var childStatements: ArrayList<Statement> = arrayListOf()
    private val sqls: ArrayList<String> = arrayListOf()

    fun getSqlStatements(): List<Statement> {
        return statements
    }

    fun getSplitSqls(): List<String> {
        return sqls
    }

    override fun visitSqlStatements(ctx: MySqlParser.SqlStatementsContext): Statement? {
        ctx.sqlStatement().forEach {
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
                        var statement = this.visitSqlStatement(it)
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

    override fun visitSqlStatement(ctx: MySqlParser.SqlStatementContext): Statement? {
        val statement = super.visitSqlStatement(ctx)

        if (
            statement != null &&
                statement.statementType != StatementType.CREATE_FUNCTION &&
                statement.statementType != StatementType.CREATE_PROCEDURE
        ) {
            childStatements.add(statement)
        }

        return statement
    }

    override fun visitDeclareCursor(ctx: MySqlParser.DeclareCursorContext): Statement? {
        val statement = super.visitDeclareCursor(ctx)
        if (
            statement != null &&
                statement.statementType != StatementType.CREATE_FUNCTION &&
                statement.statementType != StatementType.CREATE_PROCEDURE
        ) {
            childStatements.add(statement)
        }
        return statement
    }

    private fun clean() {
        currentOptType = StatementType.UNKOWN

        limit = null
        offset = null
        inputTables = arrayListOf()
        cteTempTables = arrayListOf()
    }

    // -----------------------------------database-------------------------------------------------

    override fun visitCreateDatabase(ctx: MySqlParser.CreateDatabaseContext): Statement {
        val databaseName = CommonUtils.cleanQuote(ctx.uid().text)
        return CreateDatabase(databaseName)
    }

    override fun visitDropDatabase(ctx: MySqlParser.DropDatabaseContext): Statement {
        val databaseName = CommonUtils.cleanQuote(ctx.uid().text)
        return DropDatabase(databaseName)
    }

    // -----------------------------------table-------------------------------------------------

    override fun visitColumnCreateTable(ctx: MySqlParser.ColumnCreateTableContext): Statement {
        val tableId = parseFullId(ctx.tableName().fullId())
        var comment: String? = null
        ctx.tableOption().forEach {
            when (it) {
                is MySqlParser.TableOptionCommentContext -> {
                    comment = CommonUtils.cleanQuote(it.STRING_LITERAL().text)
                }
            }
        }
        val columnRels = ArrayList<ColumnRel>()

        ctx.createDefinitions().children.forEach { column ->
            if (column is MySqlParser.ColumnDeclarationContext) {
                val name = CommonUtils.cleanQuote(column.fullColumnName().text)

                var dataType = column.columnDefinition().dataType().getChild(0).text.lowercase()
                val count = column.columnDefinition().dataType().childCount
                if (count > 1) {
                    val item = column.columnDefinition().dataType().getChild(1)
                    if (
                        item is MySqlParser.LengthOneDimensionContext ||
                            item is MySqlParser.LengthTwoDimensionContext ||
                            item is MySqlParser.LengthTwoOptionalDimensionContext
                    ) {
                        dataType = dataType + item.text
                    }
                }

                var colComment: String? = null
                column.columnDefinition().columnConstraint().forEach {
                    if (it is MySqlParser.CommentColumnConstraintContext) {
                        colComment = CommonUtils.cleanQuote(it.STRING_LITERAL().text)
                    }
                }
                columnRels.add(ColumnRel(name, dataType, colComment))
            }
        }

        super.visitColumnCreateTable(ctx)

        val ifNotExists: Boolean = if (ctx.ifNotExists() != null) true else false
        columnRels.forEach { columnRel: ColumnRel ->
            if (primaryKeys.contains(columnRel.columnName)) {
                columnRel.primaryKey = true
            }
        }
        val createTable =
            CreateTable(tableId, TableType.MYSQL, comment, null, null, columnRels, null, null, ifNotExists)

        if (ctx.partitionDefinitions() != null) {
            val def = ctx.partitionDefinitions().partitionFunctionDefinition()
            if (def is PartitionFunctionHashContext) {
                createTable.partitionType = PartitionType.HASH
            } else if (def is PartitionFunctionKeyContext) {
                createTable.partitionType = PartitionType.KEY
            } else if (def is PartitionFunctionRangeContext) {
                createTable.partitionType = PartitionType.RANGE
            } else if (def is PartitionFunctionListContext) {
                createTable.partitionType = PartitionType.LIST
            }
        }

        return createTable
    }

    override fun visitQueryCreateTable(ctx: MySqlParser.QueryCreateTableContext): Statement {
        currentOptType = StatementType.CREATE_TABLE_AS_SELECT
        val tableId = parseFullId(ctx.tableName().fullId())
        var comment: String? = null
        ctx.tableOption().forEach {
            when (it) {
                is MySqlParser.TableOptionCommentContext -> {
                    comment = CommonUtils.cleanQuote(it.STRING_LITERAL().text)
                }
            }
        }

        val ifNotExists: Boolean = if (ctx.ifNotExists() != null) true else false
        val queryStmt = this.visitSelectStatement(ctx.selectStatement()) as QueryStmt
        val createTable = CreateTableAsSelect(tableId, queryStmt, comment, null, null, null, null, null, ifNotExists)
        return createTable
    }

    override fun visitPrimaryKeyTableConstraint(ctx: MySqlParser.PrimaryKeyTableConstraintContext): Statement? {
        val count = ctx.indexColumnNames().childCount

        for (i in 1..(count - 2)) {
            var column = ctx.indexColumnNames().getChild(i).text
            column = CommonUtils.cleanQuote(column)
            primaryKeys.add(column)
        }

        return null
    }

    override fun visitDropTable(ctx: MySqlParser.DropTableContext): Statement {
        if (ctx.tables().tableName().size > 1) {
            throw SQLParserException("不支持drop多个表")
        }
        val tableId = parseFullId(ctx.tables().tableName(0).fullId())

        val dropTable = DropTable(tableId)
        dropTable.ifExists = if (ctx.ifExists() != null) true else false
        return dropTable
    }

    override fun visitTruncateTable(ctx: MySqlParser.TruncateTableContext): Statement {
        val tableId = parseFullId(ctx.tableName().fullId())
        return TruncateTable(tableId)
    }

    override fun visitRenameTable(ctx: MySqlParser.RenameTableContext): Statement {
        val tableId = parseFullId(ctx.renameTableClause().get(0).tableName(0).fullId())
        val newTableId = parseFullId(ctx.renameTableClause().get(0).tableName(1).fullId())

        val action = RenameAction(newTableId)
        return AlterTable(tableId, action)
    }

    override fun visitUseStatement(ctx: MySqlParser.UseStatementContext): Statement {
        val databaseName = ctx.uid().text
        return UseDatabase(databaseName)
    }

    // -----------------------------------Alter-----------------------------------------------

    override fun visitAlterTable(ctx: MySqlParser.AlterTableContext): Statement? {
        val tableId = parseFullId(ctx.tableName().fullId())
        val alterTable = AlterTable(tableId)
        ctx.alterSpecification().forEach { statement ->
            if (statement is MySqlParser.AlterByChangeColumnContext) {
                val columnName = CommonUtils.cleanQuote(statement.oldColumn.text)
                val newColumnName = CommonUtils.cleanQuote(statement.newColumn.text)
                val dataType = CommonUtils.subsql(command, statement.columnDefinition().dataType())
                var comment: String? = null
                var nullable: Boolean = true
                var defaultExpr: String? = null

                statement.columnDefinition().children.forEach {
                    if (it is MySqlParser.CommentColumnConstraintContext) {
                        comment = CommonUtils.cleanQuote(it.STRING_LITERAL().text)
                    } else if (it is MySqlParser.NullColumnConstraintContext) {
                        nullable = it.nullNotnull().NOT() == null
                    } else if (it is MySqlParser.DefaultColumnConstraintContext) {
                        defaultExpr = CommonUtils.subsql(command, it.defaultValue())
                    }
                }

                val action = AlterColumnAction(ALTER_COLUMN, columnName, dataType, comment)
                action.newColumName = newColumnName
                action.nullable = nullable
                action.defaultExpression = defaultExpr
                alterTable.addAction(action)
            } else if (statement is MySqlParser.AlterByAddColumnContext) {
                val columnName = CommonUtils.cleanQuote(statement.uid().get(0).text)
                val dataType = statement.columnDefinition().dataType().text
                var comment: String? = null
                var nullable: Boolean = true
                var defaultExpr: String? = null
                statement.columnDefinition().children.forEach {
                    if (it is MySqlParser.CommentColumnConstraintContext) {
                        comment = CommonUtils.cleanQuote(it.STRING_LITERAL().text)
                    } else if (it is MySqlParser.NullColumnConstraintContext) {
                        nullable = it.nullNotnull().NOT() == null
                    } else if (it is MySqlParser.DefaultColumnConstraintContext) {
                        defaultExpr = CommonUtils.subsql(command, it.defaultValue())
                    }
                }

                val action = AlterColumnAction(ADD_COLUMN, columnName, dataType, comment)
                action.nullable = nullable
                action.defaultExpression = defaultExpr
                alterTable.addAction(action)
            } else if (statement is MySqlParser.AlterByDropColumnContext) {
                val columnName = CommonUtils.cleanQuote(statement.uid().text)
                val action = DropColumnAction(columnName)
                return AlterTable(tableId, action)
            } else if (statement is MySqlParser.AlterByModifyColumnContext) {
                val columnName = CommonUtils.cleanQuote(statement.uid().get(0).text)
                val dataType = statement.columnDefinition().dataType().text

                val action = AlterColumnAction(ALTER_COLUMN, columnName, dataType)
                alterTable.addAction(action)
            } else if (statement is AlterByAddIndexContext) {
                val createIndex = CreateIndex(statement.uid().text)
                alterTable.addAction(createIndex)
            } else if (statement is MySqlParser.AlterByDropIndexContext) {
                val dropIndex = DropIndex(statement.uid().text)
                alterTable.addAction(dropIndex)
            } else if (statement is AlterByAddPrimaryKeyContext) {
                val action = AlterTableAction(ADD_PRIMARY_KEY)
                alterTable.addAction(action)
            } else if (statement is AlterByDropPrimaryKeyContext) {
                val action = AlterTableAction(DROP_PRIMARY_KEY)
                alterTable.addAction(action)
            } else if (statement is MySqlParser.AlterByAddUniqueKeyContext) {
                val action = AlterTableAction(ADD_UNIQUE_KEY)
                alterTable.addAction(action)
            } else if (statement is MySqlParser.AlterPartitionContext) {
                val alterPartition = statement.alterPartitionSpecification()
                if (alterPartition is AlterByTruncatePartitionContext) {
                    val action = AlterTableAction(TRUNCATE_PARTITION)
                    alterTable.addAction(action)
                } else if (alterPartition is MySqlParser.AlterByDropPartitionContext) {
                    val action = AlterTableAction(DROP_PARTITION)
                    alterTable.addAction(action)
                } else if (alterPartition is MySqlParser.AlterByAddPartitionContext) {
                    val action = AlterTableAction(ADD_PARTITION)
                    alterTable.addAction(action)
                }
            }
        }

        if (alterTable.actions.size > 0) {
            return alterTable
        } else {
            return super.visitAlterTable(ctx)
        }
    }

    override fun visitAnalyzeTable(ctx: MySqlParser.AnalyzeTableContext): Statement {
        val tables = ArrayList<TableId>()
        ctx.tables().tableName().forEach { context ->
            val tableId = parseFullId(context.fullId())
            tables.add(tableId)
        }

        return AnalyzeTable(tables)
    }

    // -----------------------------------DML-------------------------------------------------

    override fun visitDmlStatement(ctx: MySqlParser.DmlStatementContext): Statement {
        if (ctx.withStatement() != null) {
            super.visitWithStatement(ctx.withStatement())
            if (ctx.withStatement().selectStatement() != null) {
                return this.visitSelectStatement(ctx.withStatement().selectStatement())
            }
        }

        return super.visitDmlStatement(ctx)
    }

    override fun visitSelectStatement(ctx: MySqlParser.SelectStatementContext): Statement {
        if (currentOptType == StatementType.UNKOWN) {
            currentOptType = StatementType.SELECT
        }
        super.visitSelectStatement(ctx)
        return QueryStmt(inputTables, limit, offset)
    }

    override fun visitInsertStatement(ctx: MySqlParser.InsertStatementContext): Statement {
        val tableId = parseFullId(ctx.tableName().fullId())

        currentOptType = StatementType.INSERT
        if (ctx.insertStatementValue().selectStatement() != null) {
            val queryStmt = this.visitSelectStatement(ctx.insertStatementValue().selectStatement()) as QueryStmt
            return InsertTable(InsertMode.INTO, queryStmt, tableId)
        } else {
            return InsertTable(InsertMode.INTO, QueryStmt(), tableId)
        }
    }

    override fun visitReplaceStatement(ctx: MySqlParser.ReplaceStatementContext): Statement {
        val tableId = parseFullId(ctx.tableName().fullId())

        currentOptType = StatementType.INSERT
        if (ctx.insertStatementValue().selectStatement() != null) {
            val queryStmt = this.visitSelectStatement(ctx.insertStatementValue().selectStatement()) as QueryStmt
            val insertTable = InsertTable(InsertMode.INTO, queryStmt, tableId)
            insertTable.mysqlReplace = true
            return insertTable
        } else {
            return InsertTable(InsertMode.INTO, QueryStmt(), tableId)
        }
    }

    override fun visitDeleteStatement(ctx: MySqlParser.DeleteStatementContext): Statement {
        currentOptType = StatementType.DELETE

        val deleteTable =
            if (ctx.multipleDeleteStatement() != null) {
                this.visit(ctx.multipleDeleteStatement().expression())

                val outputTables = ctx.multipleDeleteStatement().tableName().map { parseFullId(it.fullId()) }
                val deleteTable = DeleteTable(outputTables.first(), inputTables)
                super.visitTableSources(ctx.multipleDeleteStatement().tableSources())
                deleteTable.outputTables.addAll(outputTables.subList(1, outputTables.size))
                deleteTable
            } else {
                if (ctx.singleDeleteStatement().expression() != null) {
                    this.visit(ctx.singleDeleteStatement().expression())
                }

                val tableId = parseFullId(ctx.singleDeleteStatement().tableName().fullId())
                DeleteTable(tableId, inputTables)
            }

        return deleteTable
    }

    override fun visitUpdateStatement(ctx: MySqlParser.UpdateStatementContext): Statement {
        currentOptType = StatementType.UPDATE
        val updateTable =
            if (ctx.multipleUpdateStatement() != null) {
                val intputTableIds = inputTables.toMutableList()
                if (ctx.multipleUpdateStatement().expression() != null) {
                    this.visit(ctx.multipleUpdateStatement().expression())
                }
                inputTables.clear()
                super.visitTableSources(ctx.multipleUpdateStatement().tableSources())
                UpdateTable(inputTables.first(), inputTables.toMutableList())
                val updateTable = UpdateTable(inputTables.first(), intputTableIds)
                updateTable.outputTables.addAll(inputTables.subList(1, inputTables.size))
                updateTable
            } else {
                this.visit(ctx.singleUpdateStatement().expression())
                val tableId = parseFullId(ctx.singleUpdateStatement().tableName().fullId())
                UpdateTable(tableId, inputTables)
            }

        return updateTable
    }

    override fun visitCreateIndex(ctx: MySqlParser.CreateIndexContext): Statement {
        val tableId = parseFullId(ctx.tableName().fullId())
        val createIndex = CreateIndex(ctx.uid().text)
        return AlterTable(tableId, createIndex)
    }

    override fun visitDropIndex(ctx: MySqlParser.DropIndexContext): Statement {
        val tableId = parseFullId(ctx.tableName().fullId())
        val dropIndex = DropIndex(ctx.uid().text)
        return AlterTable(tableId, dropIndex)
    }

    override fun visitCreateProcedure(ctx: MySqlParser.CreateProcedureContext): Statement {
        super.visitCreateProcedure(ctx)
        val tableId = parseFullId(ctx.fullId())
        val procedureId = ProcedureId(tableId.schemaName, tableId.tableName)
        return CreateProcedure(procedureId, childStatements, false)
    }

    override fun visitCreateFunction(ctx: MySqlParser.CreateFunctionContext): Statement {
        super.visitCreateFunction(ctx)
        val tableId = parseFullId(ctx.fullId())
        val functionId = FunctionId(tableId.schemaName, tableId.tableName)
        return CreateFunction(functionId, childStatements, false)
    }

    // -----------------------------------private
    // method-------------------------------------------------

    override fun visitCommonTableExpressions(ctx: MySqlParser.CommonTableExpressionsContext): Statement? {
        val tableId = TableId(ctx.cteName().text)
        cteTempTables.add(tableId)

        super.visitCommonTableExpressions(ctx)
        return null
    }

    override fun visitTableName(ctx: MySqlParser.TableNameContext): Statement? {
        if (
            StatementType.SELECT == currentOptType ||
                StatementType.INSERT == currentOptType ||
                StatementType.UPDATE == currentOptType ||
                StatementType.DELETE == currentOptType ||
                StatementType.CREATE_TABLE_AS_SELECT == currentOptType
        ) {

            val tableId = parseFullId(ctx.fullId())

            if (!inputTables.contains(tableId) && !cteTempTables.contains(tableId)) {
                inputTables.add(tableId)
            }
        }
        return null
    }

    override fun visitLimitClause(ctx: MySqlParser.LimitClauseContext): Statement? {
        if (ctx.limit != null && ctx.limit.decimalLiteral() != null) {
            limit = ctx.limit.text.toInt()
        }
        if (ctx.offset != null && ctx.offset.decimalLiteral() != null) {
            offset = ctx.offset.text.toInt()
        }
        return super.visitLimitClause(ctx)
    }

    private fun parseFullId(fullId: MySqlParser.FullIdContext): TableId {
        var databaseName: String? = null
        var tableName: String = ""

        if (fullId.childCount == 2) {
            databaseName = fullId.uid().get(0).text
            tableName = (fullId.getChild(1) as TerminalNodeImpl).text.substring(1)
        } else if (fullId.childCount == 3) {
            databaseName = CommonUtils.cleanQuote(fullId.uid().get(0).text)
            tableName = CommonUtils.cleanQuote((fullId.getChild(2) as MySqlParser.UidContext).text)
        } else {
            tableName = fullId.uid().get(0).text
        }

        if (databaseName != null) {
            databaseName = CommonUtils.cleanQuote(databaseName)
        }
        tableName = CommonUtils.cleanQuote(tableName)

        return TableId(databaseName, tableName)
    }
}
