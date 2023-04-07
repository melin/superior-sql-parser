package io.github.melin.superior.common.relational.ddl.table

import io.github.melin.superior.common.Statement
import io.github.melin.superior.common.relational.TableId

class TruncateTable(
    val tableId: TableId
) : Statement()