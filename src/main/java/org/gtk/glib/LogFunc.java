package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the prototype of log handler functions.
 * <p>
 * The default log handler, g_log_default_handler(), automatically appends a
 * new-line character to {@code message} when printing it. It is advised that any
 * custom log handler functions behave similarly, so that logging calls in user
 * code do not need modifying to add a new-line character to the message if the
 * log handler is changed.
 * <p>
 * This is not used if structured logging is enabled; see
 * [Using Structured Logging][using-structured-logging].
 */
@FunctionalInterface
public interface LogFunc {
        void onLogFunc(@NotNull java.lang.String logDomain, @NotNull org.gtk.glib.LogLevelFlags logLevel, @NotNull java.lang.String message);
}
