package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the advance for a specified glyph. The
 * method must return an {@link position_t}.
 */
@FunctionalInterface
public interface FontGetGlyphAdvanceFuncT {
        PositionT onFontGetGlyphAdvanceFuncT(FontT font, java.lang.foreign.MemoryAddress fontData, CodepointT glyph, java.lang.foreign.MemoryAddress userData);
}
