package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible values for the {@link AccessibleProperty#AUTOCOMPLETE}
 * accessible property.
 */
public enum AccessibleAutocomplete implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Automatic suggestions are not displayed.
     */
    NONE(0),
    
    /**
     * When a user is providing input, text
     *    suggesting one way to complete the provided input may be dynamically
     *    inserted after the caret.
     */
    INLINE(1),
    
    /**
     * When a user is providing input, an element
     *    containing a collection of values that could complete the provided input
     *    may be displayed.
     */
    LIST(2),
    
    /**
     * When a user is providing input, an element
     *    containing a collection of values that could complete the provided input
     *    may be displayed. If displayed, one value in the collection is automatically
     *    selected, and the text needed to complete the automatically selected value
     *    appears after the caret in the input.
     */
    BOTH(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkAccessibleAutocomplete";
    
    private final int value;
    
    /**
     * Create a new AccessibleAutocomplete for the provided value
     * @param numeric value the enum value
     */
    AccessibleAutocomplete(int value) {
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
     * Create a new AccessibleAutocomplete for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AccessibleAutocomplete of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> INLINE;
            case 2 -> LIST;
            case 3 -> BOTH;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
