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

public class PigFlattenGeneratedItemImpl extends ASTWrapperPsiElement implements PigFlattenGeneratedItem {

  public PigFlattenGeneratedItemImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigFlattenClause getFlattenClause() {
    return findChildByClass(PigFlattenClause.class);
  }

  @Override
  @Nullable
  public PigGenerateAsClause getGenerateAsClause() {
    return findChildByClass(PigGenerateAsClause.class);
  }

  @Override
  @Nullable
  public PigRealArg getRealArg() {
    return findChildByClass(PigRealArg.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitFlattenGeneratedItem(this);
    else super.accept(visitor);
  }

}
