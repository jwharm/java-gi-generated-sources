package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the glyph ID for a specified Unicode code point
 * font, with an optional variation selector.
 */
@FunctionalInterface
public interface FontGetGlyphFuncT {
        BoolT onFontGetGlyphFuncT(@NotNull FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull CodepointT unicode, @NotNull CodepointT variationSelector, @NotNull Out<CodepointT> glyph, @Nullable java.lang.foreign.MemoryAddress userData);
}
