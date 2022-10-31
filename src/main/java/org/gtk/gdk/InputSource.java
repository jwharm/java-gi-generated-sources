package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration describing the type of an input device in general terms.
 */
public class InputSource extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GdkInputSource";
    
    /**
     * the device is a mouse. (This will be reported for the core
     *   pointer, even if it is something else, such as a trackball.)
     */
    public static final InputSource MOUSE = new InputSource(0);
    
    /**
     * the device is a stylus of a graphics tablet or similar device.
     */
    public static final InputSource PEN = new InputSource(1);
    
    /**
     * the device is a keyboard.
     */
    public static final InputSource KEYBOARD = new InputSource(2);
    
    /**
     * the device is a direct-input touch device, such
     *   as a touchscreen or tablet
     */
    public static final InputSource TOUCHSCREEN = new InputSource(3);
    
    /**
     * the device is an indirect touch device, such
     *   as a touchpad
     */
    public static final InputSource TOUCHPAD = new InputSource(4);
    
    /**
     * the device is a trackpoint
     */
    public static final InputSource TRACKPOINT = new InputSource(5);
    
    /**
     * the device is a "pad", a collection of buttons,
     *   rings and strips found in drawing tablets
     */
    public static final InputSource TABLET_PAD = new InputSource(6);
    
    public InputSource(int value) {
        super(value);
    }
}
