package io.github.melin.superior.common.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import org.apache.commons.lang3.StringUtils
import java.io.Serializable

abstract class Statement : Serializable {
    abstract val statementType: StatementType
    abstract val privilegeType: PrivilegeType
    abstract val sqlType: SqlType
    private var sql: String = ""

    fun setSql(sql: String) {
        if (StringUtils.endsWith(sql, ";")) {
            this.sql = StringUtils.substringBeforeLast(sql, ";")
        } else {
            this.sql = sql
        }
    }

    fun getSql(): String {
        return this.sql
    }
}
