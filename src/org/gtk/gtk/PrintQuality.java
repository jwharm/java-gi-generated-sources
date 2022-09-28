package org.gtk.gtk;

/**
 * See also gtk_print_settings_set_quality().
 */
public class PrintQuality {

    /**
     * Low quality.
     */
    public static final PrintQuality LOW = new PrintQuality(0);
    
    /**
     * Normal quality.
     */
    public static final PrintQuality NORMAL = new PrintQuality(1);
    
    /**
     * High quality.
     */
    public static final PrintQuality HIGH = new PrintQuality(2);
    
    /**
     * Draft quality.
     */
    public static final PrintQuality DRAFT = new PrintQuality(3);
    
    private int value;
    
    public PrintQuality(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PrintQuality[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
