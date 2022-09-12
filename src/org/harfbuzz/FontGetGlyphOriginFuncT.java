package org.harfbuzz;

/**
 * A virtual method for the #hb_font_funcs_t of an #hb_font_t object.
 * 
 * This method should retrieve the (X,Y) coordinates (in font units) of the
 * origin for a glyph. Each coordinate must be returned in an #hb_position_t
 * output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphOriginFuncT {
        BoolT onFontGetGlyphOriginFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, PositionT x, PositionT y, jdk.incubator.foreign.MemoryAddress userData);
}
