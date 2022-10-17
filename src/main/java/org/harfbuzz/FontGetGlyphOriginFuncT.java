package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the (X,Y) coordinates (in font units) of the
 * origin for a glyph. Each coordinate must be returned in an {@link position_t}
 * output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphOriginFuncT {
        BoolT onFontGetGlyphOriginFuncT(@NotNull FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull CodepointT glyph, @NotNull Out<PositionT> x, @NotNull Out<PositionT> y, @Nullable java.lang.foreign.MemoryAddress userData);
}
