package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A simple function pointer to get invoked when the signal is emitted.
 * <p>
 * Emission hooks allow you to tie a hook to the signal type, so that it will
 * trap all emissions of that signal, from any object.
 * <p>
 * You may not attach these to signals created with the {@link SignalFlags#NO_HOOKS} flag.
 */
@FunctionalInterface
public interface SignalEmissionHook {
        boolean onSignalEmissionHook(@NotNull org.gtk.gobject.SignalInvocationHint ihint, int nParamValues, PointerProxy<org.gtk.gobject.Value> paramValues);
}
