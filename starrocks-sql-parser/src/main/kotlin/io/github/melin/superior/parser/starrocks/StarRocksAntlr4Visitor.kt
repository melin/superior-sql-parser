package io.github.melin.superior.parser.starrocks

import io.github.melin.superior.common.SQLParserException
import io.github.melin.superior.common.StatementData
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.TableData
import io.github.melin.superior.parser.starrocks.antlr4.StarRocksParserBaseVisitor
import org.antlr.v4.runtime.tree.ParseTree

/**
 * Created by libinsong on 2020/6/30 9:59 上午
 */
class StarRocksAntlr4Visitor: StarRocksParserBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private val statementData = TableData();
    private var limit: Int? = null
    private var data: StatementData? = null

    override fun visit(tree: ParseTree?): StatementData? {
        super.visit(tree)

        if (data == null) {
            throw SQLParserException("不支持的SQL")
        }

        return data;
    }


}
