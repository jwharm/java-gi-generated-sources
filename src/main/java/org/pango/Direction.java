package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoDirection} represents a direction in the Unicode bidirectional
 * algorithm.
 * <p>
 * Not every value in this enumeration makes sense for every usage of
 * {@code PangoDirection}; for example, the return value of {@link Pango#unicharDirection}
 * and {@link Pango#findBaseDir} cannot be {@code PANGO_DIRECTION_WEAK_LTR} or
 * {@code PANGO_DIRECTION_WEAK_RTL}, since every character is either neutral
 * or has a strong direction; on the other hand {@code PANGO_DIRECTION_NEUTRAL}
 * doesn't make sense to pass to {@link Pango#itemizeWithBaseDir}.
 * <p>
 * The {@code PANGO_DIRECTION_TTB_LTR}, {@code PANGO_DIRECTION_TTB_RTL} values come from
 * an earlier interpretation of this enumeration as the writing direction
 * of a block of text and are no longer used. See {@code PangoGravity} for how
 * vertical text is handled in Pango.
 * <p>
 * If you are interested in text direction, you should really use fribidi
 * directly. {@code PangoDirection} is only retained because it is used in some
 * public apis.
 */
public enum Direction implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * A strong left-to-right direction
     */
    LTR(0),
    
    /**
     * A strong right-to-left direction
     */
    RTL(1),
    
    /**
     * Deprecated value; treated the
     *   same as {@code PANGO_DIRECTION_RTL}.
     */
    TTB_LTR(2),
    
    /**
     * Deprecated value; treated the
     *   same as {@code PANGO_DIRECTION_LTR}
     */
    TTB_RTL(3),
    
    /**
     * A weak left-to-right direction
     */
    WEAK_LTR(4),
    
    /**
     * A weak right-to-left direction
     */
    WEAK_RTL(5),
    
    /**
     * No direction specified
     */
    NEUTRAL(6);
    
    private static final java.lang.String C_TYPE_NAME = "PangoDirection";
    
    private final int value;
    
    /**
     * Create a new Direction for the provided value
     * @param numeric value the enum value
     */
    Direction(int value) {
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
     * Create a new Direction for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Direction of(int value) {
        return switch (value) {
            case 0 -> LTR;
            case 1 -> RTL;
            case 2 -> TTB_LTR;
            case 3 -> TTB_RTL;
            case 4 -> WEAK_LTR;
            case 5 -> WEAK_RTL;
            case 6 -> NEUTRAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
