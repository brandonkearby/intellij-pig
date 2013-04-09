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

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.intellij.pig.parser.PigLexer;
import org.intellij.pig.parser.PigParser;
import org.intellij.pig.psi.PigFile;
import org.intellij.pig.psi.PigTokenType;
import org.intellij.pig.psi.PigTypes;
import org.jetbrains.annotations.NotNull;

public class PigParserDefinition implements ParserDefinition{
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);

    public static final IFileElementType FILE = new IFileElementType(Language.<PigLanguage>findInstance(PigLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new PigLexer();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return PigTokenType.getCommentSet();
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.create(PigTypes.PIG_QUOTEDSTRING);
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new PigParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new PigFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return PigTypes.Factory.createElement(node);
    }
}