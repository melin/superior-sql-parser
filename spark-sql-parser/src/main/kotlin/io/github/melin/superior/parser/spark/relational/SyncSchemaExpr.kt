package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.Statement

data class SyncSchemaExpr(
    val targetCatalogName: String?,
    val targetDatabaseName: String,
    val sourceCatalogName: String?,
    val sourceDatabaseName: String,
    val owner: String?
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
    override val sqlType: SqlType = SqlType.DDL
}