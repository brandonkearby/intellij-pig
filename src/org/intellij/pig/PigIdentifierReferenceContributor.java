package org.intellij.pig;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import org.intellij.pig.psi.PigElementType;
import org.intellij.pig.psi.PigIdentifier;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class PigIdentifierReferenceContributor extends PsiReferenceContributor {
    @Override
    public void registerReferenceProviders(PsiReferenceRegistrar registrar) {
    }
}
