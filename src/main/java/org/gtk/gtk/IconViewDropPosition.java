package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enum for determining where a dropped item goes.
 */
public enum IconViewDropPosition implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * no drop possible
     */
    NO_DROP(0),
    
    /**
     * dropped item replaces the item
     */
    DROP_INTO(1),
    
    /**
     * dropped item is inserted to the left
     */
    DROP_LEFT(2),
    
    /**
     * dropped item is inserted to the right
     */
    DROP_RIGHT(3),
    
    /**
     * dropped item is inserted above
     */
    DROP_ABOVE(4),
    
    /**
     * dropped item is inserted below
     */
    DROP_BELOW(5);
    
    private static final java.lang.String C_TYPE_NAME = "GtkIconViewDropPosition";
    
    private final int value;
    
    /**
     * Create a new IconViewDropPosition for the provided value
     * @param numeric value the enum value
     */
    IconViewDropPosition(int value) {
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
     * Create a new IconViewDropPosition for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static IconViewDropPosition of(int value) {
        return switch (value) {
            case 0 -> NO_DROP;
            case 1 -> DROP_INTO;
            case 2 -> DROP_LEFT;
            case 3 -> DROP_RIGHT;
            case 4 -> DROP_ABOVE;
            case 5 -> DROP_BELOW;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
