package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.AbsTableStatement
import io.github.melin.superior.common.relational.TableId

data class DeleteTable(
    override val tableId: TableId,
    val inputTables: List<TableId>
) : AbsTableStatement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
    override val sqlType: SqlType = SqlType.DML

    val outputTables: ArrayList<TableId> = arrayListOf()
}
