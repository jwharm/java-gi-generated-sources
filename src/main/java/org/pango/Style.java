package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration specifying the various slant styles possible for a font.
 */
public enum Style implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * the font is upright.
     */
    NORMAL(0),
    
    /**
     * the font is slanted, but in a roman style.
     */
    OBLIQUE(1),
    
    /**
     * the font is slanted in an italic style.
     */
    ITALIC(2);
    
    private static final java.lang.String C_TYPE_NAME = "PangoStyle";
    
    private final int value;
    
    /**
     * Create a new Style for the provided value
     * @param numeric value the enum value
     */
    Style(int value) {
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
     * Create a new Style for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Style of(int value) {
        return switch (value) {
            case 0 -> NORMAL;
            case 1 -> OBLIQUE;
            case 2 -> ITALIC;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
