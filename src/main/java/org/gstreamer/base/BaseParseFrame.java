package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Frame (context) data passed to each frame parsing virtual methods.  In
 * addition to providing the data to be checked for a valid frame or an already
 * identified frame, it conveys additional metadata or control information
 * from and to the subclass w.r.t. the particular frame in question (rather
 * than global parameters).  Some of these may apply to each parsing stage, others
 * only to some a particular one.  These parameters are effectively zeroed at start
 * of each frame's processing, i.e. parsing virtual method invocation sequence.
 */
public class BaseParseFrame extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBaseParseFrame";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("buffer"),
            Interop.valueLayout.ADDRESS.withName("out_buffer"),
            Interop.valueLayout.C_INT.withName("flags"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("offset"),
            Interop.valueLayout.C_INT.withName("overhead"),
            Interop.valueLayout.C_INT.withName("size"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_INT).withName("_gst_reserved_i"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_gst_reserved_p"),
            Interop.valueLayout.C_INT.withName("_private_flags")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BaseParseFrame}
     * @return A new, uninitialized @{link BaseParseFrame}
     */
    public static BaseParseFrame allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BaseParseFrame newInstance = new BaseParseFrame(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code buffer}
     * @return The value of the field {@code buffer}
     */
    public org.gstreamer.gst.Buffer getBuffer() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code buffer}
     * @param buffer The new value of the field {@code buffer}
     */
    public void setBuffer(org.gstreamer.gst.Buffer buffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
    }
    
    /**
     * Get the value of the field {@code out_buffer}
     * @return The value of the field {@code out_buffer}
     */
    public org.gstreamer.gst.Buffer getOutBuffer() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("out_buffer"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code out_buffer}
     * @param outBuffer The new value of the field {@code out_buffer}
     */
    public void setOutBuffer(org.gstreamer.gst.Buffer outBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("out_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (outBuffer == null ? MemoryAddress.NULL : outBuffer.handle()));
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public int getFlags() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(int flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
    }
    
    /**
     * Get the value of the field {@code offset}
     * @return The value of the field {@code offset}
     */
    public long getOffset() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code offset}
     * @param offset The new value of the field {@code offset}
     */
    public void setOffset(long offset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), offset);
    }
    
    /**
     * Get the value of the field {@code overhead}
     * @return The value of the field {@code overhead}
     */
    public int getOverhead() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("overhead"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code overhead}
     * @param overhead The new value of the field {@code overhead}
     */
    public void setOverhead(int overhead) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("overhead"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), overhead);
    }
    
    /**
     * Create a BaseParseFrame proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BaseParseFrame(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BaseParseFrame> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BaseParseFrame(input, ownership);
    
    private static MemoryAddress constructNew(org.gstreamer.gst.Buffer buffer, org.gstreamer.base.BaseParseFrameFlags flags, int overhead) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_base_parse_frame_new.invokeExact(
                    buffer.handle(),
                    flags.getValue(),
                    overhead);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link BaseParseFrame}. This function is mainly for bindings,
     * elements written in C should usually allocate the frame on the stack and
     * then use gst_base_parse_frame_init() to initialise it.
     * @param buffer a {@link org.gstreamer.gst.Buffer}
     * @param flags the flags
     * @param overhead number of bytes in this frame which should be counted as
     *     metadata overhead, ie. not used to calculate the average bitrate.
     *     Set to -1 to mark the entire frame as metadata. If in doubt, set to 0.
     */
    public BaseParseFrame(org.gstreamer.gst.Buffer buffer, org.gstreamer.base.BaseParseFrameFlags flags, int overhead) {
        super(constructNew(buffer, flags, overhead), Ownership.FULL);
    }
    
    /**
     * Copies a {@link BaseParseFrame}.
     * @return A copy of {@code frame}
     */
    public org.gstreamer.base.BaseParseFrame copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_base_parse_frame_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.base.BaseParseFrame.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees the provided {@code frame}.
     */
    public void free() {
        try {
            DowncallHandles.gst_base_parse_frame_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@link BaseParseFrame} to initial state.  Currently this means
     * all public fields are zero-ed and a private flag is set to make
     * sure gst_base_parse_frame_free() only frees the contents but not
     * the actual frame. Use this function to initialise a {@link BaseParseFrame}
     * allocated on the stack.
     */
    public void init() {
        try {
            DowncallHandles.gst_base_parse_frame_init.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_base_parse_frame_new = Interop.downcallHandle(
            "gst_base_parse_frame_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_parse_frame_copy = Interop.downcallHandle(
            "gst_base_parse_frame_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_parse_frame_free = Interop.downcallHandle(
            "gst_base_parse_frame_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_parse_frame_init = Interop.downcallHandle(
            "gst_base_parse_frame_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link BaseParseFrame.Builder} object constructs a {@link BaseParseFrame} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BaseParseFrame.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BaseParseFrame struct;
        
        private Builder() {
            struct = BaseParseFrame.allocate();
        }
        
         /**
         * Finish building the {@link BaseParseFrame} struct.
         * @return A new instance of {@code BaseParseFrame} with the fields 
         *         that were set in the Builder object.
         */
        public BaseParseFrame build() {
            return struct;
        }
        
        /**
         * input data to be parsed for frames.
         * @param buffer The value for the {@code buffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBuffer(org.gstreamer.gst.Buffer buffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
            return this;
        }
        
        /**
         * output data.
         * @param outBuffer The value for the {@code outBuffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOutBuffer(org.gstreamer.gst.Buffer outBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("out_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (outBuffer == null ? MemoryAddress.NULL : outBuffer.handle()));
            return this;
        }
        
        /**
         * a combination of input and output {@link BaseParseFrameFlags} that
         *  convey additional context to subclass or allow subclass to tune
         *  subsequent {@link BaseParse} actions.
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(int flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
            return this;
        }
        
        /**
         * media specific offset of input frame
         *   Note that a converter may have a different one on the frame's buffer.
         * @param offset The value for the {@code offset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOffset(long offset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), offset);
            return this;
        }
        
        /**
         * subclass can set this to indicates the metadata overhead
         *   for the given frame, which is then used to enable more accurate bitrate
         *   computations. If this is -1, it is assumed that this frame should be
         *   skipped in bitrate calculation.
         * @param overhead The value for the {@code overhead} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOverhead(int overhead) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("overhead"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), overhead);
            return this;
        }
        
        public Builder setSize(int size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
            return this;
        }
        
        public Builder setGstReservedI(int[] GstReservedI) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved_i"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReservedI == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReservedI, false)));
            return this;
        }
        
        public Builder setGstReservedP(java.lang.foreign.MemoryAddress[] GstReservedP) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved_p"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReservedP == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReservedP, false)));
            return this;
        }
        
        public Builder setPrivateFlags(int PrivateFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_private_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), PrivateFlags);
            return this;
        }
    }
}
