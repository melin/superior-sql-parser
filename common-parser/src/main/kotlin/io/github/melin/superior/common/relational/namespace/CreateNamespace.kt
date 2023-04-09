package io.github.melin.superior.common.relational.namespace

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.NamespaceId

class CreateNamespace(
    val namespaceId: NamespaceId,
    val namespace: Namespace,
    val location: String? = null
): Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.CREATE

    constructor(name: String): this(NamespaceId(name), Namespace.DATABASE)
    constructor(name: String, namespace: Namespace,): this(NamespaceId(name), namespace)
}