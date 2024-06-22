package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class CreateFunction(
    val functionId: FunctionId,
    var replace: Boolean = false,
    var temporary: Boolean = false,
    val className: String? = null,
    val file: String? = null
) : Statement() {
    override val statementType = StatementType.CREATE_FUNCTION
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DDL

    var global: Boolean = false // starrocks
    var properties: Map<String, String>? = null // starrocks
    var argumentTypes: List<String>? = null // starrocks
    var returnType: String? = null // starrocks
    var inputTables: List<TableId> = listOf()

    constructor(
        functionId: FunctionId,
        replace: Boolean
    ) : this(functionId, replace, false)

    constructor(functionId: FunctionId) : this(functionId, false, false)
}
