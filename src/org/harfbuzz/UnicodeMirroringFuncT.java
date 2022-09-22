package org.harfbuzz;

/**
 * A virtual method for the {@link unicode_funcs_t} structure.
 * <p>
 * This method should retrieve the Bi-Directional Mirroring Glyph
 * code point for a specified Unicode code point.
 * <p>
 * &lt;note&gt;Note: If a code point does not have a specified
 * Bi-Directional Mirroring Glyph defined, the method should
 * return the original code point.&lt;/note&gt;
 */
@FunctionalInterface
public interface UnicodeMirroringFuncT {
        CodepointT onUnicodeMirroringFuncT(UnicodeFuncsT ufuncs, CodepointT unicode, java.lang.foreign.MemoryAddress userData);
}
