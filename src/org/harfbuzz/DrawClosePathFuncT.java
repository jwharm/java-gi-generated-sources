package org.harfbuzz;

/**
 * A virtual method for the {@link draw_funcs_t} to perform a "close-path" draw
 * operation.
 */
@FunctionalInterface
public interface DrawClosePathFuncT {
        void onDrawClosePathFuncT(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st, java.lang.foreign.MemoryAddress userData);
}
