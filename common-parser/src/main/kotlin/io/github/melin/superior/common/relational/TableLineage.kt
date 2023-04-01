package io.github.melin.superior.common.relational

import io.github.melin.superior.common.DefaultConstructor
import io.github.melin.superior.common.InsertMode
import io.github.melin.superior.common.Statement

@DefaultConstructor
data class TableLineage(
    var inputTables: java.util.ArrayList<TableId> = ArrayList(),
    var outpuTables: java.util.ArrayList<TableId> = ArrayList(),
    var limit: Int? = null,
    var insertMode: InsertMode? = null,
    var partitions: HashMap<String, String>? = null
): Statement() {
    val cteTempTables: ArrayList<String> = ArrayList()
    val functionNames: HashSet<String> = HashSet()
}