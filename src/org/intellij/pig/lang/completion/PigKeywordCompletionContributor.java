/*
 * Copyright 2012-2013 Brandon Kearby
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.intellij.pig.lang.completion;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.patterns.ElementPattern;
import com.intellij.psi.PsiElement;
import org.intellij.pig.psi.PigTypes;

import static com.intellij.patterns.PlatformPatterns.psiComment;
import static com.intellij.patterns.PlatformPatterns.psiElement;

public class PigKeywordCompletionContributor extends CompletionContributor {
    private static final ElementPattern<PsiElement> AFTER_COLON = psiElement().afterLeaf(":");
/*
    private static final ElementPattern<PsiElement> AFTER_REGISTER = psiElement().afterSibling(psiElement(PigTypes.PIG_REGISTER)).and(
            psiComment().inside(psiElement(PigTypes.PIG_QUOTEDSTRING))
    );
*/

    public PigKeywordCompletionContributor() {
        extend(CompletionType.BASIC, AFTER_COLON, new PigTypeCompletionProvider());
//        extend(CompletionType.BASIC, AFTER_REGISTER, new PigFileSystemCompletionProvider());
    }

    @Override
    public void fillCompletionVariants(CompletionParameters parameters, CompletionResultSet result) {
        super.fillCompletionVariants(parameters, result);
    }
}