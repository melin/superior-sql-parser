package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class SetStatement(val key: String, val value: String? = null) : Statement() {
    override val statementType = StatementType.SET
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.TCL
}
