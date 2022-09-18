package org.gtk.glib;

/**
 * Return values from <code>#GLogWriterFuncs</code> to indicate whether the given log entry
 * was successfully handled by the writer, or whether there was an error in
 * handling it (and hence a fallback writer should be used).
 * 
 * If a {@link org.gtk.glib.LogWriterFunc} ignores a log entry, it should return
 * {@link org.gtk.glib.LogWriterOutput<code>#HANDLED</code>
 */
public enum LogWriterOutput {

    /**
     * Log writer has handled the log entry.
     */
    HANDLED,
    
    /**
     * Log writer could not handle the log entry.
     */
    UNHANDLED;
    
    public static LogWriterOutput fromValue(int value) {
        return switch(value) {
            case 1 -> HANDLED;
            case 0 -> UNHANDLED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case HANDLED -> 1;
            case UNHANDLED -> 0;
        };
    }

}
