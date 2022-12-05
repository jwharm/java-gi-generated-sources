package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of mpeg-ts streams for SCTE. Most users would want to use the
 * {@link ATSCStreamType} instead since it also covers these stream types
 */
public enum ScteStreamType implements io.github.jwharm.javagi.Enumeration {
    /**
     * SCTE-27 Subtitling
     */
    SUBTITLING(130),
    /**
     * SCTE-19 Isochronous data
     */
    ISOCH_DATA(131),
    /**
     * SCTE-35 Splice Information Table
     */
    SIT(134),
    /**
     * SCTE-07 Data Service or
     * Network Resource Table
     */
    DST_NRT(149),
    /**
     * Type B - DSM-CC Data Carousel
     * [IEC 13818-6])
     */
    DSMCC_DCB(176),
    /**
     * Enhanced Television Application
     * Signaling (OC-SP-ETV-AM1.0.1-120614)
     */
    SIGNALING(192),
    /**
     * SCTE-07 Synchronous data
     */
    SYNC_DATA(194),
    /**
     * SCTE-53 Asynchronous data
     */
    ASYNC_DATA(195);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsScteStreamType";
    
    private final int value;
    ScteStreamType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ScteStreamType of(int value) {
        return switch (value) {
            case 130 -> SUBTITLING;
            case 131 -> ISOCH_DATA;
            case 134 -> SIT;
            case 149 -> DST_NRT;
            case 176 -> DSMCC_DCB;
            case 192 -> SIGNALING;
            case 194 -> SYNC_DATA;
            case 195 -> ASYNC_DATA;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
