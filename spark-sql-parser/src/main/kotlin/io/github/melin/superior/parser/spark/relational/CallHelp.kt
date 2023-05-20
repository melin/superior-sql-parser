package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class CallHelp(
    val procedureName: String?
) : Statement() {
    override val statementType = StatementType.CALL_HELP
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML
}