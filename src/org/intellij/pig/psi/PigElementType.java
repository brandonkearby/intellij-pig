package org.intellij.pig.psi;

import com.intellij.psi.tree.IElementType;
import org.intellij.pig.PigLanguage;

public class PigElementType extends IElementType {
    public PigElementType(String debugName) {
        super(debugName, PigLanguage.INSTANCE);
    }
}