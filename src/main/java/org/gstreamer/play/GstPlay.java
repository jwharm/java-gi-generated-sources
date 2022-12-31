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
    
    private static boolean javagi$initialized = false;
    
    @ApiStatus.Internal
    public static void javagi$ensureInitialized() {
        if (!javagi$initialized) {
            javagi$initialized = true;
            JavaGITypeRegister.register();
        }
    }
    
    /**
     * Gets a string representing the given color balance type.
     * @param type a {@link PlayColorBalanceType}
     * @return a string with the name of the color
     *   balance type.
     */
    public static java.lang.String playColorBalanceTypeGetName(org.gstreamer.play.PlayColorBalanceType type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_color_balance_type_get_name.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets a string representing the given error.
     * @param error a {@link PlayError}
     * @return a string with the given error.
     */
    public static java.lang.String playErrorGetName(org.gstreamer.play.PlayError error) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_error_get_name.invokeExact(
                    error.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public static org.gtk.glib.Quark playErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_play_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    public static java.lang.String playMessageGetName(org.gstreamer.play.PlayMessage messageType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_message_get_name.invokeExact(
                    messageType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Parse the given buffering-percent {@code msg} and extract the corresponding value
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param percent the resulting buffering percent
     */
    public static void playMessageParseBufferingPercent(org.gstreamer.gst.Message msg, Out<Integer> percent) {
        MemorySegment percentPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_play_message_parse_buffering_percent.invokeExact(
                    msg.handle(),
                    (Addressable) (percent == null ? MemoryAddress.NULL : (Addressable) percentPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (percent != null) percent.set(percentPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Parse the given duration {@code msg} and extract the corresponding {@link org.gstreamer.gst.ClockTime}
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param duration the resulting duration
     */
    public static void playMessageParseDurationUpdated(org.gstreamer.gst.Message msg, @Nullable org.gstreamer.gst.ClockTime duration) {
        MemorySegment durationPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_play_message_parse_duration_updated.invokeExact(
                    msg.handle(),
                    (Addressable) (duration == null ? MemoryAddress.NULL : (Addressable) durationPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (duration != null) duration.setValue(durationPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Parse the given error {@code msg} and extract the corresponding {@link org.gtk.glib.Error}
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param error the resulting error
     * @param details A {@link org.gstreamer.gst.Structure} containing additional details about the error
     */
    public static void playMessageParseError(org.gstreamer.gst.Message msg, @Nullable Out<org.gtk.glib.Error> error, @Nullable Out<org.gstreamer.gst.Structure> details) {
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
        error.set(org.gtk.glib.Error.fromAddress.marshal(errorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        if (details != null) details.set(org.gstreamer.gst.Structure.fromAddress.marshal(detailsPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Parse the given {@code msg} and extract the corresponding media information
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param info the resulting media info
     */
    public static void playMessageParseMediaInfoUpdated(org.gstreamer.gst.Message msg, @Nullable Out<org.gstreamer.play.PlayMediaInfo> info) {
        MemorySegment infoPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_play_message_parse_media_info_updated.invokeExact(
                    msg.handle(),
                    (Addressable) (info == null ? MemoryAddress.NULL : (Addressable) infoPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (info != null) info.set((org.gstreamer.play.PlayMediaInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(infoPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gstreamer.play.PlayMediaInfo.fromAddress).marshal(infoPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Parse the given {@code msg} and extract the corresponding audio muted state
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param muted the resulting audio muted state
     */
    public static void playMessageParseMutedChanged(org.gstreamer.gst.Message msg, Out<Boolean> muted) {
        MemorySegment mutedPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_play_message_parse_muted_changed.invokeExact(
                    msg.handle(),
                    (Addressable) (muted == null ? MemoryAddress.NULL : (Addressable) mutedPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (muted != null) muted.set(mutedPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
    }
    
    /**
     * Parse the given position {@code msg} and extract the corresponding {@link org.gstreamer.gst.ClockTime}
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param position the resulting position
     */
    public static void playMessageParsePositionUpdated(org.gstreamer.gst.Message msg, @Nullable org.gstreamer.gst.ClockTime position) {
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_play_message_parse_position_updated.invokeExact(
                    msg.handle(),
                    (Addressable) (position == null ? MemoryAddress.NULL : (Addressable) positionPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (position != null) position.setValue(positionPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Parse the given state {@code msg} and extract the corresponding {@link PlayState}
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param state the resulting play state
     */
    public static void playMessageParseStateChanged(org.gstreamer.gst.Message msg, @Nullable Out<org.gstreamer.play.PlayState> state) {
        MemorySegment statePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_play_message_parse_state_changed.invokeExact(
                    msg.handle(),
                    (Addressable) (state == null ? MemoryAddress.NULL : (Addressable) statePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (state != null) state.set(org.gstreamer.play.PlayState.of(statePOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Parse the given {@code msg} and extract its {@link PlayMessage} type.
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param type the resulting message type
     */
    public static void playMessageParseType(org.gstreamer.gst.Message msg, @Nullable Out<org.gstreamer.play.PlayMessage> type) {
        MemorySegment typePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_play_message_parse_type.invokeExact(
                    msg.handle(),
                    (Addressable) (type == null ? MemoryAddress.NULL : (Addressable) typePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (type != null) type.set(org.gstreamer.play.PlayMessage.of(typePOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Parse the given {@code msg} and extract the corresponding video dimensions
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param width the resulting video width
     * @param height the resulting video height
     */
    public static void playMessageParseVideoDimensionsChanged(org.gstreamer.gst.Message msg, Out<Integer> width, Out<Integer> height) {
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_play_message_parse_video_dimensions_changed.invokeExact(
                    msg.handle(),
                    (Addressable) (width == null ? MemoryAddress.NULL : (Addressable) widthPOINTER.address()),
                    (Addressable) (height == null ? MemoryAddress.NULL : (Addressable) heightPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (width != null) width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (height != null) height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Parse the given {@code msg} and extract the corresponding audio volume
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param volume the resulting audio volume
     */
    public static void playMessageParseVolumeChanged(org.gstreamer.gst.Message msg, Out<Double> volume) {
        MemorySegment volumePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        try {
            DowncallHandles.gst_play_message_parse_volume_changed.invokeExact(
                    msg.handle(),
                    (Addressable) (volume == null ? MemoryAddress.NULL : (Addressable) volumePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (volume != null) volume.set(volumePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
    }
    
    /**
     * Parse the given error {@code msg} and extract the corresponding {@link org.gtk.glib.Error} warning
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param error the resulting warning
     * @param details A {@link org.gstreamer.gst.Structure} containing additional details about the warning
     */
    public static void playMessageParseWarning(org.gstreamer.gst.Message msg, @Nullable Out<org.gtk.glib.Error> error, @Nullable Out<org.gstreamer.gst.Structure> details) {
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
        error.set(org.gtk.glib.Error.fromAddress.marshal(errorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        if (details != null) details.set(org.gstreamer.gst.Structure.fromAddress.marshal(detailsPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Gets a string representing the given state.
     * @param state a {@link PlayState}
     * @return a string with the name of the state.
     */
    public static java.lang.String playStateGetName(org.gstreamer.play.PlayState state) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_state_get_name.invokeExact(
                    state.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
