package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the prototype of fatal log handler functions.
 * @version 2.22
 */
@FunctionalInterface
public interface TestLogFatalFunc {
        boolean onTestLogFatalFunc(@NotNull java.lang.String logDomain, @NotNull org.gtk.glib.LogLevelFlags logLevel, @NotNull java.lang.String message);
}
