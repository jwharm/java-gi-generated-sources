package org.harfbuzz;

@FunctionalInterface
public interface DrawLineToFuncT {

        void onDrawLineToFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float toX, float toY);
}
