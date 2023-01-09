package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_settings_set_paper_width().
 */
public enum Unit implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No units.
     */
    NONE(0),
    
    /**
     * Dimensions in points.
     */
    POINTS(1),
    
    /**
     * Dimensions in inches.
     */
    INCH(2),
    
    /**
     * Dimensions in millimeters
     */
    MM(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkUnit";
    
    private final int value;
    
    /**
     * Create a new Unit for the provided value
     * @param numeric value the enum value
     */
    Unit(int value) {
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
     * Create a new Unit for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Unit of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> POINTS;
            case 2 -> INCH;
            case 3 -> MM;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
