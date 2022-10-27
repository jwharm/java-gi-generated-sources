package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoOverline} enumeration is used to specify whether text
 * should be overlined, and if so, the type of line.
 * @version 1.46
 */
public class Overline extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * no overline should be drawn
     */
    public static final Overline NONE = new Overline(0);
    
    /**
     * Draw a single line above the ink
     *   extents of the text being underlined.
     */
    public static final Overline SINGLE = new Overline(1);
    
    public Overline(int value) {
        super(value);
    }
}
