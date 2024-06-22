package io.github.melin.superior.common.relational.abs

import io.github.melin.superior.common.relational.Statement

abstract class AbsDatabaseStatement : Statement() {
    abstract val databaseName: String
}
