package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.abs.AbsTableStatement

data class CreateFileView(
    override val tableId: TableId,
    val path: String,
    var properties: Map<String, String>,
    var fileFormat: String? = null,
    val compression: String? = null,
    val sizeLimit: String? = null,
) : AbsTableStatement() {
    override val statementType = StatementType.CREATE_FILE_VIEW
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML
}
