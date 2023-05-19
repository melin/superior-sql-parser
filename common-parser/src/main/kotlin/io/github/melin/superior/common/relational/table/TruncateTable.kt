package io.github.melin.superior.common.relational.table

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.AbsTableStatement
import io.github.melin.superior.common.relational.TableId

class TruncateTable(
    override val tableId: TableId
) : AbsTableStatement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
    override val sqlType: SqlType = SqlType.DDL
}