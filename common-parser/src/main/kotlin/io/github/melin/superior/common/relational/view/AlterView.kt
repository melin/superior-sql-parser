package io.github.melin.superior.common.relational.view

import io.github.melin.superior.common.Statement

data class AlterView(
    val catalogName: String?,
    val schemaName: String?,
    val tableName: String,
    var querySql: String?
) : Statement()