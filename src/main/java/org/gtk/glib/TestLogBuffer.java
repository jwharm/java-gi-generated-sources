package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TestLogBuffer extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTestLogBuffer";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.ADDRESS.withName("msgs")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TestLogBuffer allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TestLogBuffer newInstance = new TestLogBuffer(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TestLogBuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TestLogBuffer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public void free() {
        try {
            DowncallHandles.g_test_log_buffer_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Internal function for gtester to retrieve test log messages, no ABI guarantees provided.
     */
    public @NotNull org.gtk.glib.TestLogMsg pop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_test_log_buffer_pop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.TestLogMsg(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Internal function for gtester to decode test log messages, no ABI guarantees provided.
     */
    public void push(int nBytes, PointerByte bytes) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        try {
            DowncallHandles.g_test_log_buffer_push.invokeExact(
                    handle(),
                    nBytes,
                    bytes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Internal function for gtester to decode test log messages, no ABI guarantees provided.
     */
    public static @NotNull org.gtk.glib.TestLogBuffer new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_test_log_buffer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.TestLogBuffer(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_test_log_buffer_free = Interop.downcallHandle(
            "g_test_log_buffer_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_test_log_buffer_pop = Interop.downcallHandle(
            "g_test_log_buffer_pop",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_test_log_buffer_push = Interop.downcallHandle(
            "g_test_log_buffer_push",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_test_log_buffer_new = Interop.downcallHandle(
            "g_test_log_buffer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
    }
}
