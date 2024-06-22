package io.github.melin.superior.common.relational.drop

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

class DropDatabase(
    val catalogName: String?,
    val databaseName: String,
    var ifExists: Boolean = false
) : Statement() {
    override val statementType = StatementType.DROP_DATABASE
    override val privilegeType = PrivilegeType.DROP
    override val sqlType = SqlType.DDL

    val databaseNames: ArrayList<String> = arrayListOf()

    constructor(databaseName: String) : this(null, databaseName)

    constructor(
        databaseName: String,
        ifExists: Boolean
    ) : this(null, databaseName, ifExists)
}
