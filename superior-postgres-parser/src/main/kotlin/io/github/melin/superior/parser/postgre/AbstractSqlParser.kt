package io.github.melin.superior.parser.postgre

import io.github.melin.superior.common.antlr4.AntlrCaches
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParser
import java.util.concurrent.atomic.AtomicReference

object AbstractSqlParser {
    private val parserCaches = AtomicReference<AntlrCaches>(AntlrCaches(PostgreSqlParser._ATN))

    /**
     * Install the parser caches into the given parser.
     *
     * This method should be called before parsing any input.
     */
    fun installCaches(parser: PostgreSqlParser): Unit = parserCaches.get().installCaches(parser)

    /**
     * Drop the existing parser caches and create a new one.
     *
     * ANTLR retains caches in its parser that are never released. This speeds up parsing of future input, but it can
     * consume a lot of memory depending on the input seen so far.
     *
     * This method provides a mechanism to free the retained caches, which can be useful after parsing very large SQL
     * inputs, especially if those large inputs are unlikely to be similar to future inputs seen by the driver.
     */
    fun refreshParserCaches() {
        parserCaches.set(AntlrCaches(PostgreSqlParser._ATN))
    }
}
