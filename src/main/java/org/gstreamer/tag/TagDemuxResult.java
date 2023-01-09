package org.gstreamer.tag;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Result values from the parse_tag virtual function.
 */
public enum TagDemuxResult implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * cannot parse tag, just skip it
     */
    BROKEN_TAG(0),
    
    /**
     * call again with less or more data
     */
    AGAIN(1),
    
    /**
     * parsed tag successfully
     */
    OK(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstTagDemuxResult";
    
    private final int value;
    
    /**
     * Create a new TagDemuxResult for the provided value
     * @param numeric value the enum value
     */
    TagDemuxResult(int value) {
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
     * Create a new TagDemuxResult for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TagDemuxResult of(int value) {
        return switch (value) {
            case 0 -> BROKEN_TAG;
            case 1 -> AGAIN;
            case 2 -> OK;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
