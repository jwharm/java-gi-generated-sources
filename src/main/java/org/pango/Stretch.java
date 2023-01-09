package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration specifying the width of the font relative to other designs
 * within a family.
 */
public enum Stretch implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * ultra condensed width
     */
    ULTRA_CONDENSED(0),
    
    /**
     * extra condensed width
     */
    EXTRA_CONDENSED(1),
    
    /**
     * condensed width
     */
    CONDENSED(2),
    
    /**
     * semi condensed width
     */
    SEMI_CONDENSED(3),
    
    /**
     * the normal width
     */
    NORMAL(4),
    
    /**
     * semi expanded width
     */
    SEMI_EXPANDED(5),
    
    /**
     * expanded width
     */
    EXPANDED(6),
    
    /**
     * extra expanded width
     */
    EXTRA_EXPANDED(7),
    
    /**
     * ultra expanded width
     */
    ULTRA_EXPANDED(8);
    
    private static final java.lang.String C_TYPE_NAME = "PangoStretch";
    
    private final int value;
    
    /**
     * Create a new Stretch for the provided value
     * @param numeric value the enum value
     */
    Stretch(int value) {
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
     * Create a new Stretch for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Stretch of(int value) {
        return switch (value) {
            case 0 -> ULTRA_CONDENSED;
            case 1 -> EXTRA_CONDENSED;
            case 2 -> CONDENSED;
            case 3 -> SEMI_CONDENSED;
            case 4 -> NORMAL;
            case 5 -> SEMI_EXPANDED;
            case 6 -> EXPANDED;
            case 7 -> EXTRA_EXPANDED;
            case 8 -> ULTRA_EXPANDED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
