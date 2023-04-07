package io.github.melin.superior.common.relational.table

import io.github.melin.superior.common.Statement
import io.github.melin.superior.common.relational.TableId

class RenameTablePartition(
    val tableId: TableId
): Statement()