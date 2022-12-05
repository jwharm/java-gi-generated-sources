package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Well-known registration ids, expressed as native-endian 32bit integers. These
 * are used in descriptors of type {@link DescriptorType#REGISTRATION}. Unless specified
 * otherwise (by use of the "OTHER" prefix), they are all registered by the
 * <a href="https://smpte-ra.org/">SMPTE Registration Authority</a> or specified in
 * "official" documentation for the given format.
 * @version 1.20
 */
public class RegistrationId extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsRegistrationId";
    
    /**
     * Undefined registration id
     */
    public static final RegistrationId _0 = new RegistrationId(0);
    
    /**
     * Audio AC-3, ATSC A/52
     */
    public static final RegistrationId AC_3 = new RegistrationId(1094921523);
    
    /**
     * SCTE 35, "Digital Program Insertion Cueing Message"
     */
    public static final RegistrationId CUEI = new RegistrationId(1129661769);
    
    /**
     * Dirac Video codec
     */
    public static final RegistrationId DRAC = new RegistrationId(1685217635);
    
    /**
     * DTS Audio
     */
    public static final RegistrationId DTS1 = new RegistrationId(1146377009);
    
    /**
     * DTS Audio
     */
    public static final RegistrationId DTS2 = new RegistrationId(1146377010);
    
    /**
     * DTS Audio
     */
    public static final RegistrationId DTS3 = new RegistrationId(1146377011);
    
    /**
     * SMPTE 302M, Mapping of AES3 Data in mpeg-ts
     */
    public static final RegistrationId BSSD = new RegistrationId(1112757060);
    
    /**
     * Enhanced AC-3 (i.e. EAC3)
     */
    public static final RegistrationId EAC3 = new RegistrationId(1161904947);
    
    /**
     * Cablelabs ETV
     */
    public static final RegistrationId ETV1 = new RegistrationId(1163154993);
    
    /**
     * ATSC A/53 compliant stream (i.e. ATSC)
     */
    public static final RegistrationId GA94 = new RegistrationId(1195456820);
    
    /**
     * Blu-ray, "System Description Blu-ray Disc
     *             Read-Only Format part 3 Audio Visual Basic Specifications"
     */
    public static final RegistrationId HDMV = new RegistrationId(1212435798);
    
    /**
     * SMPTE RP217 : Non-synchronized Mapping of KLV
     *             Packets in mpeg-ts
     */
    public static final RegistrationId KLVA = new RegistrationId(1263294017);
    
    /**
     * Opus Audio
     */
    public static final RegistrationId OPUS = new RegistrationId(1330664787);
    
    /**
     * HDV (Sony)
     */
    public static final RegistrationId TSHV = new RegistrationId(1414744150);
    
    /**
     * Video VC-1, SMPTE RP227 "VC-1 Bitstream Transport Encodings"
     */
    public static final RegistrationId VC_1 = new RegistrationId(1447243057);
    
    /**
     * Audio AC-4, ETSI 103 190-2
     */
    public static final RegistrationId AC_4 = new RegistrationId(1094921524);
    
    /**
     * HEVC / h265
     */
    public static final RegistrationId OTHER_HEVC = new RegistrationId(1212503619);
    
    public RegistrationId(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public RegistrationId or(RegistrationId mask) {
        return new RegistrationId(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static RegistrationId combined(RegistrationId mask, RegistrationId... masks) {
        int value = mask.getValue();        for (RegistrationId arg : masks) {
            value |= arg.getValue();
        }
        return new RegistrationId(value);
    }
}
