package io.github.melin.superior.common.relational

import io.github.melin.superior.common.DefaultConstructor
import io.github.melin.superior.common.Statement

@DefaultConstructor
data class SchemaDescriptor(
    val catalogName: String?,
    val schemaName: String,
    val location: String?): Statement(){
    constructor(catalogName: String?, databaseName: String): this(catalogName, databaseName, null)

    constructor(databaseName: String): this(null, databaseName, null)
}
