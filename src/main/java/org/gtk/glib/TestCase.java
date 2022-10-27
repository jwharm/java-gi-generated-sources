package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure representing a test case.
 */
public class TestCase extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public TestCase(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Free the {@code test_case}.
     */
    public void free() {
        try {
            DowncallHandles.g_test_case_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_test_case_free = Interop.downcallHandle(
            "g_test_case_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
