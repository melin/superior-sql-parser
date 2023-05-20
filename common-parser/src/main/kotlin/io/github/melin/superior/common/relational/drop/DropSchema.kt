package io.github.melin.superior.common.relational.drop

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

class DropSchema(
    val databaseName: String?,
    val schemaName: String,
): Statement() {
    override val statementType = StatementType.DROP_SCHEMA
    override val privilegeType = PrivilegeType.DROP
    override val sqlType = SqlType.DDL

    constructor(schemaName: String): this(null, schemaName)
}