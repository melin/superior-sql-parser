package com.dataworker.sql.parser.model

/**
 * Created by libinsong on 2017/4/4.
 */

data class ClickHouseTable(
        val databaseName: String?,
        val tableName: String,
        val engine: String,
        val comment: String?,
        var columns: List<DcColumn>?,
        var properties: Map<String, String>?,
        var partitionColumnNames: List<String>? = null) : Statement() {

}
