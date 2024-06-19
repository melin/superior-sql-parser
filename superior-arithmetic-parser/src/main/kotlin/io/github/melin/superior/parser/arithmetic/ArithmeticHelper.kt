package com.github.melin.superior.sql.parser.arithmetic

import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.antlr4.ParseException
import io.github.melin.superior.parser.antlr4.arithmetic.ArithmeticLexer
import io.github.melin.superior.parser.antlr4.arithmetic.ArithmeticParser
import io.github.melin.superior.parser.arithmetic.AbstractArithParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.LexerATNSimulator
import org.antlr.v4.runtime.atn.ParserATNSimulator
import org.antlr.v4.runtime.atn.PredictionContextCache
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils

/**
 *
 * Created by libinsong on 2018/1/10.
 */
object ArithmeticHelper {

    @JvmStatic fun parseStatement(command: String) : Statement? {
        return ArithmeticHelper.parseStatement(command, true)
    }

    @JvmStatic fun parseStatement(command: String, bracketEnbled: Boolean) : Statement? {
        val trimCmd = StringUtils.trim(command)

        val charStream = CharStreams.fromString(trimCmd);
        val lexer = ArithmeticLexer(charStream)

        val tokenStream = CommonTokenStream(lexer)
        val parser = ArithmeticParser(tokenStream)
        AbstractArithParser.installCaches(parser)
        parser.bracket_enbled = bracketEnbled
        parser.interpreter.predictionMode = PredictionMode.SLL

        val sqlVisitor = ArithmeticAntlr4Visitor(bracketEnbled)

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                return sqlVisitor.visit(parser.expression())
            } catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                return sqlVisitor.visit(parser.expression())
            }
        } catch (e: ParseException) {
            if(StringUtils.isNotBlank(e.command)) {
                throw e;
            } else {
                throw e.withCommand(trimCmd)
            }
        } finally {
            AbstractArithParser.refreshParserCaches()
        }
    }
}
