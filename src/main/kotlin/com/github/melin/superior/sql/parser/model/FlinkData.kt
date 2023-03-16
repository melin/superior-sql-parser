package com.github.melin.superior.sql.parser.model

@DefaultConstructor
data class CreateTable(
    var sinkTableName: TableName,
    var sourceTableName: TableName,
): Statement() {
    var sinkOptions: HashMap<String, String>? = null
    var sourceOptions: HashMap<String, String>? = null
    var computeCols: List<Column>? = null
}

@DefaultConstructor
data class CreateDatabase(
    var sinkDatabaseName: DatabaseName,
    var sourceDatabaseName: DatabaseName,
    var include: String
): Statement() {
    var sinkOptions: HashMap<String, String>? = null
    var sourceOptions: HashMap<String, String>? = null
    var computeCols: List<Column>? = null
    var exclude: String? = null
}