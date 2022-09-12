package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a test case.
 */
public class TestCase extends io.github.jwharm.javagi.ResourceBase {

    public TestCase(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Free the @test_case.
     */
    public void free() {
        gtk_h.g_test_case_free(handle());
    }
    
}
