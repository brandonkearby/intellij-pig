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

public class PigForeachStatementImpl extends ASTWrapperPsiElement implements PigForeachStatement {

  public PigForeachStatementImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public PigForeachAssignment getForeachAssignment() {
    return findNotNullChildByClass(PigForeachAssignment.class);
  }

  @Override
  @Nullable
  public PigForeachGenerateSimple getForeachGenerateSimple() {
    return findChildByClass(PigForeachGenerateSimple.class);
  }

  @Override
  @Nullable
  public PigForeachPlanComplex getForeachPlanComplex() {
    return findChildByClass(PigForeachPlanComplex.class);
  }

  @Override
  @Nullable
  public PigParallelClause getParallelClause() {
    return findChildByClass(PigParallelClause.class);
  }

  @Override
  @NotNull
  public PigRel getRel() {
    return findNotNullChildByClass(PigRel.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitForeachStatement(this);
    else super.accept(visitor);
  }

}
