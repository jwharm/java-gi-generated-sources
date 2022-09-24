package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * A virtual method for destroy user-data callbacks.
 */
@FunctionalInterface
public interface DestroyFuncT {
        void onDestroyFuncT(java.lang.foreign.MemoryAddress userData);
}
