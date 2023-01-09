package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Errors that can occur while parsing CSS.
 * <p>
 * These errors are unexpected and will cause parts of the given CSS
 * to be ignored.
 */
public enum CssParserError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Unknown failure.
     */
    FAILED(0),
    
    /**
     * The given text does not form valid syntax
     */
    SYNTAX(1),
    
    /**
     * Failed to import a resource
     */
    IMPORT(2),
    
    /**
     * The given name has not been defined
     */
    NAME(3),
    
    /**
     * The given value is not correct
     */
    UNKNOWN_VALUE(4);
    
    private static final java.lang.String C_TYPE_NAME = "GtkCssParserError";
    
    private final int value;
    
    /**
     * Create a new CssParserError for the provided value
     * @param numeric value the enum value
     */
    CssParserError(int value) {
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
     * Create a new CssParserError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static CssParserError of(int value) {
        return switch (value) {
            case 0 -> FAILED;
            case 1 -> SYNTAX;
            case 2 -> IMPORT;
            case 3 -> NAME;
            case 4 -> UNKNOWN_VALUE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
