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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void name$set(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(name));
    }
    
    /**
     * Get the value of the field {@code description}
     * @return The value of the field {@code description}
     */
    public java.lang.String description$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code description}
     * @param description The new value of the field {@code description}
     */
    public void description$set(java.lang.String description) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(description));
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.video.VideoFormatFlags flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoFormatFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(org.gstreamer.video.VideoFormatFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags.getValue());
    }
    
    /**
     * Get the value of the field {@code bits}
     * @return The value of the field {@code bits}
     */
    public int bits$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bits"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bits}
     * @param bits The new value of the field {@code bits}
     */
    public void bits$set(int bits) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bits"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bits);
    }
    
    /**
     * Get the value of the field {@code n_components}
     * @return The value of the field {@code n_components}
     */
    public int nComponents$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_components"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_components}
     * @param nComponents The new value of the field {@code n_components}
     */
    public void nComponents$set(int nComponents) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_components"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nComponents);
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
     * Get the value of the field {@code unpack_format}
     * @return The value of the field {@code unpack_format}
     */
    public org.gstreamer.video.VideoFormat unpackFormat$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unpack_format"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoFormat.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code unpack_format}
     * @param unpackFormat The new value of the field {@code unpack_format}
     */
    public void unpackFormat$set(org.gstreamer.video.VideoFormat unpackFormat) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unpack_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), unpackFormat.getValue());
    }
    
    /**
     * Get the value of the field {@code unpack_func}
     * @return The value of the field {@code unpack_func}
     */
    public org.gstreamer.video.VideoFormatUnpack unpackFunc$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unpack_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code pack_lines}
     * @return The value of the field {@code pack_lines}
     */
    public int packLines$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pack_lines"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code pack_lines}
     * @param packLines The new value of the field {@code pack_lines}
     */
    public void packLines$set(int packLines) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pack_lines"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), packLines);
    }
    
    /**
     * Get the value of the field {@code pack_func}
     * @return The value of the field {@code pack_func}
     */
    public org.gstreamer.video.VideoFormatPack packFunc$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pack_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code tile_mode}
     * @return The value of the field {@code tile_mode}
     */
    public org.gstreamer.video.VideoTileMode tileMode$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoTileMode.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code tile_mode}
     * @param tileMode The new value of the field {@code tile_mode}
     */
    public void tileMode$set(org.gstreamer.video.VideoTileMode tileMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileMode.getValue());
    }
    
    /**
     * Get the value of the field {@code tile_ws}
     * @return The value of the field {@code tile_ws}
     */
    public int tileWs$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_ws"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tile_ws}
     * @param tileWs The new value of the field {@code tile_ws}
     */
    public void tileWs$set(int tileWs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_ws"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileWs);
    }
    
    /**
     * Get the value of the field {@code tile_hs}
     * @return The value of the field {@code tile_hs}
     */
    public int tileHs$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_hs"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tile_hs}
     * @param tileHs The new value of the field {@code tile_hs}
     */
    public void tileHs$set(int tileHs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_hs"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileHs);
    }
    
    /**
     * Create a VideoFormatInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoFormatInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Fill {@code components} with the number of all the components packed in plane {@code p}
     * for the format {@code info}. A value of -1 in {@code components} indicates that no more
     * components are packed in the plane.
     * @param plane a plane number
     * @param components array used to store component numbers
     */
    public void component(int plane, Out<Integer> components) {
        java.util.Objects.requireNonNull(components, "Parameter 'components' must not be null");
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoFormatInfo struct;
        
         /**
         * A {@link VideoFormatInfo.Build} object constructs a {@link VideoFormatInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoFormatInfo.allocate();
        }
        
         /**
         * Finish building the {@link VideoFormatInfo} struct.
         * @return A new instance of {@code VideoFormatInfo} with the fields 
         *         that were set in the Build object.
         */
        public VideoFormatInfo construct() {
            return struct;
        }
        
        /**
         * {@link VideoFormat}
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
         * string representation of the format
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
            return this;
        }
        
        /**
         * use readable description of the format
         * @param description The value for the {@code description} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDescription(java.lang.String description) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (description == null ? MemoryAddress.NULL : Interop.allocateNativeString(description)));
            return this;
        }
        
        /**
         * {@link VideoFormatFlags}
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(org.gstreamer.video.VideoFormatFlags flags) {
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
        public Build setBits(int bits) {
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
        public Build setNComponents(int nComponents) {
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
        public Build setShift(int[] shift) {
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
        public Build setDepth(int[] depth) {
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
        public Build setPixelStride(int[] pixelStride) {
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
        public Build setNPlanes(int nPlanes) {
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
        public Build setPlane(int[] plane) {
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
        public Build setPoffset(int[] poffset) {
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
        public Build setWSub(int[] wSub) {
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
        public Build setHSub(int[] hSub) {
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
        public Build setUnpackFormat(org.gstreamer.video.VideoFormat unpackFormat) {
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
        public Build setUnpackFunc(java.lang.foreign.MemoryAddress unpackFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unpack_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unpackFunc == null ? MemoryAddress.NULL : unpackFunc));
            return this;
        }
        
        /**
         * the amount of lines that will be packed
         * @param packLines The value for the {@code packLines} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPackLines(int packLines) {
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
        public Build setPackFunc(java.lang.foreign.MemoryAddress packFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pack_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (packFunc == null ? MemoryAddress.NULL : packFunc));
            return this;
        }
        
        /**
         * The tiling mode
         * @param tileMode The value for the {@code tileMode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTileMode(org.gstreamer.video.VideoTileMode tileMode) {
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
        public Build setTileWs(int tileWs) {
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
        public Build setTileHs(int tileHs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_hs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tileHs);
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
