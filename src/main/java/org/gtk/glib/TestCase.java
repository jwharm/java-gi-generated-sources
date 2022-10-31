package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure representing a test case.
 */
public class TestCase extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTestCase";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TestCase allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TestCase newInstance = new TestCase(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public TestCase(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Free the {@code test_case}.
     */
    public void free() {
        try {
            DowncallHandles.g_test_case_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_test_case_free = Interop.downcallHandle(
            "g_test_case_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
