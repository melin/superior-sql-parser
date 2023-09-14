package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class SyncSchemaExpr(
    val sourceCatalogName: String?,
    val sourceDatabaseName: String,
    val owner: String?
) : Statement() {
    override val statementType = StatementType.SYNC
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DDL
}