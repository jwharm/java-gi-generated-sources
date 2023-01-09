package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This enumeration describes how the red, green and blue components
 * of physical pixels on an output device are laid out.
 */
public enum SubpixelLayout implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The layout is not known
     */
    UNKNOWN(0),
    
    /**
     * Not organized in this way
     */
    NONE(1),
    
    /**
     * The layout is horizontal, the order is RGB
     */
    HORIZONTAL_RGB(2),
    
    /**
     * The layout is horizontal, the order is BGR
     */
    HORIZONTAL_BGR(3),
    
    /**
     * The layout is vertical, the order is RGB
     */
    VERTICAL_RGB(4),
    
    /**
     * The layout is vertical, the order is BGR
     */
    VERTICAL_BGR(5);
    
    private static final java.lang.String C_TYPE_NAME = "GdkSubpixelLayout";
    
    private final int value;
    
    /**
     * Create a new SubpixelLayout for the provided value
     * @param numeric value the enum value
     */
    SubpixelLayout(int value) {
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
     * Create a new SubpixelLayout for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static SubpixelLayout of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> NONE;
            case 2 -> HORIZONTAL_RGB;
            case 3 -> HORIZONTAL_BGR;
            case 4 -> VERTICAL_RGB;
            case 5 -> VERTICAL_BGR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
