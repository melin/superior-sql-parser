package io.github.melin.superior.common.relational.table

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.abs.AbsTableStatement
import io.github.melin.superior.common.relational.TableId

class RepairTable(
    override val tableId: TableId
) : AbsTableStatement() {
    override val statementType = StatementType.REPAIR_TABLE
    override val privilegeType = PrivilegeType.ADMIN
    override val sqlType = SqlType.DDL
}