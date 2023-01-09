package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible values of the {@link VideoInterlaceMode} describing the interlace
 * mode of the stream.
 */
public enum VideoInterlaceMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * all frames are progressive
     */
    PROGRESSIVE(0),
    
    /**
     * 2 fields are interleaved in one video
     *     frame. Extra buffer flags describe the field order.
     */
    INTERLEAVED(1),
    
    /**
     * frames contains both interlaced and
     *     progressive video, the buffer flags describe the frame and fields.
     */
    MIXED(2),
    
    /**
     * 2 fields are stored in one buffer, use the
     *     frame ID to get access to the required field. For multiview (the
     *     'views' property &gt; 1) the fields of view N can be found at frame ID
     *     (N * 2) and (N * 2) + 1.
     *     Each field has only half the amount of lines as noted in the
     *     height property. This mode requires multiple GstVideoMeta metadata
     *     to describe the fields.
     */
    FIELDS(3),
    
    /**
     * 1 field is stored in one buffer,
     *     {@code GST_VIDEO_BUFFER_FLAG_TF} or {@code GST_VIDEO_BUFFER_FLAG_BF} indicates if
     *     the buffer is carrying the top or bottom field, respectively. The top and
     *     bottom buffers must alternate in the pipeline, with this mode
     *     (Since: 1.16).
     */
    ALTERNATE(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoInterlaceMode";
    
    private final int value;
    
    /**
     * Create a new VideoInterlaceMode for the provided value
     * @param numeric value the enum value
     */
    VideoInterlaceMode(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new VideoInterlaceMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoInterlaceMode of(int value) {
        return switch (value) {
            case 0 -> PROGRESSIVE;
            case 1 -> INTERLEAVED;
            case 2 -> MIXED;
            case 3 -> FIELDS;
            case 4 -> ALTERNATE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Convert {@code mode} to a {@link VideoInterlaceMode}
     * @param mode a mode
     * @return the {@link VideoInterlaceMode} of {@code mode} or
     *    {@code GST_VIDEO_INTERLACE_MODE_PROGRESSIVE} when {@code mode} is not a valid
     *    string representation for a {@link VideoInterlaceMode}.
     */
    public static org.gstreamer.video.VideoInterlaceMode fromString(java.lang.String mode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_video_interlace_mode_from_string.invokeExact(Marshal.stringToAddress.marshal(mode, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.video.VideoInterlaceMode.of(RESULT);
        }
    }
    
    /**
     * Convert {@code mode} to its string representation.
     * @param mode a {@link VideoInterlaceMode}
     * @return {@code mode} as a string or NULL if {@code mode} in invalid.
     */
    public static java.lang.String toString(org.gstreamer.video.VideoInterlaceMode mode) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_interlace_mode_to_string.invokeExact(mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_interlace_mode_from_string = Interop.downcallHandle(
                "gst_video_interlace_mode_from_string",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_interlace_mode_to_string = Interop.downcallHandle(
                "gst_video_interlace_mode_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
}
