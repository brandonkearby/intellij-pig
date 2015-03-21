/*
package org.intellij.pig.lang.completion;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.util.ProcessingContext;
import org.intellij.pig.psi.impl.PigPsiImplUtil;
import org.intellij.pig.psi.PigQUOTEDSTRING;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FilenameFilter;

public class PigFileSystemCompletionProvider extends CompletionProvider<CompletionParameters> {
    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters, ProcessingContext context, @NotNull CompletionResultSet result) {
        if (!(parameters.getPosition().getNode().getElementType() instanceof PigQUOTEDSTRING)) {
            return;
        }
        PigQUOTEDSTRING quotedstring = (PigQUOTEDSTRING) parameters.getPosition().getNode();

        String text = PigPsiImplUtil.getQuotedString(quotedstring);
        File file = new File(text);
        if (file.isDirectory()) {
            File[] files = file.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File file, String s) {
                    return file.getName().toLowerCase().endsWith(".jar");
                }
            });
            for (File f : files) {
                result.addElement(LookupElementBuilder.create(f.getName()));
            }
        }
    }
}
*/
