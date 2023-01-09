package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The supported RTSP versions.
 */
public enum RTSPVersion implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * unknown/invalid version
     */
    INVALID(0),
    
    /**
     * version 1.0
     */
    _1_0(16),
    
    /**
     * version 1.1.
     */
    _1_1(17),
    
    /**
     * version 2.0.
     */
    _2_0(32);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPVersion";
    
    private final int value;
    
    /**
     * Create a new RTSPVersion for the provided value
     * @param numeric value the enum value
     */
    RTSPVersion(int value) {
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
     * Create a new RTSPVersion for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RTSPVersion of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 16 -> _1_0;
            case 17 -> _1_1;
            case 32 -> _2_0;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Convert {@code version} to a string.
     * @param version a {@link RTSPVersion}
     * @return a string representation of {@code version}.
     */
    public static java.lang.String asText(org.gstreamer.rtsp.RTSPVersion version) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_version_as_text.invokeExact(version.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtsp_version_as_text = Interop.downcallHandle(
                "gst_rtsp_version_as_text",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
}
