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
     * Find a single identifier
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
                PigIdentifier[] identifiers = PsiTreeUtil.getChildrenOfType(pigFile, PigIdentifier.class);
                if (identifiers != null) {
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
        }
        return result != null ? result : Collections.<PigIdentifier>emptyList();
    }

    public static List<PigIdentifier> findIdentifiers(Project project) {
        List<PigIdentifier> result = new ArrayList<PigIdentifier>();
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, PigFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            PigFile pigFile = (PigFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (pigFile != null) {
                PigIdentifier[] identifiers = PsiTreeUtil.getChildrenOfType(pigFile, PigIdentifier.class);
                if (identifiers != null) {
                    Collections.addAll(result, identifiers);
                }
            }
        }
        return result;
    }
}
