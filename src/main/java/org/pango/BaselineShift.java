package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration that affects baseline shifts between runs.
 * @version 1.50
 */
public enum BaselineShift implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Leave the baseline unchanged
     */
    NONE(0),
    
    /**
     * Shift the baseline to the superscript position,
     *   relative to the previous run
     */
    SUPERSCRIPT(1),
    
    /**
     * Shift the baseline to the subscript position,
     *   relative to the previous run
     */
    SUBSCRIPT(2);
    
    private static final java.lang.String C_TYPE_NAME = "PangoBaselineShift";
    
    private final int value;
    
    /**
     * Create a new BaselineShift for the provided value
     * @param numeric value the enum value
     */
    BaselineShift(int value) {
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
     * Create a new BaselineShift for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static BaselineShift of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> SUPERSCRIPT;
            case 2 -> SUBSCRIPT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
