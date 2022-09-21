package org.harfbuzz;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the extents for a specified glyph. Extents must be
 * returned in an {@code hb_glyph_extents} output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphExtentsFuncT {
        BoolT onFontGetGlyphExtentsFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, GlyphExtentsT extents, jdk.incubator.foreign.MemoryAddress userData);
}
