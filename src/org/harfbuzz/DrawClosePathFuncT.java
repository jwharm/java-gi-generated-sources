package org.harfbuzz;

@FunctionalInterface
public interface DrawClosePathFuncT {

    /**
     * A virtual method for the #hb_draw_funcs_t to perform a "close-path" draw
     * operation.
     */
    public void onDrawClosePathFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, jdk.incubator.foreign.MemoryAddress userData);
}
