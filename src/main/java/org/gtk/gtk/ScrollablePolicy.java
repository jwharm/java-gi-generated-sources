package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the policy to be used in a scrollable widget when updating
 * the scrolled window adjustments in a given orientation.
 */
public enum ScrollablePolicy implements io.github.jwharm.javagi.Enumeration {
    /**
     * Scrollable adjustments are based on the minimum size
     */
    MINIMUM(0),
    /**
     * Scrollable adjustments are based on the natural size
     */
    NATURAL(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkScrollablePolicy";
    
    private final int value;
    ScrollablePolicy(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ScrollablePolicy of(int value) {
        return switch (value) {
            case 0 -> MINIMUM;
            case 1 -> NATURAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
