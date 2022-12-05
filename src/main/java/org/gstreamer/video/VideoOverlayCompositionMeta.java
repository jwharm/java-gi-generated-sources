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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
        Interop.valueLayout.ADDRESS.withName("overlay")
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
     * Allocate a new {@link VideoOverlayCompositionMeta}
     * @return A new, uninitialized @{link VideoOverlayCompositionMeta}
     */
    public static VideoOverlayCompositionMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoOverlayCompositionMeta newInstance = new VideoOverlayCompositionMeta(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public org.gstreamer.gst.Meta meta$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("meta"));
        return new org.gstreamer.gst.Meta(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code overlay}
     * @return The value of the field {@code overlay}
     */
    public org.gstreamer.video.VideoOverlayComposition overlay$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("overlay"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoOverlayComposition(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code overlay}
     * @param overlay The new value of the field {@code overlay}
     */
    public void overlay$set(org.gstreamer.video.VideoOverlayComposition overlay) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("overlay"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), overlay.handle());
    }
    
    /**
     * Create a VideoOverlayCompositionMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoOverlayCompositionMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public static @NotNull org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_overlay_composition_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MetaInfo(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_overlay_composition_meta_get_info = Interop.downcallHandle(
            "gst_video_overlay_composition_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoOverlayCompositionMeta struct;
        
         /**
         * A {@link VideoOverlayCompositionMeta.Build} object constructs a {@link VideoOverlayCompositionMeta} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoOverlayCompositionMeta.allocate();
        }
        
         /**
         * Finish building the {@link VideoOverlayCompositionMeta} struct.
         * @return A new instance of {@code VideoOverlayCompositionMeta} with the fields 
         *         that were set in the Build object.
         */
        public VideoOverlayCompositionMeta construct() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Meta}
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMeta(org.gstreamer.gst.Meta meta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
            return this;
        }
        
        /**
         * the attached {@link VideoOverlayComposition}
         * @param overlay The value for the {@code overlay} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOverlay(org.gstreamer.video.VideoOverlayComposition overlay) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("overlay"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (overlay == null ? MemoryAddress.NULL : overlay.handle()));
            return this;
        }
    }
}
