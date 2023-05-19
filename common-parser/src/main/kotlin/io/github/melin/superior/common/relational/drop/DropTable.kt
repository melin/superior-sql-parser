package io.github.melin.superior.common.relational.drop

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class DropTable(
    override val tableId: TableId? = null,
    var ifExists: Boolean = false
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.DROP
    override val sqlType: SqlType = SqlType.DDL

    val tableIds: ArrayList<TableId> = arrayListOf()
    var force: Boolean = false

    init {
        if (tableId != null) {
            tableIds.add(tableId)
        }
    }

    fun getFirstTableId(): TableId {
        return if (tableId != null) {
            tableId
        } else {
            tableIds.first()
        }
    }
}