package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Types of {@link Section} that the library handles. This covers all the
 * MPEG-TS and derivate specification that the library can properly identify and
 * use.
 */
public enum SectionType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Unknown section type
     */
    UNKNOWN(0),
    
    /**
     * Program Association Table (ISO/IEC 13818-1)
     */
    PAT(1),
    
    /**
     * Program Map Table (ISO/IEC 13818-1)
     */
    PMT(2),
    
    /**
     * Conditional Access Table (ISO/IEC 13818-1)
     */
    CAT(3),
    
    /**
     * Transport Stream Description Table (ISO/IEC 13818-1)
     */
    TSDT(4),
    
    /**
     * Event Information Table (EN 300 468)
     */
    EIT(5),
    
    /**
     * Network Information Table (ISO/IEC 13818-1 / EN 300 468)
     */
    NIT(6),
    
    /**
     * Bouquet Association Table ((EN 300 468)
     */
    BAT(7),
    
    /**
     * Service Description Table (EN 300 468)
     */
    SDT(8),
    
    /**
     * Time and Date Table (EN 300 468)
     */
    TDT(9),
    
    /**
     * Time Offset Table (EN 300 468)
     */
    TOT(10),
    
    /**
     * Selection Information Table (EN 300 468)
     */
    SIT(11),
    
    /**
     * ATSC Terrestrial Virtual Channel Table (A65)
     */
    ATSC_TVCT(12),
    
    /**
     * ATSC Cable Virtual Channel Table (A65)
     */
    ATSC_CVCT(13),
    
    /**
     * ATSC Master Guide Table (A65)
     */
    ATSC_MGT(14),
    
    /**
     * ATSC Extended Text Table (A65)
     */
    ATSC_ETT(15),
    
    /**
     * ATSC Event Information Table (A65)
     */
    ATSC_EIT(16),
    
    /**
     * ATSC System Time Table (A65)
     */
    ATSC_STT(17),
    
    /**
     * ATSC Rating Region Table (A65)
     */
    ATSC_RRT(18),
    
    /**
     * SCTE Splice Information Table (SCTE-35)
     */
    SCTE_SIT(19);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSectionType";
    
    private final int value;
    
    /**
     * Create a new SectionType for the provided value
     * @param numeric value the enum value
     */
    SectionType(int value) {
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
     * Create a new SectionType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static SectionType of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> PAT;
            case 2 -> PMT;
            case 3 -> CAT;
            case 4 -> TSDT;
            case 5 -> EIT;
            case 6 -> NIT;
            case 7 -> BAT;
            case 8 -> SDT;
            case 9 -> TDT;
            case 10 -> TOT;
            case 11 -> SIT;
            case 12 -> ATSC_TVCT;
            case 13 -> ATSC_CVCT;
            case 14 -> ATSC_MGT;
            case 15 -> ATSC_ETT;
            case 16 -> ATSC_EIT;
            case 17 -> ATSC_STT;
            case 18 -> ATSC_RRT;
            case 19 -> SCTE_SIT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
