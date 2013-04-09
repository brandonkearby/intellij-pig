// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigCmd extends PsiElement {

  @NotNull
  List<PigCacheClause> getCacheClauseList();

  @NotNull
  List<PigErrorClause> getErrorClauseList();

  @NotNull
  List<PigInputClause> getInputClauseList();

  @NotNull
  List<PigOutputClause> getOutputClauseList();

  @NotNull
  List<PigShipClause> getShipClauseList();

}
