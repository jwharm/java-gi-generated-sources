package org.harfbuzz;

@FunctionalInterface
public interface UnicodeDecomposeCompatibilityFuncT {

    /**
     * Fully decompose @u to its Unicode compatibility decomposition. The codepoints of the decomposition will be written to @decomposed.
     * The complete length of the decomposition will be returned.
     * 
     * If @u has no compatibility decomposition, zero should be returned.
     * 
     * The Unicode standard guarantees that a buffer of length #HB_UNICODE_MAX_DECOMPOSITION_LEN codepoints will always be sufficient for any
     * compatibility decomposition plus an terminating value of 0.  Consequently, @decompose must be allocated by the caller to be at least this length.  Implementations
     * of this function type must ensure that they do not write past the provided array.
     */
    public int onUnicodeDecomposeCompatibilityFuncT(UnicodeFuncsT ufuncs, CodepointT u, CodepointT decomposed, jdk.incubator.foreign.MemoryAddress userData);
}