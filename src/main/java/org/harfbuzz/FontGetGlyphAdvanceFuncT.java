package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link FontFuncsT} of an {@link FontT} object.
 * <p>
 * This method should retrieve the advance for a specified glyph. The
 * method must return an {@link PositionT}.
 */
@FunctionalInterface
public interface FontGetGlyphAdvanceFuncT {
        org.harfbuzz.PositionT onFontGetGlyphAdvanceFuncT(@NotNull org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull org.harfbuzz.CodepointT glyph, @Nullable java.lang.foreign.MemoryAddress userData);
}
