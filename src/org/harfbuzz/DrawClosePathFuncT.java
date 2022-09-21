package org.harfbuzz;

/**
 * A virtual method for the {@link draw_funcs_t} to perform a "close-path" draw
 * operation.
 */
@FunctionalInterface
public interface DrawClosePathFuncT {
        void onDrawClosePathFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, jdk.incubator.foreign.MemoryAddress userData);
}
