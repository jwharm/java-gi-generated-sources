package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TestLogBuffer extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTestLogBuffer";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("data"),
            Interop.valueLayout.ADDRESS.withName("msgs")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TestLogBuffer}
     * @return A new, uninitialized @{link TestLogBuffer}
     */
    public static TestLogBuffer allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TestLogBuffer newInstance = new TestLogBuffer(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TestLogBuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TestLogBuffer(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TestLogBuffer> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TestLogBuffer(input);
    
    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public void free() {
        try {
            DowncallHandles.g_test_log_buffer_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Internal function for gtester to retrieve test log messages, no ABI guarantees provided.
     */
    public org.gtk.glib.TestLogMsg pop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_test_log_buffer_pop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TestLogMsg.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Internal function for gtester to decode test log messages, no ABI guarantees provided.
     */
    public void push(int nBytes, PointerByte bytes) {
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
    public static org.gtk.glib.TestLogBuffer new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_test_log_buffer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TestLogBuffer.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_test_log_buffer_free = Interop.downcallHandle(
                "g_test_log_buffer_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_test_log_buffer_pop = Interop.downcallHandle(
                "g_test_log_buffer_pop",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_test_log_buffer_push = Interop.downcallHandle(
                "g_test_log_buffer_push",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_test_log_buffer_new = Interop.downcallHandle(
                "g_test_log_buffer_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link TestLogBuffer.Builder} object constructs a {@link TestLogBuffer} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TestLogBuffer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TestLogBuffer struct;
        
        private Builder() {
            struct = TestLogBuffer.allocate();
        }
        
        /**
         * Finish building the {@link TestLogBuffer} struct.
         * @return A new instance of {@code TestLogBuffer} with the fields 
         *         that were set in the Builder object.
         */
        public TestLogBuffer build() {
            return struct;
        }
        
        public Builder setData(org.gtk.glib.GString data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
                return this;
            }
        }
        
        public Builder setMsgs(org.gtk.glib.SList msgs) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("msgs"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (msgs == null ? MemoryAddress.NULL : msgs.handle()));
                return this;
            }
        }
    }
}
