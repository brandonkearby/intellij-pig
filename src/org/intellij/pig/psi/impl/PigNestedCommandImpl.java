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

public class PigNestedCommandImpl extends ASTWrapperPsiElement implements PigNestedCommand {

  public PigNestedCommandImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<PigIDENTIFIER> getIDENTIFIERList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigIDENTIFIER.class);
  }

  @Override
  @Nullable
  public PigColRef getColRef() {
    return findChildByClass(PigColRef.class);
  }

  @Override
  @Nullable
  public PigColRefList getColRefList() {
    return findChildByClass(PigColRefList.class);
  }

  @Override
  @Nullable
  public PigExpr getExpr() {
    return findChildByClass(PigExpr.class);
  }

  @Override
  @Nullable
  public PigNestedOp getNestedOp() {
    return findChildByClass(PigNestedOp.class);
  }

  @Override
  @Nullable
  public PigNestedProj getNestedProj() {
    return findChildByClass(PigNestedProj.class);
  }

  @Override
  @Nullable
  public PsiElement getInput() {
    return findChildByType(PIG_INPUT);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitNestedCommand(this);
    else super.accept(visitor);
  }

}
