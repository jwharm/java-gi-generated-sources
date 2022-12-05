package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstPlay namespace.
 */
public final class GstPlay {
    
    static {
        System.loadLibrary("gstplay-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    /**
     * Gets a string representing the given color balance type.
     * @param type a {@link PlayColorBalanceType}
     * @return a string with the name of the color
     *   balance type.
     */
    public static @NotNull java.lang.String playColorBalanceTypeGetName(@NotNull org.gstreamer.play.PlayColorBalanceType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_color_balance_type_get_name.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets a string representing the given error.
     * @param error a {@link PlayError}
     * @return a string with the given error.
     */
    public static @NotNull java.lang.String playErrorGetName(@NotNull org.gstreamer.play.PlayError error) {
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
    
    public static @NotNull org.gtk.glib.Quark playErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    public static @NotNull java.lang.String playMessageGetName(@NotNull org.gstreamer.play.PlayMessage messageType) {
        java.util.Objects.requireNonNull(messageType, "Parameter 'messageType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_message_get_name.invokeExact(
                    messageType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Parse the given buffering-percent {@code msg} and extract the corresponding value
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param percent the resulting buffering percent
     */
    public static void playMessageParseBufferingPercent(@NotNull org.gstreamer.gst.Message msg, Out<Integer> percent) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(percent, "Parameter 'percent' must not be null");
        MemorySegment percentPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_play_message_parse_buffering_percent.invokeExact(
                    msg.handle(),
                    (Addressable) percentPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        percent.set(percentPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Parse the given duration {@code msg} and extract the corresponding {@link org.gstreamer.gst.ClockTime}
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param duration the resulting duration
     */
    public static void playMessageParseDurationUpdated(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.gst.ClockTime> duration) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(duration, "Parameter 'duration' must not be null");
        MemorySegment durationPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_play_message_parse_duration_updated.invokeExact(
                    msg.handle(),
                    (Addressable) durationPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        duration.set(new org.gstreamer.gst.ClockTime(durationPOINTER.get(Interop.valueLayout.C_LONG, 0)));
    }
    
    /**
     * Parse the given error {@code msg} and extract the corresponding {@link org.gtk.glib.Error}
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param error the resulting error
     * @param details A {@link org.gstreamer.gst.Structure} containing additional details about the error
     */
    public static void playMessageParseError(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gtk.glib.Error> error, @Nullable Out<org.gstreamer.gst.Structure> details) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        MemorySegment errorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment detailsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_play_message_parse_error.invokeExact(
                    msg.handle(),
                    (Addressable) errorPOINTER.address(),
                    (Addressable) (details == null ? MemoryAddress.NULL : (Addressable) detailsPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        error.set(new org.gtk.glib.Error(errorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        if (details != null) details.set(new org.gstreamer.gst.Structure(detailsPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Parse the given {@code msg} and extract the corresponding media information
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param info the resulting media info
     */
    public static void playMessageParseMediaInfoUpdated(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.play.PlayMediaInfo> info) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        MemorySegment infoPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_play_message_parse_media_info_updated.invokeExact(
                    msg.handle(),
                    (Addressable) infoPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        info.set(new org.gstreamer.play.PlayMediaInfo(infoPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Parse the given {@code msg} and extract the corresponding audio muted state
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param muted the resulting audio muted state
     */
    public static void playMessageParseMutedChanged(@NotNull org.gstreamer.gst.Message msg, Out<Boolean> muted) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(muted, "Parameter 'muted' must not be null");
        MemorySegment mutedPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_play_message_parse_muted_changed.invokeExact(
                    msg.handle(),
                    (Addressable) mutedPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        muted.set(mutedPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
    }
    
    /**
     * Parse the given position {@code msg} and extract the corresponding {@link org.gstreamer.gst.ClockTime}
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param position the resulting position
     */
    public static void playMessageParsePositionUpdated(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.gst.ClockTime> position) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_play_message_parse_position_updated.invokeExact(
                    msg.handle(),
                    (Addressable) positionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        position.set(new org.gstreamer.gst.ClockTime(positionPOINTER.get(Interop.valueLayout.C_LONG, 0)));
    }
    
    /**
     * Parse the given state {@code msg} and extract the corresponding {@link PlayState}
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param state the resulting play state
     */
    public static void playMessageParseStateChanged(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.play.PlayState> state) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        MemorySegment statePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_play_message_parse_state_changed.invokeExact(
                    msg.handle(),
                    (Addressable) statePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        state.set(org.gstreamer.play.PlayState.of(statePOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Parse the given {@code msg} and extract its {@link PlayMessage} type.
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param type the resulting message type
     */
    public static void playMessageParseType(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.play.PlayMessage> type) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemorySegment typePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_play_message_parse_type.invokeExact(
                    msg.handle(),
                    (Addressable) typePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        type.set(org.gstreamer.play.PlayMessage.of(typePOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Parse the given {@code msg} and extract the corresponding video dimensions
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param width the resulting video width
     * @param height the resulting video height
     */
    public static void playMessageParseVideoDimensionsChanged(@NotNull org.gstreamer.gst.Message msg, Out<Integer> width, Out<Integer> height) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(width, "Parameter 'width' must not be null");
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_play_message_parse_video_dimensions_changed.invokeExact(
                    msg.handle(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Parse the given {@code msg} and extract the corresponding audio volume
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param volume the resulting audio volume
     */
    public static void playMessageParseVolumeChanged(@NotNull org.gstreamer.gst.Message msg, Out<Double> volume) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(volume, "Parameter 'volume' must not be null");
        MemorySegment volumePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        try {
            DowncallHandles.gst_play_message_parse_volume_changed.invokeExact(
                    msg.handle(),
                    (Addressable) volumePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        volume.set(volumePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
    }
    
    /**
     * Parse the given error {@code msg} and extract the corresponding {@link org.gtk.glib.Error} warning
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param error the resulting warning
     * @param details A {@link org.gstreamer.gst.Structure} containing additional details about the warning
     */
    public static void playMessageParseWarning(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gtk.glib.Error> error, @Nullable Out<org.gstreamer.gst.Structure> details) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        MemorySegment errorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment detailsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_play_message_parse_warning.invokeExact(
                    msg.handle(),
                    (Addressable) errorPOINTER.address(),
                    (Addressable) (details == null ? MemoryAddress.NULL : (Addressable) detailsPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        error.set(new org.gtk.glib.Error(errorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        if (details != null) details.set(new org.gstreamer.gst.Structure(detailsPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Gets a string representing the given state.
     * @param state a {@link PlayState}
     * @return a string with the name of the state.
     */
    public static @NotNull java.lang.String playStateGetName(@NotNull org.gstreamer.play.PlayState state) {
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
        
        private static final MethodHandle gst_play_color_balance_type_get_name = Interop.downcallHandle(
            "gst_play_color_balance_type_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
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
        
        private static final MethodHandle gst_play_message_get_name = Interop.downcallHandle(
            "gst_play_message_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_play_message_parse_buffering_percent = Interop.downcallHandle(
            "gst_play_message_parse_buffering_percent",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_message_parse_duration_updated = Interop.downcallHandle(
            "gst_play_message_parse_duration_updated",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_message_parse_error = Interop.downcallHandle(
            "gst_play_message_parse_error",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_message_parse_media_info_updated = Interop.downcallHandle(
            "gst_play_message_parse_media_info_updated",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_message_parse_muted_changed = Interop.downcallHandle(
            "gst_play_message_parse_muted_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_play_message_parse_position_updated = Interop.downcallHandle(
            "gst_play_message_parse_position_updated",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_message_parse_state_changed = Interop.downcallHandle(
            "gst_play_message_parse_state_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_play_message_parse_type = Interop.downcallHandle(
            "gst_play_message_parse_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_play_message_parse_video_dimensions_changed = Interop.downcallHandle(
            "gst_play_message_parse_video_dimensions_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_message_parse_volume_changed = Interop.downcallHandle(
            "gst_play_message_parse_volume_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_message_parse_warning = Interop.downcallHandle(
            "gst_play_message_parse_warning",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_state_get_name = Interop.downcallHandle(
            "gst_play_state_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
