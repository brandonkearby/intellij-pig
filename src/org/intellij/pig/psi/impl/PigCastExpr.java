// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigCastExpr extends PsiElement {

  @Nullable
  PigIDENTIFIER getIDENTIFIER();

  @Nullable
  PigBracketExpr getBracketExpr();

  @Nullable
  PigCastExpr getCastExpr();

  @Nullable
  PigColRefWithoutIdentifier getColRefWithoutIdentifier();

  @Nullable
  PigCurlyExpr getCurlyExpr();

  @Nullable
  PigFuncNameSuffix getFuncNameSuffix();

  @Nullable
  PigFuncNameWithoutColumns getFuncNameWithoutColumns();

  @Nullable
  PigParenExpr getParenExpr();

  @NotNull
  List<PigProjection> getProjectionList();

  @NotNull
  List<PigRealArg> getRealArgList();

  @Nullable
  PigScalar getScalar();

}
