package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The math kerning-table types defined for the four corners
 * of a glyph.
 * @version 1.3.3
 */
public enum OtMathKernT implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The top right corner of the glyph.
     */
    TOP_RIGHT(0),
    
    /**
     * The top left corner of the glyph.
     */
    TOP_LEFT(1),
    
    /**
     * The bottom right corner of the glyph.
     */
    BOTTOM_RIGHT(2),
    
    /**
     * The bottom left corner of the glyph.
     */
    BOTTOM_LEFT(3);
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_math_kern_t";
    
    private final int value;
    
    /**
     * Create a new OtMathKernT for the provided value
     * @param numeric value the enum value
     */
    OtMathKernT(int value) {
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
     * Create a new OtMathKernT for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static OtMathKernT of(int value) {
        return switch (value) {
            case 0 -> TOP_RIGHT;
            case 1 -> TOP_LEFT;
            case 2 -> BOTTOM_RIGHT;
            case 3 -> BOTTOM_LEFT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
