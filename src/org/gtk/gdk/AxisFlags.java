package org.gtk.gdk;

/**
 * Flags describing the current capabilities of a device/tool.
 */
public class AxisFlags {

    /**
     * X axis is present
     */
    public static final int X = 2;
    
    /**
     * Y axis is present
     */
    public static final int Y = 4;
    
    /**
     * Scroll X delta axis is present
     */
    public static final int DELTA_X = 8;
    
    /**
     * Scroll Y delta axis is present
     */
    public static final int DELTA_Y = 16;
    
    /**
     * Pressure axis is present
     */
    public static final int PRESSURE = 32;
    
    /**
     * X tilt axis is present
     */
    public static final int XTILT = 64;
    
    /**
     * Y tilt axis is present
     */
    public static final int YTILT = 128;
    
    /**
     * Wheel axis is present
     */
    public static final int WHEEL = 256;
    
    /**
     * Distance axis is present
     */
    public static final int DISTANCE = 512;
    
    /**
     * Z-axis rotation is present
     */
    public static final int ROTATION = 1024;
    
    /**
     * Slider axis is present
     */
    public static final int SLIDER = 2048;
    
}
