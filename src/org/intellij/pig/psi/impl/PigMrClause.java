// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigMrClause extends PsiElement {

  @NotNull
  PigLoadClause getLoadClause();

  @Nullable
  PigPathList getPathList();

  @NotNull
  PigStoreClause getStoreClause();

}
