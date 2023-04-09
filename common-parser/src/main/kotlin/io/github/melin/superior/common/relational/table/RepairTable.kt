package io.github.melin.superior.common.relational.table

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

class RepairTable(
    val tableId: TableId
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.ADMIN
}