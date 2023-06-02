package io.github.melin.superior.common.relational.alter

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.abs.AbsDatabaseStatement
import kotlin.collections.ArrayList

data class AlterDatabase(
    val alterType: AlterType,
    override val databaseName: String,
    private val action: AlterAction?
): AbsDatabaseStatement() {
    override val statementType = StatementType.ALTER_DATABASE
    override val privilegeType = PrivilegeType.ALTER
    override val sqlType = SqlType.DDL

    val actions: ArrayList<AlterAction> = ArrayList()
    var ifExists: Boolean = false

    init {
        if (action != null) {
            actions.add(action)
        }
    }

    constructor(alterType: AlterType, databaseName: String): this(alterType, databaseName, null)

    fun addActions(list: List<AlterAction>) {
        actions.addAll(list)
    }

    fun firstAction(): AlterAction {
        return actions.first()
    }
}