package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.abs.AbsTableStatement
import io.github.melin.superior.common.relational.TableId

data class DeleteTable(
    override val tableId: TableId,
    val inputTables: List<TableId>
) : AbsTableStatement() {
    override val statementType = StatementType.DELETE
    override val privilegeType = PrivilegeType.WRITE
    override val sqlType = SqlType.DML

    val outputTables: ArrayList<TableId> = arrayListOf()
}
