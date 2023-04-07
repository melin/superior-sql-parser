package io.github.melin.superior.common.relational.namespace

import io.github.melin.superior.common.Statement
import io.github.melin.superior.common.relational.NamespaceId

class CreateNamespace(
    val namespaceId: NamespaceId,
    val namespace: Namespace,
    val location: String? = null
): Statement() {
    constructor(name: String): this(NamespaceId(name), Namespace.DATABASE)
    constructor(name: String, namespace: Namespace,): this(NamespaceId(name), namespace)
}