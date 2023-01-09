package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of {@link Descriptor}
 * <p>
 * These values correspond to the registered descriptor type from
 * the various DVB specifications.
 * <p>
 * Consult the relevant specifications for more details.
 */
public enum DVBDescriptorType implements io.github.jwharm.javagi.Enumeration {
    
    NETWORK_NAME(64),
    
    SERVICE_LIST(65),
    
    STUFFING(66),
    
    SATELLITE_DELIVERY_SYSTEM(67),
    
    CABLE_DELIVERY_SYSTEM(68),
    
    VBI_DATA(69),
    
    VBI_TELETEXT(70),
    
    BOUQUET_NAME(71),
    
    SERVICE(72),
    
    COUNTRY_AVAILABILITY(73),
    
    LINKAGE(74),
    
    NVOD_REFERENCE(75),
    
    TIME_SHIFTED_SERVICE(76),
    
    SHORT_EVENT(77),
    
    EXTENDED_EVENT(78),
    
    TIME_SHIFTED_EVENT(79),
    
    COMPONENT(80),
    
    MOSAIC(81),
    
    STREAM_IDENTIFIER(82),
    
    CA_IDENTIFIER(83),
    
    CONTENT(84),
    
    PARENTAL_RATING(85),
    
    TELETEXT(86),
    
    TELEPHONE(87),
    
    LOCAL_TIME_OFFSET(88),
    
    SUBTITLING(89),
    
    TERRESTRIAL_DELIVERY_SYSTEM(90),
    
    MULTILINGUAL_NETWORK_NAME(91),
    
    MULTILINGUAL_BOUQUET_NAME(92),
    
    MULTILINGUAL_SERVICE_NAME(93),
    
    MULTILINGUAL_COMPONENT(94),
    
    PRIVATE_DATA_SPECIFIER(95),
    
    SERVICE_MOVE(96),
    
    SHORT_SMOOTHING_BUFFER(97),
    
    FREQUENCY_LIST(98),
    
    /**
     * Partial Transport Stream descriptor. Only present in SIT Sections.
     * <p>
     * See also: {@link SectionType#SIT}, {@code GstMpegtsSIT}
     */
    PARTIAL_TRANSPORT_STREAM(99),
    
    DATA_BROADCAST(100),
    
    SCRAMBLING(101),
    
    DATA_BROADCAST_ID(102),
    
    TRANSPORT_STREAM(103),
    
    DSNG(104),
    
    PDC(105),
    
    AC3(106),
    
    ANCILLARY_DATA(107),
    
    CELL_LIST(108),
    
    CELL_FREQUENCY_LINK(109),
    
    ANNOUNCEMENT_SUPPORT(110),
    
    APPLICATION_SIGNALLING(111),
    
    ADAPTATION_FIELD_DATA(112),
    
    SERVICE_IDENTIFIER(113),
    
    SERVICE_AVAILABILITY(114),
    
    DEFAULT_AUTHORITY(115),
    
    RELATED_CONTENT(116),
    
    TVA_ID(117),
    
    CONTENT_IDENTIFIER(118),
    
    TIMESLICE_FEC_IDENTIFIER(119),
    
    ECM_REPETITION_RATE(120),
    
    S2_SATELLITE_DELIVERY_SYSTEM(121),
    
    ENHANCED_AC3(122),
    
    DTS(123),
    
    AAC(124),
    
    XAIT_LOCATION(125),
    
    FTA_CONTENT_MANAGEMENT(126),
    
    EXTENSION(127);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBDescriptorType";
    
    private final int value;
    
    /**
     * Create a new DVBDescriptorType for the provided value
     * @param numeric value the enum value
     */
    DVBDescriptorType(int value) {
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
     * Create a new DVBDescriptorType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static DVBDescriptorType of(int value) {
        return switch (value) {
            case 64 -> NETWORK_NAME;
            case 65 -> SERVICE_LIST;
            case 66 -> STUFFING;
            case 67 -> SATELLITE_DELIVERY_SYSTEM;
            case 68 -> CABLE_DELIVERY_SYSTEM;
            case 69 -> VBI_DATA;
            case 70 -> VBI_TELETEXT;
            case 71 -> BOUQUET_NAME;
            case 72 -> SERVICE;
            case 73 -> COUNTRY_AVAILABILITY;
            case 74 -> LINKAGE;
            case 75 -> NVOD_REFERENCE;
            case 76 -> TIME_SHIFTED_SERVICE;
            case 77 -> SHORT_EVENT;
            case 78 -> EXTENDED_EVENT;
            case 79 -> TIME_SHIFTED_EVENT;
            case 80 -> COMPONENT;
            case 81 -> MOSAIC;
            case 82 -> STREAM_IDENTIFIER;
            case 83 -> CA_IDENTIFIER;
            case 84 -> CONTENT;
            case 85 -> PARENTAL_RATING;
            case 86 -> TELETEXT;
            case 87 -> TELEPHONE;
            case 88 -> LOCAL_TIME_OFFSET;
            case 89 -> SUBTITLING;
            case 90 -> TERRESTRIAL_DELIVERY_SYSTEM;
            case 91 -> MULTILINGUAL_NETWORK_NAME;
            case 92 -> MULTILINGUAL_BOUQUET_NAME;
            case 93 -> MULTILINGUAL_SERVICE_NAME;
            case 94 -> MULTILINGUAL_COMPONENT;
            case 95 -> PRIVATE_DATA_SPECIFIER;
            case 96 -> SERVICE_MOVE;
            case 97 -> SHORT_SMOOTHING_BUFFER;
            case 98 -> FREQUENCY_LIST;
            case 99 -> PARTIAL_TRANSPORT_STREAM;
            case 100 -> DATA_BROADCAST;
            case 101 -> SCRAMBLING;
            case 102 -> DATA_BROADCAST_ID;
            case 103 -> TRANSPORT_STREAM;
            case 104 -> DSNG;
            case 105 -> PDC;
            case 106 -> AC3;
            case 107 -> ANCILLARY_DATA;
            case 108 -> CELL_LIST;
            case 109 -> CELL_FREQUENCY_LINK;
            case 110 -> ANNOUNCEMENT_SUPPORT;
            case 111 -> APPLICATION_SIGNALLING;
            case 112 -> ADAPTATION_FIELD_DATA;
            case 113 -> SERVICE_IDENTIFIER;
            case 114 -> SERVICE_AVAILABILITY;
            case 115 -> DEFAULT_AUTHORITY;
            case 116 -> RELATED_CONTENT;
            case 117 -> TVA_ID;
            case 118 -> CONTENT_IDENTIFIER;
            case 119 -> TIMESLICE_FEC_IDENTIFIER;
            case 120 -> ECM_REPETITION_RATE;
            case 121 -> S2_SATELLITE_DELIVERY_SYSTEM;
            case 122 -> ENHANCED_AC3;
            case 123 -> DTS;
            case 124 -> AAC;
            case 125 -> XAIT_LOCATION;
            case 126 -> FTA_CONTENT_MANAGEMENT;
            case 127 -> EXTENSION;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
