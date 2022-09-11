package org.harfbuzz;

@FunctionalInterface
public interface DrawClosePathFuncT {

        void onDrawClosePathFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st);
}
