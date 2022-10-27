package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TestConfig extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("test_initialized"),
        ValueLayout.JAVA_INT.withName("test_quick"),
        ValueLayout.JAVA_INT.withName("test_perf"),
        ValueLayout.JAVA_INT.withName("test_verbose"),
        ValueLayout.JAVA_INT.withName("test_quiet"),
        ValueLayout.JAVA_INT.withName("test_undefined")
    ).withName("GTestConfig");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TestConfig(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
