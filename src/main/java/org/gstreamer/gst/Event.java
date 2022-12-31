package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The event class provides factory methods to construct events for sending
 * and functions to query (parse) received events.
 * <p>
 * Events are usually created with gst_event_new_*() which takes event-type
 * specific parameters as arguments.
 * To send an event application will usually use gst_element_send_event() and
 * elements will use gst_pad_send_event() or gst_pad_push_event().
 * The event should be unreffed with gst_event_unref() if it has not been sent.
 * <p>
 * Events that have been received can be parsed with their respective
 * gst_event_parse_*() functions. It is valid to pass {@code null} for unwanted details.
 * <p>
 * Events are passed between elements in parallel to the data stream. Some events
 * are serialized with buffers, others are not. Some events only travel downstream,
 * others only upstream. Some events can travel both upstream and downstream.
 * <p>
 * The events are used to signal special conditions in the datastream such as
 * EOS (end of stream) or the start of a new stream-segment.
 * Events are also used to flush the pipeline of any pending data.
 * <p>
 * Most of the event API is used inside plugins. Applications usually only
 * construct and use seek events.
 * To do that gst_event_new_seek() is used to create a seek event. It takes
 * the needed parameters to specify seeking time and mode.
 * <pre>{@code <!-- language="C" -->
 *   GstEvent *event;
 *   gboolean result;
 *   ...
 *   // construct a seek event to play the media from second 2 to 5, flush
 *   // the pipeline to decrease latency.
 *   event = gst_event_new_seek (1.0,
 *      GST_FORMAT_TIME,
 *      GST_SEEK_FLAG_FLUSH,
 *      GST_SEEK_TYPE_SET, 2 * GST_SECOND,
 *      GST_SEEK_TYPE_SET, 5 * GST_SECOND);
 *   ...
 *   result = gst_element_send_event (pipeline, event);
 *   if (!result)
 *     g_warning ("seek failed");
 *   ...
 * }</pre>
 */
public class Event extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstEvent";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.MiniObject.getMemoryLayout().withName("mini_object"),
            Interop.valueLayout.C_INT.withName("type"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("timestamp"),
            Interop.valueLayout.C_INT.withName("seqnum")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Event}
     * @return A new, uninitialized @{link Event}
     */
    public static Event allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Event newInstance = new Event(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code mini_object}
     * @return The value of the field {@code mini_object}
     */
    public org.gstreamer.gst.MiniObject getMiniObject() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mini_object"));
        return org.gstreamer.gst.MiniObject.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code mini_object}
     * @param miniObject The new value of the field {@code mini_object}
     */
    public void setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.gst.EventType getType() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.EventType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gstreamer.gst.EventType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
    }
    
    /**
     * Get the value of the field {@code timestamp}
     * @return The value of the field {@code timestamp}
     */
    public long getTimestamp() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code timestamp}
     * @param timestamp The new value of the field {@code timestamp}
     */
    public void setTimestamp(long timestamp) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), timestamp);
    }
    
    /**
     * Get the value of the field {@code seqnum}
     * @return The value of the field {@code seqnum}
     */
    public int getSeqnum_() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seqnum"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code seqnum}
     * @param seqnum The new value of the field {@code seqnum}
     */
    public void setSeqnum_(int seqnum) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seqnum"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), seqnum);
    }
    
    /**
     * Create a Event proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Event(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Event> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Event(input, ownership);
    
    private static MemoryAddress constructNewBufferSize(org.gstreamer.gst.Format format, long minsize, long maxsize, boolean async) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_buffer_size.invokeExact(
                    format.getValue(),
                    minsize,
                    maxsize,
                    Marshal.booleanToInteger.marshal(async, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new buffersize event. The event is sent downstream and notifies
     * elements that they should provide a buffer of the specified dimensions.
     * <p>
     * When the {@code async} flag is set, a thread boundary is preferred.
     * @param format buffer format
     * @param minsize minimum buffer size
     * @param maxsize maximum buffer size
     * @param async thread behavior
     * @return a new {@link Event}
     */
    public static Event newBufferSize(org.gstreamer.gst.Format format, long minsize, long maxsize, boolean async) {
        var RESULT = constructNewBufferSize(format, minsize, maxsize, async);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewCaps(org.gstreamer.gst.Caps caps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_caps.invokeExact(
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new CAPS event for {@code caps}. The caps event can only travel downstream
     * synchronized with the buffer flow and contains the format of the buffers
     * that will follow after the event.
     * @param caps a {@link Caps}
     * @return the new CAPS event.
     */
    public static Event newCaps(org.gstreamer.gst.Caps caps) {
        var RESULT = constructNewCaps(caps);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewCustom(org.gstreamer.gst.EventType type, org.gstreamer.gst.Structure structure) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_custom.invokeExact(
                    type.getValue(),
                    structure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        structure.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Create a new custom-typed event. This can be used for anything not
     * handled by other event-specific functions to pass an event to another
     * element.
     * <p>
     * Make sure to allocate an event type with the {@code GST_EVENT_MAKE_TYPE} macro,
     * assigning a free number and filling in the correct direction and
     * serialization flags.
     * <p>
     * New custom events can also be created by subclassing the event type if
     * needed.
     * @param type The type of the new event
     * @param structure the structure for the event. The event will
     *     take ownership of the structure.
     * @return the new custom event.
     */
    public static Event newCustom(org.gstreamer.gst.EventType type, org.gstreamer.gst.Structure structure) {
        var RESULT = constructNewCustom(type, structure);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewEos() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_eos.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new EOS event. The eos event can only travel downstream
     * synchronized with the buffer flow. Elements that receive the EOS
     * event on a pad can return {@code GST_FLOW_EOS} as a {@link FlowReturn}
     * when data after the EOS event arrives.
     * <p>
     * The EOS event will travel down to the sink elements in the pipeline
     * which will then post the {@code GST_MESSAGE_EOS} on the bus after they have
     * finished playing any buffered data.
     * <p>
     * When all sinks have posted an EOS message, an EOS message is
     * forwarded to the application.
     * <p>
     * The EOS event itself will not cause any state transitions of the pipeline.
     * @return the new EOS event.
     */
    public static Event newEos() {
        var RESULT = constructNewEos();
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFlushStart() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_flush_start.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocate a new flush start event. The flush start event can be sent
     * upstream and downstream and travels out-of-bounds with the dataflow.
     * <p>
     * It marks pads as being flushing and will make them return
     * {@code GST_FLOW_FLUSHING} when used for data flow with gst_pad_push(),
     * gst_pad_chain(), gst_pad_get_range() and gst_pad_pull_range().
     * Any event (except a {@code GST_EVENT_FLUSH_STOP}) received
     * on a flushing pad will return {@code false} immediately.
     * <p>
     * Elements should unlock any blocking functions and exit their streaming
     * functions as fast as possible when this event is received.
     * <p>
     * This event is typically generated after a seek to flush out all queued data
     * in the pipeline so that the new media is played as soon as possible.
     * @return a new flush start event.
     */
    public static Event newFlushStart() {
        var RESULT = constructNewFlushStart();
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFlushStop(boolean resetTime) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_flush_stop.invokeExact(
                    Marshal.booleanToInteger.marshal(resetTime, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocate a new flush stop event. The flush stop event can be sent
     * upstream and downstream and travels serialized with the dataflow.
     * It is typically sent after sending a FLUSH_START event to make the
     * pads accept data again.
     * <p>
     * Elements can process this event synchronized with the dataflow since
     * the preceding FLUSH_START event stopped the dataflow.
     * <p>
     * This event is typically generated to complete a seek and to resume
     * dataflow.
     * @param resetTime if time should be reset
     * @return a new flush stop event.
     */
    public static Event newFlushStop(boolean resetTime) {
        var RESULT = constructNewFlushStop(resetTime);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewGap(org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime duration) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_gap.invokeExact(
                    timestamp.getValue().longValue(),
                    duration.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new GAP event. A gap event can be thought of as conceptually
     * equivalent to a buffer to signal that there is no data for a certain
     * amount of time. This is useful to signal a gap to downstream elements
     * which may wait for data, such as muxers or mixers or overlays, especially
     * for sparse streams such as subtitle streams.
     * @param timestamp the start time (pts) of the gap
     * @param duration the duration of the gap
     * @return the new GAP event.
     */
    public static Event newGap(org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime duration) {
        var RESULT = constructNewGap(timestamp, duration);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewInstantRateChange(double rateMultiplier, org.gstreamer.gst.SegmentFlags newFlags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_instant_rate_change.invokeExact(
                    rateMultiplier,
                    newFlags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new instant-rate-change event. This event is sent by seek
     * handlers (e.g. demuxers) when receiving a seek with the
     * {@link SeekFlags#INSTANT_RATE_CHANGE} and signals to downstream elements that
     * the playback rate in the existing segment should be immediately multiplied
     * by the {@code rate_multiplier} factor.
     * <p>
     * The flags provided replace any flags in the existing segment, for the
     * flags within the {@code GST_SEGMENT_INSTANT_FLAGS} set. Other GstSegmentFlags
     * are ignored and not transferred in the event.
     * @param rateMultiplier the multiplier to be applied to the playback rate
     * @param newFlags A new subset of segment flags to replace in segments
     * @return the new instant-rate-change event.
     */
    public static Event newInstantRateChange(double rateMultiplier, org.gstreamer.gst.SegmentFlags newFlags) {
        var RESULT = constructNewInstantRateChange(rateMultiplier, newFlags);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewInstantRateSyncTime(double rateMultiplier, org.gstreamer.gst.ClockTime runningTime, org.gstreamer.gst.ClockTime upstreamRunningTime) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_instant_rate_sync_time.invokeExact(
                    rateMultiplier,
                    runningTime.getValue().longValue(),
                    upstreamRunningTime.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new instant-rate-sync-time event. This event is sent by the
     * pipeline to notify elements handling the instant-rate-change event about
     * the running-time when the new rate should be applied. The running time
     * may be in the past when elements handle this event, which can lead to
     * switching artifacts. The magnitude of those depends on the exact timing
     * of event delivery to each element and the magnitude of the change in
     * playback rate being applied.
     * <p>
     * The {@code running_time} and {@code upstream_running_time} are the same if this
     * is the first instant-rate adjustment, but will differ for later ones
     * to compensate for the accumulated offset due to playing at a rate
     * different to the one indicated in the playback segments.
     * @param rateMultiplier the new playback rate multiplier to be applied
     * @param runningTime Running time when the rate change should be applied
     * @param upstreamRunningTime The upstream-centric running-time when the
     *    rate change should be applied.
     * @return the new instant-rate-sync-time event.
     */
    public static Event newInstantRateSyncTime(double rateMultiplier, org.gstreamer.gst.ClockTime runningTime, org.gstreamer.gst.ClockTime upstreamRunningTime) {
        var RESULT = constructNewInstantRateSyncTime(rateMultiplier, runningTime, upstreamRunningTime);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewLatency(org.gstreamer.gst.ClockTime latency) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_latency.invokeExact(
                    latency.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new latency event. The event is sent upstream from the sinks and
     * notifies elements that they should add an additional {@code latency} to the
     * running time before synchronising against the clock.
     * <p>
     * The latency is mostly used in live sinks and is always expressed in
     * the time format.
     * @param latency the new latency value
     * @return a new {@link Event}
     */
    public static Event newLatency(org.gstreamer.gst.ClockTime latency) {
        var RESULT = constructNewLatency(latency);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewNavigation(org.gstreamer.gst.Structure structure) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_navigation.invokeExact(
                    structure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        structure.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Create a new navigation event from the given description.
     * @param structure description of the event. The event will take
     *     ownership of the structure.
     * @return a new {@link Event}
     */
    public static Event newNavigation(org.gstreamer.gst.Structure structure) {
        var RESULT = constructNewNavigation(structure);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewProtection(java.lang.String systemId, org.gstreamer.gst.Buffer data, java.lang.String origin) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_protection.invokeExact(
                    Marshal.stringToAddress.marshal(systemId, null),
                    data.handle(),
                    Marshal.stringToAddress.marshal(origin, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new event containing information specific to a particular
     * protection system (uniquely identified by {@code system_id}), by which that
     * protection system can acquire key(s) to decrypt a protected stream.
     * <p>
     * In order for a decryption element to decrypt media
     * protected using a specific system, it first needs all the
     * protection system specific information necessary to acquire the decryption
     * key(s) for that stream. The functions defined here enable this information
     * to be passed in events from elements that extract it
     * (e.g., ISOBMFF demuxers, MPEG DASH demuxers) to protection decrypter
     * elements that use it.
     * <p>
     * Events containing protection system specific information are created using
     * {@code gst_event_new_protection}, and they can be parsed by downstream elements
     * using {@code gst_event_parse_protection}.
     * <p>
     * In Common Encryption, protection system specific information may be located
     * within ISOBMFF files, both in movie (moov) boxes and movie fragment (moof)
     * boxes; it may also be contained in ContentProtection elements within MPEG
     * DASH MPDs. The events created by {@code gst_event_new_protection} contain data
     * identifying from which of these locations the encapsulated protection system
     * specific information originated. This origin information is required as
     * some protection systems use different encodings depending upon where the
     * information originates.
     * <p>
     * The events returned by gst_event_new_protection() are implemented
     * in such a way as to ensure that the most recently-pushed protection info
     * event of a particular {@code origin} and {@code system_id} will
     * be stuck to the output pad of the sending element.
     * @param systemId a string holding a UUID that uniquely
     * identifies a protection system.
     * @param data a {@link Buffer} holding protection system specific
     * information. The reference count of the buffer will be incremented by one.
     * @param origin a string indicating where the protection
     * information carried in the event was extracted from. The allowed values
     * of this string will depend upon the protection scheme.
     * @return a {@code GST_EVENT_PROTECTION} event, if successful; {@code null}
     * if unsuccessful.
     */
    public static Event newProtection(java.lang.String systemId, org.gstreamer.gst.Buffer data, java.lang.String origin) {
        var RESULT = constructNewProtection(systemId, data, origin);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewQos(org.gstreamer.gst.QOSType type, double proportion, org.gstreamer.gst.ClockTimeDiff diff, org.gstreamer.gst.ClockTime timestamp) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_qos.invokeExact(
                    type.getValue(),
                    proportion,
                    diff.getValue().longValue(),
                    timestamp.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocate a new qos event with the given values.
     * The QOS event is generated in an element that wants an upstream
     * element to either reduce or increase its rate because of
     * high/low CPU load or other resource usage such as network performance or
     * throttling. Typically sinks generate these events for each buffer
     * they receive.
     * <p>
     * {@code type} indicates the reason for the QoS event. {@code GST_QOS_TYPE_OVERFLOW} is
     * used when a buffer arrived in time or when the sink cannot keep up with
     * the upstream datarate. {@code GST_QOS_TYPE_UNDERFLOW} is when the sink is not
     * receiving buffers fast enough and thus has to drop late buffers.
     * {@code GST_QOS_TYPE_THROTTLE} is used when the datarate is artificially limited
     * by the application, for example to reduce power consumption.
     * <p>
     * {@code proportion} indicates the real-time performance of the streaming in the
     * element that generated the QoS event (usually the sink). The value is
     * generally computed based on more long term statistics about the streams
     * timestamps compared to the clock.
     * A value &lt; 1.0 indicates that the upstream element is producing data faster
     * than real-time. A value &gt; 1.0 indicates that the upstream element is not
     * producing data fast enough. 1.0 is the ideal {@code proportion} value. The
     * proportion value can safely be used to lower or increase the quality of
     * the element.
     * <p>
     * {@code diff} is the difference against the clock in running time of the last
     * buffer that caused the element to generate the QOS event. A negative value
     * means that the buffer with {@code timestamp} arrived in time. A positive value
     * indicates how late the buffer with {@code timestamp} was. When throttling is
     * enabled, {@code diff} will be set to the requested throttling interval.
     * <p>
     * {@code timestamp} is the timestamp of the last buffer that cause the element
     * to generate the QOS event. It is expressed in running time and thus an ever
     * increasing value.
     * <p>
     * The upstream element can use the {@code diff} and {@code timestamp} values to decide
     * whether to process more buffers. For positive {@code diff}, all buffers with
     * timestamp &lt;= {@code timestamp} + {@code diff} will certainly arrive late in the sink
     * as well. A (negative) {@code diff} value so that {@code timestamp} + {@code diff} would yield a
     * result smaller than 0 is not allowed.
     * <p>
     * The application can use general event probes to intercept the QoS
     * event and implement custom application specific QoS handling.
     * @param type the QoS type
     * @param proportion the proportion of the qos message
     * @param diff The time difference of the last Clock sync
     * @param timestamp The timestamp of the buffer
     * @return a new QOS event.
     */
    public static Event newQos(org.gstreamer.gst.QOSType type, double proportion, org.gstreamer.gst.ClockTimeDiff diff, org.gstreamer.gst.ClockTime timestamp) {
        var RESULT = constructNewQos(type, proportion, diff, timestamp);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewReconfigure() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_reconfigure.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new reconfigure event. The purpose of the reconfigure event is
     * to travel upstream and make elements renegotiate their caps or reconfigure
     * their buffer pools. This is useful when changing properties on elements
     * or changing the topology of the pipeline.
     * @return a new {@link Event}
     */
    public static Event newReconfigure() {
        var RESULT = constructNewReconfigure();
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewSeek(double rate, org.gstreamer.gst.Format format, org.gstreamer.gst.SeekFlags flags, org.gstreamer.gst.SeekType startType, long start, org.gstreamer.gst.SeekType stopType, long stop) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_seek.invokeExact(
                    rate,
                    format.getValue(),
                    flags.getValue(),
                    startType.getValue(),
                    start,
                    stopType.getValue(),
                    stop);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocate a new seek event with the given parameters.
     * <p>
     * The seek event configures playback of the pipeline between {@code start} to {@code stop}
     * at the speed given in {@code rate}, also called a playback segment.
     * The {@code start} and {@code stop} values are expressed in {@code format}.
     * <p>
     * A {@code rate} of 1.0 means normal playback rate, 2.0 means double speed.
     * Negatives values means backwards playback. A value of 0.0 for the
     * rate is not allowed and should be accomplished instead by PAUSING the
     * pipeline.
     * <p>
     * A pipeline has a default playback segment configured with a start
     * position of 0, a stop position of -1 and a rate of 1.0. The currently
     * configured playback segment can be queried with {@code GST_QUERY_SEGMENT}.
     * <p>
     * {@code start_type} and {@code stop_type} specify how to adjust the currently configured
     * start and stop fields in playback segment. Adjustments can be made relative
     * or absolute to the last configured values. A type of {@code GST_SEEK_TYPE_NONE}
     * means that the position should not be updated.
     * <p>
     * When the rate is positive and {@code start} has been updated, playback will start
     * from the newly configured start position.
     * <p>
     * For negative rates, playback will start from the newly configured stop
     * position (if any). If the stop position is updated, it must be different from
     * -1 ({@code GST_CLOCK_TIME_NONE}) for negative rates.
     * <p>
     * It is not possible to seek relative to the current playback position, to do
     * this, PAUSE the pipeline, query the current playback position with
     * {@code GST_QUERY_POSITION} and update the playback segment current position with a
     * {@code GST_SEEK_TYPE_SET} to the desired position.
     * @param rate The new playback rate
     * @param format The format of the seek values
     * @param flags The optional seek flags
     * @param startType The type and flags for the new start position
     * @param start The value of the new start position
     * @param stopType The type and flags for the new stop position
     * @param stop The value of the new stop position
     * @return a new seek event.
     */
    public static Event newSeek(double rate, org.gstreamer.gst.Format format, org.gstreamer.gst.SeekFlags flags, org.gstreamer.gst.SeekType startType, long start, org.gstreamer.gst.SeekType stopType, long stop) {
        var RESULT = constructNewSeek(rate, format, flags, startType, start, stopType, stop);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewSegment(org.gstreamer.gst.Segment segment) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_segment.invokeExact(
                    segment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new SEGMENT event for {@code segment}. The segment event can only travel
     * downstream synchronized with the buffer flow and contains timing information
     * and playback properties for the buffers that will follow.
     * <p>
     * The segment event marks the range of buffers to be processed. All
     * data not within the segment range is not to be processed. This can be
     * used intelligently by plugins to apply more efficient methods of skipping
     * unneeded data. The valid range is expressed with the {@code start} and {@code stop}
     * values.
     * <p>
     * The time value of the segment is used in conjunction with the start
     * value to convert the buffer timestamps into the stream time. This is
     * usually done in sinks to report the current stream_time.
     * {@code time} represents the stream_time of a buffer carrying a timestamp of
     * {@code start}. {@code time} cannot be -1.
     * <p>
     * {@code start} cannot be -1, {@code stop} can be -1. If there
     * is a valid {@code stop} given, it must be greater or equal the {@code start}, including
     * when the indicated playback {@code rate} is &lt; 0.
     * <p>
     * The {@code applied_rate} value provides information about any rate adjustment that
     * has already been made to the timestamps and content on the buffers of the
     * stream. ({@code rate} * {@code applied_rate}) should always equal the rate that has been
     * requested for playback. For example, if an element has an input segment
     * with intended playback {@code rate} of 2.0 and applied_rate of 1.0, it can adjust
     * incoming timestamps and buffer content by half and output a segment event
     * with {@code rate} of 1.0 and {@code applied_rate} of 2.0
     * <p>
     * After a segment event, the buffer stream time is calculated with:
     * <p>
     *   time + (TIMESTAMP(buf) - start) * ABS (rate * applied_rate)
     * @param segment a {@link Segment}
     * @return the new SEGMENT event.
     */
    public static Event newSegment(org.gstreamer.gst.Segment segment) {
        var RESULT = constructNewSegment(segment);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewSegmentDone(org.gstreamer.gst.Format format, long position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_segment_done.invokeExact(
                    format.getValue(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new segment-done event. This event is sent by elements that
     * finish playback of a segment as a result of a segment seek.
     * @param format The format of the position being done
     * @param position The position of the segment being done
     * @return a new {@link Event}
     */
    public static Event newSegmentDone(org.gstreamer.gst.Format format, long position) {
        var RESULT = constructNewSegmentDone(format, position);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewSelectStreams(org.gtk.glib.List streams) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_select_streams.invokeExact(
                    streams.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocate a new select-streams event.
     * <p>
     * The select-streams event requests the specified {@code streams} to be activated.
     * <p>
     * The list of {@code streams} corresponds to the "Stream ID" of each stream to be
     * activated. Those ID can be obtained via the {@link Stream} objects present
     * in {@code GST_EVENT_STREAM_START}, {@code GST_EVENT_STREAM_COLLECTION} or
     * {@code GST_MESSAGE_STREAM_COLLECTION}.
     * <p>
     * Note: The list of {@code streams} can not be empty.
     * @param streams the list of streams to
     * activate
     * @return a new select-streams event or {@code null} in case of
     * an error (like an empty streams list).
     */
    public static Event newSelectStreams(org.gtk.glib.List streams) {
        var RESULT = constructNewSelectStreams(streams);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewSinkMessage(java.lang.String name, org.gstreamer.gst.Message msg) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_sink_message.invokeExact(
                    Marshal.stringToAddress.marshal(name, null),
                    msg.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new sink-message event. The purpose of the sink-message event is
     * to instruct a sink to post the message contained in the event synchronized
     * with the stream.
     * <p>
     * {@code name} is used to store multiple sticky events on one pad.
     * @param name a name for the event
     * @param msg the {@link Message} to be posted
     * @return a new {@link Event}
     */
    public static Event newSinkMessage(java.lang.String name, org.gstreamer.gst.Message msg) {
        var RESULT = constructNewSinkMessage(name, msg);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewStep(org.gstreamer.gst.Format format, long amount, double rate, boolean flush, boolean intermediate) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_step.invokeExact(
                    format.getValue(),
                    amount,
                    rate,
                    Marshal.booleanToInteger.marshal(flush, null).intValue(),
                    Marshal.booleanToInteger.marshal(intermediate, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new step event. The purpose of the step event is to instruct a sink
     * to skip {@code amount} (expressed in {@code format}) of media. It can be used to implement
     * stepping through the video frame by frame or for doing fast trick modes.
     * <p>
     * A rate of &lt;= 0.0 is not allowed. Pause the pipeline, for the effect of rate
     * = 0.0 or first reverse the direction of playback using a seek event to get
     * the same effect as rate &lt; 0.0.
     * <p>
     * The {@code flush} flag will clear any pending data in the pipeline before starting
     * the step operation.
     * <p>
     * The {@code intermediate} flag instructs the pipeline that this step operation is
     * part of a larger step operation.
     * @param format the format of {@code amount}
     * @param amount the amount of data to step
     * @param rate the step rate
     * @param flush flushing steps
     * @param intermediate intermediate steps
     * @return a new {@link Event}
     */
    public static Event newStep(org.gstreamer.gst.Format format, long amount, double rate, boolean flush, boolean intermediate) {
        var RESULT = constructNewStep(format, amount, rate, flush, intermediate);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewStreamCollection(org.gstreamer.gst.StreamCollection collection) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_stream_collection.invokeExact(
                    collection.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new STREAM_COLLECTION event. The stream collection event can only
     * travel downstream synchronized with the buffer flow.
     * <p>
     * Source elements, demuxers and other elements that manage collections
     * of streams and post {@link StreamCollection} messages on the bus also send
     * this event downstream on each pad involved in the collection, so that
     * activation of a new collection can be tracked through the downstream
     * data flow.
     * @param collection Active collection for this data flow
     * @return the new STREAM_COLLECTION event.
     */
    public static Event newStreamCollection(org.gstreamer.gst.StreamCollection collection) {
        var RESULT = constructNewStreamCollection(collection);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewStreamGroupDone(int groupId) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_stream_group_done.invokeExact(
                    groupId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new Stream Group Done event. The stream-group-done event can
     * only travel downstream synchronized with the buffer flow. Elements
     * that receive the event on a pad should handle it mostly like EOS,
     * and emit any data or pending buffers that would depend on more data
     * arriving and unblock, since there won't be any more data.
     * <p>
     * This event is followed by EOS at some point in the future, and is
     * generally used when switching pads - to unblock downstream so that
     * new pads can be exposed before sending EOS on the existing pads.
     * @param groupId the group id of the stream group which is ending
     * @return the new stream-group-done event.
     */
    public static Event newStreamGroupDone(int groupId) {
        var RESULT = constructNewStreamGroupDone(groupId);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewStreamStart(java.lang.String streamId) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_stream_start.invokeExact(
                    Marshal.stringToAddress.marshal(streamId, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new STREAM_START event. The stream start event can only
     * travel downstream synchronized with the buffer flow. It is expected
     * to be the first event that is sent for a new stream.
     * <p>
     * Source elements, demuxers and other elements that create new streams
     * are supposed to send this event as the first event of a new stream. It
     * should not be sent after a flushing seek or in similar situations
     * and is used to mark the beginning of a new logical stream. Elements
     * combining multiple streams must ensure that this event is only forwarded
     * downstream once and not for every single input stream.
     * <p>
     * The {@code stream_id} should be a unique string that consists of the upstream
     * stream-id, / as separator and a unique stream-id for this specific
     * stream. A new stream-id should only be created for a stream if the upstream
     * stream is split into (potentially) multiple new streams, e.g. in a demuxer,
     * but not for every single element in the pipeline.
     * gst_pad_create_stream_id() or gst_pad_create_stream_id_printf() can be
     * used to create a stream-id.  There are no particular semantics for the
     * stream-id, though it should be deterministic (to support stream matching)
     * and it might be used to order streams (besides any information conveyed by
     * stream flags).
     * @param streamId Identifier for this stream
     * @return the new STREAM_START event.
     */
    public static Event newStreamStart(java.lang.String streamId) {
        var RESULT = constructNewStreamStart(streamId);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewTag(org.gstreamer.gst.TagList taglist) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_tag.invokeExact(
                    taglist.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        taglist.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Generates a metadata tag event from the given {@code taglist}.
     * <p>
     * The scope of the taglist specifies if the taglist applies to the
     * complete medium or only to this specific stream. As the tag event
     * is a sticky event, elements should merge tags received from
     * upstream with a given scope with their own tags with the same
     * scope and create a new tag event from it.
     * @param taglist metadata list. The event will take ownership
     *     of the taglist.
     * @return a new {@link Event}
     */
    public static Event newTag(org.gstreamer.gst.TagList taglist) {
        var RESULT = constructNewTag(taglist);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewToc(org.gstreamer.gst.Toc toc, boolean updated) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_toc.invokeExact(
                    toc.handle(),
                    Marshal.booleanToInteger.marshal(updated, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Generate a TOC event from the given {@code toc}. The purpose of the TOC event is to
     * inform elements that some kind of the TOC was found.
     * @param toc {@link Toc} structure.
     * @param updated whether {@code toc} was updated or not.
     * @return a new {@link Event}.
     */
    public static Event newToc(org.gstreamer.gst.Toc toc, boolean updated) {
        var RESULT = constructNewToc(toc, updated);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewTocSelect(java.lang.String uid) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_new_toc_select.invokeExact(
                    Marshal.stringToAddress.marshal(uid, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Generate a TOC select event with the given {@code uid}. The purpose of the
     * TOC select event is to start playback based on the TOC's entry with the
     * given {@code uid}.
     * @param uid UID in the TOC to start playback from.
     * @return a new {@link Event}.
     */
    public static Event newTocSelect(java.lang.String uid) {
        var RESULT = constructNewTocSelect(uid);
        return org.gstreamer.gst.Event.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Parses a segment {@code event} and copies the {@link Segment} into the location
     * given by {@code segment}.
     * @param segment a pointer to a {@link Segment}
     */
    public void copySegment(org.gstreamer.gst.Segment segment) {
        try {
            DowncallHandles.gst_event_copy_segment.invokeExact(
                    handle(),
                    segment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieve the accumulated running time offset of the event.
     * <p>
     * Events passing through {@code GstPads} that have a running time
     * offset set via gst_pad_set_offset() will get their offset
     * adjusted according to the pad's offset.
     * <p>
     * If the event contains any information that related to the
     * running time, this information will need to be updated
     * before usage with this offset.
     * @return The event's running time offset
     * <p>
     * MT safe.
     */
    public long getRunningTimeOffset() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_event_get_running_time_offset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieve the sequence number of a event.
     * <p>
     * Events have ever-incrementing sequence numbers, which may also be set
     * explicitly via gst_event_set_seqnum(). Sequence numbers are typically used to
     * indicate that a event corresponds to some other set of events or messages,
     * for example an EOS event corresponding to a SEEK event. It is considered good
     * practice to make this correspondence when possible, though it is not
     * required.
     * <p>
     * Note that events and messages share the same sequence number incrementor;
     * two events or messages will never have the same sequence number unless
     * that correspondence was made explicitly.
     * @return The event's sequence number.
     * <p>
     * MT safe.
     */
    public int getSeqnum() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_event_get_seqnum.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Access the structure of the event.
     * @return The structure of the event. The
     * structure is still owned by the event, which means that you should not free
     * it and that the pointer becomes invalid when you free the event.
     * <p>
     * MT safe.
     */
    public @Nullable org.gstreamer.gst.Structure getStructure() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_get_structure.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks if {@code event} has the given {@code name}. This function is usually used to
     * check the name of a custom event.
     * @param name name to check
     * @return {@code true} if {@code name} matches the name of the event structure.
     */
    public boolean hasName(java.lang.String name) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_event_has_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if {@code event} has the given {@code name}. This function is usually used to
     * check the name of a custom event.
     * @param name name to check as a GQuark
     * @return {@code true} if {@code name} matches the name of the event structure.
     */
    public boolean hasNameId(org.gtk.glib.Quark name) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_event_has_name_id.invokeExact(
                    handle(),
                    name.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the format, minsize, maxsize and async-flag in the buffersize event.
     * @param format A pointer to store the format in
     * @param minsize A pointer to store the minsize in
     * @param maxsize A pointer to store the maxsize in
     * @param async A pointer to store the async-flag in
     */
    public void parseBufferSize(Out<org.gstreamer.gst.Format> format, Out<Long> minsize, Out<Long> maxsize, Out<Boolean> async) {
        MemorySegment formatPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment minsizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment maxsizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment asyncPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_event_parse_buffer_size.invokeExact(
                    handle(),
                    (Addressable) formatPOINTER.address(),
                    (Addressable) minsizePOINTER.address(),
                    (Addressable) maxsizePOINTER.address(),
                    (Addressable) asyncPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
        minsize.set(minsizePOINTER.get(Interop.valueLayout.C_LONG, 0));
        maxsize.set(maxsizePOINTER.get(Interop.valueLayout.C_LONG, 0));
        async.set(asyncPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
    }
    
    /**
     * Get the caps from {@code event}. The caps remains valid as long as {@code event} remains
     * valid.
     * @param caps A pointer to the caps
     */
    public void parseCaps(Out<org.gstreamer.gst.Caps> caps) {
        MemorySegment capsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_event_parse_caps.invokeExact(
                    handle(),
                    (Addressable) capsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        caps.set(org.gstreamer.gst.Caps.fromAddress.marshal(capsPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Parse the FLUSH_STOP event and retrieve the {@code reset_time} member.
     * @param resetTime if time should be reset
     */
    public void parseFlushStop(Out<Boolean> resetTime) {
        MemorySegment resetTimePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_event_parse_flush_stop.invokeExact(
                    handle(),
                    (Addressable) resetTimePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        resetTime.set(resetTimePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
    }
    
    /**
     * Extract timestamp and duration from a new GAP event.
     * @param timestamp location where to store the
     *     start time (pts) of the gap, or {@code null}
     * @param duration location where to store the duration of
     *     the gap, or {@code null}
     */
    public void parseGap(@Nullable org.gstreamer.gst.ClockTime timestamp, @Nullable org.gstreamer.gst.ClockTime duration) {
        MemorySegment timestampPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment durationPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_event_parse_gap.invokeExact(
                    handle(),
                    (Addressable) (timestamp == null ? MemoryAddress.NULL : (Addressable) timestampPOINTER.address()),
                    (Addressable) (duration == null ? MemoryAddress.NULL : (Addressable) durationPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (timestamp != null) timestamp.setValue(timestampPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (duration != null) duration.setValue(durationPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Retrieve the gap flags that may have been set on a gap event with
     * gst_event_set_gap_flags().
     * @param flags a {@link GapFlags} or {@code null}
     */
    public void parseGapFlags(Out<org.gstreamer.gst.GapFlags> flags) {
        MemorySegment flagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_event_parse_gap_flags.invokeExact(
                    handle(),
                    (Addressable) flagsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        flags.set(new org.gstreamer.gst.GapFlags(flagsPOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    public boolean parseGroupId(Out<Integer> groupId) {
        MemorySegment groupIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_event_parse_group_id.invokeExact(
                    handle(),
                    (Addressable) groupIdPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        groupId.set(groupIdPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Extract rate and flags from an instant-rate-change event.
     * @param rateMultiplier location in which to store the rate
     *     multiplier of the instant-rate-change event, or {@code null}
     * @param newFlags location in which to store the new
     *     segment flags of the instant-rate-change event, or {@code null}
     */
    public void parseInstantRateChange(Out<Double> rateMultiplier, @Nullable Out<org.gstreamer.gst.SegmentFlags> newFlags) {
        MemorySegment rateMultiplierPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment newFlagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_event_parse_instant_rate_change.invokeExact(
                    handle(),
                    (Addressable) (rateMultiplier == null ? MemoryAddress.NULL : (Addressable) rateMultiplierPOINTER.address()),
                    (Addressable) (newFlags == null ? MemoryAddress.NULL : (Addressable) newFlagsPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (rateMultiplier != null) rateMultiplier.set(rateMultiplierPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        if (newFlags != null) newFlags.set(new org.gstreamer.gst.SegmentFlags(newFlagsPOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Extract the rate multiplier and running times from an instant-rate-sync-time event.
     * @param rateMultiplier location where to store the rate of
     *     the instant-rate-sync-time event, or {@code null}
     * @param runningTime location in which to store the running time
     *     of the instant-rate-sync-time event, or {@code null}
     * @param upstreamRunningTime location in which to store the
     *     upstream running time of the instant-rate-sync-time event, or {@code null}
     */
    public void parseInstantRateSyncTime(Out<Double> rateMultiplier, @Nullable org.gstreamer.gst.ClockTime runningTime, @Nullable org.gstreamer.gst.ClockTime upstreamRunningTime) {
        MemorySegment rateMultiplierPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment runningTimePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment upstreamRunningTimePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_event_parse_instant_rate_sync_time.invokeExact(
                    handle(),
                    (Addressable) (rateMultiplier == null ? MemoryAddress.NULL : (Addressable) rateMultiplierPOINTER.address()),
                    (Addressable) (runningTime == null ? MemoryAddress.NULL : (Addressable) runningTimePOINTER.address()),
                    (Addressable) (upstreamRunningTime == null ? MemoryAddress.NULL : (Addressable) upstreamRunningTimePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (rateMultiplier != null) rateMultiplier.set(rateMultiplierPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        if (runningTime != null) runningTime.setValue(runningTimePOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (upstreamRunningTime != null) upstreamRunningTime.setValue(upstreamRunningTimePOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Get the latency in the latency event.
     * @param latency A pointer to store the latency in.
     */
    public void parseLatency(org.gstreamer.gst.ClockTime latency) {
        MemorySegment latencyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_event_parse_latency.invokeExact(
                    handle(),
                    (Addressable) latencyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        latency.setValue(latencyPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Parses an event containing protection system specific information and stores
     * the results in {@code system_id}, {@code data} and {@code origin}. The data stored in {@code system_id},
     * {@code origin} and {@code data} are valid until {@code event} is released.
     * @param systemId pointer to store the UUID
     * string uniquely identifying a content protection system.
     * @param data pointer to store a {@link Buffer}
     * holding protection system specific information.
     * @param origin pointer to store a value that
     * indicates where the protection information carried by {@code event} was extracted
     * from.
     */
    public void parseProtection(@Nullable Out<java.lang.String> systemId, @Nullable Out<org.gstreamer.gst.Buffer> data, @Nullable Out<java.lang.String> origin) {
        MemorySegment systemIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment dataPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment originPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_event_parse_protection.invokeExact(
                    handle(),
                    (Addressable) (systemId == null ? MemoryAddress.NULL : (Addressable) systemIdPOINTER.address()),
                    (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) dataPOINTER.address()),
                    (Addressable) (origin == null ? MemoryAddress.NULL : (Addressable) originPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (systemId != null) systemId.set(Marshal.addressToString.marshal(systemIdPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        if (data != null) data.set(org.gstreamer.gst.Buffer.fromAddress.marshal(dataPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        if (origin != null) origin.set(Marshal.addressToString.marshal(originPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
    }
    
    /**
     * Get the type, proportion, diff and timestamp in the qos event. See
     * gst_event_new_qos() for more information about the different QoS values.
     * <p>
     * {@code timestamp} will be adjusted for any pad offsets of pads it was passing through.
     * @param type A pointer to store the QoS type in
     * @param proportion A pointer to store the proportion in
     * @param diff A pointer to store the diff in
     * @param timestamp A pointer to store the timestamp in
     */
    public void parseQos(Out<org.gstreamer.gst.QOSType> type, Out<Double> proportion, org.gstreamer.gst.ClockTimeDiff diff, org.gstreamer.gst.ClockTime timestamp) {
        MemorySegment typePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment proportionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment diffPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment timestampPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_event_parse_qos.invokeExact(
                    handle(),
                    (Addressable) typePOINTER.address(),
                    (Addressable) proportionPOINTER.address(),
                    (Addressable) diffPOINTER.address(),
                    (Addressable) timestampPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        type.set(org.gstreamer.gst.QOSType.of(typePOINTER.get(Interop.valueLayout.C_INT, 0)));
        proportion.set(proportionPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        diff.setValue(diffPOINTER.get(Interop.valueLayout.C_LONG, 0));
        timestamp.setValue(timestampPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Parses a seek {@code event} and stores the results in the given result locations.
     * @param rate result location for the rate
     * @param format result location for the stream format
     * @param flags result location for the {@link SeekFlags}
     * @param startType result location for the {@link SeekType} of the start position
     * @param start result location for the start position expressed in {@code format}
     * @param stopType result location for the {@link SeekType} of the stop position
     * @param stop result location for the stop position expressed in {@code format}
     */
    public void parseSeek(Out<Double> rate, Out<org.gstreamer.gst.Format> format, Out<org.gstreamer.gst.SeekFlags> flags, Out<org.gstreamer.gst.SeekType> startType, Out<Long> start, Out<org.gstreamer.gst.SeekType> stopType, Out<Long> stop) {
        MemorySegment ratePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment formatPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment flagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment startTypePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment startPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment stopTypePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment stopPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_event_parse_seek.invokeExact(
                    handle(),
                    (Addressable) ratePOINTER.address(),
                    (Addressable) formatPOINTER.address(),
                    (Addressable) flagsPOINTER.address(),
                    (Addressable) startTypePOINTER.address(),
                    (Addressable) startPOINTER.address(),
                    (Addressable) stopTypePOINTER.address(),
                    (Addressable) stopPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        rate.set(ratePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
        flags.set(new org.gstreamer.gst.SeekFlags(flagsPOINTER.get(Interop.valueLayout.C_INT, 0)));
        startType.set(org.gstreamer.gst.SeekType.of(startTypePOINTER.get(Interop.valueLayout.C_INT, 0)));
        start.set(startPOINTER.get(Interop.valueLayout.C_LONG, 0));
        stopType.set(org.gstreamer.gst.SeekType.of(stopTypePOINTER.get(Interop.valueLayout.C_INT, 0)));
        stop.set(stopPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Retrieve the trickmode interval that may have been set on a
     * seek event with gst_event_set_seek_trickmode_interval().
     */
    public void parseSeekTrickmodeInterval(org.gstreamer.gst.ClockTime interval) {
        MemorySegment intervalPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_event_parse_seek_trickmode_interval.invokeExact(
                    handle(),
                    (Addressable) intervalPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        interval.setValue(intervalPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Parses a segment {@code event} and stores the result in the given {@code segment} location.
     * {@code segment} remains valid only until the {@code event} is freed. Don't modify the segment
     * and make a copy if you want to modify it or store it for later use.
     * @param segment a pointer to a {@link Segment}
     */
    public void parseSegment(Out<org.gstreamer.gst.Segment> segment) {
        MemorySegment segmentPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_event_parse_segment.invokeExact(
                    handle(),
                    (Addressable) segmentPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        segment.set(org.gstreamer.gst.Segment.fromAddress.marshal(segmentPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Extracts the position and format from the segment done message.
     * @param format Result location for the format, or {@code null}
     * @param position Result location for the position, or {@code null}
     */
    public void parseSegmentDone(@Nullable Out<org.gstreamer.gst.Format> format, Out<Long> position) {
        MemorySegment formatPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        try {
            DowncallHandles.gst_event_parse_segment_done.invokeExact(
                    handle(),
                    (Addressable) (format == null ? MemoryAddress.NULL : (Addressable) formatPOINTER.address()),
                    (Addressable) (position == null ? MemoryAddress.NULL : (Addressable) positionPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (format != null) format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
        if (position != null) position.set(positionPOINTER.get(Interop.valueLayout.C_LONG, 0));
    }
    
    /**
     * Parse the SELECT_STREAMS event and retrieve the contained streams.
     * @param streams the streams
     */
    public void parseSelectStreams(Out<org.gtk.glib.List> streams) {
        MemorySegment streamsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_event_parse_select_streams.invokeExact(
                    handle(),
                    (Addressable) streamsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        streams.set(org.gtk.glib.List.fromAddress.marshal(streamsPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Parse the sink-message event. Unref {@code msg} after usage.
     * @param msg a pointer to store the {@link Message} in.
     */
    public void parseSinkMessage(Out<org.gstreamer.gst.Message> msg) {
        MemorySegment msgPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_event_parse_sink_message.invokeExact(
                    handle(),
                    (Addressable) msgPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        msg.set(org.gstreamer.gst.Message.fromAddress.marshal(msgPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Parse the step event.
     * @param format a pointer to store the format in
     * @param amount a pointer to store the amount in
     * @param rate a pointer to store the rate in
     * @param flush a pointer to store the flush boolean in
     * @param intermediate a pointer to store the intermediate
     *     boolean in
     */
    public void parseStep(@Nullable Out<org.gstreamer.gst.Format> format, Out<Long> amount, Out<Double> rate, Out<Boolean> flush, Out<Boolean> intermediate) {
        MemorySegment formatPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment amountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment ratePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment flushPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment intermediatePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_event_parse_step.invokeExact(
                    handle(),
                    (Addressable) (format == null ? MemoryAddress.NULL : (Addressable) formatPOINTER.address()),
                    (Addressable) (amount == null ? MemoryAddress.NULL : (Addressable) amountPOINTER.address()),
                    (Addressable) (rate == null ? MemoryAddress.NULL : (Addressable) ratePOINTER.address()),
                    (Addressable) (flush == null ? MemoryAddress.NULL : (Addressable) flushPOINTER.address()),
                    (Addressable) (intermediate == null ? MemoryAddress.NULL : (Addressable) intermediatePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (format != null) format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
        if (amount != null) amount.set(amountPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (rate != null) rate.set(ratePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        if (flush != null) flush.set(flushPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        if (intermediate != null) intermediate.set(intermediatePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
    }
    
    /**
     * Parse a stream-start {@code event} and extract the {@link Stream} from it.
     * @param stream address of variable to store the stream
     */
    public void parseStream(Out<org.gstreamer.gst.Stream> stream) {
        MemorySegment streamPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_event_parse_stream.invokeExact(
                    handle(),
                    (Addressable) streamPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        stream.set((org.gstreamer.gst.Stream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(streamPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gstreamer.gst.Stream.fromAddress).marshal(streamPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Retrieve new {@link StreamCollection} from STREAM_COLLECTION event {@code event}.
     * @param collection pointer to store the collection
     */
    public void parseStreamCollection(Out<org.gstreamer.gst.StreamCollection> collection) {
        MemorySegment collectionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_event_parse_stream_collection.invokeExact(
                    handle(),
                    (Addressable) collectionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        collection.set((org.gstreamer.gst.StreamCollection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(collectionPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gstreamer.gst.StreamCollection.fromAddress).marshal(collectionPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    public void parseStreamFlags(Out<org.gstreamer.gst.StreamFlags> flags) {
        MemorySegment flagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_event_parse_stream_flags.invokeExact(
                    handle(),
                    (Addressable) flagsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        flags.set(new org.gstreamer.gst.StreamFlags(flagsPOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Parse a stream-group-done {@code event} and store the result in the given
     * {@code group_id} location.
     * @param groupId address of variable to store the group id into
     */
    public void parseStreamGroupDone(Out<Integer> groupId) {
        MemorySegment groupIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_event_parse_stream_group_done.invokeExact(
                    handle(),
                    (Addressable) groupIdPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        groupId.set(groupIdPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Parse a stream-id {@code event} and store the result in the given {@code stream_id}
     * location. The string stored in {@code stream_id} must not be modified and will
     * remain valid only until {@code event} gets freed. Make a copy if you want to
     * modify it or store it for later use.
     * @param streamId pointer to store the stream-id
     */
    public void parseStreamStart(Out<java.lang.String> streamId) {
        MemorySegment streamIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_event_parse_stream_start.invokeExact(
                    handle(),
                    (Addressable) streamIdPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        streamId.set(Marshal.addressToString.marshal(streamIdPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
    }
    
    /**
     * Parses a tag {@code event} and stores the results in the given {@code taglist} location.
     * No reference to the taglist will be returned, it remains valid only until
     * the {@code event} is freed. Don't modify or free the taglist, make a copy if you
     * want to modify it or store it for later use.
     * @param taglist pointer to metadata list
     */
    public void parseTag(Out<org.gstreamer.gst.TagList> taglist) {
        MemorySegment taglistPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_event_parse_tag.invokeExact(
                    handle(),
                    (Addressable) taglistPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        taglist.set(org.gstreamer.gst.TagList.fromAddress.marshal(taglistPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Parse a TOC {@code event} and store the results in the given {@code toc} and {@code updated} locations.
     * @param toc pointer to {@link Toc} structure.
     * @param updated pointer to store TOC updated flag.
     */
    public void parseToc(Out<org.gstreamer.gst.Toc> toc, Out<Boolean> updated) {
        MemorySegment tocPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment updatedPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_event_parse_toc.invokeExact(
                    handle(),
                    (Addressable) tocPOINTER.address(),
                    (Addressable) updatedPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        toc.set(org.gstreamer.gst.Toc.fromAddress.marshal(tocPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        updated.set(updatedPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
    }
    
    /**
     * Parse a TOC select {@code event} and store the results in the given {@code uid} location.
     * @param uid storage for the selection UID.
     */
    public void parseTocSelect(@Nullable Out<java.lang.String> uid) {
        MemorySegment uidPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_event_parse_toc_select.invokeExact(
                    handle(),
                    (Addressable) (uid == null ? MemoryAddress.NULL : (Addressable) uidPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (uid != null) uid.set(Marshal.addressToString.marshal(uidPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
    }
    
    /**
     * Sets {@code flags} on {@code event} to give additional information about the reason for
     * the {@code GST_EVENT_GAP}.
     * @param flags a {@link GapFlags}
     */
    public void setGapFlags(org.gstreamer.gst.GapFlags flags) {
        try {
            DowncallHandles.gst_event_set_gap_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * All streams that have the same group id are supposed to be played
     * together, i.e. all streams inside a container file should have the
     * same group id but different stream ids. The group id should change
     * each time the stream is started, resulting in different group ids
     * each time a file is played for example.
     * <p>
     * Use gst_util_group_id_next() to get a new group id.
     * @param groupId the group id to set
     */
    public void setGroupId(int groupId) {
        try {
            DowncallHandles.gst_event_set_group_id.invokeExact(
                    handle(),
                    groupId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the running time offset of a event. See
     * gst_event_get_running_time_offset() for more information.
     * <p>
     * MT safe.
     * @param offset A the new running time offset
     */
    public void setRunningTimeOffset(long offset) {
        try {
            DowncallHandles.gst_event_set_running_time_offset.invokeExact(
                    handle(),
                    offset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a trickmode interval on a (writable) seek event. Elements
     * that support TRICKMODE_KEY_UNITS seeks SHOULD use this as the minimal
     * interval between each frame they may output.
     */
    public void setSeekTrickmodeInterval(org.gstreamer.gst.ClockTime interval) {
        try {
            DowncallHandles.gst_event_set_seek_trickmode_interval.invokeExact(
                    handle(),
                    interval.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the sequence number of a event.
     * <p>
     * This function might be called by the creator of a event to indicate that the
     * event relates to other events or messages. See gst_event_get_seqnum() for
     * more information.
     * <p>
     * MT safe.
     * @param seqnum A sequence number.
     */
    public void setSeqnum(int seqnum) {
        try {
            DowncallHandles.gst_event_set_seqnum.invokeExact(
                    handle(),
                    seqnum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the {@code stream} on the stream-start {@code event}
     * @param stream the stream object to set
     */
    public void setStream(org.gstreamer.gst.Stream stream) {
        try {
            DowncallHandles.gst_event_set_stream.invokeExact(
                    handle(),
                    stream.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void setStreamFlags(org.gstreamer.gst.StreamFlags flags) {
        try {
            DowncallHandles.gst_event_set_stream_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get a writable version of the structure.
     * @return The structure of the event. The structure
     * is still owned by the event, which means that you should not free
     * it and that the pointer becomes invalid when you free the event.
     * This function checks if {@code event} is writable and will never return
     * {@code null}.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.Structure writableStructure() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_event_writable_structure.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_event_new_buffer_size = Interop.downcallHandle(
            "gst_event_new_buffer_size",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_new_caps = Interop.downcallHandle(
            "gst_event_new_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_custom = Interop.downcallHandle(
            "gst_event_new_custom",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_eos = Interop.downcallHandle(
            "gst_event_new_eos",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_flush_start = Interop.downcallHandle(
            "gst_event_new_flush_start",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_flush_stop = Interop.downcallHandle(
            "gst_event_new_flush_stop",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_new_gap = Interop.downcallHandle(
            "gst_event_new_gap",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_event_new_instant_rate_change = Interop.downcallHandle(
            "gst_event_new_instant_rate_change",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_new_instant_rate_sync_time = Interop.downcallHandle(
            "gst_event_new_instant_rate_sync_time",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_event_new_latency = Interop.downcallHandle(
            "gst_event_new_latency",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_event_new_navigation = Interop.downcallHandle(
            "gst_event_new_navigation",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_protection = Interop.downcallHandle(
            "gst_event_new_protection",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_qos = Interop.downcallHandle(
            "gst_event_new_qos",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_event_new_reconfigure = Interop.downcallHandle(
            "gst_event_new_reconfigure",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_seek = Interop.downcallHandle(
            "gst_event_new_seek",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_event_new_segment = Interop.downcallHandle(
            "gst_event_new_segment",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_segment_done = Interop.downcallHandle(
            "gst_event_new_segment_done",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_event_new_select_streams = Interop.downcallHandle(
            "gst_event_new_select_streams",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_sink_message = Interop.downcallHandle(
            "gst_event_new_sink_message",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_step = Interop.downcallHandle(
            "gst_event_new_step",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_new_stream_collection = Interop.downcallHandle(
            "gst_event_new_stream_collection",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_stream_group_done = Interop.downcallHandle(
            "gst_event_new_stream_group_done",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_new_stream_start = Interop.downcallHandle(
            "gst_event_new_stream_start",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_tag = Interop.downcallHandle(
            "gst_event_new_tag",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_new_toc = Interop.downcallHandle(
            "gst_event_new_toc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_new_toc_select = Interop.downcallHandle(
            "gst_event_new_toc_select",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_copy_segment = Interop.downcallHandle(
            "gst_event_copy_segment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_get_running_time_offset = Interop.downcallHandle(
            "gst_event_get_running_time_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_get_seqnum = Interop.downcallHandle(
            "gst_event_get_seqnum",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_get_structure = Interop.downcallHandle(
            "gst_event_get_structure",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_has_name = Interop.downcallHandle(
            "gst_event_has_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_has_name_id = Interop.downcallHandle(
            "gst_event_has_name_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_parse_buffer_size = Interop.downcallHandle(
            "gst_event_parse_buffer_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_parse_caps = Interop.downcallHandle(
            "gst_event_parse_caps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_flush_stop = Interop.downcallHandle(
            "gst_event_parse_flush_stop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_parse_gap = Interop.downcallHandle(
            "gst_event_parse_gap",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_gap_flags = Interop.downcallHandle(
            "gst_event_parse_gap_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_parse_group_id = Interop.downcallHandle(
            "gst_event_parse_group_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_instant_rate_change = Interop.downcallHandle(
            "gst_event_parse_instant_rate_change",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_parse_instant_rate_sync_time = Interop.downcallHandle(
            "gst_event_parse_instant_rate_sync_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_latency = Interop.downcallHandle(
            "gst_event_parse_latency",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_protection = Interop.downcallHandle(
            "gst_event_parse_protection",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_qos = Interop.downcallHandle(
            "gst_event_parse_qos",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_seek = Interop.downcallHandle(
            "gst_event_parse_seek",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_seek_trickmode_interval = Interop.downcallHandle(
            "gst_event_parse_seek_trickmode_interval",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_segment = Interop.downcallHandle(
            "gst_event_parse_segment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_segment_done = Interop.downcallHandle(
            "gst_event_parse_segment_done",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_select_streams = Interop.downcallHandle(
            "gst_event_parse_select_streams",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_sink_message = Interop.downcallHandle(
            "gst_event_parse_sink_message",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_step = Interop.downcallHandle(
            "gst_event_parse_step",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_parse_stream = Interop.downcallHandle(
            "gst_event_parse_stream",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_stream_collection = Interop.downcallHandle(
            "gst_event_parse_stream_collection",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_stream_flags = Interop.downcallHandle(
            "gst_event_parse_stream_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_parse_stream_group_done = Interop.downcallHandle(
            "gst_event_parse_stream_group_done",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_stream_start = Interop.downcallHandle(
            "gst_event_parse_stream_start",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_tag = Interop.downcallHandle(
            "gst_event_parse_tag",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_parse_toc = Interop.downcallHandle(
            "gst_event_parse_toc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_parse_toc_select = Interop.downcallHandle(
            "gst_event_parse_toc_select",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_set_gap_flags = Interop.downcallHandle(
            "gst_event_set_gap_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_set_group_id = Interop.downcallHandle(
            "gst_event_set_group_id",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_set_running_time_offset = Interop.downcallHandle(
            "gst_event_set_running_time_offset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_event_set_seek_trickmode_interval = Interop.downcallHandle(
            "gst_event_set_seek_trickmode_interval",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_event_set_seqnum = Interop.downcallHandle(
            "gst_event_set_seqnum",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_set_stream = Interop.downcallHandle(
            "gst_event_set_stream",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_event_set_stream_flags = Interop.downcallHandle(
            "gst_event_set_stream_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_event_writable_structure = Interop.downcallHandle(
            "gst_event_writable_structure",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Event.Builder} object constructs a {@link Event} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Event.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Event struct;
        
        private Builder() {
            struct = Event.allocate();
        }
        
         /**
         * Finish building the {@link Event} struct.
         * @return A new instance of {@code Event} with the fields 
         *         that were set in the Builder object.
         */
        public Event build() {
            return struct;
        }
        
        /**
         * the parent structure
         * @param miniObject The value for the {@code miniObject} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
            return this;
        }
        
        /**
         * the {@link EventType} of the event
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gstreamer.gst.EventType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        /**
         * the timestamp of the event
         * @param timestamp The value for the {@code timestamp} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTimestamp(long timestamp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("timestamp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), timestamp);
            return this;
        }
        
        /**
         * the sequence number of the event
         * @param seqnum The value for the {@code seqnum} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSeqnum(int seqnum) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seqnum"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), seqnum);
            return this;
        }
    }
}
