package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.ProcedureId
import io.github.melin.superior.common.relational.Statement

data class CallProcedure(
    var procedureNames: HashSet<ProcedureId>,
    var properties: Map<String, String> = mapOf()
) : Statement() {
    override val statementType = StatementType.CALL
    override val privilegeType = PrivilegeType.ADMIN
    override val sqlType = SqlType.DML
}