package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a test suite.
 */
public class TestSuite extends io.github.jwharm.javagi.ResourceBase {

    public TestSuite(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Adds @test_case to @suite.
     */
    public void add(TestCase testCase) {
        gtk_h.g_test_suite_add(handle(), testCase.handle());
    }
    
    /**
     * Adds @nestedsuite to @suite.
     */
    public void addSuite(TestSuite nestedsuite) {
        gtk_h.g_test_suite_add_suite(handle(), nestedsuite.handle());
    }
    
    /**
     * Free the @suite and all nested #GTestSuites.
     */
    public void free() {
        gtk_h.g_test_suite_free(handle());
    }
    
}
