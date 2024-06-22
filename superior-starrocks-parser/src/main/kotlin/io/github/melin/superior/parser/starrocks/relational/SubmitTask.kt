package io.github.melin.superior.parser.starrocks.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class SubmitTask(val taskName: String?, val taskExecSql: String) :
    Statement() {
    override val statementType = StatementType.SR_SUBMIT_TASK
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML
}
