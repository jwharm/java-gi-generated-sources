package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum VideoAncillaryDID implements io.github.jwharm.javagi.Enumeration {
    
    UNDEFINED(0),
    
    DELETION(128),
    
    HANC_3G_AUDIO_DATA_FIRST(160),
    
    HANC_3G_AUDIO_DATA_LAST(167),
    
    HANC_HDTV_AUDIO_DATA_FIRST(224),
    
    HANC_HDTV_AUDIO_DATA_LAST(231),
    
    HANC_SDTV_AUDIO_DATA_1_FIRST(236),
    
    HANC_SDTV_AUDIO_DATA_1_LAST(239),
    
    CAMERA_POSITION(240),
    
    HANC_ERROR_DETECTION(244),
    
    HANC_SDTV_AUDIO_DATA_2_FIRST(248),
    
    HANC_SDTV_AUDIO_DATA_2_LAST(255);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAncillaryDID";
    
    private final int value;
    
    /**
     * Create a new VideoAncillaryDID for the provided value
     * @param numeric value the enum value
     */
    VideoAncillaryDID(int value) {
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
     * Create a new VideoAncillaryDID for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoAncillaryDID of(int value) {
        return switch (value) {
            case 0 -> UNDEFINED;
            case 128 -> DELETION;
            case 160 -> HANC_3G_AUDIO_DATA_FIRST;
            case 167 -> HANC_3G_AUDIO_DATA_LAST;
            case 224 -> HANC_HDTV_AUDIO_DATA_FIRST;
            case 231 -> HANC_HDTV_AUDIO_DATA_LAST;
            case 236 -> HANC_SDTV_AUDIO_DATA_1_FIRST;
            case 239 -> HANC_SDTV_AUDIO_DATA_1_LAST;
            case 240 -> CAMERA_POSITION;
            case 244 -> HANC_ERROR_DETECTION;
            case 248 -> HANC_SDTV_AUDIO_DATA_2_FIRST;
            case 255 -> HANC_SDTV_AUDIO_DATA_2_LAST;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
