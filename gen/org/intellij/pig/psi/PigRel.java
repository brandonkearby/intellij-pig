// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigRel extends PsiElement {

  @Nullable
  PigIDENTIFIER getIDENTIFIER();

  @Nullable
  PigForeachGenerateSimple getForeachGenerateSimple();

  @Nullable
  PigForeachPlanComplex getForeachPlanComplex();

  @Nullable
  PigOpClause getOpClause();

  @Nullable
  PigParallelClause getParallelClause();

  @Nullable
  PigPreviousRel getPreviousRel();

  @Nullable
  PigRel getRel();

}
