package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the direction for scroll events.
 */
public enum ScrollDirection implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * the surface is scrolled up.
     */
    UP(0),
    
    /**
     * the surface is scrolled down.
     */
    DOWN(1),
    
    /**
     * the surface is scrolled to the left.
     */
    LEFT(2),
    
    /**
     * the surface is scrolled to the right.
     */
    RIGHT(3),
    
    /**
     * the scrolling is determined by the delta values
     *   in scroll events. See gdk_scroll_event_get_deltas()
     */
    SMOOTH(4);
    
    private static final java.lang.String C_TYPE_NAME = "GdkScrollDirection";
    
    private final int value;
    
    /**
     * Create a new ScrollDirection for the provided value
     * @param numeric value the enum value
     */
    ScrollDirection(int value) {
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
     * Create a new ScrollDirection for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ScrollDirection of(int value) {
        return switch (value) {
            case 0 -> UP;
            case 1 -> DOWN;
            case 2 -> LEFT;
            case 3 -> RIGHT;
            case 4 -> SMOOTH;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
