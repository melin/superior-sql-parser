package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class RefreshData(
    val tableId: TableId
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
}