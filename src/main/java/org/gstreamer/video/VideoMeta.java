package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra buffer metadata describing image properties
 * <p>
 * This meta can also be used by downstream elements to specifiy their
 * buffer layout requirements for upstream. Upstream should try to
 * fit those requirements, if possible, in order to prevent buffer copies.
 * <p>
 * This is done by passing a custom {@link org.gstreamer.gst.Structure} to
 * gst_query_add_allocation_meta() when handling the ALLOCATION query.
 * This structure should be named 'video-meta' and can have the following
 * fields:
 * <ul>
 * <li>padding-top (uint): extra pixels on the top
 * <li>padding-bottom (uint): extra pixels on the bottom
 * <li>padding-left (uint): extra pixels on the left side
 * <li>padding-right (uint): extra pixels on the right side
 * The padding fields have the same semantic as {@link VideoMeta}.alignment
 * and so represent the paddings requested on produced video buffers.
 * </ul>
 */
public class VideoMeta extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoMeta";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
        Interop.valueLayout.ADDRESS.withName("buffer"),
        Interop.valueLayout.C_INT.withName("flags"),
        Interop.valueLayout.C_INT.withName("format"),
        Interop.valueLayout.C_INT.withName("id"),
        Interop.valueLayout.C_INT.withName("width"),
        Interop.valueLayout.C_INT.withName("height"),
        Interop.valueLayout.C_INT.withName("n_planes"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_LONG).withName("offset"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_INT).withName("stride"),
        Interop.valueLayout.ADDRESS.withName("map"),
        Interop.valueLayout.ADDRESS.withName("unmap"),
        org.gstreamer.video.VideoAlignment.getMemoryLayout().withName("alignment")
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
     * Allocate a new {@link VideoMeta}
     * @return A new, uninitialized @{link VideoMeta}
     */
    public static VideoMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoMeta newInstance = new VideoMeta(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code buffer}
     * @return The value of the field {@code buffer}
     */
    public org.gstreamer.gst.Buffer buffer$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code buffer}
     * @param buffer The new value of the field {@code buffer}
     */
    public void buffer$set(org.gstreamer.gst.Buffer buffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), buffer.handle());
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.video.VideoFrameFlags flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoFrameFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(org.gstreamer.video.VideoFrameFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags.getValue());
    }
    
    /**
     * Get the value of the field {@code format}
     * @return The value of the field {@code format}
     */
    public org.gstreamer.video.VideoFormat format$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoFormat.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code format}
     * @param format The new value of the field {@code format}
     */
    public void format$set(org.gstreamer.video.VideoFormat format) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), format.getValue());
    }
    
    /**
     * Get the value of the field {@code id}
     * @return The value of the field {@code id}
     */
    public int id$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code id}
     * @param id The new value of the field {@code id}
     */
    public void id$set(int id) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), id);
    }
    
    /**
     * Get the value of the field {@code width}
     * @return The value of the field {@code width}
     */
    public int width$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code width}
     * @param width The new value of the field {@code width}
     */
    public void width$set(int width) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), width);
    }
    
    /**
     * Get the value of the field {@code height}
     * @return The value of the field {@code height}
     */
    public int height$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("height"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code height}
     * @param height The new value of the field {@code height}
     */
    public void height$set(int height) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), height);
    }
    
    /**
     * Get the value of the field {@code n_planes}
     * @return The value of the field {@code n_planes}
     */
    public int nPlanes$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_planes}
     * @param nPlanes The new value of the field {@code n_planes}
     */
    public void nPlanes$set(int nPlanes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPlanes);
    }
    
    /**
     * Get the value of the field {@code alignment}
     * @return The value of the field {@code alignment}
     */
    public org.gstreamer.video.VideoAlignment alignment$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("alignment"));
        return new org.gstreamer.video.VideoAlignment(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VideoMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Compute the padded height of each plane from {@code meta} (padded size
     * divided by stride).
     * <p>
     * It is not valid to call this function with a meta associated to a
     * TILED video format.
     * @param planeHeight array used to store the plane height
     * @return {@code true} if {@code meta}'s alignment is valid and {@code plane_height} has been
     * updated, {@code false} otherwise
     */
    public boolean getPlaneHeight(@NotNull Out<int[]> planeHeight) {
        java.util.Objects.requireNonNull(planeHeight, "Parameter 'planeHeight' must not be null");
        MemorySegment planeHeightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_meta_get_plane_height.invokeExact(
                    handle(),
                    (Addressable) planeHeightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        planeHeight.set(MemorySegment.ofAddress(planeHeightPOINTER.get(Interop.valueLayout.ADDRESS, 0), 4 * Interop.valueLayout.C_INT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_INT));
        return RESULT != 0;
    }
    
    /**
     * Compute the size, in bytes, of each video plane described in {@code meta} including
     * any padding and alignment constraint defined in {@code meta}-&gt;alignment.
     * @param planeSize array used to store the plane sizes
     * @return {@code true} if {@code meta}'s alignment is valid and {@code plane_size} has been
     * updated, {@code false} otherwise
     */
    public boolean getPlaneSize(@NotNull Out<long[]> planeSize) {
        java.util.Objects.requireNonNull(planeSize, "Parameter 'planeSize' must not be null");
        MemorySegment planeSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_meta_get_plane_size.invokeExact(
                    handle(),
                    (Addressable) planeSizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        planeSize.set(MemorySegment.ofAddress(planeSizePOINTER.get(Interop.valueLayout.ADDRESS, 0), 4 * Interop.valueLayout.C_LONG.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_LONG));
        return RESULT != 0;
    }
    
    /**
     * Map the video plane with index {@code plane} in {@code meta} and return a pointer to the
     * first byte of the plane and the stride of the plane.
     * @param plane a plane
     * @param info a {@link org.gstreamer.gst.MapInfo}
     * @param data the data of {@code plane}
     * @param stride the stride of {@code plane}
     * @param flags {@code GstMapFlags}
     * @return TRUE if the map operation was successful.
     */
    public boolean map(int plane, @NotNull org.gstreamer.gst.MapInfo info, @Nullable Out<java.lang.foreign.MemoryAddress> data, Out<Integer> stride, @NotNull org.gstreamer.gst.MapFlags flags) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        MemorySegment dataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(stride, "Parameter 'stride' must not be null");
        MemorySegment stridePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_meta_map.invokeExact(
                    handle(),
                    plane,
                    info.handle(),
                    (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) dataPOINTER.address()),
                    (Addressable) stridePOINTER.address(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (data != null) data.set(dataPOINTER.get(Interop.valueLayout.ADDRESS, 0));
        stride.set(stridePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Set the alignment of {@code meta} to {@code alignment}. This function checks that
     * the paddings defined in {@code alignment} are compatible with the strides
     * defined in {@code meta} and will fail to update if they are not.
     * @param alignment a {@link VideoAlignment}
     * @return {@code true} if {@code alignment}'s meta has been updated, {@code false} if not
     */
    public boolean setAlignment(@NotNull org.gstreamer.video.VideoAlignment alignment) {
        java.util.Objects.requireNonNull(alignment, "Parameter 'alignment' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_meta_set_alignment.invokeExact(
                    handle(),
                    alignment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Unmap a previously mapped plane with gst_video_meta_map().
     * @param plane a plane
     * @param info a {@link org.gstreamer.gst.MapInfo}
     * @return TRUE if the memory was successfully unmapped.
     */
    public boolean unmap(int plane, @NotNull org.gstreamer.gst.MapInfo info) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_meta_unmap.invokeExact(
                    handle(),
                    plane,
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static @NotNull org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MetaInfo(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_meta_get_plane_height = Interop.downcallHandle(
            "gst_video_meta_get_plane_height",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_meta_get_plane_size = Interop.downcallHandle(
            "gst_video_meta_get_plane_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_meta_map = Interop.downcallHandle(
            "gst_video_meta_map",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_meta_set_alignment = Interop.downcallHandle(
            "gst_video_meta_set_alignment",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_meta_unmap = Interop.downcallHandle(
            "gst_video_meta_unmap",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_meta_get_info = Interop.downcallHandle(
            "gst_video_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoMeta struct;
        
         /**
         * A {@link VideoMeta.Build} object constructs a {@link VideoMeta} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoMeta.allocate();
        }
        
         /**
         * Finish building the {@link VideoMeta} struct.
         * @return A new instance of {@code VideoMeta} with the fields 
         *         that were set in the Build object.
         */
        public VideoMeta construct() {
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
         * the buffer this metadata belongs to
         * @param buffer The value for the {@code buffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBuffer(org.gstreamer.gst.Buffer buffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
            return this;
        }
        
        /**
         * additional video flags
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(org.gstreamer.video.VideoFrameFlags flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
        
        /**
         * the video format
         * @param format The value for the {@code format} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFormat(org.gstreamer.video.VideoFormat format) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (format == null ? MemoryAddress.NULL : format.getValue()));
            return this;
        }
        
        /**
         * identifier of the frame
         * @param id The value for the {@code id} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setId(int id) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), id);
            return this;
        }
        
        /**
         * the video width
         * @param width The value for the {@code width} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWidth(int width) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), width);
            return this;
        }
        
        /**
         * the video height
         * @param height The value for the {@code height} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHeight(int height) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), height);
            return this;
        }
        
        /**
         * the number of planes in the image
         * @param nPlanes The value for the {@code nPlanes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNPlanes(int nPlanes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPlanes);
            return this;
        }
        
        /**
         * array of offsets for the planes. This field might not always be
         *          valid, it is used by the default implementation of {@code map}.
         * @param offset The value for the {@code offset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOffset(long[] offset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (offset == null ? MemoryAddress.NULL : Interop.allocateNativeArray(offset, false)));
            return this;
        }
        
        /**
         * array of strides for the planes. This field might not always be
         *          valid, it is used by the default implementation of {@code map}.
         * @param stride The value for the {@code stride} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStride(int[] stride) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stride"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stride == null ? MemoryAddress.NULL : Interop.allocateNativeArray(stride, false)));
            return this;
        }
        
        public Build setMap(java.lang.foreign.MemoryAddress map) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (map == null ? MemoryAddress.NULL : map));
            return this;
        }
        
        public Build setUnmap(java.lang.foreign.MemoryAddress unmap) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmap == null ? MemoryAddress.NULL : unmap));
            return this;
        }
        
        /**
         * the paddings and alignment constraints of the video buffer.
         * It is up to the caller of {@code gst_buffer_add_video_meta_full()} to set it
         * using gst_video_meta_set_alignment(), if they did not it defaults
         * to no padding and no alignment. Since: 1.18
         * @param alignment The value for the {@code alignment} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAlignment(org.gstreamer.video.VideoAlignment alignment) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alignment"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (alignment == null ? MemoryAddress.NULL : alignment.handle()));
            return this;
        }
    }
}
