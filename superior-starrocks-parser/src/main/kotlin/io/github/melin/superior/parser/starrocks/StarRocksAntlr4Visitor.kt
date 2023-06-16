package io.github.melin.superior.parser.starrocks

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.alter.*
import io.github.melin.superior.common.relational.common.ShowStatement
import io.github.melin.superior.common.relational.create.*
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.common.relational.drop.*
import io.github.melin.superior.parser.starrocks.antlr4.StarRocksParserBaseVisitor
import org.antlr.v4.runtime.tree.RuleNode

import io.github.melin.superior.parser.starrocks.antlr4.StarRocksParser.*
import io.github.melin.superior.parser.starrocks.relational.DropTask
import io.github.melin.superior.parser.starrocks.relational.SubmitTask
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/6/30 9:59 上午
 */
class StarRocksAntlr4Visitor(val splitSql: Boolean = false, val command: String?):
    StarRocksParserBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var limit: Int? = null
    private var offset: Int? = null

    private var queryStmts: ArrayList<QueryStmt> = arrayListOf()
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

    override fun visitSqlStatements(ctx: SqlStatementsContext): Statement? {
        ctx.singleStatement().forEach {
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
        outputTables = arrayListOf()
        cteTempTables = arrayListOf()
    }

    override fun visitCreateExternalCatalogStatement(ctx: CreateExternalCatalogStatementContext): Statement {
        val catalogName: String = CommonUtils.cleanQuote(ctx.catalogName.text)
        val properties = parseOptions(ctx.properties())
        return CreateCatalog(catalogName, properties)
    }

    override fun visitDropExternalCatalogStatement(ctx: DropExternalCatalogStatementContext): Statement {
        val catalogName: String = CommonUtils.cleanQuote(ctx.catalogName.text)
        return DropCatalog(catalogName)
    }

    override fun visitCreateDbStatement(ctx: CreateDbStatementContext): Statement {
        val catalogName: String? = if (ctx.catalog != null) CommonUtils.cleanQuote(ctx.catalog.text) else null
        val databaseName: String = CommonUtils.cleanQuote(ctx.database.text)
        val properties = parseOptions(ctx.properties())
        val ifNotExists = ctx.NOT() != null

        return CreateDatabase(catalogName, databaseName, properties, ifNotExists)
    }

    override fun visitDropDbStatement(ctx: DropDbStatementContext): Statement {
        val catalogName: String? = if (ctx.catalog != null) CommonUtils.cleanQuote(ctx.catalog.text) else null
        val databaseName: String = CommonUtils.cleanQuote(ctx.database.text)
        val ifExists = ctx.EXISTS() != null
        return DropDatabase(catalogName, databaseName, ifExists)
    }

    override fun visitAlterDbQuotaStatement(ctx: AlterDbQuotaStatementContext): Statement {
        val databaseName: String = CommonUtils.cleanQuote(ctx.identifier().get(0).text)
        val quota = CommonUtils.cleanQuote(ctx.identifier().get(1).text)

        val action = AlterDbPropsAction()
        action.properties.put("quota", quota)
        return AlterDatabase(AlterType.SET_DATABASE_PROPS, databaseName, action)
    }

    override fun visitAlterDatabaseRenameStatement(ctx: AlterDatabaseRenameStatementContext): Statement {
        val databaseName: String = CommonUtils.cleanQuote(ctx.identifier().get(0).text)
        val newDatabaseName = CommonUtils.cleanQuote(ctx.identifier().get(1).text)
        val action = RenameDbAction(newDatabaseName)
        return AlterDatabase(AlterType.RENAME_DATABASE, databaseName, action)
    }

    override fun visitAlterMaterializedViewStatement(ctx: AlterMaterializedViewStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        if (ctx.refreshSchemeDesc() != null) {
            val async = ctx.refreshSchemeDesc().ASYNC() != null
            return AlterMaterializedView(AlterType.REFRESH_MV, tableId, RefreshMvAction(async))
        } else if (ctx.tableRenameClause() != null) {
            val newName = ctx.tableRenameClause().identifier().text
            return AlterMaterializedView(AlterType.RENAME_TABLE, tableId, RenameTableAction(TableId(newName)))
        } else {
            val properties = parseOptions(ctx.modifyTablePropertiesClause().propertyList())
            val action = AlterPropsAction()
            action.properties.putAll(properties)
            return AlterMaterializedView(AlterType.SET_TABLE_PROPS, tableId, action)
        }
    }

    override fun visitCreateTableStatement(ctx: CreateTableStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val comment = if (ctx.comment() != null) CommonUtils.cleanQuote(ctx.comment().text) else null
        val columnRels: List<ColumnRel> = ctx.columnDesc().map { column ->
            val columnName = column.identifier().text
            val dataType = column.type().text
            val colComment = if (column.comment() != null) CommonUtils.cleanQuote(column.comment().string().text) else null
            ColumnRel(columnName, dataType, colComment)
        }

        val keyDesc = ctx.keyDesc()
        var tableType = ""
        if (keyDesc != null) {
            if (keyDesc.DUPLICATE() != null) {
                tableType = "duplicate"
            } else if (keyDesc.AGGREGATE() != null) {
                tableType = "aggregate"
            } else if (keyDesc.UNIQUE() != null) {
                tableType = "unique"
            } else if (keyDesc.PRIMARY() != null) {
                tableType = "primary"
            }
        }

        val table = CreateTable(tableId, comment, columnRels)
        table.tableType = tableType
        return table
    }

    override fun visitCreateViewStatement(ctx: CreateViewStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val comment: String? = if (ctx.comment() != null) CommonUtils.cleanQuote(ctx.comment().string().text) else null
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
        val comment: String? = if (ctx.comment() != null) CommonUtils.cleanQuote(ctx.comment().string().text) else null
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

    override fun visitCreateIndexStatement(ctx: CreateIndexStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val indexName = ctx.indexName.text
        val comment = if (ctx.comment() != null) CommonUtils.cleanQuote(ctx.comment().text) else null

        val columns = ctx.identifierList().identifier().map { identifier ->
            IndexColumnName(identifier.text)
        }

        val createIndex = CreateIndex(indexName)
        createIndex.comment = comment
        createIndex.indexColumnNames.addAll(columns)
        return AlterTable(tableId, createIndex)
    }

    override fun visitDropIndexStatement(ctx: DropIndexStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val indexName = ctx.indexName.text
        val dropIndex = DropIndex(indexName)
        return AlterTable(tableId, dropIndex)
    }

    override fun visitAlterTableStatement(ctx: AlterTableStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        return AlterTable(tableId)
    }

    override fun visitAlterViewStatement(ctx: AlterViewStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val querySql = StringUtils.substring(command, ctx.queryStatement().start.startIndex)
        val action = AlterViewAction(querySql, inputTables)
        return AlterTable(tableId, action)
    }

    override fun visitQueryStatement(ctx: QueryStatementContext): Statement {
        currentOptType = StatementType.SELECT
        super.visitQueryRelation(ctx.queryRelation())
        val queryStmt = QueryStmt(inputTables, limit, offset)

        queryStmts.add(queryStmt)
        return queryStmt
    }

    override fun visitDeleteStatement(ctx: DeleteStatementContext): Statement {
        currentOptType = StatementType.DELETE
        val tableId = parseTableName(ctx.qualifiedName())
        if (ctx.withClause() != null) {
            visitWithClause(ctx.withClause())
        }
        visit(ctx.where)
        if (ctx.relations() != null) {
            visit(ctx.relations())
        }

        return DeleteTable(tableId, inputTables)
    }

    override fun visitUpdateStatement(ctx: UpdateStatementContext): Statement {
        currentOptType = StatementType.UPDATE
        val tableId = parseTableName(ctx.qualifiedName())
        if (ctx.withClause() != null) {
            visitWithClause(ctx.withClause())
        }
        visit(ctx.where)
        visit(ctx.fromClause())

        return UpdateTable(tableId, inputTables)
    }

    override fun visitInsertStatement(ctx: InsertStatementContext): Statement {
        currentOptType = StatementType.INSERT
        val tableId = parseTableName(ctx.qualifiedName())
        if (ctx.queryStatement() != null) {
            visitQueryStatement(ctx.queryStatement())
        }

        val insertTable =
            if (ctx.INTO() != null) InsertTable(InsertMode.INTO, tableId)
            else InsertTable(InsertMode.OVERWRITE, tableId)

        insertTable.inputTables.addAll(inputTables)
        return insertTable
    }

    override fun visitSubmitTaskStatement(ctx: SubmitTaskStatementContext): Statement {
        val taskName: String? = if (ctx.qualifiedName() != null) ctx.qualifiedName().text else null;
        val taskExecSql = CommonUtils.subsql(command, ctx.taskExecSql())
        return SubmitTask(taskName, taskExecSql)
    }

    override fun visitDropTaskStatement(ctx: DropTaskStatementContext): Statement {
        val taskName = ctx.qualifiedName().text
        return DropTask(taskName)
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

    override fun visitLimitElement(ctx: LimitElementContext): Statement? {
        if (ctx.limit != null) {
            limit = ctx.limit.text.toInt()
        }
        if (ctx.offset != null) {
            offset = ctx.offset.text.toInt()
        }

        return super.visitLimitElement(ctx)
    }

    fun parseTableName(ctx: QualifiedNameContext): TableId {
        return if (ctx.identifier().size == 3) {
            val catalotName = CommonUtils.cleanQuote(ctx.identifier().get(0).text)
            val schemaName = CommonUtils.cleanQuote(ctx.identifier().get(1).text)
            val tableName = CommonUtils.cleanQuote(ctx.identifier().get(2).text)
            TableId(catalotName, schemaName, tableName)
        } else if (ctx.identifier().size == 2) {
            val schemaName = CommonUtils.cleanQuote(ctx.identifier().get(0).text)
            val tableName = CommonUtils.cleanQuote(ctx.identifier().get(1).text)
            TableId(schemaName, tableName)
        } else if (ctx.identifier().size == 1) {
            val tableName = CommonUtils.cleanQuote(ctx.identifier().get(0).text)
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
                val key = CommonUtils.cleanQuote(property.key.text)
                val value = CommonUtils.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        return properties
    }

    private fun parseColumnNameWithComment(columns: List<ColumnNameWithCommentContext>): List<ColumnRel> {
        return columns.map { col ->
            val name = col.columnName.text
            val comment = CommonUtils.cleanQuote(col.comment().string().text)
            ColumnRel(name, null, comment)
        }
    }

    private fun parseOptions(ctx: PropertyListContext?): Map<String, String> {
        val properties = HashMap<String, String>()
        if (ctx != null) {
            ctx.property().forEach { item ->
                val property = item as PropertyContext
                val key = CommonUtils.cleanQuote(property.key.text)
                val value = CommonUtils.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        return properties
    }
}
