package org.gtk.glib;

/**
 * Error codes returned by key file parsing.
 */
public class KeyFileError {

    /**
     * the text being parsed was in
     *   an unknown encoding
     */
    public static final KeyFileError UNKNOWN_ENCODING = new KeyFileError(0);
    
    /**
     * document was ill-formed
     */
    public static final KeyFileError PARSE = new KeyFileError(1);
    
    /**
     * the file was not found
     */
    public static final KeyFileError NOT_FOUND = new KeyFileError(2);
    
    /**
     * a requested key was not found
     */
    public static final KeyFileError KEY_NOT_FOUND = new KeyFileError(3);
    
    /**
     * a requested group was not found
     */
    public static final KeyFileError GROUP_NOT_FOUND = new KeyFileError(4);
    
    /**
     * a value could not be parsed
     */
    public static final KeyFileError INVALID_VALUE = new KeyFileError(5);
    
    private int value;
    
    public KeyFileError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(KeyFileError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
