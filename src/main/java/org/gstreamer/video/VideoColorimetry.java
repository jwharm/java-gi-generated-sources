package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure describing the color info.
 */
public class VideoColorimetry extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoColorimetry";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("range"),
        Interop.valueLayout.C_INT.withName("matrix"),
        Interop.valueLayout.C_INT.withName("transfer"),
        Interop.valueLayout.C_INT.withName("primaries")
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
     * Allocate a new {@link VideoColorimetry}
     * @return A new, uninitialized @{link VideoColorimetry}
     */
    public static VideoColorimetry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoColorimetry newInstance = new VideoColorimetry(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code range}
     * @return The value of the field {@code range}
     */
    public org.gstreamer.video.VideoColorRange range$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("range"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoColorRange.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code range}
     * @param range The new value of the field {@code range}
     */
    public void range$set(org.gstreamer.video.VideoColorRange range) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("range"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), range.getValue());
    }
    
    /**
     * Get the value of the field {@code matrix}
     * @return The value of the field {@code matrix}
     */
    public org.gstreamer.video.VideoColorMatrix matrix$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("matrix"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoColorMatrix.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code matrix}
     * @param matrix The new value of the field {@code matrix}
     */
    public void matrix$set(org.gstreamer.video.VideoColorMatrix matrix) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("matrix"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), matrix.getValue());
    }
    
    /**
     * Get the value of the field {@code transfer}
     * @return The value of the field {@code transfer}
     */
    public org.gstreamer.video.VideoTransferFunction transfer$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transfer"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoTransferFunction.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code transfer}
     * @param transfer The new value of the field {@code transfer}
     */
    public void transfer$set(org.gstreamer.video.VideoTransferFunction transfer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transfer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), transfer.getValue());
    }
    
    /**
     * Get the value of the field {@code primaries}
     * @return The value of the field {@code primaries}
     */
    public org.gstreamer.video.VideoColorPrimaries primaries$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("primaries"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoColorPrimaries.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code primaries}
     * @param primaries The new value of the field {@code primaries}
     */
    public void primaries$set(org.gstreamer.video.VideoColorPrimaries primaries) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("primaries"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), primaries.getValue());
    }
    
    /**
     * Create a VideoColorimetry proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoColorimetry(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Parse the colorimetry string and update {@code cinfo} with the parsed
     * values.
     * @param color a colorimetry string
     * @return {@code true} if {@code color} points to valid colorimetry info.
     */
    public boolean fromString(@NotNull java.lang.String color) {
        java.util.Objects.requireNonNull(color, "Parameter 'color' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_colorimetry_from_string.invokeExact(
                    handle(),
                    Interop.allocateNativeString(color));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Compare the 2 colorimetry sets for equality
     * @param other another {@link VideoColorimetry}
     * @return {@code true} if {@code cinfo} and {@code other} are equal.
     */
    public boolean isEqual(@NotNull org.gstreamer.video.VideoColorimetry other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_colorimetry_is_equal.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if the colorimetry information in {@code info} matches that of the
     * string {@code color}.
     * @param color a colorimetry string
     * @return {@code true} if {@code color} conveys the same colorimetry info as the color
     * information in {@code info}.
     */
    public boolean matches(@NotNull java.lang.String color) {
        java.util.Objects.requireNonNull(color, "Parameter 'color' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_colorimetry_matches.invokeExact(
                    handle(),
                    Interop.allocateNativeString(color));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Make a string representation of {@code cinfo}.
     * @return a string representation of {@code cinfo}
     * or {@code null} if all the entries of {@code cinfo} are unknown values.
     */
    public @Nullable java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_colorimetry_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_colorimetry_from_string = Interop.downcallHandle(
            "gst_video_colorimetry_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_colorimetry_is_equal = Interop.downcallHandle(
            "gst_video_colorimetry_is_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_colorimetry_matches = Interop.downcallHandle(
            "gst_video_colorimetry_matches",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_colorimetry_to_string = Interop.downcallHandle(
            "gst_video_colorimetry_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoColorimetry struct;
        
         /**
         * A {@link VideoColorimetry.Build} object constructs a {@link VideoColorimetry} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoColorimetry.allocate();
        }
        
         /**
         * Finish building the {@link VideoColorimetry} struct.
         * @return A new instance of {@code VideoColorimetry} with the fields 
         *         that were set in the Build object.
         */
        public VideoColorimetry construct() {
            return struct;
        }
        
        /**
         * the color range. This is the valid range for the samples.
         *         It is used to convert the samples to Y'PbPr values.
         * @param range The value for the {@code range} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRange(org.gstreamer.video.VideoColorRange range) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("range"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (range == null ? MemoryAddress.NULL : range.getValue()));
            return this;
        }
        
        /**
         * the color matrix. Used to convert between Y'PbPr and
         *          non-linear RGB (R'G'B')
         * @param matrix The value for the {@code matrix} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMatrix(org.gstreamer.video.VideoColorMatrix matrix) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("matrix"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (matrix == null ? MemoryAddress.NULL : matrix.getValue()));
            return this;
        }
        
        /**
         * the transfer function. used to convert between R'G'B' and RGB
         * @param transfer The value for the {@code transfer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransfer(org.gstreamer.video.VideoTransferFunction transfer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transfer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transfer == null ? MemoryAddress.NULL : transfer.getValue()));
            return this;
        }
        
        /**
         * color primaries. used to convert between R'G'B' and CIE XYZ
         * @param primaries The value for the {@code primaries} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrimaries(org.gstreamer.video.VideoColorPrimaries primaries) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("primaries"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (primaries == null ? MemoryAddress.NULL : primaries.getValue()));
            return this;
        }
    }
}
