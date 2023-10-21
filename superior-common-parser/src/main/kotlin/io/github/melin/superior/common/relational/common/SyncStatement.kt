package io.github.melin.superior.common.relational.common

import com.google.common.collect.Maps
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

    val sinkOptions: HashMap<String, String> = Maps.newHashMap();
    val sourceOptions: HashMap<String, String> = Maps.newHashMap();
    var computeCols: List<ColumnRel>? = null
}

data class SyncDatabase(
    var sinkCatalogName: String?,
    var sinkDatabaseName: String,
    var sourceCatalogName: String?,
    var sourceDatabaseName: String,
    var includingTables: String = ".*"
): Statement() {
    override val statementType = StatementType.SYNC_DATABASE
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DML

    val sinkOptions: HashMap<String, String> = Maps.newHashMap();
    val sourceOptions: HashMap<String, String> = Maps.newHashMap();
    var excludingTables: String? = null
}

data class SyncDatabaseMetadata(
        val catalogName: String?,
        val databaseName: String,
        val owner: String?
) : Statement() {
    override val statementType = StatementType.SYNC_TABLE_META
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DDL
}

data class SyncTableMetadata(
        val tableId: TableId,
        val owner: String?
) : Statement() {
    override val statementType = StatementType.SYNC_TABLE_META
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DDL
}