// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigAfterLeftParen extends PsiElement {

  @Nullable
  PigCastExpr getCastExpr();

  @Nullable
  PigColRange getColRange();

  @Nullable
  PigCond getCond();

  @Nullable
  PigExplicitTypeCast getExplicitTypeCast();

  @NotNull
  List<PigExpr> getExprList();

  @NotNull
  List<PigProjection> getProjectionList();

  @NotNull
  List<PigRealArg> getRealArgList();

}
