package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class CancelExport(
    val database: String?,
    var queryId: String
) : Statement() {
    override val statementType = StatementType.CANCEL_EXPORT
    override val privilegeType = PrivilegeType.ALTER
    override val sqlType = SqlType.DML

    constructor(queryId: String): this(null, queryId)
}