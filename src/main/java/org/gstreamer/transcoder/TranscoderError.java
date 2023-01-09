package org.gstreamer.transcoder;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum TranscoderError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * generic error.
     */
    FAILED(0);
    
    private static final java.lang.String C_TYPE_NAME = "GstTranscoderError";
    
    private final int value;
    
    /**
     * Create a new TranscoderError for the provided value
     * @param numeric value the enum value
     */
    TranscoderError(int value) {
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
     * Create a new TranscoderError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TranscoderError of(int value) {
        return switch (value) {
            case 0 -> FAILED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Gets a string representing the given error.
     * @param error a {@link TranscoderError}
     * @return a string with the given error.
     */
    public static java.lang.String getName(org.gstreamer.transcoder.TranscoderError error) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_error_get_name.invokeExact(error.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_transcoder_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_transcoder_error_get_name = Interop.downcallHandle(
                "gst_transcoder_error_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_transcoder_error_quark = Interop.downcallHandle(
                "gst_transcoder_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
}
