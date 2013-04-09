// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigNestedOp extends PsiElement {

  @Nullable
  PigNestedCross getNestedCross();

  @Nullable
  PigNestedDistinct getNestedDistinct();

  @Nullable
  PigNestedFilter getNestedFilter();

  @Nullable
  PigNestedForeach getNestedForeach();

  @Nullable
  PigNestedLimit getNestedLimit();

  @Nullable
  PigNestedSort getNestedSort();

}
