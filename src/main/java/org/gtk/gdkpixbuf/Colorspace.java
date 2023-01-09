package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This enumeration defines the color spaces that are supported by
 * the gdk-pixbuf library.
 * <p>
 * Currently only RGB is supported.
 */
public enum Colorspace implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Indicates a red/green/blue additive color space.
     */
    RGB(0);
    
    private static final java.lang.String C_TYPE_NAME = "GdkColorspace";
    
    private final int value;
    
    /**
     * Create a new Colorspace for the provided value
     * @param numeric value the enum value
     */
    Colorspace(int value) {
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
     * Create a new Colorspace for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Colorspace of(int value) {
        return switch (value) {
            case 0 -> RGB;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
