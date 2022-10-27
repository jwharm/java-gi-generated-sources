package org.harfbuzz;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the extents for a font, for horizontal-direction
 * text segments. Extents must be returned in an {@code hb_glyph_extents} output
 * parameter.
 */
public interface FontGetFontHExtentsFuncT extends org.harfbuzz.FontGetFontExtentsFuncT {
}
