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

public class PigExplicitTypeCastImpl extends ASTWrapperPsiElement implements PigExplicitTypeCast {

  public PigExplicitTypeCastImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigExplicitBagTypeCast getExplicitBagTypeCast() {
    return findChildByClass(PigExplicitBagTypeCast.class);
  }

  @Override
  @Nullable
  public PigExplicitMapType getExplicitMapType() {
    return findChildByClass(PigExplicitMapType.class);
  }

  @Override
  @NotNull
  public List<PigExplicitTypeCast> getExplicitTypeCastList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigExplicitTypeCast.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitExplicitTypeCast(this);
    else super.accept(visitor);
  }

}
