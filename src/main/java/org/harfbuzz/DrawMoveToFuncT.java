package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link DrawFuncsT} to perform a "move-to" draw
 * operation.
 * @version 4.0.0
 */
@FunctionalInterface
public interface DrawMoveToFuncT {
        void onDrawMoveToFuncT(@NotNull org.harfbuzz.DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @NotNull org.harfbuzz.DrawStateT st, float toX, float toY, @Nullable java.lang.foreign.MemoryAddress userData);
}
