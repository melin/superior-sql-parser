package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.abs.AbsTableStatement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.table.ColumnRel

data class InsertTable(
    val mode: InsertMode,
    override val tableId: TableId,
    var columnRels: List<ColumnRel>? = null
): AbsTableStatement() {
    override val statementType = StatementType.INSERT
    override val privilegeType = PrivilegeType.WRITE
    override val sqlType = SqlType.DML

    val inputTables: ArrayList<TableId> = arrayListOf()
    val outputTables: ArrayList<TableId> = arrayListOf()
    val functionNames: HashSet<FunctionId> = hashSetOf()

    var properties: Map<String, String>? = null
    var fileFormat: String? = null
    var partitionVals: LinkedHashMap<String, String>? = null
    var querySql: String? = null
    var rows: ArrayList<List<String>>? = null

    var mysqlReplace: Boolean = false
}