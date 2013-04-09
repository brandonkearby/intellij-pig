
package org.intellij.pig.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.intellij.pig.PigFileType;
import org.intellij.pig.PigLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class PigFile extends PsiFileBase {
    public PigFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PigLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PigFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Pig File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}