package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstRtp namespace.
 */
public final class GstRtp {
    
    static {
        LibLoad.loadLibrary("gstrtp-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}
    
/**
 * The maximum amount of SSRCs in a BYE packet.
 */
public static final int RTCP_MAX_BYE_SSRC_COUNT = 31;
    
/**
 * The maximum amount of Receiver report blocks in RR and SR messages.
 */
public static final int RTCP_MAX_RB_COUNT = 31;
    
/**
 * The maximum text length for an SDES item.
 */
public static final int RTCP_MAX_SDES = 255;
    
/**
 * The maximum amount of SDES items.
 */
public static final int RTCP_MAX_SDES_ITEM_COUNT = 31;
    
/**
 * Mask for version and packet type pair allowing reduced size
 * packets, basically it accepts other types than RR and SR
 */
public static final int RTCP_REDUCED_SIZE_VALID_MASK = 49400;
    
/**
 * Mask for version, padding bit and packet type pair
 */
public static final int RTCP_VALID_MASK = 57598;
    
/**
 * Valid value for the first two bytes of an RTCP packet after applying
 * {@code GST_RTCP_VALID_MASK} to them.
 */
public static final int RTCP_VALID_VALUE = 200;
    
/**
 * The supported RTCP version 2.
 */
public static final int RTCP_VERSION = 2;
    
public static final java.lang.String RTP_HDREXT_BASE = "urn:ietf:params:rtp-hdrext:";
    
/**
 * Constant string used in element classification to signal that this element
 * is a RTP header extension.
 */
public static final java.lang.String RTP_HDREXT_ELEMENT_CLASS = "Network/Extension/RTPHeader";
    
public static final java.lang.String RTP_HDREXT_NTP_56 = "ntp-56";
    
public static final int RTP_HDREXT_NTP_56_SIZE = 7;
    
public static final java.lang.String RTP_HDREXT_NTP_64 = "ntp-64";
    
public static final int RTP_HDREXT_NTP_64_SIZE = 8;
    
public static final java.lang.String RTP_HEADER_EXTENSION_URI_METADATA_KEY = "RTP-Header-Extension-URI";
    
public static final java.lang.String RTP_PAYLOAD_1016_STRING = "1";
    
public static final java.lang.String RTP_PAYLOAD_CELLB_STRING = "25";
    
public static final java.lang.String RTP_PAYLOAD_CN_STRING = "13";
    
public static final java.lang.String RTP_PAYLOAD_DVI4_11025_STRING = "16";
    
public static final java.lang.String RTP_PAYLOAD_DVI4_16000_STRING = "6";
    
public static final java.lang.String RTP_PAYLOAD_DVI4_22050_STRING = "17";
    
public static final java.lang.String RTP_PAYLOAD_DVI4_8000_STRING = "5";
    
public static final java.lang.String RTP_PAYLOAD_DYNAMIC_STRING = "[96, 127]";
    
public static final java.lang.String RTP_PAYLOAD_G721_STRING = "2";
    
public static final java.lang.String RTP_PAYLOAD_G722_STRING = "9";
    
public static final int RTP_PAYLOAD_G723_53 = 17;
    
public static final java.lang.String RTP_PAYLOAD_G723_53_STRING = "17";
    
public static final int RTP_PAYLOAD_G723_63 = 16;
    
public static final java.lang.String RTP_PAYLOAD_G723_63_STRING = "16";
    
public static final java.lang.String RTP_PAYLOAD_G723_STRING = "4";
    
public static final java.lang.String RTP_PAYLOAD_G728_STRING = "15";
    
public static final java.lang.String RTP_PAYLOAD_G729_STRING = "18";
    
public static final java.lang.String RTP_PAYLOAD_GSM_STRING = "3";
    
public static final java.lang.String RTP_PAYLOAD_H261_STRING = "31";
    
public static final java.lang.String RTP_PAYLOAD_H263_STRING = "34";
    
public static final java.lang.String RTP_PAYLOAD_JPEG_STRING = "26";
    
public static final java.lang.String RTP_PAYLOAD_L16_MONO_STRING = "11";
    
public static final java.lang.String RTP_PAYLOAD_L16_STEREO_STRING = "10";
    
public static final java.lang.String RTP_PAYLOAD_LPC_STRING = "7";
    
public static final java.lang.String RTP_PAYLOAD_MP2T_STRING = "33";
    
public static final java.lang.String RTP_PAYLOAD_MPA_STRING = "14";
    
public static final java.lang.String RTP_PAYLOAD_MPV_STRING = "32";
    
public static final java.lang.String RTP_PAYLOAD_NV_STRING = "28";
    
public static final java.lang.String RTP_PAYLOAD_PCMA_STRING = "8";
    
public static final java.lang.String RTP_PAYLOAD_PCMU_STRING = "0";
    
public static final java.lang.String RTP_PAYLOAD_QCELP_STRING = "12";
    
public static final int RTP_PAYLOAD_TS41 = 19;
    
public static final java.lang.String RTP_PAYLOAD_TS41_STRING = "19";
    
public static final int RTP_PAYLOAD_TS48 = 18;
    
public static final java.lang.String RTP_PAYLOAD_TS48_STRING = "18";
    
public static final int RTP_SOURCE_META_MAX_CSRC_COUNT = 15;
    
/**
 * The supported RTP version 2.
 */
public static final int RTP_VERSION = 2;

/**
 * Attaches RTP source information to {@code buffer}.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param ssrc pointer to the SSRC
 * @param csrc pointer to the CSRCs
 * @param csrcCount number of elements in {@code csrc}
 * @return the {@link RTPSourceMeta} on {@code buffer}.
 */
public static org.gstreamer.rtp.RTPSourceMeta bufferAddRtpSourceMeta(org.gstreamer.gst.Buffer buffer, PointerInteger ssrc, PointerInteger csrc, int csrcCount) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_rtp_source_meta.invokeExact(
                buffer.handle(),
                (Addressable) (ssrc == null ? MemoryAddress.NULL : ssrc.handle()),
                (Addressable) (csrc == null ? MemoryAddress.NULL : csrc.handle()),
                csrcCount);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.rtp.RTPSourceMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Find the {@link RTPSourceMeta} on {@code buffer}.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @return the {@link RTPSourceMeta} or {@code null} when there
 * is no such metadata on {@code buffer}.
 */
public static org.gstreamer.rtp.RTPSourceMeta bufferGetRtpSourceMeta(org.gstreamer.gst.Buffer buffer) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_buffer_get_rtp_source_meta.invokeExact(buffer.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.rtp.RTPSourceMeta.fromAddress.marshal(RESULT, null);
}

/**
 * Open {@code buffer} for reading or writing, depending on {@code flags}. The resulting RTCP
 * buffer state is stored in {@code rtcp}.
 * @param buffer a buffer with an RTCP packet
 * @param flags flags for the mapping
 * @param rtcp resulting {@link RTCPBuffer}
 */
public static boolean rtcpBufferMap(org.gstreamer.gst.Buffer buffer, org.gstreamer.gst.MapFlags flags, org.gstreamer.rtp.RTCPBuffer rtcp) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtcp_buffer_map.invokeExact(
                buffer.handle(),
                flags.getValue(),
                rtcp.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Create a new buffer for constructing RTCP packets. The packet will have a
 * maximum size of {@code mtu}.
 * @param mtu the maximum mtu size.
 * @return A newly allocated buffer.
 */
public static org.gstreamer.gst.Buffer rtcpBufferNew(int mtu) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtcp_buffer_new.invokeExact(mtu);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Create a new buffer and set the data to a copy of {@code len}
 * bytes of {@code data} and the size to {@code len}. The data will be freed when the buffer
 * is freed.
 * @param data data for the new buffer
 * @param len the length of data
 * @return A newly allocated buffer with a copy of {@code data} and of size {@code len}.
 */
public static org.gstreamer.gst.Buffer rtcpBufferNewCopyData(byte[] data, int len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtcp_buffer_new_copy_data.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Create a new buffer and set the data and size of the buffer to {@code data} and {@code len}
 * respectively. {@code data} will be freed when the buffer is unreffed, so this
 * function transfers ownership of {@code data} to the new buffer.
 * @param data data for the new buffer
 * @param len the length of data
 * @return A newly allocated buffer with {@code data} and of size {@code len}.
 */
public static org.gstreamer.gst.Buffer rtcpBufferNewTakeData(byte[] data, int len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtcp_buffer_new_take_data.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Check if the data pointed to by {@code buffer} is a valid RTCP packet using
 * gst_rtcp_buffer_validate_data().
 * @param buffer the buffer to validate
 * @return TRUE if {@code buffer} is a valid RTCP packet.
 */
public static boolean rtcpBufferValidate(org.gstreamer.gst.Buffer buffer) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtcp_buffer_validate.invokeExact(buffer.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Check if the {@code data} and {@code size} point to the data of a valid compound,
 * non-reduced size RTCP packet.
 * Use this function to validate a packet before using the other functions in
 * this module.
 * @param data the data to validate
 * @param len the length of {@code data} to validate
 * @return TRUE if the data points to a valid RTCP packet.
 */
public static boolean rtcpBufferValidateData(byte[] data, int len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_buffer_validate_data.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Check if the {@code data} and {@code size} point to the data of a valid RTCP packet.
 * Use this function to validate a packet before using the other functions in
 * this module.
 * <p>
 * This function is updated to support reduced size rtcp packets according to
 * RFC 5506 and will validate full compound RTCP packets as well as reduced
 * size RTCP packets.
 * @param data the data to validate
 * @param len the length of {@code data} to validate
 * @return TRUE if the data points to a valid RTCP packet.
 */
public static boolean rtcpBufferValidateDataReduced(byte[] data, int len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_buffer_validate_data_reduced.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Check if the data pointed to by {@code buffer} is a valid RTCP packet using
 * gst_rtcp_buffer_validate_reduced().
 * @param buffer the buffer to validate
 * @return TRUE if {@code buffer} is a valid RTCP packet.
 */
public static boolean rtcpBufferValidateReduced(org.gstreamer.gst.Buffer buffer) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtcp_buffer_validate_reduced.invokeExact(buffer.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Converts an NTP time to UNIX nanoseconds. {@code ntptime} can typically be
 * the NTP time of an SR RTCP message and contains, in the upper 32 bits, the
 * number of seconds since 1900 and, in the lower 32 bits, the fractional
 * seconds. The resulting value will be the number of nanoseconds since 1970.
 * @param ntptime an NTP timestamp
 * @return the UNIX time for {@code ntptime} in nanoseconds.
 */
public static long rtcpNtpToUnix(long ntptime) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_rtcp_ntp_to_unix.invokeExact(ntptime);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Convert {@code name} into a {@code GstRTCPSDESType}. {@code name} is typically a key in a
 * {@link org.gstreamer.gst.Structure} containing SDES items.
 * @param name a SDES name
 * @return the {@link RTCPSDESType} for {@code name} or {@code GST_RTCP_SDES_PRIV} when {@code name}
 * is a private sdes item.
 */
public static org.gstreamer.rtp.RTCPSDESType rtcpSdesNameToType(java.lang.String name) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtcp_sdes_name_to_type.invokeExact(Marshal.stringToAddress.marshal(name, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtp.RTCPSDESType.of(RESULT);
    }
}

/**
 * Converts {@code type} to the string equivalent. The string is typically used as a
 * key in a {@link org.gstreamer.gst.Structure} containing SDES items.
 * @param type a {@link RTCPSDESType}
 * @return the string equivalent of {@code type}
 */
public static java.lang.String rtcpSdesTypeToName(org.gstreamer.rtp.RTCPSDESType type) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtcp_sdes_type_to_name.invokeExact(type.getValue());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

/**
 * Converts a UNIX timestamp in nanoseconds to an NTP time. The caller should
 * pass a value with nanoseconds since 1970. The NTP time will, in the upper
 * 32 bits, contain the number of seconds since 1900 and, in the lower 32
 * bits, the fractional seconds. The resulting value can be used as an ntptime
 * for constructing SR RTCP packets.
 * @param unixtime an UNIX timestamp in nanoseconds
 * @return the NTP time for {@code unixtime}.
 */
public static long rtcpUnixToNtp(long unixtime) {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_rtcp_unix_to_ntp.invokeExact(unixtime);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Allocate enough data in {@code buffer} to hold an RTP packet with {@code csrc_count} CSRCs,
 * a payload length of {@code payload_len} and padding of {@code pad_len}.
 * {@code buffer} must be writable and all previous memory in {@code buffer} will be freed.
 * If {@code pad_len} is &gt;0, the padding bit will be set. All other RTP header fields
 * will be set to 0/FALSE.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param payloadLen the length of the payload
 * @param padLen the amount of padding
 * @param csrcCount the number of CSRC entries
 */
public static void rtpBufferAllocateData(org.gstreamer.gst.Buffer buffer, int payloadLen, byte padLen, byte csrcCount) {
    try {
        DowncallHandles.gst_rtp_buffer_allocate_data.invokeExact(
                buffer.handle(),
                payloadLen,
                padLen,
                csrcCount);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Calculate the header length of an RTP packet with {@code csrc_count} CSRC entries.
 * An RTP packet can have at most 15 CSRC entries.
 * @param csrcCount the number of CSRC entries
 * @return The length of an RTP header with {@code csrc_count} CSRC entries.
 */
public static int rtpBufferCalcHeaderLen(byte csrcCount) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtp_buffer_calc_header_len.invokeExact(csrcCount);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Calculate the total length of an RTP packet with a payload size of {@code payload_len},
 * a padding of {@code pad_len} and a {@code csrc_count} CSRC entries.
 * @param payloadLen the length of the payload
 * @param padLen the amount of padding
 * @param csrcCount the number of CSRC entries
 * @return The total length of an RTP header with given parameters.
 */
public static int rtpBufferCalcPacketLen(int payloadLen, byte padLen, byte csrcCount) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtp_buffer_calc_packet_len.invokeExact(
                payloadLen,
                padLen,
                csrcCount);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Calculate the length of the payload of an RTP packet with size {@code packet_len},
 * a padding of {@code pad_len} and a {@code csrc_count} CSRC entries.
 * @param packetLen the length of the total RTP packet
 * @param padLen the amount of padding
 * @param csrcCount the number of CSRC entries
 * @return The length of the payload of an RTP packet  with given parameters.
 */
public static int rtpBufferCalcPayloadLen(int packetLen, byte padLen, byte csrcCount) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtp_buffer_calc_payload_len.invokeExact(
                packetLen,
                padLen,
                csrcCount);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Compare two sequence numbers, taking care of wraparounds. This function
 * returns the difference between {@code seqnum1} and {@code seqnum2}.
 * @param seqnum1 a sequence number
 * @param seqnum2 a sequence number
 * @return a negative value if {@code seqnum1} is bigger than {@code seqnum2}, 0 if they
 * are equal or a positive value if {@code seqnum1} is smaller than {@code segnum2}.
 */
public static int rtpBufferCompareSeqnum(short seqnum1, short seqnum2) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtp_buffer_compare_seqnum.invokeExact(
                seqnum1,
                seqnum2);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Get the default clock-rate for the static payload type {@code payload_type}.
 * @param payloadType the static payload type
 * @return the default clock rate or -1 if the payload type is not static or
 * the clock-rate is undefined.
 */
public static int rtpBufferDefaultClockRate(byte payloadType) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtp_buffer_default_clock_rate.invokeExact(payloadType);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Update the {@code exttimestamp} field with the extended timestamp of {@code timestamp}
 * For the first call of the method, {@code exttimestamp} should point to a location
 * with a value of -1.
 * <p>
 * This function is able to handle both forward and backward timestamps taking
 * into account:
 * <ul>
 * <li>timestamp wraparound making sure that the returned value is properly increased.
 * <li>timestamp unwraparound making sure that the returned value is properly decreased.
 * </ul>
 * @param exttimestamp a previous extended timestamp
 * @param timestamp a new timestamp
 * @return The extended timestamp of {@code timestamp} or 0 if the result can't go anywhere backwards.
 */
public static long rtpBufferExtTimestamp(Out<Long> exttimestamp, int timestamp) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment exttimestampPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_rtp_buffer_ext_timestamp.invokeExact(
                    (Addressable) exttimestampPOINTER.address(),
                    timestamp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                exttimestamp.set(exttimestampPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT;
    }
}

/**
 * Similar to gst_rtp_buffer_get_extension_onebyte_header, but working
 * on the {@link org.gtk.glib.Bytes} you get from gst_rtp_buffer_get_extension_bytes.
 * Parses RFC 5285 style header extensions with a one byte header. It will
 * return the nth extension with the requested id.
 * @param bytes {@link org.gtk.glib.Bytes}
 * @param bitPattern The bit-pattern. Anything but 0xBEDE is rejected.
 * @param id The ID of the header extension to be read (between 1 and 14).
 * @param nth Read the nth extension packet with the requested ID
 * @param data location for data
 * @param size the size of the data in bytes
 * @return TRUE if {@code bytes} had the requested header extension
 */
public static boolean rtpBufferGetExtensionOnebyteHeaderFromBytes(org.gtk.glib.Bytes bytes, short bitPattern, byte id, int nth, Out<byte[]> data, Out<Integer> size) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment dataPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
        MemorySegment sizePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_buffer_get_extension_onebyte_header_from_bytes.invokeExact(
                    bytes.handle(),
                    bitPattern,
                    id,
                    nth,
                    (Addressable) dataPOINTER.address(),
                    (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                size.set(sizePOINTER.get(Interop.valueLayout.C_INT, 0));
        data.set(MemorySegment.ofAddress(dataPOINTER.get(Interop.valueLayout.ADDRESS, 0), size.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Map the contents of {@code buffer} into {@code rtp}.
 * @param buffer a {@link org.gstreamer.gst.Buffer}
 * @param flags {@link org.gstreamer.gst.MapFlags}
 * @param rtp a {@link RTPBuffer}
 * @return {@code true} if {@code buffer} could be mapped.
 */
public static boolean rtpBufferMap(org.gstreamer.gst.Buffer buffer, org.gstreamer.gst.MapFlags flags, org.gstreamer.rtp.RTPBuffer rtp) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtp_buffer_map.invokeExact(
                buffer.handle(),
                flags.getValue(),
                rtp.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Allocate a new {@link org.gstreamer.gst.Buffer} with enough data to hold an RTP packet with
 * {@code csrc_count} CSRCs, a payload length of {@code payload_len} and padding of {@code pad_len}.
 * All other RTP header fields will be set to 0/FALSE.
 * @param payloadLen the length of the payload
 * @param padLen the amount of padding
 * @param csrcCount the number of CSRC entries
 * @return A newly allocated buffer that can hold an RTP packet with given
 * parameters.
 */
public static org.gstreamer.gst.Buffer rtpBufferNewAllocate(int payloadLen, byte padLen, byte csrcCount) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtp_buffer_new_allocate.invokeExact(
                payloadLen,
                padLen,
                csrcCount);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Create a new {@link org.gstreamer.gst.Buffer} that can hold an RTP packet that is exactly
 * {@code packet_len} long. The length of the payload depends on {@code pad_len} and
 * {@code csrc_count} and can be calculated with gst_rtp_buffer_calc_payload_len().
 * All RTP header fields will be set to 0/FALSE.
 * @param packetLen the total length of the packet
 * @param padLen the amount of padding
 * @param csrcCount the number of CSRC entries
 * @return A newly allocated buffer that can hold an RTP packet of {@code packet_len}.
 */
public static org.gstreamer.gst.Buffer rtpBufferNewAllocateLen(int packetLen, byte padLen, byte csrcCount) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtp_buffer_new_allocate_len.invokeExact(
                packetLen,
                padLen,
                csrcCount);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Create a new buffer and set the data to a copy of {@code len}
 * bytes of {@code data} and the size to {@code len}. The data will be freed when the buffer
 * is freed.
 * @param data data for the new
 *   buffer
 * @param len the length of data
 * @return A newly allocated buffer with a copy of {@code data} and of size {@code len}.
 */
public static org.gstreamer.gst.Buffer rtpBufferNewCopyData(byte[] data, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_buffer_new_copy_data.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Create a new buffer and set the data and size of the buffer to {@code data} and {@code len}
 * respectively. {@code data} will be freed when the buffer is unreffed, so this
 * function transfers ownership of {@code data} to the new buffer.
 * @param data data for the new buffer
 * @param len the length of data
 * @return A newly allocated buffer with {@code data} and of size {@code len}.
 */
public static org.gstreamer.gst.Buffer rtpBufferNewTakeData(byte[] data, long len) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_buffer_new_take_data.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
}

/**
 * Retrieve all the factories of the currently registered RTP header
 * extensions.  Call gst_element_factory_create() with each factory to create
 * the associated {@link RTPHeaderExtension}.
 * @return a {@link org.gtk.glib.List} of
 *     {@link org.gstreamer.gst.ElementFactory}'s. Use gst_plugin_feature_list_free() after use
 */
public static org.gtk.glib.List rtpGetHeaderExtensionList() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtp_get_header_extension_list.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Reads the NTP time from the {@code size} NTP-56 extension bytes in {@code data} and store the
 * result in {@code ntptime}.
 * @param data the data to read from
 * @param size the size of {@code data}
 * @param ntptime the result NTP time
 * @return {@code true} on success.
 */
public static boolean rtpHdrextGetNtp56(byte[] data, int size, Out<Long> ntptime) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment ntptimePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_hdrext_get_ntp_56.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    size,
                    (Addressable) ntptimePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                ntptime.set(ntptimePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Reads the NTP time from the {@code size} NTP-64 extension bytes in {@code data} and store the
 * result in {@code ntptime}.
 * @param data the data to read from
 * @param size the size of {@code data}
 * @param ntptime the result NTP time
 * @return {@code true} on success.
 */
public static boolean rtpHdrextGetNtp64(byte[] data, int size, Out<Long> ntptime) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemorySegment ntptimePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_hdrext_get_ntp_64.invokeExact(
                    Interop.allocateNativeArray(data, false, SCOPE),
                    size,
                    (Addressable) ntptimePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
                ntptime.set(ntptimePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
}

/**
 * Writes the NTP time in {@code ntptime} to the format required for the NTP-56 header
 * extension. {@code data} must hold at least {@code GST_RTP_HDREXT_NTP_56_SIZE} bytes.
 * @param size the size of {@code data}
 * @param ntptime the NTP time
 * @return {@code true} on success.
 */
public static boolean rtpHdrextSetNtp56(int size, long ntptime) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtp_hdrext_set_ntp_56.invokeExact(
                (Addressable) MemoryAddress.NULL,
                size,
                ntptime);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Writes the NTP time in {@code ntptime} to the format required for the NTP-64 header
 * extension. {@code data} must hold at least {@code GST_RTP_HDREXT_NTP_64_SIZE} bytes.
 * @param size the size of {@code data}
 * @param ntptime the NTP time
 * @return {@code true} on success.
 */
public static boolean rtpHdrextSetNtp64(int size, long ntptime) {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.gst_rtp_hdrext_set_ntp_64.invokeExact(
                (Addressable) MemoryAddress.NULL,
                size,
                ntptime);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}

/**
 * Get the {@link RTPPayloadInfo} for {@code media} and {@code encoding_name}. This function is
 * mostly used to get the default clock-rate and bandwidth for dynamic payload
 * types specified with {@code media} and {@code encoding} name.
 * <p>
 * The search for {@code encoding_name} will be performed in a case insensitive way.
 * @param media the media to find
 * @param encodingName the encoding name to find
 * @return a {@link RTPPayloadInfo} or NULL when no info could be found.
 */
public static org.gstreamer.rtp.RTPPayloadInfo rtpPayloadInfoForName(java.lang.String media, java.lang.String encodingName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_payload_info_for_name.invokeExact(
                    Marshal.stringToAddress.marshal(media, SCOPE),
                    Marshal.stringToAddress.marshal(encodingName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtp.RTPPayloadInfo.fromAddress.marshal(RESULT, null);
    }
}

/**
 * Get the {@link RTPPayloadInfo} for {@code payload_type}. This function is
 * mostly used to get the default clock-rate and bandwidth for static payload
 * types specified with {@code payload_type}.
 * @param payloadType the payload_type to find
 * @return a {@link RTPPayloadInfo} or NULL when no info could be found.
 */
public static org.gstreamer.rtp.RTPPayloadInfo rtpPayloadInfoForPt(byte payloadType) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtp_payload_info_for_pt.invokeExact(payloadType);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.rtp.RTPPayloadInfo.fromAddress.marshal(RESULT, null);
}

public static org.gtk.glib.Type rtpSourceMetaApiGetType() {
    long RESULT;
    try {
        RESULT = (long) DowncallHandles.gst_rtp_source_meta_api_get_type.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Type(RESULT);
}

public static org.gstreamer.gst.MetaInfo rtpSourceMetaGetInfo() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.gst_rtp_source_meta_get_info.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
}
    
    private static class DowncallHandles {

private static final MethodHandle gst_buffer_add_rtp_source_meta = Interop.downcallHandle(
        "gst_buffer_add_rtp_source_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_buffer_get_rtp_source_meta = Interop.downcallHandle(
        "gst_buffer_get_rtp_source_meta",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_rtcp_buffer_map = Interop.downcallHandle(
        "gst_rtcp_buffer_map",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_rtcp_buffer_new = Interop.downcallHandle(
        "gst_rtcp_buffer_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_rtcp_buffer_new_copy_data = Interop.downcallHandle(
        "gst_rtcp_buffer_new_copy_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_rtcp_buffer_new_take_data = Interop.downcallHandle(
        "gst_rtcp_buffer_new_take_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_rtcp_buffer_validate = Interop.downcallHandle(
        "gst_rtcp_buffer_validate",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_rtcp_buffer_validate_data = Interop.downcallHandle(
        "gst_rtcp_buffer_validate_data",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_rtcp_buffer_validate_data_reduced = Interop.downcallHandle(
        "gst_rtcp_buffer_validate_data_reduced",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_rtcp_buffer_validate_reduced = Interop.downcallHandle(
        "gst_rtcp_buffer_validate_reduced",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_rtcp_ntp_to_unix = Interop.downcallHandle(
        "gst_rtcp_ntp_to_unix",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_rtcp_sdes_name_to_type = Interop.downcallHandle(
        "gst_rtcp_sdes_name_to_type",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_rtcp_sdes_type_to_name = Interop.downcallHandle(
        "gst_rtcp_sdes_type_to_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_rtcp_unix_to_ntp = Interop.downcallHandle(
        "gst_rtcp_unix_to_ntp",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_rtp_buffer_allocate_data = Interop.downcallHandle(
        "gst_rtp_buffer_allocate_data",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle gst_rtp_buffer_calc_header_len = Interop.downcallHandle(
        "gst_rtp_buffer_calc_header_len",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle gst_rtp_buffer_calc_packet_len = Interop.downcallHandle(
        "gst_rtp_buffer_calc_packet_len",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle gst_rtp_buffer_calc_payload_len = Interop.downcallHandle(
        "gst_rtp_buffer_calc_payload_len",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle gst_rtp_buffer_compare_seqnum = Interop.downcallHandle(
        "gst_rtp_buffer_compare_seqnum",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_SHORT),
        false
);

private static final MethodHandle gst_rtp_buffer_default_clock_rate = Interop.downcallHandle(
        "gst_rtp_buffer_default_clock_rate",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle gst_rtp_buffer_ext_timestamp = Interop.downcallHandle(
        "gst_rtp_buffer_ext_timestamp",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle gst_rtp_buffer_get_extension_onebyte_header_from_bytes = Interop.downcallHandle(
        "gst_rtp_buffer_get_extension_onebyte_header_from_bytes",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_rtp_buffer_map = Interop.downcallHandle(
        "gst_rtp_buffer_map",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_rtp_buffer_new_allocate = Interop.downcallHandle(
        "gst_rtp_buffer_new_allocate",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle gst_rtp_buffer_new_allocate_len = Interop.downcallHandle(
        "gst_rtp_buffer_new_allocate_len",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle gst_rtp_buffer_new_copy_data = Interop.downcallHandle(
        "gst_rtp_buffer_new_copy_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_rtp_buffer_new_take_data = Interop.downcallHandle(
        "gst_rtp_buffer_new_take_data",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_rtp_get_header_extension_list = Interop.downcallHandle(
        "gst_rtp_get_header_extension_list",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_rtp_hdrext_get_ntp_56 = Interop.downcallHandle(
        "gst_rtp_hdrext_get_ntp_56",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_rtp_hdrext_get_ntp_64 = Interop.downcallHandle(
        "gst_rtp_hdrext_get_ntp_64",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_rtp_hdrext_set_ntp_56 = Interop.downcallHandle(
        "gst_rtp_hdrext_set_ntp_56",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_rtp_hdrext_set_ntp_64 = Interop.downcallHandle(
        "gst_rtp_hdrext_set_ntp_64",
        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_rtp_payload_info_for_name = Interop.downcallHandle(
        "gst_rtp_payload_info_for_name",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle gst_rtp_payload_info_for_pt = Interop.downcallHandle(
        "gst_rtp_payload_info_for_pt",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
        false
);

private static final MethodHandle gst_rtp_source_meta_api_get_type = Interop.downcallHandle(
        "gst_rtp_source_meta_api_get_type",
        FunctionDescriptor.of(Interop.valueLayout.C_LONG),
        false
);

private static final MethodHandle gst_rtp_source_meta_get_info = Interop.downcallHandle(
        "gst_rtp_source_meta_get_info",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);
    }
    
    private static void registerTypes() {
        if (RTPBaseAudioPayload.isAvailable()) Interop.register(RTPBaseAudioPayload.getType(), RTPBaseAudioPayload.fromAddress);
        if (RTPBaseDepayload.isAvailable()) Interop.register(RTPBaseDepayload.getType(), RTPBaseDepayload.fromAddress);
        if (RTPBasePayload.isAvailable()) Interop.register(RTPBasePayload.getType(), RTPBasePayload.fromAddress);
        if (RTPHeaderExtension.isAvailable()) Interop.register(RTPHeaderExtension.getType(), RTPHeaderExtension.fromAddress);
    }
}
