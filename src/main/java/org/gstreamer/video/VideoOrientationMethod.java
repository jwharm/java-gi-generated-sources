package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different video orientation methods.
 * @version 1.10
 */
public enum VideoOrientationMethod implements io.github.jwharm.javagi.Enumeration {
    /**
     * Identity (no rotation)
     */
    IDENTITY(0),
    /**
     * Rotate clockwise 90 degrees
     */
    _90R(1),
    /**
     * Rotate 180 degrees
     */
    _180(2),
    /**
     * Rotate counter-clockwise 90 degrees
     */
    _90L(3),
    /**
     * Flip horizontally
     */
    HORIZ(4),
    /**
     * Flip vertically
     */
    VERT(5),
    /**
     * Flip across upper left/lower right diagonal
     */
    UL_LR(6),
    /**
     * Flip across upper right/lower left diagonal
     */
    UR_LL(7),
    /**
     * Select flip method based on image-orientation tag
     */
    AUTO(8),
    /**
     * Current status depends on plugin internal setup
     */
    CUSTOM(9);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoOrientationMethod";
    
    private final int value;
    VideoOrientationMethod(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VideoOrientationMethod of(int value) {
        return switch (value) {
            case 0 -> IDENTITY;
            case 1 -> _90R;
            case 2 -> _180;
            case 3 -> _90L;
            case 4 -> HORIZ;
            case 5 -> VERT;
            case 6 -> UL_LR;
            case 7 -> UR_LL;
            case 8 -> AUTO;
            case 9 -> CUSTOM;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
