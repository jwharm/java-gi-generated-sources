package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different subsampling and upsampling methods
 * @version 1.6
 */
public enum VideoResamplerMethod implements io.github.jwharm.javagi.Enumeration {
    /**
     * Duplicates the samples when
     *    upsampling and drops when downsampling
     */
    NEAREST(0),
    /**
     * Uses linear interpolation to reconstruct
     *    missing samples and averaging to downsample
     */
    LINEAR(1),
    /**
     * Uses cubic interpolation
     */
    CUBIC(2),
    /**
     * Uses sinc interpolation
     */
    SINC(3),
    /**
     * Uses lanczos interpolation
     */
    LANCZOS(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoResamplerMethod";
    
    private final int value;
    VideoResamplerMethod(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoResamplerMethod of(int value) {
        return switch (value) {
            case 0 -> NEAREST;
            case 1 -> LINEAR;
            case 2 -> CUBIC;
            case 3 -> SINC;
            case 4 -> LANCZOS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
