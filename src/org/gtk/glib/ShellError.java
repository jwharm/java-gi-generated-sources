package org.gtk.glib;

/**
 * Error codes returned by shell functions.
 */
public class ShellError {

    /**
     * Mismatched or otherwise mangled quoting.
     */
    public static final ShellError BAD_QUOTING = new ShellError(0);
    
    /**
     * String to be parsed was empty.
     */
    public static final ShellError EMPTY_STRING = new ShellError(1);
    
    /**
     * Some other error.
     */
    public static final ShellError FAILED = new ShellError(2);
    
    private int value;
    
    public ShellError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ShellError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
