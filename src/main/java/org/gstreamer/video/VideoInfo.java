package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information describing image properties. This information can be filled
 * in from GstCaps with gst_video_info_from_caps(). The information is also used
 * to store the specific video info when mapping a video frame with
 * gst_video_frame_map().
 * <p>
 * Use the provided macros to access the info in this structure.
 */
public class VideoInfo extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoInfo";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("finfo"),
        Interop.valueLayout.C_INT.withName("interlace_mode"),
        Interop.valueLayout.C_INT.withName("flags"),
        Interop.valueLayout.C_INT.withName("width"),
        Interop.valueLayout.C_INT.withName("height"),
        Interop.valueLayout.C_LONG.withName("size"),
        Interop.valueLayout.C_INT.withName("views"),
        Interop.valueLayout.C_INT.withName("chroma_site"),
        org.gstreamer.video.VideoColorimetry.getMemoryLayout().withName("colorimetry"),
        Interop.valueLayout.C_INT.withName("par_n"),
        Interop.valueLayout.C_INT.withName("par_d"),
        Interop.valueLayout.C_INT.withName("fps_n"),
        Interop.valueLayout.C_INT.withName("fps_d"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_LONG).withName("offset"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_INT).withName("stride")
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
     * Allocate a new {@link VideoInfo}
     * @return A new, uninitialized @{link VideoInfo}
     */
    public static VideoInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoInfo newInstance = new VideoInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code finfo}
     * @return The value of the field {@code finfo}
     */
    public org.gstreamer.video.VideoFormatInfo finfo$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finfo"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoFormatInfo(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code finfo}
     * @param finfo The new value of the field {@code finfo}
     */
    public void finfo$set(org.gstreamer.video.VideoFormatInfo finfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finfo"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), finfo.handle());
    }
    
    /**
     * Get the value of the field {@code interlace_mode}
     * @return The value of the field {@code interlace_mode}
     */
    public org.gstreamer.video.VideoInterlaceMode interlaceMode$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interlace_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoInterlaceMode.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code interlace_mode}
     * @param interlaceMode The new value of the field {@code interlace_mode}
     */
    public void interlaceMode$set(org.gstreamer.video.VideoInterlaceMode interlaceMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interlace_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), interlaceMode.getValue());
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.video.VideoFlags flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(org.gstreamer.video.VideoFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags.getValue());
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
     * Get the value of the field {@code views}
     * @return The value of the field {@code views}
     */
    public int views$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("views"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code views}
     * @param views The new value of the field {@code views}
     */
    public void views$set(int views) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("views"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), views);
    }
    
    /**
     * Get the value of the field {@code chroma_site}
     * @return The value of the field {@code chroma_site}
     */
    public org.gstreamer.video.VideoChromaSite chromaSite$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("chroma_site"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoChromaSite(RESULT);
    }
    
    /**
     * Change the value of the field {@code chroma_site}
     * @param chromaSite The new value of the field {@code chroma_site}
     */
    public void chromaSite$set(org.gstreamer.video.VideoChromaSite chromaSite) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("chroma_site"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), chromaSite.getValue());
    }
    
    /**
     * Get the value of the field {@code colorimetry}
     * @return The value of the field {@code colorimetry}
     */
    public org.gstreamer.video.VideoColorimetry colorimetry$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("colorimetry"));
        return new org.gstreamer.video.VideoColorimetry(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code par_n}
     * @return The value of the field {@code par_n}
     */
    public int parN$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("par_n"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code par_n}
     * @param parN The new value of the field {@code par_n}
     */
    public void parN$set(int parN) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("par_n"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), parN);
    }
    
    /**
     * Get the value of the field {@code par_d}
     * @return The value of the field {@code par_d}
     */
    public int parD$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("par_d"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code par_d}
     * @param parD The new value of the field {@code par_d}
     */
    public void parD$set(int parD) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("par_d"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), parD);
    }
    
    /**
     * Get the value of the field {@code fps_n}
     * @return The value of the field {@code fps_n}
     */
    public int fpsN$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fps_n"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code fps_n}
     * @param fpsN The new value of the field {@code fps_n}
     */
    public void fpsN$set(int fpsN) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fps_n"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), fpsN);
    }
    
    /**
     * Get the value of the field {@code fps_d}
     * @return The value of the field {@code fps_d}
     */
    public int fpsD$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fps_d"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code fps_d}
     * @param fpsD The new value of the field {@code fps_d}
     */
    public void fpsD$set(int fpsD) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fps_d"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), fpsD);
    }
    
    /**
     * Create a VideoInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_info_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocate a new {@link VideoInfo} that is also initialized with
     * gst_video_info_init().
     */
    public VideoInfo() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewFromCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_info_new_from_caps.invokeExact(
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Parse {@code caps} to generate a {@link VideoInfo}.
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return A {@link VideoInfo}, or {@code null} if {@code caps} couldn't be parsed
     */
    public static VideoInfo newFromCaps(@NotNull org.gstreamer.gst.Caps caps) {
        return new VideoInfo(constructNewFromCaps(caps), Ownership.FULL);
    }
    
    /**
     * Adjust the offset and stride fields in {@code info} so that the padding and
     * stride alignment in {@code align} is respected.
     * <p>
     * Extra padding will be added to the right side when stride alignment padding
     * is required and {@code align} will be updated with the new padding values.
     * @param align alignment parameters
     * @return {@code false} if alignment could not be applied, e.g. because the
     *   size of a frame can't be represented as a 32 bit integer (Since: 1.12)
     */
    public boolean align(@NotNull org.gstreamer.video.VideoAlignment align) {
        java.util.Objects.requireNonNull(align, "Parameter 'align' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_info_align.invokeExact(
                    handle(),
                    align.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Extra padding will be added to the right side when stride alignment padding
     * is required and {@code align} will be updated with the new padding values.
     * <p>
     * This variant of gst_video_info_align() provides the updated size, in bytes,
     * of each video plane after the alignment, including all horizontal and vertical
     * paddings.
     * <p>
     * In case of GST_VIDEO_INTERLACE_MODE_ALTERNATE info, the returned sizes are the
     * ones used to hold a single field, not the full frame.
     * @param align alignment parameters
     * @param planeSize array used to store the plane sizes
     * @return {@code false} if alignment could not be applied, e.g. because the
     *   size of a frame can't be represented as a 32 bit integer
     */
    public boolean alignFull(@NotNull org.gstreamer.video.VideoAlignment align, Out<Long> planeSize) {
        java.util.Objects.requireNonNull(align, "Parameter 'align' must not be null");
        java.util.Objects.requireNonNull(planeSize, "Parameter 'planeSize' must not be null");
        MemorySegment planeSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_info_align_full.invokeExact(
                    handle(),
                    align.handle(),
                    (Addressable) planeSizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        planeSize.set(planeSizePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Converts among various {@link org.gstreamer.gst.Format} types.  This function handles
     * GST_FORMAT_BYTES, GST_FORMAT_TIME, and GST_FORMAT_DEFAULT.  For
     * raw video, GST_FORMAT_DEFAULT corresponds to video frames.  This
     * function can be used to handle pad queries of the type GST_QUERY_CONVERT.
     * @param srcFormat {@link org.gstreamer.gst.Format} of the {@code src_value}
     * @param srcValue value to convert
     * @param destFormat {@link org.gstreamer.gst.Format} of the {@code dest_value}
     * @param destValue pointer to destination value
     * @return TRUE if the conversion was successful.
     */
    public boolean convert(@NotNull org.gstreamer.gst.Format srcFormat, long srcValue, @NotNull org.gstreamer.gst.Format destFormat, Out<Long> destValue) {
        java.util.Objects.requireNonNull(srcFormat, "Parameter 'srcFormat' must not be null");
        java.util.Objects.requireNonNull(destFormat, "Parameter 'destFormat' must not be null");
        java.util.Objects.requireNonNull(destValue, "Parameter 'destValue' must not be null");
        MemorySegment destValuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_info_convert.invokeExact(
                    handle(),
                    srcFormat.getValue(),
                    srcValue,
                    destFormat.getValue(),
                    (Addressable) destValuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        destValue.set(destValuePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Copy a GstVideoInfo structure.
     * @return a new {@link VideoInfo}. free with gst_video_info_free.
     */
    public @NotNull org.gstreamer.video.VideoInfo copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_info_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoInfo(RESULT, Ownership.FULL);
    }
    
    /**
     * Free a GstVideoInfo structure previously allocated with gst_video_info_new()
     * or gst_video_info_copy().
     */
    public void free() {
        try {
            DowncallHandles.gst_video_info_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compares two {@link VideoInfo} and returns whether they are equal or not
     * @param other a {@link VideoInfo}
     * @return {@code true} if {@code info} and {@code other} are equal, else {@code false}.
     */
    public boolean isEqual(@NotNull org.gstreamer.video.VideoInfo other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_info_is_equal.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Set the default info for a video frame of {@code format} and {@code width} and {@code height}.
     * <p>
     * Note: This initializes {@code info} first, no values are preserved. This function
     * does not set the offsets correctly for interlaced vertically
     * subsampled formats.
     * @param format the format
     * @param width a width
     * @param height a height
     * @return {@code false} if the returned video info is invalid, e.g. because the
     *   size of a frame can't be represented as a 32 bit integer (Since: 1.12)
     */
    public boolean setFormat(@NotNull org.gstreamer.video.VideoFormat format, int width, int height) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_info_set_format.invokeExact(
                    handle(),
                    format.getValue(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Same as {@code gst_video_info_set_format} but also allowing to set the interlaced
     * mode.
     * @param format the format
     * @param mode a {@link VideoInterlaceMode}
     * @param width a width
     * @param height a height
     * @return {@code false} if the returned video info is invalid, e.g. because the
     *   size of a frame can't be represented as a 32 bit integer.
     */
    public boolean setInterlacedFormat(@NotNull org.gstreamer.video.VideoFormat format, @NotNull org.gstreamer.video.VideoInterlaceMode mode, int width, int height) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_info_set_interlaced_format.invokeExact(
                    handle(),
                    format.getValue(),
                    mode.getValue(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Convert the values of {@code info} into a {@link org.gstreamer.gst.Caps}.
     * @return a new {@link org.gstreamer.gst.Caps} containing the info of {@code info}.
     */
    public @NotNull org.gstreamer.gst.Caps toCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_info_to_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
    }
    
    /**
     * Parse {@code caps} and update {@code info}.
     * @param info {@link VideoInfo}
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return TRUE if {@code caps} could be parsed
     */
    public static boolean fromCaps(@NotNull org.gstreamer.video.VideoInfo info, @NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_info_from_caps.invokeExact(
                    info.handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Initialize {@code info} with default values.
     * @param info a {@link VideoInfo}
     */
    public static void init(@NotNull org.gstreamer.video.VideoInfo info) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        try {
            DowncallHandles.gst_video_info_init.invokeExact(
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_info_new = Interop.downcallHandle(
            "gst_video_info_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_info_new_from_caps = Interop.downcallHandle(
            "gst_video_info_new_from_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_info_align = Interop.downcallHandle(
            "gst_video_info_align",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_info_align_full = Interop.downcallHandle(
            "gst_video_info_align_full",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_info_convert = Interop.downcallHandle(
            "gst_video_info_convert",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_info_copy = Interop.downcallHandle(
            "gst_video_info_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_info_free = Interop.downcallHandle(
            "gst_video_info_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_info_is_equal = Interop.downcallHandle(
            "gst_video_info_is_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_info_set_format = Interop.downcallHandle(
            "gst_video_info_set_format",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_info_set_interlaced_format = Interop.downcallHandle(
            "gst_video_info_set_interlaced_format",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_info_to_caps = Interop.downcallHandle(
            "gst_video_info_to_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_info_from_caps = Interop.downcallHandle(
            "gst_video_info_from_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_info_init = Interop.downcallHandle(
            "gst_video_info_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoInfo struct;
        
         /**
         * A {@link VideoInfo.Build} object constructs a {@link VideoInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoInfo.allocate();
        }
        
         /**
         * Finish building the {@link VideoInfo} struct.
         * @return A new instance of {@code VideoInfo} with the fields 
         *         that were set in the Build object.
         */
        public VideoInfo construct() {
            return struct;
        }
        
        /**
         * the format info of the video
         * @param finfo The value for the {@code finfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFinfo(org.gstreamer.video.VideoFormatInfo finfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finfo"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finfo == null ? MemoryAddress.NULL : finfo.handle()));
            return this;
        }
        
        /**
         * the interlace mode
         * @param interlaceMode The value for the {@code interlaceMode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInterlaceMode(org.gstreamer.video.VideoInterlaceMode interlaceMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interlace_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interlaceMode == null ? MemoryAddress.NULL : interlaceMode.getValue()));
            return this;
        }
        
        /**
         * additional video flags
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(org.gstreamer.video.VideoFlags flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
        
        /**
         * the width of the video
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
         * the height of the video
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
         * the default size of one frame
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSize(long size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
            return this;
        }
        
        /**
         * the number of views for multiview video
         * @param views The value for the {@code views} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setViews(int views) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("views"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), views);
            return this;
        }
        
        /**
         * a {@link VideoChromaSite}.
         * @param chromaSite The value for the {@code chromaSite} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChromaSite(org.gstreamer.video.VideoChromaSite chromaSite) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("chroma_site"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (chromaSite == null ? MemoryAddress.NULL : chromaSite.getValue()));
            return this;
        }
        
        /**
         * the colorimetry info
         * @param colorimetry The value for the {@code colorimetry} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setColorimetry(org.gstreamer.video.VideoColorimetry colorimetry) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("colorimetry"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (colorimetry == null ? MemoryAddress.NULL : colorimetry.handle()));
            return this;
        }
        
        /**
         * the pixel-aspect-ratio numerator
         * @param parN The value for the {@code parN} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParN(int parN) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("par_n"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), parN);
            return this;
        }
        
        /**
         * the pixel-aspect-ratio denominator
         * @param parD The value for the {@code parD} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParD(int parD) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("par_d"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), parD);
            return this;
        }
        
        /**
         * the framerate numerator
         * @param fpsN The value for the {@code fpsN} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFpsN(int fpsN) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fps_n"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), fpsN);
            return this;
        }
        
        /**
         * the framerate denominator
         * @param fpsD The value for the {@code fpsD} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFpsD(int fpsD) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fps_d"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), fpsD);
            return this;
        }
        
        /**
         * offsets of the planes
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
         * strides of the planes
         * @param stride The value for the {@code stride} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStride(int[] stride) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stride"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stride == null ? MemoryAddress.NULL : Interop.allocateNativeArray(stride, false)));
            return this;
        }
    }
}
