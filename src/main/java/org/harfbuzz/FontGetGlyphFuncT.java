package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the glyph ID for a specified Unicode code point
 * font, with an optional variation selector.
 */
@FunctionalInterface
public interface FontGetGlyphFuncT {
        BoolT onFontGetGlyphFuncT(FontT font, java.lang.foreign.MemoryAddress fontData, CodepointT unicode, CodepointT variationSelector, CodepointT glyph, java.lang.foreign.MemoryAddress userData);
}
