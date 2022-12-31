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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoFormatInfo newInstance = new VideoFormatInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code format}
     * @return The value of the field {@code format}
     */
    public org.gstreamer.video.VideoFormat getFormat() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoFormat.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code format}
     * @param format The new value of the field {@code format}
     */
    public void setFormat(org.gstreamer.video.VideoFormat format) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (format == null ? MemoryAddress.NULL : format.getValue()));
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String getName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void setName(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
    }
    
    /**
     * Get the value of the field {@code description}
     * @return The value of the field {@code description}
     */
    public java.lang.String getDescription() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code description}
     * @param description The new value of the field {@code description}
     */
    public void setDescription(java.lang.String description) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, null)));
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.video.VideoFormatFlags getFlags() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoFormatFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(org.gstreamer.video.VideoFormatFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
    }
    
    /**
     * Get the value of the field {@code bits}
     * @return The value of the field {@code bits}
     */
    public int getBits() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bits"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bits}
     * @param bits The new value of the field {@code bits}
     */
    public void setBits(int bits) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bits"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bits);
    }
    
    /**
     * Get the value of the field {@code n_components}
     * @return The value of the field {@code n_components}
     */
    public int getNComponents() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_components"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_components}
     * @param nComponents The new value of the field {@code n_components}
     */
    public void setNComponents(int nComponents) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_components"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nComponents);
    }
    
    /**
     * Get the value of the field {@code shift}
     * @return The value of the field {@code shift}
     */
    public int[] getShift() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shift"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_INT);
    }
    
    /**
     * Change the value of the field {@code shift}
     * @param shift The new value of the field {@code shift}
     */
    public void setShift(int[] shift) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shift"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shift == null ? MemoryAddress.NULL : Interop.allocateNativeArray(shift, false)));
    }
    
    /**
     * Get the value of the field {@code depth}
     * @return The value of the field {@code depth}
     */
    public int[] getDepth() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("depth"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_INT);
    }
    
    /**
     * Change the value of the field {@code depth}
     * @param depth The new value of the field {@code depth}
     */
    public void setDepth(int[] depth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("depth"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (depth == null ? MemoryAddress.NULL : Interop.allocateNativeArray(depth, false)));
    }
    
    /**
     * Get the value of the field {@code pixel_stride}
     * @return The value of the field {@code pixel_stride}
     */
    public int[] getPixelStride() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pixel_stride"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_INT);
    }
    
    /**
     * Change the value of the field {@code pixel_stride}
     * @param pixelStride The new value of the field {@code pixel_stride}
     */
    public void setPixelStride(int[] pixelStride) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pixel_stride"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pixelStride == null ? MemoryAddress.NULL : Interop.allocateNativeArray(pixelStride, false)));
    }
    
    /**
     * Get the value of the field {@code n_planes}
     * @return The value of the field {@code n_planes}
     */
    public int getNPlanes() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_planes}
     * @param nPlanes The new value of the field {@code n_planes}
     */
    public void setNPlanes(int nPlanes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPlanes);
    }
    
    /**
     * Get the value of the field {@code plane}
     * @return The value of the field {@code plane}
     */
    public int[] getPlane() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("plane"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_INT);
    }
    
    /**
     * Change the value of the field {@code plane}
     * @param plane The new value of the field {@code plane}
     */
    public void setPlane(int[] plane) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("plane"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (plane == null ? MemoryAddress.NULL : Interop.allocateNativeArray(plane, false)));
    }
    
    /**
     * Get the value of the field {@code poffset}
     * @return The value of the field {@code poffset}
     */
    public int[] getPoffset() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("poffset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_INT);
    }
    
    /**
     * Change the value of the field {@code poffset}
     * @param poffset The new value of the field {@code poffset}
     */
    public void setPoffset(int[] poffset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("poffset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (poffset == null ? MemoryAddress.NULL : Interop.allocateNativeArray(poffset, false)));
    }
    
    /**
     * Get the value of the field {@code w_sub}
     * @return The value of the field {@code w_sub}
     */
    public int[] getWSub() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("w_sub"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_INT);
    }
    
    /**
     * Change the value of the field {@code w_sub}
     * @param wSub The new value of the field {@code w_sub}
     */
    public void setWSub(int[] wSub) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("w_sub"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (wSub == null ? MemoryAddress.NULL : Interop.allocateNativeArray(wSub, false)));
    }
    
    /**
     * Get the value of the field {@code h_sub}
     * @return The value of the field {@code h_sub}
     */
    public int[] getHSub() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("h_sub"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_INT);
    }
    
    /**
     * Change the value of the field {@code h_sub}
     * @param hSub The new value of the field {@code h_sub}
     */
    public void setHSub(int[] hSub) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("h_sub"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hSub == null ? MemoryAddress.NULL : Interop.allocateNativeArray(hSub, false)));
    }
    
    /**
     * Get the value of the field {@code unpack_format}
     * @return The value of the field {@code unpack_format}
     */
    public org.gstreamer.video.VideoFormat getUnpackFormat() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unpack_format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoFormat.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code unpack_format}
     * @param unpackFormat The new value of the field {@code unpack_format}
     */
    public void setUnpackFormat(org.gstreamer.video.VideoFormat unpackFormat) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unpack_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unpackFormat == null ? MemoryAddress.NULL : unpackFormat.getValue()));
    }
    
    /**
     * Get the value of the field {@code unpack_func}
     * @return The value of the field {@code unpack_func}
     */
    public org.gstreamer.video.VideoFormatUnpack getUnpackFunc() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unpack_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code unpack_func}
     * @param unpackFunc The new value of the field {@code unpack_func}
     */
    public void setUnpackFunc(org.gstreamer.video.VideoFormatUnpack unpackFunc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unpack_func"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unpackFunc == null ? MemoryAddress.NULL : (Addressable) unpackFunc.toCallback()));
    }
    
    /**
     * Get the value of the field {@code pack_lines}
     * @return The value of the field {@code pack_lines}
     */
    public int getPackLines() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pack_lines"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code pack_lines}
     * @param packLines The new value of the field {@code pack_lines}
     */
    public void setPackLines(int packLines) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pack_lines"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), packLines);
    }
    
    /**
     * Get the value of the field {@code pack_func}
     * @return The value of the field {@code pack_func}
     */
    public org.gstreamer.video.VideoFormatPack getPackFunc() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pack_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code pack_func}
     * @param packFunc The new value of the field {@code pack_func}
     */
    public void setPackFunc(org.gstreamer.video.VideoFormatPack packFunc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pack_func"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (packFunc == null ? MemoryAddress.NULL : (Addressable) packFunc.toCallback()));
    }
    
    /**
     * Get the value of the field {@code tile_mode}
     * @return The value of the field {@code tile_mode}
     */
    public org.gstreamer.video.VideoTileMode getTileMode() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoTileMode.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code tile_mode}
     * @param tileMode The new value of the field {@code tile_mode}
     */
    public void setTileMode(org.gstreamer.video.VideoTileMode tileMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tileMode == null ? MemoryAddress.NULL : tileMode.getValue()));
    }
    
    /**
     * Get the value of the field {@code tile_ws}
     * @return The value of the field {@code tile_ws}
     */
    public int getTileWs() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_ws"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tile_ws}
     * @param tileWs The new value of the field {@code tile_ws}
     */
    public void setTileWs(int tileWs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_ws"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileWs);
    }
    
    /**
     * Get the value of the field {@code tile_hs}
     * @return The value of the field {@code tile_hs}
     */
    public int getTileHs() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_hs"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tile_hs}
     * @param tileHs The new value of the field {@code tile_hs}
     */
    public void setTileHs(int tileHs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_hs"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileHs);
    }
    
    /**
     * Create a VideoFormatInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoFormatInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoFormatInfo> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoFormatInfo(input, ownership);
    
    /**
     * Fill {@code components} with the number of all the components packed in plane {@code p}
     * for the format {@code info}. A value of -1 in {@code components} indicates that no more
     * components are packed in the plane.
     * @param plane a plane number
     * @param components array used to store component numbers
     */
    public void component(int plane, Out<Integer> components) {
        MemorySegment componentsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (format == null ? MemoryAddress.NULL : format.getValue()));
            return this;
        }
        
        /**
         * string representation of the format
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
            return this;
        }
        
        /**
         * use readable description of the format
         * @param description The value for the {@code description} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDescription(java.lang.String description) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (description == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(description, null)));
            return this;
        }
        
        /**
         * {@link VideoFormatFlags}
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gstreamer.video.VideoFormatFlags flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bits"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bits);
            return this;
        }
        
        /**
         * the number of components in the video format.
         * @param nComponents The value for the {@code nComponents} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNComponents(int nComponents) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_components"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nComponents);
            return this;
        }
        
        /**
         * the number of bits to shift away to get the component data
         * @param shift The value for the {@code shift} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShift(int[] shift) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shift"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shift == null ? MemoryAddress.NULL : Interop.allocateNativeArray(shift, false)));
            return this;
        }
        
        /**
         * the depth in bits for each component
         * @param depth The value for the {@code depth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDepth(int[] depth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("depth"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (depth == null ? MemoryAddress.NULL : Interop.allocateNativeArray(depth, false)));
            return this;
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pixel_stride"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pixelStride == null ? MemoryAddress.NULL : Interop.allocateNativeArray(pixelStride, false)));
            return this;
        }
        
        /**
         * the number of planes for this format. The number of planes can be
         *    less than the amount of components when multiple components are packed into
         *    one plane.
         * @param nPlanes The value for the {@code nPlanes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNPlanes(int nPlanes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPlanes);
            return this;
        }
        
        /**
         * the plane number where a component can be found
         * @param plane The value for the {@code plane} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPlane(int[] plane) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plane"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (plane == null ? MemoryAddress.NULL : Interop.allocateNativeArray(plane, false)));
            return this;
        }
        
        /**
         * the offset in the plane where the first pixel of the components
         *    can be found.
         * @param poffset The value for the {@code poffset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPoffset(int[] poffset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poffset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (poffset == null ? MemoryAddress.NULL : Interop.allocateNativeArray(poffset, false)));
            return this;
        }
        
        /**
         * subsampling factor of the width for the component. Use
         *     GST_VIDEO_SUB_SCALE to scale a width.
         * @param wSub The value for the {@code wSub} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWSub(int[] wSub) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("w_sub"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (wSub == null ? MemoryAddress.NULL : Interop.allocateNativeArray(wSub, false)));
            return this;
        }
        
        /**
         * subsampling factor of the height for the component. Use
         *     GST_VIDEO_SUB_SCALE to scale a height.
         * @param hSub The value for the {@code hSub} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHSub(int[] hSub) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("h_sub"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hSub == null ? MemoryAddress.NULL : Interop.allocateNativeArray(hSub, false)));
            return this;
        }
        
        /**
         * the format of the unpacked pixels. This format must have the
         *     {@code GST_VIDEO_FORMAT_FLAG_UNPACK} flag set.
         * @param unpackFormat The value for the {@code unpackFormat} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUnpackFormat(org.gstreamer.video.VideoFormat unpackFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unpack_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unpackFormat == null ? MemoryAddress.NULL : unpackFormat.getValue()));
            return this;
        }
        
        /**
         * an unpack function for this format
         * @param unpackFunc The value for the {@code unpackFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUnpackFunc(org.gstreamer.video.VideoFormatUnpack unpackFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unpack_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unpackFunc == null ? MemoryAddress.NULL : (Addressable) unpackFunc.toCallback()));
            return this;
        }
        
        /**
         * the amount of lines that will be packed
         * @param packLines The value for the {@code packLines} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPackLines(int packLines) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pack_lines"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), packLines);
            return this;
        }
        
        /**
         * an pack function for this format
         * @param packFunc The value for the {@code packFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPackFunc(org.gstreamer.video.VideoFormatPack packFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pack_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (packFunc == null ? MemoryAddress.NULL : (Addressable) packFunc.toCallback()));
            return this;
        }
        
        /**
         * The tiling mode
         * @param tileMode The value for the {@code tileMode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTileMode(org.gstreamer.video.VideoTileMode tileMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tileMode == null ? MemoryAddress.NULL : tileMode.getValue()));
            return this;
        }
        
        /**
         * The width of a tile, in bytes, represented as a shift
         * @param tileWs The value for the {@code tileWs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTileWs(int tileWs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_ws"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileWs);
            return this;
        }
        
        /**
         * The height of a tile, in bytes, represented as a shift
         * @param tileHs The value for the {@code tileHs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTileHs(int tileHs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_hs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileHs);
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
