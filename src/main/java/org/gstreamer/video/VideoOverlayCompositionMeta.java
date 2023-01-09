package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra buffer metadata describing image overlay data.
 */
public class VideoOverlayCompositionMeta extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoOverlayCompositionMeta";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
            Interop.valueLayout.ADDRESS.withName("overlay")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoOverlayCompositionMeta}
     * @return A new, uninitialized @{link VideoOverlayCompositionMeta}
     */
    public static VideoOverlayCompositionMeta allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoOverlayCompositionMeta newInstance = new VideoOverlayCompositionMeta(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public org.gstreamer.gst.Meta getMeta() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("meta"));
        return org.gstreamer.gst.Meta.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code meta}
     * @param meta The new value of the field {@code meta}
     */
    public void setMeta(org.gstreamer.gst.Meta meta) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code overlay}
     * @return The value of the field {@code overlay}
     */
    public org.gstreamer.video.VideoOverlayComposition getOverlay() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("overlay"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.video.VideoOverlayComposition.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code overlay}
     * @param overlay The new value of the field {@code overlay}
     */
    public void setOverlay(org.gstreamer.video.VideoOverlayComposition overlay) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("overlay"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (overlay == null ? MemoryAddress.NULL : overlay.handle()));
        }
    }
    
    /**
     * Create a VideoOverlayCompositionMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoOverlayCompositionMeta(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoOverlayCompositionMeta> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoOverlayCompositionMeta(input);
    
    public static org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_composition_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_overlay_composition_meta_get_info = Interop.downcallHandle(
                "gst_video_overlay_composition_meta_get_info",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link VideoOverlayCompositionMeta.Builder} object constructs a {@link VideoOverlayCompositionMeta} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoOverlayCompositionMeta.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoOverlayCompositionMeta struct;
        
        private Builder() {
            struct = VideoOverlayCompositionMeta.allocate();
        }
        
        /**
         * Finish building the {@link VideoOverlayCompositionMeta} struct.
         * @return A new instance of {@code VideoOverlayCompositionMeta} with the fields 
         *         that were set in the Builder object.
         */
        public VideoOverlayCompositionMeta build() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Meta}
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMeta(org.gstreamer.gst.Meta meta) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
                return this;
            }
        }
        
        /**
         * the attached {@link VideoOverlayComposition}
         * @param overlay The value for the {@code overlay} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOverlay(org.gstreamer.video.VideoOverlayComposition overlay) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("overlay"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (overlay == null ? MemoryAddress.NULL : overlay.handle()));
                return this;
            }
        }
    }
}
