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
public enum DirectionT implements io.github.jwharm.javagi.Enumeration {
    /**
     * Initial, unset direction.
     */
    INVALID(0),
    /**
     * Text is set horizontally from left to right.
     */
    LTR(4),
    /**
     * Text is set horizontally from right to left.
     */
    RTL(5),
    /**
     * Text is set vertically from top to bottom.
     */
    TTB(6),
    /**
     * Text is set vertically from bottom to top.
     */
    BTT(7);
    
    private static final java.lang.String C_TYPE_NAME = "hb_direction_t";
    
    private final int value;
    DirectionT(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DirectionT of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 4 -> LTR;
            case 5 -> RTL;
            case 6 -> TTB;
            case 7 -> BTT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
