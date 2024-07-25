package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.ProcedureId
import io.github.melin.superior.common.relational.Statement

data class CreateProcedure(
    val procedureId: ProcedureId?,
    var replace: Boolean = false,
    var temporary: Boolean = false,
    val className: String? = null,
    val file: String? = null
) : Statement() {
    override val statementType = StatementType.CREATE_PROCEDURE
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DML

    var childStatements: ArrayList<Statement> = arrayListOf()

    constructor(
        procedureId: ProcedureId,
        replace: Boolean
    ) : this(procedureId, replace, false)

    constructor() : this(null)
}
