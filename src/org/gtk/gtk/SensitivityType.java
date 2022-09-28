package org.gtk.gtk;

/**
 * Determines how GTK handles the sensitivity of various controls,
 * such as combo box buttons.
 */
public class SensitivityType {

    /**
     * The control is made insensitive if no
     *   action can be triggered
     */
    public static final SensitivityType AUTO = new SensitivityType(0);
    
    /**
     * The control is always sensitive
     */
    public static final SensitivityType ON = new SensitivityType(1);
    
    /**
     * The control is always insensitive
     */
    public static final SensitivityType OFF = new SensitivityType(2);
    
    private int value;
    
    public SensitivityType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SensitivityType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
