package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link unicode_funcs_t} structure.
 */
@FunctionalInterface
public interface UnicodeEastasianWidthFuncT {
        int onUnicodeEastasianWidthFuncT(@NotNull UnicodeFuncsT ufuncs, @NotNull CodepointT unicode, @Nullable java.lang.foreign.MemoryAddress userData);
}
