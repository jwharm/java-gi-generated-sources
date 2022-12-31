package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link AudioStreamAlign} provides a helper object that helps tracking audio
 * stream alignment and discontinuities, and detects discontinuities if
 * possible.
 * <p>
 * See gst_audio_stream_align_new() for a description of its parameters and
 * gst_audio_stream_align_process() for the details of the processing.
 * @version 1.14
 */
public class AudioStreamAlign extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioStreamAlign";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioStreamAlign}
     * @return A new, uninitialized @{link AudioStreamAlign}
     */
    public static AudioStreamAlign allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioStreamAlign newInstance = new AudioStreamAlign(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AudioStreamAlign proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioStreamAlign(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioStreamAlign> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioStreamAlign(input, ownership);
    
    private static MemoryAddress constructNew(int rate, org.gstreamer.gst.ClockTime alignmentThreshold, org.gstreamer.gst.ClockTime discontWait) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_stream_align_new.invokeExact(
                    rate,
                    alignmentThreshold.getValue().longValue(),
                    discontWait.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocate a new {@link AudioStreamAlign} with the given configuration. All
     * processing happens according to sample rate {@code rate}, until
     * gst_audio_stream_align_set_rate() is called with a new {@code rate}.
     * A negative rate can be used for reverse playback.
     * <p>
     * {@code alignment_threshold} gives the tolerance in nanoseconds after which a
     * timestamp difference is considered a discontinuity. Once detected,
     * {@code discont_wait} nanoseconds have to pass without going below the threshold
     * again until the output buffer is marked as a discontinuity. These can later
     * be re-configured with gst_audio_stream_align_set_alignment_threshold() and
     * gst_audio_stream_align_set_discont_wait().
     * @param rate a sample rate
     * @param alignmentThreshold a alignment threshold in nanoseconds
     * @param discontWait discont wait in nanoseconds
     */
    public AudioStreamAlign(int rate, org.gstreamer.gst.ClockTime alignmentThreshold, org.gstreamer.gst.ClockTime discontWait) {
        super(constructNew(rate, alignmentThreshold, discontWait), Ownership.FULL);
    }
    
    /**
     * Copy a GstAudioStreamAlign structure.
     * @return a new {@link AudioStreamAlign}. free with gst_audio_stream_align_free.
     */
    public org.gstreamer.audio.AudioStreamAlign copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_stream_align_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.audio.AudioStreamAlign.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Free a GstAudioStreamAlign structure previously allocated with gst_audio_stream_align_new()
     * or gst_audio_stream_align_copy().
     */
    public void free() {
        try {
            DowncallHandles.gst_audio_stream_align_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the currently configured alignment threshold.
     * @return The currently configured alignment threshold
     */
    public org.gstreamer.gst.ClockTime getAlignmentThreshold() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_stream_align_get_alignment_threshold.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Gets the currently configured discont wait.
     * @return The currently configured discont wait
     */
    public org.gstreamer.gst.ClockTime getDiscontWait() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_stream_align_get_discont_wait.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Gets the currently configured sample rate.
     * @return The currently configured sample rate
     */
    public int getRate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_stream_align_get_rate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the number of samples that were processed since the last
     * discontinuity was detected.
     * @return The number of samples processed since the last discontinuity.
     */
    public long getSamplesSinceDiscont() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_stream_align_get_samples_since_discont.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Timestamp that was passed when a discontinuity was detected, i.e. the first
     * timestamp after the discontinuity.
     * @return The last timestamp at when a discontinuity was detected
     */
    public org.gstreamer.gst.ClockTime getTimestampAtDiscont() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_stream_align_get_timestamp_at_discont.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Marks the next buffer as discontinuous and resets timestamp tracking.
     */
    public void markDiscont() {
        try {
            DowncallHandles.gst_audio_stream_align_mark_discont.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Processes data with {@code timestamp} and {@code n_samples}, and returns the output
     * timestamp, duration and sample position together with a boolean to signal
     * whether a discontinuity was detected or not. All non-discontinuous data
     * will have perfect timestamps and durations.
     * <p>
     * A discontinuity is detected once the difference between the actual
     * timestamp and the timestamp calculated from the sample count since the last
     * discontinuity differs by more than the alignment threshold for a duration
     * longer than discont wait.
     * <p>
     * Note: In reverse playback, every buffer is considered discontinuous in the
     * context of buffer flags because the last sample of the previous buffer is
     * discontinuous with the first sample of the current one. However for this
     * function they are only considered discontinuous in reverse playback if the
     * first sample of the previous buffer is discontinuous with the last sample
     * of the current one.
     * @param discont if this data is considered to be discontinuous
     * @param timestamp a {@link org.gstreamer.gst.ClockTime} of the start of the data
     * @param nSamples number of samples to process
     * @param outTimestamp output timestamp of the data
     * @param outDuration output duration of the data
     * @param outSamplePosition output sample position of the start of the data
     * @return {@code true} if a discontinuity was detected, {@code false} otherwise.
     */
    public boolean process(boolean discont, org.gstreamer.gst.ClockTime timestamp, int nSamples, org.gstreamer.gst.ClockTime outTimestamp, org.gstreamer.gst.ClockTime outDuration, Out<Long> outSamplePosition) {
        MemorySegment outTimestampPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment outDurationPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment outSamplePositionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_stream_align_process.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(discont, null).intValue(),
                    timestamp.getValue().longValue(),
                    nSamples,
                    (Addressable) outTimestampPOINTER.address(),
                    (Addressable) outDurationPOINTER.address(),
                    (Addressable) outSamplePositionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outTimestamp.setValue(outTimestampPOINTER.get(Interop.valueLayout.C_LONG, 0));
        outDuration.setValue(outDurationPOINTER.get(Interop.valueLayout.C_LONG, 0));
        outSamplePosition.set(outSamplePositionPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets {@code alignment_treshold} as new alignment threshold for the following processing.
     * @param alignmentThreshold a new alignment threshold
     */
    public void setAlignmentThreshold(org.gstreamer.gst.ClockTime alignmentThreshold) {
        try {
            DowncallHandles.gst_audio_stream_align_set_alignment_threshold.invokeExact(
                    handle(),
                    alignmentThreshold.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code alignment_treshold} as new discont wait for the following processing.
     * @param discontWait a new discont wait
     */
    public void setDiscontWait(org.gstreamer.gst.ClockTime discontWait) {
        try {
            DowncallHandles.gst_audio_stream_align_set_discont_wait.invokeExact(
                    handle(),
                    discontWait.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code rate} as new sample rate for the following processing. If the sample
     * rate differs this implicitly marks the next data as discontinuous.
     * @param rate a new sample rate
     */
    public void setRate(int rate) {
        try {
            DowncallHandles.gst_audio_stream_align_set_rate.invokeExact(
                    handle(),
                    rate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_stream_align_new = Interop.downcallHandle(
            "gst_audio_stream_align_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_audio_stream_align_copy = Interop.downcallHandle(
            "gst_audio_stream_align_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_stream_align_free = Interop.downcallHandle(
            "gst_audio_stream_align_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_stream_align_get_alignment_threshold = Interop.downcallHandle(
            "gst_audio_stream_align_get_alignment_threshold",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_stream_align_get_discont_wait = Interop.downcallHandle(
            "gst_audio_stream_align_get_discont_wait",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_stream_align_get_rate = Interop.downcallHandle(
            "gst_audio_stream_align_get_rate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_stream_align_get_samples_since_discont = Interop.downcallHandle(
            "gst_audio_stream_align_get_samples_since_discont",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_stream_align_get_timestamp_at_discont = Interop.downcallHandle(
            "gst_audio_stream_align_get_timestamp_at_discont",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_stream_align_mark_discont = Interop.downcallHandle(
            "gst_audio_stream_align_mark_discont",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_stream_align_process = Interop.downcallHandle(
            "gst_audio_stream_align_process",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_stream_align_set_alignment_threshold = Interop.downcallHandle(
            "gst_audio_stream_align_set_alignment_threshold",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_audio_stream_align_set_discont_wait = Interop.downcallHandle(
            "gst_audio_stream_align_set_discont_wait",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_audio_stream_align_set_rate = Interop.downcallHandle(
            "gst_audio_stream_align_set_rate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
