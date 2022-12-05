package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by functions converting a string to a number.
 * @version 2.54
 */
public enum NumberParserError implements io.github.jwharm.javagi.Enumeration {
    /**
     * String was not a valid number.
     */
    INVALID(0),
    /**
     * String was a number, but out of bounds.
     */
    OUT_OF_BOUNDS(1);
    
    private static final java.lang.String C_TYPE_NAME = "GNumberParserError";
    
    private final int value;
    NumberParserError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static NumberParserError of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> OUT_OF_BOUNDS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
