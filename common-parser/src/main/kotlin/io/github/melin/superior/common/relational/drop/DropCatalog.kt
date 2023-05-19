package io.github.melin.superior.common.relational.drop

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.Statement

class DropCatalog(
    val catalogName: String
): Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.DROP
    override val sqlType: SqlType = SqlType.DDL
}