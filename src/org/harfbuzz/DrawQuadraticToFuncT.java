package org.harfbuzz;

@FunctionalInterface
public interface DrawQuadraticToFuncT {

        void onDrawQuadraticToFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float controlX, float controlY, float toX, float toY);
}
