package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class DeleteTable(
    val tableId: TableId,
    val where: String? = null
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
}