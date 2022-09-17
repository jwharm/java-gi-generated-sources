package org.harfbuzz;

/**
 * A virtual method for the #hb_draw_funcs_t to perform a &#34;close-path&#34; draw
 * operation.
 */
@FunctionalInterface
public interface DrawClosePathFuncT {
        void onDrawClosePathFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, jdk.incubator.foreign.MemoryAddress userData);
}
