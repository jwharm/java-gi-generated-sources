package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of {@link Descriptor}
 * <p>
 * These values correspond to the registered extended descriptor
 * type from the various DVB specifications.
 * <p>
 * Consult the relevant specifications for more details.
 */
public enum DVBExtendedDescriptorType implements io.github.jwharm.javagi.Enumeration {
    IMAGE_ICON(0),
    CPCM_DELIVERY_SIGNALLING(1),
    CP(2),
    CP_IDENTIFIER(3),
    T2_DELIVERY_SYSTEM(4),
    SH_DELIVERY_SYSTEM(5),
    SUPPLEMENTARY_AUDIO(6),
    NETWORK_CHANGE_NOTIFY(7),
    MESSAGE(8),
    TARGET_REGION(9),
    TARGET_REGION_NAME(10),
    SERVICE_RELOCATED(11),
    XAIT_PID(12),
    C2_DELIVERY_SYSTEM(13),
    DTS_HD_AUDIO_STREAM(14),
    DTS_NEUTRAL(15),
    VIDEO_DEPTH_RANGE(16),
    T2MI(17),
    URI_LINKAGE(19),
    AC4(21),
    /**
     * Provide all avaliable audio programme for user selection
     */
    AUDIO_PRESELECTION(25);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBExtendedDescriptorType";
    
    private final int value;
    DVBExtendedDescriptorType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DVBExtendedDescriptorType of(int value) {
        return switch (value) {
            case 0 -> IMAGE_ICON;
            case 1 -> CPCM_DELIVERY_SIGNALLING;
            case 2 -> CP;
            case 3 -> CP_IDENTIFIER;
            case 4 -> T2_DELIVERY_SYSTEM;
            case 5 -> SH_DELIVERY_SYSTEM;
            case 6 -> SUPPLEMENTARY_AUDIO;
            case 7 -> NETWORK_CHANGE_NOTIFY;
            case 8 -> MESSAGE;
            case 9 -> TARGET_REGION;
            case 10 -> TARGET_REGION_NAME;
            case 11 -> SERVICE_RELOCATED;
            case 12 -> XAIT_PID;
            case 13 -> C2_DELIVERY_SYSTEM;
            case 14 -> DTS_HD_AUDIO_STREAM;
            case 15 -> DTS_NEUTRAL;
            case 16 -> VIDEO_DEPTH_RANGE;
            case 17 -> T2MI;
            case 19 -> URI_LINKAGE;
            case 21 -> AC4;
            case 25 -> AUDIO_PRESELECTION;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
