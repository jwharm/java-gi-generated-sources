package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * This method should retrieve the extents for a font.
 */
@FunctionalInterface
public interface FontGetFontExtentsFuncT {
        BoolT onFontGetFontExtentsFuncT(@NotNull FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @NotNull Out<FontExtentsT> extents, @Nullable java.lang.foreign.MemoryAddress userData);
}
