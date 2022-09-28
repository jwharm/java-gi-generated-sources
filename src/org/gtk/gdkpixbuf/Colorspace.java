package org.gtk.gdkpixbuf;

/**
 * This enumeration defines the color spaces that are supported by
 * the gdk-pixbuf library.
 * <p>
 * Currently only RGB is supported.
 */
public class Colorspace {

    /**
     * Indicates a red/green/blue additive color space.
     */
    public static final Colorspace RGB = new Colorspace(0);
    
    private int value;
    
    public Colorspace(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Colorspace[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
