package io.github.melin.superior.common.relational

import io.github.melin.superior.common.Statement

data class ShowColumns(
    val tableId: TableId
) : Statement()

data class ShowCreateTable(
    val tableId: TableId
) : Statement()

data class ShowDatabases(
    val namespaceId: NamespaceId
) : Statement()

data class ShowFunctions(
    val functionId: FunctionId
) : Statement()

data class ShowPartitions(
    val tableId: TableId
) : Statement()

data class ShowTableExtended(
    val tableId: TableId
) : Statement()

data class ShowTables(
    var namespaceId: NamespaceId? = null
) : Statement()

data class ShowViews(
    var namespaceId: NamespaceId? = null
) : Statement()

data class ShowTblProperties(
    val tableId: TableId
) : Statement()
