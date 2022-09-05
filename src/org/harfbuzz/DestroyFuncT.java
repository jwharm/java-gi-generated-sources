package org.harfbuzz;

@FunctionalInterface
public interface DestroyFuncT {

    /**
     * A virtual method for destroy user-data callbacks.
     */
    public void onDestroyFuncT(jdk.incubator.foreign.MemoryAddress userData);
}
