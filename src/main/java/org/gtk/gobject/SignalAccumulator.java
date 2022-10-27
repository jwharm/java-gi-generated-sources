package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The signal accumulator is a special callback function that can be used
 * to collect return values of the various callbacks that are called
 * during a signal emission.
 * <p>
 * The signal accumulator is specified at signal creation time, if it is
 * left {@code null}, no accumulation of callback return values is performed.
 * The return value of signal emissions is then the value returned by the
 * last callback.
 */
@FunctionalInterface
public interface SignalAccumulator {
        boolean onSignalAccumulator(@NotNull org.gtk.gobject.SignalInvocationHint ihint, @NotNull org.gtk.gobject.Value returnAccu, @NotNull org.gtk.gobject.Value handlerReturn);
}
