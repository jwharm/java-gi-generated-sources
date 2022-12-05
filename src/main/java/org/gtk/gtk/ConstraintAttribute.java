package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The widget attributes that can be used when creating a {@link Constraint}.
 */
public enum ConstraintAttribute implements io.github.jwharm.javagi.Enumeration {
    /**
     * No attribute, used for constant
     *   relations
     */
    NONE(0),
    /**
     * The left edge of a widget, regardless of
     *   text direction
     */
    LEFT(1),
    /**
     * The right edge of a widget, regardless
     *   of text direction
     */
    RIGHT(2),
    /**
     * The top edge of a widget
     */
    TOP(3),
    /**
     * The bottom edge of a widget
     */
    BOTTOM(4),
    /**
     * The leading edge of a widget, depending
     *   on text direction; equivalent to {@link ConstraintAttribute#LEFT} for LTR
     *   languages, and {@link ConstraintAttribute#RIGHT} for RTL ones
     */
    START(5),
    /**
     * The trailing edge of a widget, depending
     *   on text direction; equivalent to {@link ConstraintAttribute#RIGHT} for LTR
     *   languages, and {@link ConstraintAttribute#LEFT} for RTL ones
     */
    END(6),
    /**
     * The width of a widget
     */
    WIDTH(7),
    /**
     * The height of a widget
     */
    HEIGHT(8),
    /**
     * The center of a widget, on the
     *   horizontal axis
     */
    CENTER_X(9),
    /**
     * The center of a widget, on the
     *   vertical axis
     */
    CENTER_Y(10),
    /**
     * The baseline of a widget
     */
    BASELINE(11);
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstraintAttribute";
    
    private final int value;
    ConstraintAttribute(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ConstraintAttribute of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> LEFT;
            case 2 -> RIGHT;
            case 3 -> TOP;
            case 4 -> BOTTOM;
            case 5 -> START;
            case 6 -> END;
            case 7 -> WIDTH;
            case 8 -> HEIGHT;
            case 9 -> CENTER_X;
            case 10 -> CENTER_Y;
            case 11 -> BASELINE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
