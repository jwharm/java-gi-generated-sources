package org.gtk.gdkpixbuf;

/**
 * The possible rotations which can be passed to gdk_pixbuf_rotate_simple().
 * <p>
 * To make them easier to use, their numerical values are the actual degrees.
 */
public class PixbufRotation {

    /**
     * No rotation.
     */
    public static final PixbufRotation NONE = new PixbufRotation(0);
    
    /**
     * Rotate by 90 degrees.
     */
    public static final PixbufRotation COUNTERCLOCKWISE = new PixbufRotation(90);
    
    /**
     * Rotate by 180 degrees.
     */
    public static final PixbufRotation UPSIDEDOWN = new PixbufRotation(180);
    
    /**
     * Rotate by 270 degrees.
     */
    public static final PixbufRotation CLOCKWISE = new PixbufRotation(270);
    
    private int value;
    
    public PixbufRotation(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PixbufRotation[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
