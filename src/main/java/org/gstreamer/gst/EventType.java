package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link EventType} lists the standard event types that can be sent in a pipeline.
 * <p>
 * The custom event types can be used for private messages between elements
 * that can't be expressed using normal
 * GStreamer buffer passing semantics. Custom events carry an arbitrary
 * {@link Structure}.
 * Specific custom events are distinguished by the name of the structure.
 */
public class EventType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstEventType";
    
    /**
     * unknown event.
     */
    public static final EventType UNKNOWN = new EventType(0);
    
    /**
     * Start a flush operation. This event clears all data
     *                 from the pipeline and unblock all streaming threads.
     */
    public static final EventType FLUSH_START = new EventType(2563);
    
    /**
     * Stop a flush operation. This event resets the
     *                 running-time of the pipeline.
     */
    public static final EventType FLUSH_STOP = new EventType(5127);
    
    /**
     * Event to mark the start of a new stream. Sent before any
     *                 other serialized event and only sent at the start of a new stream,
     *                 not after flushing seeks.
     */
    public static final EventType STREAM_START = new EventType(10254);
    
    /**
     * {@link Caps} event. Notify the pad of a new media type.
     */
    public static final EventType CAPS = new EventType(12814);
    
    /**
     * A new media segment follows in the dataflow. The
     *                 segment events contains information for clipping buffers and
     *                 converting buffer timestamps to running-time and
     *                 stream-time.
     */
    public static final EventType SEGMENT = new EventType(17934);
    
    /**
     * A new {@link StreamCollection} is available (Since: 1.10)
     */
    public static final EventType STREAM_COLLECTION = new EventType(19230);
    
    /**
     * A new set of metadata tags has been found in the stream.
     */
    public static final EventType TAG = new EventType(20510);
    
    /**
     * Notification of buffering requirements. Currently not
     *                 used yet.
     */
    public static final EventType BUFFERSIZE = new EventType(23054);
    
    /**
     * An event that sinks turn into a message. Used to
     *                          send messages that should be emitted in sync with
     *                          rendering.
     */
    public static final EventType SINK_MESSAGE = new EventType(25630);
    
    /**
     * Indicates that there is no more data for
     *                 the stream group ID in the message. Sent before EOS
     *                 in some instances and should be handled mostly the same. (Since: 1.10)
     */
    public static final EventType STREAM_GROUP_DONE = new EventType(26894);
    
    /**
     * End-Of-Stream. No more data is to be expected to follow
     *                 without either a STREAM_START event, or a FLUSH_STOP and a SEGMENT
     *                 event.
     */
    public static final EventType EOS = new EventType(28174);
    
    /**
     * An event which indicates that a new table of contents (TOC)
     *                 was found or updated.
     */
    public static final EventType TOC = new EventType(30750);
    
    /**
     * An event which indicates that new or updated
     *                 encryption information has been found in the stream.
     */
    public static final EventType PROTECTION = new EventType(33310);
    
    /**
     * Marks the end of a segment playback.
     */
    public static final EventType SEGMENT_DONE = new EventType(38406);
    
    /**
     * Marks a gap in the datastream.
     */
    public static final EventType GAP = new EventType(40966);
    
    /**
     * Notify downstream that a playback rate override
     *                                 should be applied as soon as possible. (Since: 1.18)
     */
    public static final EventType INSTANT_RATE_CHANGE = new EventType(46090);
    
    /**
     * A quality message. Used to indicate to upstream elements
     *                 that the downstream elements should adjust their processing
     *                 rate.
     */
    public static final EventType QOS = new EventType(48641);
    
    /**
     * A request for a new playback position and rate.
     */
    public static final EventType SEEK = new EventType(51201);
    
    /**
     * Navigation events are usually used for communicating
     *                        user requests, such as mouse or keyboard movements,
     *                        to upstream elements.
     */
    public static final EventType NAVIGATION = new EventType(53761);
    
    /**
     * Notification of new latency adjustment. Sinks will use
     *                     the latency information to adjust their synchronisation.
     */
    public static final EventType LATENCY = new EventType(56321);
    
    /**
     * A request for stepping through the media. Sinks will usually
     *                  execute the step operation.
     */
    public static final EventType STEP = new EventType(58881);
    
    /**
     * A request for upstream renegotiating caps and reconfiguring.
     */
    public static final EventType RECONFIGURE = new EventType(61441);
    
    /**
     * A request for a new playback position based on TOC
     *                        entry's UID.
     */
    public static final EventType TOC_SELECT = new EventType(64001);
    
    /**
     * A request to select one or more streams (Since: 1.10)
     */
    public static final EventType SELECT_STREAMS = new EventType(66561);
    
    /**
     * Sent by the pipeline to notify elements that handle the
     *                                    instant-rate-change event about the running-time when
     *                                    the rate multiplier should be applied (or was applied). (Since: 1.18)
     */
    public static final EventType INSTANT_RATE_SYNC_TIME = new EventType(66817);
    
    /**
     * Upstream custom event
     */
    public static final EventType CUSTOM_UPSTREAM = new EventType(69121);
    
    /**
     * Downstream custom event that travels in the
     *                        data flow.
     */
    public static final EventType CUSTOM_DOWNSTREAM = new EventType(71686);
    
    /**
     * Custom out-of-band downstream event.
     */
    public static final EventType CUSTOM_DOWNSTREAM_OOB = new EventType(74242);
    
    /**
     * Custom sticky downstream event.
     */
    public static final EventType CUSTOM_DOWNSTREAM_STICKY = new EventType(76830);
    
    /**
     * Custom upstream or downstream event.
     *                         In-band when travelling downstream.
     */
    public static final EventType CUSTOM_BOTH = new EventType(79367);
    
    /**
     * Custom upstream or downstream out-of-band event.
     */
    public static final EventType CUSTOM_BOTH_OOB = new EventType(81923);
    
    public EventType(int value) {
        super(value);
    }
    
    /**
     * Gets the {@link EventTypeFlags} associated with {@code type}.
     * @param type a {@link EventType}
     * @return a {@link EventTypeFlags}.
     */
    public static @NotNull org.gstreamer.gst.EventTypeFlags getFlags(@NotNull org.gstreamer.gst.EventType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_event_type_get_flags.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.EventTypeFlags(RESULT);
    }
    
    /**
     * Get a printable name for the given event type. Do not modify or free.
     * @param type the event type
     * @return a reference to the static name of the event.
     */
    public static @NotNull java.lang.String getName(@NotNull org.gstreamer.gst.EventType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_type_get_name.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the unique quark for the given event type.
     * @param type the event type
     * @return the quark associated with the event type
     */
    public static @NotNull org.gtk.glib.Quark toQuark(@NotNull org.gstreamer.gst.EventType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_event_type_to_quark.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_event_type_get_flags = Interop.downcallHandle(
            "gst_event_type_get_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_type_get_name = Interop.downcallHandle(
            "gst_event_type_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_type_to_quark = Interop.downcallHandle(
            "gst_event_type_to_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
