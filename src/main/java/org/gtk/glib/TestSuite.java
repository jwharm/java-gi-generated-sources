package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure representing a test suite.
 */
public class TestSuite extends io.github.jwharm.javagi.ResourceBase {

    public TestSuite(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_test_suite_add = Interop.downcallHandle(
        "g_test_suite_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code test_case} to {@code suite}.
     */
    public @NotNull void add(@NotNull TestCase testCase) {
        try {
            g_test_suite_add.invokeExact(handle(), testCase.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_test_suite_add_suite = Interop.downcallHandle(
        "g_test_suite_add_suite",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code nestedsuite} to {@code suite}.
     */
    public @NotNull void addSuite(@NotNull TestSuite nestedsuite) {
        try {
            g_test_suite_add_suite.invokeExact(handle(), nestedsuite.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_test_suite_free = Interop.downcallHandle(
        "g_test_suite_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Free the {@code suite} and all nested {@code GTestSuites}.
     */
    public @NotNull void free() {
        try {
            g_test_suite_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
