package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class DataTunnelHelp(
    val type: String,
    val value: String
) : Statement() {
    override val statementType = StatementType.DATATUNNEL
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DDL
}