package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.abs.AbsTableStatement
import io.github.melin.superior.common.relational.dml.InsertMode

data class LoadData(
    override val tableId: TableId,
    val inPath: String,
    val local: Boolean,
    var partitionVals: LinkedHashMap<String, String>,
    val mode: InsertMode = InsertMode.INTO
) : AbsTableStatement() {
    override val statementType = StatementType.LOAD_DATA
    override val privilegeType = PrivilegeType.WRITE
    override val sqlType = SqlType.DML
}
