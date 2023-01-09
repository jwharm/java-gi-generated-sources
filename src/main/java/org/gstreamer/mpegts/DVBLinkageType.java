package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Linkage Type (EN 300 468 v.1.13.1)
 */
public enum DVBLinkageType implements io.github.jwharm.javagi.Enumeration {
    
    RESERVED_00(0),
    
    INFORMATION(1),
    
    EPG(2),
    
    CA_REPLACEMENT(3),
    
    TS_CONTAINING_COMPLETE_SI(4),
    
    SERVICE_REPLACEMENT(5),
    
    DATA_BROADCAST(6),
    
    RCS_MAP(7),
    
    MOBILE_HAND_OVER(8),
    
    SYSTEM_SOFTWARE_UPDATE(9),
    
    TS_CONTAINING_SSU(10),
    
    IP_MAC_NOTIFICATION(11),
    
    TS_CONTAINING_INT(12),
    
    EVENT(13),
    
    EXTENDED_EVENT(14);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBLinkageType";
    
    private final int value;
    
    /**
     * Create a new DVBLinkageType for the provided value
     * @param numeric value the enum value
     */
    DVBLinkageType(int value) {
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
     * Create a new DVBLinkageType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static DVBLinkageType of(int value) {
        return switch (value) {
            case 0 -> RESERVED_00;
            case 1 -> INFORMATION;
            case 2 -> EPG;
            case 3 -> CA_REPLACEMENT;
            case 4 -> TS_CONTAINING_COMPLETE_SI;
            case 5 -> SERVICE_REPLACEMENT;
            case 6 -> DATA_BROADCAST;
            case 7 -> RCS_MAP;
            case 8 -> MOBILE_HAND_OVER;
            case 9 -> SYSTEM_SOFTWARE_UPDATE;
            case 10 -> TS_CONTAINING_SSU;
            case 11 -> IP_MAC_NOTIFICATION;
            case 12 -> TS_CONTAINING_INT;
            case 13 -> EVENT;
            case 14 -> EXTENDED_EVENT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
