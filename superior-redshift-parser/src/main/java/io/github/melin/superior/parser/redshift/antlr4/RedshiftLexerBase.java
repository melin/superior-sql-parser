package io.github.melin.superior.parser.redshift.antlr4;

import java.util.ArrayDeque;
import java.util.Deque;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;

public abstract class RedshiftLexerBase extends Lexer {
    protected final Deque<String> tags = new ArrayDeque<>();

    protected RedshiftLexerBase(CharStream input) {
        super(input);
    }

    public void pushTag() {
        tags.push(getText());
    }

    public boolean isTag() {
        return getText().equals(tags.peek());
    }

    public void popTag() {
        tags.pop();
    }

    public boolean checkLA(int c) {
        return getInputStream().LA(1) != c;
    }

    public boolean charIsLetter() {
        return Character.isLetter(getInputStream().LA(-1));
    }

    public void HandleNumericFail() {
        getInputStream().seek(getInputStream().index() - 2);
        setType(RedshiftLexer.Integral);
    }

    public void HandleLessLessGreaterGreater() {
        if (getText() == "<<") setType(RedshiftLexer.LESS_LESS);
        if (getText() == ">>") setType(RedshiftLexer.GREATER_GREATER);
    }

    public void UnterminatedBlockCommentDebugAssert() {
        // Debug.Assert(InputStream.LA(1) == -1 /*EOF*/);
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
}
