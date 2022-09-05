package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a test case.
 */
public class TestCase extends io.github.jwharm.javagi.interop.ResourceBase {

    public TestCase(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Free the @test_case.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_test_case_free(HANDLE());
    }
    
}
