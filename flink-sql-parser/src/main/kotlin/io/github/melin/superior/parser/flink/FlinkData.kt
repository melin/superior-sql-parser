package io.github.melin.superior.parser.flink

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.DefaultConstructor
import io.github.melin.superior.common.relational.NamespaceId
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.table.Column

@DefaultConstructor
data class FlinkCdcCreateTable(
    var sinkTableId: TableId,
    var sourceTableId: TableId,
): Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.CREATE
    override val sqlType: SqlType = SqlType.DML

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
    override val privilegeType: PrivilegeType = PrivilegeType.CREATE
    override val sqlType: SqlType = SqlType.DML

    var sinkOptions: HashMap<String, String>? = null
    var sourceOptions: HashMap<String, String>? = null
    var excludeTable: String? = null
}