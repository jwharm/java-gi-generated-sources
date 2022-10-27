package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure used for scatter/gather data input.
 * You generally pass in an array of {@code GInputVectors}
 * and the operation will store the read data starting in the
 * first buffer, switching to the next as needed.
 * @version 2.22
 */
public class InputVector extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("size")
    ).withName("GInputVector");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public InputVector(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
