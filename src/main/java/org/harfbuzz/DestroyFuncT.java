package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for destroy user-data callbacks.
 */
@FunctionalInterface
public interface DestroyFuncT {
        void onDestroyFuncT(@Nullable java.lang.foreign.MemoryAddress userData);
}
