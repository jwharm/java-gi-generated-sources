package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the signature of va_list marshaller functions, an optional
 * marshaller that can be used in some situations to avoid
 * marshalling the signal argument into GValues.
 */
@FunctionalInterface
public interface VaClosureMarshal {
        void onVaClosureMarshal(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, int nParams, PointerLong paramTypes);
}
