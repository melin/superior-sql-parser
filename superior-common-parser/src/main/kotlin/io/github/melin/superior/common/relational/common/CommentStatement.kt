package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class CommentData(
    val comment: String? = null,
    val isNull: Boolean = false,
    val objType: String? = null,
    val objValue: String? = null
) : Statement() {
    override val statementType = StatementType.COMMENT
    override val privilegeType = PrivilegeType.ALTER
    override val sqlType = SqlType.TCL
}