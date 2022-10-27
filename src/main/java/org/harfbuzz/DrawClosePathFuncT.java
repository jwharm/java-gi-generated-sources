package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link DrawFuncsT} to perform a "close-path" draw
 * operation.
 * @version 4.0.0
 */
@FunctionalInterface
public interface DrawClosePathFuncT {
        void onDrawClosePathFuncT(@NotNull org.harfbuzz.DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @NotNull org.harfbuzz.DrawStateT st, @Nullable java.lang.foreign.MemoryAddress userData);
}
