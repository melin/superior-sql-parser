package io.github.melin.superior.parser.starrocks

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.alter.*
import io.github.melin.superior.common.relational.common.*
import io.github.melin.superior.common.relational.create.*
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.common.relational.drop.*
import io.github.melin.superior.common.relational.io.AlterLoadTable
import io.github.melin.superior.common.relational.io.CancelLoadTable
import io.github.melin.superior.common.relational.io.ExportTable
import io.github.melin.superior.common.relational.io.LoadTable
import io.github.melin.superior.parser.starrocks.antlr4.StarRocksParserBaseVisitor
import org.antlr.v4.runtime.tree.RuleNode

import io.github.melin.superior.parser.starrocks.antlr4.StarRocksParser.*
import io.github.melin.superior.parser.starrocks.relational.*
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
    private var functionNames: HashSet<FunctionId> = hashSetOf()

    private var statements: ArrayList<Statement> = arrayListOf()
    private val sqls: ArrayList<String> = arrayListOf()
    private var mvRefreshType: String = "Sync"

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
                } else if (StringUtils.equalsIgnoreCase("DESC", startNode) ||
                        StringUtils.equalsIgnoreCase("DESCRIBE", startNode)) {
                    val keyWords: ArrayList<String> = arrayListOf()
                    CommonUtils.findShowStatementKeyWord(keyWords, it)
                    DescStatement(*keyWords.toTypedArray())
                }  else {
                    val statement = this.visitSingleStatement(it)
                    if (statement == null) {
                        throw SQLParserException("not support sql")
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
        functionNames = hashSetOf()
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
            return AlterMaterializedView(tableId, DefaultAction(AlterType.REFRESH_MV))
        } else if (ctx.tableRenameClause() != null) {
            val newName = ctx.tableRenameClause().identifier().text
            return AlterMaterializedView(tableId, RenameAction(TableId(newName)))
        } else {
            val properties = parseOptions(ctx.modifyTablePropertiesClause().propertyList())
            val action = AlterPropsAction()
            action.properties.putAll(properties)
            return AlterMaterializedView(tableId, action)
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
        var modelType = ""
        if (keyDesc != null) {
            if (keyDesc.DUPLICATE() != null) {
                modelType = "duplicate"
            } else if (keyDesc.AGGREGATE() != null) {
                modelType = "aggregate"
            } else if (keyDesc.UNIQUE() != null) {
                modelType = "unique"
            } else if (keyDesc.PRIMARY() != null) {
                modelType = "primary"
            }
        }

        val table = CreateTable(tableId, TableType.STARROCKS, comment, columnRels)
        table.modelType = modelType
        return table
    }

    override fun visitCreateTableAsSelectStatement(ctx: CreateTableAsSelectStatementContext): Statement? {
        val tableId = parseTableName(ctx.qualifiedName())
        val comment = if (ctx.comment() != null) CommonUtils.cleanQuote(ctx.comment().text) else null
        val ifNotExists = ctx.EXISTS() != null

        val queryStmt = this.visitQueryStatement(ctx.queryStatement()) as QueryStmt
        val createTable = CreateTableAsSelect(tableId, queryStmt, comment)
        createTable.ifNotExists = ifNotExists
        val properties = parseOptions(ctx.properties())
        createTable.properties = properties
        return createTable
    }

    override fun visitCreateViewStatement(ctx: CreateViewStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val comment: String? = if (ctx.comment() != null) CommonUtils.cleanQuote(ctx.comment().string().text) else null
        val columns = parseColumnNameWithComment(ctx.columnNameWithComment());
        val ifNotExists = ctx.NOT() != null
        val queryStmt = this.visitQueryStatement(ctx.queryStatement()) as QueryStmt
        val createView = CreateView(tableId, queryStmt, comment, ifNotExists, columns)

        this.visitQueryStatement(ctx.queryStatement())
        return createView;
    }

    override fun visitCreateMaterializedViewStatement(ctx: CreateMaterializedViewStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val comment: String? = if (ctx.comment() != null) CommonUtils.cleanQuote(ctx.comment().string().text) else null
        val columns = parseColumnNameWithComment(ctx.columnNameWithComment());
        val ifNotExists = ctx.NOT() != null

        val queryStmt = this.visitQueryStatement(ctx.queryStatement()) as QueryStmt
        val createView = CreateMaterializedView(tableId, queryStmt, comment, ifNotExists, columns)

        ctx.materializedViewDesc().forEach { this.visitMaterializedViewDesc(it) }
        createView.modelType = mvRefreshType

        this.visitQueryStatement(ctx.queryStatement())
        return createView;
    }

    override fun visitRefreshSchemeDesc(ctx: RefreshSchemeDescContext): Statement? {
        if (ctx.ASYNC() != null) {
            mvRefreshType = "Async"
        } else if (ctx.MANUAL() != null) {
            mvRefreshType = "Manual"
        } else if (ctx.INCREMENTAL() != null) {
            mvRefreshType = "Incremental"
        }

        return null;
    }

    override fun visitRefreshMaterializedViewStatement(ctx: RefreshMaterializedViewStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        val force: Boolean = ctx.FORCE() != null;
        val mode: String = if (ctx.SYNC() != null) "Sync" else "Async"
        var partitionStart: String? = null
        var partitionEnd: String? = null

        if (ctx.partitionRangeDesc() != null) {
            val values = ctx.partitionRangeDesc().string();
            partitionStart = CommonUtils.cleanQuote(values.get(0).text)
            partitionEnd = CommonUtils.cleanQuote(values.get(1).text)
        }

        return RefreshMaterializedView(tableId, force, mode, partitionStart, partitionEnd)
    }

    override fun visitCancelRefreshMaterializedViewStatement(ctx: CancelRefreshMaterializedViewStatementContext): Statement {
        val tableId = parseTableName(ctx.qualifiedName())
        return CancelRefreshMaterializedView(tableId)
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
        val queryStmt = this.visitQueryStatement(ctx.queryStatement()) as QueryStmt
        val action = AlterViewAction(queryStmt)
        return AlterTable(tableId, action)
    }

    override fun visitQueryStatement(ctx: QueryStatementContext): Statement {
        currentOptType = StatementType.SELECT
        super.visitQueryRelation(ctx.queryRelation())
        val queryStmt = QueryStmt(inputTables, limit, offset)
        queryStmt.functionNames.addAll(functionNames)

        val querySql = CommonUtils.subsql(command, ctx)
        queryStmt.setSql(querySql)

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
        insertTable.functionNames.addAll(functionNames)

        if (ctx.expressionsWithDefault().size > 0) {
            val rows: ArrayList<List<String>> = ArrayList()
            ctx.expressionsWithDefault().forEach {
                var text = it.text
                text = StringUtils.substringBetween(text, "(", ")").trim()
                text = CommonUtils.cleanQuote(text)
                rows.add(listOf(text))
            }
            insertTable.rows = rows
        }

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

    override fun visitCreateRoutineLoadStatement(ctx: CreateRoutineLoadStatementContext): Statement {
        val catalogName: String? = if (ctx.db != null && ctx.db.identifier().size == 2)
            CommonUtils.cleanQuote(ctx.db.identifier().get(1).text) else null
        val schemaName: String? = if (ctx.db != null && ctx.db.identifier().size > 0)
            CommonUtils.cleanQuote(ctx.db.identifier().get(0).text) else null

        val jobName = ctx.name.text;
        val tableId = parseTableName(ctx.table)
        val jobProperties = if (ctx.jobProperties() != null) parseOptions(ctx.jobProperties().properties()) else null
        val loadPropertiesExpr = CommonUtils.subsql(command, ctx.loadPropertiesExpr())
        val source = ctx.source.text
        val sourceProperties = if (ctx.dataSourceProperties() != null) parseOptions(ctx.dataSourceProperties().propertyList()) else null

        return CreateRoutineLoad(catalogName, schemaName, jobName, tableId,
                loadPropertiesExpr, jobProperties, source, sourceProperties)
    }

    override fun visitAlterRoutineLoadStatement(ctx: AlterRoutineLoadStatementContext): Statement {
        val catalogName: String? = if (ctx.db != null && ctx.db.identifier().size == 2)
            CommonUtils.cleanQuote(ctx.db.identifier().get(1).text) else null
        val schemaName: String? = if (ctx.db != null && ctx.db.identifier().size > 0)
            CommonUtils.cleanQuote(ctx.db.identifier().get(0).text) else null

        val jobName = ctx.name.text;
        val jobProperties = if (ctx.jobProperties() != null) parseOptions(ctx.jobProperties().properties()) else null
        val loadPropertiesExpr = CommonUtils.subsql(command, ctx.loadPropertiesExpr())
        var source: String? = null;
        var sourceProperties: Map<String, String>? = null;
        if (ctx.dataSource() != null) {
            source = ctx.dataSource().source.text
            sourceProperties = parseOptions(ctx.dataSource().dataSourceProperties().propertyList())
        }

        return AlterRoutineLoad(catalogName, schemaName, jobName,
                loadPropertiesExpr, jobProperties, source, sourceProperties)
    }

    override fun visitPauseRoutineLoadStatement(ctx: PauseRoutineLoadStatementContext): Statement {
        val catalogName: String? = if (ctx.db != null && ctx.db.identifier().size == 2)
            CommonUtils.cleanQuote(ctx.db.identifier().get(1).text) else null
        val schemaName: String? = if (ctx.db != null && ctx.db.identifier().size > 0)
            CommonUtils.cleanQuote(ctx.db.identifier().get(0).text) else null

        val jobName = ctx.name.text;
        return PauseRoutineLoad(catalogName, schemaName, jobName)
    }

    override fun visitResumeRoutineLoadStatement(ctx: ResumeRoutineLoadStatementContext): Statement {
        val catalogName: String? = if (ctx.db != null && ctx.db.identifier().size == 2)
            CommonUtils.cleanQuote(ctx.db.identifier().get(1).text) else null
        val schemaName: String? = if (ctx.db != null && ctx.db.identifier().size > 0)
            CommonUtils.cleanQuote(ctx.db.identifier().get(0).text) else null

        val jobName = ctx.name.text;
        return ResumeRoutineLoad(catalogName, schemaName, jobName)
    }

    override fun visitStopRoutineLoadStatement(ctx: StopRoutineLoadStatementContext): Statement {
        val catalogName: String? = if (ctx.db != null && ctx.db.identifier().size == 2)
            CommonUtils.cleanQuote(ctx.db.identifier().get(1).text) else null
        val schemaName: String? = if (ctx.db != null && ctx.db.identifier().size > 0)
            CommonUtils.cleanQuote(ctx.db.identifier().get(0).text) else null

        val jobName = ctx.name.text;
        return StopRoutineLoad(catalogName, schemaName, jobName)
    }

    override fun visitLoadStatement(ctx: LoadStatementContext): Statement {
        val schemaName: String? = if (ctx.label.db != null)
            CommonUtils.cleanQuote(ctx.label.db.text) else null

        val labelName = ctx.label.label.text
        val tableNames = arrayListOf<String>();
        ctx.dataDescList().dataDesc().forEach { it ->
            if (it.dstTableName != null) {
                tableNames.add(it.dstTableName.text)
            }
        }

        return LoadTable(schemaName, labelName, tableNames)
    }

    override fun visitAlterLoadStatement(ctx: AlterLoadStatementContext): Statement {
        val schemaName: String? = if (ctx.db != null)
            CommonUtils.cleanQuote(ctx.db.text) else null

        val labelName = ctx.identifier().text

        return AlterLoadTable(schemaName, labelName)
    }

    override fun visitCancelLoadStatement(ctx: CancelLoadStatementContext): Statement {
        val schemaName: String? = if (ctx.FROM() != null) ctx.identifier().text else null
        val expression: String = ctx.expression().text
        var labelName: String = StringUtils.substringAfter(expression, "=")
        labelName = CommonUtils.cleanQuote(labelName.trim())
        return CancelLoadTable(schemaName, labelName)
    }

    override fun visitExportStatement(ctx: ExportStatementContext): Statement {
        val tableId = parseTableName(ctx.tableDesc().qualifiedName())
        val filePath = CommonUtils.cleanQuote(ctx.string().text)
        val properties = parseOptions(ctx.properties())
        return ExportTable(tableId, filePath, properties)
    }

    override fun visitCancelExportStatement(ctx: CancelExportStatementContext): Statement {
        val database: String? = if (ctx.catalog != null ) ctx.catalog.text else null
        val expr = ctx.expression().text
        var queryId: String = StringUtils.substringBetween(expr, "\"", "\"")
        if (StringUtils.isBlank(queryId)) {
            queryId = StringUtils.substringBetween(expr, "'", "'")
        }

        return CancelExport(database, queryId)
    }

    override fun visitCreateFunctionStatement(ctx: CreateFunctionStatementContext): Statement {
        val functionId = parseTableName(ctx.qualifiedName())
        val global = ctx.GLOBAL() != null
        val properties = parseOptions(ctx.properties())
        val argumentTypes = parseTypeList(ctx.typeList())
        val createFunction = CreateFunction(FunctionId(functionId.schemaName, functionId.tableName))
        createFunction.global = global
        createFunction.properties = properties
        createFunction.argumentTypes = argumentTypes
        createFunction.returnType = ctx.returnType.text
        return createFunction
    }

    override fun visitDropFunctionStatement(ctx: DropFunctionStatementContext): Statement {
        val functionId = parseTableName(ctx.qualifiedName())
        val argumentTypes = parseTypeList(ctx.typeList())

        val dropFunction = DropFunction(FunctionId(functionId.schemaName, functionId.tableName))
        dropFunction.argumentTypes = argumentTypes
        return dropFunction
    }

    override fun visitQualifiedName(ctx: QualifiedNameContext): Statement? {
        if (currentOptType == StatementType.SELECT ||
                currentOptType == StatementType.CREATE_TABLE_AS_SELECT ||
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

    override fun visitSimpleFunctionCall(ctx: SimpleFunctionCallContext): Statement? {
        if (StatementType.SELECT == currentOptType ||
                StatementType.CREATE_VIEW == currentOptType ||
                StatementType.CREATE_MATERIALIZED_VIEW == currentOptType ||
                StatementType.INSERT == currentOptType ||
                StatementType.CREATE_TABLE_AS_SELECT == currentOptType) {

            val names = ctx.qualifiedName().identifier()
            if (names.size == 3) {
                val catalog = StringUtils.lowerCase(names.get(0).text)
                val schema = StringUtils.lowerCase(names.get(1).text)
                val funcName = StringUtils.lowerCase(names.get(2).text)
                functionNames.add(FunctionId(catalog, schema, funcName))
            } else if (names.size == 2) {
                val schema = StringUtils.lowerCase(names.get(0).text)
                val funcName = StringUtils.lowerCase(names.get(1).text)
                functionNames.add(FunctionId(schema, funcName))
            } else if (names.size == 1) {
                val funcName = StringUtils.lowerCase(names.get(0).text)
                functionNames.add(FunctionId(funcName))
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

    private fun parseTypeList(ctx: TypeListContext?): List<String> {
        val types = java.util.ArrayList<String>()
        if (ctx != null) {
            ctx.type().forEach { item ->
                val type = item as TypeContext
                types.add(type.text)
            }

            if (ctx.DOTDOTDOT() != null) {
                types.add(ctx.DOTDOTDOT().text)
            }
        }

        return types
    }
}
