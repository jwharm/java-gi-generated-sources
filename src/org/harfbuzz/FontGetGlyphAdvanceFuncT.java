package org.harfbuzz;

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 * 
 * This method should retrieve the advance for a specified glyph. The
 * method must return an #hb_position_t.
 */
@FunctionalInterface
public interface FontGetGlyphAdvanceFuncT {
        PositionT onFontGetGlyphAdvanceFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, jdk.incubator.foreign.MemoryAddress userData);
}
