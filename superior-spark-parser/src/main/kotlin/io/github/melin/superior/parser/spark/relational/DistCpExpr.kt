package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class DistCpExpr(
        val sourceType: String,
        var sourceOptions: Map<String, Any>,
        var sinkType: String,
        var sinkOptions: Map<String, Any>,
        var properties: Map<String, Any>
) : Statement() {
    override val statementType = StatementType.SPARK_DIST_CP
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML

    constructor(sourceType: String,
                sourceOptions: Map<String, Any>,
                sinkType: String,
                sinkOptions: Map<String, Any>): this(sourceType, sourceOptions, sinkType, sinkOptions, mapOf())
}