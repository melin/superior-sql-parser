package io.github.melin.superior.parser.dameng

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.parser.dameng.antlr4.DmSqlParserBaseVisitor

/** Created by libinsong on 2018/2/8. */
class DmSqlAntlr4Visitor(val splitSql: Boolean = false, val command: String?) : DmSqlParserBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var limit: Int? = null
    private var offset: Int? = null
    private val primaryKeys = ArrayList<String>()

    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()

    // 多语句解析结果
    private var statements: ArrayList<Statement> = arrayListOf()
    // 存储过程和函数中包含的子语句
    private var childStatements: ArrayList<Statement> = arrayListOf()
    private val sqls: ArrayList<String> = arrayListOf()

    fun getSqlStatements(): List<Statement> {
        return statements
    }

    fun getSplitSqls(): List<String> {
        return sqls
    }

}
