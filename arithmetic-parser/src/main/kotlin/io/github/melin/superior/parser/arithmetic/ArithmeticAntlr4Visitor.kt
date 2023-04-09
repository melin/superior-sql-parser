package com.github.melin.superior.sql.parser.arithmetic

import io.github.melin.superior.common.SQLParserException
import io.github.melin.superior.common.relational.StatementData
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.parser.antlr4.arithmetic.ArithmeticBaseVisitor
import io.github.melin.superior.parser.antlr4.arithmetic.ArithmeticParser
import io.github.melin.superior.parser.arithmetic.ArithmeticData
import org.antlr.v4.runtime.tree.ParseTree
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/7/28 9:49 上午
 */
class ArithmeticAntlr4Visitor(val bracketEnbled: Boolean): ArithmeticBaseVisitor<StatementData>() {

    private var data: StatementData? = null

    private val arithmetic = ArithmeticData()

    override fun visit(tree: ParseTree): StatementData? {
        super.visit(tree)

        if (data == null) {
            throw SQLParserException("不支持的表达式")
        }

        return data;
    }

    override fun visitExpression(ctx: ArithmeticParser.ExpressionContext): StatementData? {
        data = StatementData(StatementType.ARITHMETIC, arithmetic)
        return super.visitExpression(ctx)
    }

    override fun visitIdentifier(ctx: ArithmeticParser.IdentifierContext): StatementData? {
        val name = ctx.text
        if (!arithmetic.functions.contains(name)) {
            if (bracketEnbled) {
                arithmetic.variables.add(StringUtils.substringBetween(name, "[", "]"))
            } else {
                arithmetic.variables.add(name)
            }
        }
        return super.visitIdentifier(ctx)
    }

    override fun visitFunctionName(ctx: ArithmeticParser.FunctionNameContext): StatementData? {
        val name = ctx.text
        arithmetic.functions.add(name)
        return super.visitFunctionName(ctx)
    }
}
