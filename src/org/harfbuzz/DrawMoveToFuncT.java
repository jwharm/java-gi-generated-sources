package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * A virtual method for the {@link draw_funcs_t} to perform a "move-to" draw
 * operation.
 */
@FunctionalInterface
public interface DrawMoveToFuncT {
        void onDrawMoveToFuncT(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st, float toX, float toY, java.lang.foreign.MemoryAddress userData);
}
