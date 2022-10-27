package org.harfbuzz;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the kerning-adjustment value for a glyph-pair in
 * the specified font, for vertical text segments.
 */
public interface FontGetGlyphVKerningFuncT extends org.harfbuzz.FontGetGlyphKerningFuncT {
}
