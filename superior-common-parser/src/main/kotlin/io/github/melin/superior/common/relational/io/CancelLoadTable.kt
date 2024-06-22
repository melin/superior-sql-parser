package io.github.melin.superior.common.relational.io

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class CancelLoadTable(
    val schemaName: String?,
    val labelName: String,
) : Statement() {
    override val statementType = StatementType.CANCEL_LOAD_TABLE
    override val privilegeType = PrivilegeType.DROP
    override val sqlType = SqlType.DML
}
