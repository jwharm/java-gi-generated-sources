package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum PlayState implements io.github.jwharm.javagi.Enumeration {
    /**
     * the play is stopped.
     */
    STOPPED(0),
    /**
     * the play is buffering.
     */
    BUFFERING(1),
    /**
     * the play is paused.
     */
    PAUSED(2),
    /**
     * the play is currently playing a
     * stream.
     */
    PLAYING(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayState";
    
    private final int value;
    PlayState(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PlayState of(int value) {
        return switch (value) {
            case 0 -> STOPPED;
            case 1 -> BUFFERING;
            case 2 -> PAUSED;
            case 3 -> PLAYING;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Gets a string representing the given state.
     * @param state a {@link PlayState}
     * @return a string with the name of the state.
     */
    public static @NotNull java.lang.String getName(@NotNull org.gstreamer.play.PlayState state) {
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_state_get_name.invokeExact(
                    state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_play_state_get_name = Interop.downcallHandle(
            "gst_play_state_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
