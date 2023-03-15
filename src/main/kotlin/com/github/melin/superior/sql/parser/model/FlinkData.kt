package com.github.melin.superior.sql.parser.model

@DefaultConstructor
data class CreateTable(
    var sinkTable: Table,
    var sourceTable: Table,
): Statement() {
    var sinkOptions: HashMap<String, String>? = null
    var sourceOptions: HashMap<String, String>? = null
    var computeCols: List<DcColumn>? = null
}

@DefaultConstructor
data class CreateDatabase(
    var sinkDatabase: Database,
    var sourceDatabase: Database,
    var include: String
): Statement() {
    var sinkOptions: HashMap<String, String>? = null
    var sourceOptions: HashMap<String, String>? = null
    var computeCols: List<DcColumn>? = null
    var exclude: String? = null
}