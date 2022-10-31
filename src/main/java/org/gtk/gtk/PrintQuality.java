package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_settings_set_quality().
 */
public class PrintQuality extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintQuality";
    
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
