package io.github.melin.superior.common.relational.drop

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.AbsTableStatement
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class DropView(
    override val tableId: TableId,
    var ifExists: Boolean = false,
    var isMaterialized: Boolean = false,
) : AbsTableStatement() {
    override val privilegeType: PrivilegeType = PrivilegeType.DROP
    override val sqlType: SqlType = SqlType.DDL

    val tableIds: ArrayList<TableId> = arrayListOf()
}