package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of mpeg-ts streams for Blu-ray formats. To be matched with the
 * stream-type of a {@link Section}.
 * @version 1.20
 */
public enum HdmvStreamType implements io.github.jwharm.javagi.Enumeration {
    
    AUDIO_LPCM(128),
    
    AUDIO_AC3(129),
    
    AUDIO_DTS(130),
    
    AUDIO_AC3_TRUE_HD(131),
    
    AUDIO_AC3_PLUS(132),
    
    AUDIO_DTS_HD(133),
    
    AUDIO_DTS_HD_MASTER_AUDIO(134),
    
    AUDIO_EAC3(135),
    
    SUBPICTURE_PGS(144),
    
    IGS(145),
    
    SUBTITLE(146),
    
    AUDIO_AC3_PLUS_SECONDARY(161),
    
    AUDIO_DTS_HD_SECONDARY(162);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsHdmvStreamType";
    
    private final int value;
    
    /**
     * Create a new HdmvStreamType for the provided value
     * @param numeric value the enum value
     */
    HdmvStreamType(int value) {
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
     * Create a new HdmvStreamType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static HdmvStreamType of(int value) {
        return switch (value) {
            case 128 -> AUDIO_LPCM;
            case 129 -> AUDIO_AC3;
            case 130 -> AUDIO_DTS;
            case 131 -> AUDIO_AC3_TRUE_HD;
            case 132 -> AUDIO_AC3_PLUS;
            case 133 -> AUDIO_DTS_HD;
            case 134 -> AUDIO_DTS_HD_MASTER_AUDIO;
            case 135 -> AUDIO_EAC3;
            case 144 -> SUBPICTURE_PGS;
            case 145 -> IGS;
            case 146 -> SUBTITLE;
            case 161 -> AUDIO_AC3_PLUS_SECONDARY;
            case 162 -> AUDIO_DTS_HD_SECONDARY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
