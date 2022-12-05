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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(3, org.gstreamer.video.VideoMasteringDisplayInfoCoordinates.getMemoryLayout()).withName("display_primaries"),
        org.gstreamer.video.VideoMasteringDisplayInfoCoordinates.getMemoryLayout().withName("white_point"),
        Interop.valueLayout.C_INT.withName("max_display_mastering_luminance"),
        Interop.valueLayout.C_INT.withName("min_display_mastering_luminance"),
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
     * Allocate a new {@link VideoMasteringDisplayInfo}
     * @return A new, uninitialized @{link VideoMasteringDisplayInfo}
     */
    public static VideoMasteringDisplayInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoMasteringDisplayInfo newInstance = new VideoMasteringDisplayInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code white_point}
     * @return The value of the field {@code white_point}
     */
    public org.gstreamer.video.VideoMasteringDisplayInfoCoordinates whitePoint$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("white_point"));
        return new org.gstreamer.video.VideoMasteringDisplayInfoCoordinates(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code max_display_mastering_luminance}
     * @return The value of the field {@code max_display_mastering_luminance}
     */
    public int maxDisplayMasteringLuminance$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_display_mastering_luminance"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code max_display_mastering_luminance}
     * @param maxDisplayMasteringLuminance The new value of the field {@code max_display_mastering_luminance}
     */
    public void maxDisplayMasteringLuminance$set(int maxDisplayMasteringLuminance) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_display_mastering_luminance"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxDisplayMasteringLuminance);
    }
    
    /**
     * Get the value of the field {@code min_display_mastering_luminance}
     * @return The value of the field {@code min_display_mastering_luminance}
     */
    public int minDisplayMasteringLuminance$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_display_mastering_luminance"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code min_display_mastering_luminance}
     * @param minDisplayMasteringLuminance The new value of the field {@code min_display_mastering_luminance}
     */
    public void minDisplayMasteringLuminance$set(int minDisplayMasteringLuminance) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min_display_mastering_luminance"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minDisplayMasteringLuminance);
    }
    
    /**
     * Create a VideoMasteringDisplayInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoMasteringDisplayInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Set string representation of {@code minfo} to {@code caps}
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return {@code true} if {@code minfo} was successfully set to {@code caps}
     */
    public boolean addToCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_mastering_display_info_add_to_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Parse {@code caps} and update {@code minfo}
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return {@code true} if {@code caps} has {@link VideoMasteringDisplayInfo} and could be parsed
     */
    public boolean fromCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_mastering_display_info_from_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Initialize {@code minfo}
     */
    public void init() {
        try {
            DowncallHandles.gst_video_mastering_display_info_init.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks equality between {@code minfo} and {@code other}.
     * @param other a {@link VideoMasteringDisplayInfo}
     * @return {@code true} if {@code minfo} and {@code other} are equal.
     */
    public boolean isEqual(@NotNull org.gstreamer.video.VideoMasteringDisplayInfo other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_mastering_display_info_is_equal.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Convert {@code minfo} to its string representation
     * @return a string representation of {@code minfo}
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_mastering_display_info_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Extract {@link VideoMasteringDisplayInfo} from {@code mastering}
     * @param minfo a {@link VideoMasteringDisplayInfo}
     * @param mastering a {@link org.gstreamer.gst.Structure} representing {@link VideoMasteringDisplayInfo}
     * @return {@code true} if {@code minfo} was filled with {@code mastering}
     */
    public static boolean fromString(@NotNull org.gstreamer.video.VideoMasteringDisplayInfo minfo, @NotNull java.lang.String mastering) {
        java.util.Objects.requireNonNull(minfo, "Parameter 'minfo' must not be null");
        java.util.Objects.requireNonNull(mastering, "Parameter 'mastering' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_mastering_display_info_from_string.invokeExact(
                    minfo.handle(),
                    Interop.allocateNativeString(mastering));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoMasteringDisplayInfo struct;
        
         /**
         * A {@link VideoMasteringDisplayInfo.Build} object constructs a {@link VideoMasteringDisplayInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoMasteringDisplayInfo.allocate();
        }
        
         /**
         * Finish building the {@link VideoMasteringDisplayInfo} struct.
         * @return A new instance of {@code VideoMasteringDisplayInfo} with the fields 
         *         that were set in the Build object.
         */
        public VideoMasteringDisplayInfo construct() {
            return struct;
        }
        
        /**
         * the xy coordinates of primaries in the CIE 1931 color space.
         *   the index 0 contains red, 1 is for green and 2 is for blue.
         *   each value is normalized to 50000 (meaning that in unit of 0.00002)
         * @param displayPrimaries The value for the {@code displayPrimaries} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDisplayPrimaries(org.gstreamer.video.VideoMasteringDisplayInfoCoordinates[] displayPrimaries) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("display_primaries"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (displayPrimaries == null ? MemoryAddress.NULL : Interop.allocateNativeArray(displayPrimaries, org.gstreamer.video.VideoMasteringDisplayInfoCoordinates.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * the xy coordinates of white point in the CIE 1931 color space.
         *   each value is normalized to 50000 (meaning that in unit of 0.00002)
         * @param whitePoint The value for the {@code whitePoint} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWhitePoint(org.gstreamer.video.VideoMasteringDisplayInfoCoordinates whitePoint) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("white_point"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (whitePoint == null ? MemoryAddress.NULL : whitePoint.handle()));
            return this;
        }
        
        /**
         * the maximum value of display luminance
         *   in unit of 0.0001 candelas per square metre (cd/m^2 and nit)
         * @param maxDisplayMasteringLuminance The value for the {@code maxDisplayMasteringLuminance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxDisplayMasteringLuminance(int maxDisplayMasteringLuminance) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max_display_mastering_luminance"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxDisplayMasteringLuminance);
            return this;
        }
        
        /**
         * the minimum value of display luminance
         *   in unit of 0.0001 candelas per square metre (cd/m^2 and nit)
         * @param minDisplayMasteringLuminance The value for the {@code minDisplayMasteringLuminance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinDisplayMasteringLuminance(int minDisplayMasteringLuminance) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min_display_mastering_luminance"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), minDisplayMasteringLuminance);
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
