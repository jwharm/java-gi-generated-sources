package org.harfbuzz;

/**
 * A virtual method for destroy user-data callbacks.
 */
@FunctionalInterface
public interface DestroyFuncT {
        void onDestroyFuncT(jdk.incubator.foreign.MemoryAddress userData);
}
