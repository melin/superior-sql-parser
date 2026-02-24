package io.github.melin.superior.parser.oracle.antlr4;

import org.antlr.v4.runtime.*;

public abstract class OracleParserBase extends Parser {
    private boolean _isVersion12 = true;
    private boolean _isVersion11 = true;
    private boolean _isVersion10 = true;

    public OracleParserBase(TokenStream input) {
        super(input);
    }

    public boolean isVersion12() {
        return _isVersion12;
    }

    public void setVersion12(boolean value) {
        _isVersion12 = value;
    }

    public boolean isVersion11() {
        return _isVersion11;
    }

    public void setVersion11(boolean value) {
        _isVersion11 = value;
    }

    public boolean isVersion10() {
        return _isVersion10;
    }

    public void setVersion10(boolean value) {
        _isVersion10 = value;
    }
}
