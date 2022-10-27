package org.harfbuzz;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the (X,Y) coordinates (in font units) of the
 * origin for a glyph, for horizontal-direction text segments. Each
 * coordinate must be returned in an {@link PositionT} output parameter.
 */
public interface FontGetGlyphHOriginFuncT extends org.harfbuzz.FontGetGlyphOriginFuncT {
}
