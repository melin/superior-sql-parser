package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.Statement

data class SQLFunction(
    val name: FunctionId,
    val exprText: String?,
    val queryText: String?,
    val comment: String?,
    val deterministic: Boolean?,
    val containsSQL: Boolean?,
    val isTableFunc: Boolean,
) : Statement() {

    override val statementType = StatementType.CREATE_FUNCTION
    override val privilegeType = PrivilegeType.FUNCTION
    override val sqlType = SqlType.DML
}
