package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of mpeg-ts streams for ATSC, as defined by the ATSC Code Points
 * Registry. For convenience, some stream types from {@code GstMpegtsScteStreamType}
 * are also included.
 * @version 1.20
 */
public enum ATSCStreamType implements io.github.jwharm.javagi.Enumeration {
    /**
     * DigiCipher II video | Identical to ITU-T Rec. H.262 | ISO/IEC 13818-2 Video
     */
    DCII_VIDEO(128),
    /**
     * ATSC A/53 Audio | AC-3
     */
    AUDIO_AC3(129),
    /**
     * SCTE-27 Subtitling
     */
    SUBTITLING(130),
    /**
     * SCTE-19 Isochronous data | Reserved
     */
    ISOCH_DATA(131),
    /**
     * SCTE-35 Splice Information Table
     */
    SIT(134),
    /**
     * E-AC-3 A/52:2018
     */
    AUDIO_EAC3(135),
    /**
     * E-AC-3 A/107 (ATSC 2.0)
     */
    AUDIO_DTS_HD(136);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsATSCStreamType";
    
    private final int value;
    ATSCStreamType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ATSCStreamType of(int value) {
        return switch (value) {
            case 128 -> DCII_VIDEO;
            case 129 -> AUDIO_AC3;
            case 130 -> SUBTITLING;
            case 131 -> ISOCH_DATA;
            case 134 -> SIT;
            case 135 -> AUDIO_EAC3;
            case 136 -> AUDIO_DTS_HD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
