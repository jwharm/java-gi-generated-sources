package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Controls how a widget deals with extra space in a single dimension.
 * <p>
 * Alignment only matters if the widget receives a “too large” allocation,
 * for example if you packed the widget with the {@code Gtk.Widget:hexpand}
 * property inside a {@link Box}, then the widget might get extra space.
 * If you have for example a 16x16 icon inside a 32x32 space, the icon
 * could be scaled and stretched, it could be centered, or it could be
 * positioned to one side of the space.
 * <p>
 * Note that in horizontal context {@link Align#START} and {@link Align#END}
 * are interpreted relative to text direction.
 * <p>
 * {@link Align#BASELINE} support is optional for containers and widgets, and
 * it is only supported for vertical alignment.  When it's not supported by
 * a child or a container it is treated as {@link Align#FILL}.
 */
public enum Align implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * stretch to fill all space if possible, center if
     *   no meaningful way to stretch
     */
    FILL(0),
    
    /**
     * snap to left or top side, leaving space on right or bottom
     */
    START(1),
    
    /**
     * snap to right or bottom side, leaving space on left or top
     */
    END(2),
    
    /**
     * center natural width of widget inside the allocation
     */
    CENTER(3),
    
    /**
     * align the widget according to the baseline.
     *   See {@link Widget}.
     */
    BASELINE(4);
    
    private static final java.lang.String C_TYPE_NAME = "GtkAlign";
    
    private final int value;
    
    /**
     * Create a new Align for the provided value
     * @param numeric value the enum value
     */
    Align(int value) {
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
     * Create a new Align for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Align of(int value) {
        return switch (value) {
            case 0 -> FILL;
            case 1 -> START;
            case 2 -> END;
            case 3 -> CENTER;
            case 4 -> BASELINE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
