package io.github.melin.superior.common.relational

import org.apache.commons.lang3.StringUtils

data class SchemaId(val catalogName: String?, val schemaName: String) {

    companion object {
        @JvmStatic fun of(schemaName: String) = SchemaId(schemaName)

        @JvmStatic fun of(catalogName: String, schemaName: String) = SchemaId(catalogName, schemaName)
    }

    constructor(schemaName: String) : this(null, schemaName)

    fun getFullSchemaName(): String {
        if (catalogName != null) {
            return "${catalogName}.${schemaName}"
        }

        return schemaName
    }

    fun getLowerCatalogName(): String {
        return StringUtils.lowerCase(catalogName)
    }

    fun getLowerSchemaName(): String {
        return StringUtils.lowerCase(schemaName)
    }
}
