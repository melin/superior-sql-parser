package io.github.melin.superior.common.relational.io

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class AlterLoadTable(
    val schemaName: String?,
    val labelName: String
) : Statement() {
    override val statementType = StatementType.ALTER_LOAD_TABLE
    override val privilegeType = PrivilegeType.ALTER
    override val sqlType = SqlType.DML
}