package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the advance for a specified glyph. The
 * method must return an {@link position_t}.
 */
@FunctionalInterface
public interface FontGetGlyphAdvanceFuncT {
        PositionT onFontGetGlyphAdvanceFuncT(@NotNull FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull CodepointT glyph, @Nullable java.lang.foreign.MemoryAddress userData);
}
