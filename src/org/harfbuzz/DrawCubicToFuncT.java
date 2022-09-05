package org.harfbuzz;

@FunctionalInterface
public interface DrawCubicToFuncT {

    /**
     * A virtual method for the #hb_draw_funcs_t to perform a "cubic-to" draw
     * operation.
     */
    public void onDrawCubicToFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float control1X, float control1Y, float control2X, float control2Y, float toX, float toY, jdk.incubator.foreign.MemoryAddress userData);
}