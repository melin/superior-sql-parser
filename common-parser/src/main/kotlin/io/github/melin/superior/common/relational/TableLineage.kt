package io.github.melin.superior.common.relational

import io.github.melin.superior.common.relational.DefaultConstructor
import io.github.melin.superior.common.relational.InsertMode
import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement

@DefaultConstructor
data class TableLineage(
    var inputTables: java.util.ArrayList<TableId> = ArrayList(),
    var outpuTables: java.util.ArrayList<TableId> = ArrayList(),
    var limit: Int? = null,
    var insertMode: InsertMode? = null,
    var partitions: HashMap<String, String>? = null
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.READ

    val cteTempTables: ArrayList<String> = ArrayList()
    val functionNames: HashSet<String> = HashSet()
}