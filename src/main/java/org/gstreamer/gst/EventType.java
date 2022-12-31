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
public enum EventType implements io.github.jwharm.javagi.Enumeration {
    /**
     * unknown event.
     */
    UNKNOWN(0),
    /**
     * Start a flush operation. This event clears all data
     *                 from the pipeline and unblock all streaming threads.
     */
    FLUSH_START(2563),
    /**
     * Stop a flush operation. This event resets the
     *                 running-time of the pipeline.
     */
    FLUSH_STOP(5127),
    /**
     * Event to mark the start of a new stream. Sent before any
     *                 other serialized event and only sent at the start of a new stream,
     *                 not after flushing seeks.
     */
    STREAM_START(10254),
    /**
     * {@link Caps} event. Notify the pad of a new media type.
     */
    CAPS(12814),
    /**
     * A new media segment follows in the dataflow. The
     *                 segment events contains information for clipping buffers and
     *                 converting buffer timestamps to running-time and
     *                 stream-time.
     */
    SEGMENT(17934),
    /**
     * A new {@link StreamCollection} is available (Since: 1.10)
     */
    STREAM_COLLECTION(19230),
    /**
     * A new set of metadata tags has been found in the stream.
     */
    TAG(20510),
    /**
     * Notification of buffering requirements. Currently not
     *                 used yet.
     */
    BUFFERSIZE(23054),
    /**
     * An event that sinks turn into a message. Used to
     *                          send messages that should be emitted in sync with
     *                          rendering.
     */
    SINK_MESSAGE(25630),
    /**
     * Indicates that there is no more data for
     *                 the stream group ID in the message. Sent before EOS
     *                 in some instances and should be handled mostly the same. (Since: 1.10)
     */
    STREAM_GROUP_DONE(26894),
    /**
     * End-Of-Stream. No more data is to be expected to follow
     *                 without either a STREAM_START event, or a FLUSH_STOP and a SEGMENT
     *                 event.
     */
    EOS(28174),
    /**
     * An event which indicates that a new table of contents (TOC)
     *                 was found or updated.
     */
    TOC(30750),
    /**
     * An event which indicates that new or updated
     *                 encryption information has been found in the stream.
     */
    PROTECTION(33310),
    /**
     * Marks the end of a segment playback.
     */
    SEGMENT_DONE(38406),
    /**
     * Marks a gap in the datastream.
     */
    GAP(40966),
    /**
     * Notify downstream that a playback rate override
     *                                 should be applied as soon as possible. (Since: 1.18)
     */
    INSTANT_RATE_CHANGE(46090),
    /**
     * A quality message. Used to indicate to upstream elements
     *                 that the downstream elements should adjust their processing
     *                 rate.
     */
    QOS(48641),
    /**
     * A request for a new playback position and rate.
     */
    SEEK(51201),
    /**
     * Navigation events are usually used for communicating
     *                        user requests, such as mouse or keyboard movements,
     *                        to upstream elements.
     */
    NAVIGATION(53761),
    /**
     * Notification of new latency adjustment. Sinks will use
     *                     the latency information to adjust their synchronisation.
     */
    LATENCY(56321),
    /**
     * A request for stepping through the media. Sinks will usually
     *                  execute the step operation.
     */
    STEP(58881),
    /**
     * A request for upstream renegotiating caps and reconfiguring.
     */
    RECONFIGURE(61441),
    /**
     * A request for a new playback position based on TOC
     *                        entry's UID.
     */
    TOC_SELECT(64001),
    /**
     * A request to select one or more streams (Since: 1.10)
     */
    SELECT_STREAMS(66561),
    /**
     * Sent by the pipeline to notify elements that handle the
     *                                    instant-rate-change event about the running-time when
     *                                    the rate multiplier should be applied (or was applied). (Since: 1.18)
     */
    INSTANT_RATE_SYNC_TIME(66817),
    /**
     * Upstream custom event
     */
    CUSTOM_UPSTREAM(69121),
    /**
     * Downstream custom event that travels in the
     *                        data flow.
     */
    CUSTOM_DOWNSTREAM(71686),
    /**
     * Custom out-of-band downstream event.
     */
    CUSTOM_DOWNSTREAM_OOB(74242),
    /**
     * Custom sticky downstream event.
     */
    CUSTOM_DOWNSTREAM_STICKY(76830),
    /**
     * Custom upstream or downstream event.
     *                         In-band when travelling downstream.
     */
    CUSTOM_BOTH(79367),
    /**
     * Custom upstream or downstream out-of-band event.
     */
    CUSTOM_BOTH_OOB(81923);
    
    private static final java.lang.String C_TYPE_NAME = "GstEventType";
    
    private final int value;
    EventType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static EventType of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 2563 -> FLUSH_START;
            case 5127 -> FLUSH_STOP;
            case 10254 -> STREAM_START;
            case 12814 -> CAPS;
            case 17934 -> SEGMENT;
            case 19230 -> STREAM_COLLECTION;
            case 20510 -> TAG;
            case 23054 -> BUFFERSIZE;
            case 25630 -> SINK_MESSAGE;
            case 26894 -> STREAM_GROUP_DONE;
            case 28174 -> EOS;
            case 30750 -> TOC;
            case 33310 -> PROTECTION;
            case 38406 -> SEGMENT_DONE;
            case 40966 -> GAP;
            case 46090 -> INSTANT_RATE_CHANGE;
            case 48641 -> QOS;
            case 51201 -> SEEK;
            case 53761 -> NAVIGATION;
            case 56321 -> LATENCY;
            case 58881 -> STEP;
            case 61441 -> RECONFIGURE;
            case 64001 -> TOC_SELECT;
            case 66561 -> SELECT_STREAMS;
            case 66817 -> INSTANT_RATE_SYNC_TIME;
            case 69121 -> CUSTOM_UPSTREAM;
            case 71686 -> CUSTOM_DOWNSTREAM;
            case 74242 -> CUSTOM_DOWNSTREAM_OOB;
            case 76830 -> CUSTOM_DOWNSTREAM_STICKY;
            case 79367 -> CUSTOM_BOTH;
            case 81923 -> CUSTOM_BOTH_OOB;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Gets the {@link EventTypeFlags} associated with {@code type}.
     * @param type a {@link EventType}
     * @return a {@link EventTypeFlags}.
     */
    public static org.gstreamer.gst.EventTypeFlags getFlags(org.gstreamer.gst.EventType type) {
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
    public static java.lang.String getName(org.gstreamer.gst.EventType type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_type_get_name.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the unique quark for the given event type.
     * @param type the event type
     * @return the quark associated with the event type
     */
    public static org.gtk.glib.Quark toQuark(org.gstreamer.gst.EventType type) {
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
