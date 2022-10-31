package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure representing a test suite.
 */
public class TestSuite extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTestSuite";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TestSuite allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TestSuite newInstance = new TestSuite(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public TestSuite(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Adds {@code test_case} to {@code suite}.
     * @param testCase a {@link TestCase}
     */
    public void add(@NotNull org.gtk.glib.TestCase testCase) {
        java.util.Objects.requireNonNull(testCase, "Parameter 'testCase' must not be null");
        try {
            DowncallHandles.g_test_suite_add.invokeExact(
                    handle(),
                    testCase.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code nestedsuite} to {@code suite}.
     * @param nestedsuite another {@link TestSuite}
     */
    public void addSuite(@NotNull org.gtk.glib.TestSuite nestedsuite) {
        java.util.Objects.requireNonNull(nestedsuite, "Parameter 'nestedsuite' must not be null");
        try {
            DowncallHandles.g_test_suite_add_suite.invokeExact(
                    handle(),
                    nestedsuite.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Free the {@code suite} and all nested {@code GTestSuites}.
     */
    public void free() {
        try {
            DowncallHandles.g_test_suite_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_test_suite_add = Interop.downcallHandle(
            "g_test_suite_add",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_test_suite_add_suite = Interop.downcallHandle(
            "g_test_suite_add_suite",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_test_suite_free = Interop.downcallHandle(
            "g_test_suite_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
