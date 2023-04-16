package io.github.melin.superior.common.relational.table

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

class RepairTable(
    override val tableId: TableId
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.ADMIN
    override val sqlType: SqlType = SqlType.DDL
}