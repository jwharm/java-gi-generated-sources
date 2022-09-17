package org.harfbuzz;

/**
 * A virtual method for the #hb_draw_funcs_t to perform a &#34;move-to&#34; draw
 * operation.
 */
@FunctionalInterface
public interface DrawMoveToFuncT {
        void onDrawMoveToFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float toX, float toY, jdk.incubator.foreign.MemoryAddress userData);
}
