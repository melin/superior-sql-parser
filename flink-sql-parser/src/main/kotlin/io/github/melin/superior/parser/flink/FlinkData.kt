package io.github.melin.superior.parser.flink

import io.github.melin.superior.common.*

@DefaultConstructor
data class FlinkCdcCreateTable(
    var sinkTableName: TableName,
    var sourceTableName: TableName,
): Statement() {
    var sinkOptions: HashMap<String, String>? = null
    var sourceOptions: HashMap<String, String>? = null
    var computeCols: List<Column>? = null
}

@DefaultConstructor
data class FlinkCdcCreateDatabase(
    var sinkDatabaseName: DatabaseName,
    var sourceDatabaseName: DatabaseName,
    var includeTable: String
): Statement() {
    var sinkOptions: HashMap<String, String>? = null
    var sourceOptions: HashMap<String, String>? = null
    var excludeTable: String? = null
}