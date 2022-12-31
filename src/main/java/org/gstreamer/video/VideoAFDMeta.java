package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Active Format Description (AFD)
 * <p>
 * For details, see Table 6.14 Active Format in:
 * <p>
 * ATSC Digital Television Standard:
 * Part 4 – MPEG-2 Video System Characteristics
 * <p>
 * https://www.atsc.org/wp-content/uploads/2015/03/a_53-Part-4-2009.pdf
 * <p>
 * and Active Format Description in Complete list of AFD codes
 * <p>
 * https://en.wikipedia.org/wiki/Active_Format_Description{@code Complete_list_of_AFD_codes}
 * <p>
 * and SMPTE ST2016-1
 * @version 1.18
 */
public class VideoAFDMeta extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAFDMeta";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
            Interop.valueLayout.C_BYTE.withName("field"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("spec"),
            Interop.valueLayout.C_INT.withName("afd")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoAFDMeta}
     * @return A new, uninitialized @{link VideoAFDMeta}
     */
    public static VideoAFDMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoAFDMeta newInstance = new VideoAFDMeta(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code field}
     * @return The value of the field {@code field}
     */
    public byte getField() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("field"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code field}
     * @param field The new value of the field {@code field}
     */
    public void setField(byte field) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("field"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), field);
    }
    
    /**
     * Get the value of the field {@code spec}
     * @return The value of the field {@code spec}
     */
    public org.gstreamer.video.VideoAFDSpec getSpec() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("spec"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoAFDSpec.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code spec}
     * @param spec The new value of the field {@code spec}
     */
    public void setSpec(org.gstreamer.video.VideoAFDSpec spec) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("spec"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (spec == null ? MemoryAddress.NULL : spec.getValue()));
    }
    
    /**
     * Get the value of the field {@code afd}
     * @return The value of the field {@code afd}
     */
    public org.gstreamer.video.VideoAFDValue getAfd() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("afd"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoAFDValue.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code afd}
     * @param afd The new value of the field {@code afd}
     */
    public void setAfd(org.gstreamer.video.VideoAFDValue afd) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("afd"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (afd == null ? MemoryAddress.NULL : afd.getValue()));
    }
    
    /**
     * Create a VideoAFDMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoAFDMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoAFDMeta> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoAFDMeta(input, ownership);
    
    public static org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_afd_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_afd_meta_get_info = Interop.downcallHandle(
            "gst_video_afd_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link VideoAFDMeta.Builder} object constructs a {@link VideoAFDMeta} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoAFDMeta.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoAFDMeta struct;
        
        private Builder() {
            struct = VideoAFDMeta.allocate();
        }
        
         /**
         * Finish building the {@link VideoAFDMeta} struct.
         * @return A new instance of {@code VideoAFDMeta} with the fields 
         *         that were set in the Builder object.
         */
        public VideoAFDMeta build() {
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
         * 0 for progressive or field 1 and 1 for field 2
         * @param field The value for the {@code field} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setField(byte field) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("field"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), field);
            return this;
        }
        
        /**
         * {@link VideoAFDSpec} that applies to {@code afd}
         * @param spec The value for the {@code spec} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSpec(org.gstreamer.video.VideoAFDSpec spec) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("spec"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (spec == null ? MemoryAddress.NULL : spec.getValue()));
            return this;
        }
        
        /**
         * {@link VideoAFDValue} AFD value
         * @param afd The value for the {@code afd} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAfd(org.gstreamer.video.VideoAFDValue afd) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("afd"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (afd == null ? MemoryAddress.NULL : afd.getValue()));
            return this;
        }
    }
}
