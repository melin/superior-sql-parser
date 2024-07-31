package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

class RemoveResourceStatement(val fileNames: List<String>, val resourceType: String) : Statement() {
    override val statementType = StatementType.REMOVE_RESOURCE
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML

    constructor(fileName: String, resourceType: String) : this(listOf(fileName), resourceType)

    fun first(): String {
        return fileNames.first()
    }
}
