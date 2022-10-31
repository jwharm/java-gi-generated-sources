package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This method should retrieve the extents for a font.
 */
@FunctionalInterface
public interface FontGetFontExtentsFuncT {
        org.harfbuzz.BoolT onFontGetFontExtentsFuncT(@NotNull org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull org.harfbuzz.FontExtentsT extents, @Nullable java.lang.foreign.MemoryAddress userData);
}
