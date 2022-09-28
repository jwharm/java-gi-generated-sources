package org.gtk.gtk;

/**
 * Specifies a preference for height-for-width or
 * width-for-height geometry management.
 */
public class SizeRequestMode {

    /**
     * Prefer height-for-width geometry management
     */
    public static final SizeRequestMode HEIGHT_FOR_WIDTH = new SizeRequestMode(0);
    
    /**
     * Prefer width-for-height geometry management
     */
    public static final SizeRequestMode WIDTH_FOR_HEIGHT = new SizeRequestMode(1);
    
    /**
     * Don’t trade height-for-width or width-for-height
     */
    public static final SizeRequestMode CONSTANT_SIZE = new SizeRequestMode(2);
    
    private int value;
    
    public SizeRequestMode(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SizeRequestMode[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
