package org.gtk.gobject;

/**
 * The type used for marshaller functions.
 */
@FunctionalInterface
public interface ClosureMarshal {
        void onClosureMarshal(Closure closure, Value returnValue, int nParamValues, Value[] paramValues, java.lang.foreign.MemoryAddress invocationHint);
}
