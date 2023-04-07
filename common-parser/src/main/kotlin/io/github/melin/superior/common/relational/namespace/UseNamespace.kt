package io.github.melin.superior.common.relational.namespace

import io.github.melin.superior.common.Statement
import io.github.melin.superior.common.relational.NamespaceId

class UseNamespace(
    val namespaceId: NamespaceId,
    val namespace: Namespace = Namespace.UNKNOW
): Statement() {
    constructor(name: String): this(NamespaceId(name), Namespace.DATABASE)
    constructor(name: String, namespace: Namespace,): this(NamespaceId(name), namespace)
}