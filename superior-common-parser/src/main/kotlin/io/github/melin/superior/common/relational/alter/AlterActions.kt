package io.github.melin.superior.common.relational.alter

import com.google.common.collect.Maps
import io.github.melin.superior.common.AlterActionType
import io.github.melin.superior.common.relational.SortType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.table.ColumnRel
import java.util.HashMap

data class AlterTableAction(override var alterType: AlterActionType) :
    AlterAction()

data class AlterPropsAction(
    var location: String? = null,
    var properties: HashMap<String, String> = Maps.newHashMap()
) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.SET_PROPS

    constructor(properties: HashMap<String, String>) : this(null, properties)
}

data class AlterSerDeAction(
    var properties: HashMap<String, String> = Maps.newHashMap()
) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.SET_SERDE
}

data class RenameAction(
    var newTableId: TableId,
    var ifExists: Boolean = false
) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.RENAME
}

data class AlterTouchPartitionAction(
    val newTableId: TableId, // 修改表，新列名称
    val partitionVals: LinkedHashMap<String, String>?
) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.TOUCH_TABLE
}

data class AlterViewAction(
    val queryStmt: QueryStmt // 修改表，新列名称
) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.ALTER_VIEW_QUERY
}

data class RefreshMvAction(var async: Boolean = false) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.REFRESH_MV
}

data class AlterColumnAction(
    override var alterType: AlterActionType,
    var columName: String? = null, // 修改列名
    var dataType: String? = null,
    var comment: String? = null,
    var position: String? = null,
    var afterCol: String? = null,
    var setOrDrop: String? = null,
    var nullable: Boolean = true,
    var defaultExpression: String? = null,
    var dropDefault: Boolean = false,
    var ifNotExists: Boolean = false
) : AlterAction() {
    var newColumName: String? = null // 修改列名，新列名称

    fun getColumn(): ColumnRel? {
        return if (columName != null) {
            ColumnRel(
                columName!!,
                dataType,
                comment,
                nullable,
                defaultExpression
            )
        } else {
            null
        }
    }
}

data class DropColumnAction(var columNames: ArrayList<String> = arrayListOf()) :
    AlterAction() {
    override var alterType: AlterActionType = AlterActionType.DROP_COLUMN

    fun firstColumn(): String {
        return columNames.first()
    }

    constructor(columName: String) : this(arrayListOf(columName))
}

data class AddPartitionAction(
    var ifNotExists: Boolean = false,
    var partitions: List<LinkedHashMap<String, String>>
) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.ADD_PARTITION
}

data class DropPartitionAction(
    var ifExists: Boolean = false,
    var partitions: List<LinkedHashMap<String, String>> = listOf()
) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.DROP_PARTITION
}

data class RenamePartitionAction(
    var fromPartitionVals: LinkedHashMap<String, String>,
    var toPartitionVals: LinkedHashMap<String, String>
) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.RENAME_PARTITION
}

data class CreateIndex(
    val indexName: String,
    val indexColumnNames: ArrayList<IndexColumnName> = arrayListOf()
) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.ADD_INDEX
    var intimeAction: String = "ONLINE" // mysql ONLINE & OFFLINE
    var indexCategory: String? = null
    var indexType: String? = null
    var comment: String? = null
}

data class IndexColumnName(
    val columnName: String,
    val sortType: SortType = SortType.UNKOWN,
)

data class DropIndex(val indexName: String, var ifExists: Boolean = false) :
    AlterAction() {
    override var alterType: AlterActionType = AlterActionType.DROP_INDEX
}
