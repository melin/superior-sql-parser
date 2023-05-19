package io.github.melin.superior.common.relational

abstract class AbsTableStatement: Statement() {
    abstract val tableId: TableId
}