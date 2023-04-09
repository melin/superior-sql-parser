package io.github.melin.superior.common.relational.view

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.Statement

data class DropView(
    val catalogName: String?,
    val schemaName: String?,
    val tableName: String,
    var ifExists: Boolean = false
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.DROP
}