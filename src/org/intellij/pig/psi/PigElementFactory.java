package org.intellij.pig.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.util.PsiTreeUtil;
import org.intellij.pig.PigFileType;

/**
 *
 */
public class PigElementFactory {
    public static PigIdentifier createIdentifier(Project project, String name) {
        final PigFile file = createFile(project, String.format("%s = bogus;", name));
        return (PigIdentifier) file.getFirstChild().getFirstChild().getFirstChild();
    }

    public static PigFuncClause createFuncClause(Project project, String fullClassName, String args) {
      PigFile file = createFile(project, String.format("DEFINE bogus %s(%s);", fullClassName, args));
      return PsiTreeUtil.findChildOfType(file, PigFuncClause.class);
      //return (PigFuncClause) file.getFirstChild().getChildren()[2];
    }

    private static PigFile createFile(Project project, String text) {
        String name = "dummy.pig";
        return (PigFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, PigFileType.INSTANCE, text);
    }
}
