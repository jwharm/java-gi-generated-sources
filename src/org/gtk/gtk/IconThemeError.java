package org.gtk.gtk;

/**
 * Error codes for {@code GtkIconTheme} operations.
 */
public class IconThemeError {

    /**
     * The icon specified does not exist in the theme
     */
    public static final IconThemeError NOT_FOUND = new IconThemeError(0);
    
    /**
     * An unspecified error occurred.
     */
    public static final IconThemeError FAILED = new IconThemeError(1);
    
    private int value;
    
    public IconThemeError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(IconThemeError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
