package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.NamespaceId
import io.github.melin.superior.common.relational.Statement

data class SyncSchemaExpr(
    val targetNamespaceId: NamespaceId,
    val sourceNamespaceId: NamespaceId,
    val owner: String?
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
}