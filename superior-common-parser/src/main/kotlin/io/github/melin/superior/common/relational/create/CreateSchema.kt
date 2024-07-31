package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

class CreateSchema(val databaseName: String?, val schemaName: String) : Statement() {
    override val statementType = StatementType.CREATE_SCHEMA
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DDL

    constructor(schemaName: String) : this(null, schemaName)
}
