package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure which contains a single flags value, its name, and its
 * nickname.
 */
public class FlagsValue extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("value"),
        Interop.valueLayout.ADDRESS.withName("value_name"),
        Interop.valueLayout.ADDRESS.withName("value_nick")
    ).withName("GFlagsValue");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public FlagsValue(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
