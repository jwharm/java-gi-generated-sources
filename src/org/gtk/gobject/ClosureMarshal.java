package org.gtk.gobject;

@FunctionalInterface
public interface ClosureMarshal {

    /**
     * The type used for marshaller functions.
     */
    public void onClosureMarshal(Closure closure, Value returnValue, int nParamValues, Value[] paramValues, jdk.incubator.foreign.MemoryAddress invocationHint, jdk.incubator.foreign.MemoryAddress marshalData);
}
