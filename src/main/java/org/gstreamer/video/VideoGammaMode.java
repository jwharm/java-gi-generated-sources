package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum VideoGammaMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * disable gamma handling
     */
    NONE(0),
    /**
     * convert between input and output gamma
     * Different gamma conversion modes
     */
    REMAP(1);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoGammaMode";
    
    private final int value;
    VideoGammaMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoGammaMode of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> REMAP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
