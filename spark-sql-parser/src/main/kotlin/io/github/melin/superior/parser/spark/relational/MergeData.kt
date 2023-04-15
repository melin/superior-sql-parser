package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class MergeData(
    val tableId: TableId,
    val partitionVals: List<String>?
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
}