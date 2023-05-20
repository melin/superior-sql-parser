package io.github.melin.superior.common.relational.drop

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

class DropDatabase(
    val catalogName: String?,
    val databaseName: String
): Statement() {
    override val statementType = StatementType.DROP_DATABASE
    override val privilegeType = PrivilegeType.DROP
    override val sqlType = SqlType.DDL

    constructor(databaseName: String): this(null, databaseName)
}