package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra buffer metadata providing Closed Caption.
 * @version 1.16
 */
public class VideoCaptionMeta extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoCaptionMeta";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
        Interop.valueLayout.C_INT.withName("caption_type"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.C_LONG.withName("size")
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
     * Allocate a new {@link VideoCaptionMeta}
     * @return A new, uninitialized @{link VideoCaptionMeta}
     */
    public static VideoCaptionMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoCaptionMeta newInstance = new VideoCaptionMeta(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code caption_type}
     * @return The value of the field {@code caption_type}
     */
    public org.gstreamer.video.VideoCaptionType captionType$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("caption_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoCaptionType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code caption_type}
     * @param captionType The new value of the field {@code caption_type}
     */
    public void captionType$set(org.gstreamer.video.VideoCaptionType captionType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("caption_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), captionType.getValue());
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public long size$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void size$set(long size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
    }
    
    /**
     * Create a VideoCaptionMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoCaptionMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public static @NotNull org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_caption_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MetaInfo(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_caption_meta_get_info = Interop.downcallHandle(
            "gst_video_caption_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoCaptionMeta struct;
        
         /**
         * A {@link VideoCaptionMeta.Build} object constructs a {@link VideoCaptionMeta} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoCaptionMeta.allocate();
        }
        
         /**
         * Finish building the {@link VideoCaptionMeta} struct.
         * @return A new instance of {@code VideoCaptionMeta} with the fields 
         *         that were set in the Build object.
         */
        public VideoCaptionMeta construct() {
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
         * The type of Closed Caption contained in the meta.
         * @param captionType The value for the {@code captionType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCaptionType(org.gstreamer.video.VideoCaptionType captionType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("caption_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (captionType == null ? MemoryAddress.NULL : captionType.getValue()));
            return this;
        }
        
        /**
         * The Closed Caption data.
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setData(byte[] data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : Interop.allocateNativeArray(data, false)));
            return this;
        }
        
        /**
         * The size in bytes of {@code data}
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSize(long size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
            return this;
        }
    }
}
