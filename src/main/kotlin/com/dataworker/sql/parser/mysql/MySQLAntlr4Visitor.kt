package com.dataworker.sql.parser.mysql

import com.dataworker.sql.parser.SQLParserException
import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.antlr4.mysql.MySQLParser
import com.dataworker.sql.parser.model.*
import com.dataworker.sql.parser.antlr4.mysql.MySQLParserBaseVisitor
import com.dataworker.sql.parser.util.StringUtil
import org.antlr.v4.runtime.tree.TerminalNodeImpl

/**
 *
 * Created by libinsong on 2018/2/8.
 */
class MySQLAntlr4Visitor : MySQLParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private val statementData = TableData()
    private var tableSource: TableSource? = null
    private var limit:Int? = null
    private val primaries = ArrayList<String>()

    //-----------------------------------database-------------------------------------------------

    override fun visitCreateDatabase(ctx: MySQLParser.CreateDatabaseContext): StatementData {
        val databaseName = ctx.uid().text
        val sqlData = DcDatabase(databaseName)
        return StatementData(StatementType.CREATE_DATABASE, sqlData)
    }

    override fun visitDropDatabase(ctx: MySQLParser.DropDatabaseContext): StatementData {
        val databaseName = ctx.uid().text
        val sqlData = DcDatabase(databaseName)

        return StatementData(StatementType.DROP_DATABASE, sqlData)
    }

    //-----------------------------------table-------------------------------------------------

    override fun visitColumnCreateTable(ctx: MySQLParser.ColumnCreateTableContext): StatementData {
        val (databaseName, tableName) = parseFullId(ctx.tableName().fullId())
        var comment: String? = null
        ctx.tableOption().forEach {
            when(it) {
                is MySQLParser.TableOptionCommentContext -> {
                    comment = StringUtil.cleanQuote(it.STRING_LITERAL().text)
                }
                else -> null
            }
        }
        val columns = ArrayList<DcColumn>()
        val uniques = ArrayList<TidbColumn>()
        val properties = HashMap<String, String>()

        ctx.createDefinitions().children.forEach { column ->
            if(column is MySQLParser.ColumnDeclarationContext ) {
                val name = StringUtil.cleanBackQuote(column.uid().text)


                var dataType = column.columnDefinition().dataType().getChild(0).text.toLowerCase()
                val count = column.columnDefinition().dataType().childCount
                if(count > 1) {
                    val item = column.columnDefinition().dataType().getChild(1)
                    if(item is MySQLParser.LengthOneDimensionContext ||
                            item is MySQLParser.LengthTwoDimensionContext ||
                            item is MySQLParser.LengthTwoOptionalDimensionContext) {
                        dataType = dataType + item.text
                    }
                }

                var colComment:String? = null
                column.columnDefinition().columnConstraint().forEach {
                    if(it is MySQLParser.CommentColumnConstraintContext) {
                        colComment = StringUtil.cleanQuote(it.STRING_LITERAL().text)
                    }
                }
                columns.add(DcColumn(name, dataType, colComment))
            } else if (column is MySQLParser.ConstraintDeclarationContext) {
                column
            }
        }


        val ifNotExists: Boolean = if (ctx.ifNotExists() != null) true else false

        val sqlData = TidbCreateTable(databaseName, tableName, comment,
                columns, primaries, uniques, properties, ifNotExists)

        super.visitColumnCreateTable(ctx)
        return StatementData(StatementType.CREATE_TABLE, sqlData)
    }

    override fun visitPrimaryKeyTableConstraint(ctx: MySQLParser.PrimaryKeyTableConstraintContext): StatementData? {
        val count = ctx.indexColumnNames().childCount

        for (i in 1..(count-2)) {
            var column = ctx.indexColumnNames().getChild(i).text
            column = StringUtil.cleanBackQuote(column)
            primaries.add(column)
        }

        return null
    }

    override fun visitDropTable(ctx: MySQLParser.DropTableContext): StatementData {
        if(ctx.tables().tableName().size > 1) {
            throw SQLParserException("不支持drop多个表")
        }
        val (databaseName, tableName) = parseFullId(ctx.tables().tableName(0).fullId())

        val dcTable = DcTable(databaseName, tableName)
        dcTable.ifExists = if (ctx.ifExists() != null) true else false
        return StatementData(StatementType.DROP_TABLE_TIDB, dcTable)
    }

    override fun visitTruncateTable(ctx: MySQLParser.TruncateTableContext): StatementData {
        val (databaseName, tableName) = parseFullId(ctx.tableName().fullId())

        val dcTable = DcTable(databaseName, tableName)
        return StatementData(StatementType.TRUNCATE_TABLE, dcTable)
    }

    override fun visitRenameTable(ctx: MySQLParser.RenameTableContext): StatementData {
        val (databaseName, oldTableName) = parseFullId(ctx.renameTableClause().get(0).tableName(0).fullId())
        val (_, newTableName) = parseFullId(ctx.renameTableClause().get(0).tableName(1).fullId())

        val renameTable = DcRenameTable(databaseName, oldTableName, newTableName)
        return StatementData(StatementType.RENAME_TABLE, renameTable)
    }

    override fun visitUseStatement(ctx: MySQLParser.UseStatementContext): StatementData {
        val databaseName = ctx.uid().text
        val data = DcDatabase(databaseName)
        return StatementData(StatementType.USE, data)
    }

    //-----------------------------------Alter-----------------------------------------------

    override fun visitAlterTable(ctx: MySQLParser.AlterTableContext): StatementData? {
        if(ctx.childCount > 4) {
            throw SQLParserException("不允许同时执行多个alter")
        }
        val statement = ctx.getChild(3)
        if(statement is MySQLParser.AlterByChangeColumnContext) {
            val (databaseName, tableName) = parseFullId(ctx.tableName().fullId())
            var tableSource = TableSource(databaseName, tableName)

            val oldColumn = StringUtil.cleanBackQuote(statement.oldColumn.text)
            val newColumn = StringUtil.cleanBackQuote(statement.newColumn.text)
            val dataType = statement.columnDefinition().dataType().text
            var comment:String? = null

            statement.columnDefinition().children.forEach {
                if(it is MySQLParser.CommentColumnConstraintContext) {
                    comment = StringUtil.cleanQuote(it.STRING_LITERAL().text)
                }
            }

            val column = DcColumn(newColumn, dataType, comment, oldColumn)
            tableSource.column = column

            return StatementData(StatementType.ALTER_TABLE_CHANGE_COL, tableSource)
        } else if(statement is MySQLParser.AlterByAddColumnContext) {
            val (databaseName, tableName) = parseFullId(ctx.tableName().fullId())
            var tableSource = TableSource(databaseName, tableName)

            val name = StringUtil.cleanBackQuote(statement.uid().get(0).text)
            val dataType = statement.columnDefinition().dataType().text
            var comment:String? = null
            statement.columnDefinition().children.forEach {
                if(it is MySQLParser.CommentColumnConstraintContext) {
                    comment = StringUtil.cleanQuote(it.STRING_LITERAL().text)
                }
            }

            val column = DcColumn(name, dataType, comment)
            tableSource.column = column

            return StatementData(StatementType.ALTER_TABLE_ADD_COL, tableSource)
        } else if(statement is MySQLParser.AlterByDropColumnContext) {
            val (databaseName, tableName) = parseFullId(ctx.tableName().fullId())
            var tableSource = TableSource(databaseName, tableName)

            val name = StringUtil.cleanBackQuote(statement.uid().text)
            val column = DcColumn(name)
            tableSource.column = column

            return StatementData(StatementType.ALTER_TABLE_DROP_COL, tableSource)
        } else if(statement is MySQLParser.AlterByModifyColumnContext) {
            val (databaseName, tableName) = parseFullId(ctx.tableName().fullId())
            var tableSource = TableSource(databaseName, tableName)

            val name = StringUtil.cleanBackQuote(statement.uid().get(0).text)
            val dataType = statement.columnDefinition().dataType().text
            val column = DcColumn(name, dataType)
            tableSource.column = column

            return StatementData(StatementType.ALTER_TABLE_MODIFY_COL, tableSource)
        }

        return super.visitAlterTable(ctx)
    }

    override fun visitAlterByAddIndex(ctx: MySQLParser.AlterByAddIndexContext): StatementData {
        currentOptType = StatementType.ALTER_TABLE_ADD_INDEX
        super.visitAlterByAddIndex(ctx)
        return StatementData(currentOptType, tableSource)
    }

    override fun visitAlterByDropIndex(ctx: MySQLParser.AlterByDropIndexContext): StatementData {
        currentOptType = StatementType.ALTER_TABLE_DROP_INDEX
        super.visitAlterByDropIndex(ctx)
        return StatementData(currentOptType, tableSource)
    }

    override fun visitAlterByAddUniqueKey(ctx: MySQLParser.AlterByAddUniqueKeyContext): StatementData {
        currentOptType = StatementType.ALTER_TABLE_ADD_UNIQUE_KEY;
        super.visitAlterByAddUniqueKey(ctx)
        return StatementData(currentOptType, tableSource)
    }

    override fun visitAnalyzeTable(ctx: MySQLParser.AnalyzeTableContext): StatementData {
        val tables = ArrayList<TableSource>()
        ctx.tables().tableName().forEach { context ->
            val (databaseName, tableName) = parseFullId(context.fullId())
            tables.add(TableSource(databaseName, tableName))
        }

        return StatementData(StatementType.ANALYZE_TABLE, TableData(tables))
    }

    //-----------------------------------DML-------------------------------------------------

    override fun visitDmlStatement(ctx: MySQLParser.DmlStatementContext): StatementData {
        if(ctx.selectStatement() != null) {
            currentOptType = StatementType.SELECT
            super.visitDmlStatement(ctx)

            statementData.limit = limit
            return return StatementData(StatementType.SELECT, statementData)
        } else if (ctx.insertStatement() != null) {
            val statement = ctx.insertStatement()
            val (databaseName, tableName) = parseFullId(statement.tableName().fullId())
            var tableSource = TableSource(databaseName, tableName)
            statementData.outpuTables.add(tableSource)

            if(statement.insertStatementValue().selectStatement() != null) {
                currentOptType = StatementType.INSERT_SELECT
                super.visit(ctx.insertStatement().insertStatementValue().selectStatement())
                return return StatementData(StatementType.INSERT_SELECT, statementData)
            } else {
                currentOptType = StatementType.INSERT_VALUES
                return return StatementData(StatementType.INSERT_VALUES, statementData)
            }
        } else if (ctx.updateStatement() != null) {
            val statement = ctx.updateStatement()
            if(statement.multipleUpdateStatement() != null) {
                throw SQLParserException("不支持更新多个表")
            }

            val (databaseName, tableName) =
                    parseFullId(ctx.updateStatement().singleUpdateStatement().tableName().fullId())
            var tableSource = UpdateTable(databaseName, tableName)
            return return StatementData(StatementType.UPDATE, tableSource)
        } else if (ctx.deleteStatement() != null) {
            val statement = ctx.deleteStatement()
            if(statement.multipleDeleteStatement() != null) {
                throw SQLParserException("不支持删除多个表")
            }

            val (databaseName, tableName) =
                    parseFullId(ctx.deleteStatement().singleDeleteStatement().tableName().fullId())
            var tableSource = DeleteTable(databaseName, tableName)
            return return StatementData(StatementType.DELETE, tableSource)
        } else {
            throw SQLParserException("不支持的DML")
        }
    }

    //-----------------------------------private method-------------------------------------------------

    override fun visitTableName(ctx: MySQLParser.TableNameContext): StatementData? {
        if(StatementType.SELECT == currentOptType ||
                StatementType.INSERT_SELECT == currentOptType ||
                currentOptType == StatementType.ALTER_TABLE_RENAME) {
            val (databaseName, tableName) = parseFullId(ctx.fullId())
            var tableSource = TableSource(databaseName, tableName)
            statementData.inputTables.add(tableSource)
        } else if(StatementType.ALTER_TABLE_ADD_INDEX == currentOptType ||
                StatementType.ALTER_TABLE_DROP_INDEX == currentOptType ||
                StatementType.ALTER_TABLE_ADD_UNIQUE_KEY == currentOptType ||
                StatementType.ALTER_TABLE_ADD_PRIMARY_KEY == currentOptType) {

            val (databaseName, tableName) = parseFullId(ctx.fullId())
            tableSource = TableSource(databaseName, tableName)
        }
        return null
    }

    override fun visitLimitClause(ctx: MySQLParser.LimitClauseContext): StatementData? {
        if(currentOptType == StatementType.SELECT ) {
            var _sqlData = statementData
            if(_sqlData is TableData) {
                limit = ctx.limit.text.toInt()
            }
        }
        return null
    }

    private fun parseFullId(fullId: MySQLParser.FullIdContext): Pair<String?, String> {
        var databaseName:String? = null
        var tableName = ""

        if(fullId.childCount == 2) {
            databaseName = fullId.uid().get(0).text
            tableName = (fullId.getChild(1) as TerminalNodeImpl).text.substring(1)
        } else if(fullId.childCount == 3) {
            databaseName = StringUtil.cleanBackQuote(fullId.uid().get(0).text)
            tableName = StringUtil.cleanBackQuote((fullId.getChild(2) as MySQLParser.UidContext).text)
        } else {
            tableName = fullId.uid().get(0).text
        }

        if(databaseName != null) {
            databaseName = StringUtil.cleanBackQuote(databaseName)
        }
        if(tableName != null) {
            tableName = StringUtil.cleanBackQuote(tableName)
        }

        return Pair(databaseName, tableName);
    }
}
