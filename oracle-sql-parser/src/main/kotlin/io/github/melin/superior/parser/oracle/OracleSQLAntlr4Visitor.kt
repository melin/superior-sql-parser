package io.github.melin.superior.parser.oracle

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.StatementData
import io.github.melin.superior.parser.oracle.antlr4.PlSqlParserBaseVisitor
import org.antlr.v4.runtime.tree.ParseTree

/**
 * Created by libinsong on 2020/6/30 9:57 上午
 */
class OracleSQLAntlr4Visitor: PlSqlParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var limit: Int? = null

    override fun visit(tree: ParseTree?): StatementData {
        val statementData = super.visit(tree)

        if (statementData == null) {
            throw SQLParserException("不支持的SQL")
        }

        return statementData;
    }


}
