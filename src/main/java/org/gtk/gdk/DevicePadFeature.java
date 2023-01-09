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
    
    /**
     * Create a new DevicePadFeature for the provided value
     * @param numeric value the enum value
     */
    DevicePadFeature(int value) {
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
     * Create a new DevicePadFeature for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static DevicePadFeature of(int value) {
        return switch (value) {
            case 0 -> BUTTON;
            case 1 -> RING;
            case 2 -> STRIP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
