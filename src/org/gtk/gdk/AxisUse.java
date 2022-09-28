package org.gtk.gdk;

/**
 * Defines how device axes are interpreted by GTK.
 * <p>
 * Note that the X and Y axes are not really needed; pointer devices
 * report their location via the x/y members of events regardless. Whether
 * X and Y are present as axes depends on the GDK backend.
 */
public class AxisUse {

    /**
     * the axis is ignored.
     */
    public static final AxisUse IGNORE = new AxisUse(0);
    
    /**
     * the axis is used as the x axis.
     */
    public static final AxisUse X = new AxisUse(1);
    
    /**
     * the axis is used as the y axis.
     */
    public static final AxisUse Y = new AxisUse(2);
    
    /**
     * the axis is used as the scroll x delta
     */
    public static final AxisUse DELTA_X = new AxisUse(3);
    
    /**
     * the axis is used as the scroll y delta
     */
    public static final AxisUse DELTA_Y = new AxisUse(4);
    
    /**
     * the axis is used for pressure information.
     */
    public static final AxisUse PRESSURE = new AxisUse(5);
    
    /**
     * the axis is used for x tilt information.
     */
    public static final AxisUse XTILT = new AxisUse(6);
    
    /**
     * the axis is used for y tilt information.
     */
    public static final AxisUse YTILT = new AxisUse(7);
    
    /**
     * the axis is used for wheel information.
     */
    public static final AxisUse WHEEL = new AxisUse(8);
    
    /**
     * the axis is used for pen/tablet distance information
     */
    public static final AxisUse DISTANCE = new AxisUse(9);
    
    /**
     * the axis is used for pen rotation information
     */
    public static final AxisUse ROTATION = new AxisUse(10);
    
    /**
     * the axis is used for pen slider information
     */
    public static final AxisUse SLIDER = new AxisUse(11);
    
    /**
     * a constant equal to the numerically highest axis value.
     */
    public static final AxisUse LAST = new AxisUse(12);
    
    private int value;
    
    public AxisUse(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(AxisUse[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
