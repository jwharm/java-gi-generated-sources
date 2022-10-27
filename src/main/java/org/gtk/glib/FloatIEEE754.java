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
public class FloatIEEE754 extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.unionLayout(
        ValueLayout.JAVA_FLOAT.withName("v_float")
    ).withName("GFloatIEEE754");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public FloatIEEE754(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}

