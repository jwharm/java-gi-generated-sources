package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type used for marshaller functions.
 */
@FunctionalInterface
public interface ClosureMarshal {
        void onClosureMarshal(@NotNull Closure closure, @Nullable Value returnValue, @NotNull int nParamValues, @NotNull PointerProxy<Value> paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint);
}
