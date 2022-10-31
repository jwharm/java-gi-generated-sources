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
public class GravityHint extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "PangoGravityHint";
    
    /**
     * scripts will take their natural gravity based
     *   on the base gravity and the script.  This is the default.
     */
    public static final GravityHint NATURAL = new GravityHint(0);
    
    /**
     * always use the base gravity set, regardless of
     *   the script.
     */
    public static final GravityHint STRONG = new GravityHint(1);
    
    /**
     * for scripts not in their natural direction (eg.
     *   Latin in East gravity), choose per-script gravity such that every script
     *   respects the line progression. This means, Latin and Arabic will take
     *   opposite gravities and both flow top-to-bottom for example.
     */
    public static final GravityHint LINE = new GravityHint(2);
    
    public GravityHint(int value) {
        super(value);
    }
}
