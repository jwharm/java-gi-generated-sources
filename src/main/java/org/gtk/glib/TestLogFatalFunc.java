package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the prototype of fatal log handler functions.
 */
@FunctionalInterface
public interface TestLogFatalFunc {
        boolean onTestLogFatalFunc(@NotNull java.lang.String logDomain, @NotNull LogLevelFlags logLevel, @NotNull java.lang.String message);
}
