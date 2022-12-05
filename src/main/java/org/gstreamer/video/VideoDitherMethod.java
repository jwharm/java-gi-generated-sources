package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different dithering methods to use.
 */
public enum VideoDitherMethod implements io.github.jwharm.javagi.Enumeration {
    /**
     * no dithering
     */
    NONE(0),
    /**
     * propagate rounding errors downwards
     */
    VERTERR(1),
    /**
     * Dither with floyd-steinberg error diffusion
     */
    FLOYD_STEINBERG(2),
    /**
     * Dither with Sierra Lite error diffusion
     */
    SIERRA_LITE(3),
    /**
     * ordered dither using a bayer pattern
     */
    BAYER(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoDitherMethod";
    
    private final int value;
    VideoDitherMethod(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoDitherMethod of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> VERTERR;
            case 2 -> FLOYD_STEINBERG;
            case 3 -> SIERRA_LITE;
            case 4 -> BAYER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
