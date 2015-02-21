package org.intellij.pig.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.pig.psi.PigNamedElement;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public abstract class PigNamedElementImpl extends ASTWrapperPsiElement implements PigNamedElement {
    public PigNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
