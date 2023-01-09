package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link AudioResampler} is a structure which holds the information
 * required to perform various kinds of resampling filtering.
 * @version 1.10
 */
public class AudioResampler extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioResampler";
    
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
     * Allocate a new {@link AudioResampler}
     * @return A new, uninitialized @{link AudioResampler}
     */
    public static AudioResampler allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AudioResampler newInstance = new AudioResampler(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AudioResampler proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioResampler(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioResampler> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioResampler(input);
    
    /**
     * Free a previously allocated {@link AudioResampler} {@code resampler}.
     */
    public void free() {
        try {
            DowncallHandles.gst_audio_resampler_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the number of input frames that would currently be needed
     * to produce {@code out_frames} from {@code resampler}.
     * @param outFrames number of input frames
     * @return The number of input frames needed for producing
     * {@code out_frames} of data from {@code resampler}.
     */
    public long getInFrames(long outFrames) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_resampler_get_in_frames.invokeExact(
                    handle(),
                    outFrames);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the maximum number of input samples that the resampler would
     * need before producing output.
     * @return the latency of {@code resampler} as expressed in the number of
     * frames.
     */
    public long getMaxLatency() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_resampler_get_max_latency.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the number of output frames that would be currently available when
     * {@code in_frames} are given to {@code resampler}.
     * @param inFrames number of input frames
     * @return The number of frames that would be available after giving
     * {@code in_frames} as input to {@code resampler}.
     */
    public long getOutFrames(long inFrames) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_resampler_get_out_frames.invokeExact(
                    handle(),
                    inFrames);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Perform resampling on {@code in_frames} frames in {@code in} and write {@code out_frames} to {@code out}.
     * <p>
     * In case the samples are interleaved, {@code in} and {@code out} must point to an
     * array with a single element pointing to a block of interleaved samples.
     * <p>
     * If non-interleaved samples are used, {@code in} and {@code out} must point to an
     * array with pointers to memory blocks, one for each channel.
     * <p>
     * {@code in} may be {@code null}, in which case {@code in_frames} of silence samples are pushed
     * into the resampler.
     * <p>
     * This function always produces {@code out_frames} of output and consumes {@code in_frames} of
     * input. Use gst_audio_resampler_get_out_frames() and
     * gst_audio_resampler_get_in_frames() to make sure {@code in_frames} and {@code out_frames}
     * are matching and {@code in} and {@code out} point to enough memory.
     * @param in input samples
     * @param inFrames number of input frames
     * @param out output samples
     * @param outFrames number of output frames
     */
    public void resample(@Nullable java.lang.foreign.MemoryAddress in, long inFrames, @Nullable java.lang.foreign.MemoryAddress out, long outFrames) {
        try {
            DowncallHandles.gst_audio_resampler_resample.invokeExact(
                    handle(),
                    (Addressable) (in == null ? MemoryAddress.NULL : (Addressable) in),
                    inFrames,
                    (Addressable) (out == null ? MemoryAddress.NULL : (Addressable) out),
                    outFrames);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reset {@code resampler} to the state it was when it was first created, discarding
     * all sample history.
     */
    public void reset() {
        try {
            DowncallHandles.gst_audio_resampler_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Update the resampler parameters for {@code resampler}. This function should
     * not be called concurrently with any other function on {@code resampler}.
     * <p>
     * When {@code in_rate} or {@code out_rate} is 0, its value is unchanged.
     * <p>
     * When {@code options} is {@code null}, the previously configured options are reused.
     * @param inRate new input rate
     * @param outRate new output rate
     * @param options new options or {@code null}
     * @return {@code true} if the new parameters could be set
     */
    public boolean update(int inRate, int outRate, org.gstreamer.gst.Structure options) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_resampler_update.invokeExact(
                    handle(),
                    inRate,
                    outRate,
                    options.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Make a new resampler.
     * @param method a {@link AudioResamplerMethod}
     * @param flags {@link AudioResamplerFlags}
     * @param format the {@link AudioFormat}
     * @param channels the number of channels
     * @param inRate input rate
     * @param outRate output rate
     * @param options extra options
     * @return The new {@link AudioResampler}, or
     * {@code null} on failure.
     */
    public static org.gstreamer.audio.AudioResampler new_(org.gstreamer.audio.AudioResamplerMethod method, org.gstreamer.audio.AudioResamplerFlags flags, org.gstreamer.audio.AudioFormat format, int channels, int inRate, int outRate, org.gstreamer.gst.Structure options) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_resampler_new.invokeExact(
                    method.getValue(),
                    flags.getValue(),
                    format.getValue(),
                    channels,
                    inRate,
                    outRate,
                    options.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.audio.AudioResampler.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Set the parameters for resampling from {@code in_rate} to {@code out_rate} using {@code method}
     * for {@code quality} in {@code options}.
     * @param method a {@link AudioResamplerMethod}
     * @param quality the quality
     * @param inRate the input rate
     * @param outRate the output rate
     * @param options a {@link org.gstreamer.gst.Structure}
     */
    public static void optionsSetQuality(org.gstreamer.audio.AudioResamplerMethod method, int quality, int inRate, int outRate, org.gstreamer.gst.Structure options) {
        try {
            DowncallHandles.gst_audio_resampler_options_set_quality.invokeExact(
                    method.getValue(),
                    quality,
                    inRate,
                    outRate,
                    options.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_resampler_free = Interop.downcallHandle(
                "gst_audio_resampler_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_resampler_get_in_frames = Interop.downcallHandle(
                "gst_audio_resampler_get_in_frames",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_resampler_get_max_latency = Interop.downcallHandle(
                "gst_audio_resampler_get_max_latency",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_resampler_get_out_frames = Interop.downcallHandle(
                "gst_audio_resampler_get_out_frames",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_resampler_resample = Interop.downcallHandle(
                "gst_audio_resampler_resample",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_resampler_reset = Interop.downcallHandle(
                "gst_audio_resampler_reset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_resampler_update = Interop.downcallHandle(
                "gst_audio_resampler_update",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_resampler_new = Interop.downcallHandle(
                "gst_audio_resampler_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_resampler_options_set_quality = Interop.downcallHandle(
                "gst_audio_resampler_options_set_quality",
                FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
