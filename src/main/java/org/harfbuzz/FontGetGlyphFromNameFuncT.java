package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the glyph ID that corresponds to a glyph-name
 * string.
 */
@FunctionalInterface
public interface FontGetGlyphFromNameFuncT {
        BoolT onFontGetGlyphFromNameFuncT(FontT font, java.lang.foreign.MemoryAddress fontData, PointerString name, int len, CodepointT glyph, java.lang.foreign.MemoryAddress userData);
}
