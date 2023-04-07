package io.github.melin.superior.common.relational

import io.github.melin.superior.common.Statement

data class DescribeTable (
    val tableId: TableId
) : Statement()

data class DescribeFunction (
    val functionId: FunctionId
) : Statement()

data class DescribeQuery (
    val query: String
) : Statement()

data class QueryNameSpace (
    val query: String
) : Statement()