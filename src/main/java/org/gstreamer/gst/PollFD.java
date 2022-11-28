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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("fd"),
        Interop.valueLayout.C_INT.withName("idx")
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
    
    /**
     * Allocate a new {@link PollFD}
     * @return A new, uninitialized @{link PollFD}
     */
    public static PollFD allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PollFD newInstance = new PollFD(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code fd}
     * @return The value of the field {@code fd}
     */
    public int fd$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fd"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code fd}
     * @param fd The new value of the field {@code fd}
     */
    public void fd$set(int fd) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fd"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), fd);
    }
    
    /**
     * Create a PollFD proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PollFD(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Initializes {@code fd}. Alternatively you can initialize it with
     * {@code GST_POLL_FD_INIT}.
     */
    public void init() {
        try {
            DowncallHandles.gst_poll_fd_init.invokeExact(
                    handle());
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PollFD struct;
        
         /**
         * A {@link PollFD.Build} object constructs a {@link PollFD} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PollFD.allocate();
        }
        
         /**
         * Finish building the {@link PollFD} struct.
         * @return A new instance of {@code PollFD} with the fields 
         *         that were set in the Build object.
         */
        public PollFD construct() {
            return struct;
        }
        
        /**
         * a file descriptor
         * @param fd The value for the {@code fd} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFd(int fd) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fd"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), fd);
            return this;
        }
        
        public Build setIdx(int idx) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("idx"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), idx);
            return this;
        }
    }
}
