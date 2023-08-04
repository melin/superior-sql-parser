package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

class RemoveJarStatememt(
    val jarFileName: String
) : Statement() {
    override val statementType = StatementType.REMOVE_JAR
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML
}