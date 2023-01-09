package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The result values for a GstBusSyncHandler.
 */
public enum BusSyncReply implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * drop the message
     */
    DROP(0),
    
    /**
     * pass the message to the async queue
     */
    PASS(1),
    
    /**
     * pass message to async queue, continue if message is handled
     */
    ASYNC(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstBusSyncReply";
    
    private final int value;
    
    /**
     * Create a new BusSyncReply for the provided value
     * @param numeric value the enum value
     */
    BusSyncReply(int value) {
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
     * Create a new BusSyncReply for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static BusSyncReply of(int value) {
        return switch (value) {
            case 0 -> DROP;
            case 1 -> PASS;
            case 2 -> ASYNC;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
