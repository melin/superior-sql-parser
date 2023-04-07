package io.github.melin.superior.common.relational.table

import io.github.melin.superior.common.Statement
import io.github.melin.superior.common.relational.TableId

class TruncateTable(
    val tableId: TableId
) : Statement()