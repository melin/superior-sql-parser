package io.github.melin.superior.parser.mysql

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.dml.InsertMode
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.dml.SingleInsertStmt
import io.github.melin.superior.common.relational.namespace.CreateNamespace
import io.github.melin.superior.common.relational.namespace.DropNamespace
import io.github.melin.superior.common.relational.namespace.UseNamespace
import io.github.melin.superior.common.relational.table.Column
import io.github.melin.superior.common.relational.table.CreateTable
import io.github.melin.superior.common.relational.table.DropTable
import io.github.melin.superior.common.relational.table.TruncateTable
import io.github.melin.superior.parser.mysql.antlr4.MySqlParser
import io.github.melin.superior.parser.mysql.antlr4.MySqlParserBaseVisitor
import org.antlr.v4.runtime.tree.TerminalNodeImpl

/**
 *
 * Created by libinsong on 2018/2/8.
 */
class MySQLAntlr4Visitor : MySqlParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var limit: Int? = null
    private val primaryKeys = ArrayList<String>()

    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var outputTables: ArrayList<TableId> = arrayListOf()

    //-----------------------------------database-------------------------------------------------

    override fun visitCreateDatabase(ctx: MySqlParser.CreateDatabaseContext): StatementData {
        val databaseName = ctx.uid().text
        val createNamespace = CreateNamespace(databaseName)
        return StatementData(StatementType.CREATE_NAMESPACE, createNamespace)
    }

    override fun visitDropDatabase(ctx: MySqlParser.DropDatabaseContext): StatementData {
        val databaseName = ctx.uid().text
        val dropNamespace = DropNamespace(databaseName)
        return StatementData(StatementType.DROP_NAMESPACE, dropNamespace)
    }

    //-----------------------------------table-------------------------------------------------

    override fun visitColumnCreateTable(ctx: MySqlParser.ColumnCreateTableContext): StatementData {
        val tableId = parseFullId(ctx.tableName().fullId())
        var comment: String? = null
        ctx.tableOption().forEach {
            when(it) {
                is MySqlParser.TableOptionCommentContext -> {
                    comment = StringUtil.cleanQuote(it.STRING_LITERAL().text)
                }
            }
        }
        val columns = ArrayList<Column>()
        val properties = HashMap<String, String>()

        ctx.createDefinitions().children.forEach { column ->
            if(column is MySqlParser.ColumnDeclarationContext ) {
                val name = StringUtil.cleanBackQuote(column.fullColumnName().text)


                var dataType = column.columnDefinition().dataType().getChild(0).text.lowercase()
                val count = column.columnDefinition().dataType().childCount
                if(count > 1) {
                    val item = column.columnDefinition().dataType().getChild(1)
                    if(item is MySqlParser.LengthOneDimensionContext ||
                            item is MySqlParser.LengthTwoDimensionContext ||
                            item is MySqlParser.LengthTwoOptionalDimensionContext) {
                        dataType = dataType + item.text
                    }
                }

                var colComment:String? = null
                column.columnDefinition().columnConstraint().forEach {
                    if(it is MySqlParser.CommentColumnConstraintContext) {
                        colComment = StringUtil.cleanQuote(it.STRING_LITERAL().text)
                    }
                }
                columns.add(Column(name, dataType, colComment))
            }
        }

        super.visitColumnCreateTable(ctx)

        val ifNotExists: Boolean = if (ctx.ifNotExists() != null) true else false
        columns.forEach { column: Column -> if (primaryKeys.contains(column.name)) { column.isPk = true } }
        val createTable = CreateTable(tableId, comment,
                null, null, columns, properties, null, ifNotExists)

        return StatementData(StatementType.CREATE_TABLE, createTable)
    }

    override fun visitPrimaryKeyTableConstraint(ctx: MySqlParser.PrimaryKeyTableConstraintContext): StatementData? {
        val count = ctx.indexColumnNames().childCount

        for (i in 1..(count-2)) {
            var column = ctx.indexColumnNames().getChild(i).text
            column = StringUtil.cleanBackQuote(column)
            primaryKeys.add(column)
        }

        return null
    }

    override fun visitDropTable(ctx: MySqlParser.DropTableContext): StatementData {
        if(ctx.tables().tableName().size > 1) {
            throw SQLParserException("不支持drop多个表")
        }
        val tableId = parseFullId(ctx.tables().tableName(0).fullId())

        val dropTable = DropTable(tableId)
        dropTable.ifExists = if (ctx.ifExists() != null) true else false
        return StatementData(StatementType.DROP_TABLE, dropTable)
    }

    override fun visitTruncateTable(ctx: MySqlParser.TruncateTableContext): StatementData {
        val tableId = parseFullId(ctx.tableName().fullId())
        val truncateTable = TruncateTable(tableId)
        return StatementData(StatementType.TRUNCATE_TABLE, truncateTable)
    }

    override fun visitRenameTable(ctx: MySqlParser.RenameTableContext): StatementData {
        val tableId = parseFullId(ctx.renameTableClause().get(0).tableName(0).fullId())
        val newTableId = parseFullId(ctx.renameTableClause().get(0).tableName(1).fullId())

        val action = AlterTableAction(newTableId.tableName)
        val alterTable = AlterTable(AlterType.RENAME_TABLE, tableId, action)
        return StatementData(StatementType.ALTER_TABLE, alterTable)
    }

    override fun visitUseStatement(ctx: MySqlParser.UseStatementContext): StatementData {
        val databaseName = ctx.uid().text
        val data = UseNamespace(databaseName)
        return StatementData(StatementType.USE, data)
    }

    //-----------------------------------Alter-----------------------------------------------

    override fun visitAlterTable(ctx: MySqlParser.AlterTableContext): StatementData? {
        if(ctx.childCount > 4) {
            throw SQLParserException("不允许同时执行多个alter")
        }
        val statement = ctx.getChild(3)
        val tableId = parseFullId(ctx.tableName().fullId())
        if (statement is MySqlParser.AlterByChangeColumnContext) {
            val columnName = StringUtil.cleanBackQuote(statement.oldColumn.text)
            val newColumnName = StringUtil.cleanBackQuote(statement.newColumn.text)
            val dataType = statement.columnDefinition().dataType().text
            var comment:String? = null

            statement.columnDefinition().children.forEach {
                if(it is MySqlParser.CommentColumnConstraintContext) {
                    comment = StringUtil.cleanQuote(it.STRING_LITERAL().text)
                }
            }

            val action = AlterColumnAction(columnName, dataType, comment)
            action.newColumName = newColumnName

            val alterTable = AlterTable(AlterType.ALTER_COLUMN, tableId, action)
            return StatementData(StatementType.ALTER_TABLE, alterTable)
        } else if(statement is MySqlParser.AlterByAddColumnContext) {
            val columnName = StringUtil.cleanBackQuote(statement.uid().get(0).text)
            val dataType = statement.columnDefinition().dataType().text
            var comment:String? = null
            statement.columnDefinition().children.forEach {
                if(it is MySqlParser.CommentColumnConstraintContext) {
                    comment = StringUtil.cleanQuote(it.STRING_LITERAL().text)
                }
            }

            val action = AlterColumnAction(columnName, dataType, comment)
            val alterTable = AlterTable(AlterType.ADD_COLUMN, tableId, action)
            return StatementData(StatementType.ALTER_TABLE, alterTable)
        } else if(statement is MySqlParser.AlterByDropColumnContext) {
            val columnName = StringUtil.cleanBackQuote(statement.uid().text)
            val action = DropColumnAction(listOf(columnName))
            val alterTable = AlterTable(AlterType.DROP_COLUMN, tableId, action)
            return StatementData(StatementType.ALTER_TABLE, alterTable)
        } else if(statement is MySqlParser.AlterByModifyColumnContext) {
            val columnName = StringUtil.cleanBackQuote(statement.uid().get(0).text)
            val dataType = statement.columnDefinition().dataType().text

            val action = AlterColumnAction(columnName, dataType)
            val alterTable = AlterTable(AlterType.ALTER_COLUMN, tableId, action)
            return StatementData(StatementType.ALTER_TABLE, alterTable)
        } else if(statement is MySqlParser.AlterByAddIndexContext) {
            val action = AlterTableAction()
            val alterTable = AlterTable(AlterType.ADD_INDEX, tableId, action)
            return StatementData(StatementType.ALTER_TABLE, alterTable)
        } else if(statement is MySqlParser.AlterByDropIndexContext) {
            val action = AlterTableAction()
            val alterTable = AlterTable(AlterType.DROP_INDEX, tableId, action)
            return StatementData(StatementType.ALTER_TABLE, alterTable)
        } else if(statement is MySqlParser.AlterByAddPrimaryKeyContext) {
            val action = AlterTableAction()
            val alterTable = AlterTable(AlterType.ADD_PRIMARY_KEY, tableId, action)
            return StatementData(StatementType.ALTER_TABLE, alterTable)
        } else if(statement is MySqlParser.AlterByAddUniqueKeyContext) {
            val action = AlterTableAction()
            val alterTable = AlterTable(AlterType.ADD_UNIQUE_KEY, tableId, action)
            return StatementData(StatementType.ALTER_TABLE, alterTable)
        }

        return super.visitAlterTable(ctx)
    }

    override fun visitAnalyzeTable(ctx: MySqlParser.AnalyzeTableContext): StatementData {
        val tables = ArrayList<TableId>()
        ctx.tables().tableName().forEach { context ->
            val tableId = parseFullId(context.fullId())
            tables.add(tableId)
        }

        return StatementData(StatementType.ANALYZE_TABLE, TableLineage(tables))
    }

    //-----------------------------------DML-------------------------------------------------

    override fun visitDmlStatement(ctx: MySqlParser.DmlStatementContext): StatementData {
        if (ctx.selectStatement() != null) {
            currentOptType = StatementType.SELECT
            super.visitDmlStatement(ctx)

            val queryStmt = QueryStmt(inputTables, limit)
            return StatementData(StatementType.SELECT, queryStmt)
        } else if (ctx.insertStatement() != null) {
            val statement = ctx.insertStatement()
            val tableId = parseFullId(statement.tableName().fullId())
            outputTables.add(tableId)

            if (statement.insertStatementValue().selectStatement() != null) {
                currentOptType = StatementType.INSERT_SELECT
                super.visit(ctx.insertStatement().insertStatementValue().selectStatement())

                val singleInsertStmt = SingleInsertStmt(InsertMode.INTO, tableId)
                singleInsertStmt.inputTables = inputTables
                return StatementData(StatementType.INSERT_SELECT, singleInsertStmt)
            } else {
                currentOptType = StatementType.INSERT_VALUES
                val singleInsertStmt = SingleInsertStmt(InsertMode.INTO, tableId)
                return StatementData(StatementType.INSERT_VALUES, singleInsertStmt)
            }
        } else if (ctx.updateStatement() != null) {
            val statement = ctx.updateStatement()
            if (statement.multipleUpdateStatement() != null) {
                throw SQLParserException("不支持更新多个表")
            }

            val tableId = parseFullId(ctx.updateStatement().singleUpdateStatement().tableName().fullId())
            val tableSource = UpdateTable(tableId)
            return StatementData(StatementType.UPDATE, tableSource)
        } else if (ctx.deleteStatement() != null) {
            val statement = ctx.deleteStatement()
            if (statement.multipleDeleteStatement() != null) {
                throw SQLParserException("不支持删除多个表")
            }

            val tableId = parseFullId(ctx.deleteStatement().singleDeleteStatement().tableName().fullId())
            val tableSource = DeleteTable(tableId)
            return StatementData(StatementType.DELETE, tableSource)
        } else {
            throw SQLParserException("不支持的DML")
        }
    }

    //-----------------------------------private method-------------------------------------------------

    override fun visitTableName(ctx: MySqlParser.TableNameContext): StatementData? {
        if(StatementType.SELECT == currentOptType ||
                StatementType.INSERT_SELECT == currentOptType) {
            val tableId = parseFullId(ctx.fullId())
            inputTables.add(tableId)
        }
        return null
    }

    override fun visitLimitClause(ctx: MySqlParser.LimitClauseContext): StatementData? {
        if (currentOptType == StatementType.SELECT ) {
            limit = ctx.limit.text.toInt()
        }
        return null
    }

    private fun parseFullId(fullId: MySqlParser.FullIdContext): TableId {
        var databaseName: String? = null
        var tableName = ""

        if (fullId.childCount == 2) {
            databaseName = fullId.uid().get(0).text
            tableName = (fullId.getChild(1) as TerminalNodeImpl).text.substring(1)
        } else if(fullId.childCount == 3) {
            databaseName = StringUtil.cleanBackQuote(fullId.uid().get(0).text)
            tableName = StringUtil.cleanBackQuote((fullId.getChild(2) as MySqlParser.UidContext).text)
        } else {
            tableName = fullId.uid().get(0).text
        }

        if (databaseName != null) {
            databaseName = StringUtil.cleanBackQuote(databaseName)
        }
        tableName = StringUtil.cleanBackQuote(tableName)

        return TableId(databaseName, tableName);
    }
}
