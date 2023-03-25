package io.github.melin.superior.common

data class TableName(val catalogName: String?, val databaseName: String?, val tableName: String, val metaType: String?) {
    constructor(catalogName: String?, databaseName: String?, tableName: String):
            this(catalogName, databaseName, tableName, null)

    constructor(databaseName: String?, tableName: String):
            this(null, databaseName, tableName, null)

    constructor(tableName: String):
            this(null, null, tableName, null)

    fun getFullTableName(): String {
        if (catalogName != null) {
            return "${catalogName}.${databaseName}.${tableName}"
        }

        if (databaseName != null) {
            return "${databaseName}.${tableName}"
        }

        return tableName
    }
}