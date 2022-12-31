package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum PlayerState implements io.github.jwharm.javagi.Enumeration {
    /**
     * the player is stopped.
     */
    STOPPED(0),
    /**
     * the player is buffering.
     */
    BUFFERING(1),
    /**
     * the player is paused.
     */
    PAUSED(2),
    /**
     * the player is currently playing a
     * stream.
     */
    PLAYING(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerState";
    
    private final int value;
    PlayerState(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PlayerState of(int value) {
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
     * @param state a {@link PlayerState}
     * @return a string with the name of the state.
     */
    public static java.lang.String getName(org.gstreamer.player.PlayerState state) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_state_get_name.invokeExact(
                    state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_player_state_get_name = Interop.downcallHandle(
            "gst_player_state_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
