package io.github.melin.superior.common.relational

import org.apache.commons.lang3.StringUtils

data class TableId(val catalogName: String?, val schemaName: String?, val tableName: String, val metaType: String?) {

    companion object {
        @JvmStatic fun of(tableName: String) = TableId(tableName)

        @JvmStatic fun of(schemaName: String, tableName: String) = TableId(schemaName, tableName)

        @JvmStatic
        fun of(catalogName: String, schemaName: String, tableName: String) = TableId(catalogName, schemaName, tableName)
    }

    constructor(
        catalogName: String?,
        schemaName: String?,
        tableName: String,
    ) : this(catalogName, schemaName, tableName, null)

    constructor(schemaName: String?, tableName: String) : this(null, schemaName, tableName, null)

    constructor(tableName: String) : this(null, null, tableName, null)

    fun getFullTableName(): String {
        if (catalogName != null) {
            return "${catalogName}.${schemaName}.${tableName}"
        }

        if (schemaName != null) {
            return "${schemaName}.${tableName}"
        }

        return tableName
    }

    fun getLowerCatalogName(): String {
        return StringUtils.lowerCase(catalogName)
    }

    fun getLowerSchemaName(): String {
        return StringUtils.lowerCase(schemaName)
    }

    fun getLowerTableName(): String {
        return StringUtils.lowerCase(tableName)
    }
}
