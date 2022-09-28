package org.gtk.gtk;

/**
 * See also gtk_print_settings_set_orientation().
 */
public class PageOrientation {

    /**
     * Portrait mode.
     */
    public static final PageOrientation PORTRAIT = new PageOrientation(0);
    
    /**
     * Landscape mode.
     */
    public static final PageOrientation LANDSCAPE = new PageOrientation(1);
    
    /**
     * Reverse portrait mode.
     */
    public static final PageOrientation REVERSE_PORTRAIT = new PageOrientation(2);
    
    /**
     * Reverse landscape mode.
     */
    public static final PageOrientation REVERSE_LANDSCAPE = new PageOrientation(3);
    
    private int value;
    
    public PageOrientation(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PageOrientation[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
