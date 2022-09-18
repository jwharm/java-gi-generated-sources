package org.harfbuzz;

/**
 * A virtual method for the {@link org.harfbuzz.unicode_funcs_t} structure.
 * 
 * This method should retrieve the Bi-Directional Mirroring Glyph
 * code point for a specified Unicode code point.
 * 
 * &<code>#60</code> note&<code>#62</code> Note: If a code point does not have a specified
 * Bi-Directional Mirroring Glyph defined, the method should
 * return the original code point.&<code>#60</code> /note&<code>#62</code>
 */
@FunctionalInterface
public interface UnicodeMirroringFuncT {
        CodepointT onUnicodeMirroringFuncT(UnicodeFuncsT ufuncs, CodepointT unicode, jdk.incubator.foreign.MemoryAddress userData);
}
