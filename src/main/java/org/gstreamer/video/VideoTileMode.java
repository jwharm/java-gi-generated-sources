package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enum value describing the available tiling modes.
 */
public enum VideoTileMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * Unknown or unset tile mode
     */
    UNKNOWN(0),
    /**
     * Every four adjacent blocks - two
     *    horizontally and two vertically are grouped together and are located
     *    in memory in Z or flipped Z order. In case of odd rows, the last row
     *    of blocks is arranged in linear order.
     */
    ZFLIPZ_2X2(65536),
    /**
     * Tiles are in row order.
     */
    LINEAR(131072);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoTileMode";
    
    private final int value;
    VideoTileMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoTileMode of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 65536 -> ZFLIPZ_2X2;
            case 131072 -> LINEAR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
