package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure used for scatter/gather data output.
 * You generally pass in an array of {@code GOutputVectors}
 * and the operation will use all the buffers as if they were
 * one buffer.
 * @version 2.22
 */
public class OutputVector extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("size")
    ).withName("GOutputVector");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public OutputVector(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
