package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_settings_set_orientation().
 */
public class PageOrientation extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkPageOrientation";
    
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
