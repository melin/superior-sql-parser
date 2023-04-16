package io.github.melin.superior.common.relational

import org.apache.commons.lang3.StringUtils

data class NamespaceId(
    val catalogName: String?,
    val schemaName: String) {
    constructor(schemaName: String): this(null, schemaName)

    fun getLowerCatalogName(): String {
        return StringUtils.lowerCase(catalogName)
    }

    fun getLowerSchemaName(): String {
        return StringUtils.lowerCase(schemaName)
    }

}