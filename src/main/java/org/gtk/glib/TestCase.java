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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TestCase newInstance = new TestCase(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TestCase proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TestCase(Addressable address, Ownership ownership) {
        super(address, ownership);
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
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TestCase struct;
        
         /**
         * A {@link TestCase.Build} object constructs a {@link TestCase} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TestCase.allocate();
        }
        
         /**
         * Finish building the {@link TestCase} struct.
         * @return A new instance of {@code TestCase} with the fields 
         *         that were set in the Build object.
         */
        public TestCase construct() {
            return struct;
        }
    }
}
