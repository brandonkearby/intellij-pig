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

public class PigGroupClauseImpl extends ASTWrapperPsiElement implements PigGroupClause {

  public PigGroupClauseImpl(ASTNode node) {
    super(node);
  }

  @Override
  @NotNull
  public List<PigGroupItem> getGroupItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PigGroupItem.class);
  }

  @Override
  @Nullable
  public PigPartitionClause getPartitionClause() {
    return findChildByClass(PigPartitionClause.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitGroupClause(this);
    else super.accept(visitor);
  }

}
