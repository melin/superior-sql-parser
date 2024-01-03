package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class DataTunnelExpr(
        val sourceType: String,
        var sourceOptions: Map<String, Any>,
        val transformSql: String?,
        val sinkType: String,
        var sinkOptions: Map<String, Any>,
        var properties: Map<String, Any>,
) : Statement() {
    override val statementType = StatementType.DATATUNNEL
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML

    val inputTables: ArrayList<TableId> = arrayListOf()
    val functionNames: HashSet<FunctionId> = hashSetOf()

    constructor(sourceType: String,
                sourceOptions: Map<String, Any>,
                transformSql: String?,
                sinkType: String,
                sinkOptions: Map<String, Any>): this(sourceType, sourceOptions, transformSql, sinkType, sinkOptions, mapOf())
}