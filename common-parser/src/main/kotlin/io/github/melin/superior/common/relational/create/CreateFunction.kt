package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement

data class CreateFunction(
    val schemaName: String?,
    val funcName: String,
    var temporary: Boolean = false,
    val className: String?,
    val file: String?
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.CREATE
}
