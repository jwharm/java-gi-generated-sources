package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A file descriptor object.
 */
public class PollFD extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPollFD";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("fd"),
            Interop.valueLayout.C_INT.withName("idx")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PollFD}
     * @return A new, uninitialized @{link PollFD}
     */
    public static PollFD allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PollFD newInstance = new PollFD(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code fd}
     * @return The value of the field {@code fd}
     */
    public int getFd() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fd"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code fd}
     * @param fd The new value of the field {@code fd}
     */
    public void setFd(int fd) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fd"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), fd);
        }
    }
    
    /**
     * Create a PollFD proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PollFD(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PollFD> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PollFD(input);
    
    /**
     * Initializes {@code fd}. Alternatively you can initialize it with
     * {@code GST_POLL_FD_INIT}.
     */
    public void init() {
        try {
            DowncallHandles.gst_poll_fd_init.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_poll_fd_init = Interop.downcallHandle(
                "gst_poll_fd_init",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link PollFD.Builder} object constructs a {@link PollFD} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PollFD.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PollFD struct;
        
        private Builder() {
            struct = PollFD.allocate();
        }
        
        /**
         * Finish building the {@link PollFD} struct.
         * @return A new instance of {@code PollFD} with the fields 
         *         that were set in the Builder object.
         */
        public PollFD build() {
            return struct;
        }
        
        /**
         * a file descriptor
         * @param fd The value for the {@code fd} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFd(int fd) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("fd"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), fd);
                return this;
            }
        }
        
        public Builder setIdx(int idx) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("idx"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), idx);
                return this;
            }
        }
    }
}
