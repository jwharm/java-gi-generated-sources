package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by shell functions.
 */
public enum ShellError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Mismatched or otherwise mangled quoting.
     */
    BAD_QUOTING(0),
    
    /**
     * String to be parsed was empty.
     */
    EMPTY_STRING(1),
    
    /**
     * Some other error.
     */
    FAILED(2);
    
    private static final java.lang.String C_TYPE_NAME = "GShellError";
    
    private final int value;
    
    /**
     * Create a new ShellError for the provided value
     * @param numeric value the enum value
     */
    ShellError(int value) {
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
     * Create a new ShellError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ShellError of(int value) {
        return switch (value) {
            case 0 -> BAD_QUOTING;
            case 1 -> EMPTY_STRING;
            case 2 -> FAILED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
