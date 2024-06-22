package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement
import org.apache.commons.lang3.StringUtils

class DescStatement(vararg val keywords: String) : Statement() {
    override val statementType = StatementType.DESC
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML

    fun checkSql(sql: String): Boolean {
        val words = StringUtils.split(sql, " ")
        if (this.keywords.size != words.size) {
            return false
        }

        val size = this.keywords.size
        for (i in 0 until size) {
            if (!StringUtils.equalsIgnoreCase(this.keywords.get(i), words[i])) {
                return false
            }
        }

        return true
    }
}
