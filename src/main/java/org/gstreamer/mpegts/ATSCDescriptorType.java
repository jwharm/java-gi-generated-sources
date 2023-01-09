package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These values correspond to the registered descriptor type from
 * the various ATSC specifications.
 * <p>
 * Consult the relevant specifications for more details.
 */
public enum ATSCDescriptorType implements io.github.jwharm.javagi.Enumeration {
    
    STUFFING(128),
    
    AC3(129),
    
    CAPTION_SERVICE(134),
    
    CONTENT_ADVISORY(135),
    
    EXTENDED_CHANNEL_NAME(160),
    
    SERVICE_LOCATION(161),
    
    TIME_SHIFTED_SERVICE(162),
    
    COMPONENT_NAME(163),
    
    DCC_DEPARTING_REQUEST(168),
    
    DCC_ARRIVING_REQUEST(169),
    
    REDISTRIBUTION_CONTROL(170),
    
    GENRE(171),
    
    PRIVATE_INFORMATION(173),
    
    EAC3(204),
    
    ENHANCED_SIGNALING(178),
    
    DATA_SERVICE(164),
    
    PID_COUNT(165),
    
    DOWNLOAD_DESCRIPTOR(166),
    
    MULTIPROTOCOL_ENCAPSULATION(167),
    
    MODULE_LINK(180),
    
    CRC32(181),
    
    GROUP_LINK(184);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsATSCDescriptorType";
    
    private final int value;
    
    /**
     * Create a new ATSCDescriptorType for the provided value
     * @param numeric value the enum value
     */
    ATSCDescriptorType(int value) {
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
     * Create a new ATSCDescriptorType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ATSCDescriptorType of(int value) {
        return switch (value) {
            case 128 -> STUFFING;
            case 129 -> AC3;
            case 134 -> CAPTION_SERVICE;
            case 135 -> CONTENT_ADVISORY;
            case 160 -> EXTENDED_CHANNEL_NAME;
            case 161 -> SERVICE_LOCATION;
            case 162 -> TIME_SHIFTED_SERVICE;
            case 163 -> COMPONENT_NAME;
            case 168 -> DCC_DEPARTING_REQUEST;
            case 169 -> DCC_ARRIVING_REQUEST;
            case 170 -> REDISTRIBUTION_CONTROL;
            case 171 -> GENRE;
            case 173 -> PRIVATE_INFORMATION;
            case 204 -> EAC3;
            case 178 -> ENHANCED_SIGNALING;
            case 164 -> DATA_SERVICE;
            case 165 -> PID_COUNT;
            case 166 -> DOWNLOAD_DESCRIPTOR;
            case 167 -> MULTIPROTOCOL_ENCAPSULATION;
            case 180 -> MODULE_LINK;
            case 181 -> CRC32;
            case 184 -> GROUP_LINK;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
