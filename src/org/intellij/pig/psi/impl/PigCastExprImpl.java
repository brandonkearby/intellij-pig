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

public class PigCastExprImpl extends ASTWrapperPsiElement implements PigCastExpr {

  public PigCastExprImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigIDENTIFIER getIDENTIFIER() {
    return findChildByClass(PigIDENTIFIER.class);
  }

  @Override
  @Nullable
  public PigBracketExpr getBracketExpr() {
    return findChildByClass(PigBracketExpr.class);
  }

  @Override
  @Nullable
  public PigCastExpr getCastExpr() {
    return findChildByClass(PigCastExpr.class);
  }

  @Override
  @Nullable
  public PigColRefWithoutIdentifier getColRefWithoutIdentifier() {
    return findChildByClass(PigColRefWithoutIdentifier.class);
  }

  @Override
  @Nullable
  public PigCurlyExpr getCurlyExpr() {
    return findChildByClass(PigCurlyExpr.class);
  }

  @Override
  @Nullable
  public PigFuncNameSuffix getFuncNameSuffix() {
    return findChildByClass(PigFuncNameSuffix.class);
  }

  @Override
  @Nullable
  public PigFuncNameWithoutColumns getFuncNameWithoutColumns() {
    return findChildByClass(PigFuncNameWithoutColumns.class);
  }

  @Override
  @Nullable
  public PigParenExpr getParenExpr() {
    return findChildByClass(PigParenExpr.class);
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
  public PigScalar getScalar() {
    return findChildByClass(PigScalar.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitCastExpr(this);
    else super.accept(visitor);
  }

}
