package org.harfbuzz;

/**
 * A virtual method for the {@link org.harfbuzz.font_funcs_t} of an {@link org.harfbuzz.font_t} object.
 * 
 * This method should retrieve the glyph ID for a specified Unicode code point
 * followed by a specified Variation Selector code point. Glyph IDs must be
 * returned in a {@link org.harfbuzz.codepoint_t} output parameter.
 */
@FunctionalInterface
public interface FontGetVariationGlyphFuncT {
        BoolT onFontGetVariationGlyphFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT unicode, CodepointT variationSelector, CodepointT glyph, jdk.incubator.foreign.MemoryAddress userData);
}
