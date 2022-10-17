package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link draw_funcs_t} to perform a "close-path" draw
 * operation.
 */
@FunctionalInterface
public interface DrawClosePathFuncT {
        void onDrawClosePathFuncT(@NotNull DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @NotNull DrawStateT st, @Nullable java.lang.foreign.MemoryAddress userData);
}
