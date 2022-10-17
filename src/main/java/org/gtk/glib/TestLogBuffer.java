package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TestLogBuffer extends io.github.jwharm.javagi.ResourceBase {

    public TestLogBuffer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_test_log_buffer_free = Interop.downcallHandle(
        "g_test_log_buffer_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public @NotNull void free() {
        try {
            g_test_log_buffer_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_test_log_buffer_pop = Interop.downcallHandle(
        "g_test_log_buffer_pop",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Internal function for gtester to retrieve test log messages, no ABI guarantees provided.
     */
    public @NotNull TestLogMsg pop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_test_log_buffer_pop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TestLogMsg(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_test_log_buffer_push = Interop.downcallHandle(
        "g_test_log_buffer_push",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Internal function for gtester to decode test log messages, no ABI guarantees provided.
     */
    public @NotNull void push(@NotNull int nBytes, @NotNull PointerByte bytes) {
        try {
            g_test_log_buffer_push.invokeExact(handle(), nBytes, bytes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_test_log_buffer_new = Interop.downcallHandle(
        "g_test_log_buffer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Internal function for gtester to decode test log messages, no ABI guarantees provided.
     */
    public static @NotNull TestLogBuffer new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_test_log_buffer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TestLogBuffer(Refcounted.get(RESULT, false));
    }
    
}
