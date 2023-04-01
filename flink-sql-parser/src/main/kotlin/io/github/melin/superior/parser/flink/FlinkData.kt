package io.github.melin.superior.parser.flink

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.SchemaName
import io.github.melin.superior.common.relational.TableName

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
    var sinkSchemaName: SchemaName,
    var sourceSchemaName: SchemaName,
    var includeTable: String
): Statement() {
    var sinkOptions: HashMap<String, String>? = null
    var sourceOptions: HashMap<String, String>? = null
    var excludeTable: String? = null
}