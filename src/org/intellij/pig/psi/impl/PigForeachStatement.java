// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigForeachStatement extends PsiElement {

  @Nullable
  PigIDENTIFIER getIDENTIFIER();

  @Nullable
  PigForeachPlanComplex getForeachPlanComplex();

  @Nullable
  PigForeachPlanSimple getForeachPlanSimple();

  @Nullable
  PigParallelClause getParallelClause();

  @NotNull
  PigRel getRel();

}
