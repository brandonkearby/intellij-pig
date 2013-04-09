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
package org.intellij.pig;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.ProcessingContext;
import org.intellij.pig.psi.PigTokenType;
import org.intellij.pig.psi.PigTypes;
import org.jetbrains.annotations.NotNull;

public class PigCompletionContributor extends CompletionContributor {

    public PigCompletionContributor() {
        extend(CompletionType.SMART,
                PlatformPatterns.psiElement(PigTypes.PIG_COLON).withLanguage(PigLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        IElementType[] types = PigTokenType.getDataTypes().getTypes();
                        for (IElementType type : types) {
                            resultSet.addElement(LookupElementBuilder.create(type.toString()));
                        }
                    }
                }
        );
    }
}