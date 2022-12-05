package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Focus movement types.
 */
public enum DirectionType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Move forward.
     */
    TAB_FORWARD(0),
    /**
     * Move backward.
     */
    TAB_BACKWARD(1),
    /**
     * Move up.
     */
    UP(2),
    /**
     * Move down.
     */
    DOWN(3),
    /**
     * Move left.
     */
    LEFT(4),
    /**
     * Move right.
     */
    RIGHT(5);
    
    private static final java.lang.String C_TYPE_NAME = "GtkDirectionType";
    
    private final int value;
    DirectionType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DirectionType of(int value) {
        return switch (value) {
            case 0 -> TAB_FORWARD;
            case 1 -> TAB_BACKWARD;
            case 2 -> UP;
            case 3 -> DOWN;
            case 4 -> LEFT;
            case 5 -> RIGHT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
