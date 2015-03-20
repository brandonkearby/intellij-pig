package org.intellij.pig.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import org.intellij.pig.PigFileType;

/**
 *
 */
public class PigElementFactory {
    public static PigIdentifier createIdentifier(Project project, String name) {
        final PigFile file = createFile(project, name);
        return (PigIdentifier) file.getFirstChild().getFirstChild().getFirstChild();
    }

    private static PigFile createFile(Project project, String text) {
        String name = "dummy.pig";
        return (PigFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, PigFileType.INSTANCE, text + " = bogus;");
    }
}
