package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AudioQuantize extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioQuantize";
    
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
     * Allocate a new {@link AudioQuantize}
     * @return A new, uninitialized @{link AudioQuantize}
     */
    public static AudioQuantize allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioQuantize newInstance = new AudioQuantize(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AudioQuantize proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioQuantize(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Free a {@link AudioQuantize}.
     */
    public void free() {
        try {
            DowncallHandles.gst_audio_quantize_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reset {@code quant} to the state is was when created, clearing any
     * history it might have.
     */
    public void reset() {
        try {
            DowncallHandles.gst_audio_quantize_reset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform quantization on {@code samples} in {@code in} and write the result to {@code out}.
     * <p>
     * In case the samples are interleaved, {@code in} and {@code out} must point to an
     * array with a single element pointing to a block of interleaved samples.
     * <p>
     * If non-interleaved samples are used, {@code in} and {@code out} must point to an
     * array with pointers to memory blocks, one for each channel.
     * <p>
     * {@code in} and {@code out} may point to the same memory location, in which case samples will be
     * modified in-place.
     * @param in input samples
     * @param out output samples
     * @param samples number of samples
     */
    public void samples(@Nullable java.lang.foreign.MemoryAddress in, @Nullable java.lang.foreign.MemoryAddress out, int samples) {
        try {
            DowncallHandles.gst_audio_quantize_samples.invokeExact(
                    handle(),
                    (Addressable) (in == null ? MemoryAddress.NULL : (Addressable) in),
                    (Addressable) (out == null ? MemoryAddress.NULL : (Addressable) out),
                    samples);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new quantizer object with the given parameters.
     * <p>
     * Output samples will be quantized to a multiple of {@code quantizer}. Better
     * performance is achieved when {@code quantizer} is a power of 2.
     * <p>
     * Dithering and noise-shaping can be performed during quantization with
     * the {@code dither} and {@code ns} parameters.
     * @param dither a {@link AudioDitherMethod}
     * @param ns a {@link AudioNoiseShapingMethod}
     * @param flags {@link AudioQuantizeFlags}
     * @param format the {@link AudioFormat} of the samples
     * @param channels the amount of channels in the samples
     * @param quantizer the quantizer to use
     * @return a new {@link AudioQuantize}. Free with gst_audio_quantize_free().
     */
    public static @NotNull org.gstreamer.audio.AudioQuantize new_(@NotNull org.gstreamer.audio.AudioDitherMethod dither, @NotNull org.gstreamer.audio.AudioNoiseShapingMethod ns, @NotNull org.gstreamer.audio.AudioQuantizeFlags flags, @NotNull org.gstreamer.audio.AudioFormat format, int channels, int quantizer) {
        java.util.Objects.requireNonNull(dither, "Parameter 'dither' must not be null");
        java.util.Objects.requireNonNull(ns, "Parameter 'ns' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_quantize_new.invokeExact(
                    dither.getValue(),
                    ns.getValue(),
                    flags.getValue(),
                    format.getValue(),
                    channels,
                    quantizer);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.audio.AudioQuantize(RESULT, Ownership.UNKNOWN);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_quantize_free = Interop.downcallHandle(
            "gst_audio_quantize_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_quantize_reset = Interop.downcallHandle(
            "gst_audio_quantize_reset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_quantize_samples = Interop.downcallHandle(
            "gst_audio_quantize_samples",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_quantize_new = Interop.downcallHandle(
            "gst_audio_quantize_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
