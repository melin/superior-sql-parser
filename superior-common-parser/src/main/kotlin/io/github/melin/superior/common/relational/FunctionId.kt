package io.github.melin.superior.common.relational

import com.google.common.collect.Lists
import org.apache.commons.lang3.StringUtils

data class FunctionId(
    val catalogName: String?,
    val schemaName: String?,
    val functionName: String) {

    companion object {
        @JvmStatic
        fun of(functionName: String) = TableId(functionName)

        @JvmStatic
        fun of(schemaName: String, functionName: String) = TableId(schemaName, functionName)

        @JvmStatic
        fun of(catalogName: String, schemaName: String, functionName: String) = TableId(catalogName, schemaName, functionName)
    }

    var funcType: String = "CF" // callfunction & TVF
    var functionArguments: List<String> = Lists.newArrayList();

    constructor(schemaName: String?, tableName: String):
            this(null, schemaName, tableName)

    constructor(tableName: String):
            this(null, null, tableName)

    fun getFullFunctionName(): String {
        if (catalogName != null) {
            return "${catalogName}.${schemaName}.${functionName}"
        }

        if (schemaName != null) {
            return "${schemaName}.${functionName}"
        }

        return functionName
    }

    fun getLowerCatalogName(): String {
        return StringUtils.lowerCase(catalogName)
    }

    fun getLowerSchemaName(): String {
        return StringUtils.lowerCase(schemaName)
    }

    fun getLowerTableName(): String {
        return StringUtils.lowerCase(functionName)
    }
}