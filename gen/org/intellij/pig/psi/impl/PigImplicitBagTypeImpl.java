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

public class PigImplicitBagTypeImpl extends ASTWrapperPsiElement implements PigImplicitBagType {

  public PigImplicitBagTypeImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigIDENTIFIER getIDENTIFIER() {
    return findChildByClass(PigIDENTIFIER.class);
  }

  @Override
  @Nullable
  public PigFieldDefList getFieldDefList() {
    return findChildByClass(PigFieldDefList.class);
  }

  @Override
  @Nullable
  public PsiElement getTuple() {
    return findChildByType(PIG_TUPLE);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitImplicitBagType(this);
    else super.accept(visitor);
  }

}
