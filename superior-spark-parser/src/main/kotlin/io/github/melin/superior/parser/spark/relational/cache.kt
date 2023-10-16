package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.dml.QueryStmt

data class CacheTable(
        val tableId: TableId,
        var options: Map<String, String>,
        val queryStmt: QueryStmt?
) : Statement() {
    override val statementType = StatementType.CACHE
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML

    constructor(tableId: TableId, options: Map<String, String>): this(tableId, options, null)
}

data class UnCacheTable(val tableId: TableId) : Statement() {
    override val statementType = StatementType.UNCACHE
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML
}
