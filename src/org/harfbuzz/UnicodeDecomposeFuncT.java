package org.harfbuzz;

/**
 * A virtual method for the #hb_unicode_funcs_t structure.
 * 
 * This method should decompose an input Unicode code point,
 * returning the two decomposed code points in #hb_codepoint_t
 * output parameters (if successful). The method must return an
 * #hb_bool_t indicating the success of the composition.
 */
@FunctionalInterface
public interface UnicodeDecomposeFuncT {
        BoolT onUnicodeDecomposeFuncT(UnicodeFuncsT ufuncs, CodepointT ab, CodepointT a, CodepointT b, jdk.incubator.foreign.MemoryAddress userData);
}
