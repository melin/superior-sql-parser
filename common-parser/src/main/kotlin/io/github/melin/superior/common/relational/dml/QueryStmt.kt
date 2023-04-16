package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class QueryStmt(
    var inputTables: List<TableId>,
    var limit: Int? = null,
): Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.READ
    override val sqlType: SqlType = SqlType.DQL

    lateinit var functionNames: HashSet<String>
    var cteTempTables: List<String>? = null
}