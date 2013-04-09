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

public class PigRelImpl extends ASTWrapperPsiElement implements PigRel {

  public PigRelImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigIDENTIFIER getIDENTIFIER() {
    return findChildByClass(PigIDENTIFIER.class);
  }

  @Override
  @Nullable
  public PigForeachPlanComplex getForeachPlanComplex() {
    return findChildByClass(PigForeachPlanComplex.class);
  }

  @Override
  @Nullable
  public PigForeachPlanSimple getForeachPlanSimple() {
    return findChildByClass(PigForeachPlanSimple.class);
  }

  @Override
  @Nullable
  public PigOpClause getOpClause() {
    return findChildByClass(PigOpClause.class);
  }

  @Override
  @Nullable
  public PigParallelClause getParallelClause() {
    return findChildByClass(PigParallelClause.class);
  }

  @Override
  @Nullable
  public PigPreviousRel getPreviousRel() {
    return findChildByClass(PigPreviousRel.class);
  }

  @Override
  @Nullable
  public PigRel getRel() {
    return findChildByClass(PigRel.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitRel(this);
    else super.accept(visitor);
  }

}
