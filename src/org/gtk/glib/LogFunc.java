package org.gtk.glib;

@FunctionalInterface
public interface LogFunc {

    /**
     * Specifies the prototype of log handler functions.
     * 
     * The default log handler, g_log_default_handler(), automatically appends a
     * new-line character to @message when printing it. It is advised that any
     * custom log handler functions behave similarly, so that logging calls in user
     * code do not need modifying to add a new-line character to the message if the
     * log handler is changed.
     * 
     * This is not used if structured logging is enabled; see
     * [Using Structured Logging][using-structured-logging].
     */
    public void onLogFunc(java.lang.String logDomain, int logLevel, java.lang.String message, jdk.incubator.foreign.MemoryAddress userData);
}
