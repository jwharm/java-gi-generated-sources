package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Writer function for log entries. A log entry is a collection of one or more
 * {@code GLogFields}, using the standard [field names from journal
 * specification](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html).
 * See g_log_structured() for more information.
 * <p>
 * Writer functions must ignore fields which they do not recognise, unless they
 * can write arbitrary binary output, as field values may be arbitrary binary.
 * <p>
 * {@code log_level} is guaranteed to be included in {@code fields} as the {@code PRIORITY} field,
 * but is provided separately for convenience of deciding whether or where to
 * output the log entry.
 * <p>
 * Writer functions should return {@link LogWriterOutput#HANDLED} if they handled the log
 * message successfully or if they deliberately ignored it. If there was an
 * error handling the message (for example, if the writer function is meant to
 * send messages to a remote logging server and there is a network error), it
 * should return {@link LogWriterOutput#UNHANDLED}. This allows writer functions to be
 * chained and fall back to simpler handlers in case of failure.
 * @version 2.50
 */
@FunctionalInterface
public interface LogWriterFunc {
        org.gtk.glib.LogWriterOutput onLogWriterFunc(@NotNull org.gtk.glib.LogLevelFlags logLevel, PointerProxy<org.gtk.glib.LogField> fields, long nFields);
}
