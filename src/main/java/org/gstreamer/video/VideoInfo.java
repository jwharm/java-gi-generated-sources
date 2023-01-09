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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoInfo}
     * @return A new, uninitialized @{link VideoInfo}
     */
    public static VideoInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoInfo newInstance = new VideoInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code finfo}
     * @return The value of the field {@code finfo}
     */
    public org.gstreamer.video.VideoFormatInfo getFinfo() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finfo"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.video.VideoFormatInfo.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code finfo}
     * @param finfo The new value of the field {@code finfo}
     */
    public void setFinfo(org.gstreamer.video.VideoFormatInfo finfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finfo"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (finfo == null ? MemoryAddress.NULL : finfo.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code interlace_mode}
     * @return The value of the field {@code interlace_mode}
     */
    public org.gstreamer.video.VideoInterlaceMode getInterlaceMode() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interlace_mode"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.video.VideoInterlaceMode.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code interlace_mode}
     * @param interlaceMode The new value of the field {@code interlace_mode}
     */
    public void setInterlaceMode(org.gstreamer.video.VideoInterlaceMode interlaceMode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interlace_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interlaceMode == null ? MemoryAddress.NULL : interlaceMode.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.video.VideoFlags getFlags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.video.VideoFlags(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(org.gstreamer.video.VideoFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
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
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public long getSize() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void setSize(long size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), size);
        }
    }
    
    /**
     * Get the value of the field {@code views}
     * @return The value of the field {@code views}
     */
    public int getViews() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("views"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code views}
     * @param views The new value of the field {@code views}
     */
    public void setViews(int views) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("views"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), views);
        }
    }
    
    /**
     * Get the value of the field {@code chroma_site}
     * @return The value of the field {@code chroma_site}
     */
    public org.gstreamer.video.VideoChromaSite getChromaSite() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("chroma_site"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.video.VideoChromaSite(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code chroma_site}
     * @param chromaSite The new value of the field {@code chroma_site}
     */
    public void setChromaSite(org.gstreamer.video.VideoChromaSite chromaSite) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("chroma_site"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (chromaSite == null ? MemoryAddress.NULL : chromaSite.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code colorimetry}
     * @return The value of the field {@code colorimetry}
     */
    public org.gstreamer.video.VideoColorimetry getColorimetry() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("colorimetry"));
        return org.gstreamer.video.VideoColorimetry.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code colorimetry}
     * @param colorimetry The new value of the field {@code colorimetry}
     */
    public void setColorimetry(org.gstreamer.video.VideoColorimetry colorimetry) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("colorimetry"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (colorimetry == null ? MemoryAddress.NULL : colorimetry.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code par_n}
     * @return The value of the field {@code par_n}
     */
    public int getParN() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("par_n"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code par_n}
     * @param parN The new value of the field {@code par_n}
     */
    public void setParN(int parN) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("par_n"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), parN);
        }
    }
    
    /**
     * Get the value of the field {@code par_d}
     * @return The value of the field {@code par_d}
     */
    public int getParD() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("par_d"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code par_d}
     * @param parD The new value of the field {@code par_d}
     */
    public void setParD(int parD) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("par_d"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), parD);
        }
    }
    
    /**
     * Get the value of the field {@code fps_n}
     * @return The value of the field {@code fps_n}
     */
    public int getFpsN() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fps_n"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code fps_n}
     * @param fpsN The new value of the field {@code fps_n}
     */
    public void setFpsN(int fpsN) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fps_n"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), fpsN);
        }
    }
    
    /**
     * Get the value of the field {@code fps_d}
     * @return The value of the field {@code fps_d}
     */
    public int getFpsD() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fps_d"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code fps_d}
     * @param fpsD The new value of the field {@code fps_d}
     */
    public void setFpsD(int fpsD) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fps_d"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), fpsD);
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
     * Create a VideoInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoInfo(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFromCaps(org.gstreamer.gst.Caps caps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_info_new_from_caps.invokeExact(caps.handle());
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
    public static VideoInfo newFromCaps(org.gstreamer.gst.Caps caps) {
        var RESULT = constructNewFromCaps(caps);
        var OBJECT = org.gstreamer.video.VideoInfo.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public boolean align(org.gstreamer.video.VideoAlignment align) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_info_align.invokeExact(
                    handle(),
                    align.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public boolean alignFull(org.gstreamer.video.VideoAlignment align, Out<Long> planeSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment planeSizePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_video_info_align_full.invokeExact(
                        handle(),
                        align.handle(),
                        (Addressable) (planeSize == null ? MemoryAddress.NULL : (Addressable) planeSizePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (planeSize != null) planeSize.set(planeSizePOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public boolean convert(org.gstreamer.gst.Format srcFormat, long srcValue, org.gstreamer.gst.Format destFormat, Out<Long> destValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment destValuePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Copy a GstVideoInfo structure.
     * @return a new {@link VideoInfo}. free with gst_video_info_free.
     */
    public org.gstreamer.video.VideoInfo copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_info_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.video.VideoInfo.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Free a GstVideoInfo structure previously allocated with gst_video_info_new()
     * or gst_video_info_copy().
     */
    public void free() {
        try {
            DowncallHandles.gst_video_info_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compares two {@link VideoInfo} and returns whether they are equal or not
     * @param other a {@link VideoInfo}
     * @return {@code true} if {@code info} and {@code other} are equal, else {@code false}.
     */
    public boolean isEqual(org.gstreamer.video.VideoInfo other) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_info_is_equal.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public boolean setFormat(org.gstreamer.video.VideoFormat format, int width, int height) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public boolean setInterlacedFormat(org.gstreamer.video.VideoFormat format, org.gstreamer.video.VideoInterlaceMode mode, int width, int height) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Convert the values of {@code info} into a {@link org.gstreamer.gst.Caps}.
     * @return a new {@link org.gstreamer.gst.Caps} containing the info of {@code info}.
     */
    public org.gstreamer.gst.Caps toCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_info_to_caps.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Parse {@code caps} and update {@code info}.
     * @param info {@link VideoInfo}
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return TRUE if {@code caps} could be parsed
     */
    public static boolean fromCaps(org.gstreamer.video.VideoInfo info, org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_info_from_caps.invokeExact(
                    info.handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Initialize {@code info} with default values.
     * @param info a {@link VideoInfo}
     */
    public static void init(org.gstreamer.video.VideoInfo info) {
        try {
            DowncallHandles.gst_video_info_init.invokeExact(info.handle());
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
     * A {@link VideoInfo.Builder} object constructs a {@link VideoInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoInfo struct;
        
        private Builder() {
            struct = VideoInfo.allocate();
        }
        
        /**
         * Finish building the {@link VideoInfo} struct.
         * @return A new instance of {@code VideoInfo} with the fields 
         *         that were set in the Builder object.
         */
        public VideoInfo build() {
            return struct;
        }
        
        /**
         * the format info of the video
         * @param finfo The value for the {@code finfo} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFinfo(org.gstreamer.video.VideoFormatInfo finfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("finfo"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (finfo == null ? MemoryAddress.NULL : finfo.handle()));
                return this;
            }
        }
        
        /**
         * the interlace mode
         * @param interlaceMode The value for the {@code interlaceMode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInterlaceMode(org.gstreamer.video.VideoInterlaceMode interlaceMode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("interlace_mode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interlaceMode == null ? MemoryAddress.NULL : interlaceMode.getValue()));
                return this;
            }
        }
        
        /**
         * additional video flags
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gstreamer.video.VideoFlags flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
                return this;
            }
        }
        
        /**
         * the width of the video
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
         * the height of the video
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
         * the default size of one frame
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(long size) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), size);
                return this;
            }
        }
        
        /**
         * the number of views for multiview video
         * @param views The value for the {@code views} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setViews(int views) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("views"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), views);
                return this;
            }
        }
        
        /**
         * a {@link VideoChromaSite}.
         * @param chromaSite The value for the {@code chromaSite} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChromaSite(org.gstreamer.video.VideoChromaSite chromaSite) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("chroma_site"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (chromaSite == null ? MemoryAddress.NULL : chromaSite.getValue()));
                return this;
            }
        }
        
        /**
         * the colorimetry info
         * @param colorimetry The value for the {@code colorimetry} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setColorimetry(org.gstreamer.video.VideoColorimetry colorimetry) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("colorimetry"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (colorimetry == null ? MemoryAddress.NULL : colorimetry.handle()));
                return this;
            }
        }
        
        /**
         * the pixel-aspect-ratio numerator
         * @param parN The value for the {@code parN} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParN(int parN) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("par_n"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), parN);
                return this;
            }
        }
        
        /**
         * the pixel-aspect-ratio denominator
         * @param parD The value for the {@code parD} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParD(int parD) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("par_d"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), parD);
                return this;
            }
        }
        
        /**
         * the framerate numerator
         * @param fpsN The value for the {@code fpsN} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFpsN(int fpsN) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("fps_n"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), fpsN);
                return this;
            }
        }
        
        /**
         * the framerate denominator
         * @param fpsD The value for the {@code fpsD} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFpsD(int fpsD) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("fps_d"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), fpsD);
                return this;
            }
        }
        
        /**
         * offsets of the planes
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
         * strides of the planes
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
    }
}
