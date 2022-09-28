package org.gtk.gtk;

/**
 * Error codes that identify various errors that can occur while
 * using the GTK printing support.
 */
public class PrintError {

    /**
     * An unspecified error occurred.
     */
    public static final PrintError GENERAL = new PrintError(0);
    
    /**
     * An internal error occurred.
     */
    public static final PrintError INTERNAL_ERROR = new PrintError(1);
    
    /**
     * A memory allocation failed.
     */
    public static final PrintError NOMEM = new PrintError(2);
    
    /**
     * An error occurred while loading a page setup
     *   or paper size from a key file.
     */
    public static final PrintError INVALID_FILE = new PrintError(3);
    
    private int value;
    
    public PrintError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PrintError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
