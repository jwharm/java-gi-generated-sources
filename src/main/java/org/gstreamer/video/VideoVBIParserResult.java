package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Return values for {@link VideoVBIParser}
 * @version 1.16
 */
public enum VideoVBIParserResult implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No line were provided, or no more Ancillary data was found.
     */
    DONE(0),
    
    /**
     * A {@link VideoAncillary} was found.
     */
    OK(1),
    
    /**
     * An error occurred
     */
    ERROR(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoVBIParserResult";
    
    private final int value;
    
    /**
     * Create a new VideoVBIParserResult for the provided value
     * @param numeric value the enum value
     */
    VideoVBIParserResult(int value) {
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
     * Create a new VideoVBIParserResult for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VideoVBIParserResult of(int value) {
        return switch (value) {
            case 0 -> DONE;
            case 1 -> OK;
            case 2 -> ERROR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
