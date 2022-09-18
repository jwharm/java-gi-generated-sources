package org.harfbuzz;

/**
 * A virtual method for the {@link org.harfbuzz.draw_funcs_t} to perform a &<code>#34</code> cubic-to&<code>#34</code>  draw
 * operation.
 */
@FunctionalInterface
public interface DrawCubicToFuncT {
        void onDrawCubicToFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float control1X, float control1Y, float control2X, float control2Y, float toX, float toY, jdk.incubator.foreign.MemoryAddress userData);
}
