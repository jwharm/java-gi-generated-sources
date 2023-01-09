package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AudioChannelMixer extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioChannelMixer";
    
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
     * Allocate a new {@link AudioChannelMixer}
     * @return A new, uninitialized @{link AudioChannelMixer}
     */
    public static AudioChannelMixer allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AudioChannelMixer newInstance = new AudioChannelMixer(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AudioChannelMixer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioChannelMixer(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioChannelMixer> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioChannelMixer(input);
    
    /**
     * Free memory allocated by {@code mix}.
     */
    public void free() {
        try {
            DowncallHandles.gst_audio_channel_mixer_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Check if {@code mix} is in passthrough.
     * <p>
     * Only N x N mix identity matrices are considered passthrough,
     * this is determined by comparing the contents of the matrix
     * with 0.0 and 1.0.
     * <p>
     * As this is floating point comparisons, if the values have been
     * generated, they should be rounded up or down by explicit
     * assignment of 0.0 or 1.0 to values within a user-defined
     * epsilon, this code doesn't make assumptions as to what may
     * constitute an appropriate epsilon.
     * @return {@code true} is {@code mix} is passthrough.
     */
    public boolean isPassthrough() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_channel_mixer_is_passthrough.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * In case the samples are interleaved, {@code in} and {@code out} must point to an
     * array with a single element pointing to a block of interleaved samples.
     * <p>
     * If non-interleaved samples are used, {@code in} and {@code out} must point to an
     * array with pointers to memory blocks, one for each channel.
     * <p>
     * Perform channel mixing on {@code in_data} and write the result to {@code out_data}.
     * {@code in_data} and {@code out_data} need to be in {@code format} and {@code layout}.
     * @param in input samples
     * @param out output samples
     * @param samples number of samples
     */
    public void samples(@Nullable java.lang.foreign.MemoryAddress in, @Nullable java.lang.foreign.MemoryAddress out, int samples) {
        try {
            DowncallHandles.gst_audio_channel_mixer_samples.invokeExact(
                    handle(),
                    (Addressable) (in == null ? MemoryAddress.NULL : (Addressable) in),
                    (Addressable) (out == null ? MemoryAddress.NULL : (Addressable) out),
                    samples);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new channel mixer object for the given parameters.
     * @param flags {@link AudioChannelMixerFlags}
     * @param inChannels number of input channels
     * @param inPosition positions of input channels
     * @param outChannels number of output channels
     * @param outPosition positions of output channels
     * @return a new {@link AudioChannelMixer} object, or {@code null} if {@code format} isn't supported.
     *   Free with gst_audio_channel_mixer_free() after usage.
     */
    public static org.gstreamer.audio.AudioChannelMixer new_(org.gstreamer.audio.AudioChannelMixerFlags flags, org.gstreamer.audio.AudioFormat format, int inChannels, PointerEnumeration<org.gstreamer.audio.AudioChannelPosition> inPosition, int outChannels, PointerEnumeration<org.gstreamer.audio.AudioChannelPosition> outPosition) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_channel_mixer_new.invokeExact(
                    flags.getValue(),
                    format.getValue(),
                    inChannels,
                    inPosition.handle(),
                    outChannels,
                    outPosition.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.audio.AudioChannelMixer.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Create a new channel mixer object for the given parameters.
     * @param flags {@link AudioChannelMixerFlags}
     * @param inChannels number of input channels
     * @param outChannels number of output channels
     * @param matrix channel conversion matrix, m{@code out_channels}.
     *   If identity matrix, passthrough applies. If {@code null}, a (potentially truncated)
     *   identity matrix is generated.
     * @return a new {@link AudioChannelMixer} object, or {@code null} if {@code format} isn't supported,
     *   {@code matrix} is invalid, or {@code matrix} is {@code null} and {@code in_channels} != {@code out_channels}.
     *   Free with gst_audio_channel_mixer_free() after usage.
     */
    public static org.gstreamer.audio.AudioChannelMixer newWithMatrix(org.gstreamer.audio.AudioChannelMixerFlags flags, org.gstreamer.audio.AudioFormat format, int inChannels, int outChannels, PointerFloat matrix) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_channel_mixer_new_with_matrix.invokeExact(
                    flags.getValue(),
                    format.getValue(),
                    inChannels,
                    outChannels,
                    (Addressable) (matrix == null ? MemoryAddress.NULL : matrix.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.audio.AudioChannelMixer.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_channel_mixer_free = Interop.downcallHandle(
                "gst_audio_channel_mixer_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_channel_mixer_is_passthrough = Interop.downcallHandle(
                "gst_audio_channel_mixer_is_passthrough",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_channel_mixer_samples = Interop.downcallHandle(
                "gst_audio_channel_mixer_samples",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_channel_mixer_new = Interop.downcallHandle(
                "gst_audio_channel_mixer_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_channel_mixer_new_with_matrix = Interop.downcallHandle(
                "gst_audio_channel_mixer_new_with_matrix",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
