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
public class Direction extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * A strong left-to-right direction
     */
    public static final Direction LTR = new Direction(0);
    
    /**
     * A strong right-to-left direction
     */
    public static final Direction RTL = new Direction(1);
    
    /**
     * Deprecated value; treated the
     *   same as {@code PANGO_DIRECTION_RTL}.
     */
    public static final Direction TTB_LTR = new Direction(2);
    
    /**
     * Deprecated value; treated the
     *   same as {@code PANGO_DIRECTION_LTR}
     */
    public static final Direction TTB_RTL = new Direction(3);
    
    /**
     * A weak left-to-right direction
     */
    public static final Direction WEAK_LTR = new Direction(4);
    
    /**
     * A weak right-to-left direction
     */
    public static final Direction WEAK_RTL = new Direction(5);
    
    /**
     * No direction specified
     */
    public static final Direction NEUTRAL = new Direction(6);
    
    public Direction(int value) {
        super(value);
    }
}
