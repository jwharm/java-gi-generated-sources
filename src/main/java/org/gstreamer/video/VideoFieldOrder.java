package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Field order of interlaced content. This is only valid for
 * interlace-mode=interleaved and not interlace-mode=mixed. In the case of
 * mixed or GST_VIDEO_FIELD_ORDER_UNKOWN, the field order is signalled via
 * buffer flags.
 * @version 1.12
 */
public enum VideoFieldOrder implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * unknown field order for interlaced content.
     *     The actual field order is signalled via buffer flags.
     */
    UNKNOWN(0),
    
    /**
     * top field is first
     */
    TOP_FIELD_FIRST(1),
    
    /**
     * bottom field is first
     */
    BOTTOM_FIELD_FIRST(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoFieldOrder";
    
    private final int value;
    
    /**
     * Create a new VideoFieldOrder for the provided value
     * @param numeric value the enum value
     */
    VideoFieldOrder(int value) {
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
     * Create a new VideoFieldOrder for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoFieldOrder of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> TOP_FIELD_FIRST;
            case 2 -> BOTTOM_FIELD_FIRST;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Convert {@code order} to a {@link VideoFieldOrder}
     * @param order a field order
     * @return the {@link VideoFieldOrder} of {@code order} or
     *    {@code GST_VIDEO_FIELD_ORDER_UNKNOWN} when {@code order} is not a valid
     *    string representation for a {@link VideoFieldOrder}.
     */
    public static org.gstreamer.video.VideoFieldOrder fromString(java.lang.String order) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_video_field_order_from_string.invokeExact(Marshal.stringToAddress.marshal(order, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.video.VideoFieldOrder.of(RESULT);
        }
    }
    
    /**
     * Convert {@code order} to its string representation.
     * @param order a {@link VideoFieldOrder}
     * @return {@code order} as a string or NULL if {@code order} in invalid.
     */
    public static java.lang.String toString(org.gstreamer.video.VideoFieldOrder order) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_field_order_to_string.invokeExact(order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_field_order_from_string = Interop.downcallHandle(
                "gst_video_field_order_from_string",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_field_order_to_string = Interop.downcallHandle(
                "gst_video_field_order_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
}
