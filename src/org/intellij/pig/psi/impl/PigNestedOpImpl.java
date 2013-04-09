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

public class PigNestedOpImpl extends ASTWrapperPsiElement implements PigNestedOp {

  public PigNestedOpImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigNestedCross getNestedCross() {
    return findChildByClass(PigNestedCross.class);
  }

  @Override
  @Nullable
  public PigNestedDistinct getNestedDistinct() {
    return findChildByClass(PigNestedDistinct.class);
  }

  @Override
  @Nullable
  public PigNestedFilter getNestedFilter() {
    return findChildByClass(PigNestedFilter.class);
  }

  @Override
  @Nullable
  public PigNestedForeach getNestedForeach() {
    return findChildByClass(PigNestedForeach.class);
  }

  @Override
  @Nullable
  public PigNestedLimit getNestedLimit() {
    return findChildByClass(PigNestedLimit.class);
  }

  @Override
  @Nullable
  public PigNestedSort getNestedSort() {
    return findChildByClass(PigNestedSort.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitNestedOp(this);
    else super.accept(visitor);
  }

}
