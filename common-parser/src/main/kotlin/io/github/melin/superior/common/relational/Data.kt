package io.github.melin.superior.common.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.StatementType
import java.io.Serializable

@Target(AnnotationTarget.CLASS)
annotation class DefaultConstructor

data class StatementData(
    val type: StatementType,
    val statement: Statement?,
    var querySql: String? = null,
    var values: ArrayList<List<String>>? = null
): Serializable {
    constructor(type: StatementType): this(type, null)
}

abstract class Statement: Serializable {
    abstract val privilegeType: PrivilegeType
}

data class MergeData(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val partitionVals: List<String>?
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
}

data class DataTunnelExpr(
    val srcType: String,
    var srcOptions: Map<String, String>,
    val transformSql: String?,
    val distType: String,
    var distOptions: Map<String, String>,
    var cte: Boolean = false
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER

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
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
}

data class SyncTableExpr(
    val targetCatalog: String?,
    val targetSchema: String?,
    val targetTable: String,
    val sourceCatalog: String?,
    val sourceSchema: String?,
    val sourceTable: String,
    val owner: String?
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
}

data class CallExpr(
    val catalogName: String?,
    val namespace: String?,
    val procedureName: String
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
}

data class LoadData(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val loadMode: String? = null,
    val resourceName: String? = null,
    val partitionVals: List<String>? = null
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
}

data class ExportData(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val cte: Boolean = false,
    var inputTables: java.util.ArrayList<TableId> = ArrayList(),
    var cteTempTables: ArrayList<String>? = null,
    var functionNames: HashSet<String>? = null
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.READ
}

data class RefreshData(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
}

data class SetData(
    val key: String,
    val value: String?
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
}

data class UnSetData(
    val key: String
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
}

@DefaultConstructor
data class StreamTable(
    var tableName: String,
    var columns: List<StreamColumn>,
    var properties: Map<String, String>
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
}

data class StreamColumn(
    val name: String,
    val type: String? = null,
    val comment: String? = null,
    val jsonPath: String? = null,
    val pattern: String? = null)

@DefaultConstructor
data class StreamInsertStatement(
    val databaseName: String?,
    val tableName: String,
    var querySql: String? = null
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
}

enum class InsertMode: Serializable {
    INTO, OVERWRITE
}

data class DeleteTable(
    val tableId: TableId,
    val where: String? = null
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
}

data class UpdateTable(
    val tableId: TableId,
    val upset: Map<String, String>? = null,
    val where: String? = null
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
}

data class MergeIntoTable(
    var sourceTables: java.util.HashSet<TableId> = HashSet(),
    var targetTable: TableId
): Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
}

