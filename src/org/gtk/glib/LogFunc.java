package org.gtk.glib;

@FunctionalInterface
public interface LogFunc {

        void onLogFunc(java.lang.String logDomain, int logLevel, java.lang.String message);
}
