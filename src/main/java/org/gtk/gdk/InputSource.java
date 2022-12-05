package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration describing the type of an input device in general terms.
 */
public enum InputSource implements io.github.jwharm.javagi.Enumeration {
    /**
     * the device is a mouse. (This will be reported for the core
     *   pointer, even if it is something else, such as a trackball.)
     */
    MOUSE(0),
    /**
     * the device is a stylus of a graphics tablet or similar device.
     */
    PEN(1),
    /**
     * the device is a keyboard.
     */
    KEYBOARD(2),
    /**
     * the device is a direct-input touch device, such
     *   as a touchscreen or tablet
     */
    TOUCHSCREEN(3),
    /**
     * the device is an indirect touch device, such
     *   as a touchpad
     */
    TOUCHPAD(4),
    /**
     * the device is a trackpoint
     */
    TRACKPOINT(5),
    /**
     * the device is a "pad", a collection of buttons,
     *   rings and strips found in drawing tablets
     */
    TABLET_PAD(6);
    
    private static final java.lang.String C_TYPE_NAME = "GdkInputSource";
    
    private final int value;
    InputSource(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static InputSource of(int value) {
        return switch (value) {
            case 0 -> MOUSE;
            case 1 -> PEN;
            case 2 -> KEYBOARD;
            case 3 -> TOUCHSCREEN;
            case 4 -> TOUCHPAD;
            case 5 -> TRACKPOINT;
            case 6 -> TABLET_PAD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
