package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Possible color range values. These constants are defined for 8 bit color
 * values and can be scaled for other bit depths.
 */
public enum VideoColorRange implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * unknown range
     */
    UNKNOWN(0),
    
    /**
     * [0..255] for 8 bit components
     */
    _0_255(1),
    
    /**
     * [16..235] for 8 bit components. Chroma has
     *                 [16..240] range.
     */
    _16_235(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoColorRange";
    
    private final int value;
    
    /**
     * Create a new VideoColorRange for the provided value
     * @param numeric value the enum value
     */
    VideoColorRange(int value) {
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
     * Create a new VideoColorRange for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoColorRange of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> _0_255;
            case 2 -> _16_235;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Compute the offset and scale values for each component of {@code info}. For each
     * component, (c[i] - offset[i]) / scale[i] will scale the component c[i] to the
     * range [0.0 .. 1.0].
     * <p>
     * The reverse operation (c[i] * scale[i]) + offset[i] can be used to convert
     * the component values in range [0.0 .. 1.0] back to their representation in
     * {@code info} and {@code range}.
     * @param range a {@link VideoColorRange}
     * @param info a {@link VideoFormatInfo}
     * @param offset output offsets
     * @param scale output scale
     */
    public static void offsets(org.gstreamer.video.VideoColorRange range, org.gstreamer.video.VideoFormatInfo info, Out<int[]> offset, Out<int[]> scale) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment offsetPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment scalePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_video_color_range_offsets.invokeExact(
                        range.getValue(),
                        info.handle(),
                        (Addressable) offsetPOINTER.address(),
                        (Addressable) scalePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            offset.set(MemorySegment.ofAddress(offsetPOINTER.get(Interop.valueLayout.ADDRESS, 0), 4 * Interop.valueLayout.C_INT.byteSize(), SCOPE).toArray(Interop.valueLayout.C_INT));
            scale.set(MemorySegment.ofAddress(scalePOINTER.get(Interop.valueLayout.ADDRESS, 0), 4 * Interop.valueLayout.C_INT.byteSize(), SCOPE).toArray(Interop.valueLayout.C_INT));
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_color_range_offsets = Interop.downcallHandle(
                "gst_video_color_range_offsets",
                FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
