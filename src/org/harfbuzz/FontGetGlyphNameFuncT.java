package org.harfbuzz;

/**
 * A virtual method for the {@link org.harfbuzz.font_funcs_t} of an {@link org.harfbuzz.font_t} object.
 * 
 * This method should retrieve the glyph name that corresponds to a
 * glyph ID. The name should be returned in a string output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphNameFuncT {
        BoolT onFontGetGlyphNameFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, java.lang.String[] name, int size, jdk.incubator.foreign.MemoryAddress userData);
}
