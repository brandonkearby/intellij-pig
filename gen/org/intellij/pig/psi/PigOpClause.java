// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigOpClause extends PsiElement {

  @Nullable
  PigCrossClause getCrossClause();

  @Nullable
  PigCubeClause getCubeClause();

  @Nullable
  PigDefineClause getDefineClause();

  @Nullable
  PigDistinctClause getDistinctClause();

  @Nullable
  PigFilterClause getFilterClause();

  @Nullable
  PigGroupClause getGroupClause();

  @Nullable
  PigIllustrateClause getIllustrateClause();

  @Nullable
  PigJoinClause getJoinClause();

  @Nullable
  PigLimitClause getLimitClause();

  @Nullable
  PigLoadClause getLoadClause();

  @Nullable
  PigMrClause getMrClause();

  @Nullable
  PigOrderClause getOrderClause();

  @Nullable
  PigRankClause getRankClause();

  @Nullable
  PigRegisterClause getRegisterClause();

  @Nullable
  PigSampleClause getSampleClause();

  @Nullable
  PigSetClause getSetClause();

  @Nullable
  PigStoreClause getStoreClause();

  @Nullable
  PigStreamClause getStreamClause();

  @Nullable
  PigUnionClause getUnionClause();

}
