package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.Statement

class CreateDatabase(
    val catalogName: String?,
    val databaseName: String,
    val location: String? = null,
    var properties: Map<String, String>? = null,
): Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.CREATE
    override val sqlType: SqlType = SqlType.DDL

    constructor(databaseName: String): this(null, databaseName, null, null)

    constructor(catalogName: String?, databaseName: String, properties: Map<String, String>? = null):
            this(catalogName, databaseName, null, properties)
}