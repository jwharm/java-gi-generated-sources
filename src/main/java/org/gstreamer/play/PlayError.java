package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum PlayError implements io.github.jwharm.javagi.Enumeration {
    /**
     * generic error.
     */
    FAILED(0);
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayError";
    
    private final int value;
    PlayError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PlayError of(int value) {
        return switch (value) {
            case 0 -> FAILED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Gets a string representing the given error.
     * @param error a {@link PlayError}
     * @return a string with the given error.
     */
    public static @NotNull java.lang.String getName(@NotNull org.gstreamer.play.PlayError error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_error_get_name.invokeExact(
                    error.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_play_error_get_name = Interop.downcallHandle(
            "gst_play_error_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_play_error_quark = Interop.downcallHandle(
            "gst_play_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
