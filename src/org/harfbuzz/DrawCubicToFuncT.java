package org.harfbuzz;

@FunctionalInterface
public interface DrawCubicToFuncT {

        void onDrawCubicToFuncT(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float control1X, float control1Y, float control2X, float control2Y, float toX, float toY);
}
