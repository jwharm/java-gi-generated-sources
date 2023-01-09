package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoOverline} enumeration is used to specify whether text
 * should be overlined, and if so, the type of line.
 * @version 1.46
 */
public enum Overline implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * no overline should be drawn
     */
    NONE(0),
    
    /**
     * Draw a single line above the ink
     *   extents of the text being underlined.
     */
    SINGLE(1);
    
    private static final java.lang.String C_TYPE_NAME = "PangoOverline";
    
    private final int value;
    
    /**
     * Create a new Overline for the provided value
     * @param numeric value the enum value
     */
    Overline(int value) {
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
     * Create a new Overline for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Overline of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> SINGLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
