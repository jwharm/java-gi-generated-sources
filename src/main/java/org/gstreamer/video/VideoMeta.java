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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoMeta}
     * @return A new, uninitialized @{link VideoMeta}
     */
    public static VideoMeta allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoMeta newInstance = new VideoMeta(segment.address());
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
     * Get the value of the field {@code buffer}
     * @return The value of the field {@code buffer}
     */
    public org.gstreamer.gst.Buffer getBuffer() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code buffer}
     * @param buffer The new value of the field {@code buffer}
     */
    public void setBuffer(org.gstreamer.gst.Buffer buffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.video.VideoFrameFlags getFlags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.video.VideoFrameFlags(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(org.gstreamer.video.VideoFrameFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code format}
     * @return The value of the field {@code format}
     */
    public org.gstreamer.video.VideoFormat getFormat() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("format"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.video.VideoFormat.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code format}
     * @param format The new value of the field {@code format}
     */
    public void setFormat(org.gstreamer.video.VideoFormat format) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("format"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (format == null ? MemoryAddress.NULL : format.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code id}
     * @return The value of the field {@code id}
     */
    public int getId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code id}
     * @param id The new value of the field {@code id}
     */
    public void setId(int id) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), id);
        }
    }
    
    /**
     * Get the value of the field {@code width}
     * @return The value of the field {@code width}
     */
    public int getWidth() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("width"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code width}
     * @param width The new value of the field {@code width}
     */
    public void setWidth(int width) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("width"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), width);
        }
    }
    
    /**
     * Get the value of the field {@code height}
     * @return The value of the field {@code height}
     */
    public int getHeight() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("height"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code height}
     * @param height The new value of the field {@code height}
     */
    public void setHeight(int height) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("height"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), height);
        }
    }
    
    /**
     * Get the value of the field {@code n_planes}
     * @return The value of the field {@code n_planes}
     */
    public int getNPlanes() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code n_planes}
     * @param nPlanes The new value of the field {@code n_planes}
     */
    public void setNPlanes(int nPlanes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), nPlanes);
        }
    }
    
    /**
     * Get the value of the field {@code offset}
     * @return The value of the field {@code offset}
     */
    public long[] getOffset() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 4, SCOPE).toArray(Interop.valueLayout.C_LONG);
        }
    }
    
    /**
     * Change the value of the field {@code offset}
     * @param offset The new value of the field {@code offset}
     */
    public void setOffset(long[] offset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (offset == null ? MemoryAddress.NULL : Interop.allocateNativeArray(offset, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code stride}
     * @return The value of the field {@code stride}
     */
    public int[] getStride() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stride"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 4, SCOPE).toArray(Interop.valueLayout.C_INT);
        }
    }
    
    /**
     * Change the value of the field {@code stride}
     * @param stride The new value of the field {@code stride}
     */
    public void setStride(int[] stride) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stride"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stride == null ? MemoryAddress.NULL : Interop.allocateNativeArray(stride, false, SCOPE)));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MapCallback} callback.
     */
    @FunctionalInterface
    public interface MapCallback {
    
        boolean run(org.gstreamer.video.VideoMeta meta, int plane, org.gstreamer.gst.MapInfo info, java.lang.foreign.MemoryAddress data, PointerInteger stride, org.gstreamer.gst.MapFlags flags);
        
        @ApiStatus.Internal default int upcall(MemoryAddress meta, int plane, MemoryAddress info, MemoryAddress data, MemoryAddress stride, int flags) {
            var RESULT = run(org.gstreamer.video.VideoMeta.fromAddress.marshal(meta, null), plane, org.gstreamer.gst.MapInfo.fromAddress.marshal(info, null), data, new PointerInteger(stride), new org.gstreamer.gst.MapFlags(flags));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MapCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code map}
     * @param map The new value of the field {@code map}
     */
    public void setMap(MapCallback map) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (map == null ? MemoryAddress.NULL : map.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnmapCallback} callback.
     */
    @FunctionalInterface
    public interface UnmapCallback {
    
        boolean run(org.gstreamer.video.VideoMeta meta, int plane, org.gstreamer.gst.MapInfo info);
        
        @ApiStatus.Internal default int upcall(MemoryAddress meta, int plane, MemoryAddress info) {
            var RESULT = run(org.gstreamer.video.VideoMeta.fromAddress.marshal(meta, null), plane, org.gstreamer.gst.MapInfo.fromAddress.marshal(info, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnmapCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmap}
     * @param unmap The new value of the field {@code unmap}
     */
    public void setUnmap(UnmapCallback unmap) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmap == null ? MemoryAddress.NULL : unmap.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code alignment}
     * @return The value of the field {@code alignment}
     */
    public org.gstreamer.video.VideoAlignment getAlignment() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("alignment"));
        return org.gstreamer.video.VideoAlignment.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code alignment}
     * @param alignment The new value of the field {@code alignment}
     */
    public void setAlignment_(org.gstreamer.video.VideoAlignment alignment) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alignment"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (alignment == null ? MemoryAddress.NULL : alignment.handle()));
        }
    }
    
    /**
     * Create a VideoMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoMeta(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoMeta> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoMeta(input);
    
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
    public boolean getPlaneHeight(Out<int[]> planeHeight) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment planeHeightPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_video_meta_get_plane_height.invokeExact(
                        handle(),
                        (Addressable) planeHeightPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            planeHeight.set(MemorySegment.ofAddress(planeHeightPOINTER.get(Interop.valueLayout.ADDRESS, 0), 4 * Interop.valueLayout.C_INT.byteSize(), SCOPE).toArray(Interop.valueLayout.C_INT));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Compute the size, in bytes, of each video plane described in {@code meta} including
     * any padding and alignment constraint defined in {@code meta}-&gt;alignment.
     * @param planeSize array used to store the plane sizes
     * @return {@code true} if {@code meta}'s alignment is valid and {@code plane_size} has been
     * updated, {@code false} otherwise
     */
    public boolean getPlaneSize(Out<long[]> planeSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment planeSizePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_video_meta_get_plane_size.invokeExact(
                        handle(),
                        (Addressable) planeSizePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            planeSize.set(MemorySegment.ofAddress(planeSizePOINTER.get(Interop.valueLayout.ADDRESS, 0), 4 * Interop.valueLayout.C_LONG.byteSize(), SCOPE).toArray(Interop.valueLayout.C_LONG));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public boolean map(int plane, org.gstreamer.gst.MapInfo info, @Nullable Out<java.lang.foreign.MemoryAddress> data, Out<Integer> stride, org.gstreamer.gst.MapFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment dataPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment stridePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Set the alignment of {@code meta} to {@code alignment}. This function checks that
     * the paddings defined in {@code alignment} are compatible with the strides
     * defined in {@code meta} and will fail to update if they are not.
     * @param alignment a {@link VideoAlignment}
     * @return {@code true} if {@code alignment}'s meta has been updated, {@code false} if not
     */
    public boolean setAlignment(org.gstreamer.video.VideoAlignment alignment) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_meta_set_alignment.invokeExact(
                    handle(),
                    alignment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Unmap a previously mapped plane with gst_video_meta_map().
     * @param plane a plane
     * @param info a {@link org.gstreamer.gst.MapInfo}
     * @return TRUE if the memory was successfully unmapped.
     */
    public boolean unmap(int plane, org.gstreamer.gst.MapInfo info) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_meta_unmap.invokeExact(
                    handle(),
                    plane,
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
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
     * A {@link VideoMeta.Builder} object constructs a {@link VideoMeta} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoMeta.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoMeta struct;
        
        private Builder() {
            struct = VideoMeta.allocate();
        }
        
        /**
         * Finish building the {@link VideoMeta} struct.
         * @return A new instance of {@code VideoMeta} with the fields 
         *         that were set in the Builder object.
         */
        public VideoMeta build() {
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
         * the buffer this metadata belongs to
         * @param buffer The value for the {@code buffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBuffer(org.gstreamer.gst.Buffer buffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
                return this;
            }
        }
        
        /**
         * additional video flags
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gstreamer.video.VideoFrameFlags flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
                return this;
            }
        }
        
        /**
         * the video format
         * @param format The value for the {@code format} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFormat(org.gstreamer.video.VideoFormat format) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("format"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (format == null ? MemoryAddress.NULL : format.getValue()));
                return this;
            }
        }
        
        /**
         * identifier of the frame
         * @param id The value for the {@code id} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setId(int id) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), id);
                return this;
            }
        }
        
        /**
         * the video width
         * @param width The value for the {@code width} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidth(int width) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("width"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), width);
                return this;
            }
        }
        
        /**
         * the video height
         * @param height The value for the {@code height} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeight(int height) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("height"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), height);
                return this;
            }
        }
        
        /**
         * the number of planes in the image
         * @param nPlanes The value for the {@code nPlanes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNPlanes(int nPlanes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), nPlanes);
                return this;
            }
        }
        
        /**
         * array of offsets for the planes. This field might not always be
         *          valid, it is used by the default implementation of {@code map}.
         * @param offset The value for the {@code offset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOffset(long[] offset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (offset == null ? MemoryAddress.NULL : Interop.allocateNativeArray(offset, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * array of strides for the planes. This field might not always be
         *          valid, it is used by the default implementation of {@code map}.
         * @param stride The value for the {@code stride} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStride(int[] stride) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("stride"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stride == null ? MemoryAddress.NULL : Interop.allocateNativeArray(stride, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setMap(MapCallback map) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("map"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (map == null ? MemoryAddress.NULL : map.toCallback()));
                return this;
            }
        }
        
        public Builder setUnmap(UnmapCallback unmap) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unmap == null ? MemoryAddress.NULL : unmap.toCallback()));
                return this;
            }
        }
        
        /**
         * the paddings and alignment constraints of the video buffer.
         * It is up to the caller of {@code gst_buffer_add_video_meta_full()} to set it
         * using gst_video_meta_set_alignment(), if they did not it defaults
         * to no padding and no alignment. Since: 1.18
         * @param alignment The value for the {@code alignment} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAlignment(org.gstreamer.video.VideoAlignment alignment) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("alignment"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (alignment == null ? MemoryAddress.NULL : alignment.handle()));
                return this;
            }
        }
    }
}
