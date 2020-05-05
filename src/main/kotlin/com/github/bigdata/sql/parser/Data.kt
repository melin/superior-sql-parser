package com.github.bigdata.sql.parser

import java.io.Serializable

/**
 * Created by libinsong on 2017/4/4.
 */

@Target(AnnotationTarget.CLASS)
annotation class DefaultConstructor

data class StatementData(val type: StatementType,
                         val statement: Statement?,
                         var querySql: String? = null,
                         var values: ArrayList<List<String>>? = null): Serializable {
    constructor(type: StatementType): this(type, null)
}

sealed class Statement: Serializable

data class DcDatabase(val databaseName: String,
                      val location: String?): Statement(){
    constructor(databaseName: String): this(databaseName,null)
}

data class DcTable(
        val databaseName: String?,
        val tableName: String,
        val comment: String?,
        var lifeCycle: Int?,
        var partitionColumns: List<DcColumn>?,
        var columns: List<DcColumn>?,
        var properties: Map<String, String>?,
        var fileFormate: String?,
        var ifNotExists: Boolean = false, //是否存在 if not exists 关键字
        var ifExists: Boolean = false,
        var external: Boolean = false,
        var temporary: Boolean = false,
        var location: Boolean = false,
        var locationPath: String? = null,
        var querySql: String? = null,
        var tableData: TableData? = null,
        var partitionColumnNames: List<String>? = null) : Statement() { //是否存在 if exists 关键字

    constructor(databaseName: String?,
                tableName: String,
                comment: String?,
                lifeCycle: Int?,
                partitionColumns: List<DcColumn>?,
                columns: List<DcColumn>?): this(databaseName,
            tableName, comment, lifeCycle, partitionColumns, columns, null, null, false, false, false)

    constructor(databaseName: String?,
                tableName: String): this(databaseName,
            tableName, null, null, null, null, null, null, false, false, false)

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
        val databaseName: String?,
        val tableName: String,
        val comment: String? = null,
        var ifNotExists: Boolean = false, //是否存在 if not exists 关键字
        var ifExists: Boolean = false) : Statement() { //是否存在 if exists 关键字

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

@DefaultConstructor data class TableData(
        var inputTables: java.util.ArrayList<TableSource> = ArrayList(),
        var outpuTables: java.util.ArrayList<TableSource> = ArrayList(),
        var limit: Int? = null,
        var insertMode: InsertMode? = null,
        var partitions: HashMap<String, String>? = null,
        var cteTempTables: ArrayList<String>? = null
): Statement()

@DefaultConstructor data class TableSource(
        var databaseName: String?,
        var tableName: String,
        var column: DcColumn? = null,
        var columns: List<String>? = ArrayList()
): Statement() {
    constructor(databaseName: String?,
                tableName: String): this(databaseName, tableName, null)

    val tokens: java.util.ArrayList<CommonToken> = ArrayList()

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class CommonToken(val start: Int, val stop: Int)

data class DcRenameTable(
        val databaseName: String?,
        val oldName: String,
        val newName: String) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + oldName else oldName
    }
}

data class DcRenameView(
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
        val oldName: String? = null) : Statement()

data class DcAlterColumn(
        val databaseName: String?,
        val tableName: String,
        val oldName: String?,
        val newName: String?,
        val comment: String?) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class DcFunction(
        val name: String,
        val className: String?,
        val file: String?) : Statement() {
    constructor(name: String): this(name, null, null)
}

data class MergeData(val databaseName: String?,
                     val tableName: String,
                     val partitionVals: List<String>?) : Statement()

data class CompressTableData(val databaseName: String?,
                             val tableName: String,
                             val partitionVals: List<String>?) : Statement()

data class CompressFileData(val path: String) : Statement()

data class DistcpTableData(
        val datasource: String,
        val srcTable: TableSource,
        val partitionVals: List<String>?,
        val destTable: TableSource,
        var properties: Map<String, String>,
        val cte: Boolean = false,
        var inputTables: java.util.ArrayList<TableSource> = ArrayList(),
        var cteTempTables: ArrayList<String>? = null) : Statement()

data class ReadData(val databaseName: String?,
                    val tableName: String,
                    val partitionVals: List<String>?,
                    val limit: Int) : Statement()

data class KillData(val jobGroupId: String) : Statement()

data class LoadData(val databaseName: String?,
                    val tableName: String,
                    val loadMode: String? = null,
                    val resourceName: String? = null,
                    val partitionVals: List<String>? = null) : Statement()

data class ExportData(val databaseName: String?,
                      val tableName: String,
                      val cte: Boolean = false,
                      var inputTables: java.util.ArrayList<TableSource> = ArrayList(),
                      var cteTempTables: ArrayList<String>? = null) : Statement()

data class RefreshData(val databaseName: String?,
                       val tableName: String) : Statement()

data class SetData(val key: String,
                   val value: String?) : Statement()

data class UnSetData(val key: String) : Statement()

data class JobData(val resourceName: String,
                   val className: String,
                   val params: List<String>?) : Statement()

@DefaultConstructor data class StreamSourceTable(
        var tableName: String,
        var columns: List<StreamColumn>,
        var properties: Map<String, String>,
        var timeMode: StreamTimeMode,
        var timeAttrName: String,
        var waterMarkType: StreamWaterMark? = null,
        var intervalTime: Int? = null
) : Statement()

@DefaultConstructor data class StreamSinkTable(
        var tableName: String,
        var columns: List<StreamColumn>,
        var properties: Map<String, String>
) : Statement()

@DefaultConstructor data class StreamSideTable(
        var tableName: String,
        var columns: List<StreamColumn>,
        var properties: Map<String, String>
) : Statement()

data class StreamColumn(
        val name: String,
        val type: String? = null,
        val comment: String? = null,
        val jsonPath: String? = null) : Statement()

data class StreamPropColumn(
        val name: String,
        val value: String) : Statement()

data class StreamView(
        val tableName: String,
        var querySql: String? = null
) : Statement()

@DefaultConstructor data class StreamInsertStatement(
        val tableNames: java.util.ArrayList<String>,
        var querySql: String? = null
) : Statement()

enum class StreamTableType: Serializable {
    SOURCE, SINK
}

enum class StreamTimeMode: Serializable {
    PROCTIME, ROWTIME
}

enum class StreamWaterMark: Serializable {
    DELAY
}

enum class InsertMode: Serializable {
    INTO, OVERWRITE
}

@DefaultConstructor data class FlinkTable(
        var tableName: String,
        var columns: List<StreamColumn>,
        var calColumns: List<StreamCalColumn>,
        var props: HashMap<String, String>,
        var isSide: Boolean,
        var primaryKey: String? = null,
        var procTimeColumn: String? = null,
        var watermark: WaterMark? = null
) : Statement()


data class StreamCalColumn (
        var name: String,
        var function: String? = null,
        var calExpression: String? = null
) : Statement()

data class WaterMark (
        var watermarkName: String? = null,
        var watermarkColumn: String? = null,
        var offset: String
) : Statement()

data class DeleteTable(
        val databaseName: String?,
        val tableName: String,
        val where: String? = null) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class UpdateTable(
        val databaseName: String?,
        val tableName: String,
        val upset: Map<String, String>? = null,
        val where: String? = null) : Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class VacuumTable(
        val databaseName: String?,
        val tableName: String,
        val retain: Int? = null) : Statement() {

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

data class DeltaConvert(
        val databaseName: String?,
        val tableName: String,
        val format: String
): Statement() {
    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}

data class DropTablePartition(
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
        val databaseName: String?,
        val tableName: String,
        var ifNotExists: Boolean = false,
        var partitionSpecs: List<String>
): Statement() {

    fun getFullTableName(): String {
        return if (databaseName != null) databaseName + "." + tableName else tableName
    }
}