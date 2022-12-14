package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstPlayer namespace.
 */
public final class GstPlayer {
    
    static {
        LibLoad.loadLibrary("gstplayer-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}

/**
 * Gets a string representing the given color balance type.
 * @param type a {@link PlayerColorBalanceType}
 * @return a string with the name of the color
 *   balance type.
 */
public static java.lang.String playerColorBalanceTypeGetName(org.gstreamer.player.PlayerColorBalanceType type) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_player_color_balance_type_get_name.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Gets a string representing the given error.
 * @param error a {@link PlayerError}
 * @return a string with the given error.
 */
public static java.lang.String playerErrorGetName(org.gstreamer.player.PlayerError error) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_player_error_get_name.invokeExact(error.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

public static org.gtk.glib.Quark playerErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_player_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Gets a string representing the given state.
 * @param state a {@link PlayerState}
 * @return a string with the name of the state.
 */
public static java.lang.String playerStateGetName(org.gstreamer.player.PlayerState state) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_player_state_get_name.invokeExact(state.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}
    
    private static class DowncallHandles {

private static final MethodHandle gst_player_color_balance_type_get_name = Interop.downcallHandle(
        "gst_player_color_balance_type_get_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_player_error_get_name = Interop.downcallHandle(
        "gst_player_error_get_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_player_error_quark = Interop.downcallHandle(
        "gst_player_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_player_state_get_name = Interop.downcallHandle(
        "gst_player_state_get_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
    
    private static void registerTypes() {
        if (Player.isAvailable()) Interop.register(Player.getType(), Player.fromAddress);
        if (PlayerAudioInfo.isAvailable()) Interop.register(PlayerAudioInfo.getType(), PlayerAudioInfo.fromAddress);
        if (PlayerGMainContextSignalDispatcher.isAvailable()) Interop.register(PlayerGMainContextSignalDispatcher.getType(), PlayerGMainContextSignalDispatcher.fromAddress);
        if (PlayerMediaInfo.isAvailable()) Interop.register(PlayerMediaInfo.getType(), PlayerMediaInfo.fromAddress);
        if (PlayerStreamInfo.isAvailable()) Interop.register(PlayerStreamInfo.getType(), PlayerStreamInfo.fromAddress);
        if (PlayerSubtitleInfo.isAvailable()) Interop.register(PlayerSubtitleInfo.getType(), PlayerSubtitleInfo.fromAddress);
        if (PlayerVideoInfo.isAvailable()) Interop.register(PlayerVideoInfo.getType(), PlayerVideoInfo.fromAddress);
        if (PlayerVideoOverlayVideoRenderer.isAvailable()) Interop.register(PlayerVideoOverlayVideoRenderer.getType(), PlayerVideoOverlayVideoRenderer.fromAddress);
        if (PlayerSignalDispatcher.isAvailable()) Interop.register(PlayerSignalDispatcher.getType(), PlayerSignalDispatcher.fromAddress);
        if (PlayerVideoRenderer.isAvailable()) Interop.register(PlayerVideoRenderer.getType(), PlayerVideoRenderer.fromAddress);
    }
}
