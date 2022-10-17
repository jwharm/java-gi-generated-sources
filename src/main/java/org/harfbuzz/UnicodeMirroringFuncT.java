package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link unicode_funcs_t} structure.
 * <p>
 * This method should retrieve the Bi-Directional Mirroring Glyph
 * code point for a specified Unicode code point.
 * <p>
 * &lt;note&gt;Note: If a code point does not have a specified
 * Bi-Directional Mirroring Glyph defined, the method should
 * return the original code point.&lt;/note&gt;
 */
@FunctionalInterface
public interface UnicodeMirroringFuncT {
        CodepointT onUnicodeMirroringFuncT(@NotNull UnicodeFuncsT ufuncs, @NotNull CodepointT unicode, @Nullable java.lang.foreign.MemoryAddress userData);
}
