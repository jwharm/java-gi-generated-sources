package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum ModulationType implements io.github.jwharm.javagi.Enumeration {
    
    QPSK(0),
    
    QAM_16(1),
    
    QAM_32(2),
    
    QAM_64(3),
    
    QAM_128(4),
    
    QAM_256(5),
    
    QAM_AUTO(6),
    
    VSB_8(7),
    
    VSB_16(8),
    
    PSK_8(9),
    
    APSK_16(10),
    
    APSK_32(11),
    
    DQPSK(12),
    
    QAM_4_NR_(13),
    
    NONE(14);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsModulationType";
    
    private final int value;
    
    /**
     * Create a new ModulationType for the provided value
     * @param numeric value the enum value
     */
    ModulationType(int value) {
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
     * Create a new ModulationType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ModulationType of(int value) {
        return switch (value) {
            case 0 -> QPSK;
            case 1 -> QAM_16;
            case 2 -> QAM_32;
            case 3 -> QAM_64;
            case 4 -> QAM_128;
            case 5 -> QAM_256;
            case 6 -> QAM_AUTO;
            case 7 -> VSB_8;
            case 8 -> VSB_16;
            case 9 -> PSK_8;
            case 10 -> APSK_16;
            case 11 -> APSK_32;
            case 12 -> DQPSK;
            case 13 -> QAM_4_NR_;
            case 14 -> NONE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
