package org.intellij.pig;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.JavaPsiFacade;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.search.GlobalSearchScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 *
 */
public class JavaClassReferenceWrapper  extends PsiReferenceBase<PsiElement> implements PsiReference {

  private final String _fullClassName;

  public JavaClassReferenceWrapper(PsiElement element, String fullClassName) {
    super(element, TextRange.from(0, fullClassName.length()));
    _fullClassName = fullClassName;
  }

  @Nullable
  @Override
  public PsiElement resolve() {
    return JavaPsiFacade.getInstance(myElement.getProject()).findClass(_fullClassName, GlobalSearchScope.allScope(myElement.getProject()));
  }

  @NotNull
  @Override
  public Object[] getVariants() {
    return new Object[0];
  }
}
