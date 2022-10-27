package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies a preference for height-for-width or
 * width-for-height geometry management.
 */
public class SizeRequestMode extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Prefer height-for-width geometry management
     */
    public static final SizeRequestMode HEIGHT_FOR_WIDTH = new SizeRequestMode(0);
    
    /**
     * Prefer width-for-height geometry management
     */
    public static final SizeRequestMode WIDTH_FOR_HEIGHT = new SizeRequestMode(1);
    
    /**
     * Don’t trade height-for-width or width-for-height
     */
    public static final SizeRequestMode CONSTANT_SIZE = new SizeRequestMode(2);
    
    public SizeRequestMode(int value) {
        super(value);
    }
}
