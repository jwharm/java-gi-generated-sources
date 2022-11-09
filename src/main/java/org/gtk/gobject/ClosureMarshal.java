package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type used for marshaller functions.
 */
@FunctionalInterface
public interface ClosureMarshal {
        void onClosureMarshal(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, int nParamValues, @NotNull PointerProxy<org.gtk.gobject.Value> paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint);
}
