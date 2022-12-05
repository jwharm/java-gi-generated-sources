package org.gstreamer.transcoder;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstTranscoder namespace.
 */
public final class GstTranscoder {
    
    static {
        System.loadLibrary("gsttranscoder-1.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    /**
     * Gets a string representing the given error.
     * @param error a {@link TranscoderError}
     * @return a string with the given error.
     */
    public static @NotNull java.lang.String transcoderErrorGetName(@NotNull org.gstreamer.transcoder.TranscoderError error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_error_get_name.invokeExact(
                    error.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public static @NotNull org.gtk.glib.Quark transcoderErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_transcoder_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Returns (transfer none): The message name
     * @param message a {@link TranscoderMessage}
     */
    public static @NotNull java.lang.String transcoderMessageGetName(@NotNull org.gstreamer.transcoder.TranscoderMessage message) {
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
    public static void transcoderMessageParseDuration(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.gst.ClockTime> duration) {
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
    public static void transcoderMessageParseError(@NotNull org.gstreamer.gst.Message msg, @NotNull org.gtk.glib.Error error, @NotNull Out<org.gstreamer.gst.Structure> details) {
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
    public static void transcoderMessageParsePosition(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.gst.ClockTime> position) {
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
    public static void transcoderMessageParseState(@NotNull org.gstreamer.gst.Message msg, @NotNull Out<org.gstreamer.transcoder.TranscoderState> state) {
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
    public static void transcoderMessageParseWarning(@NotNull org.gstreamer.gst.Message msg, @NotNull org.gtk.glib.Error error, @NotNull Out<org.gstreamer.gst.Structure> details) {
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
    
    /**
     * Gets a string representing the given state.
     * @param state a {@link TranscoderState}
     * @return a string with the name of the state.
     */
    public static @NotNull java.lang.String transcoderStateGetName(@NotNull org.gstreamer.transcoder.TranscoderState state) {
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
        
        private static final MethodHandle gst_transcoder_error_get_name = Interop.downcallHandle(
            "gst_transcoder_error_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_transcoder_error_quark = Interop.downcallHandle(
            "gst_transcoder_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
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
        
        private static final MethodHandle gst_transcoder_state_get_name = Interop.downcallHandle(
            "gst_transcoder_state_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
