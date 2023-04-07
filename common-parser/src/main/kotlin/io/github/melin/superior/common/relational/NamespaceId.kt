package io.github.melin.superior.common.relational

data class NamespaceId(
    val catalogName: String?,
    val schemaName: String) {
    constructor(schemaName: String): this(null, schemaName)
}