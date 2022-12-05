package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The orientation of the GL texture.
 */
public enum VideoGLTextureOrientation implements io.github.jwharm.javagi.Enumeration {
    /**
     * Top line first in memory, left row first
     */
    NORMAL_Y_NORMAL(0),
    /**
     * Bottom line first in memory, left row first
     */
    NORMAL_Y_FLIP(1),
    /**
     * Top line first in memory, right row first
     */
    FLIP_Y_NORMAL(2),
    /**
     * Bottom line first in memory, right row first
     */
    FLIP_Y_FLIP(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoGLTextureOrientation";
    
    private final int value;
    VideoGLTextureOrientation(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoGLTextureOrientation of(int value) {
        return switch (value) {
            case 0 -> NORMAL_Y_NORMAL;
            case 1 -> NORMAL_Y_FLIP;
            case 2 -> FLIP_Y_NORMAL;
            case 3 -> FLIP_Y_FLIP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
