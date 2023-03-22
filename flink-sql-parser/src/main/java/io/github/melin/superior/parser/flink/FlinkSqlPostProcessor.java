package io.github.melin.superior.parser.flink;

import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParser;
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParserBaseListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;

public class FlinkSqlPostProcessor extends FlinkSqlParserBaseListener {

    /** Remove the back ticks from an Identifier. */
    @Override
    public void exitQuotedIdentifier(FlinkSqlParser.QuotedIdentifierContext ctx) {
        ParserRuleContext parent = ctx.getParent();
        parent.removeLastChild();
        Token token = (Token)ctx.getChild(0).getPayload();

        CommonToken commonToken = new CommonToken(new Pair(token.getTokenSource(), token.getInputStream()),
                FlinkSqlParser.IDENTIFIER,
                token.getChannel(),
                token.getStartIndex() + 1,
                token.getStopIndex() - 1);

        commonToken.setText(commonToken.getText().replace("``", "`"));
        parent.addChild(commonToken);
    }
}