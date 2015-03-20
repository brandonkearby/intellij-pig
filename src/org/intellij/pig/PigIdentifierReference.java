package org.intellij.pig;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import org.intellij.pig.psi.PigFile;
import org.intellij.pig.psi.PigIdentifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class PigIdentifierReference extends PsiReferenceBase<PsiElement> implements PsiReference {
    private final String _name;

    public PigIdentifierReference(PsiElement element, TextRange range) {
        super(element, range);
        _name = element.getText().substring(range.getStartOffset(), range.getEndOffset());
    }

/**
    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        Project project = myElement.getProject();
        final List<PigIdentifier> identifiers = IdentifierUtils.findIdentifier(project, _name);
        List<ResolveResult> results = new ArrayList<ResolveResult>();
        for (PigIdentifier identifier : identifiers) {
            results.add(new PsiElementResolveResult(identifier));
        }
        return results.toArray(new ResolveResult[results.size()]);
    }


    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }
 **/

    @Nullable
    @Override
    public PsiElement resolve() {
        return IdentifierUtils.findDefinition((PigFile) myElement.getContainingFile(), _name);
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        Project project = myElement.getProject();
        List<PigIdentifier> identifiers = IdentifierUtils.findIdentifiers(project);
        List<LookupElement> variants = new ArrayList<LookupElement>();
        for (final PigIdentifier identifier : identifiers) {
            if (identifier.getName() != null && identifier.getName().length() > 0) {
                variants.add(LookupElementBuilder.create(identifier).
                                withIcon(PigIcons.FILE).
                                withTypeText(identifier.getContainingFile().getName())
                );
            }
        }
        return variants.toArray();
    }
}
