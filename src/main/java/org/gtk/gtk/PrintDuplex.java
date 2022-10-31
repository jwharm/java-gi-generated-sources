package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_settings_set_duplex().
 */
public class PrintDuplex extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintDuplex";
    
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
