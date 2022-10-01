package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TestLogMsg extends io.github.jwharm.javagi.ResourceBase {

    public TestLogMsg(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    public TestLogMsg() {
        super(Refcounted.get(io.github.jwharm.javagi.interop.jextract.GTestLogMsg.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public void free() {
        gtk_h.g_test_log_msg_free(handle());
    }
    
}
