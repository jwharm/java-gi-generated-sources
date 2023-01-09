package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure representing a test case.
 */
public class TestCase extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTestCase";
    
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
     * Allocate a new {@link TestCase}
     * @return A new, uninitialized @{link TestCase}
     */
    public static TestCase allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TestCase newInstance = new TestCase(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TestCase proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TestCase(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TestCase> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TestCase(input);
    
    /**
     * Free the {@code test_case}.
     */
    public void free() {
        try {
            DowncallHandles.g_test_case_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_test_case_free = Interop.downcallHandle(
                "g_test_case_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
}
