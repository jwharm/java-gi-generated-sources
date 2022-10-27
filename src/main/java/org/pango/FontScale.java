package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration that affects font sizes for superscript
 * and subscript positioning and for (emulated) Small Caps.
 * @version 1.50
 */
public class FontScale extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Leave the font size unchanged
     */
    public static final FontScale NONE = new FontScale(0);
    
    /**
     * Change the font to a size suitable for superscripts
     */
    public static final FontScale SUPERSCRIPT = new FontScale(1);
    
    /**
     * Change the font to a size suitable for subscripts
     */
    public static final FontScale SUBSCRIPT = new FontScale(2);
    
    /**
     * Change the font to a size suitable for Small Caps
     */
    public static final FontScale SMALL_CAPS = new FontScale(3);
    
    public FontScale(int value) {
        super(value);
    }
}
