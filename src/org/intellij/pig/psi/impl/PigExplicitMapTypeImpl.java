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

public class PigExplicitMapTypeImpl extends ASTWrapperPsiElement implements PigExplicitMapType {

  public PigExplicitMapTypeImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public PigImplicitMapType getImplicitMapType() {
    return findNotNullChildByClass(PigImplicitMapType.class);
  }

  @Override
  @NotNull
  public PsiElement getMap() {
    return findNotNullChildByType(PIG_MAP);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitExplicitMapType(this);
    else super.accept(visitor);
  }

}
