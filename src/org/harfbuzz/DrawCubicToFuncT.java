package org.harfbuzz;

/**
 * A virtual method for the {@link draw_funcs_t} to perform a "cubic-to" draw
 * operation.
 */
@FunctionalInterface
public interface DrawCubicToFuncT {
        void onDrawCubicToFuncT(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st, float control1X, float control1Y, float control2X, float control2Y, float toX, float toY, java.lang.foreign.MemoryAddress userData);
}
