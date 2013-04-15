package org.intellij.pig.psi;

import com.intellij.psi.tree.IElementType;
import org.intellij.pig.PigLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PigElementType extends IElementType {
    public PigElementType(String debugName) {
        super(debugName, PigLanguage.INSTANCE);
    }
}