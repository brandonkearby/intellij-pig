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

public class PigTypeImpl extends ASTWrapperPsiElement implements PigType {

  public PigTypeImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigExplicitType getExplicitType() {
    return findChildByClass(PigExplicitType.class);
  }

  @Override
  @Nullable
  public PigImplicitType getImplicitType() {
    return findChildByClass(PigImplicitType.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitType(this);
    else super.accept(visitor);
  }

}
