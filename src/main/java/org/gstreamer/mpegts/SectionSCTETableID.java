package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Values for a {@link Section} table_id.
 * <p>
 * These are the registered SCTE table_id variants.
 * <p>
 * see also: {@link SectionTableID}
 */
public enum SectionSCTETableID implements io.github.jwharm.javagi.Enumeration {
    /**
     * SCTE-18 Emergency Alert System
     */
    EAS(216),
    /**
     * CL-SP-ETV-AM 1.0.1 EBIF message
     */
    EBIF(224),
    RESERVED(225),
    /**
     * CL-SP-ETV-AM 1.0.1 EBIF Int. Signaling Sect.
     */
    EISS(226),
    /**
     * CL-SP-ETV-AM 1.0.1 DSMCC DII message
     */
    DII(227),
    /**
     * CL-SP-ETV-AM 1.0.1 DSMCC Data Download Block
     */
    DDB(228),
    /**
     * SCTE-35 splice information is carried in a
     * section stream on a separate PID in the program’s Map Table (PMT) allowing
     * Splice Event notifications to remain associated with the program and pass
     * through multiplexers.
     */
    SPLICE(252);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSectionSCTETableID";
    
    private final int value;
    SectionSCTETableID(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SectionSCTETableID of(int value) {
        return switch (value) {
            case 216 -> EAS;
            case 224 -> EBIF;
            case 225 -> RESERVED;
            case 226 -> EISS;
            case 227 -> DII;
            case 228 -> DDB;
            case 252 -> SPLICE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
