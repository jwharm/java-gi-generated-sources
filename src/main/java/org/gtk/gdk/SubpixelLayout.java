package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This enumeration describes how the red, green and blue components
 * of physical pixels on an output device are laid out.
 */
public class SubpixelLayout extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The layout is not known
     */
    public static final SubpixelLayout UNKNOWN = new SubpixelLayout(0);
    
    /**
     * Not organized in this way
     */
    public static final SubpixelLayout NONE = new SubpixelLayout(1);
    
    /**
     * The layout is horizontal, the order is RGB
     */
    public static final SubpixelLayout HORIZONTAL_RGB = new SubpixelLayout(2);
    
    /**
     * The layout is horizontal, the order is BGR
     */
    public static final SubpixelLayout HORIZONTAL_BGR = new SubpixelLayout(3);
    
    /**
     * The layout is vertical, the order is RGB
     */
    public static final SubpixelLayout VERTICAL_RGB = new SubpixelLayout(4);
    
    /**
     * The layout is vertical, the order is BGR
     */
    public static final SubpixelLayout VERTICAL_BGR = new SubpixelLayout(5);
    
    public SubpixelLayout(int value) {
        super(value);
    }
}
