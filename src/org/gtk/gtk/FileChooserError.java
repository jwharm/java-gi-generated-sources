package org.gtk.gtk;

/**
 * These identify the various errors that can occur while calling
 * {@code GtkFileChooser} functions.
 */
public class FileChooserError {

    /**
     * Indicates that a file does not exist.
     */
    public static final FileChooserError NONEXISTENT = new FileChooserError(0);
    
    /**
     * Indicates a malformed filename.
     */
    public static final FileChooserError BAD_FILENAME = new FileChooserError(1);
    
    /**
     * Indicates a duplicate path (e.g. when
     *  adding a bookmark).
     */
    public static final FileChooserError ALREADY_EXISTS = new FileChooserError(2);
    
    /**
     * Indicates an incomplete hostname
     *  (e.g. "http://foo" without a slash after that).
     */
    public static final FileChooserError INCOMPLETE_HOSTNAME = new FileChooserError(3);
    
    private int value;
    
    public FileChooserError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FileChooserError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
