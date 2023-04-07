package io.github.melin.superior.common.relational.namespace

import java.io.Serializable

enum class Namespace: Serializable {
    CATALOG,
    NAMESPACE,
    DATABASE,
    SCHEMA,
    UNKNOW
}