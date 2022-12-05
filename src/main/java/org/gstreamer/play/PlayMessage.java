package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum PlayMessage implements io.github.jwharm.javagi.Enumeration {
    /**
     * Source element was initalized for set URI
     */
    URI_LOADED(0),
    /**
     * Sink position changed
     */
    POSITION_UPDATED(1),
    /**
     * Duration of stream changed
     */
    DURATION_CHANGED(2),
    /**
     * State changed, see {@link PlayState}
     */
    STATE_CHANGED(3),
    /**
     * Pipeline is in buffering state, message contains the percentage value of the decoding buffer
     */
    BUFFERING(4),
    /**
     * Sink has received EOS
     */
    END_OF_STREAM(5),
    /**
     * Message contains an error
     */
    ERROR(6),
    /**
     * Message contains an error
     */
    WARNING(7),
    /**
     * Video sink received format in different dimensions than before
     */
    VIDEO_DIMENSIONS_CHANGED(8),
    /**
     * A media-info property has changed, message contains current {@link PlayMediaInfo}
     */
    MEDIA_INFO_UPDATED(9),
    /**
     * The volume of the audio ouput has changed
     */
    VOLUME_CHANGED(10),
    /**
     * Audio muting flag has been toggled
     */
    MUTE_CHANGED(11),
    /**
     * Any pending seeking operation has been completed
     */
    SEEK_DONE(12);
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayMessage";
    
    private final int value;
    PlayMessage(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PlayMessage of(int value) {
        return switch (value) {
            case 0 -> URI_LOADED;
            case 1 -> POSITION_UPDATED;
            case 2 -> DURATION_CHANGED;
            case 3 -> STATE_CHANGED;
            case 4 -> BUFFERING;
            case 5 -> END_OF_STREAM;
            case 6 -> ERROR;
            case 7 -> WARNING;
            case 8 -> VIDEO_DIMENSIONS_CHANGED;
            case 9 -> MEDIA_INFO_UPDATED;
            case 10 -> VOLUME_CHANGED;
            case 11 -> MUTE_CHANGED;
            case 12 -> SEEK_DONE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static @NotNull java.lang.String getName(@NotNull org.gstreamer.play.PlayMessage messageType) {
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
    public static void parseBufferingPercent(@NotNull org.gstreamer.gst.Message msg, Out<Integer> percent) {
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
    public static void parseDurationUpdated(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.gst.ClockTime> duration) {
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
    public static void parseError(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gtk.glib.Error> error, @Nullable Out<org.gstreamer.gst.Structure> details) {
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
    public static void parseMediaInfoUpdated(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.play.PlayMediaInfo> info) {
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
    public static void parseMutedChanged(@NotNull org.gstreamer.gst.Message msg, Out<Boolean> muted) {
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
    public static void parsePositionUpdated(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.gst.ClockTime> position) {
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
    public static void parseStateChanged(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.play.PlayState> state) {
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
    public static void parseType(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.play.PlayMessage> type) {
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
    public static void parseVideoDimensionsChanged(@NotNull org.gstreamer.gst.Message msg, Out<Integer> width, Out<Integer> height) {
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
    public static void parseVolumeChanged(@NotNull org.gstreamer.gst.Message msg, Out<Double> volume) {
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
    public static void parseWarning(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gtk.glib.Error> error, @Nullable Out<org.gstreamer.gst.Structure> details) {
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
    
    private static class DowncallHandles {
        
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
    }
}
