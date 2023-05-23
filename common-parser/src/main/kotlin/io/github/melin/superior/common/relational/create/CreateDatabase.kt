package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

class CreateDatabase(
    val catalogName: String?,
    val databaseName: String,
    val location: String? = null,
    var properties: Map<String, String>? = null,
    var ifNotExists: Boolean = false,
): Statement() {
    override val statementType = StatementType.CREATE_DATABASE
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DDL

    constructor(databaseName: String): this(null, databaseName, null, null)

    constructor(catalogName: String?, databaseName: String, properties: Map<String, String>? = null, ifNotExists: Boolean = false):
            this(catalogName, databaseName, null, properties, ifNotExists)
}