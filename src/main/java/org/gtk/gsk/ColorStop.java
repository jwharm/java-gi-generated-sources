package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A color stop in a gradient node.
 */
public class ColorStop extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("offset"),
        org.gtk.gdk.RGBA.getMemoryLayout().withName("color")
    ).withName("GskColorStop");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ColorStop(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
