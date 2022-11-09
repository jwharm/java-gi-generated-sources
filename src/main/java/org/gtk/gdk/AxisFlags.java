package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags describing the current capabilities of a device/tool.
 */
public class AxisFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GdkAxisFlags";
    
    /**
     * X axis is present
     */
    public static final AxisFlags X = new AxisFlags(2);
    
    /**
     * Y axis is present
     */
    public static final AxisFlags Y = new AxisFlags(4);
    
    /**
     * Scroll X delta axis is present
     */
    public static final AxisFlags DELTA_X = new AxisFlags(8);
    
    /**
     * Scroll Y delta axis is present
     */
    public static final AxisFlags DELTA_Y = new AxisFlags(16);
    
    /**
     * Pressure axis is present
     */
    public static final AxisFlags PRESSURE = new AxisFlags(32);
    
    /**
     * X tilt axis is present
     */
    public static final AxisFlags XTILT = new AxisFlags(64);
    
    /**
     * Y tilt axis is present
     */
    public static final AxisFlags YTILT = new AxisFlags(128);
    
    /**
     * Wheel axis is present
     */
    public static final AxisFlags WHEEL = new AxisFlags(256);
    
    /**
     * Distance axis is present
     */
    public static final AxisFlags DISTANCE = new AxisFlags(512);
    
    /**
     * Z-axis rotation is present
     */
    public static final AxisFlags ROTATION = new AxisFlags(1024);
    
    /**
     * Slider axis is present
     */
    public static final AxisFlags SLIDER = new AxisFlags(2048);
    
    public AxisFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public AxisFlags combined(AxisFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static AxisFlags combined(AxisFlags mask, AxisFlags... masks) {
        for (AxisFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
