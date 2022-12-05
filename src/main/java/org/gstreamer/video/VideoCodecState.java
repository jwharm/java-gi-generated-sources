package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure representing the state of an incoming or outgoing video
 * stream for encoders and decoders.
 * <p>
 * Decoders and encoders will receive such a state through their
 * respective {@code set_format} vmethods.
 * <p>
 * Decoders and encoders can set the downstream state, by using the
 * gst_video_decoder_set_output_state() or
 * gst_video_encoder_set_output_state() methods.
 */
public class VideoCodecState extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoCodecState";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("info"),
        Interop.valueLayout.ADDRESS.withName("caps"),
        Interop.valueLayout.ADDRESS.withName("codec_data"),
        Interop.valueLayout.ADDRESS.withName("allocation_caps"),
        Interop.valueLayout.ADDRESS.withName("mastering_display_info"),
        Interop.valueLayout.ADDRESS.withName("content_light_level"),
        MemoryLayout.sequenceLayout(17, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Allocate a new {@link VideoCodecState}
     * @return A new, uninitialized @{link VideoCodecState}
     */
    public static VideoCodecState allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoCodecState newInstance = new VideoCodecState(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code info}
     * @return The value of the field {@code info}
     */
    public org.gstreamer.video.VideoInfo info$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("info"));
        return new org.gstreamer.video.VideoInfo(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code caps}
     * @return The value of the field {@code caps}
     */
    public org.gstreamer.gst.Caps caps$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("caps"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Caps(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code caps}
     * @param caps The new value of the field {@code caps}
     */
    public void caps$set(org.gstreamer.gst.Caps caps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), caps.handle());
    }
    
    /**
     * Get the value of the field {@code codec_data}
     * @return The value of the field {@code codec_data}
     */
    public org.gstreamer.gst.Buffer codecData$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("codec_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code codec_data}
     * @param codecData The new value of the field {@code codec_data}
     */
    public void codecData$set(org.gstreamer.gst.Buffer codecData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("codec_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), codecData.handle());
    }
    
    /**
     * Get the value of the field {@code allocation_caps}
     * @return The value of the field {@code allocation_caps}
     */
    public org.gstreamer.gst.Caps allocationCaps$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("allocation_caps"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Caps(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code allocation_caps}
     * @param allocationCaps The new value of the field {@code allocation_caps}
     */
    public void allocationCaps$set(org.gstreamer.gst.Caps allocationCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("allocation_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), allocationCaps.handle());
    }
    
    /**
     * Get the value of the field {@code mastering_display_info}
     * @return The value of the field {@code mastering_display_info}
     */
    public org.gstreamer.video.VideoMasteringDisplayInfo masteringDisplayInfo$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mastering_display_info"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoMasteringDisplayInfo(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code mastering_display_info}
     * @param masteringDisplayInfo The new value of the field {@code mastering_display_info}
     */
    public void masteringDisplayInfo$set(org.gstreamer.video.VideoMasteringDisplayInfo masteringDisplayInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mastering_display_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), masteringDisplayInfo.handle());
    }
    
    /**
     * Get the value of the field {@code content_light_level}
     * @return The value of the field {@code content_light_level}
     */
    public org.gstreamer.video.VideoContentLightLevel contentLightLevel$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("content_light_level"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoContentLightLevel(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code content_light_level}
     * @param contentLightLevel The new value of the field {@code content_light_level}
     */
    public void contentLightLevel$set(org.gstreamer.video.VideoContentLightLevel contentLightLevel) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("content_light_level"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), contentLightLevel.handle());
    }
    
    /**
     * Create a VideoCodecState proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoCodecState(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Increases the refcount of the given state by one.
     * @return {@code buf}
     */
    public @NotNull org.gstreamer.video.VideoCodecState ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_codec_state_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoCodecState(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the refcount of the state. If the refcount reaches 0, the state
     * will be freed.
     */
    public void unref() {
        try {
            DowncallHandles.gst_video_codec_state_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_codec_state_ref = Interop.downcallHandle(
            "gst_video_codec_state_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_codec_state_unref = Interop.downcallHandle(
            "gst_video_codec_state_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoCodecState struct;
        
         /**
         * A {@link VideoCodecState.Build} object constructs a {@link VideoCodecState} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoCodecState.allocate();
        }
        
         /**
         * Finish building the {@link VideoCodecState} struct.
         * @return A new instance of {@code VideoCodecState} with the fields 
         *         that were set in the Build object.
         */
        public VideoCodecState construct() {
            return struct;
        }
        
        public Build setRefCount(int refCount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), refCount);
            return this;
        }
        
        /**
         * The {@link VideoInfo} describing the stream
         * @param info The value for the {@code info} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInfo(org.gstreamer.video.VideoInfo info) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
            return this;
        }
        
        /**
         * The {@link org.gstreamer.gst.Caps} used in the caps negotiation of the pad.
         * @param caps The value for the {@code caps} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCaps(org.gstreamer.gst.Caps caps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
            return this;
        }
        
        /**
         * a {@link org.gstreamer.gst.Buffer} corresponding to the
         *     'codec_data' field of a stream, or NULL.
         * @param codecData The value for the {@code codecData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCodecData(org.gstreamer.gst.Buffer codecData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("codec_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (codecData == null ? MemoryAddress.NULL : codecData.handle()));
            return this;
        }
        
        /**
         * The {@link org.gstreamer.gst.Caps} for allocation query and pool
         *     negotiation. Since: 1.10
         * @param allocationCaps The value for the {@code allocationCaps} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAllocationCaps(org.gstreamer.gst.Caps allocationCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("allocation_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (allocationCaps == null ? MemoryAddress.NULL : allocationCaps.handle()));
            return this;
        }
        
        /**
         * Mastering display color volume information (HDR metadata) for the stream.
         * @param masteringDisplayInfo The value for the {@code masteringDisplayInfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMasteringDisplayInfo(org.gstreamer.video.VideoMasteringDisplayInfo masteringDisplayInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mastering_display_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (masteringDisplayInfo == null ? MemoryAddress.NULL : masteringDisplayInfo.handle()));
            return this;
        }
        
        /**
         * Content light level information for the stream.
         * @param contentLightLevel The value for the {@code contentLightLevel} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setContentLightLevel(org.gstreamer.video.VideoContentLightLevel contentLightLevel) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("content_light_level"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (contentLightLevel == null ? MemoryAddress.NULL : contentLightLevel.handle()));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
