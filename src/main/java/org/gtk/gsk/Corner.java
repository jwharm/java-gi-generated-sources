package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The corner indices used by {@code GskRoundedRect}.
 */
public enum Corner implements io.github.jwharm.javagi.Enumeration {
    /**
     * The top left corner
     */
    TOP_LEFT(0),
    /**
     * The top right corner
     */
    TOP_RIGHT(1),
    /**
     * The bottom right corner
     */
    BOTTOM_RIGHT(2),
    /**
     * The bottom left corner
     */
    BOTTOM_LEFT(3);
    
    private static final java.lang.String C_TYPE_NAME = "GskCorner";
    
    private final int value;
    Corner(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static Corner of(int value) {
        return switch (value) {
            case 0 -> TOP_LEFT;
            case 1 -> TOP_RIGHT;
            case 2 -> BOTTOM_RIGHT;
            case 3 -> BOTTOM_LEFT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
