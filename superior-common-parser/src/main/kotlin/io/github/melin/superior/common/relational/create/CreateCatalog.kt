package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

class CreateCatalog(val catalogName: String, var properties: Map<String, String>? = null) : Statement() {
    override val statementType = StatementType.CREATE_CATALOG
    override val privilegeType = PrivilegeType.ADMIN
    override val sqlType = SqlType.DDL

    constructor(catalogName: String) : this(catalogName, null)
}
