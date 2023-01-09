package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Mastering display color volume information defined by SMPTE ST 2086
 * (a.k.a static HDR metadata).
 * @version 1.18
 */
public class VideoMasteringDisplayInfo extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoMasteringDisplayInfo";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(3, org.gstreamer.video.VideoMasteringDisplayInfoCoordinates.getMemoryLayout()).withName("display_primaries"),
            org.gstreamer.video.VideoMasteringDisplayInfoCoordinates.getMemoryLayout().withName("white_point"),
            Interop.valueLayout.C_INT.withName("max_display_mastering_luminance"),
            Interop.valueLayout.C_INT.withName("min_display_mastering_luminance"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoMasteringDisplayInfo}
     * @return A new, uninitialized @{link VideoMasteringDisplayInfo}
     */
    public static VideoMasteringDisplayInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoMasteringDisplayInfo newInstance = new VideoMasteringDisplayInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code display_primaries}
     * @return The value of the field {@code display_primaries}
     */
    public org.gstreamer.video.VideoMasteringDisplayInfoCoordinates[] getDisplayPrimaries() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("display_primaries"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gstreamer.video.VideoMasteringDisplayInfoCoordinates>(RESULT, org.gstreamer.video.VideoMasteringDisplayInfoCoordinates.fromAddress).toArray((int) 3, org.gstreamer.video.VideoMasteringDisplayInfoCoordinates.class);
        }
    }
    
    /**
     * Change the value of the field {@code display_primaries}
     * @param displayPrimaries The new value of the field {@code display_primaries}
     */
    public void setDisplayPrimaries(org.gstreamer.video.VideoMasteringDisplayInfoCoordinates[] displayPrimaries) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("display_primaries"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (displayPrimaries == null ? MemoryAddress.NULL : Interop.allocateNativeArray(displayPrimaries, org.gstreamer.video.VideoMasteringDisplayInfoCoordinates.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code white_point}
     * @return The value of the field {@code white_point}
     */
    public org.gstreamer.video.VideoMasteringDisplayInfoCoordinates getWhitePoint() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("white_point"));
        return org.gstreamer.video.VideoMasteringDisplayInfoCoordinates.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code white_point}
     * @param whitePoint The new value of the field {@code white_point}
     */
    public void setWhitePoint(org.gstreamer.video.VideoMasteringDisplayInfoCoordinates whitePoint) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("white_point"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (whitePoint == null ? MemoryAddress.NULL : whitePoint.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code max_display_mastering_luminance}
     * @return The value of the field {@code max_display_mastering_luminance}
     */
    public int getMaxDisplayMasteringLuminance() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max_display_mastering_luminance"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code max_display_mastering_luminance}
     * @param maxDisplayMasteringLuminance The new value of the field {@code max_display_mastering_luminance}
     */
    public void setMaxDisplayMasteringLuminance(int maxDisplayMasteringLuminance) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max_display_mastering_luminance"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), maxDisplayMasteringLuminance);
        }
    }
    
    /**
     * Get the value of the field {@code min_display_mastering_luminance}
     * @return The value of the field {@code min_display_mastering_luminance}
     */
    public int getMinDisplayMasteringLuminance() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min_display_mastering_luminance"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code min_display_mastering_luminance}
     * @param minDisplayMasteringLuminance The new value of the field {@code min_display_mastering_luminance}
     */
    public void setMinDisplayMasteringLuminance(int minDisplayMasteringLuminance) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min_display_mastering_luminance"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), minDisplayMasteringLuminance);
        }
    }
    
    /**
     * Create a VideoMasteringDisplayInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoMasteringDisplayInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoMasteringDisplayInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoMasteringDisplayInfo(input);
    
    /**
     * Set string representation of {@code minfo} to {@code caps}
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return {@code true} if {@code minfo} was successfully set to {@code caps}
     */
    public boolean addToCaps(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_mastering_display_info_add_to_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Parse {@code caps} and update {@code minfo}
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return {@code true} if {@code caps} has {@link VideoMasteringDisplayInfo} and could be parsed
     */
    public boolean fromCaps(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_mastering_display_info_from_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Initialize {@code minfo}
     */
    public void init() {
        try {
            DowncallHandles.gst_video_mastering_display_info_init.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks equality between {@code minfo} and {@code other}.
     * @param other a {@link VideoMasteringDisplayInfo}
     * @return {@code true} if {@code minfo} and {@code other} are equal.
     */
    public boolean isEqual(org.gstreamer.video.VideoMasteringDisplayInfo other) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_mastering_display_info_is_equal.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Convert {@code minfo} to its string representation
     * @return a string representation of {@code minfo}
     */
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_mastering_display_info_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Extract {@link VideoMasteringDisplayInfo} from {@code mastering}
     * @param minfo a {@link VideoMasteringDisplayInfo}
     * @param mastering a {@link org.gstreamer.gst.Structure} representing {@link VideoMasteringDisplayInfo}
     * @return {@code true} if {@code minfo} was filled with {@code mastering}
     */
    public static boolean fromString(org.gstreamer.video.VideoMasteringDisplayInfo minfo, java.lang.String mastering) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_video_mastering_display_info_from_string.invokeExact(
                        minfo.handle(),
                        Marshal.stringToAddress.marshal(mastering, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_mastering_display_info_add_to_caps = Interop.downcallHandle(
                "gst_video_mastering_display_info_add_to_caps",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_mastering_display_info_from_caps = Interop.downcallHandle(
                "gst_video_mastering_display_info_from_caps",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_mastering_display_info_init = Interop.downcallHandle(
                "gst_video_mastering_display_info_init",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_mastering_display_info_is_equal = Interop.downcallHandle(
                "gst_video_mastering_display_info_is_equal",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_mastering_display_info_to_string = Interop.downcallHandle(
                "gst_video_mastering_display_info_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_mastering_display_info_from_string = Interop.downcallHandle(
                "gst_video_mastering_display_info_from_string",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link VideoMasteringDisplayInfo.Builder} object constructs a {@link VideoMasteringDisplayInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoMasteringDisplayInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoMasteringDisplayInfo struct;
        
        private Builder() {
            struct = VideoMasteringDisplayInfo.allocate();
        }
        
        /**
         * Finish building the {@link VideoMasteringDisplayInfo} struct.
         * @return A new instance of {@code VideoMasteringDisplayInfo} with the fields 
         *         that were set in the Builder object.
         */
        public VideoMasteringDisplayInfo build() {
            return struct;
        }
        
        /**
         * the xy coordinates of primaries in the CIE 1931 color space.
         *   the index 0 contains red, 1 is for green and 2 is for blue.
         *   each value is normalized to 50000 (meaning that in unit of 0.00002)
         * @param displayPrimaries The value for the {@code displayPrimaries} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplayPrimaries(org.gstreamer.video.VideoMasteringDisplayInfoCoordinates[] displayPrimaries) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("display_primaries"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (displayPrimaries == null ? MemoryAddress.NULL : Interop.allocateNativeArray(displayPrimaries, org.gstreamer.video.VideoMasteringDisplayInfoCoordinates.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
        
        /**
         * the xy coordinates of white point in the CIE 1931 color space.
         *   each value is normalized to 50000 (meaning that in unit of 0.00002)
         * @param whitePoint The value for the {@code whitePoint} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWhitePoint(org.gstreamer.video.VideoMasteringDisplayInfoCoordinates whitePoint) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("white_point"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (whitePoint == null ? MemoryAddress.NULL : whitePoint.handle()));
                return this;
            }
        }
        
        /**
         * the maximum value of display luminance
         *   in unit of 0.0001 candelas per square metre (cd/m^2 and nit)
         * @param maxDisplayMasteringLuminance The value for the {@code maxDisplayMasteringLuminance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMaxDisplayMasteringLuminance(int maxDisplayMasteringLuminance) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("max_display_mastering_luminance"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), maxDisplayMasteringLuminance);
                return this;
            }
        }
        
        /**
         * the minimum value of display luminance
         *   in unit of 0.0001 candelas per square metre (cd/m^2 and nit)
         * @param minDisplayMasteringLuminance The value for the {@code minDisplayMasteringLuminance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinDisplayMasteringLuminance(int minDisplayMasteringLuminance) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("min_display_mastering_luminance"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), minDisplayMasteringLuminance);
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
