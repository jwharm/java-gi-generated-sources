package org.gtk.gobject;

import io.github.jwharm.javagi.*;

/**
 * The type used for marshaller functions.
 */
@FunctionalInterface
public interface ClosureMarshal {
        void onClosureMarshal(Closure closure, Value returnValue, int nParamValues, PointerProxy<Value> paramValues, java.lang.foreign.MemoryAddress invocationHint);
}
