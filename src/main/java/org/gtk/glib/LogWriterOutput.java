package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Return values from {@code GLogWriterFuncs} to indicate whether the given log entry
 * was successfully handled by the writer, or whether there was an error in
 * handling it (and hence a fallback writer should be used).
 * <p>
 * If a {@link LogWriterFunc} ignores a log entry, it should return
 * {@link LogWriterOutput#HANDLED}.
 * @version 2.50
 */
public enum LogWriterOutput implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Log writer has handled the log entry.
     */
    HANDLED(1),
    
    /**
     * Log writer could not handle the log entry.
     */
    UNHANDLED(0);
    
    private static final java.lang.String C_TYPE_NAME = "GLogWriterOutput";
    
    private final int value;
    
    /**
     * Create a new LogWriterOutput for the provided value
     * @param numeric value the enum value
     */
    LogWriterOutput(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new LogWriterOutput for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static LogWriterOutput of(int value) {
        return switch (value) {
            case 1 -> HANDLED;
            case 0 -> UNHANDLED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
