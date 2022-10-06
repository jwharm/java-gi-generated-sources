package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the glyph name that corresponds to a
 * glyph ID. The name should be returned in a string output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphNameFuncT {
        BoolT onFontGetGlyphNameFuncT(FontT font, java.lang.foreign.MemoryAddress fontData, CodepointT glyph, PointerString name, int size, java.lang.foreign.MemoryAddress userData);
}
