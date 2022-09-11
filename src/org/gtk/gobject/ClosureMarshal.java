package org.gtk.gobject;

@FunctionalInterface
public interface ClosureMarshal {

        void onClosureMarshal(Closure closure, Value returnValue, int nParamValues, Value[] paramValues, jdk.incubator.foreign.MemoryAddress invocationHint);
}
