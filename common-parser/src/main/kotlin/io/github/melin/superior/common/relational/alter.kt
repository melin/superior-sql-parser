package io.github.melin.superior.common.relational

import io.github.melin.superior.common.AlterType
import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.TableType
import java.util.ArrayList

data class AlterTable(
    val alterType: AlterType,
    val tableId: TableId,
    private val action: AlterAction?,
    val tableType: TableType = TableType.TABLE,
): Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.ALTER
    val actions: ArrayList<AlterAction> = ArrayList()

    init {
        if (action != null) {
            actions.add(action)
        }
    }

    constructor(alterType: AlterType, tableId: TableId): this(alterType, tableId, null)

    fun addActions(list: List<AlterAction>) {
        actions.addAll(list)
    }

    fun firstAction(): AlterAction {
        return actions.first()
    }
}

abstract class AlterAction(val privilegeType: PrivilegeType = PrivilegeType.ALTER)

data class AlterTableAction(
    var newTableName: String? = null, // 修改表，新列名称
): AlterAction() {
    var location: String? = null
    var properties: Map<String, String>? = null
    var partitions: List<String>? = null //spark touch
}

data class AlterViewAction(
    var querySql: String, // 修改表，新列名称
    var inputTables: List<TableId> = listOf(),
): AlterAction()

data class AlterColumnAction(
    var columName: String? = null, // 修改列名
    var dataType: String? = null,
    var comment: String? = null,
    var position: String? = null,
    var afterCol: String? = null,
    var setOrDrop: String? = null,
    var defaultExpression: String? = null,
    var dropDefault: Boolean = false,
): AlterAction() {
    var newColumName: String? = null // 修改列名，新列名称
}

data class DropColumnAction(
    var columNames: List<String> = listOf()
): AlterAction()

data class AddPartitionAction(
    var ifNotExists: Boolean = false,
    var partitions: List<List<String>>
): AlterAction()

data class DropPartitionAction(
    var ifExists: Boolean = false,
    var partitions: List<List<String>>
): AlterAction()

data class RenamePartitionAction(
    var fromPartitionVals: List<String>,
    var toPartitionVals: List<String>
): AlterAction()