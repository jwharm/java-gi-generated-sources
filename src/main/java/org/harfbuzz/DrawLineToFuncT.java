package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link draw_funcs_t} to perform a "line-to" draw
 * operation.
 */
@FunctionalInterface
public interface DrawLineToFuncT {
        void onDrawLineToFuncT(@NotNull DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @NotNull DrawStateT st, @NotNull float toX, @NotNull float toY, @Nullable java.lang.foreign.MemoryAddress userData);
}
