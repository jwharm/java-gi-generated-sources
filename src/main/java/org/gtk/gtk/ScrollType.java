package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Scrolling types.
 */
public enum ScrollType implements io.github.jwharm.javagi.Enumeration {
    /**
     * No scrolling.
     */
    NONE(0),
    /**
     * Jump to new location.
     */
    JUMP(1),
    /**
     * Step backward.
     */
    STEP_BACKWARD(2),
    /**
     * Step forward.
     */
    STEP_FORWARD(3),
    /**
     * Page backward.
     */
    PAGE_BACKWARD(4),
    /**
     * Page forward.
     */
    PAGE_FORWARD(5),
    /**
     * Step up.
     */
    STEP_UP(6),
    /**
     * Step down.
     */
    STEP_DOWN(7),
    /**
     * Page up.
     */
    PAGE_UP(8),
    /**
     * Page down.
     */
    PAGE_DOWN(9),
    /**
     * Step to the left.
     */
    STEP_LEFT(10),
    /**
     * Step to the right.
     */
    STEP_RIGHT(11),
    /**
     * Page to the left.
     */
    PAGE_LEFT(12),
    /**
     * Page to the right.
     */
    PAGE_RIGHT(13),
    /**
     * Scroll to start.
     */
    START(14),
    /**
     * Scroll to end.
     */
    END(15);
    
    private static final java.lang.String C_TYPE_NAME = "GtkScrollType";
    
    private final int value;
    ScrollType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ScrollType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> JUMP;
            case 2 -> STEP_BACKWARD;
            case 3 -> STEP_FORWARD;
            case 4 -> PAGE_BACKWARD;
            case 5 -> PAGE_FORWARD;
            case 6 -> STEP_UP;
            case 7 -> STEP_DOWN;
            case 8 -> PAGE_UP;
            case 9 -> PAGE_DOWN;
            case 10 -> STEP_LEFT;
            case 11 -> STEP_RIGHT;
            case 12 -> PAGE_LEFT;
            case 13 -> PAGE_RIGHT;
            case 14 -> START;
            case 15 -> END;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
