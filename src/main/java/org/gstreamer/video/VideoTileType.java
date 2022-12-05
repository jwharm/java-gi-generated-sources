package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enum value describing the most common tiling types.
 */
public enum VideoTileType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Tiles are indexed. Use
     *   gst_video_tile_get_index () to retrieve the tile at the requested
     *   coordinates.
     */
    INDEXED(0);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoTileType";
    
    private final int value;
    VideoTileType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoTileType of(int value) {
        return switch (value) {
            case 0 -> INDEXED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
