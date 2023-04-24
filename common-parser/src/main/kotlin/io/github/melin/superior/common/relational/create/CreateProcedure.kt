package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.ProcedureId
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class CreateProcedure(
    val procedureId: ProcedureId?,
    var replace: Boolean = false,
    var temporary: Boolean = false,
    val className: String? = null,
    val file: String? = null
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.CREATE
    override val sqlType: SqlType = SqlType.DDL

    var inputTables: List<TableId> = listOf()
    var outputTables: List<TableId> = listOf()

    constructor(procedureId: ProcedureId, replace: Boolean) : this(procedureId, replace, false)

    constructor() : this(null)
}