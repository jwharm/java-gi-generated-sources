package org.harfbuzz;

/**
 * A virtual method for the #hb_unicode_funcs_t structure.
 * 
 * This method should compose a sequence of two input Unicode code
 * points by canonical equivalence, returning the composed code
 * point in a #hb_codepoint_t output parameter (if successful).
 * The method must return an #hb_bool_t indicating the success
 * of the composition.
 */
@FunctionalInterface
public interface UnicodeComposeFuncT {
        BoolT onUnicodeComposeFuncT(UnicodeFuncsT ufuncs, CodepointT a, CodepointT b, CodepointT ab, jdk.incubator.foreign.MemoryAddress userData);
}
