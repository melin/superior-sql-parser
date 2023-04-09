package io.github.melin.superior.common.relational.function

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.Statement

data class DropFunction(
    val schemaName: String?,
    val funcName: String
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.DROP
}
