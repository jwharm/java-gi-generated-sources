package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the nominal glyph ID for a specified Unicode code
 * point. Glyph IDs must be returned in a {@link codepoint_t} output parameter.
 */
@FunctionalInterface
public interface FontGetNominalGlyphFuncT {
        BoolT onFontGetNominalGlyphFuncT(FontT font, java.lang.foreign.MemoryAddress fontData, CodepointT unicode, CodepointT glyph, java.lang.foreign.MemoryAddress userData);
}
