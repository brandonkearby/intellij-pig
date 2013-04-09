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

public class PigExplicitBagTypeCastImpl extends ASTWrapperPsiElement implements PigExplicitBagTypeCast {

  public PigExplicitBagTypeCastImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<PigExplicitTypeCast> getExplicitTypeCastList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigExplicitTypeCast.class);
  }

  @Override
  @NotNull
  public PsiElement getBag() {
    return findNotNullChildByType(PIG_BAG);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitExplicitBagTypeCast(this);
    else super.accept(visitor);
  }

}
