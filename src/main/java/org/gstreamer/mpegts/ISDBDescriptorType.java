package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These values correspond to the registered descriptor type from
 * the various ISDB specifications.
 * <p>
 * Consult the relevant specifications for more details.
 */
public enum ISDBDescriptorType implements io.github.jwharm.javagi.Enumeration {
    
    HIERARCHICAL_TRANSMISSION(192),
    
    DIGITAL_COPY_CONTROL(193),
    
    NETWORK_IDENTIFICATION(194),
    
    PARTIAL_TS_TIME(195),
    
    AUDIO_COMPONENT(196),
    
    HYPERLINK(197),
    
    TARGET_REGION(198),
    
    DATA_CONTENT(199),
    
    VIDEO_DECODE_CONTROL(200),
    
    DOWNLOAD_CONTENT(201),
    
    CA_EMM_TS(202),
    
    CA_CONTRACT_INFORMATION(203),
    
    CA_SERVICE(204),
    
    TS_INFORMATION(205),
    
    EXTENDED_BROADCASTER(206),
    
    LOGO_TRANSMISSION(207),
    
    BASIC_LOCAL_EVENT(208),
    
    REFERENCE(209),
    
    NODE_RELATION(210),
    
    SHORT_NODE_INFORMATION(211),
    
    STC_REFERENCE(212),
    
    SERIES(213),
    
    EVENT_GROUP(214),
    
    SI_PARAMETER(215),
    
    BROADCASTER_NAME(216),
    
    COMPONENT_GROUP(217),
    
    SI_PRIME_TS(218),
    
    BOARD_INFORMATION(219),
    
    LDT_LINKAGE(220),
    
    CONNECTED_TRANSMISSION(221),
    
    CONTENT_AVAILABILITY(222),
    
    SERVICE_GROUP(224);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsISDBDescriptorType";
    
    private final int value;
    
    /**
     * Create a new ISDBDescriptorType for the provided value
     * @param numeric value the enum value
     */
    ISDBDescriptorType(int value) {
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
     * Create a new ISDBDescriptorType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ISDBDescriptorType of(int value) {
        return switch (value) {
            case 192 -> HIERARCHICAL_TRANSMISSION;
            case 193 -> DIGITAL_COPY_CONTROL;
            case 194 -> NETWORK_IDENTIFICATION;
            case 195 -> PARTIAL_TS_TIME;
            case 196 -> AUDIO_COMPONENT;
            case 197 -> HYPERLINK;
            case 198 -> TARGET_REGION;
            case 199 -> DATA_CONTENT;
            case 200 -> VIDEO_DECODE_CONTROL;
            case 201 -> DOWNLOAD_CONTENT;
            case 202 -> CA_EMM_TS;
            case 203 -> CA_CONTRACT_INFORMATION;
            case 204 -> CA_SERVICE;
            case 205 -> TS_INFORMATION;
            case 206 -> EXTENDED_BROADCASTER;
            case 207 -> LOGO_TRANSMISSION;
            case 208 -> BASIC_LOCAL_EVENT;
            case 209 -> REFERENCE;
            case 210 -> NODE_RELATION;
            case 211 -> SHORT_NODE_INFORMATION;
            case 212 -> STC_REFERENCE;
            case 213 -> SERIES;
            case 214 -> EVENT_GROUP;
            case 215 -> SI_PARAMETER;
            case 216 -> BROADCASTER_NAME;
            case 217 -> COMPONENT_GROUP;
            case 218 -> SI_PRIME_TS;
            case 219 -> BOARD_INFORMATION;
            case 220 -> LDT_LINKAGE;
            case 221 -> CONNECTED_TRANSMISSION;
            case 222 -> CONTENT_AVAILABILITY;
            case 224 -> SERVICE_GROUP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
