package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a test case.
 */
public class TestCase extends io.github.jwharm.javagi.ResourceBase {

    public TestCase(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Free the {@code test_case}.
     */
    public void free() {
        gtk_h.g_test_case_free(handle());
    }
    
}
