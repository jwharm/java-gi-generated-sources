package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Modes of caps intersection
 * <p>
 * {@link CapsIntersectMode#ZIG_ZAG} tries to preserve overall order of both caps
 * by iterating on the caps' structures as the following matrix shows:
 * <pre>{@code 
 *          caps1
 *       +-------------
 *       | 1  2  4  7
 * caps2 | 3  5  8 10
 *       | 6  9 11 12
 * }</pre>
 * <p>
 * Used when there is no explicit precedence of one caps over the other. e.g.
 * tee's sink pad getcaps function, it will probe its src pad peers' for their
 * caps and intersect them with this mode.
 * <p>
 * {@link CapsIntersectMode#FIRST} is useful when an element wants to preserve
 * another element's caps priority order when intersecting with its own caps.
 * Example: If caps1 is {@code [A, B, C]} and caps2 is {@code [E, B, D, A]}, the result
 * would be {@code [A, B]}, maintaining the first caps priority on the intersection.
 */
public enum CapsIntersectMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Zig-zags over both caps.
     */
    ZIG_ZAG(0),
    
    /**
     * Keeps the first caps order.
     */
    FIRST(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstCapsIntersectMode";
    
    private final int value;
    
    /**
     * Create a new CapsIntersectMode for the provided value
     * @param numeric value the enum value
     */
    CapsIntersectMode(int value) {
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
     * Create a new CapsIntersectMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static CapsIntersectMode of(int value) {
        return switch (value) {
            case 0 -> ZIG_ZAG;
            case 1 -> FIRST;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
