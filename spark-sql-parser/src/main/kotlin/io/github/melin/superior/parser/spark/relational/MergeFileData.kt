package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.AbsTableStatement
import io.github.melin.superior.common.relational.TableId

data class MergeFileData(
    override val tableId: TableId,
    var properties: Map<String, String>,
    var partitionVals: LinkedHashMap<String, String>
) : AbsTableStatement() {
    override val statementType = StatementType.MERGE_FILE
    override val privilegeType = PrivilegeType.WRITE
    override val sqlType = SqlType.DML
}