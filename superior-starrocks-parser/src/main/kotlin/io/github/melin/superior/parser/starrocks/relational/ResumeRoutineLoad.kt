package io.github.melin.superior.parser.starrocks.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class ResumeRoutineLoad(
    val catalogName: String?,
    val schemaName: String?,
    val jobName: String
) : Statement() {
    override val statementType = StatementType.SR_RESUME_ROUTINE_LOAD
    override val privilegeType = PrivilegeType.ADMIN
    override val sqlType = SqlType.DML
}