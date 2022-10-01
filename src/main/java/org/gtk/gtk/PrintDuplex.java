package org.gtk.gtk;

/**
 * See also gtk_print_settings_set_duplex().
 */
public class PrintDuplex extends io.github.jwharm.javagi.Enumeration {

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
    
    public PrintDuplex(int value) {
        super(value);
    }
    
}
