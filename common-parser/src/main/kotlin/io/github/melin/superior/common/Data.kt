package io.github.melin.superior.common

import com.github.melin.superior.sql.parser.util.StringUtil.innerFullTableName
import io.github.melin.superior.common.relational.TableId
import java.io.Serializable

@Target(AnnotationTarget.CLASS)
annotation class DefaultConstructor

data class StatementData(val type: StatementType,
                         val statement: Statement?,
                         var querySql: String? = null,
                         var values: ArrayList<List<String>>? = null): Serializable {
    constructor(type: StatementType): this(type, null)
}

abstract class Statement: Serializable

@DefaultConstructor
data class TableSource(
    val catalogName: String?,
    var databaseName: String?,
    var tableName: String
): Statement() {
    constructor(databaseName: String?, tableName: String):
            this(null, databaseName, tableName)

    val tokens: java.util.ArrayList<CommonToken> = ArrayList()

    fun getFullTableName(): String {
        return innerFullTableName(catalogName, databaseName, tableName)
    }
}

data class CommonToken(val start: Int, val stop: Int)

data class RenameTable(
    val catalogName: String?,
    val databaseName: String?,
    val oldName: String,
    val newName: String) : Statement() {

    fun getFullTableName(): String {
        return innerFullTableName(catalogName, databaseName, oldName)
    }

    var oldToken: CommonToken? = null
    var newToken: CommonToken? = null
}

data class RenameView(
    val catalogName: String?,
    val databaseName: String?,
    val oldName: String,
    val newName: String) : Statement() {

    fun getFullTableName(): String {
        return innerFullTableName(catalogName, databaseName, oldName)
    }
}

data class CreateTableLike(
    val oldDatabaseName: String?,
    val oldTableName: String,
    val newDatabaseName: String?,
    val newTableName: String,
    var ifNotExists: Boolean = false,
    var external: Boolean = false,
    var temporary: Boolean = false) : Statement()

data class Column(
    val name: String,
    val type: String? = null,
    val comment: String? = null,
    val nullable: Boolean = false) : Statement() {

    var defaultExpression: String? = null // 默认值表达式
    var expression: String? = null // 计算表达式
    var isPk: Boolean = false
    var position: String? = null
    var afterCol: String? = null
}

data class AlterColumn(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val action: AlterColumnAction?) : Statement() {

    constructor(catalogName: String?, databaseName: String?, tableName: String):
            this(catalogName, databaseName, tableName, null);

    constructor(databaseName: String?, tableName: String):
            this(null, databaseName, tableName, null);

    fun getFullTableName(): String {
        return innerFullTableName(catalogName, databaseName, tableName)
    }
    var token: CommonToken? = null
}

data class AlterColumnAction(
    var columName: String? = null, // 修改列名
    var newColumName: String? = null, // 修改列名，新列名称
    var dataType: String? = null,
    var comment: String? = null,
    var position: String? = null,
    var afterCol: String? = null,
    var setOrDrop: String? = null,
    var defaultExpression: String? = null,
    var dropDefault: Boolean = false,
)

data class Function(
    val name: String,
    var temporary: Boolean = false,
    val className: String?,
    val file: String?) : Statement() {
    constructor(name: String): this(name,  false, null, null)
}

data class MergeData(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val partitionVals: List<String>?) : Statement()

data class DataTunnelExpr(
    val srcType: String,
    var srcOptions: Map<String, String>,
    val transformSql: String?,
    val distType: String,
    var distOptions: Map<String, String>,
    var cte: Boolean = false) : Statement() {

    var inputTables: java.util.ArrayList<TableId>? = null
    var cteTempTables: ArrayList<String>? = null
    var functionNames: HashSet<String>? = null
}

data class SyncSchemaExpr(
    val targetCatalog: String?,
    val targetSchema: String,
    val sourceCatalog: String?,
    val sourceSchema: String,
    val owner: String?
) : Statement()

data class SyncTableExpr(
    val targetCatalog: String?,
    val targetSchema: String?,
    val targetTable: String,
    val sourceCatalog: String?,
    val sourceSchema: String?,
    val sourceTable: String,
    val owner: String?
) : Statement()

data class CallExpr(
    val catalogName: String?,
    val namespace: String?,
    val procedureName: String
) : Statement()

data class LoadData(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val loadMode: String? = null,
    val resourceName: String? = null,
    val partitionVals: List<String>? = null) : Statement()

data class ExportData(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val cte: Boolean = false,
    var inputTables: java.util.ArrayList<TableId> = ArrayList(),
    var cteTempTables: ArrayList<String>? = null,
    var functionNames: HashSet<String>? = null) : Statement()

data class RefreshData(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String) : Statement()

data class SetData(val key: String,
                   val value: String?) : Statement()

data class UnSetData(val key: String) : Statement()

@DefaultConstructor
data class StreamTable(
    var tableName: String,
    var columns: List<StreamColumn>,
    var properties: Map<String, String>
) : Statement()

data class StreamColumn(
    val name: String,
    val type: String? = null,
    val comment: String? = null,
    val jsonPath: String? = null,
    val pattern: String? = null) : Statement()

@DefaultConstructor
data class StreamInsertStatement(
    val databaseName: String?,
    val tableName: String,
    var querySql: String? = null
) : Statement()

enum class InsertMode: Serializable {
    INTO, OVERWRITE
}

data class DeleteTable(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val where: String? = null) : Statement() {

    fun getFullTableName(): String {
        return innerFullTableName(catalogName, databaseName, tableName)
    }
}

data class UpdateTable(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val upset: Map<String, String>? = null,
    val where: String? = null) : Statement() {

    fun getFullTableName(): String {
        return innerFullTableName(catalogName, databaseName, tableName)
    }
}

data class MergeIntoTable(
    var sourceTables: java.util.HashSet<TableId> = HashSet(),
    var targetTable: TableSource
): Statement()

data class DropTablePartition(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    var ifExists: Boolean = false,
    var partitionSpecs: List<String>
): Statement() {

    fun getFullTableName(): String {
        return innerFullTableName(catalogName, databaseName, tableName)
    }
}

data class AddTablePartition(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    var ifNotExists: Boolean = false,
    var partitionSpecs: List<String>
): Statement() {

    fun getFullTableName(): String {
        return innerFullTableName(catalogName, databaseName, tableName)
    }
}

data class TouchTable(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    var partitionSpecs: List<String>
): Statement() {
    fun getFullTableName(): String {
        return innerFullTableName(catalogName, databaseName, tableName)
    }
}
