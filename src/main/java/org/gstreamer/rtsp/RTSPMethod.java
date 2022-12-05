package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different supported RTSP methods.
 */
public class RTSPMethod extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPMethod";
    
    /**
     * invalid method
     */
    public static final RTSPMethod INVALID = new RTSPMethod(0);
    
    /**
     * the DESCRIBE method
     */
    public static final RTSPMethod DESCRIBE = new RTSPMethod(1);
    
    /**
     * the ANNOUNCE method
     */
    public static final RTSPMethod ANNOUNCE = new RTSPMethod(2);
    
    /**
     * the GET_PARAMETER method
     */
    public static final RTSPMethod GET_PARAMETER = new RTSPMethod(4);
    
    /**
     * the OPTIONS method
     */
    public static final RTSPMethod OPTIONS = new RTSPMethod(8);
    
    /**
     * the PAUSE method
     */
    public static final RTSPMethod PAUSE = new RTSPMethod(16);
    
    /**
     * the PLAY method
     */
    public static final RTSPMethod PLAY = new RTSPMethod(32);
    
    /**
     * the RECORD method
     */
    public static final RTSPMethod RECORD = new RTSPMethod(64);
    
    /**
     * the REDIRECT method
     */
    public static final RTSPMethod REDIRECT = new RTSPMethod(128);
    
    /**
     * the SETUP method
     */
    public static final RTSPMethod SETUP = new RTSPMethod(256);
    
    /**
     * the SET_PARAMETER method
     */
    public static final RTSPMethod SET_PARAMETER = new RTSPMethod(512);
    
    /**
     * the TEARDOWN method
     */
    public static final RTSPMethod TEARDOWN = new RTSPMethod(1024);
    
    /**
     * the GET method (HTTP).
     */
    public static final RTSPMethod GET = new RTSPMethod(2048);
    
    /**
     * the POST method (HTTP).
     */
    public static final RTSPMethod POST = new RTSPMethod(4096);
    
    public RTSPMethod(int value) {
        super(value);
    }
    
    /**
     * Convert {@code method} to a string.
     * @param method a {@link RTSPMethod}
     * @return a string representation of {@code method}.
     */
    public static @NotNull java.lang.String asText(@NotNull org.gstreamer.rtsp.RTSPMethod method) {
        java.util.Objects.requireNonNull(method, "Parameter 'method' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_method_as_text.invokeExact(
                    method.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public RTSPMethod or(RTSPMethod mask) {
        return new RTSPMethod(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static RTSPMethod combined(RTSPMethod mask, RTSPMethod... masks) {
        int value = mask.getValue();        for (RTSPMethod arg : masks) {
            value |= arg.getValue();
        }
        return new RTSPMethod(value);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtsp_method_as_text = Interop.downcallHandle(
            "gst_rtsp_method_as_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
