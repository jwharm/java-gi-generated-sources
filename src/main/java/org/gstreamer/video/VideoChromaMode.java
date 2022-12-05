package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different chroma downsampling and upsampling modes
 * @version 1.6
 */
public enum VideoChromaMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * do full chroma up and down sampling
     */
    FULL(0),
    /**
     * only perform chroma upsampling
     */
    UPSAMPLE_ONLY(1),
    /**
     * only perform chroma downsampling
     */
    DOWNSAMPLE_ONLY(2),
    /**
     * disable chroma resampling
     */
    NONE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoChromaMode";
    
    private final int value;
    VideoChromaMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoChromaMode of(int value) {
        return switch (value) {
            case 0 -> FULL;
            case 1 -> UPSAMPLE_ONLY;
            case 2 -> DOWNSAMPLE_ONLY;
            case 3 -> NONE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
