package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Content light level information specified in CEA-861.3, Appendix A.
 * @version 1.18
 */
public class VideoContentLightLevel extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoContentLightLevel";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("max_content_light_level"),
        Interop.valueLayout.C_SHORT.withName("max_frame_average_light_level"),
        MemoryLayout.paddingLayout(224),
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
     * Allocate a new {@link VideoContentLightLevel}
     * @return A new, uninitialized @{link VideoContentLightLevel}
     */
    public static VideoContentLightLevel allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoContentLightLevel newInstance = new VideoContentLightLevel(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code max_content_light_level}
     * @return The value of the field {@code max_content_light_level}
     */
    public short maxContentLightLevel$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_content_light_level"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code max_content_light_level}
     * @param maxContentLightLevel The new value of the field {@code max_content_light_level}
     */
    public void maxContentLightLevel$set(short maxContentLightLevel) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_content_light_level"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxContentLightLevel);
    }
    
    /**
     * Get the value of the field {@code max_frame_average_light_level}
     * @return The value of the field {@code max_frame_average_light_level}
     */
    public short maxFrameAverageLightLevel$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_frame_average_light_level"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code max_frame_average_light_level}
     * @param maxFrameAverageLightLevel The new value of the field {@code max_frame_average_light_level}
     */
    public void maxFrameAverageLightLevel$set(short maxFrameAverageLightLevel) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_frame_average_light_level"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxFrameAverageLightLevel);
    }
    
    /**
     * Create a VideoContentLightLevel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoContentLightLevel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Parse {@code caps} and update {@code linfo}
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return {@code true} if {@code linfo} was successfully set to {@code caps}
     */
    public boolean addToCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_content_light_level_add_to_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Parse {@code caps} and update {@code linfo}
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return if {@code caps} has {@link VideoContentLightLevel} and could be parsed
     */
    public boolean fromCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_content_light_level_from_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Parse the value of content-light-level caps field and update {@code minfo}
     * with the parsed values.
     * @param level a content-light-level string from caps
     * @return {@code true} if {@code linfo} points to valid {@link VideoContentLightLevel}.
     */
    public boolean fromString(@NotNull java.lang.String level) {
        java.util.Objects.requireNonNull(level, "Parameter 'level' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_content_light_level_from_string.invokeExact(
                    handle(),
                    Interop.allocateNativeString(level));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Initialize {@code linfo}
     */
    public void init() {
        try {
            DowncallHandles.gst_video_content_light_level_init.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks equality between {@code linfo} and {@code other}.
     * @param other a {@link VideoContentLightLevel}
     * @return {@code true} if {@code linfo} and {@code other} are equal.
     */
    public boolean isEqual(@NotNull org.gstreamer.video.VideoContentLightLevel other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_content_light_level_is_equal.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Convert {@code linfo} to its string representation.
     * @return a string representation of {@code linfo}.
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_content_light_level_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_content_light_level_add_to_caps = Interop.downcallHandle(
            "gst_video_content_light_level_add_to_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_content_light_level_from_caps = Interop.downcallHandle(
            "gst_video_content_light_level_from_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_content_light_level_from_string = Interop.downcallHandle(
            "gst_video_content_light_level_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_content_light_level_init = Interop.downcallHandle(
            "gst_video_content_light_level_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_content_light_level_is_equal = Interop.downcallHandle(
            "gst_video_content_light_level_is_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_content_light_level_to_string = Interop.downcallHandle(
            "gst_video_content_light_level_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoContentLightLevel struct;
        
         /**
         * A {@link VideoContentLightLevel.Build} object constructs a {@link VideoContentLightLevel} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoContentLightLevel.allocate();
        }
        
         /**
         * Finish building the {@link VideoContentLightLevel} struct.
         * @return A new instance of {@code VideoContentLightLevel} with the fields 
         *         that were set in the Build object.
         */
        public VideoContentLightLevel construct() {
            return struct;
        }
        
        /**
         * the maximum content light level
         *   (abbreviated to MaxCLL) in candelas per square meter (cd/m^2 and nit)
         * @param maxContentLightLevel The value for the {@code maxContentLightLevel} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxContentLightLevel(short maxContentLightLevel) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max_content_light_level"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxContentLightLevel);
            return this;
        }
        
        /**
         * the maximum frame average light level
         *   (abbreviated to MaxFLL) in candelas per square meter (cd/m^2 and nit)
         * @param maxFrameAverageLightLevel The value for the {@code maxFrameAverageLightLevel} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxFrameAverageLightLevel(short maxFrameAverageLightLevel) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max_frame_average_light_level"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), maxFrameAverageLightLevel);
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
