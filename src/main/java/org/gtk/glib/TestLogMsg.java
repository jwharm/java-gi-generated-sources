package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TestLogMsg extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.glib.TestLogType.getMemoryLayout().withName("log_type"),
        ValueLayout.JAVA_INT.withName("n_strings"),
        Interop.valueLayout.ADDRESS.withName("strings"),
        ValueLayout.JAVA_INT.withName("n_nums"),
        ValueLayout.JAVA_DOUBLE.withName("nums")
    ).withName("GTestLogMsg");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TestLogMsg(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public void free() {
        try {
            DowncallHandles.g_test_log_msg_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_test_log_msg_free = Interop.downcallHandle(
            "g_test_log_msg_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
