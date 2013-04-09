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

public class PigTryImplicitMapCastImpl extends ASTWrapperPsiElement implements PigTryImplicitMapCast {

  public PigTryImplicitMapCastImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigAfterLeftParen getAfterLeftParen() {
    return findChildByClass(PigAfterLeftParen.class);
  }

  @Override
  @Nullable
  public PigCastExpr getCastExpr() {
    return findChildByClass(PigCastExpr.class);
  }

  @Override
  @Nullable
  public PigImplicitMapType getImplicitMapType() {
    return findChildByClass(PigImplicitMapType.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitTryImplicitMapCast(this);
    else super.accept(visitor);
  }

}
