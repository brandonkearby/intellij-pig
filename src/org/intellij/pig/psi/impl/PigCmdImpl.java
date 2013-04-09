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

public class PigCmdImpl extends ASTWrapperPsiElement implements PigCmd {

  public PigCmdImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<PigCacheClause> getCacheClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigCacheClause.class);
  }

  @Override
  @NotNull
  public List<PigErrorClause> getErrorClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigErrorClause.class);
  }

  @Override
  @NotNull
  public List<PigInputClause> getInputClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigInputClause.class);
  }

  @Override
  @NotNull
  public List<PigOutputClause> getOutputClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigOutputClause.class);
  }

  @Override
  @NotNull
  public List<PigShipClause> getShipClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigShipClause.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitCmd(this);
    else super.accept(visitor);
  }

}
