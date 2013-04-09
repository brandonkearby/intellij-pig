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

public class PigImplicitTypeImpl extends ASTWrapperPsiElement implements PigImplicitType {

  public PigImplicitTypeImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigFieldDefList getFieldDefList() {
    return findChildByClass(PigFieldDefList.class);
  }

  @Override
  @Nullable
  public PigImplicitBagType getImplicitBagType() {
    return findChildByClass(PigImplicitBagType.class);
  }

  @Override
  @Nullable
  public PigImplicitMapType getImplicitMapType() {
    return findChildByClass(PigImplicitMapType.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitImplicitType(this);
    else super.accept(visitor);
  }

}
