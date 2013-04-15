package org.intellij.pig.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.pig.psi.PigPsiElement;

public class PigPsiElementImpl extends ASTWrapperPsiElement implements PigPsiElement {
    public PigPsiElementImpl(ASTNode node) {
        super(node);
    }

    @Override
    public String toString() {
        return getNode().getElementType().toString();
    }

}