package io.github.melin.superior.parser.appjar

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class AppJarInfo(
    val resourceName: String,
    val className: String,
    val params: List<String>?
) : Statement() {
    override val statementType = StatementType.APP_JAR
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML
}