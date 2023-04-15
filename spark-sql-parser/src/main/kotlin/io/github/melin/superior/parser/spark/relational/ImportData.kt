package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class ImportData(
    val tableId: TableId,
    val loadMode: String? = null,
    val resourceName: String? = null,
    val partitionVals: List<String>? = null
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
}