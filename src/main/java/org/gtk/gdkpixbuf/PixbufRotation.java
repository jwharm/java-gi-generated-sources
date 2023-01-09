package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible rotations which can be passed to gdk_pixbuf_rotate_simple().
 * <p>
 * To make them easier to use, their numerical values are the actual degrees.
 */
public enum PixbufRotation implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No rotation.
     */
    NONE(0),
    
    /**
     * Rotate by 90 degrees.
     */
    COUNTERCLOCKWISE(90),
    
    /**
     * Rotate by 180 degrees.
     */
    UPSIDEDOWN(180),
    
    /**
     * Rotate by 270 degrees.
     */
    CLOCKWISE(270);
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufRotation";
    
    private final int value;
    
    /**
     * Create a new PixbufRotation for the provided value
     * @param numeric value the enum value
     */
    PixbufRotation(int value) {
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
     * Create a new PixbufRotation for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PixbufRotation of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 90 -> COUNTERCLOCKWISE;
            case 180 -> UPSIDEDOWN;
            case 270 -> CLOCKWISE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
