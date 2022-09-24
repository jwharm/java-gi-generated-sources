package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * A virtual method for the {@link draw_funcs_t} to perform a "quadratic-to" draw
 * operation.
 */
@FunctionalInterface
public interface DrawQuadraticToFuncT {
        void onDrawQuadraticToFuncT(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st, float controlX, float controlY, float toX, float toY, java.lang.foreign.MemoryAddress userData);
}
