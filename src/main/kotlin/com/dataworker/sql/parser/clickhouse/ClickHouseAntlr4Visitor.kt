package com.dataworker.sql.parser.clickhouse

import com.dataworker.sql.parser.antlr4.clickhouse.ClickHouseParserBaseVisitor
import com.dataworker.sql.parser.model.StatementData

/**
 * Created by libinsong on 2020/7/28 9:49 上午
 */
class ClickHouseAntlr4Visitor: ClickHouseParserBaseVisitor<StatementData>() {

    private var command: String? = null

    fun setCommand(command: String) {
        this.command = command
    }
}
