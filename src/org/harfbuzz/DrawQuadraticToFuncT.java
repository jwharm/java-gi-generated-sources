package org.harfbuzz;

/**
 * A virtual method for the #hb_draw_funcs_t to perform a "quadratic-to" draw
 * operation.
 */
@FunctionalInterface
public interface DrawQuadraticToFuncT {
        void onDrawQuadraticToFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float controlX, float controlY, float toX, float toY, jdk.incubator.foreign.MemoryAddress userData);
}
