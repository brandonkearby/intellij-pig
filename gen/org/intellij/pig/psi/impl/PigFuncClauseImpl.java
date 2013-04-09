// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.pig.psi.PigTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.pig.psi.*;

public class PigFuncClauseImpl extends ASTWrapperPsiElement implements PigFuncClause {

  public PigFuncClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigFuncArgs getFuncArgs() {
    return findChildByClass(PigFuncArgs.class);
  }

  @Override
  @NotNull
  public PigFuncName getFuncName() {
    return findNotNullChildByClass(PigFuncName.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitFuncClause(this);
    else super.accept(visitor);
  }

}
