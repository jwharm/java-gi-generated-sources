package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The direction of a text segment or buffer.
 * <p>
 * A segment can also be tested for horizontal or vertical
 * orientation (irrespective of specific direction) with
 * HB_DIRECTION_IS_HORIZONTAL() or HB_DIRECTION_IS_VERTICAL().
 */
public class DirectionT extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "hb_direction_t";
    
    /**
     * Initial, unset direction.
     */
    public static final DirectionT INVALID = new DirectionT(0);
    
    /**
     * Text is set horizontally from left to right.
     */
    public static final DirectionT LTR = new DirectionT(4);
    
    /**
     * Text is set horizontally from right to left.
     */
    public static final DirectionT RTL = new DirectionT(5);
    
    /**
     * Text is set vertically from top to bottom.
     */
    public static final DirectionT TTB = new DirectionT(6);
    
    /**
     * Text is set vertically from bottom to top.
     */
    public static final DirectionT BTT = new DirectionT(7);
    
    public DirectionT(int value) {
        super(value);
    }
}
