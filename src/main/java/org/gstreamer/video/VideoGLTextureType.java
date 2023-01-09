package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GL texture type.
 */
public enum VideoGLTextureType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Luminance texture, GL_LUMINANCE
     */
    LUMINANCE(0),
    
    /**
     * Luminance-alpha texture, GL_LUMINANCE_ALPHA
     */
    LUMINANCE_ALPHA(1),
    
    /**
     * RGB 565 texture, GL_RGB
     */
    RGB16(2),
    
    /**
     * RGB texture, GL_RGB
     */
    RGB(3),
    
    /**
     * RGBA texture, GL_RGBA
     */
    RGBA(4),
    
    /**
     * R texture, GL_RED_EXT
     */
    R(5),
    
    /**
     * RG texture, GL_RG_EXT
     */
    RG(6);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoGLTextureType";
    
    private final int value;
    
    /**
     * Create a new VideoGLTextureType for the provided value
     * @param numeric value the enum value
     */
    VideoGLTextureType(int value) {
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
     * Create a new VideoGLTextureType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoGLTextureType of(int value) {
        return switch (value) {
            case 0 -> LUMINANCE;
            case 1 -> LUMINANCE_ALPHA;
            case 2 -> RGB16;
            case 3 -> RGB;
            case 4 -> RGBA;
            case 5 -> R;
            case 6 -> RG;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
