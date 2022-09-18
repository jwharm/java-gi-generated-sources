package org.harfbuzz;

/**
 * A virtual method for the {@link org.harfbuzz.font_funcs_t} of an {@link org.harfbuzz.font_t} object.
 * 
 * This method should retrieve the glyph ID for a specified Unicode code point
 * font, with an optional variation selector.
 */
@FunctionalInterface
public interface FontGetGlyphFuncT {
        BoolT onFontGetGlyphFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT unicode, CodepointT variationSelector, CodepointT glyph, jdk.incubator.foreign.MemoryAddress userData);
}
