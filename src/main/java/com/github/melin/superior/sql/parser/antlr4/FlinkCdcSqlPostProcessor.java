package com.github.melin.superior.sql.parser.antlr4;

import com.github.melin.superior.sql.parser.antlr4.flink.FlinkCdcSqlParser;
import com.github.melin.superior.sql.parser.antlr4.flink.FlinkCdcSqlParserBaseListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

public class FlinkCdcSqlPostProcessor extends FlinkCdcSqlParserBaseListener {

    /** Remove the back ticks from an Identifier. */
    @Override
    public void exitQuotedIdentifier(FlinkCdcSqlParser.QuotedIdentifierContext ctx) {
        ParserRuleContext parent = ctx.getParent();
        parent.removeLastChild();
        Token token = (Token)ctx.getChild(0).getPayload();

        CommonToken commonToken = new CommonToken(
                new org.antlr.v4.runtime.misc.Pair(token.getTokenSource(), token.getInputStream()),
                FlinkCdcSqlParser.IDENTIFIER,
                token.getChannel(),
                token.getStartIndex() + 1,
                token.getStopIndex() - 1);

        commonToken.setText(commonToken.getText().replace("``", "`"));
        parent.addChild(commonToken);
    }
}