package io.github.melin.superior.common.relational.abs

import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

abstract class AbsTableStatement: Statement() {
    abstract val tableId: TableId
}