package org.harfbuzz;

/**
 * A virtual method for the {@link draw_funcs_t} to perform a "line-to" draw
 * operation.
 */
@FunctionalInterface
public interface DrawLineToFuncT {
        void onDrawLineToFuncT(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st, float toX, float toY, java.lang.foreign.MemoryAddress userData);
}
