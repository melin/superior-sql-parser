package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class ExportData(
    val tableId: TableId,
    val cte: Boolean = false,
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.READ

    lateinit var inputTables: ArrayList<TableId>
    lateinit var cteTempTables: List<String>
    lateinit var functionNames: HashSet<String>
}