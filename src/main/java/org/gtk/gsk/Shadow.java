package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The shadow parameters in a shadow node.
 */
public class Shadow extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gdk.RGBA.getMemoryLayout().withName("color"),
        ValueLayout.JAVA_FLOAT.withName("dx"),
        ValueLayout.JAVA_FLOAT.withName("dy"),
        ValueLayout.JAVA_FLOAT.withName("radius")
    ).withName("GskShadow");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public Shadow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
