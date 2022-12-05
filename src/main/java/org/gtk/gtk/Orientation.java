package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents the orientation of widgets and other objects.
 * <p>
 * Typical examples are {@link Box}.
 */
public enum Orientation implements io.github.jwharm.javagi.Enumeration {
    /**
     * The element is in horizontal orientation.
     */
    HORIZONTAL(0),
    /**
     * The element is in vertical orientation.
     */
    VERTICAL(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkOrientation";
    
    private final int value;
    Orientation(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static Orientation of(int value) {
        return switch (value) {
            case 0 -> HORIZONTAL;
            case 1 -> VERTICAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
