package org.harfbuzz;

/**
 * A virtual method for the {@link unicode_funcs_t} structure.
 * <p>
 * This method should decompose an input Unicode code point,
 * returning the two decomposed code points in {@link codepoint_t}
 * output parameters (if successful). The method must return an
 * {@link bool_t} indicating the success of the composition.
 */
@FunctionalInterface
public interface UnicodeDecomposeFuncT {
        BoolT onUnicodeDecomposeFuncT(UnicodeFuncsT ufuncs, CodepointT ab, CodepointT a, CodepointT b, java.lang.foreign.MemoryAddress userData);
}
