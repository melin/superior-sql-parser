package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.AbsTableStatement
import io.github.melin.superior.common.relational.TableId

data class CreateTempViewUsing(
    override val tableId: TableId,
    var fileFormat: String,
    var properties: Map<String, String>,
) : AbsTableStatement() {
    override val privilegeType: PrivilegeType = PrivilegeType.CREATE
    override val sqlType: SqlType = SqlType.DDL

    var replace: Boolean = false
    var global: Boolean = false
}