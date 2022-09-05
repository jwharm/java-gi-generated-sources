package org.gtk.glib;

@FunctionalInterface
public interface TestLogFatalFunc {

    /**
     * Specifies the prototype of fatal log handler functions.
     */
    public boolean onTestLogFatalFunc(java.lang.String logDomain, int logLevel, java.lang.String message, jdk.incubator.foreign.MemoryAddress userData);
}
