package org.intellij.pig.psi.impl;

import org.intellij.pig.psi.PigIdentifier;

/**
 * Contains helper methods that get added to the generated type classes
 * See PigIdentifier.java and the definition in Pig.bnf for an example
 * https://confluence.jetbrains.com/display/IntelliJIDEA/PSI+Helpers+and+Utilities
 */
public class PigPsiImplUtil {

    public static String getName(PigIdentifier element) {
        return element.getNode().getText();
    }
}
