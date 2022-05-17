package com.github.melin.superior.sql.parser.model

/**
 * Created by libinsong on 2017/4/4.
 */

data class ClickHouseTable(
        val databaseName: String?,
        val tableName: String,
        val cluster: String?,
        val engine: String,
        var columnDeclarations: String,
        var orderExpr: String,
        var primaryExpr: String?,
        var partitionExpr: String?,
        var tableTtlExpr: String?,
        var settingsExpr: String?,
        var comment: String? = null) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class ClickHouseTableAsSelect(
        val databaseName: String?,
        val tableName: String,
        val cluster: String?,
        val engine: String?,
        var orderExpr: String?,
        var primaryExpr: String?,
        var partitionExpr: String?,
        var tableTtlExpr: String?,
        var settingsExpr: String?,
        var querySelect: String,
        var inputTables: java.util.HashSet<TableSource> = HashSet()) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class ClickHouseTableAsLike(
        val databaseName: String?,
        val tableName: String,
        val cluster: String?,
        val engine: String?,
        var orderExpr: String?,
        var primaryExpr: String?,
        var partitionExpr: String?,
        var tableTtlExpr: String?,
        var settingsExpr: String?,
        val srcDatabaseName: String?,
        val srcTableName: String) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

@DefaultConstructor
data class ClickHouseSelectQuery(
        var tables: java.util.HashSet<TableSource> = HashSet(),
        var limit: Int? = null
): Statement()
