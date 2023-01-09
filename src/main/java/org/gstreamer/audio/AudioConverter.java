package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This object is used to convert audio samples from one format to another.
 * The object can perform conversion of:
 * <p>
 *  * audio format with optional dithering and noise shaping
 * <p>
 *  * audio samplerate
 * <p>
 *  * audio channels and channel layout
 * @version 1.8
 */
public class AudioConverter extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioConverter";
    
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
     * Allocate a new {@link AudioConverter}
     * @return A new, uninitialized @{link AudioConverter}
     */
    public static AudioConverter allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AudioConverter newInstance = new AudioConverter(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AudioConverter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioConverter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioConverter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioConverter(input);
    
    private static MemoryAddress constructNew(org.gstreamer.audio.AudioConverterFlags flags, org.gstreamer.audio.AudioInfo inInfo, org.gstreamer.audio.AudioInfo outInfo, @Nullable org.gstreamer.gst.Structure config) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_converter_new.invokeExact(
                    flags.getValue(),
                    inInfo.handle(),
                    outInfo.handle(),
                    (Addressable) (config == null ? MemoryAddress.NULL : config.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        config.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Create a new {@link AudioConverter} that is able to convert between {@code in} and {@code out}
     * audio formats.
     * <p>
     * {@code config} contains extra configuration options, see {@code GST_AUDIO_CONVERTER_OPT_*}
     * parameters for details about the options and values.
     * @param flags extra {@link AudioConverterFlags}
     * @param inInfo a source {@link AudioInfo}
     * @param outInfo a destination {@link AudioInfo}
     * @param config a {@link org.gstreamer.gst.Structure} with configuration options
     */
    public AudioConverter(org.gstreamer.audio.AudioConverterFlags flags, org.gstreamer.audio.AudioInfo inInfo, org.gstreamer.audio.AudioInfo outInfo, @Nullable org.gstreamer.gst.Structure config) {
        super(constructNew(flags, inInfo, outInfo, config));
        this.takeOwnership();
    }
    
    /**
     * Convenience wrapper around gst_audio_converter_samples(), which will
     * perform allocation of the output buffer based on the result from
     * gst_audio_converter_get_out_frames().
     * @param flags extra {@link AudioConverterFlags}
     * @param in input data
     * @param inSize size of {@code in}
     * @param out a pointer where
     *  the output data will be written
     * @param outSize a pointer where the size of {@code out} will be written
     * @return {@code true} is the conversion could be performed.
     */
    public boolean convert(org.gstreamer.audio.AudioConverterFlags flags, byte[] in, long inSize, Out<byte[]> out, Out<Long> outSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment outSizePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_audio_converter_convert.invokeExact(
                        handle(),
                        flags.getValue(),
                        Interop.allocateNativeArray(in, false, SCOPE),
                        inSize,
                        (Addressable) outPOINTER.address(),
                        (Addressable) outSizePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    outSize.set(outSizePOINTER.get(Interop.valueLayout.C_LONG, 0));
            out.set(MemorySegment.ofAddress(outPOINTER.get(Interop.valueLayout.ADDRESS, 0), outSize.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Free a previously allocated {@code convert} instance.
     */
    public void free() {
        try {
            DowncallHandles.gst_audio_converter_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the current configuration of {@code convert}.
     * @param inRate result input rate
     * @param outRate result output rate
     * @return a {@link org.gstreamer.gst.Structure} that remains valid for as long as {@code convert} is valid
     *   or until gst_audio_converter_update_config() is called.
     */
    public org.gstreamer.gst.Structure getConfig(Out<Integer> inRate, Out<Integer> outRate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment inRatePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment outRatePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_audio_converter_get_config.invokeExact(
                        handle(),
                        (Addressable) (inRate == null ? MemoryAddress.NULL : (Addressable) inRatePOINTER.address()),
                        (Addressable) (outRate == null ? MemoryAddress.NULL : (Addressable) outRatePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (inRate != null) inRate.set(inRatePOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (outRate != null) outRate.set(outRatePOINTER.get(Interop.valueLayout.C_INT, 0));
            return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Calculate how many input frames are currently needed by {@code convert} to produce
     * {@code out_frames} of output frames.
     * @param outFrames number of output frames
     * @return the number of input frames
     */
    public long getInFrames(long outFrames) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_converter_get_in_frames.invokeExact(
                    handle(),
                    outFrames);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the maximum number of input frames that the converter would
     * need before producing output.
     * @return the latency of {@code convert} as expressed in the number of
     * frames.
     */
    public long getMaxLatency() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_converter_get_max_latency.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Calculate how many output frames can be produced when {@code in_frames} input
     * frames are given to {@code convert}.
     * @param inFrames number of input frames
     * @return the number of output frames
     */
    public long getOutFrames(long inFrames) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_converter_get_out_frames.invokeExact(
                    handle(),
                    inFrames);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the audio converter will operate in passthrough mode.
     * The return value would be typically input to gst_base_transform_set_passthrough()
     * @return {@code true} when no conversion will actually occur.
     */
    public boolean isPassthrough() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_converter_is_passthrough.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Reset {@code convert} to the state it was when it was first created, clearing
     * any history it might currently have.
     */
    public void reset() {
        try {
            DowncallHandles.gst_audio_converter_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform the conversion with {@code in_frames} in {@code in} to {@code out_frames} in {@code out}
     * using {@code convert}.
     * <p>
     * In case the samples are interleaved, {@code in} and {@code out} must point to an
     * array with a single element pointing to a block of interleaved samples.
     * <p>
     * If non-interleaved samples are used, {@code in} and {@code out} must point to an
     * array with pointers to memory blocks, one for each channel.
     * <p>
     * {@code in} may be {@code null}, in which case {@code in_frames} of silence samples are processed
     * by the converter.
     * <p>
     * This function always produces {@code out_frames} of output and consumes {@code in_frames} of
     * input. Use gst_audio_converter_get_out_frames() and
     * gst_audio_converter_get_in_frames() to make sure {@code in_frames} and {@code out_frames}
     * are matching and {@code in} and {@code out} point to enough memory.
     * @param flags extra {@link AudioConverterFlags}
     * @param in input frames
     * @param inFrames number of input frames
     * @param out output frames
     * @param outFrames number of output frames
     * @return {@code true} is the conversion could be performed.
     */
    public boolean samples(org.gstreamer.audio.AudioConverterFlags flags, @Nullable java.lang.foreign.MemoryAddress in, long inFrames, @Nullable java.lang.foreign.MemoryAddress out, long outFrames) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_converter_samples.invokeExact(
                    handle(),
                    flags.getValue(),
                    (Addressable) (in == null ? MemoryAddress.NULL : (Addressable) in),
                    inFrames,
                    (Addressable) (out == null ? MemoryAddress.NULL : (Addressable) out),
                    outFrames);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the audio converter can perform the conversion in-place.
     * The return value would be typically input to gst_base_transform_set_in_place()
     * @return {@code true} when the conversion can be done in place.
     */
    public boolean supportsInplace() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_converter_supports_inplace.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set {@code in_rate}, {@code out_rate} and {@code config} as extra configuration for {@code convert}.
     * <p>
     * {@code in_rate} and {@code out_rate} specify the new sample rates of input and output
     * formats. A value of 0 leaves the sample rate unchanged.
     * <p>
     * {@code config} can be {@code null}, in which case, the current configuration is not
     * changed.
     * <p>
     * If the parameters in {@code config} can not be set exactly, this function returns
     * {@code false} and will try to update as much state as possible. The new state can
     * then be retrieved and refined with gst_audio_converter_get_config().
     * <p>
     * Look at the {@code GST_AUDIO_CONVERTER_OPT_*} fields to check valid configuration
     * option and values.
     * @param inRate input rate
     * @param outRate output rate
     * @param config a {@link org.gstreamer.gst.Structure} or {@code null}
     * @return {@code true} when the new parameters could be set
     */
    public boolean updateConfig(int inRate, int outRate, @Nullable org.gstreamer.gst.Structure config) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_converter_update_config.invokeExact(
                    handle(),
                    inRate,
                    outRate,
                    (Addressable) (config == null ? MemoryAddress.NULL : config.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        config.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_converter_new = Interop.downcallHandle(
                "gst_audio_converter_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_converter_convert = Interop.downcallHandle(
                "gst_audio_converter_convert",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_converter_free = Interop.downcallHandle(
                "gst_audio_converter_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_converter_get_config = Interop.downcallHandle(
                "gst_audio_converter_get_config",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_converter_get_in_frames = Interop.downcallHandle(
                "gst_audio_converter_get_in_frames",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_converter_get_max_latency = Interop.downcallHandle(
                "gst_audio_converter_get_max_latency",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_converter_get_out_frames = Interop.downcallHandle(
                "gst_audio_converter_get_out_frames",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_converter_is_passthrough = Interop.downcallHandle(
                "gst_audio_converter_is_passthrough",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_converter_reset = Interop.downcallHandle(
                "gst_audio_converter_reset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_converter_samples = Interop.downcallHandle(
                "gst_audio_converter_samples",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_converter_supports_inplace = Interop.downcallHandle(
                "gst_audio_converter_supports_inplace",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_converter_update_config = Interop.downcallHandle(
                "gst_audio_converter_update_config",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
