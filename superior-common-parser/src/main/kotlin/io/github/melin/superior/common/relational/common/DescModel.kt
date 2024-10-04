package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.SchemaId
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.abs.AbsTableStatement
import io.github.melin.superior.common.relational.dml.QueryStmt
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

// spark
data class DescFunction(val functionId: FunctionId) : Statement() {
    override val statementType = StatementType.DESC_FUNCTION
    override val privilegeType = PrivilegeType.READ
    override val sqlType = SqlType.DDL
}

data class DescCatalog(val catalog: String) : Statement() {
    override val statementType = StatementType.DESC_CATALOG
    override val privilegeType = PrivilegeType.READ
    override val sqlType = SqlType.DDL
}

// 适用pg 类型数据库
data class DescDatabase(val database: String) : Statement() {
    override val statementType = StatementType.DESC_DATABASE
    override val privilegeType = PrivilegeType.READ
    override val sqlType = SqlType.DDL
}

data class DescSchema(val schemaId: SchemaId) : Statement() {
    override val statementType = StatementType.DESC_SCHEMA
    override val privilegeType = PrivilegeType.READ
    override val sqlType = SqlType.DDL
}

data class DescTable(val tableId: TableId) : Statement() {
    override val statementType = StatementType.DESC_TABLE
    override val privilegeType = PrivilegeType.READ
    override val sqlType = SqlType.DDL
}

data class DescQuery(val queryStmt: QueryStmt) : Statement() {
    override val statementType = StatementType.DESC_QUERY
    override val privilegeType = PrivilegeType.READ
    override val sqlType = SqlType.DDL
}

// spark delta
data class DescDeltaDetail(override val tableId: TableId) : AbsTableStatement() {
    override val statementType = StatementType.DESC_DELTA_DETAIL
    override val privilegeType = PrivilegeType.READ
    override val sqlType = SqlType.DDL
}

// spark delta
data class DescDeltaHistory(override val tableId: TableId, val limit: Int? = null) : AbsTableStatement() {
    override val statementType = StatementType.DESC_DELTA_HISTORY
    override val privilegeType = PrivilegeType.READ
    override val sqlType = SqlType.DDL
}
