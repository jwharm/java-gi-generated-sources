package org.harfbuzz;

/**
 * A virtual method for the {@link org.harfbuzz.draw_funcs_t} to perform a &<code>#34</code> quadratic-to&<code>#34</code>  draw
 * operation.
 */
@FunctionalInterface
public interface DrawQuadraticToFuncT {
        void onDrawQuadraticToFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float controlX, float controlY, float toX, float toY, jdk.incubator.foreign.MemoryAddress userData);
}
