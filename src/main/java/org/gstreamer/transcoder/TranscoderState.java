package org.gstreamer.transcoder;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * High level representation of the transcoder pipeline state.
 * @version 1.20
 */
public enum TranscoderState implements io.github.jwharm.javagi.Enumeration {
    /**
     * the transcoder is stopped.
     */
    STOPPED(0),
    /**
     * the transcoder is paused.
     */
    PAUSED(1),
    /**
     * the transcoder is currently transcoding a
     * stream.
     */
    PLAYING(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstTranscoderState";
    
    private final int value;
    TranscoderState(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TranscoderState of(int value) {
        return switch (value) {
            case 0 -> STOPPED;
            case 1 -> PAUSED;
            case 2 -> PLAYING;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Gets a string representing the given state.
     * @param state a {@link TranscoderState}
     * @return a string with the name of the state.
     */
    public static @NotNull java.lang.String getName(@NotNull org.gstreamer.transcoder.TranscoderState state) {
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_state_get_name.invokeExact(
                    state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_transcoder_state_get_name = Interop.downcallHandle(
            "gst_transcoder_state_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
