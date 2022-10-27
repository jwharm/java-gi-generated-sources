package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_settings_set_orientation().
 */
public class PageOrientation extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
    
    public PageOrientation(int value) {
        super(value);
    }
}
