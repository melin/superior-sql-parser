package io.github.melin.superior.common.relational.drop

import io.github.melin.superior.common.relational.AlterAction

data class DropIndex(
    val indexName: String,
    var ifExists: Boolean = false
): AlterAction()