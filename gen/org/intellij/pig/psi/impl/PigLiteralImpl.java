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

public class PigLiteralImpl extends ASTWrapperPsiElement implements PigLiteral {

  public PigLiteralImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigLiteralBag getLiteralBag() {
    return findChildByClass(PigLiteralBag.class);
  }

  @Override
  @Nullable
  public PigLiteralMap getLiteralMap() {
    return findChildByClass(PigLiteralMap.class);
  }

  @Override
  @Nullable
  public PigLiteralTuple getLiteralTuple() {
    return findChildByClass(PigLiteralTuple.class);
  }

  @Override
  @Nullable
  public PigScalar getScalar() {
    return findChildByClass(PigScalar.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitLiteral(this);
    else super.accept(visitor);
  }

}
