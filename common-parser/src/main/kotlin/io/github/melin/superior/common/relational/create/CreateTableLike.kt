package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement

data class CreateTableLike(
    val oldDatabaseName: String?,
    val oldTableName: String,
    val newDatabaseName: String?,
    val newTableName: String,
    var ifNotExists: Boolean = false,
    var external: Boolean = false,
    var temporary: Boolean = false
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.CREATE
}