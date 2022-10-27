package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * @version 4.0.0
 */
@FunctionalInterface
public interface FontGetGlyphShapeFuncT {
        void onFontGetGlyphShapeFuncT(@NotNull org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull org.harfbuzz.CodepointT glyph, @NotNull org.harfbuzz.DrawFuncsT drawFuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @Nullable java.lang.foreign.MemoryAddress userData);
}
