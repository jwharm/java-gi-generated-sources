package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TestLogMsg extends io.github.jwharm.javagi.ResourceBase {

    public TestLogMsg(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_test_log_msg_free = Interop.downcallHandle(
        "g_test_log_msg_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public void free() {
        try {
            g_test_log_msg_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
