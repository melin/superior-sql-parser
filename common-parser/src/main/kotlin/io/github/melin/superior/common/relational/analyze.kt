package io.github.melin.superior.common.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType

data class AnalyzeTable (
    val tableIds: List<TableId>
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.READ
    override val sqlType: SqlType = SqlType.DML
}

data class AnalyzeSchema (
    val namespaceId: NamespaceId
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.READ
    override val sqlType: SqlType = SqlType.DML
}