package io.github.melin.superior.common.relational.table

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class DropTable(
    val tableId: TableId,
    var ifExists: Boolean = false
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.DROP
}