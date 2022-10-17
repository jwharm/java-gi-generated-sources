package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TestLogMsg extends io.github.jwharm.javagi.ResourceBase {

    public TestLogMsg(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_test_log_msg_free = Interop.downcallHandle(
        "g_test_log_msg_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public @NotNull void free() {
        try {
            g_test_log_msg_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
