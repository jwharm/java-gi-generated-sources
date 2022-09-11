package org.gtk.glib;

@FunctionalInterface
public interface TestLogFatalFunc {

        void onTestLogFatalFunc(java.lang.String logDomain, int logLevel, java.lang.String message);
}
