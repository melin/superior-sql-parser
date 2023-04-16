package io.github.melin.superior.parser.appjar

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.Statement

data class AppJarInfo(
    val resourceName: String,
    val className: String,
    val params: List<String>?
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
    override val sqlType: SqlType = SqlType.DML
}