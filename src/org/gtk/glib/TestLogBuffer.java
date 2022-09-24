package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class TestLogBuffer extends io.github.jwharm.javagi.ResourceBase {

    public TestLogBuffer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TestLogBuffer() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GTestLogBuffer.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public void free() {
        gtk_h.g_test_log_buffer_free(handle());
    }
    
    /**
     * Internal function for gtester to retrieve test log messages, no ABI guarantees provided.
     */
    public TestLogMsg pop() {
        var RESULT = gtk_h.g_test_log_buffer_pop(handle());
        return new TestLogMsg(References.get(RESULT, false));
    }
    
    /**
     * Internal function for gtester to decode test log messages, no ABI guarantees provided.
     */
    public void push(int nBytes, PointerByte bytes) {
        gtk_h.g_test_log_buffer_push(handle(), nBytes, bytes.handle());
    }
    
    /**
     * Internal function for gtester to decode test log messages, no ABI guarantees provided.
     */
    public static TestLogBuffer new_() {
        var RESULT = gtk_h.g_test_log_buffer_new();
        return new TestLogBuffer(References.get(RESULT, false));
    }
    
}
