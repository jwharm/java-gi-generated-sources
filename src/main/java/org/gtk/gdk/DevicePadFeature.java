package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A pad feature.
 */
public enum DevicePadFeature implements io.github.jwharm.javagi.Enumeration {
    /**
     * a button
     */
    BUTTON(0),
    /**
     * a ring-shaped interactive area
     */
    RING(1),
    /**
     * a straight interactive area
     */
    STRIP(2);
    
    private static final java.lang.String C_TYPE_NAME = "GdkDevicePadFeature";
    
    private final int value;
    DevicePadFeature(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DevicePadFeature of(int value) {
        return switch (value) {
            case 0 -> BUTTON;
            case 1 -> RING;
            case 2 -> STRIP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
