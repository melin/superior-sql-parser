package io.github.melin.superior.common.relational.drop

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.Statement

data class DropFunction(
    val functionId: FunctionId
) : Statement() {
    override val statementType = StatementType.DROP_FUNCTION
    override val privilegeType = PrivilegeType.DROP
    override val sqlType = SqlType.DDL
}
