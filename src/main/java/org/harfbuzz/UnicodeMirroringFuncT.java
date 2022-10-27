package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link UnicodeFuncsT} structure.
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
        org.harfbuzz.CodepointT onUnicodeMirroringFuncT(@NotNull org.harfbuzz.UnicodeFuncsT ufuncs, @NotNull org.harfbuzz.CodepointT unicode, @Nullable java.lang.foreign.MemoryAddress userData);
}
