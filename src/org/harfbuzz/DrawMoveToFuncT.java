package org.harfbuzz;

@FunctionalInterface
public interface DrawMoveToFuncT {

        void onDrawMoveToFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float toX, float toY);
}
