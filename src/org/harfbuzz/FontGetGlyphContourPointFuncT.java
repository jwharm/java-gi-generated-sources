package org.harfbuzz;

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 * 
 * This method should retrieve the (X,Y) coordinates (in font units) for a
 * specified contour point in a glyph. Each coordinate must be returned as
 * an #hb_position_t output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphContourPointFuncT {
        BoolT onFontGetGlyphContourPointFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, int pointIndex, PositionT x, PositionT y, jdk.incubator.foreign.MemoryAddress userData);
}
