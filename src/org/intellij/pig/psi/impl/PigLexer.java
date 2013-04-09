package org.intellij.pig.parser;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.LookAheadLexer;
import com.intellij.lexer.MergingLexerAdapter;
import com.intellij.psi.tree.TokenSet;
import org.intellij.pig._PigLexer;

public class PigLexer extends LookAheadLexer {

    public PigLexer() {
        super(new MergingLexerAdapter(new FlexAdapter(new _PigLexer()), TokenSet.EMPTY));
    }

}
