package org.harfbuzz;

@FunctionalInterface
public interface UnicodeMirroringFuncT {

    /**
     * A virtual method for the #hb_unicode_funcs_t structure.
     * 
     * This method should retrieve the Bi-Directional Mirroring Glyph
     * code point for a specified Unicode code point.
     * 
     * <note>Note: If a code point does not have a specified
     * Bi-Directional Mirroring Glyph defined, the method should
     * return the original code point.</note>
     */
    public CodepointT onUnicodeMirroringFuncT(UnicodeFuncsT ufuncs, CodepointT unicode, jdk.incubator.foreign.MemoryAddress userData);
}
