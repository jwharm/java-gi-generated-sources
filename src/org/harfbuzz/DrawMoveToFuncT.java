package org.harfbuzz;

@FunctionalInterface
public interface DrawMoveToFuncT {

    /**
     * A virtual method for the #hb_draw_funcs_t to perform a "move-to" draw
     * operation.
     */
    public void onDrawMoveToFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float toX, float toY, jdk.incubator.foreign.MemoryAddress userData);
}
