// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigJoinClause extends PsiElement {

  @NotNull
  PigJoinSubClause getJoinSubClause();

  @Nullable
  PigJoinType getJoinType();

  @Nullable
  PigPartitionClause getPartitionClause();

}
