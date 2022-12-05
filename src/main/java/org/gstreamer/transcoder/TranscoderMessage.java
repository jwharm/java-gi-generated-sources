package org.gstreamer.transcoder;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Types of messages that will be posted on the transcoder API bus.
 * <p>
 * See also {@code gst_transcoder_get_message_bus}()
 * @version 1.20
 */
public enum TranscoderMessage implements io.github.jwharm.javagi.Enumeration {
    /**
     * Sink position changed
     */
    POSITION_UPDATED(0),
    /**
     * Duration of stream changed
     */
    DURATION_CHANGED(1),
    /**
     * Pipeline state changed
     */
    STATE_CHANGED(2),
    /**
     * Transcoding is done
     */
    DONE(3),
    /**
     * Message contains an error
     */
    ERROR(4),
    /**
     * Message contains an error
     */
    WARNING(5);
    
    private static final java.lang.String C_TYPE_NAME = "GstTranscoderMessage";
    
    private final int value;
    TranscoderMessage(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TranscoderMessage of(int value) {
        return switch (value) {
            case 0 -> POSITION_UPDATED;
            case 1 -> DURATION_CHANGED;
            case 2 -> STATE_CHANGED;
            case 3 -> DONE;
            case 4 -> ERROR;
            case 5 -> WARNING;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Returns (transfer none): The message name
     * @param message a {@link TranscoderMessage}
     */
    public static @NotNull java.lang.String getName(@NotNull org.gstreamer.transcoder.TranscoderMessage message) {
        java.util.Objects.requireNonNull(message, "Parameter 'message' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_message_get_name.invokeExact(
                    message.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Parse the given duration {@code msg} and extract the corresponding {@link org.gstreamer.gst.ClockTime}
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param duration the resulting duration
     */
    public static void parseDuration(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.gst.ClockTime> duration) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(duration, "Parameter 'duration' must not be null");
        MemorySegment durationPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_transcoder_message_parse_duration.invokeExact(
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
     * @param details (transfer none): A GstStructure containing extra details about the error
     */
    public static void parseError(@NotNull org.gstreamer.gst.Message msg, @NotNull org.gtk.glib.Error error, @NotNull Out<org.gstreamer.gst.Structure> details) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        java.util.Objects.requireNonNull(details, "Parameter 'details' must not be null");
        MemorySegment detailsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_transcoder_message_parse_error.invokeExact(
                    msg.handle(),
                    error.handle(),
                    (Addressable) detailsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        details.set(new org.gstreamer.gst.Structure(detailsPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Parse the given position {@code msg} and extract the corresponding {@link org.gstreamer.gst.ClockTime}
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param position the resulting position
     */
    public static void parsePosition(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.gst.ClockTime> position) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_transcoder_message_parse_position.invokeExact(
                    msg.handle(),
                    (Addressable) positionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        position.set(new org.gstreamer.gst.ClockTime(positionPOINTER.get(Interop.valueLayout.C_LONG, 0)));
    }
    
    /**
     * Parse the given state {@code msg} and extract the corresponding {@link TranscoderState}
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param state the resulting state
     */
    public static void parseState(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.transcoder.TranscoderState> state) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        MemorySegment statePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_transcoder_message_parse_state.invokeExact(
                    msg.handle(),
                    (Addressable) statePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        state.set(org.gstreamer.transcoder.TranscoderState.of(statePOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Parse the given error {@code msg} and extract the corresponding {@link org.gtk.glib.Error} warning
     * @param msg A {@link org.gstreamer.gst.Message}
     * @param error the resulting warning
     * @param details (transfer none): A GstStructure containing extra details about the warning
     */
    public static void parseWarning(@NotNull org.gstreamer.gst.Message msg, @NotNull org.gtk.glib.Error error, @NotNull Out<org.gstreamer.gst.Structure> details) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        java.util.Objects.requireNonNull(details, "Parameter 'details' must not be null");
        MemorySegment detailsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_transcoder_message_parse_warning.invokeExact(
                    msg.handle(),
                    error.handle(),
                    (Addressable) detailsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        details.set(new org.gstreamer.gst.Structure(detailsPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_transcoder_message_get_name = Interop.downcallHandle(
            "gst_transcoder_message_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_transcoder_message_parse_duration = Interop.downcallHandle(
            "gst_transcoder_message_parse_duration",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_message_parse_error = Interop.downcallHandle(
            "gst_transcoder_message_parse_error",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_message_parse_position = Interop.downcallHandle(
            "gst_transcoder_message_parse_position",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_message_parse_state = Interop.downcallHandle(
            "gst_transcoder_message_parse_state",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_transcoder_message_parse_warning = Interop.downcallHandle(
            "gst_transcoder_message_parse_warning",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
