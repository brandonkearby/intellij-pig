package org.intellij.pig.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import org.intellij.pig.PigIdentifierReference;
import org.intellij.pig.psi.PigElementFactory;
import org.intellij.pig.psi.PigIdentifier;
import org.intellij.pig.psi.PigTypes;

/**
 * Contains helper methods that get added to the generated type classes
 * See PigIdentifier.java and the definition for identifier in Pig.bnf for an example
 * https://confluence.jetbrains.com/display/IntelliJIDEA/PSI+Helpers+and+Utilities
 */
public class PigPsiImplUtil {
    public static String getName(PigIdentifier element) {
        return element.getNode().getText();
    }

    public static PsiElement setName(PigIdentifier element, String newName) {
        return element.replace(PigElementFactory.createIdentifier(element.getProject(), newName));
    }

    public static PsiElement getNameIdentifier(PigIdentifier element) {
        return element;
    }

    public static PsiReference getReference(PigIdentifier element) {
        String name = getName(element);
        return new PigIdentifierReference(element, name == null ? TextRange.EMPTY_RANGE : TextRange.from(0, name.length()));
    }
}
