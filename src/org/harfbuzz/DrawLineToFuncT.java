package org.harfbuzz;

@FunctionalInterface
public interface DrawLineToFuncT {

    /**
     * A virtual method for the #hb_draw_funcs_t to perform a "line-to" draw
     * operation.
     */
    public void onDrawLineToFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float toX, float toY, jdk.incubator.foreign.MemoryAddress userData);
}
