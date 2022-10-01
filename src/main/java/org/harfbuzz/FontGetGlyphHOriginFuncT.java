package org.harfbuzz;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the (X,Y) coordinates (in font units) of the
 * origin for a glyph, for horizontal-direction text segments. Each
 * coordinate must be returned in an {@link position_t} output parameter.
 */
public interface FontGetGlyphHOriginFuncT {
}
