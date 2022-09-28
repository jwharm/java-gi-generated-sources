package org.gtk.gdk;

/**
 * Flags describing the current capabilities of a device/tool.
 */
public class AxisFlags {

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
    
    private int value;
    
    public AxisFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(AxisFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public AxisFlags combined(AxisFlags mask) {
        return new AxisFlags(this.getValue() | mask.getValue());
    }
    
    public static AxisFlags combined(AxisFlags mask, AxisFlags... masks) {
        int value = mask.getValue();
        for (AxisFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AxisFlags(value);
    }
    
}
