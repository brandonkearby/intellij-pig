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

public class PigAfterLeftParenImpl extends ASTWrapperPsiElement implements PigAfterLeftParen {

  public PigAfterLeftParenImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigCastExpr getCastExpr() {
    return findChildByClass(PigCastExpr.class);
  }

  @Override
  @Nullable
  public PigColRange getColRange() {
    return findChildByClass(PigColRange.class);
  }

  @Override
  @Nullable
  public PigExplicitTypeCast getExplicitTypeCast() {
    return findChildByClass(PigExplicitTypeCast.class);
  }

  @Override
  @NotNull
  public List<PigExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigExpr.class);
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

  @Override
  @Nullable
  public PigUnaryCond getUnaryCond() {
    return findChildByClass(PigUnaryCond.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitAfterLeftParen(this);
    else super.accept(visitor);
  }

}
