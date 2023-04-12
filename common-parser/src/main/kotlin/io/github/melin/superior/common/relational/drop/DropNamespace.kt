package io.github.melin.superior.common.relational.drop

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.NamespaceId
import io.github.melin.superior.common.relational.namespace.Namespace

class DropNamespace(
    val namespaceId: NamespaceId,
    val namespace: Namespace,
): Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.DROP

    constructor(name: String): this(NamespaceId(name), Namespace.DATABASE)
    constructor(name: String, namespace: Namespace,): this(NamespaceId(name), namespace)
}