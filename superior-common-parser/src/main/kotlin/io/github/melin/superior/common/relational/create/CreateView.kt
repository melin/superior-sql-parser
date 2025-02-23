package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.abs.AbsTableStatement
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.table.ColumnRel

data class CreateView(
    override val tableId: TableId,
    var queryStmt: QueryStmt,
    val comment: String? = null,
    var ifNotExists: Boolean = false, // 是否存在 if not exists 关键字
    var columnRels: List<ColumnRel>? = null,
) : AbsTableStatement() {
    override val statementType = StatementType.CREATE_VIEW
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DDL

    var replace: Boolean = false
    var temporary: Boolean = false
    var global: Boolean = false

    var fileFormat: String? = null
    var properties: Map<String, String> = mapOf()
}
