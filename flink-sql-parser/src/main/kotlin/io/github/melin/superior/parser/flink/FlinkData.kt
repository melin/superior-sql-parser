package io.github.melin.superior.parser.flink

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.NamespaceId
import io.github.melin.superior.common.relational.TableId

@DefaultConstructor
data class FlinkCdcCreateTable(
    var sinkTableId: TableId,
    var sourceTableId: TableId,
): Statement() {
    var sinkOptions: HashMap<String, String>? = null
    var sourceOptions: HashMap<String, String>? = null
    var computeCols: List<Column>? = null
}

@DefaultConstructor
data class FlinkCdcCreateDatabase(
    var sinkNamespaceId: NamespaceId,
    var sourceNamespaceId: NamespaceId,
    var includeTable: String
): Statement() {
    var sinkOptions: HashMap<String, String>? = null
    var sourceOptions: HashMap<String, String>? = null
    var excludeTable: String? = null
}