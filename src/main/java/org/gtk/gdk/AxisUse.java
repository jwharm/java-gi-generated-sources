package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines how device axes are interpreted by GTK.
 * <p>
 * Note that the X and Y axes are not really needed; pointer devices
 * report their location via the x/y members of events regardless. Whether
 * X and Y are present as axes depends on the GDK backend.
 */
public enum AxisUse implements io.github.jwharm.javagi.Enumeration {
    /**
     * the axis is ignored.
     */
    IGNORE(0),
    /**
     * the axis is used as the x axis.
     */
    X(1),
    /**
     * the axis is used as the y axis.
     */
    Y(2),
    /**
     * the axis is used as the scroll x delta
     */
    DELTA_X(3),
    /**
     * the axis is used as the scroll y delta
     */
    DELTA_Y(4),
    /**
     * the axis is used for pressure information.
     */
    PRESSURE(5),
    /**
     * the axis is used for x tilt information.
     */
    XTILT(6),
    /**
     * the axis is used for y tilt information.
     */
    YTILT(7),
    /**
     * the axis is used for wheel information.
     */
    WHEEL(8),
    /**
     * the axis is used for pen/tablet distance information
     */
    DISTANCE(9),
    /**
     * the axis is used for pen rotation information
     */
    ROTATION(10),
    /**
     * the axis is used for pen slider information
     */
    SLIDER(11),
    /**
     * a constant equal to the numerically highest axis value.
     */
    LAST(12);
    
    private static final java.lang.String C_TYPE_NAME = "GdkAxisUse";
    
    private final int value;
    AxisUse(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AxisUse of(int value) {
        return switch (value) {
            case 0 -> IGNORE;
            case 1 -> X;
            case 2 -> Y;
            case 3 -> DELTA_X;
            case 4 -> DELTA_Y;
            case 5 -> PRESSURE;
            case 6 -> XTILT;
            case 7 -> YTILT;
            case 8 -> WHEEL;
            case 9 -> DISTANCE;
            case 10 -> ROTATION;
            case 11 -> SLIDER;
            case 12 -> LAST;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
