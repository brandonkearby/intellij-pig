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

public class PigCubeClauseImpl extends ASTWrapperPsiElement implements PigCubeClause {

  public PigCubeClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<PigCubeRollupList> getCubeRollupListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigCubeRollupList.class);
  }

  @Override
  @NotNull
  public PigRel getRel() {
    return findNotNullChildByClass(PigRel.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitCubeClause(this);
    else super.accept(visitor);
  }

}
