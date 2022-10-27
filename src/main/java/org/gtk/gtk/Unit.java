package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_settings_set_paper_width().
 */
public class Unit extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * No units.
     */
    public static final Unit NONE = new Unit(0);
    
    /**
     * Dimensions in points.
     */
    public static final Unit POINTS = new Unit(1);
    
    /**
     * Dimensions in inches.
     */
    public static final Unit INCH = new Unit(2);
    
    /**
     * Dimensions in millimeters
     */
    public static final Unit MM = new Unit(3);
    
    public Unit(int value) {
        super(value);
    }
}
