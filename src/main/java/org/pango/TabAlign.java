package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoTabAlign} specifies where the text appears relative to the tab stop
 * position.
 */
public class TabAlign extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * the text appears to the right of the tab stop position
     */
    public static final TabAlign LEFT = new TabAlign(0);
    
    /**
     * the text appears to the left of the tab stop position
     *   until the available space is filled. Since: 1.50
     */
    public static final TabAlign RIGHT = new TabAlign(1);
    
    /**
     * the text is centered at the tab stop position
     *   until the available space is filled. Since: 1.50
     */
    public static final TabAlign CENTER = new TabAlign(2);
    
    /**
     * text before the first occurrence of the decimal point
     *   character appears to the left of the tab stop position (until the available
     *   space is filled), the rest to the right. Since: 1.50
     */
    public static final TabAlign DECIMAL = new TabAlign(3);
    
    public TabAlign(int value) {
        super(value);
    }
}
