package io.github.melin.superior.parser.starrocks.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class CreateRoutineLoad(
    val catalogName: String?,
    val schemaName: String?,
    val jobName: String,
    val tableId: TableId,
    val loadPropertiesExpr: String,
    val jobProperties: Map<String, String>?,
    val source: String,
    val sourceProperties: Map<String, String>?
) : Statement() {
    override val statementType = StatementType.SR_CREATE_ROUTINE_LOAD
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DML
}