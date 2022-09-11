package org.gtk.glib;

@FunctionalInterface
public interface LogWriterFunc {

        void onLogWriterFunc(int logLevel, LogField[] fields, long nFields);
}
