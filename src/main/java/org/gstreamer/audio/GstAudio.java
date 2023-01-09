package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstAudio namespace.
 */
public final class GstAudio {
    
    static {
        LibLoad.loadLibrary("gstaudio-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
/**
 * Maximum range of allowed channels, for use in template caps strings.
 */
public static final java.lang.String AUDIO_CHANNELS_RANGE = "(int) [ 1, max ]";
    
/**
 * {@link AudioDitherMethod}, The dither method to use when
 * changing bit depth.
 * Default is {@code GST_AUDIO_DITHER_NONE}.
 */
public static final java.lang.String AUDIO_CONVERTER_OPT_DITHER_METHOD = "GstAudioConverter.dither-method";
    
/**
 * {@code GST_TYPE_LIST}, The channel mapping matrix.
 * <p>
 * The matrix coefficients must be between -1 and 1: the number of rows is equal
 * to the number of output channels and the number of columns is equal to the
 * number of input channels.
 * <p>
 * <strong>Example matrix generation code</strong><br/>
 * To generate the matrix using code:
 * <pre>{@code 
 * GValue v = G_VALUE_INIT;
 * GValue v2 = G_VALUE_INIT;
 * GValue v3 = G_VALUE_INIT;
 * 
 * g_value_init (&v2, GST_TYPE_ARRAY);
 * g_value_init (&v3, G_TYPE_DOUBLE);
 * g_value_set_double (&v3, 1);
 * gst_value_array_append_value (&v2, &v3);
 * g_value_unset (&v3);
 * [ Repeat for as many double as your input channels - unset and reinit v3 ]
 * g_value_init (&v, GST_TYPE_ARRAY);
 * gst_value_array_append_value (&v, &v2);
 * g_value_unset (&v2);
 * [ Repeat for as many v2's as your output channels - unset and reinit v2]
 * g_object_set_property (G_OBJECT (audiomixmatrix), "matrix", &v);
 * g_value_unset (&v);
 * }</pre>
 */
public static final java.lang.String AUDIO_CONVERTER_OPT_MIX_MATRIX = "GstAudioConverter.mix-matrix";
    
/**
 * {@link AudioNoiseShapingMethod}, The noise shaping method to use
 * to mask noise from quantization errors.
 * Default is {@code GST_AUDIO_NOISE_SHAPING_NONE}.
 */
public static final java.lang.String AUDIO_CONVERTER_OPT_NOISE_SHAPING_METHOD = "GstAudioConverter.noise-shaping-method";
    
/**
 * {@code G_TYPE_UINT}, The quantization amount. Components will be
 * quantized to multiples of this value.
 * Default is 1
 */
public static final java.lang.String AUDIO_CONVERTER_OPT_QUANTIZATION = "GstAudioConverter.quantization";
    
/**
 * {@link AudioResamplerMethod}, The resampler method to use when
 * changing sample rates.
 * Default is {@code GST_AUDIO_RESAMPLER_METHOD_BLACKMAN_NUTTALL}.
 */
public static final java.lang.String AUDIO_CONVERTER_OPT_RESAMPLER_METHOD = "GstAudioConverter.resampler-method";
    
/**
 * Default maximum number of errors tolerated before signaling error.
 */
public static final int AUDIO_DECODER_MAX_ERRORS = 10;
    
/**
 * The name of the templates for the sink pad.
 */
public static final java.lang.String AUDIO_DECODER_SINK_NAME = "sink";
    
/**
 * The name of the templates for the source pad.
 */
public static final java.lang.String AUDIO_DECODER_SRC_NAME = "src";
    
/**
 * Standard number of channels used in consumer audio.
 */
public static final int AUDIO_DEF_CHANNELS = 2;
    
/**
 * Standard format used in consumer audio.
 */
public static final java.lang.String AUDIO_DEF_FORMAT = "S16LE";
    
/**
 * Standard sampling rate used in consumer audio.
 */
public static final int AUDIO_DEF_RATE = 44100;
    
/**
 * the name of the templates for the sink pad
 */
public static final java.lang.String AUDIO_ENCODER_SINK_NAME = "sink";
    
/**
 * the name of the templates for the source pad
 */
public static final java.lang.String AUDIO_ENCODER_SRC_NAME = "src";
    
/**
 * List of all audio formats, for use in template caps strings.
 * <p>
 * Formats are sorted by decreasing "quality", using these criteria by priority:
 * <ul>
 * <li>depth
 * <li>width
 * <li>Float &gt; Signed &gt; Unsigned
 * <li>native endianness preferred
 * </ul>
 */
public static final java.lang.String AUDIO_FORMATS_ALL = "{ F64BE, F64LE, F32BE, F32LE, S32BE, S32LE, U32BE, U32LE, S24_32BE, S24_32LE, U24_32BE, U24_32LE, S24BE, S24LE, U24BE, U24LE, S20BE, S20LE, U20BE, U20LE, S18BE, S18LE, U18BE, U18LE, S16BE, S16LE, U16BE, U16LE, S8, U8 }";
    
/**
 * Maximum range of allowed sample rates, for use in template caps strings.
 */
public static final java.lang.String AUDIO_RATE_RANGE = "(int) [ 1, max ]";
    
/**
 * G_TYPE_DOUBLE, B parameter of the cubic filter.
 * Values between 0.0 and 2.0 are accepted. 1.0 is the default.
 * <p>
 * Below are some values of popular filters:
 *                    B       C
 * Hermite           0.0     0.0
 * Spline            1.0     0.0
 * Catmull-Rom       0.0     1/2
 */
public static final java.lang.String AUDIO_RESAMPLER_OPT_CUBIC_B = "GstAudioResampler.cubic-b";
    
/**
 * G_TYPE_DOUBLE, C parameter of the cubic filter.
 * Values between 0.0 and 2.0 are accepted. 0.0 is the default.
 * <p>
 * See {@code GST_AUDIO_RESAMPLER_OPT_CUBIC_B} for some more common values
 */
public static final java.lang.String AUDIO_RESAMPLER_OPT_CUBIC_C = "GstAudioResampler.cubic-c";
    
/**
 * G_TYPE_DOUBLE, Cutoff parameter for the filter. 0.940 is the default.
 */
public static final java.lang.String AUDIO_RESAMPLER_OPT_CUTOFF = "GstAudioResampler.cutoff";
    
/**
 * GST_TYPE_AUDIO_RESAMPLER_INTERPOLATION: how the filter coefficients should be
 *    interpolated.
 * GST_AUDIO_RESAMPLER_FILTER_INTERPOLATION_CUBIC is default.
 */
public static final java.lang.String AUDIO_RESAMPLER_OPT_FILTER_INTERPOLATION = "GstAudioResampler.filter-interpolation";
    
/**
 * GST_TYPE_AUDIO_RESAMPLER_FILTER_MODE: how the filter tables should be
 * constructed.
 * GST_AUDIO_RESAMPLER_FILTER_MODE_AUTO is the default.
 */
public static final java.lang.String AUDIO_RESAMPLER_OPT_FILTER_MODE = "GstAudioResampler.filter-mode";
    
/**
 * G_TYPE_UINT: the amount of memory to use for full filter tables before
 * switching to interpolated filter tables.
 * 1048576 is the default.
 */
public static final java.lang.String AUDIO_RESAMPLER_OPT_FILTER_MODE_THRESHOLD = "GstAudioResampler.filter-mode-threshold";
    
/**
 * G_TYPE_UINT, oversampling to use when interpolating filters
 * 8 is the default.
 */
public static final java.lang.String AUDIO_RESAMPLER_OPT_FILTER_OVERSAMPLE = "GstAudioResampler.filter-oversample";
    
/**
 * G_TYPE_DOUBLE: The maximum allowed phase error when switching sample
 * rates.
 * 0.1 is the default.
 */
public static final java.lang.String AUDIO_RESAMPLER_OPT_MAX_PHASE_ERROR = "GstAudioResampler.max-phase-error";
    
/**
 * G_TYPE_INT: the number of taps to use for the filter.
 * 0 is the default and selects the taps automatically.
 */
public static final java.lang.String AUDIO_RESAMPLER_OPT_N_TAPS = "GstAudioResampler.n-taps";
    
/**
 * G_TYPE_DOUBLE, stopband attenuation in decibels. The attenuation
 * after the stopband for the kaiser window. 85 dB is the default.
 */
public static final java.lang.String AUDIO_RESAMPLER_OPT_STOP_ATTENUATION = "GstAudioResampler.stop-attenutation";
    
/**
 * G_TYPE_DOUBLE, transition bandwidth. The width of the
 * transition band for the kaiser window. 0.087 is the default.
 */
public static final java.lang.String AUDIO_RESAMPLER_OPT_TRANSITION_BANDWIDTH = "GstAudioResampler.transition-bandwidth";
    
public static final int AUDIO_RESAMPLER_QUALITY_DEFAULT = 4;
    
public static final int AUDIO_RESAMPLER_QUALITY_MAX = 10;
    
public static final int AUDIO_RESAMPLER_QUALITY_MIN = 0;
    
/**
 * This metadata stays relevant as long as channels are unchanged.
 */
public static final java.lang.String META_TAG_AUDIO_CHANNELS_STR = "channels";
    
/**
 * This metadata stays relevant as long as sample rate is unchanged.
 */
public static final java.lang.String META_TAG_AUDIO_RATE_STR = "rate";
    
/**
 * This metadata is relevant for audio streams.
 */
public static final java.lang.String META_TAG_AUDIO_STR = "audio";

/**
 * Clip the buffer to the given {@code GstSegment}.
 * <p>
 * After calling this function the caller does not own a reference to
 * {@code buffer} anymore.
 * @param buffer The buffer to clip.
 * @param segment Segment in {@link org.gstreamer.gst.Format#TIME} or {@link org.gstreamer.gst.Format#DEFAULT} to which
 *           the buffer should be clipped.
 * @param rate sample rate.
 * @param bpf size of one audio frame in bytes. This is the size of one sample *
 * number of channels.
 * @return {@code null} if the buffer is completely outside the configured segment,
 * otherwise the clipped buffer is returned.
 * <p>
 * If the buffer has no timestamp, it is assumed to be inside the segment and
 * is not clipped
 */
public static org.gstreamer.gst.Buffer audioBufferClip(org.gstreamer.gst.Buffer buffer, org.gstreamer.gst.Segment segment, int rate, int bpf) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_audio_buffer_clip.invokeExact(
                buffer.handle(),
                segment.handle(),
                rate,
                bpf);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    buffer.yieldOwnership();
    var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Maps an audio {@code gstbuffer} so that it can be read or written and stores the
 * result of the map operation in {@code buffer}.
 * <p>
 * This is especially useful when the {@code gstbuffer} is in non-interleaved (planar)
 * layout, in which case this function will use the information in the
 * {@code gstbuffer}'s attached {@link AudioMeta} in order to map each channel in a
 * separate "plane" in {@link AudioBuffer}. If a {@link AudioMeta} is not attached
 * on the {@code gstbuffer}, then it must be in interleaved layout.
 * <p>
 * If a {@link AudioMeta} is attached, then the {@link AudioInfo} on the meta is checked
 * against {@code info}. Normally, they should be equal, but in case they are not,
 * a g_critical will be printed and the {@link AudioInfo} from the meta will be
 * used.
 * <p>
 * In non-interleaved buffers, it is possible to have each channel on a separate
 * {@link org.gstreamer.gst.Memory}. In this case, each memory will be mapped separately to avoid
 * copying their contents in a larger memory area. Do note though that it is
 * not supported to have a single channel spanning over two or more different
 * {@link org.gstreamer.gst.Memory} objects. Although the map operation will likely succeed in this
 * case, it will be highly sub-optimal and it is recommended to merge all the
 * memories in the buffer before calling this function.
 * <p>
 * Note: The actual {@link org.gstreamer.gst.Buffer} is not ref'ed, but it is required to stay valid
 * as long as it's mapped.
 * @param buffer pointer to a {@link AudioBuffer}
 * @param info the audio properties of the buffer
 * @param gstbuffer the {@link org.gstreamer.gst.Buffer} to be mapped
 * @param flags the access mode for the memory
 * @return {@code true} if the map operation succeeded or {@code false} on failure
 */
public static boolean audioBufferMap(org.gstreamer.audio.AudioBuffer buffer, org.gstreamer.audio.AudioInfo info, org.gstreamer.gst.Buffer gstbuffer, org.gstreamer.gst.MapFlags flags) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_audio_buffer_map.invokeExact(
                buffer.handle(),
                info.handle(),
                gstbuffer.handle(),
                flags.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Reorders {@code buffer} from the channel positions {@code from} to the channel
 * positions {@code to}. {@code from} and {@code to} must contain the same number of
 * positions and the same positions, only in a different order.
 * {@code buffer} must be writable.
 * @param buffer The buffer to reorder.
 * @param format The {@code GstAudioFormat} of the buffer.
 * @param channels The number of channels.
 * @param from The channel positions in the buffer.
 * @param to The channel positions to convert to.
 * @return {@code true} if the reordering was possible.
 */
public static boolean audioBufferReorderChannels(org.gstreamer.gst.Buffer buffer, org.gstreamer.audio.AudioFormat format, int channels, org.gstreamer.audio.AudioChannelPosition[] from, org.gstreamer.audio.AudioChannelPosition[] to) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_buffer_reorder_channels.invokeExact(
                    buffer.handle(),
                    format.getValue(),
                    channels,
                    Interop.allocateNativeArray(Enumeration.getValues(from), false, SCOPE),
                    Interop.allocateNativeArray(Enumeration.getValues(to), false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Truncate the buffer to finally have {@code samples} number of samples, removing
 * the necessary amount of samples from the end and {@code trim} number of samples
 * from the beginning.
 * <p>
 * This function does not know the audio rate, therefore the caller is
 * responsible for re-setting the correct timestamp and duration to the
 * buffer. However, timestamp will be preserved if trim == 0, and duration
 * will also be preserved if there is no trimming to be done. Offset and
 * offset end will be preserved / updated.
 * <p>
 * After calling this function the caller does not own a reference to
 * {@code buffer} anymore.
 * @param buffer The buffer to truncate.
 * @param bpf size of one audio frame in bytes. This is the size of one sample *
 * number of channels.
 * @param trim the number of samples to remove from the beginning of the buffer
 * @param samples the final number of samples that should exist in this buffer or -1
 * to use all the remaining samples if you are only removing samples from the
 * beginning.
 * @return the truncated buffer or {@code null} if the arguments
 *   were invalid
 */
public static org.gstreamer.gst.Buffer audioBufferTruncate(org.gstreamer.gst.Buffer buffer, int bpf, long trim, long samples) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_audio_buffer_truncate.invokeExact(
                buffer.handle(),
                bpf,
                trim,
                samples);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    buffer.yieldOwnership();
    var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Get the fallback channel-mask for the given number of channels.
 * <p>
 * This function returns a reasonable fallback channel-mask and should be
 * called as a last resort when the specific channel map is unknown.
 * @param channels the number of channels
 * @return a fallback channel-mask for {@code channels} or 0 when there is no
 * mask and mono.
 */
public static long audioChannelGetFallbackMask(int channels) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_audio_channel_get_fallback_mask.invokeExact(channels);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
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
public static org.gstreamer.audio.AudioChannelMixer audioChannelMixerNew(org.gstreamer.audio.AudioChannelMixerFlags flags, org.gstreamer.audio.AudioFormat format, int inChannels, PointerEnumeration<org.gstreamer.audio.AudioChannelPosition> inPosition, int outChannels, PointerEnumeration<org.gstreamer.audio.AudioChannelPosition> outPosition) {
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
public static org.gstreamer.audio.AudioChannelMixer audioChannelMixerNewWithMatrix(org.gstreamer.audio.AudioChannelMixerFlags flags, org.gstreamer.audio.AudioFormat format, int inChannels, int outChannels, PointerFloat matrix) {
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

/**
 * Convert the {@code channels} present in {@code channel_mask} to a {@code position} array
 * (which should have at least {@code channels} entries ensured by caller).
 * If {@code channel_mask} is set to 0, it is considered as 'not present' for purpose
 * of conversion.
 * A partially valid {@code channel_mask} with less bits set than the number
 * of channels is considered valid.
 * @param channels The number of channels
 * @param channelMask The input channel_mask
 * @param position The
 *   {@code GstAudioChannelPosition}&lt;!-- --&gt;s
 * @return {@code true} if channel and channel mask are valid and could be converted
 */
public static boolean audioChannelPositionsFromMask(int channels, long channelMask, org.gstreamer.audio.AudioChannelPosition[] position) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_channel_positions_from_mask.invokeExact(
                    channels,
                    channelMask,
                    Interop.allocateNativeArray(Enumeration.getValues(position), false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Convert the {@code position} array of {@code channels} channels to a bitmask.
 * <p>
 * If {@code force_order} is {@code true} it additionally checks if the channels are
 * in the order required by GStreamer.
 * @param position The {@code GstAudioChannelPositions}
 * @param channels The number of channels.
 * @param forceOrder Only consider the GStreamer channel order.
 * @param channelMask the output channel mask
 * @return {@code true} if the channel positions are valid and could be converted.
 */
public static boolean audioChannelPositionsToMask(org.gstreamer.audio.AudioChannelPosition[] position, int channels, boolean forceOrder, Out<Long> channelMask) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment channelMaskPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_channel_positions_to_mask.invokeExact(
                    Interop.allocateNativeArray(Enumeration.getValues(position), false, SCOPE),
                    channels,
                    Marshal.booleanToInteger.marshal(forceOrder, null).intValue(),
                    (Addressable) channelMaskPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                channelMask.set(channelMaskPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Converts {@code position} to a human-readable string representation for
 * debugging purposes.
 * @param position The {@code GstAudioChannelPositions}
 *   to convert.
 * @param channels The number of channels.
 * @return a newly allocated string representing
 * {@code position}
 */
public static java.lang.String audioChannelPositionsToString(org.gstreamer.audio.AudioChannelPosition[] position, int channels) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_channel_positions_to_string.invokeExact(
                    Interop.allocateNativeArray(Enumeration.getValues(position), false, SCOPE),
                    channels);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Reorders the channel positions in {@code position} from any order to
 * the GStreamer channel order.
 * @param position The channel positions to
 *   reorder to.
 * @param channels The number of channels.
 * @return {@code true} if the channel positions are valid and reordering
 * was successful.
 */
public static boolean audioChannelPositionsToValidOrder(org.gstreamer.audio.AudioChannelPosition[] position, int channels) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_channel_positions_to_valid_order.invokeExact(
                    Interop.allocateNativeArray(Enumeration.getValues(position), false, SCOPE),
                    channels);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Checks if {@code position} contains valid channel positions for
 * {@code channels} channels. If {@code force_order} is {@code true} it additionally
 * checks if the channels are in the order required by GStreamer.
 * @param position The {@code GstAudioChannelPositions}
 *   to check.
 * @param channels The number of channels.
 * @param forceOrder Only consider the GStreamer channel order.
 * @return {@code true} if the channel positions are valid.
 */
public static boolean audioCheckValidChannelPositions(org.gstreamer.audio.AudioChannelPosition[] position, int channels, boolean forceOrder) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_check_valid_channel_positions.invokeExact(
                    Interop.allocateNativeArray(Enumeration.getValues(position), false, SCOPE),
                    channels,
                    Marshal.booleanToInteger.marshal(forceOrder, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

public static org.gtk.glib.Type audioClippingMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_audio_clipping_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo audioClippingMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_audio_clipping_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

public static org.gtk.glib.Type audioDownmixMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_audio_downmix_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo audioDownmixMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_audio_downmix_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

/**
 * Construct a {@link AudioFormat} with given parameters.
 * @param sign signed or unsigned format
 * @param endianness G_LITTLE_ENDIAN or G_BIG_ENDIAN
 * @param width amount of bits used per sample
 * @param depth amount of used bits in {@code width}
 * @return a {@link AudioFormat} or GST_AUDIO_FORMAT_UNKNOWN when no audio format
 * exists with the given parameters.
 */
public static org.gstreamer.audio.AudioFormat audioFormatBuildInteger(boolean sign, int endianness, int width, int depth) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_audio_format_build_integer.invokeExact(
                Marshal.booleanToInteger.marshal(sign, null).intValue(),
                endianness,
                width,
                depth);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.audio.AudioFormat.of(RESULT);
}

/**
 * Fill {@code length} bytes in {@code dest} with silence samples for {@code info}.
 * @param info a {@link AudioFormatInfo}
 * @param dest a destination
 *   to fill
 * @param length the length to fill
 * @deprecated Use gst_audio_format_info_fill_silence() instead.
 */
@Deprecated
public static void audioFormatFillSilence(org.gstreamer.audio.AudioFormatInfo info, byte[] dest, long length) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.gst_audio_format_fill_silence.invokeExact(
                    info.handle(),
                    Interop.allocateNativeArray(dest, false, SCOPE),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Convert the {@code format} string to its {@link AudioFormat}.
 * @param format a format string
 * @return the {@link AudioFormat} for {@code format} or GST_AUDIO_FORMAT_UNKNOWN when the
 * string is not a known format.
 */
public static org.gstreamer.audio.AudioFormat audioFormatFromString(java.lang.String format) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_format_from_string.invokeExact(Marshal.stringToAddress.marshal(format, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.audio.AudioFormat.of(RESULT);
    }
}

/**
 * Get the {@link AudioFormatInfo} for {@code format}
 * @param format a {@link AudioFormat}
 * @return The {@link AudioFormatInfo} for {@code format}.
 */
public static org.gstreamer.audio.AudioFormatInfo audioFormatGetInfo(org.gstreamer.audio.AudioFormat format) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_audio_format_get_info.invokeExact(format.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.audio.AudioFormatInfo.fromAddress.marshal(RESULT, null);
}

public static org.gtk.glib.Type audioFormatInfoGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_audio_format_info_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static java.lang.String audioFormatToString(org.gstreamer.audio.AudioFormat format) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_audio_format_to_string.invokeExact(format.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Return all the raw audio formats supported by GStreamer.
 * @param len the number of elements in the returned array
 * @return an array of {@link AudioFormat}
 */
public static org.gstreamer.audio.AudioFormat[] audioFormatsRaw(Out<Integer> len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment lenPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_formats_raw.invokeExact((Addressable) lenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                len.set(lenPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.gstreamer.audio.AudioFormat[] resultARRAY = new org.gstreamer.audio.AudioFormat[len.get().intValue()];
        for (int I = 0; I < len.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.C_INT, I);
            resultARRAY[I] = org.gstreamer.audio.AudioFormat.of(OBJ);
        }
        return resultARRAY;
    }
}

/**
 * Returns a reorder map for {@code from} to {@code to} that can be used in
 * custom channel reordering code, e.g. to convert from or to the
 * GStreamer channel order. {@code from} and {@code to} must contain the same
 * number of positions and the same positions, only in a
 * different order.
 * <p>
 * The resulting {@code reorder_map} can be used for reordering by assigning
 * channel i of the input to channel reorder_map[i] of the output.
 * @param channels The number of channels.
 * @param from The channel positions to reorder from.
 * @param to The channel positions to reorder to.
 * @param reorderMap Pointer to the reorder map.
 * @return {@code true} if the channel positions are valid and reordering
 * is possible.
 */
public static boolean audioGetChannelReorderMap(int channels, org.gstreamer.audio.AudioChannelPosition[] from, org.gstreamer.audio.AudioChannelPosition[] to, int[] reorderMap) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_get_channel_reorder_map.invokeExact(
                    channels,
                    Interop.allocateNativeArray(Enumeration.getValues(from), false, SCOPE),
                    Interop.allocateNativeArray(Enumeration.getValues(to), false, SCOPE),
                    Interop.allocateNativeArray(reorderMap, false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Calculated the size of the buffer expected by gst_audio_iec61937_payload() for
 * payloading type from {@code spec}.
 * @param spec the ringbufer spec
 * @return the size or 0 if the given {@code type} is not supported or cannot be
 * payloaded.
 */
public static int audioIec61937FrameSize(org.gstreamer.audio.AudioRingBufferSpec spec) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_audio_iec61937_frame_size.invokeExact(spec.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Payloads {@code src} in the form specified by IEC 61937 for the type from {@code spec} and
 * stores the result in {@code dst}. {@code src} must contain exactly one frame of data and
 * the frame is not checked for errors.
 * @param src a buffer containing the data to payload
 * @param srcN size of {@code src} in bytes
 * @param dst the destination buffer to store the
 *       payloaded contents in. Should not overlap with {@code src}
 * @param dstN size of {@code dst} in bytes
 * @param spec the ringbufer spec for {@code src}
 * @param endianness the expected byte order of the payloaded data
 * @return transfer-full: {@code true} if the payloading was successful, {@code false}
 * otherwise.
 */
public static boolean audioIec61937Payload(byte[] src, int srcN, byte[] dst, int dstN, org.gstreamer.audio.AudioRingBufferSpec spec, int endianness) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_iec61937_payload.invokeExact(
                    Interop.allocateNativeArray(src, false, SCOPE),
                    srcN,
                    Interop.allocateNativeArray(dst, false, SCOPE),
                    dstN,
                    spec.handle(),
                    endianness);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Parse {@code caps} and update {@code info}.
 * @param info a {@link AudioInfo}
 * @param caps a {@link org.gstreamer.gst.Caps}
 * @return TRUE if {@code caps} could be parsed
 */
public static boolean audioInfoFromCaps(org.gstreamer.audio.AudioInfo info, org.gstreamer.gst.Caps caps) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_audio_info_from_caps.invokeExact(
                info.handle(),
                caps.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Initialize {@code info} with default values.
 * @param info a {@link AudioInfo}
 */
public static void audioInfoInit(org.gstreamer.audio.AudioInfo info) {
    try {
        DowncallHandles.gst_audio_info_init.invokeExact(info.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Return the {@link org.gtk.glib.Type} associated with {@link AudioLevelMeta}.
 * @return a {@link org.gtk.glib.Type}
 */
public static org.gtk.glib.Type audioLevelMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_audio_level_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

/**
 * Return the {@link org.gstreamer.gst.MetaInfo} associated with {@link AudioLevelMeta}.
 * @return a {@link org.gstreamer.gst.MetaInfo}
 */
public static org.gstreamer.gst.MetaInfo audioLevelMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_audio_level_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}

/**
 * Return a generic raw audio caps for formats defined in {@code formats}.
 * If {@code formats} is {@code null} returns a caps for all the supported raw audio formats,
 * see gst_audio_formats_raw().
 * @param formats an array of raw {@link AudioFormat}, or {@code null}
 * @param len the size of {@code formats}
 * @param layout the layout of audio samples
 * @return an audio {@code GstCaps}
 */
public static org.gstreamer.gst.Caps audioMakeRawCaps(@Nullable org.gstreamer.audio.AudioFormat[] formats, int len, org.gstreamer.audio.AudioLayout layout) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_make_raw_caps.invokeExact(
                    (Addressable) (formats == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(formats), false, SCOPE)),
                    len,
                    layout.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

public static org.gtk.glib.Type audioMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_audio_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo audioMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_audio_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
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
public static org.gstreamer.audio.AudioQuantize audioQuantizeNew(org.gstreamer.audio.AudioDitherMethod dither, org.gstreamer.audio.AudioNoiseShapingMethod ns, org.gstreamer.audio.AudioQuantizeFlags flags, org.gstreamer.audio.AudioFormat format, int channels, int quantizer) {
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
    return org.gstreamer.audio.AudioQuantize.fromAddress.marshal(RESULT, null);
}

/**
 * Reorders {@code data} from the channel positions {@code from} to the channel
 * positions {@code to}. {@code from} and {@code to} must contain the same number of
 * positions and the same positions, only in a different order.
 * <p>
 * Note: this function assumes the audio data is in interleaved layout
 * @param data The pointer to
 *   the memory.
 * @param size The size of the memory.
 * @param format The {@code GstAudioFormat} of the buffer.
 * @param channels The number of channels.
 * @param from The channel positions in the buffer.
 * @param to The channel positions to convert to.
 * @return {@code true} if the reordering was possible.
 */
public static boolean audioReorderChannels(byte[] data, long size, org.gstreamer.audio.AudioFormat format, int channels, org.gstreamer.audio.AudioChannelPosition[] from, org.gstreamer.audio.AudioChannelPosition[] to) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_reorder_channels.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    size,
                    format.getValue(),
                    channels,
                    Interop.allocateNativeArray(Enumeration.getValues(from), false, SCOPE),
                    Interop.allocateNativeArray(Enumeration.getValues(to), false, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
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
public static org.gstreamer.audio.AudioResampler audioResamplerNew(org.gstreamer.audio.AudioResamplerMethod method, org.gstreamer.audio.AudioResamplerFlags flags, org.gstreamer.audio.AudioFormat format, int channels, int inRate, int outRate, org.gstreamer.gst.Structure options) {
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
public static void audioResamplerOptionsSetQuality(org.gstreamer.audio.AudioResamplerMethod method, int quality, int inRate, int outRate, org.gstreamer.gst.Structure options) {
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

/**
 * Attaches {@link AudioClippingMeta} metadata to {@code buffer} with the given parameters.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param format GstFormat of {@code start} and {@code stop}, GST_FORMAT_DEFAULT is samples
 * @param start Amount of audio to clip from start of buffer
 * @param end Amount of  to clip from end of buffer
 * @return the {@link AudioClippingMeta} on {@code buffer}.
 */
public static org.gstreamer.audio.AudioClippingMeta bufferAddAudioClippingMeta(org.gstreamer.gst.Buffer buffer, org.gstreamer.gst.Format format, long start, long end) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_audio_clipping_meta.invokeExact(
                buffer.handle(),
                format.getValue(),
                start,
                end);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.audio.AudioClippingMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Attaches {@link AudioDownmixMeta} metadata to {@code buffer} with the given parameters.
 * <p>
 * {@code matrix} is an two-dimensional array of {@code to_channels} times {@code from_channels}
 * coefficients, i.e. the i-th output channels is constructed by multiplicating
 * the input channels with the coefficients in {@code matrix}[i] and taking the sum
 * of the results.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param fromPosition the channel positions
 *   of the source
 * @param fromChannels The number of channels of the source
 * @param toPosition the channel positions of
 *   the destination
 * @param toChannels The number of channels of the destination
 * @param matrix The matrix coefficients.
 * @return the {@link AudioDownmixMeta} on {@code buffer}.
 */
public static org.gstreamer.audio.AudioDownmixMeta bufferAddAudioDownmixMeta(org.gstreamer.gst.Buffer buffer, org.gstreamer.audio.AudioChannelPosition[] fromPosition, int fromChannels, org.gstreamer.audio.AudioChannelPosition[] toPosition, int toChannels, PointerFloat matrix) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_audio_downmix_meta.invokeExact(
                    buffer.handle(),
                    Interop.allocateNativeArray(Enumeration.getValues(fromPosition), false, SCOPE),
                    fromChannels,
                    Interop.allocateNativeArray(Enumeration.getValues(toPosition), false, SCOPE),
                    toChannels,
                    matrix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.audio.AudioDownmixMeta.fromAddress.marshal(RESULT, null);
    }
}

/**
 * Attaches audio level information to {@code buffer}. (RFC 6464)
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param level the -dBov from 0-127 (127 is silence).
 * @param voiceActivity whether the buffer contains voice activity.
 * @return the {@link AudioLevelMeta} on {@code buffer}.
 */
public static @Nullable org.gstreamer.audio.AudioLevelMeta bufferAddAudioLevelMeta(org.gstreamer.gst.Buffer buffer, byte level, boolean voiceActivity) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_audio_level_meta.invokeExact(
                buffer.handle(),
                level,
                Marshal.booleanToInteger.marshal(voiceActivity, null).intValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.audio.AudioLevelMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Allocates and attaches a {@link AudioMeta} on {@code buffer}, which must be writable
 * for that purpose. The fields of the {@link AudioMeta} are directly populated
 * from the arguments of this function.
 * <p>
 * When {@code info}-&gt;layout is {@link AudioLayout#NON_INTERLEAVED} and {@code offsets} is
 * {@code null}, the offsets are calculated with a formula that assumes the planes are
 * tightly packed and in sequence:
 * offsets[channel] = channel * {@code samples} * sample_stride
 * <p>
 * It is not allowed for channels to overlap in memory,
 * i.e. for each i in [0, channels), the range
 * {@code offsets[i} + {@code samples} * sample_stride) must not overlap
 * with any other such range. This function will assert if the parameters
 * specified cause this restriction to be violated.
 * <p>
 * It is, obviously, also not allowed to specify parameters that would cause
 * out-of-bounds memory access on {@code buffer}. This is also checked, which means
 * that you must add enough memory on the {@code buffer} before adding this meta.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param info the audio properties of the buffer
 * @param samples the number of valid samples in the buffer
 * @param offsets the offsets (in bytes) where each channel plane starts
 *   in the buffer or {@code null} to calculate it (see below); must be {@code null} also
 *   when {@code info}-&gt;layout is {@link AudioLayout#INTERLEAVED}
 * @return the {@link AudioMeta} that was attached on the {@code buffer}
 */
public static org.gstreamer.audio.AudioMeta bufferAddAudioMeta(org.gstreamer.gst.Buffer buffer, org.gstreamer.audio.AudioInfo info, long samples, PointerLong offsets) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_audio_meta.invokeExact(
                buffer.handle(),
                info.handle(),
                samples,
                (Addressable) (offsets == null ? MemoryAddress.NULL : offsets.handle()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.audio.AudioMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Find the {@link AudioDownmixMeta} on {@code buffer} for the given destination
 * channel positions.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param toPosition the channel positions of
 *   the destination
 * @param toChannels The number of channels of the destination
 * @return the {@link AudioDownmixMeta} on {@code buffer}.
 */
public static org.gstreamer.audio.AudioDownmixMeta bufferGetAudioDownmixMetaForChannels(org.gstreamer.gst.Buffer buffer, org.gstreamer.audio.AudioChannelPosition[] toPosition, int toChannels) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_get_audio_downmix_meta_for_channels.invokeExact(
                    buffer.handle(),
                    Interop.allocateNativeArray(Enumeration.getValues(toPosition), false, SCOPE),
                    toChannels);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.audio.AudioDownmixMeta.fromAddress.marshal(RESULT, null);
    }
}

/**
 * Find the {@link AudioLevelMeta} on {@code buffer}.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @return the {@link AudioLevelMeta} or {@code null} when
 * there is no such metadata on {@code buffer}.
 */
public static @Nullable org.gstreamer.audio.AudioLevelMeta bufferGetAudioLevelMeta(org.gstreamer.gst.Buffer buffer) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_get_audio_level_meta.invokeExact(buffer.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.audio.AudioLevelMeta.fromAddress.marshal(RESULT, null);
}

public static double streamVolumeConvertVolume(org.gstreamer.audio.StreamVolumeFormat from, org.gstreamer.audio.StreamVolumeFormat to, double val) {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.gst_stream_volume_convert_volume.invokeExact(
                from.getValue(),
                to.getValue(),
                val);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}
    
    private static class DowncallHandles {

private static final MethodHandle gst_audio_buffer_clip = Interop.downcallHandle(
        "gst_audio_buffer_clip",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_audio_buffer_map = Interop.downcallHandle(
        "gst_audio_buffer_map",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_audio_buffer_reorder_channels = Interop.downcallHandle(
        "gst_audio_buffer_reorder_channels",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_audio_buffer_truncate = Interop.downcallHandle(
        "gst_audio_buffer_truncate",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_audio_channel_get_fallback_mask = Interop.downcallHandle(
        "gst_audio_channel_get_fallback_mask",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
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

private static final MethodHandle gst_audio_channel_positions_from_mask = Interop.downcallHandle(
        "gst_audio_channel_positions_from_mask",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_audio_channel_positions_to_mask = Interop.downcallHandle(
        "gst_audio_channel_positions_to_mask",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_audio_channel_positions_to_string = Interop.downcallHandle(
        "gst_audio_channel_positions_to_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_audio_channel_positions_to_valid_order = Interop.downcallHandle(
        "gst_audio_channel_positions_to_valid_order",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_audio_check_valid_channel_positions = Interop.downcallHandle(
        "gst_audio_check_valid_channel_positions",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_audio_clipping_meta_api_get_type = Interop.downcallHandle(
        "gst_audio_clipping_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_audio_clipping_meta_get_info = Interop.downcallHandle(
        "gst_audio_clipping_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_audio_downmix_meta_api_get_type = Interop.downcallHandle(
        "gst_audio_downmix_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_audio_downmix_meta_get_info = Interop.downcallHandle(
        "gst_audio_downmix_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_audio_format_build_integer = Interop.downcallHandle(
        "gst_audio_format_build_integer",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_audio_format_fill_silence = Interop.downcallHandle(
        "gst_audio_format_fill_silence",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_audio_format_from_string = Interop.downcallHandle(
        "gst_audio_format_from_string",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_audio_format_get_info = Interop.downcallHandle(
        "gst_audio_format_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_audio_format_info_get_type = Interop.downcallHandle(
        "gst_audio_format_info_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_audio_format_to_string = Interop.downcallHandle(
        "gst_audio_format_to_string",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_audio_formats_raw = Interop.downcallHandle(
        "gst_audio_formats_raw",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_audio_get_channel_reorder_map = Interop.downcallHandle(
        "gst_audio_get_channel_reorder_map",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_audio_iec61937_frame_size = Interop.downcallHandle(
        "gst_audio_iec61937_frame_size",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_audio_iec61937_payload = Interop.downcallHandle(
        "gst_audio_iec61937_payload",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_audio_info_from_caps = Interop.downcallHandle(
        "gst_audio_info_from_caps",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_audio_info_init = Interop.downcallHandle(
        "gst_audio_info_init",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_audio_level_meta_api_get_type = Interop.downcallHandle(
        "gst_audio_level_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_audio_level_meta_get_info = Interop.downcallHandle(
        "gst_audio_level_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_audio_make_raw_caps = Interop.downcallHandle(
        "gst_audio_make_raw_caps",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_audio_meta_api_get_type = Interop.downcallHandle(
        "gst_audio_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_audio_meta_get_info = Interop.downcallHandle(
        "gst_audio_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_audio_quantize_new = Interop.downcallHandle(
        "gst_audio_quantize_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_audio_reorder_channels = Interop.downcallHandle(
        "gst_audio_reorder_channels",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
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

private static final MethodHandle gst_buffer_add_audio_clipping_meta = Interop.downcallHandle(
        "gst_buffer_add_audio_clipping_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_buffer_add_audio_downmix_meta = Interop.downcallHandle(
        "gst_buffer_add_audio_downmix_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_buffer_add_audio_level_meta = Interop.downcallHandle(
        "gst_buffer_add_audio_level_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_buffer_add_audio_meta = Interop.downcallHandle(
        "gst_buffer_add_audio_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_buffer_get_audio_downmix_meta_for_channels = Interop.downcallHandle(
        "gst_buffer_get_audio_downmix_meta_for_channels",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_buffer_get_audio_level_meta = Interop.downcallHandle(
        "gst_buffer_get_audio_level_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_stream_volume_convert_volume = Interop.downcallHandle(
        "gst_stream_volume_convert_volume",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
        false
);
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
    
    private static void registerTypes() {
        if (AudioAggregator.isAvailable()) Interop.register(AudioAggregator.getType(), AudioAggregator.fromAddress);
        if (AudioAggregatorConvertPad.isAvailable()) Interop.register(AudioAggregatorConvertPad.getType(), AudioAggregatorConvertPad.fromAddress);
        if (AudioAggregatorPad.isAvailable()) Interop.register(AudioAggregatorPad.getType(), AudioAggregatorPad.fromAddress);
        if (AudioBaseSink.isAvailable()) Interop.register(AudioBaseSink.getType(), AudioBaseSink.fromAddress);
        if (AudioBaseSrc.isAvailable()) Interop.register(AudioBaseSrc.getType(), AudioBaseSrc.fromAddress);
        if (AudioCdSrc.isAvailable()) Interop.register(AudioCdSrc.getType(), AudioCdSrc.fromAddress);
        if (AudioClock.isAvailable()) Interop.register(AudioClock.getType(), AudioClock.fromAddress);
        if (AudioDecoder.isAvailable()) Interop.register(AudioDecoder.getType(), AudioDecoder.fromAddress);
        if (AudioEncoder.isAvailable()) Interop.register(AudioEncoder.getType(), AudioEncoder.fromAddress);
        if (AudioFilter.isAvailable()) Interop.register(AudioFilter.getType(), AudioFilter.fromAddress);
        if (AudioRingBuffer.isAvailable()) Interop.register(AudioRingBuffer.getType(), AudioRingBuffer.fromAddress);
        if (AudioSink.isAvailable()) Interop.register(AudioSink.getType(), AudioSink.fromAddress);
        if (AudioSrc.isAvailable()) Interop.register(AudioSrc.getType(), AudioSrc.fromAddress);
        if (StreamVolume.isAvailable()) Interop.register(StreamVolume.getType(), StreamVolume.fromAddress);
    }
}
