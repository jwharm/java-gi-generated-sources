package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkTimeCoord} stores a single event in a motion history.
 */
public class TimeCoord extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("time"),
        org.gtk.gdk.AxisFlags.getMemoryLayout().withName("flags"),
        MemoryLayout.sequenceLayout(12, ValueLayout.JAVA_DOUBLE).withName("axes")
    ).withName("GdkTimeCoord");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TimeCoord(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
