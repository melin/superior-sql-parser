package io.github.melin.superior.common.relational.ddl.view

import io.github.melin.superior.common.Statement

data class DropView(
    val catalogName: String?,
    val schemaName: String?,
    val tableName: String,
    var ifExists: Boolean = false) : Statement()