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

public class PigOpClauseImpl extends ASTWrapperPsiElement implements PigOpClause {

  public PigOpClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigCrossClause getCrossClause() {
    return findChildByClass(PigCrossClause.class);
  }

  @Override
  @Nullable
  public PigCubeClause getCubeClause() {
    return findChildByClass(PigCubeClause.class);
  }

  @Override
  @Nullable
  public PigDefineClause getDefineClause() {
    return findChildByClass(PigDefineClause.class);
  }

  @Override
  @Nullable
  public PigDistinctClause getDistinctClause() {
    return findChildByClass(PigDistinctClause.class);
  }

  @Override
  @Nullable
  public PigFilterClause getFilterClause() {
    return findChildByClass(PigFilterClause.class);
  }

  @Override
  @Nullable
  public PigGroupClause getGroupClause() {
    return findChildByClass(PigGroupClause.class);
  }

  @Override
  @Nullable
  public PigIllustrateClause getIllustrateClause() {
    return findChildByClass(PigIllustrateClause.class);
  }

  @Override
  @Nullable
  public PigJoinClause getJoinClause() {
    return findChildByClass(PigJoinClause.class);
  }

  @Override
  @Nullable
  public PigLimitClause getLimitClause() {
    return findChildByClass(PigLimitClause.class);
  }

  @Override
  @Nullable
  public PigLoadClause getLoadClause() {
    return findChildByClass(PigLoadClause.class);
  }

  @Override
  @Nullable
  public PigMrClause getMrClause() {
    return findChildByClass(PigMrClause.class);
  }

  @Override
  @Nullable
  public PigOrderClause getOrderClause() {
    return findChildByClass(PigOrderClause.class);
  }

  @Override
  @Nullable
  public PigRankClause getRankClause() {
    return findChildByClass(PigRankClause.class);
  }

  @Override
  @Nullable
  public PigRegisterClause getRegisterClause() {
    return findChildByClass(PigRegisterClause.class);
  }

  @Override
  @Nullable
  public PigSampleClause getSampleClause() {
    return findChildByClass(PigSampleClause.class);
  }

  @Override
  @Nullable
  public PigSetClause getSetClause() {
    return findChildByClass(PigSetClause.class);
  }

  @Override
  @Nullable
  public PigStoreClause getStoreClause() {
    return findChildByClass(PigStoreClause.class);
  }

  @Override
  @Nullable
  public PigStreamClause getStreamClause() {
    return findChildByClass(PigStreamClause.class);
  }

  @Override
  @Nullable
  public PigUnionClause getUnionClause() {
    return findChildByClass(PigUnionClause.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitOpClause(this);
    else super.accept(visitor);
  }

}
