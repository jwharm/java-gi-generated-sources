package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different alpha modes.
 * @version 1.6
 */
public enum VideoAlphaMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * When input and output have alpha, it will be copied.
     *         When the input has no alpha, alpha will be set to
     *         {@code GST_VIDEO_CONVERTER_OPT_ALPHA_VALUE}
     */
    COPY(0),
    
    /**
     * set all alpha to
     *    {@code GST_VIDEO_CONVERTER_OPT_ALPHA_VALUE}
     */
    SET(1),
    
    /**
     * multiply all alpha with
     *         {@code GST_VIDEO_CONVERTER_OPT_ALPHA_VALUE}.
     *         When the input format has no alpha but the output format has, the
     *         alpha value will be set to {@code GST_VIDEO_CONVERTER_OPT_ALPHA_VALUE}
     */
    MULT(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAlphaMode";
    
    private final int value;
    
    /**
     * Create a new VideoAlphaMode for the provided value
     * @param numeric value the enum value
     */
    VideoAlphaMode(int value) {
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
     * Create a new VideoAlphaMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoAlphaMode of(int value) {
        return switch (value) {
            case 0 -> COPY;
            case 1 -> SET;
            case 2 -> MULT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
