package io.github.melin.superior.parser.starrocks.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class DropTask(
    val taskName: String
) : Statement() {
    override val statementType = StatementType.DROP_TASK
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML
}