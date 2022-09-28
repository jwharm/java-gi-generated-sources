package org.gtk.gtk;

/**
 * See also gtk_print_settings_set_duplex().
 */
public class PrintDuplex {

    /**
     * No duplex.
     */
    public static final PrintDuplex SIMPLEX = new PrintDuplex(0);
    
    /**
     * Horizontal duplex.
     */
    public static final PrintDuplex HORIZONTAL = new PrintDuplex(1);
    
    /**
     * Vertical duplex.
     */
    public static final PrintDuplex VERTICAL = new PrintDuplex(2);
    
    private int value;
    
    public PrintDuplex(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PrintDuplex[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
