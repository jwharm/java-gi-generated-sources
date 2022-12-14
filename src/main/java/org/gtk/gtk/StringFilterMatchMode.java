package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies how search strings are matched inside text.
 */
public enum StringFilterMatchMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The search string and
     *   text must match exactly.
     */
    EXACT(0),
    
    /**
     * The search string
     *   must be contained as a substring inside the text.
     */
    SUBSTRING(1),
    
    /**
     * The text must begin
     *   with the search string.
     */
    PREFIX(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkStringFilterMatchMode";
    
    private final int value;
    
    /**
     * Create a new StringFilterMatchMode for the provided value
     * @param numeric value the enum value
     */
    StringFilterMatchMode(int value) {
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
     * Create a new StringFilterMatchMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static StringFilterMatchMode of(int value) {
        return switch (value) {
            case 0 -> EXACT;
            case 1 -> SUBSTRING;
            case 2 -> PREFIX;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
