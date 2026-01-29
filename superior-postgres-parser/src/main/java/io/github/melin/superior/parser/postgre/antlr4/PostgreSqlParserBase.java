package io.github.melin.superior.parser.postgre.antlr4;

import java.util.List;
import org.antlr.v4.runtime.*;

public abstract class PostgreSqlParserBase extends Parser {

    public PostgreSqlParserBase(TokenStream input) {
        super(input);
    }

    ParserRuleContext GetParsedSqlTree(String script, int line) {
        PostgreSqlParser ph = GetPostgreSqlParser(script);
        ParserRuleContext result = ph.root();
        return result;
    }

    public void ParseRoutineBody() {
        PostgreSqlParser.Createfunc_opt_listContext _localctx =
                (PostgreSqlParser.Createfunc_opt_listContext) this.getContext();
        String lang = null;
        for (PostgreSqlParser.Createfunc_opt_itemContext coi : _localctx.createfunc_opt_item()) {
            if (coi.LANGUAGE() != null) {
                if (coi.nonreservedword_or_sconst() != null)
                    if (coi.nonreservedword_or_sconst().nonreservedword() != null)
                        if (coi.nonreservedword_or_sconst().nonreservedword().identifier() != null)
                            if (coi.nonreservedword_or_sconst()
                                            .nonreservedword()
                                            .identifier()
                                            .Identifier()
                                    != null) {
                                lang = coi.nonreservedword_or_sconst()
                                        .nonreservedword()
                                        .identifier()
                                        .Identifier()
                                        .getText();
                                break;
                            }
            }
        }
        if (null == lang) return;
        PostgreSqlParser.Createfunc_opt_itemContext func_as = null;
        for (PostgreSqlParser.Createfunc_opt_itemContext a : _localctx.createfunc_opt_item()) {
            if (a.func_as() != null) {
                func_as = a;
                break;
            }
        }
        if (func_as != null) {
            String txt = GetRoutineBodyString(func_as.func_as().sconst(0));
            switch (lang) {
                case "plpgsql":
                    // NB: Cannot be done this way.
                    // PostgreSQLParser ph = GetPostgreSQLParser(txt);
                    // func_as.func_as().Definition = ph.plsqlroot();
                    break;
                case "sql":
                    // func_as.func_as().Definition = ph.root();
                    break;
            }
        }
    }

    private String TrimQuotes(String s) {
        return (s == null || s.isEmpty()) ? s : s.substring(1, s.length() - 1);
    }

    public String unquote(String s) {
        int slength = s.length();
        StringBuilder r = new StringBuilder(slength);
        int i = 0;
        while (i < slength) {
            Character c = s.charAt(i);
            r.append(c);
            if (c == '\'' && i < slength - 1 && (s.charAt(i + 1) == '\'')) i++;
            i++;
        }
        return r.toString();
    }

    public String GetRoutineBodyString(PostgreSqlParser.SconstContext rule) {
        PostgreSqlParser.AnysconstContext anysconst = rule.anysconst();
        org.antlr.v4.runtime.tree.TerminalNode StringConstant = anysconst.StringConstant();
        if (null != StringConstant) return unquote(TrimQuotes(StringConstant.getText()));
        org.antlr.v4.runtime.tree.TerminalNode UnicodeEscapeStringConstant = anysconst.UnicodeEscapeStringConstant();
        if (null != UnicodeEscapeStringConstant) return TrimQuotes(UnicodeEscapeStringConstant.getText());
        org.antlr.v4.runtime.tree.TerminalNode EscapeStringConstant = anysconst.EscapeStringConstant();
        if (null != EscapeStringConstant) return TrimQuotes(EscapeStringConstant.getText());
        String result = "";
        List<org.antlr.v4.runtime.tree.TerminalNode> dollartext = anysconst.DollarText();
        for (org.antlr.v4.runtime.tree.TerminalNode s : dollartext) {
            result += s.getText();
        }
        return result;
    }

    public PostgreSqlParser GetPostgreSqlParser(String script) {
        CharStream charStream = CharStreams.fromString(script);
        Lexer lexer = new PostgreSqlLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PostgreSqlParser parser = new PostgreSqlParser(tokens);
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        LexerDispatchingErrorListener listener_lexer = new LexerDispatchingErrorListener(
                (Lexer) (((CommonTokenStream) (this.getInputStream())).getTokenSource()));
        ParserDispatchingErrorListener listener_parser = new ParserDispatchingErrorListener(this);
        lexer.addErrorListener(listener_lexer);
        parser.addErrorListener(listener_parser);
        return parser;
    }

    public boolean OnlyAcceptableOps() {
        var c = ((CommonTokenStream) this.getInputStream()).LT(1);
        var text = c.getText();
        return text.equals("!") || text.equals("!!") || text.equals("!=-");
    }
}
