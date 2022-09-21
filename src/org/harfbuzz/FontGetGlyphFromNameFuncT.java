package org.harfbuzz;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the glyph ID that corresponds to a glyph-name
 * string.
 */
@FunctionalInterface
public interface FontGetGlyphFromNameFuncT {
        BoolT onFontGetGlyphFromNameFuncT(FontT font, jdk.incubator.foreign.MemoryAddress fontData, java.lang.String[] name, int len, CodepointT glyph, jdk.incubator.foreign.MemoryAddress userData);
}
