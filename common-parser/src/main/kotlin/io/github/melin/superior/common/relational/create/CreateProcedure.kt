package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.dml.QueryStmt

data class CreateProcedure(
    val procedureName: String? = null
): Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.PROCEDURE

    lateinit var queryStmts: ArrayList<QueryStmt>
}