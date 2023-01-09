package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The format of the samples in the ringbuffer.
 */
public enum AudioRingBufferFormatType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * samples in linear or float
     */
    RAW(0),
    
    /**
     * samples in mulaw
     */
    MU_LAW(1),
    
    /**
     * samples in alaw
     */
    A_LAW(2),
    
    /**
     * samples in ima adpcm
     */
    IMA_ADPCM(3),
    
    /**
     * samples in mpeg audio (but not AAC) format
     */
    MPEG(4),
    
    /**
     * samples in gsm format
     */
    GSM(5),
    
    /**
     * samples in IEC958 frames (e.g. AC3)
     */
    IEC958(6),
    
    /**
     * samples in AC3 format
     */
    AC3(7),
    
    /**
     * samples in EAC3 format
     */
    EAC3(8),
    
    /**
     * samples in DTS format
     */
    DTS(9),
    
    /**
     * samples in MPEG-2 AAC ADTS format
     */
    MPEG2_AAC(10),
    
    /**
     * samples in MPEG-4 AAC ADTS format
     */
    MPEG4_AAC(11),
    
    /**
     * samples in MPEG-2 AAC raw format (Since: 1.12)
     */
    MPEG2_AAC_RAW(12),
    
    /**
     * samples in MPEG-4 AAC raw format (Since: 1.12)
     */
    MPEG4_AAC_RAW(13),
    
    /**
     * samples in FLAC format (Since: 1.12)
     */
    FLAC(14);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioRingBufferFormatType";
    
    private final int value;
    
    /**
     * Create a new AudioRingBufferFormatType for the provided value
     * @param numeric value the enum value
     */
    AudioRingBufferFormatType(int value) {
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
     * Create a new AudioRingBufferFormatType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AudioRingBufferFormatType of(int value) {
        return switch (value) {
            case 0 -> RAW;
            case 1 -> MU_LAW;
            case 2 -> A_LAW;
            case 3 -> IMA_ADPCM;
            case 4 -> MPEG;
            case 5 -> GSM;
            case 6 -> IEC958;
            case 7 -> AC3;
            case 8 -> EAC3;
            case 9 -> DTS;
            case 10 -> MPEG2_AAC;
            case 11 -> MPEG4_AAC;
            case 12 -> MPEG2_AAC_RAW;
            case 13 -> MPEG4_AAC_RAW;
            case 14 -> FLAC;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
