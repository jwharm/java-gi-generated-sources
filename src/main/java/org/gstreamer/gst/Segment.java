package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This helper structure holds the relevant values for tracking the region of
 * interest in a media file, called a segment.
 * <p>
 * The structure can be used for two purposes:
 * <p>
 *   * performing seeks (handling seek events)
 *   * tracking playback regions (handling newsegment events)
 * <p>
 * The segment is usually configured by the application with a seek event which
 * is propagated upstream and eventually handled by an element that performs the seek.
 * <p>
 * The configured segment is then propagated back downstream with a newsegment event.
 * This information is then used to clip media to the segment boundaries.
 * <p>
 * A segment structure is initialized with gst_segment_init(), which takes a {@link Format}
 * that will be used as the format of the segment values. The segment will be configured
 * with a start value of 0 and a stop/duration of -1, which is undefined. The default
 * rate and applied_rate is 1.0.
 * <p>
 * The public duration field contains the duration of the segment. When using
 * the segment for seeking, the start and time members should normally be left
 * to their default 0 value. The stop position is left to -1 unless explicitly
 * configured to a different value after a seek event.
 * <p>
 * The current position in the segment should be set by changing the position
 * member in the structure.
 * <p>
 * For elements that perform seeks, the current segment should be updated with the
 * gst_segment_do_seek() and the values from the seek event. This method will update
 * all the segment fields. The position field will contain the new playback position.
 * If the start_type was different from GST_SEEK_TYPE_NONE, playback continues from
 * the position position, possibly with updated flags or rate.
 * <p>
 * For elements that want to use {@link Segment} to track the playback region,
 * update the segment fields with the information from the newsegment event.
 * The gst_segment_clip() method can be used to check and clip
 * the media data to the segment boundaries.
 * <p>
 * For elements that want to synchronize to the pipeline clock, gst_segment_to_running_time()
 * can be used to convert a timestamp to a value that can be used to synchronize
 * to the clock. This function takes into account the base as well as
 * any rate or applied_rate conversions.
 * <p>
 * For elements that need to perform operations on media data in stream_time,
 * gst_segment_to_stream_time() can be used to convert a timestamp and the segment
 * info to stream time (which is always between 0 and the duration of the stream).
 */
public class Segment extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSegment";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("flags"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_DOUBLE.withName("rate"),
            Interop.valueLayout.C_DOUBLE.withName("applied_rate"),
            Interop.valueLayout.C_INT.withName("format"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("base"),
            Interop.valueLayout.C_LONG.withName("offset"),
            Interop.valueLayout.C_LONG.withName("start"),
            Interop.valueLayout.C_LONG.withName("stop"),
            Interop.valueLayout.C_LONG.withName("time"),
            Interop.valueLayout.C_LONG.withName("position"),
            Interop.valueLayout.C_LONG.withName("duration"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Segment}
     * @return A new, uninitialized @{link Segment}
     */
    public static Segment allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Segment newInstance = new Segment(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.gst.SegmentFlags getFlags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.gst.SegmentFlags(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(org.gstreamer.gst.SegmentFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code rate}
     * @return The value of the field {@code rate}
     */
    public double getRate() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (double) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("rate"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code rate}
     * @param rate The new value of the field {@code rate}
     */
    public void setRate(double rate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("rate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), rate);
        }
    }
    
    /**
     * Get the value of the field {@code applied_rate}
     * @return The value of the field {@code applied_rate}
     */
    public double getAppliedRate() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (double) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("applied_rate"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code applied_rate}
     * @param appliedRate The new value of the field {@code applied_rate}
     */
    public void setAppliedRate(double appliedRate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("applied_rate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), appliedRate);
        }
    }
    
    /**
     * Get the value of the field {@code format}
     * @return The value of the field {@code format}
     */
    public org.gstreamer.gst.Format getFormat() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("format"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.gst.Format.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code format}
     * @param format The new value of the field {@code format}
     */
    public void setFormat(org.gstreamer.gst.Format format) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("format"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (format == null ? MemoryAddress.NULL : format.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code base}
     * @return The value of the field {@code base}
     */
    public long getBase() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code base}
     * @param base The new value of the field {@code base}
     */
    public void setBase(long base) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), base);
        }
    }
    
    /**
     * Get the value of the field {@code offset}
     * @return The value of the field {@code offset}
     */
    public long getOffset() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code offset}
     * @param offset The new value of the field {@code offset}
     */
    public void setOffset(long offset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), offset);
        }
    }
    
    /**
     * Get the value of the field {@code start}
     * @return The value of the field {@code start}
     */
    public long getStart() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(long start) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), start);
        }
    }
    
    /**
     * Get the value of the field {@code stop}
     * @return The value of the field {@code stop}
     */
    public long getStop() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code stop}
     * @param stop The new value of the field {@code stop}
     */
    public void setStop(long stop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), stop);
        }
    }
    
    /**
     * Get the value of the field {@code time}
     * @return The value of the field {@code time}
     */
    public long getTime() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code time}
     * @param time The new value of the field {@code time}
     */
    public void setTime(long time) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), time);
        }
    }
    
    /**
     * Get the value of the field {@code position}
     * @return The value of the field {@code position}
     */
    public long getPosition() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("position"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code position}
     * @param position The new value of the field {@code position}
     */
    public void setPosition(long position) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("position"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), position);
        }
    }
    
    /**
     * Get the value of the field {@code duration}
     * @return The value of the field {@code duration}
     */
    public long getDuration() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duration"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code duration}
     * @param duration The new value of the field {@code duration}
     */
    public void setDuration(long duration) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duration"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), duration);
        }
    }
    
    /**
     * Create a Segment proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Segment(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Segment> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Segment(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_segment_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocate a new {@link Segment} structure and initialize it using
     * gst_segment_init().
     * <p>
     * Free-function: gst_segment_free
     */
    public Segment() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Clip the given {@code start} and {@code stop} values to the segment boundaries given
     * in {@code segment}. {@code start} and {@code stop} are compared and clipped to {@code segment}
     * start and stop values.
     * <p>
     * If the function returns {@code false}, {@code start} and {@code stop} are known to fall
     * outside of {@code segment} and {@code clip_start} and {@code clip_stop} are not updated.
     * <p>
     * When the function returns {@code true}, {@code clip_start} and {@code clip_stop} will be
     * updated. If {@code clip_start} or {@code clip_stop} are different from {@code start} or {@code stop}
     * respectively, the region fell partially in the segment.
     * <p>
     * Note that when {@code stop} is -1, {@code clip_stop} will be set to the end of the
     * segment. Depending on the use case, this may or may not be what you want.
     * @param format the format of the segment.
     * @param start the start position in the segment
     * @param stop the stop position in the segment
     * @param clipStart the clipped start position in the segment
     * @param clipStop the clipped stop position in the segment
     * @return {@code true} if the given {@code start} and {@code stop} times fall partially or
     *     completely in {@code segment}, {@code false} if the values are completely outside
     *     of the segment.
     */
    public boolean clip(org.gstreamer.gst.Format format, long start, long stop, Out<Long> clipStart, Out<Long> clipStop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment clipStartPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment clipStopPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_segment_clip.invokeExact(
                        handle(),
                        format.getValue(),
                        start,
                        stop,
                        (Addressable) (clipStart == null ? MemoryAddress.NULL : (Addressable) clipStartPOINTER.address()),
                        (Addressable) (clipStop == null ? MemoryAddress.NULL : (Addressable) clipStopPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (clipStart != null) clipStart.set(clipStartPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (clipStop != null) clipStop.set(clipStopPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Create a copy of given {@code segment}.
     * <p>
     * Free-function: gst_segment_free
     * @return a new {@link Segment}, free with gst_segment_free().
     */
    public org.gstreamer.gst.Segment copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_segment_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Segment.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Copy the contents of {@code src} into {@code dest}.
     * @param dest a {@link Segment}
     */
    public void copyInto(org.gstreamer.gst.Segment dest) {
        try {
            DowncallHandles.gst_segment_copy_into.invokeExact(
                    handle(),
                    dest.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Update the segment structure with the field values of a seek event (see
     * gst_event_new_seek()).
     * <p>
     * After calling this method, the segment field position and time will
     * contain the requested new position in the segment. The new requested
     * position in the segment depends on {@code rate} and {@code start_type} and {@code stop_type}.
     * <p>
     * For positive {@code rate}, the new position in the segment is the new {@code segment}
     * start field when it was updated with a {@code start_type} different from
     * {@code GST_SEEK_TYPE_NONE}. If no update was performed on {@code segment} start position
     * ({@code GST_SEEK_TYPE_NONE}), {@code start} is ignored and {@code segment} position is
     * unmodified.
     * <p>
     * For negative {@code rate}, the new position in the segment is the new {@code segment}
     * stop field when it was updated with a {@code stop_type} different from
     * {@code GST_SEEK_TYPE_NONE}. If no stop was previously configured in the segment, the
     * duration of the segment will be used to update the stop position.
     * If no update was performed on {@code segment} stop position ({@code GST_SEEK_TYPE_NONE}),
     * {@code stop} is ignored and {@code segment} position is unmodified.
     * <p>
     * The applied rate of the segment will be set to 1.0 by default.
     * If the caller can apply a rate change, it should update {@code segment}
     * rate and applied_rate after calling this function.
     * <p>
     * {@code update} will be set to {@code true} if a seek should be performed to the segment
     * position field. This field can be {@code false} if, for example, only the {@code rate}
     * has been changed but not the playback position.
     * @param rate the rate of the segment.
     * @param format the format of the segment.
     * @param flags the segment flags for the segment
     * @param startType the seek method
     * @param start the seek start value
     * @param stopType the seek method
     * @param stop the seek stop value
     * @param update boolean holding whether position was updated.
     * @return {@code true} if the seek could be performed.
     */
    public boolean doSeek(double rate, org.gstreamer.gst.Format format, org.gstreamer.gst.SeekFlags flags, org.gstreamer.gst.SeekType startType, long start, org.gstreamer.gst.SeekType stopType, long stop, Out<Boolean> update) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment updatePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_segment_do_seek.invokeExact(
                        handle(),
                        rate,
                        format.getValue(),
                        flags.getValue(),
                        startType.getValue(),
                        start,
                        stopType.getValue(),
                        stop,
                        (Addressable) (update == null ? MemoryAddress.NULL : (Addressable) updatePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (update != null) update.set(updatePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Free the allocated segment {@code segment}.
     */
    public void free() {
        try {
            DowncallHandles.gst_segment_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * The start/position fields are set to 0 and the stop/duration
     * fields are set to -1 (unknown). The default rate of 1.0 and no
     * flags are set.
     * <p>
     * Initialize {@code segment} to its default values.
     * @param format the format of the segment.
     */
    public void init(org.gstreamer.gst.Format format) {
        try {
            DowncallHandles.gst_segment_init.invokeExact(
                    handle(),
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks for two segments being equal. Equality here is defined
     * as perfect equality, including floating point values.
     * @param s1 a {@link Segment} structure.
     * @return {@code true} if the segments are equal, {@code false} otherwise.
     */
    public boolean isEqual(org.gstreamer.gst.Segment s1) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_segment_is_equal.invokeExact(
                    handle(),
                    s1.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Adjust the values in {@code segment} so that {@code offset} is applied to all
     * future running-time calculations.
     * @param format the format of the segment.
     * @param offset the offset to apply in the segment
     * @return {@code true} if the segment could be updated successfully. If {@code false} is
     * returned, {@code offset} is not in {@code segment}.
     */
    public boolean offsetRunningTime(org.gstreamer.gst.Format format, long offset) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_segment_offset_running_time.invokeExact(
                    handle(),
                    format.getValue(),
                    offset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Convert {@code running_time} into a position in the segment so that
     * gst_segment_to_running_time() with that position returns {@code running_time}.
     * @param format the format of the segment.
     * @param runningTime the running_time in the segment
     * @return the position in the segment for {@code running_time}. This function returns
     * -1 when {@code running_time} is -1 or when it is not inside {@code segment}.
     */
    public long positionFromRunningTime(org.gstreamer.gst.Format format, long runningTime) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_segment_position_from_running_time.invokeExact(
                    handle(),
                    format.getValue(),
                    runningTime);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Translate {@code running_time} to the segment position using the currently configured
     * segment. Compared to gst_segment_position_from_running_time() this function can
     * return negative segment position.
     * <p>
     * This function is typically used by elements that need to synchronize buffers
     * against the clock or each other.
     * <p>
     * {@code running_time} can be any value and the result of this function for values
     * outside of the segment is extrapolated.
     * <p>
     * When 1 is returned, {@code running_time} resulted in a positive position returned
     * in {@code position}.
     * <p>
     * When this function returns -1, the returned {@code position} was &lt; 0, and the value
     * in the position variable should be negated to get the real negative segment
     * position.
     * @param format the format of the segment.
     * @param runningTime the running-time
     * @param position the resulting position in the segment
     * @return a 1 or -1 on success, 0 on failure.
     */
    public int positionFromRunningTimeFull(org.gstreamer.gst.Format format, long runningTime, Out<Long> position) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment positionPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_segment_position_from_running_time_full.invokeExact(
                        handle(),
                        format.getValue(),
                        runningTime,
                        (Addressable) positionPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    position.set(positionPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return RESULT;
        }
    }
    
    /**
     * Convert {@code stream_time} into a position in the segment so that
     * gst_segment_to_stream_time() with that position returns {@code stream_time}.
     * @param format the format of the segment.
     * @param streamTime the stream_time in the segment
     * @return the position in the segment for {@code stream_time}. This function returns
     * -1 when {@code stream_time} is -1 or when it is not inside {@code segment}.
     */
    public long positionFromStreamTime(org.gstreamer.gst.Format format, long streamTime) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_segment_position_from_stream_time.invokeExact(
                    handle(),
                    format.getValue(),
                    streamTime);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Translate {@code stream_time} to the segment position using the currently configured
     * segment. Compared to gst_segment_position_from_stream_time() this function can
     * return negative segment position.
     * <p>
     * This function is typically used by elements that need to synchronize buffers
     * against the clock or each other.
     * <p>
     * {@code stream_time} can be any value and the result of this function for values outside
     * of the segment is extrapolated.
     * <p>
     * When 1 is returned, {@code stream_time} resulted in a positive position returned
     * in {@code position}.
     * <p>
     * When this function returns -1, the returned {@code position} should be negated
     * to get the real negative segment position.
     * @param format the format of the segment.
     * @param streamTime the stream-time
     * @param position the resulting position in the segment
     * @return a 1 or -1 on success, 0 on failure.
     */
    public int positionFromStreamTimeFull(org.gstreamer.gst.Format format, long streamTime, Out<Long> position) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment positionPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_segment_position_from_stream_time_full.invokeExact(
                        handle(),
                        format.getValue(),
                        streamTime,
                        (Addressable) positionPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    position.set(positionPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return RESULT;
        }
    }
    
    /**
     * Adjust the start/stop and base values of {@code segment} such that the next valid
     * buffer will be one with {@code running_time}.
     * @param format the format of the segment.
     * @param runningTime the running_time in the segment
     * @return {@code true} if the segment could be updated successfully. If {@code false} is
     * returned, {@code running_time} is -1 or not in {@code segment}.
     */
    public boolean setRunningTime(org.gstreamer.gst.Format format, long runningTime) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_segment_set_running_time.invokeExact(
                    handle(),
                    format.getValue(),
                    runningTime);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Convert {@code running_time} into a position in the segment so that
     * gst_segment_to_running_time() with that position returns {@code running_time}.
     * @param format the format of the segment.
     * @param runningTime the running_time in the segment
     * @return the position in the segment for {@code running_time}. This function returns
     * -1 when {@code running_time} is -1 or when it is not inside {@code segment}.
     * @deprecated Use gst_segment_position_from_running_time() instead.
     */
    @Deprecated
    public long toPosition(org.gstreamer.gst.Format format, long runningTime) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_segment_to_position.invokeExact(
                    handle(),
                    format.getValue(),
                    runningTime);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Translate {@code position} to the total running time using the currently configured
     * segment. Position is a value between {@code segment} start and stop time.
     * <p>
     * This function is typically used by elements that need to synchronize to the
     * global clock in a pipeline. The running time is a constantly increasing value
     * starting from 0. When gst_segment_init() is called, this value will reset to
     * 0.
     * <p>
     * This function returns -1 if the position is outside of {@code segment} start and stop.
     * @param format the format of the segment.
     * @param position the position in the segment
     * @return the position as the total running time or -1 when an invalid position
     * was given.
     */
    public long toRunningTime(org.gstreamer.gst.Format format, long position) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_segment_to_running_time.invokeExact(
                    handle(),
                    format.getValue(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Translate {@code position} to the total running time using the currently configured
     * segment. Compared to gst_segment_to_running_time() this function can return
     * negative running-time.
     * <p>
     * This function is typically used by elements that need to synchronize buffers
     * against the clock or each other.
     * <p>
     * {@code position} can be any value and the result of this function for values outside
     * of the segment is extrapolated.
     * <p>
     * When 1 is returned, {@code position} resulted in a positive running-time returned
     * in {@code running_time}.
     * <p>
     * When this function returns -1, the returned {@code running_time} should be negated
     * to get the real negative running time.
     * @param format the format of the segment.
     * @param position the position in the segment
     * @param runningTime result running-time
     * @return a 1 or -1 on success, 0 on failure.
     */
    public int toRunningTimeFull(org.gstreamer.gst.Format format, long position, Out<Long> runningTime) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment runningTimePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_segment_to_running_time_full.invokeExact(
                        handle(),
                        format.getValue(),
                        position,
                        (Addressable) (runningTime == null ? MemoryAddress.NULL : (Addressable) runningTimePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (runningTime != null) runningTime.set(runningTimePOINTER.get(Interop.valueLayout.C_LONG, 0));
            return RESULT;
        }
    }
    
    /**
     * Translate {@code position} to stream time using the currently configured
     * segment. The {@code position} value must be between {@code segment} start and
     * stop value.
     * <p>
     * This function is typically used by elements that need to operate on
     * the stream time of the buffers it receives, such as effect plugins.
     * In those use cases, {@code position} is typically the buffer timestamp or
     * clock time that one wants to convert to the stream time.
     * The stream time is always between 0 and the total duration of the
     * media stream.
     * @param format the format of the segment.
     * @param position the position in the segment
     * @return the position in stream_time or -1 when an invalid position
     * was given.
     */
    public long toStreamTime(org.gstreamer.gst.Format format, long position) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_segment_to_stream_time.invokeExact(
                    handle(),
                    format.getValue(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Translate {@code position} to the total stream time using the currently configured
     * segment. Compared to gst_segment_to_stream_time() this function can return
     * negative stream-time.
     * <p>
     * This function is typically used by elements that need to synchronize buffers
     * against the clock or each other.
     * <p>
     * {@code position} can be any value and the result of this function for values outside
     * of the segment is extrapolated.
     * <p>
     * When 1 is returned, {@code position} resulted in a positive stream-time returned
     * in {@code stream_time}.
     * <p>
     * When this function returns -1, the returned {@code stream_time} should be negated
     * to get the real negative stream time.
     * @param format the format of the segment.
     * @param position the position in the segment
     * @param streamTime result stream-time
     * @return a 1 or -1 on success, 0 on failure.
     */
    public int toStreamTimeFull(org.gstreamer.gst.Format format, long position, Out<Long> streamTime) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment streamTimePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_segment_to_stream_time_full.invokeExact(
                        handle(),
                        format.getValue(),
                        position,
                        (Addressable) streamTimePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    streamTime.set(streamTimePOINTER.get(Interop.valueLayout.C_LONG, 0));
            return RESULT;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_segment_new = Interop.downcallHandle(
                "gst_segment_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_segment_clip = Interop.downcallHandle(
                "gst_segment_clip",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_segment_copy = Interop.downcallHandle(
                "gst_segment_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_segment_copy_into = Interop.downcallHandle(
                "gst_segment_copy_into",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_segment_do_seek = Interop.downcallHandle(
                "gst_segment_do_seek",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_segment_free = Interop.downcallHandle(
                "gst_segment_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_segment_init = Interop.downcallHandle(
                "gst_segment_init",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_segment_is_equal = Interop.downcallHandle(
                "gst_segment_is_equal",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_segment_offset_running_time = Interop.downcallHandle(
                "gst_segment_offset_running_time",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_segment_position_from_running_time = Interop.downcallHandle(
                "gst_segment_position_from_running_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_segment_position_from_running_time_full = Interop.downcallHandle(
                "gst_segment_position_from_running_time_full",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_segment_position_from_stream_time = Interop.downcallHandle(
                "gst_segment_position_from_stream_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_segment_position_from_stream_time_full = Interop.downcallHandle(
                "gst_segment_position_from_stream_time_full",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_segment_set_running_time = Interop.downcallHandle(
                "gst_segment_set_running_time",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_segment_to_position = Interop.downcallHandle(
                "gst_segment_to_position",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_segment_to_running_time = Interop.downcallHandle(
                "gst_segment_to_running_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_segment_to_running_time_full = Interop.downcallHandle(
                "gst_segment_to_running_time_full",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_segment_to_stream_time = Interop.downcallHandle(
                "gst_segment_to_stream_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_segment_to_stream_time_full = Interop.downcallHandle(
                "gst_segment_to_stream_time_full",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Segment.Builder} object constructs a {@link Segment} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Segment.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Segment struct;
        
        private Builder() {
            struct = Segment.allocate();
        }
        
        /**
         * Finish building the {@link Segment} struct.
         * @return A new instance of {@code Segment} with the fields 
         *         that were set in the Builder object.
         */
        public Segment build() {
            return struct;
        }
        
        /**
         * flags for this segment
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gstreamer.gst.SegmentFlags flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
                return this;
            }
        }
        
        /**
         * the playback rate of the segment is set in response to a seek
         *                event and, without any seek, the value should be {@code 1.0}. This
         *                value is used by elements that synchronize buffer [running
         *                times](additional/design/synchronisation.md{@code running}-time) on
         *                the clock (usually the sink elements), leading to consuming
         *                buffers faster (for a value {@code > 1.0}) or slower (for {@code 0.0 <
         *                value < 1.0}) than normal playback speed. The rate also
         *                defines the playback direction, meaning that when the value is
         *                lower than {@code 0.0}, the playback happens in reverse, and the
         *                <a href="additional/design/synchronisation.md#stream-time">stream-time</a>
         *                is going backward. The {@code rate} value should never be {@code 0.0}.
         * @param rate The value for the {@code rate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRate(double rate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("rate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), rate);
                return this;
            }
        }
        
        /**
         * The applied rate is the rate that has been applied to the stream.
         *                The effective/resulting playback rate of a stream is
         *                {@code rate * applied_rate}.
         *                The applied rate can be set by source elements when a server is
         *                sending the stream with an already modified playback speed
         *                rate. Filter elements that modify the stream in a way that
         *                modifies the playback speed should also modify the applied
         *                rate. For example the {@code videorate} element when its
         *                {@code videorate}:rate property is set will set the applied rate of
         *                the segment it pushed downstream. Also {@code scaletempo} applies the
         *                input segment rate to the stream and outputs a segment with
         *                rate=1.0 and applied_rate=&lt;inputsegment.rate&gt;.
         * @param appliedRate The value for the {@code appliedRate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAppliedRate(double appliedRate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("applied_rate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), appliedRate);
                return this;
            }
        }
        
        /**
         * the unit used for all of the segment's values.
         * @param format The value for the {@code format} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFormat(org.gstreamer.gst.Format format) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("format"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (format == null ? MemoryAddress.NULL : format.getValue()));
                return this;
            }
        }
        
        /**
         * the running time (plus elapsed time, see offset) of the
         *                segment <a href="GstSegment.start">start</a> (<a href="GstSegment.stop">stop</a> if
         *                rate &lt; 0.0).
         * @param base The value for the {@code base} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBase(long base) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("base"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), base);
                return this;
            }
        }
        
        /**
         * the offset expresses the elapsed time (in buffer timestamps)
         *                before a seek with its start (stop if rate &lt; 0.0) seek type
         *                set to {@code GST_SEEK_TYPE_NONE}, the value is set to the position
         *                of the segment at the time of the seek.
         * @param offset The value for the {@code offset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOffset(long offset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), offset);
                return this;
            }
        }
        
        /**
         * the start time of the segment (in buffer timestamps)
         *                <a href="GstBuffer.pts">(PTS)</a>, that is the timestamp of the first
         *                buffer to output inside the segment (last one during
         *                reverse playback). For example decoders will
         *                <a href="gst_segment_clip">clip</a> out the buffers before the start
         *                time.
         * @param start The value for the {@code start} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStart(long start) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), start);
                return this;
            }
        }
        
        /**
         * the stop time of the segment (in buffer timestamps)
         *                <a href="GstBuffer.pts">(PTS)</a>, that is the timestamp of the last
         *                buffer to output inside the segment (first one during
         *                reverse playback). For example decoders will
         *                <a href="gst_segment_clip">clip</a> out buffers after the stop time.
         * @param stop The value for the {@code stop} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStop(long stop) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), stop);
                return this;
            }
        }
        
        /**
         * the stream time of the segment <a href="GstSegment.start">start</a>
         *                (<a href="GstSegment.stop">stop</a> if rate &lt; 0.0).
         * @param time The value for the {@code time} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTime(long time) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("time"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), time);
                return this;
            }
        }
        
        /**
         * the buffer timestamp position in the segment is supposed to be
         *                updated by elements such as sources, demuxers or parsers to
         *                track progress by setting it to the last pushed buffer' end time
         *                (<a href="GstBuffer.pts">timestamp</a> + {@link Buffer}.duration) for that
         *                specific segment. The position is used when reconfiguring the
         *                segment with {@code gst_segment_do_seek} when the seek is only
         *                updating the segment (see <a href="GstSegment.offset">offset</a>).
         * @param position The value for the {@code position} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPosition(long position) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("position"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), position);
                return this;
            }
        }
        
        /**
         * the duration of the segment is the maximum absolute difference
         *                between {@link Segment}.start and {@link Segment}.stop if stop is not
         *                set, otherwise it should be the difference between those
         *                two values. This should be set by elements that know the
         *                overall stream duration (like demuxers) and will be used when
         *                seeking with {@code GST_SEEK_TYPE_END}.
         * @param duration The value for the {@code duration} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDuration(long duration) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("duration"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), duration);
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
