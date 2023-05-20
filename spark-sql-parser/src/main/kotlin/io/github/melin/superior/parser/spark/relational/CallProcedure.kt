package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class CallProcedure(
    val catalogName: String?,
    val databaseName: String?,
    val procedureName: String,
    var properties: Map<String, String>
) : Statement() {
    override val statementType = StatementType.CALL
    override val privilegeType = PrivilegeType.ADMIN
    override val sqlType = SqlType.DML
}