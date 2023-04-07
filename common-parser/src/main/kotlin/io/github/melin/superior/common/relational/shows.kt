package io.github.melin.superior.common.relational

import io.github.melin.superior.common.Statement
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.SchemaId
import io.github.melin.superior.common.relational.TableId

data class ShowColumns(
    val tableId: TableId
) : Statement()

data class ShowCreateTable(
    val tableId: TableId
) : Statement()

data class ShowDatabases(
    val schemaId: SchemaId
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
    val schemaId: SchemaId
) : Statement()

data class ShowViews(
    val tableId: TableId
) : Statement()

data class ShowTblProperties(
    val tableId: TableId
) : Statement()
