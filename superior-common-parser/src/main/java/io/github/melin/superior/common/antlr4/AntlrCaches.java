package io.github.melin.superior.common.antlr4;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

public class AntlrCaches {

    public static final String RELEASE_ANTLR_CACHE_AFTER_PARSING = "releaseAntlrCacheAfterParsing";

    private final ATN atn;

    private final PredictionContextCache predictionContextCache = new PredictionContextCache();

    private final DFA[] decisionToDFA;

    public AntlrCaches(ATN atn) {
        this.atn = atn;
        this.decisionToDFA = makeDecisionToDFA(this.atn);
    }

    public void installCaches(Parser parser) {
        parser.setInterpreter(new ParserATNSimulator(parser, atn, decisionToDFA, predictionContextCache));
    }

    private DFA[] makeDecisionToDFA(ATN atn) {
        DFA[] decisionToDFA = new DFA[atn.getNumberOfDecisions()];
        for (int i = 0, len = atn.getNumberOfDecisions(); i < len; i++) {
            decisionToDFA[i] = new DFA(atn.getDecisionState(i), i);
        }
        return decisionToDFA;
    }
}
