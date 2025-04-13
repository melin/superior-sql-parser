package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.Statement

data class CreateFunction(
    val functionId: FunctionId,
    val childStatements: ArrayList<Statement>,
    var replace: Boolean = false,
    var temporary: Boolean = false,
    val className: String? = null,
    val file: String? = null,
) : Statement() {
    override val statementType = StatementType.CREATE_FUNCTION
    override val privilegeType = PrivilegeType.FUNCTION
    override val sqlType = SqlType.DML

    var global: Boolean = false // starrocks
    var properties: Map<String, String>? = null // starrocks
    var argumentTypes: List<String>? = null // starrocks
    var returnType: String? = null // starrocks

    constructor(
        functionId: FunctionId,
        childStatements: ArrayList<Statement>,
        replace: Boolean,
    ) : this(functionId, childStatements, replace, false)

    constructor(
        functionId: FunctionId,
        childStatements: ArrayList<Statement>,
    ) : this(functionId, childStatements, false, false)
}
