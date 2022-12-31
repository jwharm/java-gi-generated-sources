package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Meta describing the source(s) of the buffer.
 * @version 1.16
 */
public class RTPSourceMeta extends Struct {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPSourceMeta";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
            Interop.valueLayout.C_INT.withName("ssrc"),
            Interop.valueLayout.C_INT.withName("ssrc_valid"),
            MemoryLayout.sequenceLayout(15, Interop.valueLayout.C_INT).withName("csrc"),
            Interop.valueLayout.C_INT.withName("csrc_count")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTPSourceMeta}
     * @return A new, uninitialized @{link RTPSourceMeta}
     */
    public static RTPSourceMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTPSourceMeta newInstance = new RTPSourceMeta(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public org.gstreamer.gst.Meta getMeta() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("meta"));
        return org.gstreamer.gst.Meta.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code meta}
     * @param meta The new value of the field {@code meta}
     */
    public void setMeta(org.gstreamer.gst.Meta meta) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("meta"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
    }
    
    /**
     * Get the value of the field {@code ssrc}
     * @return The value of the field {@code ssrc}
     */
    public int getSsrc() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ssrc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ssrc}
     * @param ssrc The new value of the field {@code ssrc}
     */
    public void setSsrc_(int ssrc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ssrc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ssrc);
    }
    
    /**
     * Get the value of the field {@code ssrc_valid}
     * @return The value of the field {@code ssrc_valid}
     */
    public boolean getSsrcValid() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ssrc_valid"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code ssrc_valid}
     * @param ssrcValid The new value of the field {@code ssrc_valid}
     */
    public void setSsrcValid(boolean ssrcValid) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ssrc_valid"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(ssrcValid, null).intValue());
    }
    
    /**
     * Get the value of the field {@code csrc}
     * @return The value of the field {@code csrc}
     */
    public int[] getCsrc() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("csrc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 15, Interop.getScope()).toArray(Interop.valueLayout.C_INT);
    }
    
    /**
     * Change the value of the field {@code csrc}
     * @param csrc The new value of the field {@code csrc}
     */
    public void setCsrc(int[] csrc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("csrc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (csrc == null ? MemoryAddress.NULL : Interop.allocateNativeArray(csrc, false)));
    }
    
    /**
     * Get the value of the field {@code csrc_count}
     * @return The value of the field {@code csrc_count}
     */
    public int getCsrcCount() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("csrc_count"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code csrc_count}
     * @param csrcCount The new value of the field {@code csrc_count}
     */
    public void setCsrcCount(int csrcCount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("csrc_count"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), csrcCount);
    }
    
    /**
     * Create a RTPSourceMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTPSourceMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTPSourceMeta> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTPSourceMeta(input, ownership);
    
    /**
     * Appends {@code csrc} to the list of contributing sources in {@code meta}.
     * @param csrc the csrcs to append
     * @param csrcCount number of elements in {@code csrc}
     * @return {@code true} if all elements in {@code csrc} was added, {@code false} otherwise.
     */
    public boolean appendCsrc(PointerInteger csrc, int csrcCount) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_source_meta_append_csrc.invokeExact(
                    handle(),
                    csrc.handle(),
                    csrcCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Count the total number of RTP sources found in {@code meta}, both SSRC and CSRC.
     * @return The number of RTP sources
     */
    public int getSourceCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_source_meta_get_source_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets {@code ssrc} in {@code meta}. If {@code ssrc} is {@code null} the ssrc of {@code meta} will be unset.
     * @param ssrc pointer to the SSRC
     * @return {@code true} on success, {@code false} otherwise.
     */
    public boolean setSsrc(PointerInteger ssrc) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_source_meta_set_ssrc.invokeExact(
                    handle(),
                    (Addressable) (ssrc == null ? MemoryAddress.NULL : ssrc.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_source_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtp_source_meta_append_csrc = Interop.downcallHandle(
            "gst_rtp_source_meta_append_csrc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_source_meta_get_source_count = Interop.downcallHandle(
            "gst_rtp_source_meta_get_source_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_source_meta_set_ssrc = Interop.downcallHandle(
            "gst_rtp_source_meta_set_ssrc",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_source_meta_get_info = Interop.downcallHandle(
            "gst_rtp_source_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link RTPSourceMeta.Builder} object constructs a {@link RTPSourceMeta} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTPSourceMeta.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTPSourceMeta struct;
        
        private Builder() {
            struct = RTPSourceMeta.allocate();
        }
        
         /**
         * Finish building the {@link RTPSourceMeta} struct.
         * @return A new instance of {@code RTPSourceMeta} with the fields 
         *         that were set in the Builder object.
         */
        public RTPSourceMeta build() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Meta}
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMeta(org.gstreamer.gst.Meta meta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
            return this;
        }
        
        /**
         * the SSRC
         * @param ssrc The value for the {@code ssrc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSsrc(int ssrc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ssrc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), ssrc);
            return this;
        }
        
        /**
         * whether {@code ssrc} is set and valid
         * @param ssrcValid The value for the {@code ssrcValid} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSsrcValid(boolean ssrcValid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ssrc_valid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(ssrcValid, null).intValue());
            return this;
        }
        
        /**
         * pointer to the CSRCs
         * @param csrc The value for the {@code csrc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCsrc(int[] csrc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("csrc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (csrc == null ? MemoryAddress.NULL : Interop.allocateNativeArray(csrc, false)));
            return this;
        }
        
        /**
         * number of elements in {@code csrc}
         * @param csrcCount The value for the {@code csrcCount} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCsrcCount(int csrcCount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("csrc_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), csrcCount);
            return this;
        }
    }
}
