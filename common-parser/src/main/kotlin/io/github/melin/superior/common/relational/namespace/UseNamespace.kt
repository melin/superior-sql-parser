package io.github.melin.superior.common.relational.namespace

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.NamespaceId

class UseNamespace(
    val namespaceId: NamespaceId,
    val namespace: Namespace = Namespace.UNKNOW
): Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.READ
    override val sqlType: SqlType = SqlType.TCL

    constructor(name: String): this(NamespaceId(name), Namespace.DATABASE)
    constructor(name: String, namespace: Namespace,): this(NamespaceId(name), namespace)
}