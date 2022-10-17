package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link font_funcs_t} of an {@link font_t} object.
 * <p>
 * This method should retrieve the (X,Y) coordinates (in font units) for a
 * specified contour point in a glyph. Each coordinate must be returned as
 * an {@link position_t} output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphContourPointFuncT {
        BoolT onFontGetGlyphContourPointFuncT(@NotNull FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull CodepointT glyph, @NotNull int pointIndex, @NotNull Out<PositionT> x, @NotNull Out<PositionT> y, @Nullable java.lang.foreign.MemoryAddress userData);
}
