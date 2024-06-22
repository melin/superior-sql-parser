package io.github.melin.superior.common.relational.drop

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

class DropCatalog(val catalogName: String) : Statement() {
    override val statementType = StatementType.DROP_CATALOG
    override val privilegeType = PrivilegeType.ADMIN
    override val sqlType = SqlType.DDL
}
