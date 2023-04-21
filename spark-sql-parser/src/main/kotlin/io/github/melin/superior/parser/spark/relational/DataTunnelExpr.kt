package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class DataTunnelExpr(
    val srcType: String,
    var srcOptions: Map<String, Any>,
    val transformSql: String?,
    val distType: String,
    var distOptions: Map<String, Any>
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
    override val sqlType: SqlType = SqlType.DML

    lateinit var inputTables: List<TableId>
}