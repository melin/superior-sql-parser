package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.abs.AbsTableStatement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.table.ColumnRel

data class InsertTable(
    val mode: InsertMode,
    val queryStmt: QueryStmt,
    override val tableId: TableId,
    var columnRels: List<ColumnRel>? = null
): AbsTableStatement() {
    override val statementType = StatementType.INSERT
    override val privilegeType = PrivilegeType.WRITE
    override val sqlType = SqlType.DML

    var properties: Map<String, String>? = null
    var fileFormat: String? = null
    var partitionVals: LinkedHashMap<String, String>? = null
    var rows: ArrayList<List<String>>? = null
    val outputTables: ArrayList<TableId> = arrayListOf()

    var mysqlReplace: Boolean = false

    init {
        if (!outputTables.contains(tableId)) {
            outputTables.add(tableId)
        }
    }
}