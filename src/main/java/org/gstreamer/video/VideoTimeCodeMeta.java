package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra buffer metadata describing the GstVideoTimeCode of the frame.
 * <p>
 * Each frame is assumed to have its own timecode, i.e. they are not
 * automatically incremented/interpolated.
 * @version 1.10
 */
public class VideoTimeCodeMeta extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoTimeCodeMeta";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
        org.gstreamer.video.VideoTimeCode.getMemoryLayout().withName("tc")
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
     * Allocate a new {@link VideoTimeCodeMeta}
     * @return A new, uninitialized @{link VideoTimeCodeMeta}
     */
    public static VideoTimeCodeMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoTimeCodeMeta newInstance = new VideoTimeCodeMeta(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code tc}
     * @return The value of the field {@code tc}
     */
    public org.gstreamer.video.VideoTimeCode tc$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("tc"));
        return new org.gstreamer.video.VideoTimeCode(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VideoTimeCodeMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoTimeCodeMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public static @NotNull org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MetaInfo(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_time_code_meta_get_info = Interop.downcallHandle(
            "gst_video_time_code_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoTimeCodeMeta struct;
        
         /**
         * A {@link VideoTimeCodeMeta.Build} object constructs a {@link VideoTimeCodeMeta} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoTimeCodeMeta.allocate();
        }
        
         /**
         * Finish building the {@link VideoTimeCodeMeta} struct.
         * @return A new instance of {@code VideoTimeCodeMeta} with the fields 
         *         that were set in the Build object.
         */
        public VideoTimeCodeMeta construct() {
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
         * the GstVideoTimeCode to attach
         * @param tc The value for the {@code tc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTc(org.gstreamer.video.VideoTimeCode tc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tc == null ? MemoryAddress.NULL : tc.handle()));
            return this;
        }
    }
}
