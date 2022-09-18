package org.harfbuzz;

/**
 * A virtual method for the {@link org.harfbuzz.draw_funcs_t} to perform a &<code>#34</code> close-path&<code>#34</code>  draw
 * operation.
 */
@FunctionalInterface
public interface DrawClosePathFuncT {
        void onDrawClosePathFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, jdk.incubator.foreign.MemoryAddress userData);
}
