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

public class PigExplicitBagTypeImpl extends ASTWrapperPsiElement implements PigExplicitBagType {

  public PigExplicitBagTypeImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public PigImplicitBagType getImplicitBagType() {
    return findNotNullChildByClass(PigImplicitBagType.class);
  }

  @Override
  @NotNull
  public PsiElement getBag() {
    return findNotNullChildByType(PIG_BAG);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitExplicitBagType(this);
    else super.accept(visitor);
  }

}
