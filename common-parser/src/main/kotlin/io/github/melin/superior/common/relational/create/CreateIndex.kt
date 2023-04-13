package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.relational.AlterAction
import io.github.melin.superior.common.relational.SortType

data class CreateIndex(
    val indexName: String,
    val indexColumnNames: ArrayList<IndexColumnName> = arrayListOf()
)  : AlterAction() {
    val intimeAction: String = "ONLINE" //ONLINE & OFFLINE
    val indexCategory: String? = null
    val indexType: String? = null
}

data class IndexColumnName(
    val columnName: String,
    val sortType: SortType = SortType.UNKOWN,
)