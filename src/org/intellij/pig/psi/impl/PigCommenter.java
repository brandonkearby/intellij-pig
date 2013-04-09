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

import com.intellij.lang.CodeDocumentationAwareCommenter;
import com.intellij.psi.PsiComment;
import com.intellij.psi.tree.IElementType;
import org.intellij.pig.psi.PigTypes;
import org.jetbrains.annotations.Nullable;

public class PigCommenter implements CodeDocumentationAwareCommenter {

    @Nullable
    public String getLineCommentPrefix() {
        return "--";
    }

    @Nullable
    @Override
    public String getBlockCommentPrefix() {
        return "/*";
    }

    @Nullable
    @Override
    public String getBlockCommentSuffix() {
        return "*/";
    }

    public String getCommentedBlockCommentPrefix() {
        return "*";
    }

    public String getCommentedBlockCommentSuffix() {
        return null;
    }

    @Nullable
    @Override
    public IElementType getLineCommentTokenType() {
        return PigTypes.PIG_END_OF_LINE_COMMENT;
    }

    @Nullable
    @Override
    public IElementType getBlockCommentTokenType() {
        return PigTypes.PIG_C_STYLE_COMMENT;
    }

    @Nullable
    @Override
    public IElementType getDocumentationCommentTokenType() {
        return null;
    }

    @Nullable
    @Override
    public String getDocumentationCommentPrefix() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Nullable
    @Override
    public String getDocumentationCommentLinePrefix() {
        return "*";  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Nullable
    @Override
    public String getDocumentationCommentSuffix() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isDocumentationComment(PsiComment element) {
        return element.getText().startsWith(getDocumentationCommentPrefix());
    }
}