package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum ComponentStreamContent implements io.github.jwharm.javagi.Enumeration {
    MPEG2_VIDEO(1),
    MPEG1_LAYER2_AUDIO(2),
    TELETEXT_OR_SUBTITLE(3),
    AC_3(4),
    AVC(5),
    AAC(6),
    DTS(7),
    SRM_CPCM(8);
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsComponentStreamContent";
    
    private final int value;
    ComponentStreamContent(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ComponentStreamContent of(int value) {
        return switch (value) {
            case 1 -> MPEG2_VIDEO;
            case 2 -> MPEG1_LAYER2_AUDIO;
            case 3 -> TELETEXT_OR_SUBTITLE;
            case 4 -> AC_3;
            case 5 -> AVC;
            case 6 -> AAC;
            case 7 -> DTS;
            case 8 -> SRM_CPCM;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
