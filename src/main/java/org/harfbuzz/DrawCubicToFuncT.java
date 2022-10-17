package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link draw_funcs_t} to perform a "cubic-to" draw
 * operation.
 */
@FunctionalInterface
public interface DrawCubicToFuncT {
        void onDrawCubicToFuncT(@NotNull DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @NotNull DrawStateT st, @NotNull float control1X, @NotNull float control1Y, @NotNull float control2X, @NotNull float control2Y, @NotNull float toX, @NotNull float toY, @Nullable java.lang.foreign.MemoryAddress userData);
}
