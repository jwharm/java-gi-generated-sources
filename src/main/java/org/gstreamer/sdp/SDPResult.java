package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Return values for the SDP functions.
 */
public enum SDPResult implements io.github.jwharm.javagi.Enumeration {
    /**
     * A successful return value
     */
    OK(0),
    /**
     * a function was given invalid parameters
     */
    EINVAL(-1);
    
    private static final java.lang.String C_TYPE_NAME = "GstSDPResult";
    
    private final int value;
    SDPResult(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SDPResult of(int value) {
        return switch (value) {
            case 0 -> OK;
            case -1 -> EINVAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
