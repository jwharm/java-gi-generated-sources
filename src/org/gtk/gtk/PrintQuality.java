package org.gtk.gtk;

/**
 * See also gtk_print_settings_set_quality().
 */
public class PrintQuality extends io.github.jwharm.javagi.Enumeration {

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
    
    public PrintQuality(int value) {
        super(value);
    }
    
}
