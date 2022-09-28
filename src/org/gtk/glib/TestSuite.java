package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a test suite.
 */
public class TestSuite extends io.github.jwharm.javagi.ResourceBase {

    public TestSuite(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Adds {@code test_case} to {@code suite}.
     */
    public void add(TestCase testCase) {
        gtk_h.g_test_suite_add(handle(), testCase.handle());
    }
    
    /**
     * Adds {@code nestedsuite} to {@code suite}.
     */
    public void addSuite(TestSuite nestedsuite) {
        gtk_h.g_test_suite_add_suite(handle(), nestedsuite.handle());
    }
    
    /**
     * Free the {@code suite} and all nested {@code GTestSuites}.
     */
    public void free() {
        gtk_h.g_test_suite_free(handle());
    }
    
}
