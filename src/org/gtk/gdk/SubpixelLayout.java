package org.gtk.gdk;

/**
 * This enumeration describes how the red, green and blue components
 * of physical pixels on an output device are laid out.
 */
public class SubpixelLayout {

    /**
     * The layout is not known
     */
    public static final SubpixelLayout UNKNOWN = new SubpixelLayout(0);
    
    /**
     * Not organized in this way
     */
    public static final SubpixelLayout NONE = new SubpixelLayout(1);
    
    /**
     * The layout is horizontal, the order is RGB
     */
    public static final SubpixelLayout HORIZONTAL_RGB = new SubpixelLayout(2);
    
    /**
     * The layout is horizontal, the order is BGR
     */
    public static final SubpixelLayout HORIZONTAL_BGR = new SubpixelLayout(3);
    
    /**
     * The layout is vertical, the order is RGB
     */
    public static final SubpixelLayout VERTICAL_RGB = new SubpixelLayout(4);
    
    /**
     * The layout is vertical, the order is BGR
     */
    public static final SubpixelLayout VERTICAL_BGR = new SubpixelLayout(5);
    
    private int value;
    
    public SubpixelLayout(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SubpixelLayout[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
