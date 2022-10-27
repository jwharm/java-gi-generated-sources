package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_settings_set_quality().
 */
public class PrintQuality extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
