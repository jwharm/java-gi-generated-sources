package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a test suite.
 */
public class TestSuite extends io.github.jwharm.javagi.interop.ResourceBase {

    public TestSuite(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Adds @test_case to @suite.
     */
    public void add(TestCase testCase) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_test_suite_add(HANDLE(), testCase.HANDLE());
    }
    
    /**
     * Adds @nestedsuite to @suite.
     */
    public void addSuite(TestSuite nestedsuite) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_test_suite_add_suite(HANDLE(), nestedsuite.HANDLE());
    }
    
    /**
     * Free the @suite and all nested #GTestSuites.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_test_suite_free(HANDLE());
    }
    
}
