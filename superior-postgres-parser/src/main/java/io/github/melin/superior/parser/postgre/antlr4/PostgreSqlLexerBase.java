package io.github.melin.superior.parser.postgre.antlr4;

import java.util.Stack;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;

public abstract class PostgreSqlLexerBase extends Lexer {
    protected final Stack<String> tags = new Stack<>();

    protected PostgreSqlLexerBase(CharStream input) {
        super(input);
    }

    public void PushTag() {
        tags.push(getText());
    }

    public boolean IsTag() {
        return getText().equals(tags.peek());
    }

    public void PopTag() {
        tags.pop();
    }

    public void UnterminatedBlockCommentDebugAssert() {
        // Debug.Assert(InputStream.LA(1) == -1 /*EOF*/);
    }

    public boolean CheckLaMinus() {
        return getInputStream().LA(1) != '-';
    }

    public boolean CheckLaStar() {
        return getInputStream().LA(1) != '*';
    }

    public boolean CharIsLetter() {
        return Character.isLetter(getInputStream().LA(-1));
    }

    public void HandleNumericFail() {
        getInputStream().seek(getInputStream().index() - 2);
        setType(PostgreSqlLexer.Integral);
    }

    public void HandleLessLessGreaterGreater() {
        if (getText() == "<<") setType(PostgreSqlLexer.LESS_LESS);
        if (getText() == ">>") setType(PostgreSqlLexer.GREATER_GREATER);
    }

    public boolean CheckIfUtf32Letter() {
        int codePoint = getInputStream().LA(-2) << 8 + getInputStream().LA(-1);
        char[] c;
        if (codePoint < 0x10000) {
            c = new char[] {(char) codePoint};
        } else {
            codePoint -= 0x10000;
            c = new char[] {(char) (codePoint / 0x400 + 0xd800), (char) (codePoint % 0x400 + 0xdc00)};
        }
        return Character.isLetter(c[0]);
    }

    public boolean IsSemiColon() {
        return ';' == (char) getInputStream().LA(1);
    }
}
