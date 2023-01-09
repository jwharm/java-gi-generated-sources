package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information for a video format.
 */
public class VideoFormatInfo extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoFormatInfo";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("format"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("name"),
            Interop.valueLayout.ADDRESS.withName("description"),
            Interop.valueLayout.C_INT.withName("flags"),
            Interop.valueLayout.C_INT.withName("bits"),
            Interop.valueLayout.C_INT.withName("n_components"),
            MemoryLayout.paddingLayout(96),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_INT).withName("shift"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_INT).withName("depth"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_INT).withName("pixel_stride"),
            Interop.valueLayout.C_INT.withName("n_planes"),
            MemoryLayout.paddingLayout(96),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_INT).withName("plane"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_INT).withName("poffset"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_INT).withName("w_sub"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_INT).withName("h_sub"),
            Interop.valueLayout.C_INT.withName("unpack_format"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("unpack_func"),
            Interop.valueLayout.C_INT.withName("pack_lines"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("pack_func"),
            Interop.valueLayout.C_INT.withName("tile_mode"),
            Interop.valueLayout.C_INT.withName("tile_ws"),
            Interop.valueLayout.C_INT.withName("tile_hs"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoFormatInfo}
     * @return A new, uninitialized @{link VideoFormatInfo}
     */
    public static VideoFormatInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoFormatInfo newInstance = new VideoFormatInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
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
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String getName() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void setName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code description}
     * @return The value of the field {@code description}
     */
    public java.lang.String getDescription() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code description}
     * @param description The new value of the field {@code description}
     */
    public void setDescription(java.lang.String description) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.video.VideoFormatFlags getFlags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.video.VideoFormatFlags(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(org.gstreamer.video.VideoFormatFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code bits}
     * @return The value of the field {@code bits}
     */
    public int getBits() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bits"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code bits}
     * @param bits The new value of the field {@code bits}
     */
    public void setBits(int bits) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bits"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), bits);
        }
    }
    
    /**
     * Get the value of the field {@code n_components}
     * @return The value of the field {@code n_components}
     */
    public int getNComponents() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_components"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code n_components}
     * @param nComponents The new value of the field {@code n_components}
     */
    public void setNComponents(int nComponents) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_components"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), nComponents);
        }
    }
    
    /**
     * Get the value of the field {@code shift}
     * @return The value of the field {@code shift}
     */
    public int[] getShift() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shift"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 4, SCOPE).toArray(Interop.valueLayout.C_INT);
        }
    }
    
    /**
     * Change the value of the field {@code shift}
     * @param shift The new value of the field {@code shift}
     */
    public void setShift(int[] shift) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shift"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shift == null ? MemoryAddress.NULL : Interop.allocateNativeArray(shift, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code depth}
     * @return The value of the field {@code depth}
     */
    public int[] getDepth() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("depth"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 4, SCOPE).toArray(Interop.valueLayout.C_INT);
        }
    }
    
    /**
     * Change the value of the field {@code depth}
     * @param depth The new value of the field {@code depth}
     */
    public void setDepth(int[] depth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("depth"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (depth == null ? MemoryAddress.NULL : Interop.allocateNativeArray(depth, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code pixel_stride}
     * @return The value of the field {@code pixel_stride}
     */
    public int[] getPixelStride() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pixel_stride"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 4, SCOPE).toArray(Interop.valueLayout.C_INT);
        }
    }
    
    /**
     * Change the value of the field {@code pixel_stride}
     * @param pixelStride The new value of the field {@code pixel_stride}
     */
    public void setPixelStride(int[] pixelStride) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pixel_stride"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pixelStride == null ? MemoryAddress.NULL : Interop.allocateNativeArray(pixelStride, false, SCOPE)));
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
     * Get the value of the field {@code plane}
     * @return The value of the field {@code plane}
     */
    public int[] getPlane() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plane"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 4, SCOPE).toArray(Interop.valueLayout.C_INT);
        }
    }
    
    /**
     * Change the value of the field {@code plane}
     * @param plane The new value of the field {@code plane}
     */
    public void setPlane(int[] plane) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plane"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (plane == null ? MemoryAddress.NULL : Interop.allocateNativeArray(plane, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code poffset}
     * @return The value of the field {@code poffset}
     */
    public int[] getPoffset() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poffset"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 4, SCOPE).toArray(Interop.valueLayout.C_INT);
        }
    }
    
    /**
     * Change the value of the field {@code poffset}
     * @param poffset The new value of the field {@code poffset}
     */
    public void setPoffset(int[] poffset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poffset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (poffset == null ? MemoryAddress.NULL : Interop.allocateNativeArray(poffset, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code w_sub}
     * @return The value of the field {@code w_sub}
     */
    public int[] getWSub() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("w_sub"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 4, SCOPE).toArray(Interop.valueLayout.C_INT);
        }
    }
    
    /**
     * Change the value of the field {@code w_sub}
     * @param wSub The new value of the field {@code w_sub}
     */
    public void setWSub(int[] wSub) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("w_sub"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (wSub == null ? MemoryAddress.NULL : Interop.allocateNativeArray(wSub, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code h_sub}
     * @return The value of the field {@code h_sub}
     */
    public int[] getHSub() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("h_sub"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 4, SCOPE).toArray(Interop.valueLayout.C_INT);
        }
    }
    
    /**
     * Change the value of the field {@code h_sub}
     * @param hSub The new value of the field {@code h_sub}
     */
    public void setHSub(int[] hSub) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("h_sub"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hSub == null ? MemoryAddress.NULL : Interop.allocateNativeArray(hSub, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code unpack_format}
     * @return The value of the field {@code unpack_format}
     */
    public org.gstreamer.video.VideoFormat getUnpackFormat() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unpack_format"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.video.VideoFormat.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code unpack_format}
     * @param unpackFormat The new value of the field {@code unpack_format}
     */
    public void setUnpackFormat(org.gstreamer.video.VideoFormat unpackFormat) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unpack_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unpackFormat == null ? MemoryAddress.NULL : unpackFormat.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code unpack_func}
     * @return The value of the field {@code unpack_func}
     */
    public org.gstreamer.video.VideoFormatUnpack getUnpackFunc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unpack_func"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code unpack_func}
     * @param unpackFunc The new value of the field {@code unpack_func}
     */
    public void setUnpackFunc(org.gstreamer.video.VideoFormatUnpack unpackFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unpack_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unpackFunc == null ? MemoryAddress.NULL : (Addressable) unpackFunc.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code pack_lines}
     * @return The value of the field {@code pack_lines}
     */
    public int getPackLines() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pack_lines"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code pack_lines}
     * @param packLines The new value of the field {@code pack_lines}
     */
    public void setPackLines(int packLines) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pack_lines"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), packLines);
        }
    }
    
    /**
     * Get the value of the field {@code pack_func}
     * @return The value of the field {@code pack_func}
     */
    public org.gstreamer.video.VideoFormatPack getPackFunc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pack_func"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code pack_func}
     * @param packFunc The new value of the field {@code pack_func}
     */
    public void setPackFunc(org.gstreamer.video.VideoFormatPack packFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pack_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (packFunc == null ? MemoryAddress.NULL : (Addressable) packFunc.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code tile_mode}
     * @return The value of the field {@code tile_mode}
     */
    public org.gstreamer.video.VideoTileMode getTileMode() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_mode"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.video.VideoTileMode.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code tile_mode}
     * @param tileMode The new value of the field {@code tile_mode}
     */
    public void setTileMode(org.gstreamer.video.VideoTileMode tileMode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tileMode == null ? MemoryAddress.NULL : tileMode.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code tile_ws}
     * @return The value of the field {@code tile_ws}
     */
    public int getTileWs() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_ws"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code tile_ws}
     * @param tileWs The new value of the field {@code tile_ws}
     */
    public void setTileWs(int tileWs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_ws"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), tileWs);
        }
    }
    
    /**
     * Get the value of the field {@code tile_hs}
     * @return The value of the field {@code tile_hs}
     */
    public int getTileHs() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_hs"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code tile_hs}
     * @param tileHs The new value of the field {@code tile_hs}
     */
    public void setTileHs(int tileHs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_hs"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), tileHs);
        }
    }
    
    /**
     * Create a VideoFormatInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoFormatInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoFormatInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoFormatInfo(input);
    
    /**
     * Fill {@code components} with the number of all the components packed in plane {@code p}
     * for the format {@code info}. A value of -1 in {@code components} indicates that no more
     * components are packed in the plane.
     * @param plane a plane number
     * @param components array used to store component numbers
     */
    public void component(int plane, Out<Integer> components) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment componentsPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_video_format_info_component.invokeExact(
                        handle(),
                        plane,
                        (Addressable) componentsPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    components.set(componentsPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_format_info_component = Interop.downcallHandle(
                "gst_video_format_info_component",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link VideoFormatInfo.Builder} object constructs a {@link VideoFormatInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoFormatInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoFormatInfo struct;
        
        private Builder() {
            struct = VideoFormatInfo.allocate();
        }
        
        /**
         * Finish building the {@link VideoFormatInfo} struct.
         * @return A new instance of {@code VideoFormatInfo} with the fields 
         *         that were set in the Builder object.
         */
        public VideoFormatInfo build() {
            return struct;
        }
        
        /**
         * {@link VideoFormat}
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
         * string representation of the format
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
                return this;
            }
        }
        
        /**
         * use readable description of the format
         * @param description The value for the {@code description} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDescription(java.lang.String description) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("description"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, SCOPE)));
                return this;
            }
        }
        
        /**
         * {@link VideoFormatFlags}
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gstreamer.video.VideoFormatFlags flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
                return this;
            }
        }
        
        /**
         * The number of bits used to pack data items. This can be less than 8
         *    when multiple pixels are stored in a byte. for values &gt; 8 multiple bytes
         *    should be read according to the endianness flag before applying the shift
         *    and mask.
         * @param bits The value for the {@code bits} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBits(int bits) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bits"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), bits);
                return this;
            }
        }
        
        /**
         * the number of components in the video format.
         * @param nComponents The value for the {@code nComponents} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNComponents(int nComponents) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("n_components"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), nComponents);
                return this;
            }
        }
        
        /**
         * the number of bits to shift away to get the component data
         * @param shift The value for the {@code shift} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShift(int[] shift) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("shift"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shift == null ? MemoryAddress.NULL : Interop.allocateNativeArray(shift, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * the depth in bits for each component
         * @param depth The value for the {@code depth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDepth(int[] depth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("depth"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (depth == null ? MemoryAddress.NULL : Interop.allocateNativeArray(depth, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * the pixel stride of each component. This is the amount of
         *    bytes to the pixel immediately to the right. When bits &lt; 8, the stride is
         *    expressed in bits. For 24-bit RGB, this would be 3 bytes, for example,
         *    while it would be 4 bytes for RGBx or ARGB.
         * @param pixelStride The value for the {@code pixelStride} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPixelStride(int[] pixelStride) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pixel_stride"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pixelStride == null ? MemoryAddress.NULL : Interop.allocateNativeArray(pixelStride, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * the number of planes for this format. The number of planes can be
         *    less than the amount of components when multiple components are packed into
         *    one plane.
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
         * the plane number where a component can be found
         * @param plane The value for the {@code plane} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPlane(int[] plane) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("plane"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (plane == null ? MemoryAddress.NULL : Interop.allocateNativeArray(plane, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * the offset in the plane where the first pixel of the components
         *    can be found.
         * @param poffset The value for the {@code poffset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPoffset(int[] poffset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("poffset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (poffset == null ? MemoryAddress.NULL : Interop.allocateNativeArray(poffset, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * subsampling factor of the width for the component. Use
         *     GST_VIDEO_SUB_SCALE to scale a width.
         * @param wSub The value for the {@code wSub} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWSub(int[] wSub) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("w_sub"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (wSub == null ? MemoryAddress.NULL : Interop.allocateNativeArray(wSub, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * subsampling factor of the height for the component. Use
         *     GST_VIDEO_SUB_SCALE to scale a height.
         * @param hSub The value for the {@code hSub} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHSub(int[] hSub) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("h_sub"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hSub == null ? MemoryAddress.NULL : Interop.allocateNativeArray(hSub, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * the format of the unpacked pixels. This format must have the
         *     {@code GST_VIDEO_FORMAT_FLAG_UNPACK} flag set.
         * @param unpackFormat The value for the {@code unpackFormat} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUnpackFormat(org.gstreamer.video.VideoFormat unpackFormat) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unpack_format"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unpackFormat == null ? MemoryAddress.NULL : unpackFormat.getValue()));
                return this;
            }
        }
        
        /**
         * an unpack function for this format
         * @param unpackFunc The value for the {@code unpackFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUnpackFunc(org.gstreamer.video.VideoFormatUnpack unpackFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unpack_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unpackFunc == null ? MemoryAddress.NULL : (Addressable) unpackFunc.toCallback()));
                return this;
            }
        }
        
        /**
         * the amount of lines that will be packed
         * @param packLines The value for the {@code packLines} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPackLines(int packLines) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pack_lines"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), packLines);
                return this;
            }
        }
        
        /**
         * an pack function for this format
         * @param packFunc The value for the {@code packFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPackFunc(org.gstreamer.video.VideoFormatPack packFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pack_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (packFunc == null ? MemoryAddress.NULL : (Addressable) packFunc.toCallback()));
                return this;
            }
        }
        
        /**
         * The tiling mode
         * @param tileMode The value for the {@code tileMode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTileMode(org.gstreamer.video.VideoTileMode tileMode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tile_mode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tileMode == null ? MemoryAddress.NULL : tileMode.getValue()));
                return this;
            }
        }
        
        /**
         * The width of a tile, in bytes, represented as a shift
         * @param tileWs The value for the {@code tileWs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTileWs(int tileWs) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tile_ws"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), tileWs);
                return this;
            }
        }
        
        /**
         * The height of a tile, in bytes, represented as a shift
         * @param tileHs The value for the {@code tileHs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTileHs(int tileHs) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tile_hs"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), tileHs);
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
