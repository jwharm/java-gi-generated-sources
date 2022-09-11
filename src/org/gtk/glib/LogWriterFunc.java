package org.gtk.glib;

/**
 * Writer function for log entries. A log entry is a collection of one or more
 * #GLogFields, using the standard [field names from journal
 * specification](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html).
 * See g_log_structured() for more information.
 * 
 * Writer functions must ignore fields which they do not recognise, unless they
 * can write arbitrary binary output, as field values may be arbitrary binary.
 * 
 * @log_level is guaranteed to be included in @fields as the `PRIORITY` field,
 * but is provided separately for convenience of deciding whether or where to
 * output the log entry.
 * 
 * Writer functions should return %G_LOG_WRITER_HANDLED if they handled the log
 * message successfully or if they deliberately ignored it. If there was an
 * error handling the message (for example, if the writer function is meant to
 * send messages to a remote logging server and there is a network error), it
 * should return %G_LOG_WRITER_UNHANDLED. This allows writer functions to be
 * chained and fall back to simpler handlers in case of failure.
 */
@FunctionalInterface
public interface LogWriterFunc {
        LogWriterOutput onLogWriterFunc(int logLevel, LogField[] fields, long nFields);
}
