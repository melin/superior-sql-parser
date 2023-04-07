package io.github.melin.superior.common.relational

import io.github.melin.superior.common.Statement

data class AnalyzeTable (
    val tableId: TableId
) : Statement()

data class AnalyzeSchema (
    val namespaceId: NamespaceId
) : Statement()