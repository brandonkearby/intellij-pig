package org.intellij.pig;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import org.intellij.pig.psi.PigIdentifier;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class PigIdentifierReferenceContributor extends PsiReferenceContributor {
    @Override
    public void registerReferenceProviders(PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(PsiLiteralExpression.class),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
                        PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
                        String text = (String) literalExpression.getValue();
                        if (text != null && text.startsWith("TEST")) {
                            return new PsiReference[]{new PigIdentifierReference(element, new TextRange(8, text.length() + 1))};
                        }
                        return new PsiReference[0];
                    }
                });
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(PigIdentifier.class),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
                        PsiLiteralExpression literalExpression = (PsiLiteralExpression) element;
                        String text = (String) literalExpression.getValue();
                        return new PsiReference[]{new PigIdentifierReference(element, new TextRange(0, text.length() + 1))};
                    }
                });
    }
}
