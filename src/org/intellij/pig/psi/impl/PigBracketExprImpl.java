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

public class PigBracketExprImpl extends ASTWrapperPsiElement implements PigBracketExpr {

  public PigBracketExprImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<PigKeyvalue> getKeyvalueList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigKeyvalue.class);
  }

  @Override
  @NotNull
  public List<PigProjection> getProjectionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigProjection.class);
  }

  @Override
  @NotNull
  public List<PigRealArg> getRealArgList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigRealArg.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitBracketExpr(this);
    else super.accept(visitor);
  }

}
