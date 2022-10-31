package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TestLogBuffer extends io.github.jwharm.javagi.ResourceBase {
    
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
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static TestLogBuffer allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TestLogBuffer newInstance = new TestLogBuffer(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public TestLogBuffer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
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
        return new org.gtk.glib.TestLogMsg(Refcounted.get(RESULT, false));
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
        return new org.gtk.glib.TestLogBuffer(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_test_log_buffer_free = Interop.downcallHandle(
            "g_test_log_buffer_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_test_log_buffer_pop = Interop.downcallHandle(
            "g_test_log_buffer_pop",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_test_log_buffer_push = Interop.downcallHandle(
            "g_test_log_buffer_push",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_test_log_buffer_new = Interop.downcallHandle(
            "g_test_log_buffer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
