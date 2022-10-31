package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link FloatIEEE754} and {@link DoubleIEEE754} unions are used to access the sign,
 * mantissa and exponent of IEEE floats and doubles. These unions are defined
 * as appropriate for a given platform. IEEE floats and doubles are supported
 * (used for storage) by at least Intel, PPC and Sparc.
 */
public class DoubleIEEE754 extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDoubleIEEE754";
    
    private static GroupLayout memoryLayout = MemoryLayout.unionLayout(
        ValueLayout.JAVA_DOUBLE.withName("v_double")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    @ApiStatus.Internal
    public DoubleIEEE754(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}

