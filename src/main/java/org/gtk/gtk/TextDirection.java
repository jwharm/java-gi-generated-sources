package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Reading directions for text.
 */
public enum TextDirection implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No direction.
     */
    NONE(0),
    
    /**
     * Left to right text direction.
     */
    LTR(1),
    
    /**
     * Right to left text direction.
     */
    RTL(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextDirection";
    
    private final int value;
    
    /**
     * Create a new TextDirection for the provided value
     * @param numeric value the enum value
     */
    TextDirection(int value) {
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
     * Create a new TextDirection for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TextDirection of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> LTR;
            case 2 -> RTL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
