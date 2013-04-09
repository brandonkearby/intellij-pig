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

public class PigSplitClauseImpl extends ASTWrapperPsiElement implements PigSplitClause {

  public PigSplitClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public PigRel getRel() {
    return findNotNullChildByClass(PigRel.class);
  }

  @Override
  @NotNull
  public List<PigSplitBranch> getSplitBranchList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigSplitBranch.class);
  }

  @Override
  @Nullable
  public PigSplitOtherwise getSplitOtherwise() {
    return findChildByClass(PigSplitOtherwise.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitSplitClause(this);
    else super.accept(visitor);
  }

}
