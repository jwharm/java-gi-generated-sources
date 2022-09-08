package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public class TestLogBuffer extends io.github.jwharm.javagi.interop.ResourceBase {

    public TestLogBuffer(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_test_log_buffer_free(HANDLE());
    }
    
    /**
     * Internal function for gtester to retrieve test log messages, no ABI guarantees provided.
     */
    public TestLogMsg pop() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_test_log_buffer_pop(HANDLE());
        return new TestLogMsg(References.get(RESULT, false));
    }
    
}
