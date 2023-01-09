package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TestLogMsg extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTestLogMsg";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("log_type"),
            Interop.valueLayout.C_INT.withName("n_strings"),
            Interop.valueLayout.ADDRESS.withName("strings"),
            Interop.valueLayout.C_INT.withName("n_nums"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("nums")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TestLogMsg}
     * @return A new, uninitialized @{link TestLogMsg}
     */
    public static TestLogMsg allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TestLogMsg newInstance = new TestLogMsg(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code log_type}
     * @return The value of the field {@code log_type}
     */
    public org.gtk.glib.TestLogType getLogType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("log_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gtk.glib.TestLogType.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code log_type}
     * @param logType The new value of the field {@code log_type}
     */
    public void setLogType(org.gtk.glib.TestLogType logType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("log_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (logType == null ? MemoryAddress.NULL : logType.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code n_strings}
     * @return The value of the field {@code n_strings}
     */
    public int getNStrings() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_strings"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code n_strings}
     * @param nStrings The new value of the field {@code n_strings}
     */
    public void setNStrings(int nStrings) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_strings"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), nStrings);
        }
    }
    
    /**
     * Get the value of the field {@code strings}
     * @return The value of the field {@code strings}
     */
    public PointerString getStrings() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("strings"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code strings}
     * @param strings The new value of the field {@code strings}
     */
    public void setStrings(PointerString strings) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("strings"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (strings == null ? MemoryAddress.NULL : strings.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code n_nums}
     * @return The value of the field {@code n_nums}
     */
    public int getNNums() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_nums"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code n_nums}
     * @param nNums The new value of the field {@code n_nums}
     */
    public void setNNums(int nNums) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_nums"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), nNums);
        }
    }
    
    /**
     * Get the value of the field {@code nums}
     * @return The value of the field {@code nums}
     */
    public PointerDouble getNums() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nums"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerDouble(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code nums}
     * @param nums The new value of the field {@code nums}
     */
    public void setNums(PointerDouble nums) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nums"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nums == null ? MemoryAddress.NULL : nums.handle()));
        }
    }
    
    /**
     * Create a TestLogMsg proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TestLogMsg(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TestLogMsg> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TestLogMsg(input);
    
    /**
     * Internal function for gtester to free test log messages, no ABI guarantees provided.
     */
    public void free() {
        try {
            DowncallHandles.g_test_log_msg_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_test_log_msg_free = Interop.downcallHandle(
                "g_test_log_msg_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link TestLogMsg.Builder} object constructs a {@link TestLogMsg} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TestLogMsg.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TestLogMsg struct;
        
        private Builder() {
            struct = TestLogMsg.allocate();
        }
        
        /**
         * Finish building the {@link TestLogMsg} struct.
         * @return A new instance of {@code TestLogMsg} with the fields 
         *         that were set in the Builder object.
         */
        public TestLogMsg build() {
            return struct;
        }
        
        public Builder setLogType(org.gtk.glib.TestLogType logType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("log_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (logType == null ? MemoryAddress.NULL : logType.getValue()));
                return this;
            }
        }
        
        public Builder setNStrings(int nStrings) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("n_strings"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), nStrings);
                return this;
            }
        }
        
        public Builder setStrings(PointerString strings) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("strings"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (strings == null ? MemoryAddress.NULL : strings.handle()));
                return this;
            }
        }
        
        public Builder setNNums(int nNums) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("n_nums"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), nNums);
                return this;
            }
        }
        
        public Builder setNums(PointerDouble nums) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("nums"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nums == null ? MemoryAddress.NULL : nums.handle()));
                return this;
            }
        }
    }
}
