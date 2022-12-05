package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Values for a {@link Section} table_id.
 * <p>
 * These are the registered ATSC section {@code table_id} variants. Unless specified
 * otherwise, they are defined in the "ATSC A/65" specification.
 * <p>
 * see also: {@link SectionTableID} and other variants.
 */
public enum SectionATSCTableID implements io.github.jwharm.javagi.Enumeration {
    /**
     * Master Guide Table (MGT)
     */
    MASTER_GUIDE(199),
    /**
     * Terrestrial Virtual Channel Table (TVCT)
     */
    TERRESTRIAL_VIRTUAL_CHANNEL(200),
    /**
     * Cable Virtual Channel Table (CVCT)
     */
    CABLE_VIRTUAL_CHANNEL(201),
    /**
     * Rating Region Table (RRT)
     */
    RATING_REGION(202),
    /**
     * Event Information Table (EIT)
     */
    EVENT_INFORMATION(203),
    /**
     * Extended Text Table (ETT)
     */
    CHANNEL_OR_EVENT_EXTENDED_TEXT(204),
    /**
     * System Time Table (STT)
     */
    SYSTEM_TIME(205),
    /**
     * A/90: Data Event Table (DET)
     */
    DATA_EVENT(206),
    /**
     * A/90: Data Service Table (DST)
     */
    DATA_SERVICE(207),
    /**
     * A/57B: Program Identifier Table.
     */
    PROGRAM_IDENTIFIER(208),
    /**
     * A/90: Network Resources Table (NRT)
     */
    NETWORK_RESOURCE(209),
    /**
     * A/90: Long Term Service Table (LTST)
     */
    LONG_TERM_SERVICE(210),
    /**
     * Directed Channel Change Table (DCCT)
     */
    DIRECTED_CHANNEL_CHANGE(211),
    /**
     * Directed Channel Change Selection Code Table (DCCSCT)
     */
    DIRECTED_CHANNEL_CHANGE_SECTION_CODE(212),
    AGGREGATE_EVENT_INFORMATION(214),
    AGGREGATE_EXTENDED_TEXT(215),
    AGGREGATE_DATA_EVENT(217),
    /**
     * A/81: Satellite Virtual Channel Table
     */
    SATELLITE_VIRTUAL_CHANNEL(218);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSectionATSCTableID";
    
    private final int value;
    SectionATSCTableID(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SectionATSCTableID of(int value) {
        return switch (value) {
            case 199 -> MASTER_GUIDE;
            case 200 -> TERRESTRIAL_VIRTUAL_CHANNEL;
            case 201 -> CABLE_VIRTUAL_CHANNEL;
            case 202 -> RATING_REGION;
            case 203 -> EVENT_INFORMATION;
            case 204 -> CHANNEL_OR_EVENT_EXTENDED_TEXT;
            case 205 -> SYSTEM_TIME;
            case 206 -> DATA_EVENT;
            case 207 -> DATA_SERVICE;
            case 208 -> PROGRAM_IDENTIFIER;
            case 209 -> NETWORK_RESOURCE;
            case 210 -> LONG_TERM_SERVICE;
            case 211 -> DIRECTED_CHANNEL_CHANGE;
            case 212 -> DIRECTED_CHANNEL_CHANGE_SECTION_CODE;
            case 214 -> AGGREGATE_EVENT_INFORMATION;
            case 215 -> AGGREGATE_EXTENDED_TEXT;
            case 217 -> AGGREGATE_DATA_EVENT;
            case 218 -> SATELLITE_VIRTUAL_CHANNEL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
