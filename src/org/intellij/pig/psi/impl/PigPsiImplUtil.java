package org.intellij.pig.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.JavaPsiFacade;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.JavaClassReference;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.JavaClassReferenceProvider;
import com.intellij.psi.search.GlobalSearchScope;
import java.util.List;
import org.intellij.pig.JavaClassReferenceWrapper;
import org.intellij.pig.PigIdentifierReference;
import org.intellij.pig.psi.PigEid;
import org.intellij.pig.psi.PigElementFactory;
import org.intellij.pig.psi.PigFuncClause;
import org.intellij.pig.psi.PigFuncName;
import org.intellij.pig.psi.PigIdentifier;
import org.intellij.pig.psi.PigTypes;

/**
 * Contains helper methods that get added to the generated type classes
 * See PigIdentifier.java and the definition for identifier in Pig.bnf for an example
 * https://confluence.jetbrains.com/display/IntelliJIDEA/PSI+Helpers+and+Utilities
 */
public class PigPsiImplUtil {

    // This one is generic and common to all
    public static PsiElement getNameIdentifier(PsiElement element) {
      return element;
    }

  /**
   * Pig Identifier
   */
    public static String getName(PigIdentifier element) {
        return element.getNode().getText();
    }

    public static PsiElement setName(PigIdentifier element, String newName) {
        return element.replace(PigElementFactory.createIdentifier(element.getProject(), newName));
    }

    public static PsiReference getReference(PigIdentifier element) {
      String name = getName(element);
      return new PigIdentifierReference(element, name == null ? TextRange.EMPTY_RANGE : TextRange.from(0, name.length()));
    }



    /**
     * PigFuncClause (used for java class references)
     */
    public static String getName(PigFuncClause element) {
      return element.getFuncName().getText();
    }

    public static PsiElement setName(PigFuncClause element, String newName) {
      String packageName = getPackageNameWithDot(element.getFuncName());
      String functionArgs = element.getFuncArgs() == null ? "" : element.getFuncArgs().getText();
      return element.replace(PigElementFactory.createFuncClause(element.getProject(), packageName + newName, functionArgs));
    }

    /**
     * Create the package name with a trailing .
     */
    private static String getPackageNameWithDot(PigFuncName funcName) {
      List<PigEid> packagePieces = funcName.getEidList().subList(0, funcName.getEidList().size() - 1);
      StringBuilder packageName = new StringBuilder();
      for (PigEid eid : packagePieces) {
        packageName.append(eid.getText());
        packageName.append(".");
      }
      return packageName.toString();
    }

    public static PsiReference getReference(PigFuncClause element) {
      String name = element.getFuncName().getText();
      return new JavaClassReferenceWrapper(element, name);
      //String name = getName(element);
      //return new PigIdentifierReference(element, name == null ? TextRange.EMPTY_RANGE : TextRange.from(0, name.length()));
    }
}
