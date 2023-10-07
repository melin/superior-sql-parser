package io.github.melin.superior.common.relational.common

import com.google.common.collect.Sets
import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.ProcedureId
import io.github.melin.superior.common.relational.Statement

data class CallProcedure(
        var procedureIds: HashSet<ProcedureId>,
        var properties: Map<String, String> = mapOf()
) : Statement() {
    override val statementType = StatementType.CALL
    override val privilegeType = PrivilegeType.ADMIN
    override val sqlType = SqlType.DML

    constructor(procedureId: ProcedureId): this(Sets.newHashSet(procedureId))

    constructor(procedureId: ProcedureId, properties: Map<String, String>): this(Sets.newHashSet(procedureId), properties)
}