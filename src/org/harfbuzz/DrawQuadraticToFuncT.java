package org.harfbuzz;

@FunctionalInterface
public interface DrawQuadraticToFuncT {

    /**
     * A virtual method for the #hb_draw_funcs_t to perform a "quadratic-to" draw
     * operation.
     */
    public void onDrawQuadraticToFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float controlX, float controlY, float toX, float toY, jdk.incubator.foreign.MemoryAddress userData);
}
