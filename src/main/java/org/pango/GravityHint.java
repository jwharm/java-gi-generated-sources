package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoGravityHint} defines how horizontal scripts should behave in a
 * vertical context.
 * <p>
 * That is, English excerpts in a vertical paragraph for example.
 * <p>
 * See also {@code Pango.Gravity}
 * @version 1.16
 */
public enum GravityHint implements io.github.jwharm.javagi.Enumeration {
    /**
     * scripts will take their natural gravity based
     *   on the base gravity and the script.  This is the default.
     */
    NATURAL(0),
    /**
     * always use the base gravity set, regardless of
     *   the script.
     */
    STRONG(1),
    /**
     * for scripts not in their natural direction (eg.
     *   Latin in East gravity), choose per-script gravity such that every script
     *   respects the line progression. This means, Latin and Arabic will take
     *   opposite gravities and both flow top-to-bottom for example.
     */
    LINE(2);
    
    private static final java.lang.String C_TYPE_NAME = "PangoGravityHint";
    
    private final int value;
    GravityHint(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static GravityHint of(int value) {
        return switch (value) {
            case 0 -> NATURAL;
            case 1 -> STRONG;
            case 2 -> LINE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
