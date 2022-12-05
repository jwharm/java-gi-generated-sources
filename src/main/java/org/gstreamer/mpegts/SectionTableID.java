package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Values for a {@link Section} table_id
 * <p>
 * These are the registered ITU H.222.0 | ISO/IEC 13818-1 table_id variants.
 * <p>
 * see also {@link SectionATSCTableID}, {@link SectionDVBTableID}, and
 * {@link SectionSCTETableID}
 */
public enum SectionTableID implements io.github.jwharm.javagi.Enumeration {
    /**
     * Program Association Table (PAT)
     */
    PROGRAM_ASSOCIATION(0),
    /**
     * Conditional Access Table (CAT)
     */
    CONDITIONAL_ACCESS(1),
    /**
     * Program Map Table (PMT)
     */
    TS_PROGRAM_MAP(2),
    /**
     * Transport Stream Description Table
     */
    TS_DESCRIPTION(3),
    /**
     * ISO/IEC 14496 Scene Description Table
     */
    _14496_SCENE_DESCRIPTION(4),
    /**
     * ISO/IEC 14496 Object Descriptor Table
     */
    _14496_OBJET_DESCRIPTOR(5),
    /**
     * Metadata Section
     */
    METADATA(6),
    /**
     * IPMP Control Information
     */
    IPMP_CONTROL_INFORMATION(7),
    /**
     * ISO/IEC 14496 Section.
     */
    _14496_SECTION(8),
    /**
     * ISO/IEC 23001-11 (Green Access Unit) Section.
     */
    _23001_11_SECTION(9),
    /**
     * ISO/ISO 23001-10 (Quality Access Unit) Section.
     */
    _23001_10_SECTION(10),
    /**
     * DSM-CC Multi-Protocol Encapsulated (MPE) Data
     */
    DSM_CC_MULTIPROTO_ENCAPSULATED_DATA(58),
    /**
     * DSM-CC U-N Messages
     */
    DSM_CC_U_N_MESSAGES(59),
    /**
     * DSM-CC Download Data Messages
     */
    DSM_CC_DOWNLOAD_DATA_MESSAGES(60),
    /**
     * DSM-CC Stream Descriptors
     */
    DSM_CC_STREAM_DESCRIPTORS(61),
    /**
     * DSM-CC Private Data
     */
    DSM_CC_PRIVATE_DATA(62),
    /**
     * DSM-CC Addressable Section
     */
    DSM_CC_ADDRESSABLE_SECTIONS(63),
    /**
     * Unset section table_id (value is forbidden to use in actual sections)
     */
    UNSET(255);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSectionTableID";
    
    private final int value;
    SectionTableID(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SectionTableID of(int value) {
        return switch (value) {
            case 0 -> PROGRAM_ASSOCIATION;
            case 1 -> CONDITIONAL_ACCESS;
            case 2 -> TS_PROGRAM_MAP;
            case 3 -> TS_DESCRIPTION;
            case 4 -> _14496_SCENE_DESCRIPTION;
            case 5 -> _14496_OBJET_DESCRIPTOR;
            case 6 -> METADATA;
            case 7 -> IPMP_CONTROL_INFORMATION;
            case 8 -> _14496_SECTION;
            case 9 -> _23001_11_SECTION;
            case 10 -> _23001_10_SECTION;
            case 58 -> DSM_CC_MULTIPROTO_ENCAPSULATED_DATA;
            case 59 -> DSM_CC_U_N_MESSAGES;
            case 60 -> DSM_CC_DOWNLOAD_DATA_MESSAGES;
            case 61 -> DSM_CC_STREAM_DESCRIPTORS;
            case 62 -> DSM_CC_PRIVATE_DATA;
            case 63 -> DSM_CC_ADDRESSABLE_SECTIONS;
            case 255 -> UNSET;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
