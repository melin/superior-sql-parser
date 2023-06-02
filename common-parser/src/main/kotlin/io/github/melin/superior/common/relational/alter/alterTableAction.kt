package io.github.melin.superior.common.relational.alter

import io.github.melin.superior.common.relational.SortType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.table.ColumnRel

data class AlterTableAction(
    var newTableId: TableId? = null, // 修改表，新列名称
): AlterAction() {
    var location: String? = null
    var properties: Map<String, String>? = null
}

data class AlterTouchPartitionAction(
    var newTableId: TableId, // 修改表，新列名称
    var partitionVals: LinkedHashMap<String, String>?
): AlterAction()

data class AlterViewAction(
    var querySql: String, // 修改表，新列名称
    var inputTables: List<TableId>,
    var functionNames: HashSet<String>
): AlterAction()

data class AlterColumnAction(
    var columName: String? = null, // 修改列名
    var dataType: String? = null,
    var comment: String? = null,
    var position: String? = null,
    var afterCol: String? = null,
    var setOrDrop: String? = null,
    var nullable: Boolean = true,
    var defaultExpression: String? = null,
    var dropDefault: Boolean = false,
): AlterAction() {
    var newColumName: String? = null // 修改列名，新列名称

    fun getColumn(): ColumnRel? {
        return if (columName != null) {
            ColumnRel(columName!!, dataType, comment, nullable, defaultExpression)
        } else {
            null
        }
    }
}

data class DropColumnAction(
    var columNames: ArrayList<String> = arrayListOf()
): AlterAction() {
    fun firstColumn(): String {
        return columNames.first()
    }

    constructor(columName: String): this(arrayListOf(columName))
}

data class AddPartitionAction(
    var ifNotExists: Boolean = false,
    var partitions: List<LinkedHashMap<String, String>>
): AlterAction()

data class DropPartitionAction(
    var ifExists: Boolean = false,
    var partitions: List<LinkedHashMap<String, String>>
): AlterAction()

data class RenamePartitionAction(
    var fromPartitionVals: LinkedHashMap<String, String>,
    var toPartitionVals: LinkedHashMap<String, String>
): AlterAction()

data class CreateIndex(
    val indexName: String,
    val indexColumnNames: ArrayList<IndexColumnName> = arrayListOf()
): AlterAction() {
    var intimeAction: String = "ONLINE" //mysql ONLINE & OFFLINE
    var indexCategory: String? = null
    var indexType: String? = null
    var comment: String? = null
}

data class IndexColumnName(
    val columnName: String,
    val sortType: SortType = SortType.UNKOWN,
)

data class DropIndex(
    val indexName: String,
    var ifExists: Boolean = false
): AlterAction()