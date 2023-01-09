package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Some know types of Ancillary Data identifiers.
 * @version 1.16
 */
public enum VideoAncillaryDID16 implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * CEA 708 Ancillary data according to SMPTE 334
     */
    S334_EIA_708(24833),
    
    /**
     * CEA 608 Ancillary data according to SMPTE 334
     */
    S334_EIA_608(24834),
    
    /**
     * AFD/Bar Ancillary data according to SMPTE 2016-3 (Since: 1.18)
     */
    S2016_3_AFD_BAR(16645);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAncillaryDID16";
    
    private final int value;
    
    /**
     * Create a new VideoAncillaryDID16 for the provided value
     * @param numeric value the enum value
     */
    VideoAncillaryDID16(int value) {
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
     * Create a new VideoAncillaryDID16 for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoAncillaryDID16 of(int value) {
        return switch (value) {
            case 24833 -> S334_EIA_708;
            case 24834 -> S334_EIA_608;
            case 16645 -> S2016_3_AFD_BAR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
