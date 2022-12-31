package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code field_count} must be 0 for progressive video and 1 or 2 for interlaced.
 * <p>
 * A representation of a SMPTE time code.
 * <p>
 * {@code hours} must be positive and less than 24. Will wrap around otherwise.
 * {@code minutes} and {@code seconds} must be positive and less than 60.
 * {@code frames} must be less than or equal to {@code config}.fps_n / {@code config}.fps_d
 * These values are <em>NOT</em> automatically normalized.
 * @version 1.10
 */
public class VideoTimeCode extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoTimeCode";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.video.VideoTimeCodeConfig.getMemoryLayout().withName("config"),
            Interop.valueLayout.C_INT.withName("hours"),
            Interop.valueLayout.C_INT.withName("minutes"),
            Interop.valueLayout.C_INT.withName("seconds"),
            Interop.valueLayout.C_INT.withName("frames"),
            Interop.valueLayout.C_INT.withName("field_count")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoTimeCode}
     * @return A new, uninitialized @{link VideoTimeCode}
     */
    public static VideoTimeCode allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoTimeCode newInstance = new VideoTimeCode(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code config}
     * @return The value of the field {@code config}
     */
    public org.gstreamer.video.VideoTimeCodeConfig getConfig() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("config"));
        return org.gstreamer.video.VideoTimeCodeConfig.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code config}
     * @param config The new value of the field {@code config}
     */
    public void setConfig(org.gstreamer.video.VideoTimeCodeConfig config) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("config"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (config == null ? MemoryAddress.NULL : config.handle()));
    }
    
    /**
     * Get the value of the field {@code hours}
     * @return The value of the field {@code hours}
     */
    public int getHours() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hours"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code hours}
     * @param hours The new value of the field {@code hours}
     */
    public void setHours(int hours) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hours"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), hours);
    }
    
    /**
     * Get the value of the field {@code minutes}
     * @return The value of the field {@code minutes}
     */
    public int getMinutes() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minutes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code minutes}
     * @param minutes The new value of the field {@code minutes}
     */
    public void setMinutes(int minutes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minutes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minutes);
    }
    
    /**
     * Get the value of the field {@code seconds}
     * @return The value of the field {@code seconds}
     */
    public int getSeconds() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code seconds}
     * @param seconds The new value of the field {@code seconds}
     */
    public void setSeconds(int seconds) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), seconds);
    }
    
    /**
     * Get the value of the field {@code frames}
     * @return The value of the field {@code frames}
     */
    public int getFrames() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frames"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frames}
     * @param frames The new value of the field {@code frames}
     */
    public void setFrames(int frames) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frames"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frames);
    }
    
    /**
     * Get the value of the field {@code field_count}
     * @return The value of the field {@code field_count}
     */
    public int getFieldCount() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("field_count"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code field_count}
     * @param fieldCount The new value of the field {@code field_count}
     */
    public void setFieldCount(int fieldCount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("field_count"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), fieldCount);
    }
    
    /**
     * Create a VideoTimeCode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoTimeCode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoTimeCode> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoTimeCode(input, ownership);
    
    private static MemoryAddress constructNew(int fpsN, int fpsD, org.gtk.glib.DateTime latestDailyJam, org.gstreamer.video.VideoTimeCodeFlags flags, int hours, int minutes, int seconds, int frames, int fieldCount) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_new.invokeExact(
                    fpsN,
                    fpsD,
                    latestDailyJam.handle(),
                    flags.getValue(),
                    hours,
                    minutes,
                    seconds,
                    frames,
                    fieldCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * {@code field_count} is 0 for progressive, 1 or 2 for interlaced.
     * {@code latest_daiy_jam} reference is stolen from caller.
     * @param fpsN Numerator of the frame rate
     * @param fpsD Denominator of the frame rate
     * @param latestDailyJam The latest daily jam of the {@link VideoTimeCode}
     * @param flags {@link VideoTimeCodeFlags}
     * @param hours the hours field of {@link VideoTimeCode}
     * @param minutes the minutes field of {@link VideoTimeCode}
     * @param seconds the seconds field of {@link VideoTimeCode}
     * @param frames the frames field of {@link VideoTimeCode}
     * @param fieldCount Interlaced video field count
     */
    public VideoTimeCode(int fpsN, int fpsD, org.gtk.glib.DateTime latestDailyJam, org.gstreamer.video.VideoTimeCodeFlags flags, int hours, int minutes, int seconds, int frames, int fieldCount) {
        super(constructNew(fpsN, fpsD, latestDailyJam, flags, hours, minutes, seconds, frames, fieldCount), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_new_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static VideoTimeCode newEmpty() {
        var RESULT = constructNewEmpty();
        return org.gstreamer.video.VideoTimeCode.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromDateTime(int fpsN, int fpsD, org.gtk.glib.DateTime dt, org.gstreamer.video.VideoTimeCodeFlags flags, int fieldCount) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_new_from_date_time.invokeExact(
                    fpsN,
                    fpsD,
                    dt.handle(),
                    flags.getValue(),
                    fieldCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * The resulting config-&gt;latest_daily_jam is set to
     * midnight, and timecode is set to the given time.
     * <p>
     * This might return a completely invalid timecode, use
     * gst_video_time_code_new_from_date_time_full() to ensure
     * that you would get {@code null} instead in that case.
     * @param fpsN Numerator of the frame rate
     * @param fpsD Denominator of the frame rate
     * @param dt {@link org.gtk.glib.DateTime} to convert
     * @param flags {@link VideoTimeCodeFlags}
     * @param fieldCount Interlaced video field count
     * @return the {@link VideoTimeCode} representation of {@code dt}.
     */
    public static VideoTimeCode newFromDateTime(int fpsN, int fpsD, org.gtk.glib.DateTime dt, org.gstreamer.video.VideoTimeCodeFlags flags, int fieldCount) {
        var RESULT = constructNewFromDateTime(fpsN, fpsD, dt, flags, fieldCount);
        return org.gstreamer.video.VideoTimeCode.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromDateTimeFull(int fpsN, int fpsD, org.gtk.glib.DateTime dt, org.gstreamer.video.VideoTimeCodeFlags flags, int fieldCount) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_new_from_date_time_full.invokeExact(
                    fpsN,
                    fpsD,
                    dt.handle(),
                    flags.getValue(),
                    fieldCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * The resulting config-&gt;latest_daily_jam is set to
     * midnight, and timecode is set to the given time.
     * @param fpsN Numerator of the frame rate
     * @param fpsD Denominator of the frame rate
     * @param dt {@link org.gtk.glib.DateTime} to convert
     * @param flags {@link VideoTimeCodeFlags}
     * @param fieldCount Interlaced video field count
     * @return the {@link VideoTimeCode} representation of {@code dt}, or {@code null} if
     *   no valid timecode could be created.
     */
    public static VideoTimeCode newFromDateTimeFull(int fpsN, int fpsD, org.gtk.glib.DateTime dt, org.gstreamer.video.VideoTimeCodeFlags flags, int fieldCount) {
        var RESULT = constructNewFromDateTimeFull(fpsN, fpsD, dt, flags, fieldCount);
        return org.gstreamer.video.VideoTimeCode.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromString(java.lang.String tcStr) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_new_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(tcStr, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static VideoTimeCode newFromString(java.lang.String tcStr) {
        var RESULT = constructNewFromString(tcStr);
        return org.gstreamer.video.VideoTimeCode.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Adds or subtracts {@code frames} amount of frames to {@code tc}. tc needs to
     * contain valid data, as verified by gst_video_time_code_is_valid().
     * @param frames How many frames to add or subtract
     */
    public void addFrames(long frames) {
        try {
            DowncallHandles.gst_video_time_code_add_frames.invokeExact(
                    handle(),
                    frames);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This makes a component-wise addition of {@code tc_inter} to {@code tc}. For example,
     * adding ("01:02:03:04", "00:01:00:00") will return "01:03:03:04".
     * When it comes to drop-frame timecodes,
     * adding ("00:00:00;00", "00:01:00:00") will return "00:01:00;02"
     * because of drop-frame oddities. However,
     * adding ("00:09:00;02", "00:01:00:00") will return "00:10:00;00"
     * because this time we can have an exact minute.
     * @param tcInter The {@link VideoTimeCodeInterval} to add to {@code tc}.
     * The interval must contain valid values, except that for drop-frame
     * timecode, it may also contain timecodes which would normally
     * be dropped. These are then corrected to the next reasonable timecode.
     * @return A new {@link VideoTimeCode} with {@code tc_inter} added or {@code null}
     *   if the interval can't be added.
     */
    public @Nullable org.gstreamer.video.VideoTimeCode addInterval(org.gstreamer.video.VideoTimeCodeInterval tcInter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_add_interval.invokeExact(
                    handle(),
                    tcInter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoTimeCode.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Initializes {@code tc} with empty/zero/NULL values and frees any memory
     * it might currently use.
     */
    public void clear() {
        try {
            DowncallHandles.gst_video_time_code_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compares {@code tc1} and {@code tc2}. If both have latest daily jam information, it is
     * taken into account. Otherwise, it is assumed that the daily jam of both
     * {@code tc1} and {@code tc2} was at the same time. Both time codes must be valid.
     * @param tc2 another valid {@link VideoTimeCode}
     * @return 1 if {@code tc1} is after {@code tc2}, -1 if {@code tc1} is before {@code tc2}, 0 otherwise.
     */
    public int compare(org.gstreamer.video.VideoTimeCode tc2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_time_code_compare.invokeExact(
                    handle(),
                    tc2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public org.gstreamer.video.VideoTimeCode copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoTimeCode.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public long framesSinceDailyJam() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_time_code_frames_since_daily_jam.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Frees {@code tc}.
     */
    public void free() {
        try {
            DowncallHandles.gst_video_time_code_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds one frame to {@code tc}.
     */
    public void incrementFrame() {
        try {
            DowncallHandles.gst_video_time_code_increment_frame.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * {@code field_count} is 0 for progressive, 1 or 2 for interlaced.
     * {@code latest_daiy_jam} reference is stolen from caller.
     * <p>
     * Initializes {@code tc} with the given values.
     * The values are not checked for being in a valid range. To see if your
     * timecode actually has valid content, use gst_video_time_code_is_valid().
     * @param fpsN Numerator of the frame rate
     * @param fpsD Denominator of the frame rate
     * @param latestDailyJam The latest daily jam of the {@link VideoTimeCode}
     * @param flags {@link VideoTimeCodeFlags}
     * @param hours the hours field of {@link VideoTimeCode}
     * @param minutes the minutes field of {@link VideoTimeCode}
     * @param seconds the seconds field of {@link VideoTimeCode}
     * @param frames the frames field of {@link VideoTimeCode}
     * @param fieldCount Interlaced video field count
     */
    public void init(int fpsN, int fpsD, @Nullable org.gtk.glib.DateTime latestDailyJam, org.gstreamer.video.VideoTimeCodeFlags flags, int hours, int minutes, int seconds, int frames, int fieldCount) {
        try {
            DowncallHandles.gst_video_time_code_init.invokeExact(
                    handle(),
                    fpsN,
                    fpsD,
                    (Addressable) (latestDailyJam == null ? MemoryAddress.NULL : latestDailyJam.handle()),
                    flags.getValue(),
                    hours,
                    minutes,
                    seconds,
                    frames,
                    fieldCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The resulting config-&gt;latest_daily_jam is set to midnight, and timecode is
     * set to the given time.
     * <p>
     * Will assert on invalid parameters, use gst_video_time_code_init_from_date_time_full()
     * for being able to handle invalid parameters.
     * @param fpsN Numerator of the frame rate
     * @param fpsD Denominator of the frame rate
     * @param dt {@link org.gtk.glib.DateTime} to convert
     * @param flags {@link VideoTimeCodeFlags}
     * @param fieldCount Interlaced video field count
     */
    public void initFromDateTime(int fpsN, int fpsD, org.gtk.glib.DateTime dt, org.gstreamer.video.VideoTimeCodeFlags flags, int fieldCount) {
        try {
            DowncallHandles.gst_video_time_code_init_from_date_time.invokeExact(
                    handle(),
                    fpsN,
                    fpsD,
                    dt.handle(),
                    flags.getValue(),
                    fieldCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The resulting config-&gt;latest_daily_jam is set to
     * midnight, and timecode is set to the given time.
     * @param fpsN Numerator of the frame rate
     * @param fpsD Denominator of the frame rate
     * @param dt {@link org.gtk.glib.DateTime} to convert
     * @param flags {@link VideoTimeCodeFlags}
     * @param fieldCount Interlaced video field count
     * @return {@code true} if {@code tc} could be correctly initialized to a valid timecode
     */
    public boolean initFromDateTimeFull(int fpsN, int fpsD, org.gtk.glib.DateTime dt, org.gstreamer.video.VideoTimeCodeFlags flags, int fieldCount) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_time_code_init_from_date_time_full.invokeExact(
                    handle(),
                    fpsN,
                    fpsD,
                    dt.handle(),
                    flags.getValue(),
                    fieldCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean isValid() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_video_time_code_is_valid.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public long nsecSinceDailyJam() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_video_time_code_nsec_since_daily_jam.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * The {@code tc}.config-&gt;latest_daily_jam is required to be non-NULL.
     * @return the {@link org.gtk.glib.DateTime} representation of {@code tc} or {@code null} if {@code tc}
     *   has no daily jam.
     */
    public @Nullable org.gtk.glib.DateTime toDateTime() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_to_date_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_time_code_new = Interop.downcallHandle(
            "gst_video_time_code_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_time_code_new_empty = Interop.downcallHandle(
            "gst_video_time_code_new_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_time_code_new_from_date_time = Interop.downcallHandle(
            "gst_video_time_code_new_from_date_time",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_time_code_new_from_date_time_full = Interop.downcallHandle(
            "gst_video_time_code_new_from_date_time_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_time_code_new_from_string = Interop.downcallHandle(
            "gst_video_time_code_new_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_time_code_add_frames = Interop.downcallHandle(
            "gst_video_time_code_add_frames",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_video_time_code_add_interval = Interop.downcallHandle(
            "gst_video_time_code_add_interval",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_time_code_clear = Interop.downcallHandle(
            "gst_video_time_code_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_time_code_compare = Interop.downcallHandle(
            "gst_video_time_code_compare",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_time_code_copy = Interop.downcallHandle(
            "gst_video_time_code_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_time_code_frames_since_daily_jam = Interop.downcallHandle(
            "gst_video_time_code_frames_since_daily_jam",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_time_code_free = Interop.downcallHandle(
            "gst_video_time_code_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_time_code_increment_frame = Interop.downcallHandle(
            "gst_video_time_code_increment_frame",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_time_code_init = Interop.downcallHandle(
            "gst_video_time_code_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_time_code_init_from_date_time = Interop.downcallHandle(
            "gst_video_time_code_init_from_date_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_time_code_init_from_date_time_full = Interop.downcallHandle(
            "gst_video_time_code_init_from_date_time_full",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_video_time_code_is_valid = Interop.downcallHandle(
            "gst_video_time_code_is_valid",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_time_code_nsec_since_daily_jam = Interop.downcallHandle(
            "gst_video_time_code_nsec_since_daily_jam",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_time_code_to_date_time = Interop.downcallHandle(
            "gst_video_time_code_to_date_time",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_time_code_to_string = Interop.downcallHandle(
            "gst_video_time_code_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link VideoTimeCode.Builder} object constructs a {@link VideoTimeCode} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoTimeCode.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoTimeCode struct;
        
        private Builder() {
            struct = VideoTimeCode.allocate();
        }
        
         /**
         * Finish building the {@link VideoTimeCode} struct.
         * @return A new instance of {@code VideoTimeCode} with the fields 
         *         that were set in the Builder object.
         */
        public VideoTimeCode build() {
            return struct;
        }
        
        /**
         * the corresponding {@link VideoTimeCodeConfig}
         * @param config The value for the {@code config} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setConfig(org.gstreamer.video.VideoTimeCodeConfig config) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("config"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (config == null ? MemoryAddress.NULL : config.handle()));
            return this;
        }
        
        /**
         * the hours field of {@link VideoTimeCode}
         * @param hours The value for the {@code hours} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHours(int hours) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hours"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), hours);
            return this;
        }
        
        /**
         * the minutes field of {@link VideoTimeCode}
         * @param minutes The value for the {@code minutes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinutes(int minutes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("minutes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), minutes);
            return this;
        }
        
        /**
         * the seconds field of {@link VideoTimeCode}
         * @param seconds The value for the {@code seconds} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSeconds(int seconds) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), seconds);
            return this;
        }
        
        /**
         * the frames field of {@link VideoTimeCode}
         * @param frames The value for the {@code frames} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFrames(int frames) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frames"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frames);
            return this;
        }
        
        /**
         * Interlaced video field count
         * @param fieldCount The value for the {@code fieldCount} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFieldCount(int fieldCount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("field_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), fieldCount);
            return this;
        }
    }
}
