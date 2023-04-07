package io.github.melin.superior.common.relational

import io.github.melin.superior.common.Statement

data class TableId(val catalogName: String?, val schemaName: String?, val tableName: String, val metaType: String?): Statement() {
    constructor(catalogName: String?, schemaName: String?, tableName: String):
            this(catalogName, schemaName, tableName, null)

    constructor(schemaName: String?, tableName: String):
            this(null, schemaName, tableName, null)

    constructor(tableName: String):
            this(null, null, tableName, null)

    fun getFullTableName(): String {
        if (catalogName != null) {
            return "${catalogName}.${schemaName}.${tableName}"
        }

        if (schemaName != null) {
            return "${schemaName}.${tableName}"
        }

        return tableName
    }
}