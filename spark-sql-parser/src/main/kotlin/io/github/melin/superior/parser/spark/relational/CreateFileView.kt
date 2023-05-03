package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class CreateFileView(
    override val tableId: TableId,
    val pattern: Boolean = false,
    val path: String,
    val fileFormat: String? = null,
    val compression: String? = null
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
    override val sqlType: SqlType = SqlType.DML
}