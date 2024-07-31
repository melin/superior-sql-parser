package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class UseCatalog(val catalogName: String) : Statement() {
    override val statementType = StatementType.USE
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML
}

data class UseDatabase(val catalogName: String?, val databaseName: String) : Statement() {
    override val statementType = StatementType.USE
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML

    constructor(databaseName: String) : this(null, databaseName)
}

data class UseSchema(val databaseName: String?, val schemaName: String) : Statement() {
    override val statementType = StatementType.USE
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML

    constructor(databaseName: String) : this(null, databaseName)
}
