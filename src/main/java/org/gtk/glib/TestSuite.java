package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure representing a test suite.
 */
public class TestSuite extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTestSuite";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TestSuite}
     * @return A new, uninitialized @{link TestSuite}
     */
    public static TestSuite allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TestSuite newInstance = new TestSuite(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TestSuite proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TestSuite(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TestSuite> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TestSuite(input);
    
    /**
     * Adds {@code test_case} to {@code suite}.
     * @param testCase a {@link TestCase}
     */
    public void add(org.gtk.glib.TestCase testCase) {
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
    public void addSuite(org.gtk.glib.TestSuite nestedsuite) {
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
            DowncallHandles.g_test_suite_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_test_suite_add = Interop.downcallHandle(
                "g_test_suite_add",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_test_suite_add_suite = Interop.downcallHandle(
                "g_test_suite_add_suite",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_test_suite_free = Interop.downcallHandle(
                "g_test_suite_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
}
