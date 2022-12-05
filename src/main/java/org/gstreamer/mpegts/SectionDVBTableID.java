package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Values for a {@link Section} table_id.
 * <p>
 * These are the registered DVB table_id variants. Unless specified otherwise,
 * they come from the DVB Specification for SI (ETSI EN 300 468).
 * <p>
 * see also: {@link SectionTableID}
 */
public enum SectionDVBTableID implements io.github.jwharm.javagi.Enumeration {
    /**
     * Network Information Table (NIT), Actual Network
     */
    NETWORK_INFORMATION_ACTUAL_NETWORK(64),
    /**
     * Network Information Table (NIT), Other Network
     */
    NETWORK_INFORMATION_OTHER_NETWORK(65),
    /**
     * Service Description Table (SDT), Actual Transport Stream
     */
    SERVICE_DESCRIPTION_ACTUAL_TS(66),
    /**
     * Service Description Table (SDT), Other Transport Stream
     */
    SERVICE_DESCRIPTION_OTHER_TS(70),
    /**
     * Bouquet Association Table (BAT)
     */
    BOUQUET_ASSOCIATION(74),
    /**
     * ETSI TS 102 006: Update Notification Table (UNT)
     */
    UPDATE_NOTIFICATION(75),
    /**
     * ETSI EN 303 560: Downloadable Font Info
     */
    DOWNLOADABLE_FONT_INFO(76),
    /**
     * Event Information Table (EIT), Actual Transport Stream, present/following
     */
    EVENT_INFORMATION_ACTUAL_TS_PRESENT(78),
    /**
     * Event Information Table (EIT), Other Transport Stream, present/following
     */
    EVENT_INFORMATION_OTHER_TS_PRESENT(79),
    /**
     * Event Information Table (EIT), Actual Transport Stream, Schedule (first)
     */
    EVENT_INFORMATION_ACTUAL_TS_SCHEDULE_1(80),
    /**
     * Event Information Table (EIT), Actual Transport Stream, Schedule (last)
     */
    EVENT_INFORMATION_ACTUAL_TS_SCHEDULE_N(95),
    /**
     * Event Information Table (EIT), Other Transport Stream, Schedule (first)
     */
    EVENT_INFORMATION_OTHER_TS_SCHEDULE_1(96),
    /**
     * Event Information Table (EIT), Other Transport Stream, Schedule (last)
     */
    EVENT_INFORMATION_OTHER_TS_SCHEDULE_N(111),
    /**
     * Time Date Table (TDT)
     */
    TIME_DATE(112),
    /**
     * Running Status Table (RST)
     */
    RUNNING_STATUS(113),
    /**
     * Stuffing Table (ST)
     */
    STUFFING(114),
    /**
     * Time Offset Table (TOT)
     */
    TIME_OFFSET(115),
    /**
     * ETSI TS 102 323: Application Information Table (AIT)
     */
    APPLICATION_INFORMATION_TABLE(116),
    /**
     * ETSI TS 102 323: Container Section
     */
    CONTAINER(117),
    /**
     * ETSI TS 102 323: Related Content Table (RCT)
     */
    RELATED_CONTENT(118),
    /**
     * ETSI TS 102 323: Content Identifier Table (CIT)
     */
    CONTENT_IDENTIFIER(119),
    /**
     * ETSI TS 301 192: MPE-FEC Section
     */
    MPE_FEC(120),
    /**
     * ETSI 103 323: Resolution Provider Notification Table (RNT)
     */
    RESOLUTION_NOTIFICATION(121),
    /**
     * ETSI TS 102 772: MPE-IFEC Section
     */
    MPE_IFEC(122),
    /**
     * ETSI TS 102 809: Protection Message Section
     */
    PROTECTION_MESSAGE(123),
    /**
     * Discontinuity Information Table (DIT)
     */
    DISCONTINUITY_INFORMATION(126),
    /**
     * Selection Information Table (SIT)
     */
    SELECTION_INFORMATION(127),
    /**
     * ETSI TR 289: CA Message Table (CMT): ECM 0
     */
    CA_MESSAGE_ECM_0(128),
    /**
     * ETSI TR 289: CA Message Table (CMT): ECM 1
     */
    CA_MESSAGE_ECM_1(129),
    /**
     * ETSI TR 289: CA Message Table (CMT): CA System Private (First)
     */
    CA_MESSAGE_SYSTEM_PRIVATE_1(130),
    /**
     * ETSI TR 289: CA Message Table (CMT): CA System Private (Last)
     */
    CA_MESSAGE_SYSTEM_PRIVATE_N(143),
    SCT(160),
    FCT(161),
    TCT(162),
    SPT(163),
    CMT(164),
    TBTP(165),
    PCR_PACKET_PAYLOAD(166),
    TRANSMISSION_MODE_SUPPORT_PAYLOAD(170),
    TIM(176),
    LL_FEC_PARITY_DATA_TABLE(177);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSectionDVBTableID";
    
    private final int value;
    SectionDVBTableID(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SectionDVBTableID of(int value) {
        return switch (value) {
            case 64 -> NETWORK_INFORMATION_ACTUAL_NETWORK;
            case 65 -> NETWORK_INFORMATION_OTHER_NETWORK;
            case 66 -> SERVICE_DESCRIPTION_ACTUAL_TS;
            case 70 -> SERVICE_DESCRIPTION_OTHER_TS;
            case 74 -> BOUQUET_ASSOCIATION;
            case 75 -> UPDATE_NOTIFICATION;
            case 76 -> DOWNLOADABLE_FONT_INFO;
            case 78 -> EVENT_INFORMATION_ACTUAL_TS_PRESENT;
            case 79 -> EVENT_INFORMATION_OTHER_TS_PRESENT;
            case 80 -> EVENT_INFORMATION_ACTUAL_TS_SCHEDULE_1;
            case 95 -> EVENT_INFORMATION_ACTUAL_TS_SCHEDULE_N;
            case 96 -> EVENT_INFORMATION_OTHER_TS_SCHEDULE_1;
            case 111 -> EVENT_INFORMATION_OTHER_TS_SCHEDULE_N;
            case 112 -> TIME_DATE;
            case 113 -> RUNNING_STATUS;
            case 114 -> STUFFING;
            case 115 -> TIME_OFFSET;
            case 116 -> APPLICATION_INFORMATION_TABLE;
            case 117 -> CONTAINER;
            case 118 -> RELATED_CONTENT;
            case 119 -> CONTENT_IDENTIFIER;
            case 120 -> MPE_FEC;
            case 121 -> RESOLUTION_NOTIFICATION;
            case 122 -> MPE_IFEC;
            case 123 -> PROTECTION_MESSAGE;
            case 126 -> DISCONTINUITY_INFORMATION;
            case 127 -> SELECTION_INFORMATION;
            case 128 -> CA_MESSAGE_ECM_0;
            case 129 -> CA_MESSAGE_ECM_1;
            case 130 -> CA_MESSAGE_SYSTEM_PRIVATE_1;
            case 143 -> CA_MESSAGE_SYSTEM_PRIVATE_N;
            case 160 -> SCT;
            case 161 -> FCT;
            case 162 -> TCT;
            case 163 -> SPT;
            case 164 -> CMT;
            case 165 -> TBTP;
            case 166 -> PCR_PACKET_PAYLOAD;
            case 170 -> TRANSMISSION_MODE_SUPPORT_PAYLOAD;
            case 176 -> TIM;
            case 177 -> LL_FEC_PARITY_DATA_TABLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
