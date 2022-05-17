package com.github.melin.superior.sql.parser.model

import com.github.melin.superior.sql.parser.StatementType
import java.io.Serializable

/**
 * Created by libinsong on 2017/4/4.
 */

data class Schema(val catalogName: String?, val databaseName: String?, val tableName: String, val metaType: String?)

data class Database(val catalogName: String?, val databaseName: String)

@Target(AnnotationTarget.CLASS)
annotation class DefaultConstructor

data class StatementData(val type: StatementType,
                         val statement: Statement?,
                         var querySql: String? = null,
                         var values: ArrayList<List<String>>? = null): Serializable {
    constructor(type: StatementType): this(type, null)
}

abstract class Statement: Serializable

@DefaultConstructor
data class DcDatabase(
    val catalogName: String?,
    val databaseName: String,
    val location: String?): Statement(){
    constructor(catalogName: String?, databaseName: String): this(catalogName, databaseName, null)

    constructor(databaseName: String): this(null, databaseName, null)
}

data class DcTable(
        val catalogName: String?,
        val databaseName: String?,
        val tableName: String,
        val comment: String?,
        var lifeCycle: Int?,
        var partitionColumns: List<DcColumn>?,
        var columns: List<DcColumn>?,
        var properties: Map<String, String>?,
        var fileFormat: String? = null,
        var ifNotExists: Boolean = false, //是否存在 if not exists 关键字
        var ifExists: Boolean = false,
        var external: Boolean = false,
        var temporary: Boolean = false,
        var location: Boolean = false,
        var locationPath: String? = null,
        var querySql: String? = null,
        var tableData: TableData? = null,
        var partitionColumnNames: List<String>? = null) : Statement() { //是否存在 if exists 关键字

    constructor(catalogName: String?,
                databaseName: String?,
                tableName: String,
                comment: String?,
                lifeCycle: Int?,
                partitionColumns: List<DcColumn>?,
                columns: List<DcColumn>?):
            this(catalogName, databaseName, tableName, comment, lifeCycle, partitionColumns, columns, null, null, false, false, false)

    constructor(catalogName: String?, databaseName: String?, tableName: String):
            this(catalogName, databaseName, tableName, null, null, null, null, null, null, false, false, false)

    // 建表方式：hive & spark. https://spark.apache.org/docs/3.2.0/sql-ref-syntax-ddl-create-table.html
    var createTableType: String = "hive"
    var token: CommonToken? = null
    var hudiPrimaryKeys: List<String> = listOf()
    var hudiType: String = "COW"

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class TidbCreateTable(
        val databaseName: String?,
        val tableName: String,
        val comment: String?,
        var columns: List<DcColumn>,
        var pkColumns: List<String>,
        var uniques: List<TidbColumn>,
        var properties: Map<String, String>,
        var ifNotExists: Boolean = false) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class TidbColumn(
        val indexName: String?,
        val indexType: String?,
        var columns: List<String>
) : Statement() {}

data class DcView(
        val catalogName: String?,
        val databaseName: String?,
        val tableName: String,
        var querySql: String? = null,
        val comment: String? = null,
        var ifNotExists: Boolean = false, //是否存在 if not exists 关键字
        var ifExists: Boolean = false) : Statement() { //是否存在 if exists 关键字

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

@DefaultConstructor
data class TableData(
        var inputTables: java.util.ArrayList<TableSource> = ArrayList(),
        var outpuTables: java.util.ArrayList<TableSource> = ArrayList(),
        var limit: Int? = null,
        var insertMode: InsertMode? = null,
        var partitions: HashMap<String, String>? = null,
        var cteTempTables: ArrayList<String>? = null
): Statement()

@DefaultConstructor
data class TableSource(
        val catalogName: String?,
        var databaseName: String?,
        var tableName: String,
        var metaAction: String?,
        var column: DcColumn? = null,
        var columns: List<String>? = ArrayList()
): Statement() {
    constructor(catalogName: String?, databaseName: String?, tableName: String):
            this(catalogName, databaseName, tableName, null)

    constructor(databaseName: String?, tableName: String):
            this(null, databaseName, tableName, null)

    val tokens: java.util.ArrayList<CommonToken> = ArrayList()

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class CommonToken(val start: Int, val stop: Int)

data class DcRenameTable(
    val catalogName: String?,
    val databaseName: String?,
    val oldName: String,
    val newName: String) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + oldName else oldName
    }

    var oldToken: CommonToken? = null
    var newToken: CommonToken? = null
}

data class DcRenameView(
        val catalogName: String?,
        val databaseName: String?,
        val oldName: String,
        val newName: String) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + oldName else oldName
    }
}

data class DcCopyTable(
        val oldDatabaseName: String?,
        val oldTableName: String,
        val newDatabaseName: String?,
        val newTableName: String,
        var ifNotExists: Boolean = false,
        var external: Boolean = false,
        var temporary: Boolean = false) : Statement()

data class DcColumn(
        val name: String,
        val type: String? = null,
        val comment: String? = null,
        val oldName: String? = null,
        val position: String? = null,
        val afterCol: String? = null) : Statement() {
    constructor(name: String, type: String?, comment: String?): this(name, type, comment, null, null, null)
}

data class DcAlterColumn(
        val catalogName: String?,
        val databaseName: String?,
        val tableName: String,
        val oldName: String?,
        val newName: String?,
        val comment: String? = null) : Statement() {

    constructor(catalogName: String?, databaseName: String?, tableName: String):
            this(catalogName, databaseName, tableName, null, null, null);

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }

    var token: CommonToken? = null
}

data class DcFunction(
    val name: String,
    var temporary: Boolean = false,
    val className: String?,
    val file: String?) : Statement() {
    constructor(name: String): this(name,  false, null, null)
}

data class MergeData(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val partitionVals: List<String>?) : Statement()

data class DtunnelExpr(
    val srcType: String,
    var srcOptions: Map<String, String>,
    val distType: String,
    var distOptions: Map<String, String>) : Statement()

data class CallExpr(
    val catalogName: String?,
    val namespace: String?,
    val procedureName: String
) : Statement()

data class ReadData(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val partitionVals: List<String>?,
    val limit: Int) : Statement()

data class LoadData(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val loadMode: String? = null,
    val resourceName: String? = null,
    val partitionVals: List<String>? = null) : Statement()

data class ExportData(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val cte: Boolean = false,
    var inputTables: java.util.ArrayList<TableSource> = ArrayList(),
    var cteTempTables: ArrayList<String>? = null) : Statement()

data class RefreshData(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String) : Statement()

data class SetData(val key: String,
    val value: String?) : Statement()

data class UnSetData(val key: String) : Statement()

data class JobData(val resourceName: String,
    val className: String,
    val params: List<String>?) : Statement()

@DefaultConstructor
data class StreamTable(
    var tableName: String,
    var columns: List<StreamColumn>,
    var properties: Map<String, String>
) : Statement()

data class StreamColumn(
    val name: String,
    val type: String? = null,
    val comment: String? = null,
    val jsonPath: String? = null,
    val pattern: String? = null) : Statement()

@DefaultConstructor
data class StreamInsertStatement(
    val databaseName: String?,
    val tableName: String,
    var querySql: String? = null
) : Statement()

enum class InsertMode: Serializable {
    INTO, OVERWRITE
}

data class DeleteTable(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val where: String? = null) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class UpdateTable(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    val upset: Map<String, String>? = null,
    val where: String? = null) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class DetailTable(
    val databaseName: String?,
    val tableName: String) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class HistoryTable(
    val databaseName: String?,
    val tableName: String,
    val limit: Int? = null) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class DeltaMerge(
    var sourceTables: java.util.HashSet<TableSource> = HashSet(),
    var targetTable: TableSource
): Statement()

data class DropTablePartition(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    var ifExists: Boolean = false,
    var partitionSpecs: List<String>
): Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class AddTablePartition(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    var ifNotExists: Boolean = false,
    var partitionSpecs: List<String>
): Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class TouchTable(
    val catalogName: String?,
    val databaseName: String?,
    val tableName: String,
    var partitionSpecs: List<String>
): Statement() {
    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class ArithmeticData(
    val variables: java.util.HashSet<String> = HashSet(),
    val functions: java.util.HashSet<String> = HashSet()
): Statement()
