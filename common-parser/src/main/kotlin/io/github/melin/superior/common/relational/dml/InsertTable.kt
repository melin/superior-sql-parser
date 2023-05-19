package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.AbsTableStatement
import io.github.melin.superior.common.relational.TableId

data class InsertTable(
    val mode: InsertMode,
    override val tableId: TableId
): AbsTableStatement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
    override val sqlType: SqlType = SqlType.DML

    val inputTables: ArrayList<TableId> = arrayListOf()
    val outputTables: ArrayList<TableId> = arrayListOf()
    val functionNames: HashSet<String> = hashSetOf()

    var properties: Map<String, String>? = null
    var fileFormat: String? = null
    var partitionVals: LinkedHashMap<String, String>? = null
    var querySql: String? = null
    var rows: ArrayList<List<String>>? = null

    var mysqlReplace: Boolean = false
}