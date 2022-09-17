package org.harfbuzz;

/**
 * A virtual method for the #hb_unicode_funcs_t structure.
 * 
 * This method should retrieve the Bi-Directional Mirroring Glyph
 * code point for a specified Unicode code point.
 * 
 * &#60;note&#62;Note: If a code point does not have a specified
 * Bi-Directional Mirroring Glyph defined, the method should
 * return the original code point.&#60;/note&#62;
 */
@FunctionalInterface
public interface UnicodeMirroringFuncT {
        CodepointT onUnicodeMirroringFuncT(UnicodeFuncsT ufuncs, CodepointT unicode, jdk.incubator.foreign.MemoryAddress userData);
}
