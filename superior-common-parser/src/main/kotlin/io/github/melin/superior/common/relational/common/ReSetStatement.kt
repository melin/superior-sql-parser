package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class ReSetStatement(
    val key: String
) : Statement() {
    override val statementType = StatementType.RESET
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.TCL
}