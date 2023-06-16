package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class QueryStmt(
    var inputTables: List<TableId>,
    var limit: Int? = null,
    var offset: Int? = null
): Statement() {
    override val statementType = StatementType.SELECT
    override val privilegeType = PrivilegeType.READ
    override val sqlType = SqlType.DQL

    val functionNames: HashSet<FunctionId> = hashSetOf()
}