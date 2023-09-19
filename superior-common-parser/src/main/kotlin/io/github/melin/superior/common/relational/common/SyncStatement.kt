package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.table.ColumnRel

data class SyncTable(
    var sinkTableId: TableId,
    var sourceTableId: TableId,
): Statement() {
    override val statementType = StatementType.SYNC_TABLE
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DML

    var sinkOptions: HashMap<String, String>? = null
    var sourceOptions: HashMap<String, String>? = null
    var computeCols: List<ColumnRel>? = null
}

data class SyncDatabase(
    var sinkCatalogName: String?,
    var sinkDatabaseName: String,
    var sourceCatalogName: String?,
    var sourceDatabaseName: String,
    var includeTable: String?
): Statement() {
    override val statementType = StatementType.SYNC_DATABASE
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DML

    var sinkOptions: HashMap<String, String>? = null
    var sourceOptions: HashMap<String, String>? = null
    var excludeTable: String? = null
}

data class SyncSchemaMetaData(
        val sourceCatalogName: String?,
        val sourceDatabaseName: String,
        val owner: String?
) : Statement() {
    override val statementType = StatementType.SYNC_TABLE_META
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DDL
}

data class SyncTableMetaData(
        val sourceTableId: TableId,
        val owner: String?
) : Statement() {
    override val statementType = StatementType.SYNC_TABLE_META
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DDL
}