package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enumeration of the different standards that may apply to AFD data:
 * <p>
 * 0) ETSI/DVB:
 * https://www.etsi.org/deliver/etsi_ts/101100_101199/101154/02.01.01_60/ts_101154v020101p.pdf
 * <p>
 * 1) ATSC A/53:
 * https://www.atsc.org/wp-content/uploads/2015/03/a_53-Part-4-2009.pdf
 * <p>
 * 2) SMPTE ST2016-1:
 * @version 1.18
 */
public enum VideoAFDSpec implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * AFD value is from DVB/ETSI standard
     */
    DVB_ETSI(0),
    
    /**
     * AFD value is from ATSC A/53 standard
     */
    ATSC_A53(1),
    
    SMPTE_ST2016_1(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAFDSpec";
    
    private final int value;
    
    /**
     * Create a new VideoAFDSpec for the provided value
     * @param numeric value the enum value
     */
    VideoAFDSpec(int value) {
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
     * Create a new VideoAFDSpec for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoAFDSpec of(int value) {
        return switch (value) {
            case 0 -> DVB_ETSI;
            case 1 -> ATSC_A53;
            case 2 -> SMPTE_ST2016_1;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
