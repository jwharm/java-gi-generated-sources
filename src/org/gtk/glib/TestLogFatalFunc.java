package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * Specifies the prototype of fatal log handler functions.
 */
@FunctionalInterface
public interface TestLogFatalFunc {
        boolean onTestLogFatalFunc(java.lang.String logDomain, int logLevel, java.lang.String message);
}
