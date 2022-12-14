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
    
    /**
     * Create a new PlayState for the provided value
     * @param numeric value the enum value
     */
    PlayState(int value) {
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
     * Create a new PlayState for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
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
    public static java.lang.String getName(org.gstreamer.play.PlayState state) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_state_get_name.invokeExact(state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_play_state_get_name = Interop.downcallHandle(
                "gst_play_state_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
}
