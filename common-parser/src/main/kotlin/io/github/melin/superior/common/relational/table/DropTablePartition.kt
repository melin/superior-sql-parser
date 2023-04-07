package io.github.melin.superior.common.relational.table

import io.github.melin.superior.common.Statement
import io.github.melin.superior.common.relational.TableId

data class DropTablePartition(
    val tableId: TableId,
    var ifExists: Boolean = false,
    var partitionSpecs: List<String>
): Statement()
