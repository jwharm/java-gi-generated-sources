package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the (X,Y) coordinates (in font units) for a
 * specified contour point in a glyph. Each coordinate must be returned as
 * an {@link PositionT} output parameter.
 */
@FunctionalInterface
public interface FontGetGlyphContourPointFuncT {
        org.harfbuzz.BoolT onFontGetGlyphContourPointFuncT(@NotNull org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull org.harfbuzz.CodepointT glyph, int pointIndex, @NotNull Out<org.harfbuzz.PositionT> x, @NotNull Out<org.harfbuzz.PositionT> y, @Nullable java.lang.foreign.MemoryAddress userData);
}
