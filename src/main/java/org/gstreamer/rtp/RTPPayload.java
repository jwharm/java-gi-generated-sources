package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Standard predefined fixed payload types.
 * <p>
 * The official list is at:
 * http://www.iana.org/assignments/rtp-parameters
 * <p>
 * Audio:
 * reserved: 19
 * unassigned: 20-23,
 * <p>
 * Video:
 * unassigned: 24, 27, 29, 30, 35-71, 77-95
 * Reserved for RTCP conflict avoidance: 72-76
 */
public enum RTPPayload implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * ITU-T G.711. mu-law audio (RFC 3551)
     */
    PCMU(0),
    
    /**
     * RFC 3551 says reserved
     */
    _1016(1),
    
    /**
     * RFC 3551 says reserved
     */
    G721(2),
    
    /**
     * GSM audio
     */
    GSM(3),
    
    /**
     * ITU G.723.1 audio
     */
    G723(4),
    
    /**
     * IMA ADPCM wave type (RFC 3551)
     */
    DVI4_8000(5),
    
    /**
     * IMA ADPCM wave type (RFC 3551)
     */
    DVI4_16000(6),
    
    /**
     * experimental linear predictive encoding
     */
    LPC(7),
    
    /**
     * ITU-T G.711 A-law audio (RFC 3551)
     */
    PCMA(8),
    
    /**
     * ITU-T G.722 (RFC 3551)
     */
    G722(9),
    
    /**
     * stereo PCM
     */
    L16_STEREO(10),
    
    /**
     * mono PCM
     */
    L16_MONO(11),
    
    /**
     * EIA &amp; TIA standard IS-733
     */
    QCELP(12),
    
    /**
     * Comfort Noise (RFC 3389)
     */
    CN(13),
    
    /**
     * Audio MPEG 1-3.
     */
    MPA(14),
    
    /**
     * ITU-T G.728 Speech coder (RFC 3551)
     */
    G728(15),
    
    /**
     * IMA ADPCM wave type (RFC 3551)
     */
    DVI4_11025(16),
    
    /**
     * IMA ADPCM wave type (RFC 3551)
     */
    DVI4_22050(17),
    
    /**
     * ITU-T G.729 Speech coder (RFC 3551)
     */
    G729(18),
    
    /**
     * See RFC 2029
     */
    CELLB(25),
    
    /**
     * ISO Standards 10918-1 and 10918-2 (RFC 2435)
     */
    JPEG(26),
    
    /**
     * nv encoding by Ron Frederick
     */
    NV(28),
    
    /**
     * ITU-T Recommendation H.261 (RFC 2032)
     */
    H261(31),
    
    /**
     * Video MPEG 1 &amp; 2 (RFC 2250)
     */
    MPV(32),
    
    /**
     * MPEG-2 transport stream (RFC 2250)
     */
    MP2T(33),
    
    /**
     * Video H263 (RFC 2190)
     */
    H263(34);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPPayload";
    
    private final int value;
    
    /**
     * Create a new RTPPayload for the provided value
     * @param numeric value the enum value
     */
    RTPPayload(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new RTPPayload for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RTPPayload of(int value) {
        return switch (value) {
            case 0 -> PCMU;
            case 1 -> _1016;
            case 2 -> G721;
            case 3 -> GSM;
            case 4 -> G723;
            case 5 -> DVI4_8000;
            case 6 -> DVI4_16000;
            case 7 -> LPC;
            case 8 -> PCMA;
            case 9 -> G722;
            case 10 -> L16_STEREO;
            case 11 -> L16_MONO;
            case 12 -> QCELP;
            case 13 -> CN;
            case 14 -> MPA;
            case 15 -> G728;
            case 16 -> DVI4_11025;
            case 17 -> DVI4_22050;
            case 18 -> G729;
            case 25 -> CELLB;
            case 26 -> JPEG;
            case 28 -> NV;
            case 31 -> H261;
            case 32 -> MPV;
            case 33 -> MP2T;
            case 34 -> H263;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
