package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by character set conversion routines.
 */
public enum ConvertError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Conversion between the requested character
     *     sets is not supported.
     */
    NO_CONVERSION(0),
    
    /**
     * Invalid byte sequence in conversion input;
     *    or the character sequence could not be represented in the target
     *    character set.
     */
    ILLEGAL_SEQUENCE(1),
    
    /**
     * Conversion failed for some reason.
     */
    FAILED(2),
    
    /**
     * Partial character sequence at end of input.
     */
    PARTIAL_INPUT(3),
    
    /**
     * URI is invalid.
     */
    BAD_URI(4),
    
    /**
     * Pathname is not an absolute path.
     */
    NOT_ABSOLUTE_PATH(5),
    
    /**
     * No memory available. Since: 2.40
     */
    NO_MEMORY(6),
    
    /**
     * An embedded NUL character is present in
     *     conversion output where a NUL-terminated string is expected.
     *     Since: 2.56
     */
    EMBEDDED_NUL(7);
    
    private static final java.lang.String C_TYPE_NAME = "GConvertError";
    
    private final int value;
    
    /**
     * Create a new ConvertError for the provided value
     * @param numeric value the enum value
     */
    ConvertError(int value) {
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
     * Create a new ConvertError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ConvertError of(int value) {
        return switch (value) {
            case 0 -> NO_CONVERSION;
            case 1 -> ILLEGAL_SEQUENCE;
            case 2 -> FAILED;
            case 3 -> PARTIAL_INPUT;
            case 4 -> BAD_URI;
            case 5 -> NOT_ABSOLUTE_PATH;
            case 6 -> NO_MEMORY;
            case 7 -> EMBEDDED_NUL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
