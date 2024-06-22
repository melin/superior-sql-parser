package io.github.melin.superior.common.relational.drop

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.ProcedureId
import io.github.melin.superior.common.relational.Statement

data class DropProcedure(val procedureId: ProcedureId) : Statement() {
    override val statementType = StatementType.DROP_PROCEDURE
    override val privilegeType = PrivilegeType.DROP
    override val sqlType = SqlType.DDL
}
