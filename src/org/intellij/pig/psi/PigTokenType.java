package org.intellij.pig.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.intellij.pig.PigLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PigTokenType extends IElementType {

    public static TokenSet getDataTypes() {
        return TokenSet.create(
                PigTypes.PIG_BAG, PigTypes.PIG_BYTEARRAY, PigTypes.PIG_CHARARRAY, PigTypes.PIG_DOUBLE,
                PigTypes.PIG_FLOAT, PigTypes.PIG_INT, PigTypes.PIG_LONG, PigTypes.PIG_MAP, PigTypes.PIG_TUPLE);
    }

    public static TokenSet getCommentSet() {
        return TokenSet.create(PigTypes.PIG_DOC_COMMENT, PigTypes.PIG_TRADITIONAL_COMMENT, PigTypes.PIG_END_OF_LINE_COMMENT);
    }

    public PigTokenType(@NotNull @NonNls String debugName) {
        super(debugName, PigLanguage.INSTANCE);
    }

}