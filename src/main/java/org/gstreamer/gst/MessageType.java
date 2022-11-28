package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different message types that are available.
 */
public class MessageType extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstMessageType";
    
    /**
     * an undefined message
     */
    public static final MessageType UNKNOWN = new MessageType(0);
    
    /**
     * end-of-stream reached in a pipeline. The application will
     * only receive this message in the PLAYING state and every time it sets a
     * pipeline to PLAYING that is in the EOS state. The application can perform a
     * flushing seek in the pipeline, which will undo the EOS state again.
     */
    public static final MessageType EOS = new MessageType(1);
    
    /**
     * an error occurred. When the application receives an error
     * message it should stop playback of the pipeline and not assume that more
     * data will be played. It is possible to specify a redirection url to the error
     * messages by setting a {@code redirect-location} field into the error message, application
     * or high level bins might use the information as required.
     */
    public static final MessageType ERROR = new MessageType(2);
    
    /**
     * a warning occurred.
     */
    public static final MessageType WARNING = new MessageType(4);
    
    /**
     * an info message occurred
     */
    public static final MessageType INFO = new MessageType(8);
    
    /**
     * a tag was found.
     */
    public static final MessageType TAG = new MessageType(16);
    
    /**
     * the pipeline is buffering. When the application
     * receives a buffering message in the PLAYING state for a non-live pipeline it
     * must PAUSE the pipeline until the buffering completes, when the percentage
     * field in the message is 100%. For live pipelines, no action must be
     * performed and the buffering percentage can be used to inform the user about
     * the progress.
     */
    public static final MessageType BUFFERING = new MessageType(32);
    
    /**
     * a state change happened
     */
    public static final MessageType STATE_CHANGED = new MessageType(64);
    
    /**
     * an element changed state in a streaming thread.
     * This message is deprecated.
     */
    public static final MessageType STATE_DIRTY = new MessageType(128);
    
    /**
     * a stepping operation finished.
     */
    public static final MessageType STEP_DONE = new MessageType(256);
    
    /**
     * an element notifies its capability of providing
     *                             a clock. This message is used internally and
     *                             never forwarded to the application.
     */
    public static final MessageType CLOCK_PROVIDE = new MessageType(512);
    
    /**
     * The current clock as selected by the pipeline became
     *                          unusable. The pipeline will select a new clock on
     *                          the next PLAYING state change. The application
     *                          should set the pipeline to PAUSED and back to
     *                          PLAYING when this message is received.
     */
    public static final MessageType CLOCK_LOST = new MessageType(1024);
    
    /**
     * a new clock was selected in the pipeline.
     */
    public static final MessageType NEW_CLOCK = new MessageType(2048);
    
    /**
     * the structure of the pipeline changed. This
     * message is used internally and never forwarded to the application.
     */
    public static final MessageType STRUCTURE_CHANGE = new MessageType(4096);
    
    /**
     * status about a stream, emitted when it starts,
     *                             stops, errors, etc..
     */
    public static final MessageType STREAM_STATUS = new MessageType(8192);
    
    /**
     * message posted by the application, possibly
     *                           via an application-specific element.
     */
    public static final MessageType APPLICATION = new MessageType(16384);
    
    /**
     * element-specific message, see the specific element's
     *                       documentation
     */
    public static final MessageType ELEMENT = new MessageType(32768);
    
    /**
     * pipeline started playback of a segment. This
     * message is used internally and never forwarded to the application.
     */
    public static final MessageType SEGMENT_START = new MessageType(65536);
    
    /**
     * pipeline completed playback of a segment. This
     * message is forwarded to the application after all elements that posted
     * {@code GST_MESSAGE_SEGMENT_START} posted a GST_MESSAGE_SEGMENT_DONE message.
     */
    public static final MessageType SEGMENT_DONE = new MessageType(131072);
    
    /**
     * The duration of a pipeline changed. The
     * application can get the new duration with a duration query.
     */
    public static final MessageType DURATION_CHANGED = new MessageType(262144);
    
    /**
     * Posted by elements when their latency changes. The
     * application should recalculate and distribute a new latency.
     */
    public static final MessageType LATENCY = new MessageType(524288);
    
    /**
     * Posted by elements when they start an ASYNC
     * {@link StateChange}. This message is not forwarded to the application but is used
     * internally.
     */
    public static final MessageType ASYNC_START = new MessageType(1048576);
    
    /**
     * Posted by elements when they complete an ASYNC
     * {@link StateChange}. The application will only receive this message from the toplevel
     * pipeline.
     */
    public static final MessageType ASYNC_DONE = new MessageType(2097152);
    
    /**
     * Posted by elements when they want the pipeline to
     * change state. This message is a suggestion to the application which can
     * decide to perform the state change on (part of) the pipeline.
     */
    public static final MessageType REQUEST_STATE = new MessageType(4194304);
    
    /**
     * A stepping operation was started.
     */
    public static final MessageType STEP_START = new MessageType(8388608);
    
    /**
     * A buffer was dropped or an element changed its processing
     * strategy for Quality of Service reasons.
     */
    public static final MessageType QOS = new MessageType(16777216);
    
    /**
     * A progress message.
     */
    public static final MessageType PROGRESS = new MessageType(33554432);
    
    /**
     * A new table of contents (TOC) was found or previously found TOC
     * was updated.
     */
    public static final MessageType TOC = new MessageType(67108864);
    
    /**
     * Message to request resetting the pipeline's
     *     running time from the pipeline. This is an internal message which
     *     applications will likely never receive.
     */
    public static final MessageType RESET_TIME = new MessageType(134217728);
    
    /**
     * Message indicating start of a new stream. Useful
     *     e.g. when using playbin in gapless playback mode, to get notified when
     *     the next title actually starts playing (which will be some time after
     *     the URI for the next title has been set).
     */
    public static final MessageType STREAM_START = new MessageType(268435456);
    
    /**
     * Message indicating that an element wants a specific context (Since: 1.2)
     */
    public static final MessageType NEED_CONTEXT = new MessageType(536870912);
    
    /**
     * Message indicating that an element created a context (Since: 1.2)
     */
    public static final MessageType HAVE_CONTEXT = new MessageType(1073741824);
    
    /**
     * Message is an extended message type (see below).
     *     These extended message IDs can't be used directly with mask-based API
     *     like gst_bus_poll() or gst_bus_timed_pop_filtered(), but you can still
     *     filter for GST_MESSAGE_EXTENDED and then check the result for the
     *     specific type. (Since: 1.4)
     */
    public static final MessageType EXTENDED = new MessageType(-2147483648);
    
    /**
     * Message indicating a {@link Device} was added to
     *     a {@link DeviceProvider} (Since: 1.4)
     */
    public static final MessageType DEVICE_ADDED = new MessageType(-2147483647);
    
    /**
     * Message indicating a {@link Device} was removed
     *     from a {@link DeviceProvider} (Since: 1.4)
     */
    public static final MessageType DEVICE_REMOVED = new MessageType(-2147483646);
    
    /**
     * Message indicating a {@link org.gtk.gobject.Object} property has
     *     changed (Since: 1.10)
     */
    public static final MessageType PROPERTY_NOTIFY = new MessageType(-2147483645);
    
    /**
     * Message indicating a new {@link StreamCollection}
     *     is available (Since: 1.10)
     */
    public static final MessageType STREAM_COLLECTION = new MessageType(-2147483644);
    
    /**
     * Message indicating the active selection of
     *     {@code GstStreams} has changed (Since: 1.10)
     */
    public static final MessageType STREAMS_SELECTED = new MessageType(-2147483643);
    
    /**
     * Message indicating to request the application to
     *     try to play the given URL(s). Useful if for example a HTTP 302/303
     *     response is received with a non-HTTP URL inside. (Since: 1.10)
     */
    public static final MessageType REDIRECT = new MessageType(-2147483642);
    
    /**
     * Message indicating a {@link Device} was changed
     *     a {@link DeviceProvider} (Since: 1.16)
     */
    public static final MessageType DEVICE_CHANGED = new MessageType(-2147483641);
    
    /**
     * Message sent by elements to request the
     *     running time from the pipeline when an instant rate change should
     *     be applied (which may be in the past when the answer arrives). (Since: 1.18)
     */
    public static final MessageType INSTANT_RATE_REQUEST = new MessageType(-2147483640);
    
    /**
     * mask for all of the above messages.
     */
    public static final MessageType ANY = new MessageType(-1);
    
    public MessageType(int value) {
        super(value);
    }
    
    /**
     * Get a printable name for the given message type. Do not modify or free.
     * @param type the message type
     * @return a reference to the static name of the message.
     */
    public static @NotNull java.lang.String getName(@NotNull org.gstreamer.gst.MessageType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_message_type_get_name.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the unique quark for the given message type.
     * @param type the message type
     * @return the quark associated with the message type
     */
    public static @NotNull org.gtk.glib.Quark toQuark(@NotNull org.gstreamer.gst.MessageType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_message_type_to_quark.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public MessageType combined(MessageType mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static MessageType combined(MessageType mask, MessageType... masks) {
        for (MessageType arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_message_type_get_name = Interop.downcallHandle(
            "gst_message_type_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_message_type_to_quark = Interop.downcallHandle(
            "gst_message_type_to_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
