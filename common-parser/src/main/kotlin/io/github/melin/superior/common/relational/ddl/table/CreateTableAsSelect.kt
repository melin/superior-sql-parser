package io.github.melin.superior.common.relational.ddl.table

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.Column
import io.github.melin.superior.common.CommonToken
import io.github.melin.superior.common.Statement
import io.github.melin.superior.common.relational.TableLineage

data class CreateTableAsSelect(
    val catalogName: String?,
    val schemaName: String?,
    val tableName: String,
    val comment: String?,
    var lifeCycle: Int?,
    var partitionColumns: List<Column>?,
    var columns: List<Column>?,
    var properties: Map<String, String>?,
    var fileFormat: String? = null,
    var ifNotExists: Boolean = false, //是否存在 if not exists 关键字
    var location: Boolean = false,
    var locationPath: String? = null,
    var querySql: String? = null,
    var tableLineage: TableLineage? = null,
    var partitionColumnNames: List<String>? = null) : Statement() { //是否存在 if exists 关键字

    var replace = false
    // 建表方式：hive & spark. https://spark.apache.org/docs/3.2.0/sql-ref-syntax-ddl-create-table.html
    var createTableType: String = "hive"

    fun getFullTableName(): String {
        return StringUtil.innerFullTableName(catalogName, schemaName, tableName)
    }
}