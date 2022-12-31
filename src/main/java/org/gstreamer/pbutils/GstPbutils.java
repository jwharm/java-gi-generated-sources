package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstPbutils namespace.
 */
public final class GstPbutils {
    
    static {
        System.loadLibrary("gstpbutils-1.0");
    }
    
    private static boolean javagi$initialized = false;
    
    @ApiStatus.Internal
    public static void javagi$ensureInitialized() {
        if (!javagi$initialized) {
            javagi$initialized = true;
            JavaGITypeRegister.register();
        }
    }
    
    /**
     * {@link EncodingTarget} category for recording and capture.
     * Targets within this category are optimized for low latency encoding.
     */
    public static final java.lang.String ENCODING_CATEGORY_CAPTURE = "capture";
    
    /**
     * {@link EncodingTarget} category for device-specific targets.
     * The name of the target will usually be the constructor and model of the device,
     * and that target will contain {@code GstEncodingProfiles} suitable for that device.
     */
    public static final java.lang.String ENCODING_CATEGORY_DEVICE = "device";
    
    /**
     * {@link EncodingTarget} category for file extensions.
     * The name of the target will be the name of the file extensions possible
     * for a particular target. Those targets are defining like 'default' formats
     * usually used for a particular file extension.
     */
    public static final java.lang.String ENCODING_CATEGORY_FILE_EXTENSION = "file-extension";
    
    /**
     * {@link EncodingTarget} category for online-services.
     * The name of the target will usually be the name of the online service
     * and that target will contain {@code GstEncodingProfiles} suitable for that online
     * service.
     */
    public static final java.lang.String ENCODING_CATEGORY_ONLINE_SERVICE = "online-service";
    
    /**
     * {@link EncodingTarget} category for storage, archiving and editing targets.
     * Those targets can be lossless and/or provide very fast random access content.
     * The name of the target will usually be the container type or editing target,
     * and that target will contain {@code GstEncodingProfiles} suitable for editing or
     * storage.
     */
    public static final java.lang.String ENCODING_CATEGORY_STORAGE_EDITING = "storage-editing";
    
    /**
     * The major version of GStreamer's gst-plugins-base libraries at compile time.
     */
    public static final int PLUGINS_BASE_VERSION_MAJOR = 1;
    
    /**
     * The micro version of GStreamer's gst-plugins-base libraries at compile time.
     */
    public static final int PLUGINS_BASE_VERSION_MICRO = 4;
    
    /**
     * The minor version of GStreamer's gst-plugins-base libraries at compile time.
     */
    public static final int PLUGINS_BASE_VERSION_MINOR = 20;
    
    /**
     * The nano version of GStreamer's gst-plugins-base libraries at compile time.
     * Actual releases have 0, GIT versions have 1, prerelease versions have 2-...
     */
    public static final int PLUGINS_BASE_VERSION_NANO = 0;
    
    /**
     * Sets the level and profile on {@code caps} if it can be determined from
     * {@code audio_config}. See gst_codec_utils_aac_get_level() and
     * gst_codec_utils_aac_get_profile() for more details on the parameters.
     * {@code caps} must be audio/mpeg caps with an "mpegversion" field of either 2 or 4.
     * If mpegversion is 4, the "base-profile" field is also set in {@code caps}.
     * @param caps the {@link org.gstreamer.gst.Caps} to which level and profile fields are to be added
     * @param audioConfig a pointer to the AudioSpecificConfig
     *                as specified in the Elementary Stream Descriptor (esds)
     *                in ISO/IEC 14496-1. (See below for more details)
     * @param len Length of {@code audio_config} in bytes
     * @return {@code true} if the level and profile could be set, {@code false} otherwise.
     */
    public static boolean codecUtilsAacCapsSetLevelAndProfile(org.gstreamer.gst.Caps caps, byte[] audioConfig, int len) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_codec_utils_aac_caps_set_level_and_profile.invokeExact(
                    caps.handle(),
                    Interop.allocateNativeArray(audioConfig, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the channels of the given AAC stream.
     * @param audioConfig a pointer to the AudioSpecificConfig
     *                as specified in the Elementary Stream Descriptor (esds)
     *                in ISO/IEC 14496-1.
     * @param len Length of {@code audio_config} in bytes
     * @return The channels or 0 if the channel could not be determined.
     */
    public static int codecUtilsAacGetChannels(byte[] audioConfig, int len) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_codec_utils_aac_get_channels.invokeExact(
                    Interop.allocateNativeArray(audioConfig, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Translates the sample rate to the index corresponding to it in AAC spec.
     * @param rate Sample rate
     * @return The AAC index for this sample rate, -1 if the rate is not a
     * valid AAC sample rate.
     */
    public static int codecUtilsAacGetIndexFromSampleRate(int rate) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_codec_utils_aac_get_index_from_sample_rate.invokeExact(
                    rate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Determines the level of a stream as defined in ISO/IEC 14496-3. For AAC LC
     * streams, the constraints from the AAC audio profile are applied. For AAC
     * Main, LTP, SSR and others, the Main profile is used.
     * <p>
     * The {@code audio_config} parameter follows the following format, starting from the
     * most significant bit of the first byte:
     * <p>
     *   * Bit 0:4 contains the AudioObjectType (if this is 0x5, then the
     *     real AudioObjectType is carried after the rate and channel data)
     *   * Bit 5:8 contains the sample frequency index (if this is 0xf, then the
     *     next 24 bits define the actual sample frequency, and subsequent
     *     fields are appropriately shifted).
     *   * Bit 9:12 contains the channel configuration
     * @param audioConfig a pointer to the AudioSpecificConfig
     *                as specified in the Elementary Stream Descriptor (esds)
     *                in ISO/IEC 14496-1.
     * @param len Length of {@code audio_config} in bytes
     * @return The level as a const string and {@code null} if the level could not be
     * determined.
     */
    public static @Nullable java.lang.String codecUtilsAacGetLevel(byte[] audioConfig, int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_codec_utils_aac_get_level.invokeExact(
                    Interop.allocateNativeArray(audioConfig, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the profile of the given AAC stream as a string. The profile is
     * normally determined using the AudioObjectType field which is in the first
     * 5 bits of {@code audio_config}
     * @param audioConfig a pointer to the AudioSpecificConfig
     *                as specified in the Elementary Stream Descriptor (esds)
     *                in ISO/IEC 14496-1.
     * @param len Length of {@code audio_config} in bytes
     * @return The profile as a const string and {@code null} if the profile could not be
     * determined.
     */
    public static @Nullable java.lang.String codecUtilsAacGetProfile(byte[] audioConfig, int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_codec_utils_aac_get_profile.invokeExact(
                    Interop.allocateNativeArray(audioConfig, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Translates the sample rate index found in AAC headers to the actual sample
     * rate.
     * @param audioConfig a pointer to the AudioSpecificConfig
     *                as specified in the Elementary Stream Descriptor (esds)
     *                in ISO/IEC 14496-1.
     * @param len Length of {@code audio_config}
     * @return The sample rate if sr_idx is valid, 0 otherwise.
     */
    public static int codecUtilsAacGetSampleRate(byte[] audioConfig, int len) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_codec_utils_aac_get_sample_rate.invokeExact(
                    Interop.allocateNativeArray(audioConfig, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Translates the sample rate index found in AAC headers to the actual sample
     * rate.
     * @param srIdx Sample rate index as from the AudioSpecificConfig (MPEG-4
     *          container) or ADTS frame header
     * @return The sample rate if {@code sr_idx} is valid, 0 otherwise.
     */
    public static int codecUtilsAacGetSampleRateFromIndex(int srIdx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_codec_utils_aac_get_sample_rate_from_index.invokeExact(
                    srIdx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Converts {@code caps} to a RFC 6381 compatible codec string if possible.
     * <p>
     * Useful for providing the 'codecs' field inside the 'Content-Type' HTTP
     * header for containerized formats, such as mp4 or matroska.
     * <p>
     * Registered codecs can be found at http://mp4ra.org/{@code /codecs}
     * @param caps A {@link org.gstreamer.gst.Caps} to convert to mime codec
     * @return a RFC 6381 compatible codec string or {@code null}
     */
    public static @Nullable java.lang.String codecUtilsCapsGetMimeCodec(org.gstreamer.gst.Caps caps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_codec_utils_caps_get_mime_codec.invokeExact(
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Sets the level and profile in {@code caps} if it can be determined from {@code sps}. See
     * gst_codec_utils_h264_get_level() and gst_codec_utils_h264_get_profile()
     * for more details on the parameters.
     * @param caps the {@link org.gstreamer.gst.Caps} to which the level and profile are to be added
     * @param sps Pointer to the sequence parameter set for the stream.
     * @param len Length of the data available in {@code sps}.
     * @return {@code true} if the level and profile could be set, {@code false} otherwise.
     */
    public static boolean codecUtilsH264CapsSetLevelAndProfile(org.gstreamer.gst.Caps caps, byte[] sps, int len) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_codec_utils_h264_caps_set_level_and_profile.invokeExact(
                    caps.handle(),
                    Interop.allocateNativeArray(sps, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Converts the level indication (level_idc) in the stream's
     * sequence parameter set into a string. The SPS is expected to have the
     * same format as for gst_codec_utils_h264_get_profile().
     * @param sps Pointer to the sequence parameter set for the stream.
     * @param len Length of the data available in {@code sps}.
     * @return The level as a const string, or {@code null} if there is an error.
     */
    public static @Nullable java.lang.String codecUtilsH264GetLevel(byte[] sps, int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_codec_utils_h264_get_level.invokeExact(
                    Interop.allocateNativeArray(sps, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Transform a level string from the caps into the level_idc
     * @param level A level string from caps
     * @return the level_idc or 0 if the level is unknown
     */
    public static byte codecUtilsH264GetLevelIdc(java.lang.String level) {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.gst_codec_utils_h264_get_level_idc.invokeExact(
                    Marshal.stringToAddress.marshal(level, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Converts the profile indication (profile_idc) in the stream's
     * sequence parameter set into a string. The SPS is expected to have the
     * following format, as defined in the H.264 specification. The SPS is viewed
     * as a bitstream here, with bit 0 being the most significant bit of the first
     * byte.
     * <p>
     * * Bit 0:7   - Profile indication
     * * Bit 8     - constraint_set0_flag
     * * Bit 9     - constraint_set1_flag
     * * Bit 10    - constraint_set2_flag
     * * Bit 11    - constraint_set3_flag
     * * Bit 12    - constraint_set3_flag
     * * Bit 13:15 - Reserved
     * * Bit 16:24 - Level indication
     * @param sps Pointer to the sequence parameter set for the stream.
     * @param len Length of the data available in {@code sps}.
     * @return The profile as a const string, or {@code null} if there is an error.
     */
    public static @Nullable java.lang.String codecUtilsH264GetProfile(byte[] sps, int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_codec_utils_h264_get_profile.invokeExact(
                    Interop.allocateNativeArray(sps, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Parses profile, flags, and level from a H264 AVCC extradata/sequence_header.
     * These are most commonly retrieved from a video/x-h264 caps with a codec_data
     * buffer.
     * <p>
     * The format of H264 AVCC extradata/sequence_header is documented in the
     * ITU-T H.264 specification section 7.3.2.1.1 as well as in ISO/IEC 14496-15
     * section 5.3.3.1.2.
     * @param codecData H264 AVCC extradata
     * @param len length of {@code codec_data}
     * @param profile return location for h264 profile_idc or {@code null}
     * @param flags return location for h264 constraint set flags or {@code null}
     * @param level return location h264 level_idc or {@code null}
     * @return {@code true} on success, {@code false} on failure
     */
    public static boolean codecUtilsH264GetProfileFlagsLevel(byte[] codecData, int len, Out<Byte> profile, Out<Byte> flags, Out<Byte> level) {
        MemorySegment profilePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment flagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment levelPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_codec_utils_h264_get_profile_flags_level.invokeExact(
                    Interop.allocateNativeArray(codecData, false),
                    len,
                    (Addressable) (profile == null ? MemoryAddress.NULL : (Addressable) profilePOINTER.address()),
                    (Addressable) (flags == null ? MemoryAddress.NULL : (Addressable) flagsPOINTER.address()),
                    (Addressable) (level == null ? MemoryAddress.NULL : (Addressable) levelPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (profile != null) profile.set(profilePOINTER.get(Interop.valueLayout.C_BYTE, 0));
        if (flags != null) flags.set(flagsPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        if (level != null) level.set(levelPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the level, tier and profile in {@code caps} if it can be determined from
     * {@code profile_tier_level}. See gst_codec_utils_h265_get_level(),
     * gst_codec_utils_h265_get_tier() and gst_codec_utils_h265_get_profile()
     * for more details on the parameters.
     * @param caps the {@link org.gstreamer.gst.Caps} to which the level, tier and profile are to be added
     * @param profileTierLevel Pointer to the profile_tier_level
     *   struct
     * @param len Length of the data available in {@code profile_tier_level}.
     * @return {@code true} if the level, tier, profile could be set, {@code false} otherwise.
     */
    public static boolean codecUtilsH265CapsSetLevelTierAndProfile(org.gstreamer.gst.Caps caps, byte[] profileTierLevel, int len) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_codec_utils_h265_caps_set_level_tier_and_profile.invokeExact(
                    caps.handle(),
                    Interop.allocateNativeArray(profileTierLevel, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Converts the level indication (general_level_idc) in the stream's
     * profile_tier_level structure into a string. The profiel_tier_level is
     * expected to have the same format as for gst_codec_utils_h264_get_profile().
     * @param profileTierLevel Pointer to the profile_tier_level
     *   for the stream
     * @param len Length of the data available in {@code profile_tier_level}.
     * @return The level as a const string, or {@code null} if there is an error.
     */
    public static @Nullable java.lang.String codecUtilsH265GetLevel(byte[] profileTierLevel, int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_codec_utils_h265_get_level.invokeExact(
                    Interop.allocateNativeArray(profileTierLevel, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Transform a level string from the caps into the level_idc
     * @param level A level string from caps
     * @return the level_idc or 0 if the level is unknown
     */
    public static byte codecUtilsH265GetLevelIdc(java.lang.String level) {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.gst_codec_utils_h265_get_level_idc.invokeExact(
                    Marshal.stringToAddress.marshal(level, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Converts the profile indication (general_profile_idc) in the stream's
     * profile_level_tier structure into a string. The profile_tier_level is
     * expected to have the following format, as defined in the H.265
     * specification. The profile_tier_level is viewed as a bitstream here,
     * with bit 0 being the most significant bit of the first byte.
     * <p>
     * * Bit 0:1   - general_profile_space
     * * Bit 2     - general_tier_flag
     * * Bit 3:7   - general_profile_idc
     * * Bit 8:39  - gernal_profile_compatibility_flags
     * * Bit 40    - general_progressive_source_flag
     * * Bit 41    - general_interlaced_source_flag
     * * Bit 42    - general_non_packed_constraint_flag
     * * Bit 43    - general_frame_only_constraint_flag
     * * Bit 44:87 - See below
     * * Bit 88:95 - general_level_idc
     * @param profileTierLevel Pointer to the profile_tier_level
     *   structure for the stream.
     * @param len Length of the data available in {@code profile_tier_level}
     * @return The profile as a const string, or {@code null} if there is an error.
     */
    public static @Nullable java.lang.String codecUtilsH265GetProfile(byte[] profileTierLevel, int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_codec_utils_h265_get_profile.invokeExact(
                    Interop.allocateNativeArray(profileTierLevel, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Converts the tier indication (general_tier_flag) in the stream's
     * profile_tier_level structure into a string. The profile_tier_level
     * is expected to have the same format as for gst_codec_utils_h264_get_profile().
     * @param profileTierLevel Pointer to the profile_tier_level
     *   for the stream.
     * @param len Length of the data available in {@code profile_tier_level}.
     * @return The tier as a const string, or {@code null} if there is an error.
     */
    public static @Nullable java.lang.String codecUtilsH265GetTier(byte[] profileTierLevel, int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_codec_utils_h265_get_tier.invokeExact(
                    Interop.allocateNativeArray(profileTierLevel, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Sets the level and profile in {@code caps} if it can be determined from
     * {@code vis_obj_seq}. See gst_codec_utils_mpeg4video_get_level() and
     * gst_codec_utils_mpeg4video_get_profile() for more details on the
     * parameters.
     * @param caps the {@link org.gstreamer.gst.Caps} to which the level and profile are to be added
     * @param visObjSeq Pointer to the visual object
     *   sequence for the stream.
     * @param len Length of the data available in {@code sps}.
     * @return {@code true} if the level and profile could be set, {@code false} otherwise.
     */
    public static boolean codecUtilsMpeg4videoCapsSetLevelAndProfile(org.gstreamer.gst.Caps caps, byte[] visObjSeq, int len) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_codec_utils_mpeg4video_caps_set_level_and_profile.invokeExact(
                    caps.handle(),
                    Interop.allocateNativeArray(visObjSeq, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Converts the level indication in the stream's visual object sequence into
     * a string. {@code vis_obj_seq} is expected to be the data following the visual
     * object sequence start code. Only the first byte
     * (profile_and_level_indication) is used.
     * @param visObjSeq Pointer to the visual object
     *   sequence for the stream.
     * @param len Length of the data available in {@code sps}.
     * @return The level as a const string, or NULL if there is an error.
     */
    public static @Nullable java.lang.String codecUtilsMpeg4videoGetLevel(byte[] visObjSeq, int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_codec_utils_mpeg4video_get_level.invokeExact(
                    Interop.allocateNativeArray(visObjSeq, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Converts the profile indication in the stream's visual object sequence into
     * a string. {@code vis_obj_seq} is expected to be the data following the visual
     * object sequence start code. Only the first byte
     * (profile_and_level_indication) is used.
     * @param visObjSeq Pointer to the visual object
     *   sequence for the stream.
     * @param len Length of the data available in {@code sps}.
     * @return The profile as a const string, or NULL if there is an error.
     */
    public static @Nullable java.lang.String codecUtilsMpeg4videoGetProfile(byte[] visObjSeq, int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_codec_utils_mpeg4video_get_profile.invokeExact(
                    Interop.allocateNativeArray(visObjSeq, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Creates Opus caps from the given parameters.
     * @param rate the sample rate
     * @param channels the number of channels
     * @param channelMappingFamily the channel mapping family
     * @param streamCount the number of independent streams
     * @param coupledCount the number of stereo streams
     * @param channelMapping the mapping between the streams
     * @return The {@link org.gstreamer.gst.Caps}, or {@code null} if the parameters would lead to
     * invalid Opus caps.
     */
    public static org.gstreamer.gst.Caps codecUtilsOpusCreateCaps(int rate, byte channels, byte channelMappingFamily, byte streamCount, byte coupledCount, byte[] channelMapping) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_codec_utils_opus_create_caps.invokeExact(
                    rate,
                    channels,
                    channelMappingFamily,
                    streamCount,
                    coupledCount,
                    (Addressable) (channelMapping == null ? MemoryAddress.NULL : Interop.allocateNativeArray(channelMapping, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates Opus caps from the given OpusHead {@code header} and comment header
     * {@code comments}.
     * @param header OpusHead header
     * @param comments Comment header or NULL
     * @return The {@link org.gstreamer.gst.Caps}.
     */
    public static org.gstreamer.gst.Caps codecUtilsOpusCreateCapsFromHeader(org.gstreamer.gst.Buffer header, @Nullable org.gstreamer.gst.Buffer comments) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_codec_utils_opus_create_caps_from_header.invokeExact(
                    header.handle(),
                    (Addressable) (comments == null ? MemoryAddress.NULL : comments.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates OpusHead header from the given parameters.
     * @param rate the sample rate
     * @param channels the number of channels
     * @param channelMappingFamily the channel mapping family
     * @param streamCount the number of independent streams
     * @param coupledCount the number of stereo streams
     * @param channelMapping the mapping between the streams
     * @param preSkip Pre-skip in 48kHz samples or 0
     * @param outputGain Output gain or 0
     * @return The {@link org.gstreamer.gst.Buffer} containing the OpusHead.
     */
    public static org.gstreamer.gst.Buffer codecUtilsOpusCreateHeader(int rate, byte channels, byte channelMappingFamily, byte streamCount, byte coupledCount, byte[] channelMapping, short preSkip, short outputGain) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_codec_utils_opus_create_header.invokeExact(
                    rate,
                    channels,
                    channelMappingFamily,
                    streamCount,
                    coupledCount,
                    (Addressable) (channelMapping == null ? MemoryAddress.NULL : Interop.allocateNativeArray(channelMapping, false)),
                    preSkip,
                    outputGain);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Parses Opus caps and fills the different fields with defaults if possible.
     * @param caps the {@link org.gstreamer.gst.Caps} to parse the data from
     * @param rate the sample rate
     * @param channels the number of channels
     * @param channelMappingFamily the channel mapping family
     * @param streamCount the number of independent streams
     * @param coupledCount the number of stereo streams
     * @param channelMapping the mapping between the streams
     * @return {@code true} if parsing was successful, {@code false} otherwise.
     */
    public static boolean codecUtilsOpusParseCaps(org.gstreamer.gst.Caps caps, Out<Integer> rate, Out<Byte> channels, Out<Byte> channelMappingFamily, Out<Byte> streamCount, Out<Byte> coupledCount, Out<byte[]> channelMapping) {
        MemorySegment ratePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment channelsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment channelMappingFamilyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment streamCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment coupledCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment channelMappingPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_codec_utils_opus_parse_caps.invokeExact(
                    caps.handle(),
                    (Addressable) (rate == null ? MemoryAddress.NULL : (Addressable) ratePOINTER.address()),
                    (Addressable) (channels == null ? MemoryAddress.NULL : (Addressable) channelsPOINTER.address()),
                    (Addressable) (channelMappingFamily == null ? MemoryAddress.NULL : (Addressable) channelMappingFamilyPOINTER.address()),
                    (Addressable) (streamCount == null ? MemoryAddress.NULL : (Addressable) streamCountPOINTER.address()),
                    (Addressable) (coupledCount == null ? MemoryAddress.NULL : (Addressable) coupledCountPOINTER.address()),
                    (Addressable) (channelMapping == null ? MemoryAddress.NULL : (Addressable) channelMappingPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (rate != null) rate.set(ratePOINTER.get(Interop.valueLayout.C_INT, 0));
        if (channels != null) channels.set(channelsPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        if (channelMappingFamily != null) channelMappingFamily.set(channelMappingFamilyPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        if (streamCount != null) streamCount.set(streamCountPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        if (coupledCount != null) coupledCount.set(coupledCountPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        channelMapping.set(MemorySegment.ofAddress(channelMappingPOINTER.get(Interop.valueLayout.ADDRESS, 0), 256 * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Parses the OpusHead header.
     * @param header the OpusHead {@link org.gstreamer.gst.Buffer}
     * @param rate the sample rate
     * @param channels the number of channels
     * @param channelMappingFamily the channel mapping family
     * @param streamCount the number of independent streams
     * @param coupledCount the number of stereo streams
     * @param channelMapping the mapping between the streams
     * @param preSkip Pre-skip in 48kHz samples or 0
     * @param outputGain Output gain or 0
     * @return {@code true} if parsing was successful, {@code false} otherwise.
     */
    public static boolean codecUtilsOpusParseHeader(org.gstreamer.gst.Buffer header, Out<Integer> rate, Out<Byte> channels, Out<Byte> channelMappingFamily, Out<Byte> streamCount, Out<Byte> coupledCount, Out<byte[]> channelMapping, Out<Short> preSkip, Out<Short> outputGain) {
        MemorySegment ratePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment channelsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment channelMappingFamilyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment streamCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment coupledCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        MemorySegment channelMappingPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment preSkipPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        MemorySegment outputGainPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_codec_utils_opus_parse_header.invokeExact(
                    header.handle(),
                    (Addressable) (rate == null ? MemoryAddress.NULL : (Addressable) ratePOINTER.address()),
                    (Addressable) (channels == null ? MemoryAddress.NULL : (Addressable) channelsPOINTER.address()),
                    (Addressable) (channelMappingFamily == null ? MemoryAddress.NULL : (Addressable) channelMappingFamilyPOINTER.address()),
                    (Addressable) (streamCount == null ? MemoryAddress.NULL : (Addressable) streamCountPOINTER.address()),
                    (Addressable) (coupledCount == null ? MemoryAddress.NULL : (Addressable) coupledCountPOINTER.address()),
                    (Addressable) (channelMapping == null ? MemoryAddress.NULL : (Addressable) channelMappingPOINTER.address()),
                    (Addressable) (preSkip == null ? MemoryAddress.NULL : (Addressable) preSkipPOINTER.address()),
                    (Addressable) (outputGain == null ? MemoryAddress.NULL : (Addressable) outputGainPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (rate != null) rate.set(ratePOINTER.get(Interop.valueLayout.C_INT, 0));
        if (channels != null) channels.set(channelsPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        if (channelMappingFamily != null) channelMappingFamily.set(channelMappingFamilyPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        if (streamCount != null) streamCount.set(streamCountPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        if (coupledCount != null) coupledCount.set(coupledCountPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        if (preSkip != null) preSkip.set(preSkipPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        if (outputGain != null) outputGain.set(outputGainPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        channelMapping.set(MemorySegment.ofAddress(channelMappingPOINTER.get(Interop.valueLayout.ADDRESS, 0), 256 * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * List all available {@link EncodingTarget} for the specified category, or all categories
     * if {@code categoryname} is {@code null}.
     * @param categoryname The category, for ex: {@code GST_ENCODING_CATEGORY_DEVICE}.
     * Can be {@code null}.
     * @return The list of {@link EncodingTarget}
     */
    public static org.gtk.glib.List encodingListAllTargets(@Nullable java.lang.String categoryname) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_list_all_targets.invokeExact(
                    (Addressable) (categoryname == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(categoryname, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Lists all {@link EncodingTarget} categories present on disk.
     * @return A list
     * of {@link EncodingTarget} categories.
     */
    public static org.gtk.glib.List encodingListAvailableCategories() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_encoding_list_available_categories.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Requests plugin installation without blocking. Once the plugins have been
     * installed or installation has failed, {@code func} will be called with the result
     * of the installation and your provided {@code user_data} pointer.
     * <p>
     * This function requires a running GLib/Gtk main loop. If you are not
     * running a GLib/Gtk main loop, make sure to regularly call
     * g_main_context_iteration(NULL,FALSE).
     * <p>
     * The installer strings that make up {@code detail} are typically obtained by
     * calling gst_missing_plugin_message_get_installer_detail() on missing-plugin
     * messages that have been caught on a pipeline's bus or created by the
     * application via the provided API, such as gst_missing_element_message_new().
     * <p>
     * It is possible to request the installation of multiple missing plugins in
     * one go (as might be required if there is a demuxer for a certain format
     * installed but no suitable video decoder and no suitable audio decoder).
     * @param details NULL-terminated array
     *     of installer string details (see below)
     * @param ctx a {@link InstallPluginsContext}, or NULL
     * @param func the function to call when the installer program returns
     * @return result code whether an external installer could be started
     */
    public static org.gstreamer.pbutils.InstallPluginsReturn installPluginsAsync(java.lang.String[] details, @Nullable org.gstreamer.pbutils.InstallPluginsContext ctx, org.gstreamer.pbutils.InstallPluginsResultFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_install_plugins_async.invokeExact(
                    Interop.allocateNativeArray(details, false),
                    (Addressable) (ctx == null ? MemoryAddress.NULL : ctx.handle()),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.pbutils.InstallPluginsReturn.of(RESULT);
    }
    
    /**
     * Checks whether plugin installation (initiated by this application only)
     * is currently in progress.
     * @return TRUE if plugin installation is in progress, otherwise FALSE
     */
    public static boolean installPluginsInstallationInProgress() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_install_plugins_installation_in_progress.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Convenience function to return the descriptive string associated
     * with a status code.  This function returns English strings and
     * should not be used for user messages. It is here only to assist
     * in debugging.
     * @param ret the return status code
     * @return a descriptive string for the status code in {@code ret}
     */
    public static java.lang.String installPluginsReturnGetName(org.gstreamer.pbutils.InstallPluginsReturn ret) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_install_plugins_return_get_name.invokeExact(
                    ret.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Checks whether plugin installation is likely to be supported by the
     * current environment. This currently only checks whether the helper script
     * that is to be provided by the distribution or operating system vendor
     * exists.
     * @return TRUE if plugin installation is likely to be supported.
     */
    public static boolean installPluginsSupported() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_install_plugins_supported.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Requests plugin installation and block until the plugins have been
     * installed or installation has failed.
     * <p>
     * This function should almost never be used, it only exists for cases where
     * a non-GLib main loop is running and the user wants to run it in a separate
     * thread and marshal the result back asynchronously into the main thread
     * using the other non-GLib main loop. You should almost always use
     * gst_install_plugins_async() instead of this function.
     * @param details NULL-terminated array
     *     of installer string details
     * @param ctx a {@link InstallPluginsContext}, or NULL
     * @return the result of the installation.
     */
    public static org.gstreamer.pbutils.InstallPluginsReturn installPluginsSync(java.lang.String[] details, @Nullable org.gstreamer.pbutils.InstallPluginsContext ctx) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_install_plugins_sync.invokeExact(
                    Interop.allocateNativeArray(details, false),
                    (Addressable) (ctx == null ? MemoryAddress.NULL : ctx.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.pbutils.InstallPluginsReturn.of(RESULT);
    }
    
    /**
     * Checks whether {@code msg} is a missing plugins message.
     * @param msg a {@link org.gstreamer.gst.Message}
     * @return {@code true} if {@code msg} is a missing-plugins message, otherwise {@code false}.
     */
    public static boolean isMissingPluginMessage(org.gstreamer.gst.Message msg) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_is_missing_plugin_message.invokeExact(
                    msg.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns an opaque string containing all the details about the missing
     * element to be passed to an external installer called via
     * gst_install_plugins_async() or gst_install_plugins_sync().
     * <p>
     * This function is mainly for applications that call external plugin
     * installation mechanisms using one of the two above-mentioned functions in
     * the case where the application knows exactly what kind of plugin it is
     * missing.
     * @param decodeCaps the (fixed) caps for which a decoder element is needed
     * @return a newly-allocated detail string, or NULL on error. Free string
     *          with g_free() when not needed any longer.
     */
    public static java.lang.String missingDecoderInstallerDetailNew(org.gstreamer.gst.Caps decodeCaps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_missing_decoder_installer_detail_new.invokeExact(
                    decodeCaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Creates a missing-plugin message for {@code element} to notify the application
     * that a decoder element for a particular set of (fixed) caps is missing.
     * This function is mainly for use in plugins.
     * @param element the {@link org.gstreamer.gst.Element} posting the message
     * @param decodeCaps the (fixed) caps for which a decoder element is needed
     * @return a new {@link org.gstreamer.gst.Message}, or NULL on error
     */
    public static org.gstreamer.gst.Message missingDecoderMessageNew(org.gstreamer.gst.Element element, org.gstreamer.gst.Caps decodeCaps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_missing_decoder_message_new.invokeExact(
                    element.handle(),
                    decodeCaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Message.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns an opaque string containing all the details about the missing
     * element to be passed to an external installer called via
     * gst_install_plugins_async() or gst_install_plugins_sync().
     * <p>
     * This function is mainly for applications that call external plugin
     * installation mechanisms using one of the two above-mentioned functions in
     * the case where the application knows exactly what kind of plugin it is
     * missing.
     * @param factoryName the name of the missing element (element factory),
     *            e.g. "videoscale" or "cdparanoiasrc"
     * @return a newly-allocated detail string, or NULL on error. Free string
     *          with g_free() when not needed any longer.
     */
    public static java.lang.String missingElementInstallerDetailNew(java.lang.String factoryName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_missing_element_installer_detail_new.invokeExact(
                    Marshal.stringToAddress.marshal(factoryName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Creates a missing-plugin message for {@code element} to notify the application
     * that a certain required element is missing. This function is mainly for
     * use in plugins.
     * @param element the {@link org.gstreamer.gst.Element} posting the message
     * @param factoryName the name of the missing element (element factory),
     *            e.g. "videoscale" or "cdparanoiasrc"
     * @return a new {@link org.gstreamer.gst.Message}, or NULL on error
     */
    public static org.gstreamer.gst.Message missingElementMessageNew(org.gstreamer.gst.Element element, java.lang.String factoryName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_missing_element_message_new.invokeExact(
                    element.handle(),
                    Marshal.stringToAddress.marshal(factoryName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Message.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns an opaque string containing all the details about the missing
     * element to be passed to an external installer called via
     * gst_install_plugins_async() or gst_install_plugins_sync().
     * <p>
     * This function is mainly for applications that call external plugin
     * installation mechanisms using one of the two above-mentioned functions in
     * the case where the application knows exactly what kind of plugin it is
     * missing.
     * @param encodeCaps the (fixed) caps for which an encoder element is needed
     * @return a newly-allocated detail string, or NULL on error. Free string
     *          with g_free() when not needed any longer.
     */
    public static java.lang.String missingEncoderInstallerDetailNew(org.gstreamer.gst.Caps encodeCaps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_missing_encoder_installer_detail_new.invokeExact(
                    encodeCaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Creates a missing-plugin message for {@code element} to notify the application
     * that an encoder element for a particular set of (fixed) caps is missing.
     * This function is mainly for use in plugins.
     * @param element the {@link org.gstreamer.gst.Element} posting the message
     * @param encodeCaps the (fixed) caps for which an encoder element is needed
     * @return a new {@link org.gstreamer.gst.Message}, or NULL on error
     */
    public static org.gstreamer.gst.Message missingEncoderMessageNew(org.gstreamer.gst.Element element, org.gstreamer.gst.Caps encodeCaps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_missing_encoder_message_new.invokeExact(
                    element.handle(),
                    encodeCaps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Message.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a localised string describing the missing feature, for use in
     * error dialogs and the like. Should never return NULL unless {@code msg} is not
     * a valid missing-plugin message.
     * <p>
     * This function is mainly for applications that need a human-readable string
     * describing a missing plugin, given a previously collected missing-plugin
     * message
     * @param msg a missing-plugin {@link org.gstreamer.gst.Message} of type {@code GST_MESSAGE_ELEMENT}
     * @return a newly-allocated description string, or NULL on error. Free
     *          string with g_free() when not needed any longer.
     */
    public static java.lang.String missingPluginMessageGetDescription(org.gstreamer.gst.Message msg) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_missing_plugin_message_get_description.invokeExact(
                    msg.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns an opaque string containing all the details about the missing
     * element to be passed to an external installer called via
     * gst_install_plugins_async() or gst_install_plugins_sync().
     * <p>
     * This function is mainly for applications that call external plugin
     * installation mechanisms using one of the two above-mentioned functions.
     * @param msg a missing-plugin {@link org.gstreamer.gst.Message} of type {@code GST_MESSAGE_ELEMENT}
     * @return a newly-allocated detail string, or NULL on error. Free string
     *          with g_free() when not needed any longer.
     */
    public static java.lang.String missingPluginMessageGetInstallerDetail(org.gstreamer.gst.Message msg) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_missing_plugin_message_get_installer_detail.invokeExact(
                    msg.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns an opaque string containing all the details about the missing
     * element to be passed to an external installer called via
     * gst_install_plugins_async() or gst_install_plugins_sync().
     * <p>
     * This function is mainly for applications that call external plugin
     * installation mechanisms using one of the two above-mentioned functions in
     * the case where the application knows exactly what kind of plugin it is
     * missing.
     * @param protocol the URI protocol the missing source needs to implement,
     *            e.g. "http" or "mms"
     * @return a newly-allocated detail string, or NULL on error. Free string
     *          with g_free() when not needed any longer.
     */
    public static java.lang.String missingUriSinkInstallerDetailNew(java.lang.String protocol) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_missing_uri_sink_installer_detail_new.invokeExact(
                    Marshal.stringToAddress.marshal(protocol, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Creates a missing-plugin message for {@code element} to notify the application
     * that a sink element for a particular URI protocol is missing. This
     * function is mainly for use in plugins.
     * @param element the {@link org.gstreamer.gst.Element} posting the message
     * @param protocol the URI protocol the missing sink needs to implement,
     *            e.g. "http" or "smb"
     * @return a new {@link org.gstreamer.gst.Message}, or NULL on error
     */
    public static org.gstreamer.gst.Message missingUriSinkMessageNew(org.gstreamer.gst.Element element, java.lang.String protocol) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_missing_uri_sink_message_new.invokeExact(
                    element.handle(),
                    Marshal.stringToAddress.marshal(protocol, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Message.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns an opaque string containing all the details about the missing
     * element to be passed to an external installer called via
     * gst_install_plugins_async() or gst_install_plugins_sync().
     * <p>
     * This function is mainly for applications that call external plugin
     * installation mechanisms using one of the two above-mentioned functions in
     * the case where the application knows exactly what kind of plugin it is
     * missing.
     * @param protocol the URI protocol the missing source needs to implement,
     *            e.g. "http" or "mms"
     * @return a newly-allocated detail string, or NULL on error. Free string
     *          with g_free() when not needed any longer.
     */
    public static java.lang.String missingUriSourceInstallerDetailNew(java.lang.String protocol) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_missing_uri_source_installer_detail_new.invokeExact(
                    Marshal.stringToAddress.marshal(protocol, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Creates a missing-plugin message for {@code element} to notify the application
     * that a source element for a particular URI protocol is missing. This
     * function is mainly for use in plugins.
     * @param element the {@link org.gstreamer.gst.Element} posting the message
     * @param protocol the URI protocol the missing source needs to implement,
     *            e.g. "http" or "mms"
     * @return a new {@link org.gstreamer.gst.Message}, or NULL on error
     */
    public static org.gstreamer.gst.Message missingUriSourceMessageNew(org.gstreamer.gst.Element element, java.lang.String protocol) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_missing_uri_source_message_new.invokeExact(
                    element.handle(),
                    Marshal.stringToAddress.marshal(protocol, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Message.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Adds a codec tag describing the format specified by {@code caps} to {@code taglist}.
     * @param taglist a {@link org.gstreamer.gst.TagList}
     * @param codecTag a GStreamer codec tag such as {@code GST_TAG_AUDIO_CODEC},
     *             {@code GST_TAG_VIDEO_CODEC} or {@code GST_TAG_CODEC}. If none is specified,
     *             the function will attempt to detect the appropriate category.
     * @param caps the (fixed) {@link org.gstreamer.gst.Caps} for which a codec tag should be added.
     * @return TRUE if a codec tag was added, FALSE otherwise.
     */
    public static boolean pbUtilsAddCodecDescriptionToTagList(org.gstreamer.gst.TagList taglist, @Nullable java.lang.String codecTag, org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pb_utils_add_codec_description_to_tag_list.invokeExact(
                    taglist.handle(),
                    (Addressable) (codecTag == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(codecTag, null)),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns flags that describe the format of the caps if known. No flags are
     * set for unknown caps.
     * @param caps the (fixed) {@link org.gstreamer.gst.Caps} for which flags are requested
     * @return {@link PbUtilsCapsDescriptionFlags} that describe {@code caps}, or no flags
     *          if the caps are unknown.
     */
    public static org.gstreamer.pbutils.PbUtilsCapsDescriptionFlags pbUtilsGetCapsDescriptionFlags(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pb_utils_get_caps_description_flags.invokeExact(
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.pbutils.PbUtilsCapsDescriptionFlags(RESULT);
    }
    
    /**
     * Returns a localised (as far as this is possible) string describing the
     * media format specified in {@code caps}, for use in error dialogs or other messages
     * to be seen by the user. Should never return NULL unless {@code caps} is invalid.
     * <p>
     * Also see the convenience function
     * gst_pb_utils_add_codec_description_to_tag_list().
     * @param caps the (fixed) {@link org.gstreamer.gst.Caps} for which an format description is needed
     * @return a newly-allocated description string, or NULL on error. Free
     *          string with g_free() when not needed any longer.
     */
    public static java.lang.String pbUtilsGetCodecDescription(org.gstreamer.gst.Caps caps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pb_utils_get_codec_description.invokeExact(
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns a localised string describing an decoder for the format specified
     * in {@code caps}, for use in error dialogs or other messages to be seen by the user.
     * Should never return NULL unless {@code factory_name} or {@code caps} are invalid.
     * <p>
     * This function is mainly for internal use, applications would typically
     * use gst_missing_plugin_message_get_description() to get a description of
     * a missing feature from a missing-plugin message.
     * @param caps the (fixed) {@link org.gstreamer.gst.Caps} for which an decoder description is needed
     * @return a newly-allocated description string, or NULL on error. Free
     *          string with g_free() when not needed any longer.
     */
    public static java.lang.String pbUtilsGetDecoderDescription(org.gstreamer.gst.Caps caps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pb_utils_get_decoder_description.invokeExact(
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns a localised string describing the given element, for use in
     * error dialogs or other messages to be seen by the user. Should never
     * return NULL unless {@code factory_name} is invalid.
     * <p>
     * This function is mainly for internal use, applications would typically
     * use gst_missing_plugin_message_get_description() to get a description of
     * a missing feature from a missing-plugin message.
     * @param factoryName the name of the element, e.g. "giosrc"
     * @return a newly-allocated description string, or NULL on error. Free
     *          string with g_free() when not needed any longer.
     */
    public static java.lang.String pbUtilsGetElementDescription(java.lang.String factoryName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pb_utils_get_element_description.invokeExact(
                    Marshal.stringToAddress.marshal(factoryName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns a localised string describing an encoder for the format specified
     * in {@code caps}, for use in error dialogs or other messages to be seen by the user.
     * Should never return NULL unless {@code factory_name} or {@code caps} are invalid.
     * <p>
     * This function is mainly for internal use, applications would typically
     * use gst_missing_plugin_message_get_description() to get a description of
     * a missing feature from a missing-plugin message.
     * @param caps the (fixed) {@link org.gstreamer.gst.Caps} for which an encoder description is needed
     * @return a newly-allocated description string, or NULL on error. Free
     *          string with g_free() when not needed any longer.
     */
    public static java.lang.String pbUtilsGetEncoderDescription(org.gstreamer.gst.Caps caps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pb_utils_get_encoder_description.invokeExact(
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns a possible file extension for the given caps, if known.
     * @param caps the (fixed) {@link org.gstreamer.gst.Caps} for which a file extension is needed
     * @return a newly-allocated file extension string, or NULL on error. Free
     *          string with g_free() when not needed any longer.
     */
    public static @Nullable java.lang.String pbUtilsGetFileExtensionFromCaps(org.gstreamer.gst.Caps caps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pb_utils_get_file_extension_from_caps.invokeExact(
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns a localised string describing a sink element handling the protocol
     * specified in {@code protocol}, for use in error dialogs or other messages to be
     * seen by the user. Should never return NULL unless {@code protocol} is invalid.
     * <p>
     * This function is mainly for internal use, applications would typically
     * use gst_missing_plugin_message_get_description() to get a description of
     * a missing feature from a missing-plugin message.
     * @param protocol the protocol the sink element needs to handle, e.g. "http"
     * @return a newly-allocated description string, or NULL on error. Free
     *          string with g_free() when not needed any longer.
     */
    public static java.lang.String pbUtilsGetSinkDescription(java.lang.String protocol) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pb_utils_get_sink_description.invokeExact(
                    Marshal.stringToAddress.marshal(protocol, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns a localised string describing a source element handling the protocol
     * specified in {@code protocol}, for use in error dialogs or other messages to be
     * seen by the user. Should never return NULL unless {@code protocol} is invalid.
     * <p>
     * This function is mainly for internal use, applications would typically
     * use gst_missing_plugin_message_get_description() to get a description of
     * a missing feature from a missing-plugin message.
     * @param protocol the protocol the source element needs to handle, e.g. "http"
     * @return a newly-allocated description string, or NULL on error. Free
     *          string with g_free() when not needed any longer.
     */
    public static java.lang.String pbUtilsGetSourceDescription(java.lang.String protocol) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pb_utils_get_source_description.invokeExact(
                    Marshal.stringToAddress.marshal(protocol, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Initialises the base utils support library. This function is not
     * thread-safe. Applications should call it after calling gst_init(),
     * plugins should call it from their plugin_init function.
     * <p>
     * This function may be called multiple times. It will do nothing if the
     * library has already been initialised.
     */
    public static void pbUtilsInit() {
        try {
            DowncallHandles.gst_pb_utils_init.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the version number of the GStreamer Plugins Base libraries.
     * @param major pointer to a guint to store the major version number, or {@code null}
     * @param minor pointer to a guint to store the minor version number, or {@code null}
     * @param micro pointer to a guint to store the micro version number, or {@code null}
     * @param nano pointer to a guint to store the nano version number, or {@code null}
     */
    public static void pluginsBaseVersion(Out<Integer> major, Out<Integer> minor, Out<Integer> micro, Out<Integer> nano) {
        MemorySegment majorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment minorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment microPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment nanoPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_plugins_base_version.invokeExact(
                    (Addressable) majorPOINTER.address(),
                    (Addressable) minorPOINTER.address(),
                    (Addressable) microPOINTER.address(),
                    (Addressable) nanoPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        major.set(majorPOINTER.get(Interop.valueLayout.C_INT, 0));
        minor.set(minorPOINTER.get(Interop.valueLayout.C_INT, 0));
        micro.set(microPOINTER.get(Interop.valueLayout.C_INT, 0));
        nano.set(nanoPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * This function returns a string that is useful for describing this version
     * of GStreamer's gst-plugins-base libraries to the outside world: user agent
     * strings, logging, about dialogs ...
     * @return a newly allocated string describing this version of gst-plugins-base
     */
    public static java.lang.String pluginsBaseVersionString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugins_base_version_string.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_codec_utils_aac_caps_set_level_and_profile = Interop.downcallHandle(
            "gst_codec_utils_aac_caps_set_level_and_profile",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_aac_get_channels = Interop.downcallHandle(
            "gst_codec_utils_aac_get_channels",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_aac_get_index_from_sample_rate = Interop.downcallHandle(
            "gst_codec_utils_aac_get_index_from_sample_rate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_aac_get_level = Interop.downcallHandle(
            "gst_codec_utils_aac_get_level",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_aac_get_profile = Interop.downcallHandle(
            "gst_codec_utils_aac_get_profile",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_aac_get_sample_rate = Interop.downcallHandle(
            "gst_codec_utils_aac_get_sample_rate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_aac_get_sample_rate_from_index = Interop.downcallHandle(
            "gst_codec_utils_aac_get_sample_rate_from_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_caps_get_mime_codec = Interop.downcallHandle(
            "gst_codec_utils_caps_get_mime_codec",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_codec_utils_h264_caps_set_level_and_profile = Interop.downcallHandle(
            "gst_codec_utils_h264_caps_set_level_and_profile",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_h264_get_level = Interop.downcallHandle(
            "gst_codec_utils_h264_get_level",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_h264_get_level_idc = Interop.downcallHandle(
            "gst_codec_utils_h264_get_level_idc",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_codec_utils_h264_get_profile = Interop.downcallHandle(
            "gst_codec_utils_h264_get_profile",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_h264_get_profile_flags_level = Interop.downcallHandle(
            "gst_codec_utils_h264_get_profile_flags_level",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_codec_utils_h265_caps_set_level_tier_and_profile = Interop.downcallHandle(
            "gst_codec_utils_h265_caps_set_level_tier_and_profile",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_h265_get_level = Interop.downcallHandle(
            "gst_codec_utils_h265_get_level",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_h265_get_level_idc = Interop.downcallHandle(
            "gst_codec_utils_h265_get_level_idc",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_codec_utils_h265_get_profile = Interop.downcallHandle(
            "gst_codec_utils_h265_get_profile",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_h265_get_tier = Interop.downcallHandle(
            "gst_codec_utils_h265_get_tier",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_mpeg4video_caps_set_level_and_profile = Interop.downcallHandle(
            "gst_codec_utils_mpeg4video_caps_set_level_and_profile",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_mpeg4video_get_level = Interop.downcallHandle(
            "gst_codec_utils_mpeg4video_get_level",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_mpeg4video_get_profile = Interop.downcallHandle(
            "gst_codec_utils_mpeg4video_get_profile",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_opus_create_caps = Interop.downcallHandle(
            "gst_codec_utils_opus_create_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_codec_utils_opus_create_caps_from_header = Interop.downcallHandle(
            "gst_codec_utils_opus_create_caps_from_header",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_codec_utils_opus_create_header = Interop.downcallHandle(
            "gst_codec_utils_opus_create_header",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT),
            false
        );
        
        private static final MethodHandle gst_codec_utils_opus_parse_caps = Interop.downcallHandle(
            "gst_codec_utils_opus_parse_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_codec_utils_opus_parse_header = Interop.downcallHandle(
            "gst_codec_utils_opus_parse_header",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_list_all_targets = Interop.downcallHandle(
            "gst_encoding_list_all_targets",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_encoding_list_available_categories = Interop.downcallHandle(
            "gst_encoding_list_available_categories",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_install_plugins_async = Interop.downcallHandle(
            "gst_install_plugins_async",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_install_plugins_installation_in_progress = Interop.downcallHandle(
            "gst_install_plugins_installation_in_progress",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_install_plugins_return_get_name = Interop.downcallHandle(
            "gst_install_plugins_return_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_install_plugins_supported = Interop.downcallHandle(
            "gst_install_plugins_supported",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_install_plugins_sync = Interop.downcallHandle(
            "gst_install_plugins_sync",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_is_missing_plugin_message = Interop.downcallHandle(
            "gst_is_missing_plugin_message",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_missing_decoder_installer_detail_new = Interop.downcallHandle(
            "gst_missing_decoder_installer_detail_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_missing_decoder_message_new = Interop.downcallHandle(
            "gst_missing_decoder_message_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_missing_element_installer_detail_new = Interop.downcallHandle(
            "gst_missing_element_installer_detail_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_missing_element_message_new = Interop.downcallHandle(
            "gst_missing_element_message_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_missing_encoder_installer_detail_new = Interop.downcallHandle(
            "gst_missing_encoder_installer_detail_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_missing_encoder_message_new = Interop.downcallHandle(
            "gst_missing_encoder_message_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_missing_plugin_message_get_description = Interop.downcallHandle(
            "gst_missing_plugin_message_get_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_missing_plugin_message_get_installer_detail = Interop.downcallHandle(
            "gst_missing_plugin_message_get_installer_detail",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_missing_uri_sink_installer_detail_new = Interop.downcallHandle(
            "gst_missing_uri_sink_installer_detail_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_missing_uri_sink_message_new = Interop.downcallHandle(
            "gst_missing_uri_sink_message_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_missing_uri_source_installer_detail_new = Interop.downcallHandle(
            "gst_missing_uri_source_installer_detail_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_missing_uri_source_message_new = Interop.downcallHandle(
            "gst_missing_uri_source_message_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pb_utils_add_codec_description_to_tag_list = Interop.downcallHandle(
            "gst_pb_utils_add_codec_description_to_tag_list",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pb_utils_get_caps_description_flags = Interop.downcallHandle(
            "gst_pb_utils_get_caps_description_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pb_utils_get_codec_description = Interop.downcallHandle(
            "gst_pb_utils_get_codec_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pb_utils_get_decoder_description = Interop.downcallHandle(
            "gst_pb_utils_get_decoder_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pb_utils_get_element_description = Interop.downcallHandle(
            "gst_pb_utils_get_element_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pb_utils_get_encoder_description = Interop.downcallHandle(
            "gst_pb_utils_get_encoder_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pb_utils_get_file_extension_from_caps = Interop.downcallHandle(
            "gst_pb_utils_get_file_extension_from_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pb_utils_get_sink_description = Interop.downcallHandle(
            "gst_pb_utils_get_sink_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pb_utils_get_source_description = Interop.downcallHandle(
            "gst_pb_utils_get_source_description",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_pb_utils_init = Interop.downcallHandle(
            "gst_pb_utils_init",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_plugins_base_version = Interop.downcallHandle(
            "gst_plugins_base_version",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_plugins_base_version_string = Interop.downcallHandle(
            "gst_plugins_base_version_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
}
