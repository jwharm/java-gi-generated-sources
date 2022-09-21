package org.harfbuzz;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the (X,Y) coordinates (in font units) for a
 * specified contour point in a glyph. Each coordinate must be returned as
 * an {@link position_t} output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphContourPointFuncT {
        BoolT onFontGetGlyphContourPointFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, CodepointT glyph, int pointIndex, PositionT x, PositionT y, jdk.incubator.foreign.MemoryAddress userData);
}
