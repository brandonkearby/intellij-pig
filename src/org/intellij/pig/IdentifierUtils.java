package org.intellij.pig;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import org.intellij.pig.psi.PigFile;
import org.intellij.pig.psi.PigIdentifier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Utilities to help with tracking identifier / variable names
 */
public class IdentifierUtils {
    /**
     * Find a single identifier within the entire project
     * @param project
     * @param identifierName
     * @return
     */
    public static List<PigIdentifier> findIdentifier(Project project, String identifierName) {
        List<PigIdentifier> result = null;
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, PigFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            PigFile pigFile = (PigFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (pigFile != null) {
                Collection<PigIdentifier> identifiers = PsiTreeUtil.findChildrenOfType(pigFile, PigIdentifier.class);
                for (PigIdentifier identifier : identifiers) {
                    if (identifierName.equals(identifier.getName())) {
                        if (result == null) {
                            result = new ArrayList<PigIdentifier>(1);
                        }
                        result.add(identifier);
                    }
                }
            }
        }
        return result != null ? result : Collections.<PigIdentifier>emptyList();
    }

    /**
     * Find the definition of a variable within the specified file
     * @param file file to search in
     * @param identifierName identifier to look for
     * @return reference to actual PigIdentifier where that name was defined
     */
    public static PigIdentifier findDefinition(PigFile file, String identifierName) {
        Collection<PigIdentifier> identifiers = PsiTreeUtil.findChildrenOfType(file, PigIdentifier.class);
        for (PigIdentifier identifier : identifiers) {
            if (identifierName.equals(identifier.getName())) {
                // TODO this assumes that the first time we see an identifier is the definition, where first
                // is decided by the findChildrenOfType method.  We should probably do something smarter, like
                // identifying that it is within an assignment statement in the bnf
                return identifier;
            }
        }
        return null;
    }

    // Find all identifiers within the project
    public static List<PigIdentifier> findIdentifiers(Project project) {
        List<PigIdentifier> result = new ArrayList<PigIdentifier>();
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, PigFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            PigFile pigFile = (PigFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (pigFile != null) {
                Collection<PigIdentifier> identifiers = PsiTreeUtil.findChildrenOfType(pigFile, PigIdentifier.class);
                result.addAll(identifiers);
            }
        }
        return result;
    }
}
