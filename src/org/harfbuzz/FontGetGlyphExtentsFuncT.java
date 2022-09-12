package org.harfbuzz;

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 * 
 * This method should retrieve the extents for a specified glyph. Extents must be
 * returned in an #hb_glyph_extents output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphExtentsFuncT {
        BoolT onFontGetGlyphExtentsFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, GlyphExtentsT extents, jdk.incubator.foreign.MemoryAddress userData);
}
