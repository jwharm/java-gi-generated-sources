package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration that affects how Pango treats characters during shaping.
 * @version 1.50
 */
public enum TextTransform implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Leave text unchanged
     */
    NONE(0),
    
    /**
     * Display letters and numbers as lowercase
     */
    LOWERCASE(1),
    
    /**
     * Display letters and numbers as uppercase
     */
    UPPERCASE(2),
    
    /**
     * Display the first character of a word
     *   in titlecase
     */
    CAPITALIZE(3);
    
    private static final java.lang.String C_TYPE_NAME = "PangoTextTransform";
    
    private final int value;
    
    /**
     * Create a new TextTransform for the provided value
     * @param numeric value the enum value
     */
    TextTransform(int value) {
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
     * Create a new TextTransform for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TextTransform of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> LOWERCASE;
            case 2 -> UPPERCASE;
            case 3 -> CAPITALIZE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
