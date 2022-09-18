package org.harfbuzz;

/**
 * A virtual method for the {@link org.harfbuzz.unicode_funcs_t} structure.
 * 
 * This method should decompose an input Unicode code point,
 * returning the two decomposed code points in {@link org.harfbuzz.codepoint_t} output parameters (if successful). The method must return an
 * {@link org.harfbuzz.bool_t} indicating the success of the composition.
 */
@FunctionalInterface
public interface UnicodeDecomposeFuncT {
        BoolT onUnicodeDecomposeFuncT(UnicodeFuncsT ufuncs, CodepointT ab, CodepointT a, CodepointT b, jdk.incubator.foreign.MemoryAddress userData);
}
