package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public class TestLogMsg extends io.github.jwharm.javagi.interop.ResourceBase {

    public TestLogMsg(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_test_log_msg_free(HANDLE());
    }
    
}
